package com.vivekanandpv.adapter.objectadapter;

public class AzureServerAdapter implements Server {
    private final AzureVM azureVM;

    public AzureServerAdapter(AzureVM azureVM) {
        this.azureVM = azureVM;
    }

    @Override
    public void start() {
        System.out.println("Azure VM will start");
        azureVM.run();
    }

    @Override
    public void stop() {
        System.out.println("Azure VM will stop");
        azureVM.halt();
    }
}
