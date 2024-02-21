package com.captura.paymentserver.repositories;

import com.captura.paymentserver.entitys.TerminalConfig;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TerminalConfigRepository extends JpaRepository<TerminalConfig, Long> {
}
