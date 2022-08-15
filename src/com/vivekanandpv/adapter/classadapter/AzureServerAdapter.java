package com.vivekanandpv.adapter.classadapter;

import com.vivekanandpv.adapter.objectadapter.Server;

public class AzureServerAdapter extends AzureVM implements Server {
    @Override
    public void start() {
        System.out.println("Azure VM will start");
        super.run();
    }

    @Override
    public void stop() {
        System.out.println("Azure VM will stop");
        super.halt();
    }
}
