package com.phoebus.paymentserver.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
//@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "equipment_config")
public class EquipmentConfig implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long equipmentConfigId;

    @Column(nullable = false, length = 30)
    private String serialNumber;

    private LocalDateTime createDate;
    private LocalDateTime lastUpdate;
}
