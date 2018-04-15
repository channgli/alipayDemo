package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDB7YPYWEAfPujz"+
"7JV/gcEb9LMAQEKlvPJ3eutBir7cmlqxFTDl+pwXQgsrA0sYFllyMkGpPElwedDi"+
"ChS5q2pPqw0tShIa0H9bow90DUAOnHDTAYK1u6f/HsClFOSgi7TT1RLyxrl/pWGq"+
"1hflH3pitx4vbkbMwXnZ54LY+M4ZORSJNBBR5MxYKDh7Oo2zlK6KlBFg9HVzsNsv"+
"rJJgG5e6UU17Js+w34WpBIvbX82uFa1AvZmaRnyEANnorpO1xo0YfAdDVbdwOYjV"+
"XExZ7zlXcsbs4WnJ3bbczJbJjLvd2ephW4gNOXNQ3tqFGCK3Wv5hIfUXvdA+/kgi"+
"0rAEUAahAgMBAAECggEAEokZKPyGZHYm3emnAGDujDV/Rm7d7+l3Y2QkSEdyprM6"+
"J+LWoaSqdq6hUqMl8k9wjTGwhPR2MIH0LSa5hGWV67d1svZ5dIapJaEYQQdjMAJT"+
"5lcmnygojoHp991fXNj9l6GuBfZolILCKwn7jrLLh9Po1q+7pKZ5dxJht0tQp6ha"+
"Vc3uZWoUNYfj/0F8eh4r3CrTeLEINQwVvUTjyR3aOKtmN4mRrF1fJE9xUZETR+KM"+
"UTYsryQQKErE+9TzdTs69cG6RiHFt6a8SpZF2LnAP3FviUYL0CaNUgRl7xmPazZH"+
"SN5E/Tf8HTyooI0quEtL38VRZU1OUvq6hrpIzUJZYQKBgQDuPI1aAlUqDtxB+uln"+
"wOKkl+OYZOnD8fQ57CvzF6+Z5j4SpEkaOF1K2tO5KG/05eS0UDmdsErBfywz9/Z3"+
"m/I1nWfj8kcCC636ojNFN4ttXEVmFAxIuXI6qnDBGm/xVREotKcVBiUeguawiNYt"+
"dHDMNQ9eLNOVNKjvn++hibczowKBgQDQYzMgwkzeyZ6eQqBxpw/0mdAzhyMtf5mI"+
"XD41bu9JvZzrmRTp3ebJSS5N6r9CrH1OcjZBqd784mGsiVMcqmTYQf+J++K9gh2K"+
"OPDGcIv4uWRY47h6EU3WFYRg0h3VIOiyBBmQT3VhV5UvqFJ/qfwB/EofeYRm1vWm"+
"61BGu4fg6wKBgF6GUgNbl5TnbocTWhablpF93oTxzTq8vo1Y4ptCU585lnlpC8RG"+
"huWTa5w0qi8+I/9TMXkaoJ6jqdM42GbezjxtpvHviDMMlUwznSoifsS2bqaw36rf"+
"Qa57P9+ucKoNeZBwFTcnSAUSJRv4Pxqr77FmgCF6oby6tyjUiYzLipAHAoGBALXq"+
"o6upc2naIPqPt3kAGtGxpSwWgQMrLWD5BeWnnoWFXgPec39mFB8MH7wtfiI6anmd"+
"Avh3zw58oj/48fFIXxjbJLXUirBdcmREKQ1TGx5a2dsvkNAfYw/NYO8U/q4cOIeP"+
"RLHSa+o6hyY/jyWbw0AIerzXXFpatcCuFDprY8dZAoGADgKBaS1IILyNBdRRJKBx"+
"dplgYZpUi4KJ4nwDQtsTC31/iNs3Mt5MTAD5nfJdMk0lDBeSwhIE8hxZEpp6ITph"+
"SosMxC5XChN2r+PN3YnPJ71TVuozvAGexBSoj3OBK1JF66yUsdw3wnxFRMisHDz2"+
"Ti+kP4cqNql0MytzmgrqALM=";
    
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAt7tE3z1Lijn+sHrbt/0RH+MD3dUQCuMuE6duMQcjsCxviNQuEnxFf12K/npzVd4NmBPTQAPNpsy0DsFcCRA7QXpg/3cOapSak+U7tmT451qtVpNpzDgvFwkQY4lWjgYBHT2YMnOT29kE2bMpQbjhwpY+b9+Q8XKn8WF1C/KLVgJgKCX0NNY9zNnfsFeXmumL4gfSXYaGZQJ247AXMx2adzVXwvIDFSdhkzjiZBmIns3IN+E68IcjGxNDZ7AjZsFTtEm8+2SIdtShHpSrioIYQ0PoL46nmakBXXr8jAep113B4fu6TQkr9o7E13cE/YvQxl7yWWwOi2zG2goviLATEQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "/User/qiangli3/";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

