package com.phoebus.paymentserver.controller;

import com.phoebus.paymentserver.dto.EquipmentConfigResponseDto;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class EquipmentConfigController {

    @PostMapping("/equipment")
    public ResponseEntity<EquipmentConfigResponseDto> equipmentCreate() {


        return null;
    }
}
