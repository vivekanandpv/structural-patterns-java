package com.vivekanandpv.bridge;

public class CloudInfrastructure extends AbstractInfrastructure {
    public CloudInfrastructure(Server server) {
        super(server);
    }

    @Override
    public void setServer(Server server) {
        if (server.hasStarted()) {
            powerOff();
        }

        this.server = server;
    }

    @Override
    public void instantiate() {
        server.powerOn();
        server.installMachineImage();
        server.setupUserAccount();
        server.installAdditionalSoftware();
        server.startOperation();
    }

    @Override
    public void powerOff() {
        server.stopOperation();
        server.powerOff();
    }
}
