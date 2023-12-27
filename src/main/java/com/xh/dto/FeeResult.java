package com.xh.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class FeeResult {

    private boolean flag = false;

    private BigDecimal rate;
    public boolean isSuccess() {
        return this.flag;
    }
}
