package com.captura.paymentserver.entitys;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "terminal_config")
public class TerminalConfig implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long terminalConfigId;

    @OneToOne
    @JoinColumn(name = "merchant_config_id")
    private MerchantConfig merchantConfigId;

    @OneToOne
    @JoinColumn(name = "terminal_acquirer_config_id")
    private TerminalAcquirerConfig terminalAcquirerConfigId;

    @OneToOne
    @JoinColumn(name = "equipment_config_id")
    private EquipmentConfig equipmentConfigId;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    @Column(nullable = false)
    private LocalDateTime terminaConfigCreate;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    private LocalDateTime terminaConfigLastUpdate;
}
