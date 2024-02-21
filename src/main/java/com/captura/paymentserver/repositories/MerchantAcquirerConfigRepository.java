package com.phoebus.paymentserver.repositories;

import com.phoebus.paymentserver.entitys.MerchantAcquirerConfig;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantAcquirerConfigRepository extends JpaRepository<MerchantAcquirerConfig, Long> {
}
