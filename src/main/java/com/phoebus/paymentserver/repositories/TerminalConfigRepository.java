package com.phoebus.paymentserver.repositories;

import com.phoebus.paymentserver.entitys.TerminalConfig;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TerminalConfigRepository extends JpaRepository<TerminalConfig, Long> {
}
