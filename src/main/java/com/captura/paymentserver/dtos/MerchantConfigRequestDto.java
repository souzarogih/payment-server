package com.captura.paymentserver.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
public class MerchantConfigRequestDto {

    @NotBlank(message = "Campo companyName obrigatório.")
    private String companyName;

    @NotBlank(message = "Campo commercialName obrigatório.")
    private String commercialName;
}
