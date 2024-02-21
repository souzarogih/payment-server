package com.captura.paymentserver.repositories;

import com.captura.paymentserver.entitys.MerchantConfig;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantConfigRepository extends JpaRepository<MerchantConfig, Long> {
}
