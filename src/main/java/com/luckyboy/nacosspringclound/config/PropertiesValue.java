package com.luckyboy.nacosspringclound.config;

import com.alibaba.nacos.api.config.ConfigType;
import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: LuckyBoy
 * @create: 2020-08-14 10:37
 **/
@Configuration
public class PropertiesValue {
//    @Value(value = "${sys.thisUrl}")
    private String thisUrl;

    public String getThisUrl() {
        return thisUrl;
    }

    public void setThisUrl(String thisUrl) {
        this.thisUrl = thisUrl;
    }

    @Override
    public String toString() {
        return "PropertiesValue{" +
                "thisUrl='" + thisUrl + '\'' +
                '}';
    }
}
