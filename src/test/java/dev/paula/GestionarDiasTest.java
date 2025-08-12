package dev.paula;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class GestionarDiasTest {
    
    private GestionarDias gestor;

    @BeforeEach
    public void setUp() {
        gestor = new GestionarDias();
        gestor.crearDiasSemana();
    }

    @Test
    public void testCrearDiasSemana() {
        assertEquals(7, gestor.getLargo());
    }

    public void testGetDias(){
        List<String> dias = gestor.getDias();
        assertTrue(dias.contains("Lunes"));
        assertTrue(dias.contains("Domingo"));
    }
}


