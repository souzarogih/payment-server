package com.phoebus.paymentserver.repositories;

import com.phoebus.paymentserver.entitys.TransactionExecute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionExecuteRepository extends JpaRepository<TransactionExecute, Long> {
}
