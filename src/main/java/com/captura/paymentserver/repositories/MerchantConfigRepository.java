package com.phoebus.paymentserver.repositories;

import com.phoebus.paymentserver.entitys.MerchantConfig;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantConfigRepository extends JpaRepository<MerchantConfig, Long> {
}
