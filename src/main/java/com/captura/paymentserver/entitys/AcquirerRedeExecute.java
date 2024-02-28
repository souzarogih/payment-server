package com.captura.paymentserver.entitys;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "acquirer_rede_execute")
public class AcquirerRedeExecute implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    private UUID acquirerRedeExecuteId;
    private Long id;

    private String acquirerNsu;

    private String acquirerAuthCode;

    private String acquirerResponseMessage;

    private String acquirerResponseCode;

//    private AcquirerStatus acquirerStatusId;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    @Column(nullable = false)
    private LocalDateTime acquirerStartDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    private LocalDateTime acquirerFinishDate;
}
