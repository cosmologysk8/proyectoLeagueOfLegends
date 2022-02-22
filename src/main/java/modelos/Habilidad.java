package modelos;

import java.util.Objects;

public class Habilidad {

    private int id;
    private String nombre;
    private Double DayoBase;
    private Double Dayo;
    private Double mana;
    private Double costeMana;
    private TipoHabilidad tipohabilidad;

    public Habilidad(int id, String nombre, Double DayoBase, Double Dayo, Double mana, Double costeMana, TipoHabilidad tipohabilidad) {
        this.id = id;
        this.nombre = nombre;
        this.DayoBase = DayoBase;
        this.Dayo = Dayo;
        this.mana = mana;
        this.costeMana = costeMana;
        this.tipohabilidad = tipohabilidad;
    }


    public Habilidad (Habilidad h) {
        this.id = h.getId();
        this.nombre = h.getNombre();
        this.DayoBase = h.getDayoBase();
        this.Dayo = h.getDayo();
        this.mana = h.getMana();
        this.costeMana = h.getCosteMana();
        this.tipohabilidad = h.getTipohabilidad();
    }

    public Habilidad() {
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

    public Double getDayoBase() {
        return DayoBase;
    }

    public void setDayoBase(Double DayoBase) {
        this.DayoBase = DayoBase;
    }

    public Double getDayo() {
        return Dayo;
    }

    public void setDayo(Double Dayo) {
        this.Dayo = Dayo;
    }

    public Double getMana() {
        return mana;
    }

    public void setMana(Double mana) {
        this.mana = mana;
    }

    public Double getCosteMana() {
        return costeMana;
    }

    public void setCosteMana(Double costeMana) {
        this.costeMana = costeMana;
    }

    public TipoHabilidad getTipohabilidad() {
        return tipohabilidad;
    }

    public void setTipohabilidad(TipoHabilidad tipohabilidad) {
        this.tipohabilidad = tipohabilidad;
    }

    @Override
    public String toString() {
        return "Habilidad{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", DayoBase=" + DayoBase +
                ", Dayo=" + Dayo +
                ", mana=" + mana +
                ", costeMana=" + costeMana +
                ", tipohabilidad=" + tipohabilidad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Habilidad habilidad = (Habilidad) o;
        return id == habilidad.id && Objects.equals(nombre, habilidad.nombre) && Objects.equals(DayoBase, habilidad.DayoBase) && Objects.equals(Dayo, habilidad.Dayo) && Objects.equals(mana, habilidad.mana) && Objects.equals(costeMana, habilidad.costeMana) && tipohabilidad == habilidad.tipohabilidad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, DayoBase, Dayo, mana, costeMana, tipohabilidad);
    }
}
