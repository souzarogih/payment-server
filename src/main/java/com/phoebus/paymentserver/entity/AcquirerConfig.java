package com.phoebus.paymentserver.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "acquirer_config")
public class AcquirerConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long acquirer_config_id;

    private String acquirer_name;

    private LocalDateTime acquirer_create_date;
    private LocalDateTime acquirer_last_update;
}
