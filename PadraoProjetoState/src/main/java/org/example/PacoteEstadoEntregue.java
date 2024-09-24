package org.example;

public class PacoteEstadoEntregue extends PacoteEstado {

    private PacoteEstadoEntregue() {};
    private static PacoteEstadoEntregue instance = new PacoteEstadoEntregue();
    public static PacoteEstadoEntregue getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Entregue";
    }
}