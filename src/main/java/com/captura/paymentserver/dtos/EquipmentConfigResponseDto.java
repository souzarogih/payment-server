package com.captura.paymentserver.dtos;

import lombok.Data;

@Data
public class EquipmentConfigResponseDto {

    private Long equipmentConfigId;
    private String serialNumber;
    private String message;
    private String code;

}
