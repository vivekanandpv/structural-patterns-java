package com.vivekanandpv.adapter.objectadapter;

public class Program {
    public static void main(String[] args) {
        Server server = new AzureServerAdapter(new AzureVM());

        server.start();
        server.stop();
    }
}
