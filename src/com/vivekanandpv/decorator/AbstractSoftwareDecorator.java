package com.vivekanandpv.decorator;

public abstract  class AbstractSoftwareDecorator implements Software {
    private final Software component;

    protected AbstractSoftwareDecorator(Software component) {
        this.component = component;
    }

    @Override
    public void install() {
        component.install();
    }
}
