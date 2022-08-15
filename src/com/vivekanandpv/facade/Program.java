package com.vivekanandpv.facade;

public class Program {
    public static void main(String[] args) {
        Compiler compiler = new CompilerImplementation();
        compiler.compile();
    }
}
