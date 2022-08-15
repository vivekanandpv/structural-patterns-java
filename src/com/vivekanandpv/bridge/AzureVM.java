package com.vivekanandpv.bridge;

public class AzureVM implements Server {
    private boolean started = false;

    @Override
    public boolean hasStarted() {
        return started;
    }

    @Override
    public void powerOn() {
        started = true;
        System.out.println("Azure VM Power on...");
    }

    @Override
    public void installMachineImage() {
        System.out.println("Azure VM Installing machine image...");
    }

    @Override
    public void setupUserAccount() {
        System.out.println("Azure VM Setting up user image...");
    }

    @Override
    public void installAdditionalSoftware() {
        System.out.println("Azure VM Installing additional software...");
    }

    @Override
    public void startOperation() {
        System.out.println("Azure VM Starting operation...");
    }

    @Override
    public void stopOperation() {
        System.out.println("Azure VM Stopping operation...");
    }

    @Override
    public void powerOff() {
        started = false;
        System.out.println("Azure VM Power off...");
    }
}
