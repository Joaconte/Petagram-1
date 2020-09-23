package jcg.petagram;

public class Mascota {

    public String nombre;
    public int foto;
    public int cantidadDeMeGusta;

    public Mascota(String nombre, int foto, int cantidadDeMeGusta) {
        this.nombre = nombre;
        this.foto = foto;
        this.cantidadDeMeGusta = cantidadDeMeGusta;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFoto() {
        return foto;
    }

    public int getCantidadDeMeGusta() {
        return cantidadDeMeGusta;
    }
}
