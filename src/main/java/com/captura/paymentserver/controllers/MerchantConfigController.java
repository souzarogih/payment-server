package com.captura.paymentserver.controllers;

import com.captura.paymentserver.dtos.MerchantConfigRequestDto;
import com.captura.paymentserver.dtos.MerchantConfigResponseDto;
import com.captura.paymentserver.entitys.MerchantAcquirerConfig;
import com.captura.paymentserver.entitys.MerchantConfig;
import com.captura.paymentserver.services.MerchantAcquirerConfigService;
import com.captura.paymentserver.services.MerchantConfigService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.UUID;

@Log4j2
@RestController
@RequestMapping("/merchantConfig")
public class MerchantConfigController {

    @Autowired
    MerchantConfigService merchantConfigService;

    @Autowired
    MerchantAcquirerConfigService merchantAcquirerConfigService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<MerchantConfigResponseDto> merchantCreate(@RequestBody MerchantConfigRequestDto merchantConfigRequestDto) {
        log.info("/merchant");

        MerchantConfig merchantConfig = new MerchantConfig();
        BeanUtils.copyProperties(merchantConfigRequestDto, merchantConfig);

        MerchantConfigResponseDto merchantConfigResponseDto = new MerchantConfigResponseDto();

        if (merchantConfig.getMerchantAcquirerName().isEmpty()){
            log.debug("Requisição para cadastro do lojista sem configurações da adquirente. {}", merchantConfig.getCompanyName());

            merchantConfig.setMerchantConfigCreate(LocalDateTime.now(ZoneId.of("UTC")));
            merchantConfig.setMerchantConfigCode(UUID.randomUUID().toString());
            MerchantConfig merchantConfigObject = merchantConfigService.merchantConfigCreate(merchantConfig);
            System.out.println("merchantConfigObject: "+merchantConfigObject);


            //Preparado a request de resposta
            merchantConfigResponseDto.setMerchantConfigId(merchantConfigObject.getMerchantConfigId());
//            merchantConfigResponseDto.setMerchantAcquirerConfigId(merchantConfigObject.getMerchantAcquirerConfigId());
            merchantConfigResponseDto.setMerchantConfigCode(merchantConfigObject.getMerchantConfigCode());
            merchantConfigResponseDto.setCompanyName(merchantConfigObject.getCompanyName());
            merchantConfigResponseDto.setCommercialName(merchantConfigObject.getCommercialName());

            return ResponseEntity.status(HttpStatus.CREATED).body(merchantConfigResponseDto);

        }else {
            log.debug("Requisição para cadastro do lojista com configurações da adquirente. {}", merchantConfig.getCompanyName());

            //salvando MerchantAcquirerConfig
            // service para cadastrar as configurações da merchantAcquirerConfig

            MerchantAcquirerConfig merchantAcquirerConfigRequest = new MerchantAcquirerConfig();
            merchantAcquirerConfigRequest.setMid(merchantConfig.getMid());
            merchantAcquirerConfigRequest.setMerchantAcquirerConfigCreate(LocalDateTime.now(ZoneId.of("UTC")));
            MerchantAcquirerConfig merchantAcquirerConfigObject = merchantAcquirerConfigService.saveMerchantAcquirerConfig(merchantAcquirerConfigRequest);
            log.debug("Salvando dados da adquirente {} ao merchant {} - {} | merchant_acquirer_config_id: {} - MID: {}",
                    merchantConfig.getMerchantAcquirerName(),
                    merchantConfig.getMerchantConfigCode(),
                    merchantConfig.getCommercialName(),
                    merchantAcquirerConfigObject.getMerchantAcquirerConfigId(),
                    merchantAcquirerConfigObject.getMid());

            //salvando MerchantConfig
            merchantConfig.setMerchantAcquirerConfigId(merchantAcquirerConfigObject);
            merchantConfig.setMerchantConfigCode(UUID.randomUUID().toString());
            merchantConfig.setMerchantConfigCreate(LocalDateTime.now(ZoneId.of("UTC")));
            MerchantConfig merchantConfigObject = merchantConfigService.merchantConfigCreate(merchantConfig);

            //Preparado a request de resposta
            merchantConfigResponseDto.setMerchantConfigId(merchantConfigObject.getMerchantConfigId());
            merchantConfigResponseDto.setMerchantAcquirerConfigId(merchantConfigObject.getMerchantAcquirerConfigId());
            merchantConfigResponseDto.setMerchantConfigCode(merchantConfigObject.getMerchantConfigCode());
            merchantConfigResponseDto.setCompanyName(merchantConfigObject.getCompanyName());
            merchantConfigResponseDto.setCommercialName(merchantConfigObject.getCommercialName());

            return ResponseEntity.status(HttpStatus.CREATED).body(merchantConfigResponseDto);
        }

//        if(merchantConfigRequestDto.getMerchantConfigCode()){
//            System.out.println("Existe configuração de adquirente");
//        }else {
//
//        }

//        fazer um if que verificar se foi enviada as configurações da adquirente, se envio grava com as informações da adquirente, se não enviou
//        não grava os dados da adquirente


//
    }
}

/*
* criar lojista / lojista adquirente
* criar equipamento
* criar terminal / terminal adquirente
* */