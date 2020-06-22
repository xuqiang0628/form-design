package com.boode.springboot1.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:config/myProperties.properties")
@ConfigurationProperties(prefix = "boode")  // 指定属性的前缀
public class MyProperties {

   private String wx_appid;
   private String wx_appsecret;
   private String sns_sign_name;
   private String sns_accessKeyId;
   private String sns_accessKeySecret;
   private String sns_template_code;


    public MyProperties() {
    }

    public MyProperties(String wx_appid, String wx_appsecret, String sns_sign_name, String sns_accessKeyId, String sns_accessKeySecret, String sns_template_code) {
        this.wx_appid = wx_appid;
        this.wx_appsecret = wx_appsecret;
        this.sns_sign_name = sns_sign_name;
        this.sns_accessKeyId = sns_accessKeyId;
        this.sns_accessKeySecret = sns_accessKeySecret;
        this.sns_template_code = sns_template_code;
    }

    public String getWx_appid() {
        return wx_appid;
    }

    public void setWx_appid(String wx_appid) {
        this.wx_appid = wx_appid;
    }

    public String getWx_appsecret() {
        return wx_appsecret;
    }

    public void setWx_appsecret(String wx_appsecret) {
        this.wx_appsecret = wx_appsecret;
    }

    public String getSns_sign_name() {
        return sns_sign_name;
    }

    public void setSns_sign_name(String sns_sign_name) {
        this.sns_sign_name = sns_sign_name;
    }

    public String getSns_accessKeyId() {
        return sns_accessKeyId;
    }

    public void setSns_accessKeyId(String sns_accessKeyId) {
        this.sns_accessKeyId = sns_accessKeyId;
    }

    public String getSns_accessKeySecret() {
        return sns_accessKeySecret;
    }

    public void setSns_accessKeySecret(String sns_accessKeySecret) {
        this.sns_accessKeySecret = sns_accessKeySecret;
    }

    public String getSns_template_code() {
        return sns_template_code;
    }

    public void setSns_template_code(String sns_template_code) {
        this.sns_template_code = sns_template_code;
    }

    @Override
    public String toString() {
        return "MyProperties{" +
                "wx_appid='" + wx_appid + '\'' +
                ", wx_appsecret='" + wx_appsecret + '\'' +
                ", sns_sign_name='" + sns_sign_name + '\'' +
                ", sns_accessKeyId='" + sns_accessKeyId + '\'' +
                ", sns_accessKeySecret='" + sns_accessKeySecret + '\'' +
                ", sns_template_code='" + sns_template_code + '\'' +
                '}';
    }
}
