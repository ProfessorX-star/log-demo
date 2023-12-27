package com.xh.factory.strategy;

import com.xh.dto.PayDTO;
import com.xh.dto.RefundDTO;

public interface PayStrategy<T, R> {
    /**
     * 支付
     */
    T pay(PayDTO payDTO);

    /**
     * 退款
     */
    R refund(RefundDTO refundDTO);
}
