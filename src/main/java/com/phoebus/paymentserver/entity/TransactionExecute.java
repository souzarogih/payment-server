package com.phoebus.paymentserver.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "transaction_execute")
public class TransactionExecute {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long transaction_execute_id;
    private AcquirerConfig acquirer_config_id;
    private TerminalConfig terminal_config_id;
    private TerminalAcquirerConfig terminal_acquirer_config_id;
    private MerchantConfig merchant_config_id;
    private MerchantAcquirerConfig merchant_acquirer_config_id;
    private LocalDateTime  transaction_start;
    private LocalDateTime transaction_finish;
    private LocalDateTime  transaction_last_update;
    private String transaction_execute_type;
    private TransactionData transaction_data_id;
    private TransactionExecute last_transaction_execute_id;
    private Long nsu_captura;

    private UUID payment_id;
}
