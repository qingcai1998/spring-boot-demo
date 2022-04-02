package cn.cmo.zhshzh.controller;

import cn.cmo.zhshzh.config.PropertiesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 其他控制器
 *
 * @author gongqc 2022-04-02
 */
@RestController
@RequestMapping("/demo")
public class PropertiesController {

    private final PropertiesConfig propertiesConfig;

    @Autowired
    public PropertiesController(PropertiesConfig propertiesConfig) {
        this.propertiesConfig = propertiesConfig;
    }

    @GetMapping("/")
    public String helloWorld(){
        return "hello World";
    }

    @GetMapping("/getProperties")
    public String getProperties() {
        return "项目名称" + propertiesConfig.getName() + "作者:" + propertiesConfig.getAuthor() +
                "时间" + propertiesConfig.getDate();
    }
}
