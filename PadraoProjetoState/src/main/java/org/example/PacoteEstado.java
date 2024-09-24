package org.example;
public abstract class PacoteEstado {

    public abstract String getEstado();

    public boolean enviar(Pacote pacote) {
        return false;
    }

    public boolean entregar(Pacote pacote) {
        return false;
    }

    public boolean aguardarRetirada(Pacote pacote) {
        return false;
    }

    public boolean cancelar(Pacote pacote) {
        return false;
    }
}
