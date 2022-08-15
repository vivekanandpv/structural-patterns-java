package com.vivekanandpv.bridge;

public interface Server {
    boolean hasStarted();
    void powerOn();
    void installMachineImage();
    void setupUserAccount();
    void installAdditionalSoftware();
    void startOperation();
    void stopOperation();
    void powerOff();
}
