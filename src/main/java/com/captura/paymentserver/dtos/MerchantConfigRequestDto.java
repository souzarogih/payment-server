package com.captura.paymentserver.dtos;

import com.captura.paymentserver.entitys.MerchantAcquirerConfig;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
public class MerchantConfigRequestDto {

    @NotBlank(message = "Campo companyName obrigatório.")
    private String companyName;

    @NotBlank(message = "Campo commercialName obrigatório.")
    private String commercialName;

    private String merchantConfigCode;

    private String mid;

    private String merchantAcquirerName;
}
