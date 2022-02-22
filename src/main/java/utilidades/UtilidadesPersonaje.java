package utilidades;
import modelos.Personaje;
import modelos.Region;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UtilidadesPersonaje {

    public Personaje levelUp(Personaje personaje){

        personaje.setDefensaBase(personaje.getDefensaBase() + personaje.getEscabilidad().getIncrementoDefensaNivel() * personaje.getNivel() + 1 );
        personaje.setAtaqueBase(personaje.getAtaqueBase() + personaje.getEscabilidad().getIncrementoDayoNivel() * personaje.getNivel() + 1 );
        personaje.setManaBase(personaje.getManaBase() + personaje.getEscabilidad().getIncrementoManaNivel() * personaje.getNivel() + 1 );
        personaje.setVidaBase(personaje.getVidaBase() + personaje.getEscabilidad().getIncrementoSaludNivel() * personaje.getNivel() + 1);

        return personaje;
    }

    public Map<Region, List<Personaje>> getPersonajesPorRegion(List<Personaje> personajes){

        Map<Region, List<Personaje>> personajeRegion = personajes.stream().collect(Collectors.groupingBy(p -> p.getRegion()));

        return personajeRegion;
    }

    public Personaje getMasPoderoso(List<Personaje> personaje){

        Personaje personaje_poderoso = null;

        personaje_poderoso.setNivel(17) += levelUp() ;

        for (Personaje per : personaje){
            personaje_poderoso.
        }

        return personaje_poderoso;

    }

}
