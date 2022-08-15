package com.vivekanandpv.decorator;

public class Nginx extends AbstractSoftwareDecorator {
    protected Nginx(Software component) {
        super(component);
    }

    @Override
    public void install() {
        super.install();
        installNginx();
    }

    private void installNginx() {
        System.out.println("Installing nginx...");
    }
}
