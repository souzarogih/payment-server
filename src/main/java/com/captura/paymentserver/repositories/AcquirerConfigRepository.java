package com.captura.paymentserver.repositories;

import com.captura.paymentserver.entitys.AcquirerConfig;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcquirerConfigRepository extends JpaRepository<AcquirerConfig, Long> {
}
