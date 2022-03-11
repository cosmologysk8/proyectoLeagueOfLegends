package modelos;

import java.util.Objects;

public class Item {

    private int id;
    private String nombre;
    private Double aumentoDayo;
    private Double aumentoDefensa;
    private Double aumentoSalud;
    private Double aumentoMana;

    public Item(int id, String nombre, Double aumentoDayo, Double aumentoDefensa, Double aumentoSalud, Double aumentoMana) {
        this.id = id;
        this.nombre = nombre;
        this.aumentoDayo = aumentoDayo;
        this.aumentoDefensa = aumentoDefensa;
        this.aumentoSalud = aumentoSalud;
        this.aumentoMana = aumentoMana;
    }


    public Item (Item i) {
        this.id = i.getId();
        this.nombre = i.getNombre();
        this.aumentoDayo = i.getAumentoDayo();
        this.aumentoDefensa = i.getAumentoDefensa();
        this.aumentoSalud = i.getAumentoSalud();
        this.aumentoMana = i.getAumentoMana();
    }



    public Item() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getAumentoDayo() {
        return aumentoDayo;
    }

    public void setAumentoDayo(Double aumentoDayo) {
        this.aumentoDayo = aumentoDayo;
    }

    public Double getAumentoDefensa() {
        return aumentoDefensa;
    }

    public void setAumentoDefensa(Double aumentoDefensa) {
        this.aumentoDefensa = aumentoDefensa;
    }

    public Double getAumentoSalud() {
        return aumentoSalud;
    }

    public void setAumentoSalud(Double aumentoSalud) {
        this.aumentoSalud = aumentoSalud;
    }

    public Double getAumentoMana() {
        return aumentoMana;
    }

    public void setAumentoMana(Double aumentoMana) {
        this.aumentoMana = aumentoMana;
    }

    @Override
    public String
    toString() {
        return "Item{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", aumentoDayo=" + aumentoDayo +
                ", aumentoDefensa=" + aumentoDefensa +
                ", aumentoSalud=" + aumentoSalud +
                ", aumentoMana=" + aumentoMana +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id && Objects.equals(nombre, item.nombre) && Objects.equals(aumentoDayo, item.aumentoDayo) && Objects.equals(aumentoDefensa, item.aumentoDefensa) && Objects.equals(aumentoSalud, item.aumentoSalud) && Objects.equals(aumentoMana, item.aumentoMana);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, aumentoDayo, aumentoDefensa, aumentoSalud, aumentoMana);
    }
}
