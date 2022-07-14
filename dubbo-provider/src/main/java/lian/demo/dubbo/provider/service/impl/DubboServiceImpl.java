package lian.demo.dubbo.provider.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

import lian.demo.dubbo.api.DubboService;


@Slf4j
@Service
@Component
public class DubboServiceImpl implements DubboService {

    @Override
    public String sayHello(String name) {
        log.info("hello {}", name);
        return "hello " + name;
    }
}
