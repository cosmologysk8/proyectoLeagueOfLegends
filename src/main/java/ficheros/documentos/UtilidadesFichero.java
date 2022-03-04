package ficheros.documentos;

import com.opencsv.CSVReader;
import modelos.*;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class UtilidadesFichero {

    public UtilidadesFichero() {
    }

    public static final char SEPARATOR=',';

    public static List<Personaje> leerPersonajes() throws IOException {


        List<Personaje> personajes = new ArrayList<>();
        CSVReader reader = null;

        try {

            reader = new CSVReader(new FileReader("C:\\Users\\daw20\\Desktop\\programacion\\JAVA\\proyectoLeagueOfLegends\\src\\main\\java\\ficheros\\documentos\\habilidades.csv"), SEPARATOR);
            String[] nextLine= null ;
            int count = 0;

            while ((nextLine = reader.readNext()) != null){

                if (count > 0){
                    String[] valores = nextLine;
                    Personaje h = new Personaje();
                    h.setId(Integer.parseInt(valores[0]));
                    h.setNombre(valores[1]);
                    h.setFechaCreacion(LocalDate.parse(valores[2], DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                    h.setAtaque(Double.valueOf(valores[3]));
                    h.setDefensaBase(Double.valueOf(valores[4]));
                    h.setVidaBase(Double.valueOf(valores[5]));
                    h.setManaBase(Double.valueOf(valores[6]));
                    h.setRegion(Region.valueOf(valores[7]));
                    h.setNivel(1);
                    h.setAtaque(h.getAtaqueBase());
                    h.setDefensa(h.getDefensaBase());
                    h.setVida(h.getVidaBase());
                    h.setMana(h.getManaBase());
                    personajes.add(h);
                }
                count ++;
            }

        } catch (Exception e) {
            throw e;
        }

        reader.close();
        return personajes;
    }
    public List<Personaje> leerYAprenderHabilidades() throws IOException {

        CSVReader reader = null;

        List<Personaje> listaper;
        try {

            listaper = leerPersonajes();
            List<Habilidad> listahab = new ArrayList<>();

            reader = new CSVReader(new FileReader("../documentos/habilidades.csv"), SEPARATOR);
            String[] nextLine = null;
            int count = 0;

            if (count > 0) {
                String[] valores = nextLine;
                Habilidad h = new Habilidad();
                h.setId(Integer.parseInt(valores[0]));
                h.setNombre(valores[2]);
                h.setDayoBase(Double.valueOf(valores[3]));
                h.setCosteMana(Double.valueOf(valores[4]));
                h.setTipohabilidad(TipoHabilidad.valueOf(valores[5]));
                for (Personaje p : listaper) {
                    if (p.getId() == Integer.parseInt(valores[1])) {
                        p.getHabilidades().add(h);
                    }
                }

            }
            count++;

        } catch (Exception e) {
            throw e;
        }

        reader.close();

        return listaper;

    }

    public List<Item> leerItems() throws IOException {

        List<Item> item = new ArrayList<>();

        CSVReader reader = null;

        try{
            reader = new CSVReader(new FileReader("../documentos/items.csv"),SEPARATOR);
            String[] nextLine = null;
            int count = 0;

            while ((nextLine = reader.readNext()) != null) {

                if (count > 0) {
                    String[] valores = nextLine;
                    Item i = new Item();
                    i.setId(Integer.parseInt(valores[0]));
                    i.setNombre(valores[1]);
                    i.setAumentoDayo(Double.valueOf(valores[2]));
                    i.setAumentoDefensa(Double.valueOf(valores[3]));
                    i.setAumentoSalud(Double.valueOf(valores[4]));
                    i.setAumentoMana(Double.valueOf(valores[5]));
                    item.add(i);
                }
                count++;
            }

        } catch (Exception e){
            throw e;
        }

        reader.close();

        return item;
    }
}
