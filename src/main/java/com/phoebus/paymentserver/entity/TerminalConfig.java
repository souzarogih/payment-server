package com.phoebus.paymentserver.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "terminal_config")
public class TerminalConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long terminal_config_id;

    private MerchantConfig merchant_config;
    private TerminalAcquirerConfig terminal_acquirer_config_id;
    private EquipmentConfig equipment_config_id;

    private LocalDateTime termina_config_create;
    private LocalDateTime termina_config_last_update;
}
