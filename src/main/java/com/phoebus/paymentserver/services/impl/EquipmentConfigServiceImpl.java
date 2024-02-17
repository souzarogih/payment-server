package com.phoebus.paymentserver.services.impl;

import com.phoebus.paymentserver.entitys.EquipmentConfig;
import com.phoebus.paymentserver.repositories.EquipmentConfigRepository;
import com.phoebus.paymentserver.services.EquipmentConfigService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Log4j2
@Service
public class EquipmentConfigServiceImpl implements EquipmentConfigService {

    @Autowired
    EquipmentConfigRepository equipmentConfigRepository;

    @Override
    public EquipmentConfig saveEquipment(EquipmentConfig equipmentConfig) {
        log.info("saveEquipment");
        return equipmentConfigRepository.save(equipmentConfig);
    }

}
