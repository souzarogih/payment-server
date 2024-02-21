package com.captura.paymentserver.repositories;

import com.captura.paymentserver.entitys.TerminalAcquirerConfig;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TerminalAcquirerConfigRepository extends JpaRepository<TerminalAcquirerConfig, Long> {
}
