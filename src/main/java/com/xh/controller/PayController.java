package com.xh.controller;

import com.xh.constant.PayStrategyEnum;
import com.xh.dto.PayDTO;
import com.xh.dto.TransferRequest;
import com.xh.factory.PayFactory;
import com.xh.factory.strategy.PayStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;

@Controller
public class PayController {

    private static final Logger log = LoggerFactory.getLogger(PayController.class);

    @Autowired
    PayFactory payFactory;

    @GetMapping("/pay")
    public void pay(@RequestParam String orderNo,
                    @RequestParam PayStrategyEnum payStrategyEnum,
                    HttpServletResponse response) {
        PayDTO payDTO = new PayDTO(orderNo, new BigDecimal("100"), response);
        PayStrategy payStrategy = payFactory.getPayStrategy(payStrategyEnum.getName());
        payStrategy.pay(payDTO);
    }


}
