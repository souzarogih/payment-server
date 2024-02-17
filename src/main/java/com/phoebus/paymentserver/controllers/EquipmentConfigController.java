package com.phoebus.paymentserver.controllers;

import com.phoebus.paymentserver.dtos.EquipmentConfigRequestDto;

import com.phoebus.paymentserver.dtos.EquipmentConfigResponseDto;
import com.phoebus.paymentserver.entitys.EquipmentConfig;
import com.phoebus.paymentserver.services.EquipmentConfigService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Log4j2
@RestController
@RequestMapping("/paymentServer")
public class EquipmentConfigController {

    @Autowired
    EquipmentConfigService equipmentConfigService;

    @PostMapping("/equipment")
    public ResponseEntity<EquipmentConfigResponseDto> equipmentCreate(@RequestBody EquipmentConfigRequestDto equipmentConfigRequestDto) {
        log.info("/equipment");

        EquipmentConfig equipmentConfigData = new EquipmentConfig();
        equipmentConfigData.setSerial_number(equipmentConfigRequestDto.getSerial_number());
        equipmentConfigData.setCreate_date(LocalDateTime.now(ZoneId.of("UTC")));
        EquipmentConfig saveEquipmentObject = equipmentConfigService.saveEquipment(equipmentConfigData);

        EquipmentConfigResponseDto equipmentConfigResponseDto = new EquipmentConfigResponseDto();
        equipmentConfigResponseDto.setEquipment_config_id(saveEquipmentObject.getEquipment_config_id());
        equipmentConfigResponseDto.setSerial_number(saveEquipmentObject.getSerial_number());

        return ResponseEntity.status(HttpStatus.CREATED).body(equipmentConfigResponseDto);
    }
}
