package lian.demo.dubbo.consumer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.dubbo.config.annotation.Reference;

import lian.demo.dubbo.api.DubboService;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("dubbo")
public class DubboController {

    @Reference
    private DubboService dubboService;

    @ResponseBody
    @RequestMapping("/sayHello")
    public String sayHello(String name) {
        return dubboService.sayHello(name);
    }
}
