package com.xh.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 支付宝支付配置
 */
@Data
@Component
@ConfigurationProperties(prefix = "ali-pay")
public class AliPayProperties {
	private String appId;
	private String privateKey;
	private String publicKey;
	private String appCertPath;
	private String aliPayCertPath;
	private String aliPayRootCertPath;
	private String serverUrl;
	private String domain;
	private String returnUrl;
	private String notifyUrl;
}
