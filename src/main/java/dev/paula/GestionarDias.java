package dev.paula;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class GestionarDias {

    private List<String> dias;

    public GestionarDias() {
        dias = new ArrayList<>();
    }

    public void crearDiasSemana() {
        dias.clear();
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miercoles");
        dias.add("Jueves");
        dias.add("Viernes");
        dias.add("Sabado");
        dias.add("Domingo");
    }

    public List<String> getDias(){
        return new ArrayList<>(dias);
    }

    public int getLargo(){
        return dias.size();
    }

    public boolean eliminarDia(String dia){
        return dias.remove(dia);
    }

    
}
