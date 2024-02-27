package com.captura.paymentserver.repositories;

import com.captura.paymentserver.entitys.AcquirerConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AcquirerConfigRepository extends JpaRepository<AcquirerConfig, Long> {

    @Query(value = "select * from acquirer_config where acquirer_name = :acquirer_name", nativeQuery = true)
    Optional<AcquirerConfig> findByAcquirerName(@Param("acquirer_name") String acquirer_name);
}
