package utilidades;
import modelos.Personaje;
import modelos.Region;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UtilidadesPersonaje {

    public Integer levelUp(Personaje personaje){

        personaje.setNivel(personaje.getNivel()+ 1);
        personaje.setDefensa(personaje.getDefensaBase() + personaje.getEscabilidad().getIncrementoDefensaNivel() * personaje.getNivel() );
        personaje.setAtaque(personaje.getAtaqueBase() + personaje.getEscabilidad().getIncrementoDayoNivel() * personaje.getNivel() );
        personaje.setMana(personaje.getManaBase() + personaje.getEscabilidad().getIncrementoManaNivel() * personaje.getNivel() );
        personaje.setVida(personaje.getVidaBase() + personaje.getEscabilidad().getIncrementoSaludNivel() * personaje.getNivel());

        return personaje;
    }

    public Map<Region, List<Personaje>> getPersonajesPorRegion(List<Personaje> personajes){

        Map<Region, List<Personaje>> personajeRegion = personajes.stream().collect(Collectors.groupingBy(p -> p.getRegion()));

        return personajeRegion;
    }


    public Personaje getMasPoderoso(List<Personaje> personaje){

        Personaje personaje_poderoso = null;
        double media_mas_poderoso = 0.0;

        for (Personaje per : personaje){
            while (per.getNivel() <= 18){
                per.setNivel(levelUp(per));
            }
            if (per.getNivel() > 18){
                per.setNivel(1);
                per.setDefensa(per.getDefensaBase());
                per.setVida(per.getVidaBase());
                per.setMana(per.getManaBase());
                per.setAtaque(per.getAtaqueBase());
            }
            while (per.getNivel() != 18){
                per.setNivel(levelUp(per));
            }
        }

        for (Personaje p : personaje){
            double media = p.getAtaque() + p.getVida() + p.getMana() + p.getDefensa();
            if (media > media_mas_poderoso){
                media = media_mas_poderoso;
                personaje_poderoso = p;
            }
        }

        return personaje_poderoso;
    }

    public Map<Region, List<Personaje>>getMasPoderosoPorRegion(List<Personaje> personajes){

        Map<Region, List<Personaje>> mas_fuerte_region = new HashMap<>();

        for (Personaje p : Region.values()){

        }
    }


}
