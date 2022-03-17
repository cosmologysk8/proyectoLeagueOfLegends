package ficheros.documentos;

import modelos.Item;
import modelos.Personaje;

public class UtilidadesItem {

    public static void equiparItem(Personaje personaje, Item item){

        personaje.getEquipamiento().add(item);

        personaje.setAtaque(personaje.getAtaque() + item.getAumentoDayo());
        personaje.setMana(personaje.getMana() + item.getAumentoMana());
        personaje.setVida(personaje.getVida() + item.getAumentoSalud());
        personaje.setDefensa(personaje.getDefensa() + item.getAumentoSalud());

    }

}
