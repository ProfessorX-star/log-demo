package com.xh.controller;

import com.xh.constant.BizTypeEnum;
import com.xh.constant.OutErrorCode;
import com.xh.dto.FeeResult;
import com.xh.dto.TransferRequest;
import com.xh.dto.TransferResponse;
import com.xh.service.FeeService;
import com.xh.utils.ValidateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Controller
public class BeforeController {

    private static final Logger log = LoggerFactory.getLogger(BeforeController.class);

    private final BigDecimal DEFAULT_FEE = BigDecimal.ZERO;

    @Resource
    private FeeService feeService;

    @PostMapping("/transfer")
    public TransferResponse transfer(@RequestBody TransferRequest transferRequest) {
        log.info("请求参数={}", transferRequest);
        // 1、参数校验
        if (!ValidateUtils.isValidMoney(transferRequest.getFee())) {
            log.error("金额非法");
            return buildFailResponse(OutErrorCode.INVALID_MONEY);
        }
        // 2、计算交易手续费
        // 2.1 获取费率
        BigDecimal feeRate = DEFAULT_FEE;
        FeeResult feeResult = feeService.queryFeeRate(BizTypeEnum.TRANSFER);
        if (feeResult.isSuccess()) {
            feeRate = feeResult.getRate();
        } else {
            log.error("查询费率失败！");
        }
        return new TransferResponse();
    }

    private static TransferResponse buildFailResponse(String code) {
        return new TransferResponse(code, "价格错误！");
    }
}
