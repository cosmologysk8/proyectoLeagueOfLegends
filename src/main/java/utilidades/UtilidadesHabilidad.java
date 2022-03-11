package utilidades;

import modelos.Habilidad;
import modelos.Item;
import modelos.Personaje;

public class UtilidadesHabilidad {

    public void golpearConHabilidad(Personaje emisor, Personaje receptor, Habilidad habilidadEmisor){

        /* Ejercicio 1 **/
        utilidades.UtilidadesPersonaje.Nivel18(emisor);
        utilidades.UtilidadesPersonaje.Nivel18(receptor);

        /* Ejercicio 2 **/
        if ( emisor.getEquipamiento().size() > 0 ){
            for (Item i : emisor.getEquipamiento()){
                emisor.setAtaque(emisor.getAtaque() + i.getAumentoDayo());
                emisor.setDefensa(emisor.getDefensa() + i.getAumentoDefensa());
                emisor.setVida(emisor.getVida() + i.getAumentoSalud());
                emisor.setMana(emisor.getMana() + i.getAumentoSalud());
            }
        }

        if ( receptor.getEquipamiento().size() > 0 ){
            for (Item i : receptor.getEquipamiento()){
                receptor.setAtaque(receptor.getAtaque() + i.getAumentoDayo());
                receptor.setDefensa(receptor.getDefensa() + i.getAumentoDefensa());
                receptor.setVida(receptor.getVida() + i.getAumentoSalud());
                receptor.setMana(receptor.getMana() + i.getAumentoSalud());
            }
        }

        /* Ejercicio 3 **/
        Double dayo_total = habilidadEmisor.getDayoBase() + (0.2 * emisor.getAtaque()) - (0.1 * receptor.getDefensa());

        emisor.setMana(emisor.getMana() - habilidadEmisor.getCosteMana()) ;
        receptor.setVida(receptor.getVida() - dayo_total);
    }

}
