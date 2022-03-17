package utilidades;
import modelos.Personaje;
import modelos.Region;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UtilidadesPersonaje {

    public static Personaje levelUp(Personaje personaje) {

        personaje.setNivel(personaje.getNivel() + 1);
        personaje.setDefensa(personaje.getDefensaBase() + personaje.getEscabilidad().getIncrementoDefensaNivel() * personaje.getNivel());
        personaje.setAtaque(personaje.getAtaqueBase() + personaje.getEscabilidad().getIncrementoDayoNivel() * personaje.getNivel());
        personaje.setMana(personaje.getManaBase() + personaje.getEscabilidad().getIncrementoManaNivel() * personaje.getNivel());
        personaje.setVida(personaje.getVidaBase() + personaje.getEscabilidad().getIncrementoSaludNivel() * personaje.getNivel());

        return personaje;
    }

    public static Map<Region, List<Personaje>> getPersonajesPorRegion(List<Personaje> personajes) {

        Map<Region, List<Personaje>> personajeRegion = personajes.stream().collect(Collectors.groupingBy(p -> p.getRegion()));

        return personajeRegion;
    }


    public static Personaje getMasPoderoso(List<Personaje> personaje) {
        List<Personaje> pe = new ArrayList<>();
        Personaje personaje_poderoso = null;
        double media_mas_poderoso = 0.0;

        for (Personaje per : personaje) {
            if (per.getNivel() < 18) {
                while (per.getNivel() != 18) {
                    per = levelUp(per);
                }
                if (per.getNivel() > 18) {
                    per.setNivel(1);
                    per.setDefensa(per.getDefensaBase());
                    per.setVida(per.getVidaBase());
                    per.setMana(per.getManaBase());
                    per.setAtaque(per.getAtaqueBase());
                }
                if(per.getNivel() == 18){
                    pe.add(per);
                    double media = p.getAtaque() + p.getVida() + p.getMana() + p.getDefensa();i
                    if (media > media_mas_poderoso) {
                        media = media_mas_poderoso;
                        personaje_poderoso = p;
                    }
                }

            }

            for (Personaje p : pe) {


            }
        }
        return personaje_poderoso;
    }

        public static Map<Region, Personaje> getMasPoderosoPorRegion(List<Personaje> personajes) {

            Map<Region, Personaje> mas_fuerte_region = new HashMap<>();
            Map<Region, List<Personaje>> personajeregion = getPersonajesPorRegion(personajes);
            List<Personaje> listapoderoso = new ArrayList<>();

            for (List<Personaje> p : personajeregion.values()) {
                Personaje maspoderoso = getMasPoderoso(p);
                listapoderoso.add(maspoderoso);
            }

            for (Personaje p : listapoderoso) {
                mas_fuerte_region.put(p.getRegion(), p);
            }

            return mas_fuerte_region;
    }

    public static Personaje Nivel18 (Personaje p){

        if (p.getNivel() < 18) {
            while (p.getNivel() != 18) {
                p = levelUp(p);
            }
            if (p.getNivel() > 18) {
                p.setNivel(1);
                p.setDefensa(p.getDefensaBase());
                p.setVida(p.getVidaBase());
                p.setMana(p.getManaBase());
                p.setAtaque(p.getAtaqueBase());
            }
            while (p.getNivel() != 18) {
                p = levelUp(p);
            }
        }
        return p;
    }
}

