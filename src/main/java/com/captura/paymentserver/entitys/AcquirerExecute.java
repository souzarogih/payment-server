package com.captura.paymentserver.entitys;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "acquirer_execute")
public class AcquirerExecute implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long acquirer_execute_id;

    @Column(nullable = false)
//    @OneToOne
//    @JoinColumn(name = "acquirerConfigId")
    private String acquirerConfigId;

    @Column(nullable = false)
//    @OneToOne
//    @JoinColumn(name = "acquirerConfigId")
    private String lastAcquirerExecuteId;
    private String nsuAcquirer;
    private String authorizationCode;
    private String responseCode;
    private String responseMessage;

    private LocalDateTime acquirerExecuteCreate;

    private LocalDateTime acquirerExecuteLastUpdate;
}
