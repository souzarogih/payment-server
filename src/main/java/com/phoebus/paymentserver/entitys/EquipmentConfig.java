package com.phoebus.paymentserver.entitys;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "equipment_config")
public class EquipmentConfig implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long equipment_config_id;

    private String serial_number;

    private LocalDateTime create_date;
    private LocalDateTime last_update;
}
