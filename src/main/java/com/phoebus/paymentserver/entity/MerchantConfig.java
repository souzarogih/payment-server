package com.phoebus.paymentserver.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "merchant_config")
public class MerchantConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long merchant_config_id;
    private MerchantAcquirerConfig merchant_acquirer_config_id;
    private MerchantDataConfig merchant_data_config_id;

    private LocalDateTime merchant_config_create;

    private LocalDateTime merchant_config_last_update;
}
