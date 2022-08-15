package com.vivekanandpv.bridge;

public class Program {
    public static void main(String[] args) {
        AbstractInfrastructure infrastructure = new CloudInfrastructure(new AwsEC2());

        infrastructure.instantiate();
        infrastructure.powerOff();
    }
}
