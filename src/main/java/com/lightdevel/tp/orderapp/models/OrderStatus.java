package com.lightdevel.tp.orderapp.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lightdevel.tp.orderapp.models.enums.Status;
import lombok.Builder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Builder
public class OrderStatus {
    private String orderId;
    private Status status;
}
