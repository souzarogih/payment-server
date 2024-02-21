package com.captura.paymentserver.entitys;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "transaction_data")
public class TransactionData implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long transactionDataId;

    private Double transactionValue;
    private String cardLastNumber;
    private String cardFirstNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    @Column(nullable = false)
    private LocalDateTime transactionDataCreate;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    private LocalDateTime transactionDataLastUpdate;

    private String transactionDataType;
    private Integer installments;
    private String paymentType;
    private String nsuClient;
    private String lastNsuClient;
//    private CardBrand cardBrandId;
    private String cardHolder;
}
