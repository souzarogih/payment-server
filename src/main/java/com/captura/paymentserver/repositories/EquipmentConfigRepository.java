package com.captura.paymentserver.repositories;

import com.captura.paymentserver.entitys.EquipmentConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EquipmentConfigRepository extends JpaRepository<EquipmentConfig, Long> {

    Optional<EquipmentConfig> findEquipmentConfigBySerialNumber(String serialNumber);
}
