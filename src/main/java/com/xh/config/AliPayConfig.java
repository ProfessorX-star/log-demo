package com.xh.config;

import com.alipay.api.AlipayApiException;
import com.ijpay.alipay.AliPayApiConfig;
import com.ijpay.alipay.AliPayApiConfigKit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * 支付宝
 */
@Slf4j
@Configuration
public class AliPayConfig {
    @Resource
    private AliPayProperties aliPayBean;
    @Bean
    public void setConfig() {
        AliPayApiConfig aliPayApiConfig;
        try {
            aliPayApiConfig = AliPayApiConfig.builder()
                    .setAppId(aliPayBean.getAppId())
                    .setAppCertPath(aliPayBean.getAppCertPath())
                    .setAliPayCertPath(aliPayBean.getAliPayCertPath())
                    .setAliPayRootCertPath(aliPayBean.getAliPayRootCertPath())
                    .setCharset("UTF-8")
                    .setPrivateKey(aliPayBean.getPrivateKey())
                    .setAliPayPublicKey(aliPayBean.getPublicKey())
                    .setServiceUrl(aliPayBean.getServerUrl())
                    .setSignType("RSA2")
                    .buildByCert();
        } catch (AlipayApiException e) {
            return;
        }
        AliPayApiConfigKit.setThreadLocalAliPayApiConfig(aliPayApiConfig);
    }
}
