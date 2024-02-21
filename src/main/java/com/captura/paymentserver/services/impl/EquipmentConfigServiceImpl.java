package com.phoebus.paymentserver.services.impl;

import com.phoebus.paymentserver.entitys.EquipmentConfig;
import com.phoebus.paymentserver.repositories.EquipmentConfigRepository;
import com.phoebus.paymentserver.services.EquipmentConfigService;
import jakarta.transaction.Transactional;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public List<EquipmentConfig> listEquipments() {
        log.info("listEquipments");
        return equipmentConfigRepository.findAll();
    }

    public Optional<EquipmentConfig> consultEquipmentSerialNumber(String serialNumber) {
        log.info("");
        return equipmentConfigRepository.findEquipmentConfigBySerialNumber(serialNumber);
    }

    @Transactional
    public EquipmentConfig updateEquipmentSerialNumber(EquipmentConfig equipmentConfig) {
        log.info("");
        return equipmentConfigRepository.save(equipmentConfig);
    }

}
