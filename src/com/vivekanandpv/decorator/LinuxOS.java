package com.vivekanandpv.decorator;

public class LinuxOS implements Software {
    @Override
    public void install() {
        System.out.println("Installing Linux OS");
    }
}
