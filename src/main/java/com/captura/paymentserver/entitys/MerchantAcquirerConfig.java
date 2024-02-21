package com.phoebus.paymentserver.entitys;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "merchant_acquirer_config")
public class MerchantAcquirerConfig implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long merchant_acquirer_config_id;

    private String acquirer_config_id;

    private String mid;

    private LocalDateTime merchant_acquirer_config_create;

    private LocalDateTime merchant_acquirer_config_last_update;
}
