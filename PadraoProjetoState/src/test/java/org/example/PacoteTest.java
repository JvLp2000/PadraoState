package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.Test;

public class PacoteTest {

    private Pacote pacote;

    @Before
    public void setUp() {
        pacote = new Pacote("12345");
    }

    @Test
    public void deveIniciarEmTransporte() {
        assertEquals("Em Transporte", pacote.getNomeEstado());
    }

    @Test
    public void deveEntregarPacote() {
        assertTrue(pacote.entregar());
        assertEquals("Entregue", pacote.getNomeEstado());
    }

    @Test
    public void naoDeveEntregarPacoteCancelado() {
        pacote.cancelar();
        assertFalse(pacote.entregar());
        assertEquals("Cancelado", pacote.getNomeEstado());
    }

    @Test
    public void deveCancelarPacoteEmTransporte() {
        assertTrue(pacote.cancelar());
        assertEquals("Cancelado", pacote.getNomeEstado());
    }

    @Test
    public void naoDeveCancelarPacoteEntregue() {
        pacote.entregar();
        assertFalse(pacote.cancelar());
        assertEquals("Entregue", pacote.getNomeEstado());
    }

    @Test
    public void deveAguardarRetirada() {
        assertTrue(pacote.aguardarRetirada());
        assertEquals("Aguardando Retirada", pacote.getNomeEstado());
    }

    @Test
    public void deveEntregarPacoteAguardandoRetirada() {
        pacote.aguardarRetirada();
        assertTrue(pacote.entregar());
        assertEquals("Entregue", pacote.getNomeEstado());
    }

    @Test
    public void naoDeveAlterarEstadoDePacoteEntregue() {
        pacote.entregar();
        assertFalse(pacote.aguardarRetirada());
        assertFalse(pacote.cancelar());
        assertEquals("Entregue", pacote.getNomeEstado());
    }
}