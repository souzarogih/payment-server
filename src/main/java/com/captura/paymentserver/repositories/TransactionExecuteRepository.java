package com.captura.paymentserver.repositories;

import com.captura.paymentserver.entitys.TransactionExecute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionExecuteRepository extends JpaRepository<TransactionExecute, Long> {
}
