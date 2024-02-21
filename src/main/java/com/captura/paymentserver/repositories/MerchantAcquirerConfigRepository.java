package com.captura.paymentserver.repositories;

import com.captura.paymentserver.entitys.MerchantAcquirerConfig;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantAcquirerConfigRepository extends JpaRepository<MerchantAcquirerConfig, Long> {
}
