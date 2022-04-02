package cn.cmo.zhshzh.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 属性配置
 *
 * @author gongqc 2022-04-02
 */
@Data
@Component
@ConfigurationProperties(prefix = "project")
public class PropertiesConfig {

    /**
     * 名字
     */
    String name;

    /**
     * 作者
     */
    String author;

    /**
     * 日期
     */
    String date;
}
