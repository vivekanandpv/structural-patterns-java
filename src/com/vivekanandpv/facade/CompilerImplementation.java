package com.vivekanandpv.facade;

public class CompilerImplementation implements Compiler {
    @Override
    public void compile() {
        Preprocessor preprocessor = new Preprocessor();
        preprocessor.process();

        CodeGenerator codeGenerator = new CodeGenerator();
        codeGenerator.generate();

        Linker linker = new Linker();
        linker.link();
    }
}
