package com.captura.paymentserver.entitys;

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
    private Long transaction_data_id;

    private Double transaction_value;
    private String card_last_number;
    private String card_first_number;
    private LocalDateTime transaction_data_create;
    private LocalDateTime transaction_data_last_update;
    private String transaction_data_type;
    private Integer installments;
    private String payment_type;
    private String nsu_client;
    private String last_nsu_client;
    private String card_brand_id;
    private String card_holder;
}
