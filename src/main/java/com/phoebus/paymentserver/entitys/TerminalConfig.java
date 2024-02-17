package com.phoebus.paymentserver.entitys;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "terminal_config")
public class TerminalConfig implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long terminal_config_id;

    private String merchant_config;
    private String terminal_acquirer_config_id;
    private String equipment_config_id;

    private LocalDateTime termina_config_create;
    private LocalDateTime termina_config_last_update;
}
