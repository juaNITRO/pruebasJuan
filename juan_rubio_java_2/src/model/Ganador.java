package model;

public class Ganador {
    private String nombre;
    private int devolucionServel;
    private int cantidadDeVotos;

    public Ganador(String nombre, int devolucionServel, int cantidadDeVotos) {
        this.nombre = nombre;
        this.cantidadDeVotos = cantidadDeVotos;
        this.devolucionServel = devolucionServel;
    }
    

    public int getDevolucionServel() {
        return devolucionServel;
    }

    public void setDevolucionServel(int devolucionServel) {
        this.devolucionServel = devolucionServel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDeVotos() {
        return cantidadDeVotos;
    }

    public void setCantidadDeVotos(int cantidadDeVotos) {
        this.cantidadDeVotos = cantidadDeVotos;
    }
}

