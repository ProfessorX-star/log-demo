package com.xh.constant;

import lombok.Getter;

@Getter
public enum PayStrategyEnum {
    ALI_PAY("aliPay"),
    WX_PAY("wxPay"),
    ;

    private final String name;

    PayStrategyEnum(String name) {
        this.name = name;
    }
}
