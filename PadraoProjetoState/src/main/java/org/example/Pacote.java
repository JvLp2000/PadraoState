package org.example;

public class Pacote {

    private String codigo;
    private PacoteEstado estado;

    public Pacote(String codigo) {
        this.codigo = codigo;
        this.estado = PacoteEstadoEmTransporte.getInstance(); // Estado inicial
    }

    public void setEstado(PacoteEstado estado) {
        this.estado = estado;
    }

    public boolean enviar() {
        return estado.enviar(this);
    }

    public boolean entregar() {
        return estado.entregar(this);
    }

    public boolean aguardarRetirada() {
        return estado.aguardarRetirada(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}