package com.phoebus.paymentserver.repositories;

import com.phoebus.paymentserver.entitys.AcquirerConfig;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcquirerConfigRepository extends JpaRepository<AcquirerConfig, Long> {
}
