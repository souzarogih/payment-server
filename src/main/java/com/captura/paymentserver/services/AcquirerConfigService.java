package com.captura.paymentserver.services;

import com.captura.paymentserver.entitys.AcquirerConfig;

import java.util.Optional;

public interface AcquirerConfigService {

    public Optional<AcquirerConfig> acquirerConfigConsult(String acquirerConfigName);
}
