package com.vivekanandpv.bridge;

public abstract class AbstractInfrastructure {
    protected Server server;

    public AbstractInfrastructure(Server server) {
        this.server = server;
    }

    public abstract void setServer(Server server);

    public abstract void instantiate();

    public abstract void powerOff();
}
