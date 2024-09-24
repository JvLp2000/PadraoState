package org.example;

public class PacoteEstadoCancelado extends PacoteEstado {

    private PacoteEstadoCancelado() {};
    private static PacoteEstadoCancelado instance = new PacoteEstadoCancelado();
    public static PacoteEstadoCancelado getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Cancelado";
    }
}