package com.captura.paymentserver.entitys;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "merchant_config")
public class MerchantConfig implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long merchantConfigId;

    private String merchantConfigCode;

    @OneToOne
    @JoinColumn(name = "merchantAcquirerConfigId")
    private MerchantAcquirerConfig merchantAcquirerConfigId;

    private String companyName;

    private String commercialName;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    @Column(nullable = false)
    private LocalDateTime merchantConfigCreate;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    private LocalDateTime merchantConfigLastUpdate;
}
