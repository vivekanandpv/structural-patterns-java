package com.vivekanandpv.proxy;

public class RestController implements Controller {
    @Override
    public String process(String request) {
        return "REST Response: " + request;
    }
}
