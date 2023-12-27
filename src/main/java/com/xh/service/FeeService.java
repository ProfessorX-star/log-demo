package com.xh.service;

import com.xh.constant.BizTypeEnum;
import com.xh.dto.FeeResult;
import org.springframework.stereotype.Service;

@Service
public class FeeService {
    public FeeResult queryFeeRate(BizTypeEnum bizTypeEnum) {
        return new FeeResult();
    }
}
