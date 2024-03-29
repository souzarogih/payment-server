package com.captura.paymentserver.entitys;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "merchant_acquirer_config")
public class MerchantAcquirerConfig implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "acquirer_config_id")
    private AcquirerConfig acquirerConfig;

    @Transient
    private String merchantAcquirerName;

    private String mid;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    @Column(nullable = false)
    private LocalDateTime merchantAcquirerConfigCreate;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    private LocalDateTime merchantAcquirerConfigLastUpdate;
}

