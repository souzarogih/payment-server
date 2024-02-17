package com.phoebus.paymentserver.repositories;

import com.phoebus.paymentserver.entitys.TransactionData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionDataRepository extends JpaRepository<TransactionData, Long> {
}
