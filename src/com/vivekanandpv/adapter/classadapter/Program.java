package com.vivekanandpv.adapter.classadapter;

import com.vivekanandpv.adapter.objectadapter.Server;

public class Program {
    public static void main(String[] args) {
        Server server = new AzureServerAdapter();

        server.start();
        server.stop();
    }
}
