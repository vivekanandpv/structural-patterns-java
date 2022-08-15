package com.vivekanandpv.decorator;

public class Program {
    public static void main(String[] args) {
        Software softwareComponent = new PostgreSql(new Nginx(new LinuxOS()));

        softwareComponent.install();
    }
}
