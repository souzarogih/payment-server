package com.captura.paymentserver.controllers;

import com.captura.paymentserver.dtos.EquipmentConfigRequestDto;

import com.captura.paymentserver.dtos.EquipmentConfigResponseDto;
import com.captura.paymentserver.entitys.EquipmentConfig;
import com.captura.paymentserver.services.EquipmentConfigService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;

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
        equipmentConfigData.setSerialNumber(equipmentConfigRequestDto.getSerialNumber());
        equipmentConfigData.setEquipmentConfigCreateDate(LocalDateTime.now(ZoneId.of("UTC")));
        EquipmentConfig saveEquipmentObject = equipmentConfigService.saveEquipment(equipmentConfigData);

        EquipmentConfigResponseDto equipmentConfigResponseDto = new EquipmentConfigResponseDto();
        equipmentConfigResponseDto.setEquipmentConfigId(saveEquipmentObject.getEquipmentConfigId());
        equipmentConfigResponseDto.setSerialNumber(saveEquipmentObject.getSerialNumber());

        return ResponseEntity.status(HttpStatus.CREATED).body(equipmentConfigResponseDto);
    }

    @GetMapping("/equipment")
    public ResponseEntity<List<EquipmentConfig>> listEquipments() {
        log.info("Controller para lista os equipamentos cadastrados");
        List<EquipmentConfig> listEquipmentsObject = equipmentConfigService.listEquipments();
        return ResponseEntity.status(HttpStatus.OK).body(listEquipmentsObject);
    }

    @GetMapping("/equipment/{serial_number}")
    public ResponseEntity<Object> equipmentConsultSerialNumber(@PathVariable(value = "serial_number") String serialNumber) {
        log.info("Consulta de um equipamento pelo serial.");

        Optional<EquipmentConfig> consultEquipmentObject = equipmentConfigService.consultEquipmentSerialNumber(serialNumber);

        if (consultEquipmentObject.isPresent()){
            EquipmentConfigResponseDto equipmentConfigResponseDto = new EquipmentConfigResponseDto();
            equipmentConfigResponseDto.setEquipmentConfigId(consultEquipmentObject.get().getEquipmentConfigId());
            equipmentConfigResponseDto.setSerialNumber(consultEquipmentObject.get().getSerialNumber());
            return ResponseEntity.status(HttpStatus.OK).body(equipmentConfigResponseDto);
        }else {
            EquipmentConfigResponseDto equipmentResponse = new EquipmentConfigResponseDto();
            equipmentResponse.setMessage("Equipment not found.");
            equipmentResponse.setCode("PS-404");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(equipmentResponse);
        }
    }

    @PatchMapping("/equipment/{serial_number}")
    public ResponseEntity<EquipmentConfigResponseDto> equipmentUpdate(@PathVariable(value = "serial_number") String serialNumber,
                                                                      @RequestBody EquipmentConfigRequestDto equipmentConfigRequestDto) {
        log.info("/equipmentUpdate");

        Optional<EquipmentConfig> equipmentConfigObject = equipmentConfigService.consultEquipmentSerialNumber(serialNumber);
        if(equipmentConfigObject.isPresent()){
            EquipmentConfig equipmentConfigData = new EquipmentConfig();
            equipmentConfigData.setEquipmentConfigId(equipmentConfigObject.get().getEquipmentConfigId());
            equipmentConfigData.setEquipmentConfigCreateDate(equipmentConfigObject.get().getEquipmentConfigCreateDate());
            equipmentConfigData.setSerialNumber(equipmentConfigRequestDto.getSerialNumber());
            equipmentConfigData.setEquipmentConfigLastUpdate(LocalDateTime.now(ZoneId.of("UTC")));
            EquipmentConfig saveEquipmentObject = equipmentConfigService.updateEquipmentSerialNumber(equipmentConfigData);

            EquipmentConfigResponseDto equipmentConfigResponseDto = new EquipmentConfigResponseDto();
            equipmentConfigResponseDto.setEquipmentConfigId(saveEquipmentObject.getEquipmentConfigId());
            equipmentConfigResponseDto.setSerialNumber(saveEquipmentObject.getSerialNumber());
            return ResponseEntity.status(HttpStatus.CREATED).body(equipmentConfigResponseDto);
        } else {
            EquipmentConfigResponseDto equipmentConfigResponseDto = new EquipmentConfigResponseDto();
            equipmentConfigResponseDto.setCode("PS-404");
            equipmentConfigResponseDto.setMessage("Serial " + serialNumber + " não encontrado!");
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(equipmentConfigResponseDto);
        }
    }

    //criar a inicialização de um terminal
    //na inicialização, precisa criar uma nova tabela com dados extras sobre o dispositivo client
}
