package com.phoebus.paymentserver.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "acquirer_rede_execute")
public class AcquirerRedeExecute {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long acquirer_rede_execute_id;
    private LocalDateTime acquirer_start_date;
    private LocalDateTime acquirer_finish_date;
}
