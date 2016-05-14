package model;

public class Candidatos {
    private String nombreCandidato;
    private int cantVotos;

    public Candidatos(String nombreCandidato, int cantVotos) {
        this.nombreCandidato = nombreCandidato;
        this.cantVotos = cantVotos;
    }

    public String getNombreCandidato() {
        return nombreCandidato;
    }

    public void setNombreCandidato(String nombreCandidato) {
        this.nombreCandidato = nombreCandidato;
    }

    public int getCantVotos() {
        return cantVotos;
    }

    public void setCantVotos(int cantVotos) {
        this.cantVotos = cantVotos;
    }
    
    
}
