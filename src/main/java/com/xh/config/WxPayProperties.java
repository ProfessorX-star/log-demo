package com.xh.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 微信支付配置
 */
@Data
@Component
@ConfigurationProperties(prefix = "wx-pay")
public class WxPayProperties {

    /**
     *APPID
     */
    private String appId;

    /**
     * 商户号
     */
    private String mchId;

    /**
     * 回调域名
     */
    private String domain;

    /**
     * 商户私钥
     */
    private String keyPath;

    /**
     * 商户共钥
     */
    private String certPath;
    private String certP12Path;

    /**
     * 平台公钥
     */
    private String platformCertPath;

    /**
     * 用于证书解密的密钥
     */
    private String apiKey3;
    private String apiKey;

    /**
     * 商户证书序列号
     */
    private String serialNo;


}
