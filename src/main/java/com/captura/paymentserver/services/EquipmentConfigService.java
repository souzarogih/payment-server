package com.phoebus.paymentserver.services;

import com.phoebus.paymentserver.entitys.EquipmentConfig;

import java.util.List;
import java.util.Optional;

public interface EquipmentConfigService {

    EquipmentConfig saveEquipment(EquipmentConfig equipmentConfig);

    public List<EquipmentConfig> listEquipments();

    public Optional<EquipmentConfig> consultEquipmentSerialNumber(String serialNumber);

    public EquipmentConfig updateEquipmentSerialNumber(EquipmentConfig serialNumber);
}
