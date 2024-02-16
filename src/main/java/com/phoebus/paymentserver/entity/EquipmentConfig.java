package com.phoebus.paymentserver.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "equipment_config")
public class EquipmentConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long equipment_config_id;

    private String serial_number;

    private EquipmentDataConfig equipment_data_config_id;

    private LocalDateTime create_date;
    private LocalDateTime last_update;
}
