package com.vivekanandpv.proxy;

public class ProxyController implements Controller {
    private final Controller controller;

    public ProxyController(Controller controller) {
        this.controller = controller;
    }

    @Override
    public String process(String request) {
        System.out.println("Proxying to the underlying controller: " + request);

        //  Lazy instantiation can be considered here
        return controller.process(request);
    }
}
