package com.captura.paymentserver.services.impl;

import com.captura.paymentserver.entitys.AcquirerConfig;
import com.captura.paymentserver.repositories.AcquirerConfigRepository;
import com.captura.paymentserver.services.AcquirerConfigService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;

@Log4j2
@Service
public class AcquirerConfigServiceImpl implements AcquirerConfigService {

    @Autowired
    AcquirerConfigRepository acquirerConfigRepository;

    public Optional<AcquirerConfig> acquirerConfigConsult(String acquirerConfigName) {
        log.info("acquirerConfigConsult");
        return acquirerConfigRepository.findByAcquirerName(acquirerConfigName);
    }

    public List<AcquirerConfig> listAllAcquirerConfig() {
        return acquirerConfigRepository.findAll();
    }

    public AcquirerConfig acquirerConfigCreate(AcquirerConfig acquirerConfig){
        acquirerConfig.setAcquirerConfigCreateDate(LocalDateTime.now(ZoneId.of("UTC")));
        return acquirerConfigRepository.save(acquirerConfig);
    }
}
