package com.phoebus.paymentserver.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "merchant_data_config")
public class MerchantDataConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long merchant_data_config_id;

    private String company_name;
    private String commercial_name;

    private LocalDateTime merchant_data_config_create;
    private LocalDateTime merchant_data_config_last_update;


}
