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

    @Test
    public void testGetDias(){
        List<String> dias = gestor.getDias();
        assertTrue(dias.contains("Lunes"));
        assertTrue(dias.contains("Domingo"));
    }

    @Test
    public void testEliminarDia(){
        assertTrue(gestor.eliminarDia("Martes"));
        assertFalse(gestor.eliminarDia("Martes"));
    }

    @Test
    public void testGetDia(){
        assertEquals("Lunes", gestor.getDia(0));
        assertNull(gestor.getDia(10));
        assertNull(gestor.getDia(-1));

    }

    @Test
    public void testExisteDia(){
        assertTrue(gestor.existeDia("Viernes"));
        assertFalse(gestor.existeDia("Friday"));
    }

    @Test
    public void testOrdenarAlfabeticamente(){
        gestor.ordenarAlfabeticamente();
        List<String> dias = gestor.getDias();
        assertEquals("Domingo", dias.get(0));
    }

    @Test
    public void testVaciarLista(){
        gestor.vaciarLista();
        assertEquals(0, gestor.getLargo());
    }
}






