package com.captura.paymentserver.controllers;

import com.captura.paymentserver.dtos.AcquirerConfigDto;
import com.captura.paymentserver.entitys.AcquirerConfig;
import com.captura.paymentserver.services.AcquirerConfigService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log4j2
@RestController
@RequestMapping("/acquirerConfig")
public class AcquirerConfigController {

    @Autowired
    AcquirerConfigService acquirerConfigService;

    @PostMapping
    public ResponseEntity<AcquirerConfig> createAcquirerConfig(@RequestBody AcquirerConfigDto acquirerConfigDto) {
        var acquirerConfig = new AcquirerConfig();
        BeanUtils.copyProperties(acquirerConfigDto, acquirerConfig);
        return ResponseEntity.status(HttpStatus.CREATED).body(acquirerConfigService.acquirerConfigCreate(acquirerConfig));
    }

    @GetMapping
    public ResponseEntity<List<AcquirerConfig>> listAllsAcquirerConfig() {
        return ResponseEntity.status(HttpStatus.OK).body(acquirerConfigService.listAllAcquirerConfig());
    }
}
