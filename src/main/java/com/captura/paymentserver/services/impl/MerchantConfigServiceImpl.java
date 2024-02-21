package com.captura.paymentserver.services.impl;

import com.captura.paymentserver.entitys.MerchantConfig;
import com.captura.paymentserver.repositories.MerchantConfigRepository;
import com.captura.paymentserver.services.MerchantConfigService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class MerchantConfigServiceImpl implements MerchantConfigService {

    @Autowired
    MerchantConfigRepository merchantConfigRepository;

    public MerchantConfig merchantConfigCreate(MerchantConfig merchantConfig) {
        log.info("merchantConfigCreate");

        return merchantConfigRepository.save(merchantConfig);
    }
}
