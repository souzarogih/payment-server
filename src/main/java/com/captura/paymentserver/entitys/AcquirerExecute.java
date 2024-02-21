package com.phoebus.paymentserver.entitys;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "acquirer_execute")
public class AcquirerExecute implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long acquirer_execute_id;
    private AcquirerConfig acquirer_config_id;
    private Long last_acquirer_execute_id;
    private String nsu_acquirer;
    private String authorization_code;
    private String response_code;
    private String response_message;

    private LocalDateTime acquirer_execute_create;

    private LocalDateTime acquirer_execute_last_update;
}
