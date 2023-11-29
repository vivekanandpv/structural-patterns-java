package com.vivekanandpv.proxy;

public class ProxyController implements Controller {
    private Controller controller;



    @Override
    public String process(String request) {
        System.out.println("Proxying to the underlying controller: " + request);

        //  Lazy instantiation can be considered here
        var controller = new RestController();
        var result = controller.process(request);
        //  release
        return result;
    }
}
