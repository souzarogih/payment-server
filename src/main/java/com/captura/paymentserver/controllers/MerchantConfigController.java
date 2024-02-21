package com.captura.paymentserver.controllers;

import com.captura.paymentserver.dtos.EquipmentConfigResponseDto;
import com.captura.paymentserver.dtos.MerchantConfigRequestDto;
import com.captura.paymentserver.dtos.MerchantConfigResponseDto;
import com.captura.paymentserver.entitys.MerchantConfig;
import com.captura.paymentserver.services.MerchantConfigService;
import lombok.extern.log4j.Log4j2;
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

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<MerchantConfigResponseDto> merchantCreate(@RequestBody MerchantConfigRequestDto merchantConfigRequestDto) {
        log.info("/merchant");

        MerchantConfig merchantConfig = new MerchantConfig();
        merchantConfig.setCommercialName(merchantConfigRequestDto.getCommercialName());
        merchantConfig.setCompanyName(merchantConfigRequestDto.getCompanyName());
        merchantConfig.setMerchantConfigCreate(LocalDateTime.now(ZoneId.of("UTC")));
        merchantConfig.setMerchantConfigCode(UUID.randomUUID().toString());
        MerchantConfig merchantConfigObject = merchantConfigService.merchantConfigCreate(merchantConfig);

        MerchantConfigResponseDto merchantConfigResponseDto = new MerchantConfigResponseDto();
        merchantConfigResponseDto.setMerchantConfigId(merchantConfigObject.getMerchantConfigId());
//        merchantConfigResponseDto.setMerchantAcquirerConfigId(merchantConfigObject.getMerchantAcquirerConfigId());
        merchantConfigResponseDto.setMerchantConfigCode(merchantConfigObject.getMerchantConfigCode());
        merchantConfigResponseDto.setCompanyName(merchantConfigObject.getCompanyName());
        merchantConfigResponseDto.setCommercialName(merchantConfigObject.getCommercialName());

        return ResponseEntity.status(HttpStatus.CREATED).body(merchantConfigResponseDto);
    }
}
