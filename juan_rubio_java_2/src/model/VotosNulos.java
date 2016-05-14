package model;

public class VotosNulos {
    private String comentario;
    private int cantVoto;

    public VotosNulos(String comentario, int cantVoto) {
        this.comentario = comentario;
        this.cantVoto = cantVoto;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getCantVoto() {
        return cantVoto;
    }

    public void setCantVoto(int cantVoto) {
        this.cantVoto = cantVoto;
    }
}
