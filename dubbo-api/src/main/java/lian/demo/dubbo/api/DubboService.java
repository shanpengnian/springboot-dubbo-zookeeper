package lian.demo.dubbo.api;

public interface DubboService {

    default String sayHello(String name) {
        return null;
    }
}

