package org.example;

public class PacoteEstadoEmTransporte extends PacoteEstado {

    private PacoteEstadoEmTransporte() {};
    private static PacoteEstadoEmTransporte instance = new PacoteEstadoEmTransporte();
    public static PacoteEstadoEmTransporte getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Em Transporte";
    }

    @Override
    public boolean entregar(Pacote pacote) {
        pacote.setEstado(PacoteEstadoEntregue.getInstance());
        return true;
    }

    @Override
    public boolean cancelar(Pacote pacote) {
        pacote.setEstado(PacoteEstadoCancelado.getInstance());
        return true;
    }

    @Override
    public boolean aguardarRetirada(Pacote pacote) {
        pacote.setEstado(PacoteEstadoAguardandoRetirada.getInstance());
        return true;
    }
}