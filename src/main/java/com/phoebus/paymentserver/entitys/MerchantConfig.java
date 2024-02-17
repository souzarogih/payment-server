package com.phoebus.paymentserver.entitys;

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

    private Long merchant_config_id;

    private String merchant_acquirer_config_id;

    private String company_name;

    private String commercial_name;

    private LocalDateTime merchant_config_create;

    private LocalDateTime merchant_config_last_update;
}
