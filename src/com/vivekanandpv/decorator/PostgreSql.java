package com.vivekanandpv.decorator;

public class PostgreSql extends AbstractSoftwareDecorator {

    protected PostgreSql(Software component) {
        super(component);
    }

    @Override
    public void install() {
        super.install();
        installPostgreSql();
    }

    private void installPostgreSql() {
        System.out.println("Installing PostgreSQL...");
    }
}
