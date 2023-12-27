package com.xh.dto;

import lombok.Data;

@Data
public class RefundDTO {
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 退款金额
     */
    private String fee;
}
