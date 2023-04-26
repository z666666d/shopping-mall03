package com.example.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Data
// 动态刷新
@RefreshScope
@Configuration
@ConfigurationProperties(prefix = "server.gray")
public class GrayProperty {

    /**
     * 生产的版本
     */
    private String proVersion;


    /**
     * 灰度的版本
     */
    private String grayVersion;

    /**
     * 需要灰度的人员列表
     */
    private List<String> grayUsers;

    /**
     * 权重
     */
    private Double weight;


}
