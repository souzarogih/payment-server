package com.captura.paymentserver.entitys;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "transaction_execute")
public class TransactionExecute implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long transaction_execute_id;

    private Long last_transaction_execute_id;

    private AcquirerConfig acquirer_config_id;
    private TerminalConfig terminal_config_id;
    private TerminalAcquirerConfig terminal_acquirer_config_id;
    private MerchantConfig merchant_config_id;
    private MerchantAcquirerConfig merchant_acquirer_config_id;
    private TransactionData transaction_data_id;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    @Column(nullable = false)
    private LocalDateTime  startTransactionExecute;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    @Column
    private LocalDateTime finishTransactionExecute;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    @Column
    private LocalDateTime  transactionLastUpdate;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    @Column(nullable = false)
    private LocalDateTime  transactionDate;

    private String transaction_execute_type;

//    @Column(nullable = false)
//    private CapturaTransactionStatus capturaTransactionStatusId;
    /*1-pendente 2-em andamento 3-concluida 4-confirmada 5-erro 6-cancelada*/

    private Long nsu_captura;
    private UUID payment_id;
}
