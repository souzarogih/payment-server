package com.phoebus.paymentserver.entitys;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "acquirer_config")
public class AcquirerConfig implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long acquirer_config_id;

    @Column
    private String acquirer_name;

    @Column
    private LocalDateTime acquirer_create_date;

    @Column
    private LocalDateTime acquirer_last_update;

}
