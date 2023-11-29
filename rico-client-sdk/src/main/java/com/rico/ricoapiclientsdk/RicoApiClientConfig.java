package com.rico.ricoapiclientsdk;

import com.rico.ricoapiclientsdk.client.RicoApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * ricoApi 客户端配置
 *

 */
@Configuration
@ConfigurationProperties("ricoapi.client")
@Data
@ComponentScan
public class RicoApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public RicoApiClient yuApiClient() {
        return new RicoApiClient(accessKey, secretKey);
    }

}
