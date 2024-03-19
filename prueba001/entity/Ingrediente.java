package entity;

public class Ingrediente {
    public String nombre;
    public int cantidad;

    public Ingrediente (String nombre, int cantidad){
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String toString(){
        return "Ingrediente: " + nombre + " Cantidad: " + cantidad;
    }
}