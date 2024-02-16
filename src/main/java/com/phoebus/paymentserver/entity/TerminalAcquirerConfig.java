package com.phoebus.paymentserver.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "terminal_acquirer_config")
public class TerminalAcquirerConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long terminal_acquirer_config_id;
    private String tid;

    private LocalDateTime terminal_acquirer_create;
}