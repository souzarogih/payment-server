package com.phoebus.paymentserver.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "equipment_data_config")
public class EquipmentDataConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long equipment_data_config_id;

    private String pinpad_serial_number;
//    private String equipment_model_id;
    private String so;
    private String pinpad_so;
    private String imei;
    private String mac_wifi;
    private String gsm_serial;
    private String so_version;

    private LocalDateTime equipment_data_config_create;

    private LocalDateTime equipment_data_config_last_update;
}
