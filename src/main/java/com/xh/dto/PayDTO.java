package com.xh.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PayDTO {
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 支付金额
     */
    private BigDecimal fee;
    /**
     * response
     */
    HttpServletResponse response;
}
