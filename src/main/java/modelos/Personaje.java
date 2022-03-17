package modelos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Personaje {

    private int id;
    private String nombre;
    private String descripcion;
    private LocalDate fechaCreacion;
    private Integer nivel;
    private Double vidaBase;
    private Double manaBase;
    private Double defensaBase;
    private Double defensa;
    private Double ataqueBase;
    private Double ataque;
    private Double vida;
    private Double mana;
    private Region region;
    private List<Habilidad> habilidades = new ArrayList<>();
    private List<Item> equipamiento;
    private Escalabilidad escabilidad;

    public Personaje(int id, String nombre, LocalDate fechaCreacion, String descripcion, Integer nivel, Double vida, Double ataque, Double mana, Double defensa, Double vidaBase, Double ataqueBase, Double manaBase, Double defensaBase, Region region, List<Habilidad> habilidades, List<Item> equipamiento, Escalabilidad escabilidad) {
        this.id = id;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.descripcion = descripcion;
        this.nivel = nivel;
        this.vidaBase = vidaBase;
        this.manaBase = manaBase;
        this.defensaBase = defensaBase;
        this.defensa = defensa;
        this.ataqueBase = ataqueBase;
        this.ataque = ataque;
        this.vida = vida;
        this.mana = mana;
        this.region = region;
        this.habilidades = habilidades;
        this.equipamiento = equipamiento;
        this.escabilidad = escabilidad;
    }

    public Personaje() {
        this.habilidades = new ArrayList<>();
    }

    public Personaje (Personaje p) {
        this.id = p.getId();
        this.nombre = p.getNombre();
        this.fechaCreacion = p.getFechaCreacion();
        this.nivel = p.getNivel();
        this.vidaBase = p.getVidaBase();
        this.manaBase = p.getManaBase();
        this.defensaBase = p.getDefensaBase();
        this.defensa = p.getDefensa();
        this.ataqueBase = p.getAtaqueBase();
        this.ataque = p.getAtaque();
        this.vida = p.getVida();
        this.mana = p.getMana();
        this.region = p.getRegion();
        this.habilidades = p.getHabilidades();
        this.equipamiento = p.getEquipamiento();
        this.escabilidad = p.getEscabilidad();
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

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Double getVidaBase() {
        return vidaBase;
    }

    public void setVidaBase(Double vidaBase) {
        this.vidaBase = vidaBase;
    }

    public Double getManaBase() {
        return manaBase;
    }

    public void setManaBase(Double manaBase) {
        this.manaBase = manaBase;
    }

    public Double getDefensaBase() {
        return defensaBase;
    }

    public void setDefensaBase(Double defensaBase) {
        this.defensaBase = defensaBase;
    }

    public Double getDefensa() {
        return defensa;
    }

    public void setDefensa(Double defensa) {
        this.defensa = defensa;
    }

    public Double getAtaqueBase() {
        return ataqueBase;
    }

    public void setAtaqueBase(Double ataqueBase) {
        this.ataqueBase = ataqueBase;
    }

    public Double getAtaque() {
        return ataque;
    }

    public void setAtaque(Double ataque) {
        this.ataque = ataque;
    }

    public Double getVida() {
        return vida;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }

    public Double getMana() {
        return mana;
    }

    public void setMana(Double mana) {
        this.mana = mana;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public List<Habilidad> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidad> habilidades) {
        this.habilidades = habilidades;
    }

    public List<Item> getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(List<Item> equipamiento) {
        this.equipamiento = equipamiento;
    }

    public Escalabilidad getEscabilidad() {
        return escabilidad;
    }

    public void setEscabilidad(Escalabilidad escabilidad) {
        this.escabilidad = escabilidad;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", nivel=" + nivel +
                ", vidaBase=" + vidaBase +
                ", manaBase=" + manaBase +
                ", defensaBase=" + defensaBase +
                ", defensa=" + defensa +
                ", ataqueBase=" + ataqueBase +
                ", ataque=" + ataque +
                ", vida=" + vida +
                ", mana=" + mana +
                ", region=" + region +
                ", habilidades=" + habilidades +
                ", equipamiento=" + equipamiento +
                ", escabilidad=" + escabilidad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return id == personaje.id && Objects.equals(nombre, personaje.nombre) && Objects.equals(fechaCreacion, personaje.fechaCreacion) && Objects.equals(nivel, personaje.nivel) && Objects.equals(vidaBase, personaje.vidaBase) && Objects.equals(manaBase, personaje.manaBase) && Objects.equals(defensaBase, personaje.defensaBase) && Objects.equals(defensa, personaje.defensa) && Objects.equals(ataqueBase, personaje.ataqueBase) && Objects.equals(ataque, personaje.ataque) && Objects.equals(vida, personaje.vida) && Objects.equals(mana, personaje.mana) && region == personaje.region && Objects.equals(habilidades, personaje.habilidades) && Objects.equals(equipamiento, personaje.equipamiento) && Objects.equals(escabilidad, personaje.escabilidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, fechaCreacion, nivel, vidaBase, manaBase, defensaBase, defensa, ataqueBase, ataque, vida, mana, region, habilidades, equipamiento, escabilidad);
    }
}
