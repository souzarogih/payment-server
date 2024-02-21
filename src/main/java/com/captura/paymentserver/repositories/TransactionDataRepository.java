package com.captura.paymentserver.repositories;

import com.captura.paymentserver.entitys.TransactionData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionDataRepository extends JpaRepository<TransactionData, Long> {
}
