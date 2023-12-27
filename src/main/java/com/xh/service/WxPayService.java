package com.xh.service;

import com.xh.dto.PayDTO;
import com.xh.dto.PayResDTO;
import com.xh.dto.RefundDTO;
import com.xh.dto.RefundResDTO;
import com.xh.factory.strategy.PayStrategy;
import org.springframework.stereotype.Service;

@Service("wxPay")
@SuppressWarnings("all")
public class WxPayService implements PayStrategy<PayResDTO, RefundResDTO> {
    @Override
    public PayResDTO pay(PayDTO payDTO) {
        System.out.println("进入了微信支付");
        return null;
    }

    @Override
    public RefundResDTO refund(RefundDTO refundDTO) {
        return null;
    }
}
