package com.captura.paymentserver.services.impl;

import com.captura.paymentserver.entitys.MerchantAcquirerConfig;
import com.captura.paymentserver.repositories.MerchantAcquirerConfigRepository;
import com.captura.paymentserver.services.MerchantAcquirerConfigService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Log4j2
@Service
public class MerchantAcquirerConfigServiceImpl implements MerchantAcquirerConfigService {

    @Autowired
    MerchantAcquirerConfigRepository merchantAcquirerConfigRepository;

    @Override
    public MerchantAcquirerConfig saveMerchantAcquirerConfig(MerchantAcquirerConfig merchantAcquirerConfig) {
        log.info("saveMerchantAcquirerConfig");
        System.out.println(merchantAcquirerConfig);
        return merchantAcquirerConfigRepository.save(merchantAcquirerConfig);
    }

    public Optional<MerchantAcquirerConfig> consultMerchantAcquirerConfigId(Long merchantAcquirerConfigId) {
        log.info("consultMerchantAcquirerConfigId");
        return merchantAcquirerConfigRepository.findById(merchantAcquirerConfigId);
    }
}
