package com.vivekanandpv.bridge;

public class AwsEC2 implements Server {
    private boolean started = false;

    @Override
    public boolean hasStarted() {
        return started;
    }

    @Override
    public void powerOn() {
        started = true;
        System.out.println("AWS EC2 Power on...");
    }

    @Override
    public void installMachineImage() {
        System.out.println("AWS EC2 Installing machine image...");
    }

    @Override
    public void setupUserAccount() {
        System.out.println("AWS EC2 Setting up user image...");
    }

    @Override
    public void installAdditionalSoftware() {
        System.out.println("AWS EC2 Installing additional software...");
    }

    @Override
    public void startOperation() {
        System.out.println("AWS EC2 Starting operation...");
    }

    @Override
    public void stopOperation() {
        System.out.println("AWS EC2 Stopping operation...");
    }

    @Override
    public void powerOff() {
        started = false;
        System.out.println("AWS EC2 Power off...");
    }
}
