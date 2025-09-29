package marejadas;

import java.util.*;

public class AnalizadorMarejadas {
    private List<Dato> datos;

    public AnalizadorMarejadas(List<Dato> lista) {
        this.datos = new ArrayList<>();
        for(Dato d: lista){
            if(d instanceof Dato){
                this.datos.add((Dato) d);
            }
        }
    }
    public void olaMasAlta(){
        if(datos.isEmpty()) return;
        
        Dato max = datos.get(0);
        for(Dato d : datos){
            if(d.getHm0() > max)
        }
    }
    
    
}
