package com.xh.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.api.domain.AlipayTradePagePayModel;
import com.ijpay.alipay.AliPayApi;
import com.xh.config.AliPayProperties;
import com.xh.dto.PayDTO;
import com.xh.dto.RefundDTO;
import com.xh.dto.RefundResDTO;
import com.xh.factory.strategy.PayStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service("aliPay")
@SuppressWarnings("all")
public class AliPayService implements PayStrategy<Void, RefundResDTO> {
    private static final Logger log = LoggerFactory.getLogger(AliPayService.class);
    @Resource
    private AliPayProperties aliPayBean;

    @Override
    public Void pay(PayDTO payDTO) {
        System.out.println("支付宝支付");
//        try {
//            log.info("进入了支付宝PC支付-pcPay");
//            String outTradeNo = payDTO.getOrderNo();
//            log.info("订单号" + outTradeNo);
//            log.info(aliPayBean.toString());
//
//            String returnUrl = aliPayBean.getReturnUrl();
//            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            long currentTime = new Date().getTime();
//            String timeExpire = dateFormat.format(new Date(currentTime + 1000 * 60 * 5));
//
//            AlipayTradePagePayModel model = new AlipayTradePagePayModel();
//            // 订单号
//            model.setOutTradeNo(outTradeNo);
//            // 销售产品码 电脑支付场景只能填 FAST_INSTANT_TRADE_PAY
//            model.setProductCode("FAST_INSTANT_TRADE_PAY");
//            // 订单总金额
//            model.setTotalAmount(String.valueOf(payDTO.getFee()));
//            // 商品的标题/交易标题/订单标题等
//            model.setSubject("数据超市");
//            // 扩展信息，按需传入
//            model.setBody("数据超市");
//            //二维码过期时间
//            model.setTimeExpire(timeExpire);
//            ;
//            // 回传参数
//            JSONObject jsonObject = new JSONObject();
//            jsonObject.put("outTradeNo", outTradeNo);
//            model.setPassbackParams(jsonObject.toJSONString());
//            AliPayApi.tradePage(payDTO.getResponse(), model, aliPayBean.getNotifyUrl(), returnUrl);
//            log.info("pcPay-model参数: {}", JSON.toJSONString(model));
//            log.info("pcPay-returnUrl: {}", returnUrl);
//            log.info("调用成功！");
//        } catch (Exception e) {
//            log.error("AliPayServiceImpl-dataMallBuy报错啦", e);
//            throw new RuntimeException("AliPay出错，请稍后再试！");
//        }
        return null;
    }

    @Override
    public RefundResDTO refund(RefundDTO refundDTO) {
        return new RefundResDTO();
    }
}
