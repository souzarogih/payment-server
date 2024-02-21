package com.phoebus.paymentserver.repositories;

import com.phoebus.paymentserver.entitys.TerminalAcquirerConfig;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TerminalAcquirerConfigRepository extends JpaRepository<TerminalAcquirerConfig, Long> {
}
