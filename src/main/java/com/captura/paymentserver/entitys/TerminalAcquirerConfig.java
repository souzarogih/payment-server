package com.phoebus.paymentserver.entitys;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "terminal_acquirer_config")
public class TerminalAcquirerConfig implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long terminal_acquirer_config_id;

    private String tid;

    private String acquirer_config_id;

    private LocalDateTime terminal_acquirer_create;
}
