package com.captura.paymentserver.entitys;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "acquirer_execute")
public class AcquirerExecute implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private UUID acquirerParentId;

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

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    @Column(nullable = false)
    private LocalDateTime acquirerExecuteCreate;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    @Column(nullable = false)
    private LocalDateTime acquirerExecuteLastUpdate;
}
