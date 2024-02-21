package com.captura.paymentserver.dtos;

import com.captura.paymentserver.entitys.MerchantAcquirerConfig;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MerchantConfigResponseDto {

    private Long merchantConfigId;

    private String merchantConfigCode;

    private MerchantAcquirerConfig merchantAcquirerConfigId;

    private String companyName;

    private String commercialName;

}
