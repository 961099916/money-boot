package site.zhangjiahao.moneyboot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author 张家豪
 */
@Configuration
@Data
@ConfigurationProperties(prefix = "akshare")
public class AkShareConfig {
    private String baseUrl = "http://127.0.0.1:8080/api/public";
    private String calendarUrl = baseUrl + "/tool_trade_date_hist_sina";
}
