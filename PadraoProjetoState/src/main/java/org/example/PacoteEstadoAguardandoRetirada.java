package org.example;

public class PacoteEstadoAguardandoRetirada extends PacoteEstado {

    private PacoteEstadoAguardandoRetirada() {};
    private static PacoteEstadoAguardandoRetirada instance = new PacoteEstadoAguardandoRetirada();
    public static PacoteEstadoAguardandoRetirada getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Aguardando Retirada";
    }

    @Override
    public boolean entregar(Pacote pacote) {
        pacote.setEstado(PacoteEstadoEntregue.getInstance());
        return true;
    }
}