package com.captura.paymentserver.dtos;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class AcquirerConfigDto {

    private String acquirerName;
}
