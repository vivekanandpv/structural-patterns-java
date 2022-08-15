package com.vivekanandpv.proxy;

public class Program {
    public static void main(String[] args) {
        Controller proxyController = new ProxyController(new RestController());

        proxyController.process("Greetings of the day!");
    }
}
