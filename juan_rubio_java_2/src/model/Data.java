package model;

import bd.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Data {
    private final Conexion c;
    private ResultSet rs;

    public Data() throws SQLException {
        c = new Conexion("localhost", "votaciones", "root", "123456");
    }
    
    public void agregarVotantes(Votantes v) throws SQLException{
        String query = "insert into votantes values(null,'"+v.getRut()+"')";
        c.ejecutar(query);
    }
    
    public void agregarVotosCandidatos(Candidatos can) throws SQLException{
        String query = "insert into votosCandidatos values(null,'"+can.getNombreCandidato()+"','"+can.getCantVotos()+"')";
        c.ejecutar(query);
    }
    
    public void agregarVotos(VotosNulos vn,VotosEnBlanco vb ,int opcion) throws SQLException{
        switch(opcion){
            case 1:
                String query = "insert into votosNulos values(null,'"+vn.getComentario()+"','"+vn.getCantVoto()+"')";
            c.ejecutar(query);
                break;
            case 2:
                String query2 = "insert into votosEnBlanco values(null,'"+vb.getCantVoto()+"')";
            c.ejecutar(query2);
                break;
        }    
    }
    
    public int getCantVotos(String nombre) throws SQLException{
        int votos = 0;
        String select = "select sum(cantVotos) from votoscandidatos where nombre='"+nombre+"'";
        rs = c.ejecutarSelect(select);
        while(rs.next()){
            votos = rs.getInt("sum(cantVotos)");
        }
        return votos;
    }
    
    public int getCantVotosNulos() throws SQLException{
        int votosNulos = 0;
        String select = "select sum(cantVotosNulos) from votosnulos";
        rs = c.ejecutarSelect(select);
        while(rs.next()){
            votosNulos = rs.getInt("sum(cantVotosNulos)");
        }
        return votosNulos;
    }
    
    public int getCantVotosEnBlanco() throws SQLException{
        int votosEnBlanco = 0;
        String select = "select sum(cantVotosBlancos) from votosenblanco";
        rs = c.ejecutarSelect(select);
        while(rs.next()){
            votosEnBlanco = rs.getInt("sum(cantVotosBlancos)");
        }
        return votosEnBlanco;
    }
    
    public boolean getRut(String txtRut) throws SQLException{
        boolean haVotado = false;
        String rut = "";
        String select = "select * from votantes where rut='"+txtRut+"'";
        rs = c.ejecutarSelect(select);
        while(rs.next()){
             rut = rs.getString("rut");
        }
        if(rut.isEmpty()){
            haVotado = false;
        }else{
            haVotado = true;
        }
        return haVotado;   
    }
    
    public int getCantidadTotalDeVotos() throws SQLException{
        int totalVotos = 0;
        String select = "select count(rut) from votantes;";
        rs = c.ejecutarSelect(select);
        while(rs.next()){
            totalVotos = rs.getInt("count(rut)");
        }
        return totalVotos;
    }
    
    public String getPorcentajes(String nombre) throws SQLException {
        String valores = "";
        try {
            if ("Nulos".equals(nombre)) {
                int votos = getCantVotosNulos();
                float porcentaje = votos * 100 / getCantidadTotalDeVotos();
                valores = String.valueOf(porcentaje + "% " + "(" + getCantVotosNulos() + ")");
            }
            if ("Blanco".equals(nombre)) {
                int votos = getCantVotosEnBlanco();
                float porcentaje = votos * 100 / getCantidadTotalDeVotos();
                valores = String.valueOf(porcentaje + "% " + "(" + getCantVotosEnBlanco() + ")");
            }
            if (!"Nulos".equals(nombre) && !"Blanco".equals(nombre)) {
                int votos = getCantVotos(nombre);
                float porcentaje = votos * 100 / getCantidadTotalDeVotos();
                valores = String.valueOf(porcentaje + "% " + "(" + getCantVotos(nombre) + ")");
            }
        } catch (ArithmeticException e) {
            valores = "0% (0 votos)";
        }
        return valores;
    }
    
    public void cerrarVotaciones() throws SQLException{
        String query = "update cerrarVotacion set estaCerrada='si' where id=1;";
        c.ejecutar(query);
    } 
    
    public String revisarEstadoVotaciones() throws SQLException{
        String votacion = ""; 
        String select = "select estaCerrada from cerrarVotacion";
        rs = c.ejecutarSelect(select);
        while(rs.next()){
            votacion = rs.getString("estaCerrada");
        }
        return votacion;
    }
    
    public List<Ganador> getGanador() throws SQLException{
        List<Ganador> listaGanadores = new ArrayList();
        String nombre;
        int cantVotos, devolucion;
        String select = "select nombre, sum(cantVotos) from votoscandidatos group by (nombre) order by sum(cantVotos) desc;";
        rs = c.ejecutarSelect(select);
        while(rs.next()){
            nombre = rs.getString("nombre");
            cantVotos = rs.getInt("sum(cantVotos)");
            devolucion = rs.getInt("sum(cantVotos)")*715;
            listaGanadores.add(new Ganador(nombre, devolucion, cantVotos));
        }
        return listaGanadores;
    }
    
    public List<String> getComentarios() throws SQLException{
        List<String> comentarios = new ArrayList();
        String comentario = "";
        String select = "select comentario from votosnulos";
        rs = c.ejecutarSelect(select);
        while(rs.next()){
            comentario = rs.getString("comentario");
            comentarios.add(comentario);
        }
        return comentarios;
    }
    
    public int getNumero(){
        int numero = 2;
        return numero;
        /*prueba cambios*/
    }
    
    public String joel(){
        return null;
    }
    
    public void adolfo(){
        
    }
    
    public void pato(){
    
    }
}