package models;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ModelPeliculas {

    
    private Connection conexion;
    private PreparedStatement ps;
    private ResultSet rs;
    private Statement st;
    private String sql;
    
    private int id_pelicula;
    private String nombre;
    private String formato;
    private String duracion;
    private String descripcion;

    public int getId_pelicula() {
        return id_pelicula;
    }
    public void setId_pelicula(int id_pelicula) {
        this.id_pelicula = id_pelicula;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFormato() {
        return formato;
    }
    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getDuracion() {
        return duracion;
    }
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void Conectar(){ //conectar con la base de datos
        try{
            conexion=DriverManager.getConnection("jdbc:mysql://localhost/peliculas_mvc","root","151617");                     
            st=conexion.createStatement(); 
            seleccionarTodo();
            //rs=st.executeQuery("Select * from personas");
            System.out.println("Conexion correcta a la BASE DE DATOS peliculas ");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error 101 conexion a BD  "+ex.getMessage());
        }
    }// termina conectar
    
    public void llenarValores(){
        try{
            setId_pelicula(rs.getInt("id_pelicula"));
            setNombre(rs.getString("nombre"));
            setFormato(rs.getString("formato"));
            setDuracion(rs.getString("duracion"));   
            setDescripcion(rs.getString("descripcion")); 
            System.out.println("llenando todos los campos peliculas ");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error 102 llenado de valores "+ex.getMessage());
        }
    }//termina llenado de valores
    
    public void moverPrimero(){
        try{
            rs.first();
            llenarValores();
            System.out.println("boton activado mover primero peliculas ");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error 103 mover Primer value "+ex.getMessage());
        }
    }//mover primero
    
    public void moverUltimo(){
        try{
            rs.last();
            llenarValores();
            System.out.println("boton activado mover ultimo peliculas ");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error 104 mover ultimo value "+ex.getMessage());
        }
    }//mover ultimo
    
    public void moverSiguiente(){
        try{
            if(rs.isLast() == false){
                rs.next();
                llenarValores();
                System.out.println("boton activado mover siguiente peliculas ");
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error 105 mover siguiente value "+ex.getMessage());
        }
    }//mover siguente
    
    public void moverAnterior(){
        try{
            if(rs.isFirst() == false){
                rs.previous();
                llenarValores();
                System.out.println("boton activado mover anterior peliculas ");
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error 106 mover anterior value "+ex.getMessage());
        }
    }//mover anterior
    
    public void seleccionarTodo(){
        try{
            sql="Select * from peliculas;";
            ps=conexion.prepareStatement(sql);
            rs=ps.executeQuery();
            moverPrimero();
            System.out.println("seleccionando todo peliculas ");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error 107 seleccionar todo "+ex.getMessage());
        }
    }// seleccionar todo
    
    public void insertar(/*String nombre,String formato,String duracion,String descripcion*/){
        try{
            sql="INSERT into peliculas(nombre,formato,duracion,descripcion) values(?,?,?,?);";
            ps=conexion.prepareStatement(sql);
            ps.setString(1,nombre);
            ps.setString(2,formato);
            ps.setString(3,duracion);
            ps.setString(4,descripcion);
            ps.executeUpdate();
            seleccionarTodo();
            moverPrimero();
            System.out.println("insertando datos peliculas ");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error 108 insertar datos "+ex.getMessage());
        }
    }// insertando datos
    
    public void eliminar(/*int id_cliente*/){
        try{
            sql="DELETE FROM peliculas WHERE id_pelicula= ?;";
            ps=conexion.prepareStatement(sql);
            ps.setInt(1,id_pelicula);
            ps.executeUpdate();
            seleccionarTodo();
            moverPrimero();
            System.out.println("dato borrado peliculas ");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error 109 Borrar datos "+ ex.getMessage());
        }
    }//borrar datos
    
    public void actualizar(/*String nombre,String formato,String duracion,String descripcion,int id_pelicula*/){
        try{
            sql="UPDATE peliculas SET nombre=?,formato=?, duracion=?, descripcion=? WHERE id_pelicula=?;";
            ps=conexion.prepareStatement(sql);
            ps.setString(1,nombre);
            ps.setString(2,formato);
            ps.setString(3,duracion);
            ps.setString(4,descripcion);
            ps.setInt(5,id_pelicula);
            ps.executeUpdate();
            seleccionarTodo();
            moverPrimero();
            System.out.println("datos actualizados peliculas ");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error 110 Actualizar datos "+ ex.getMessage());
        }
    }//actualizar datos
    
    
}
