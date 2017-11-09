package models;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ModelRenta {
    
    private Connection conexion;
    private PreparedStatement ps;
    private ResultSet rs;
    private Statement st;
    private String sql;
    
    private int id_renta;
    private int id_cliente;
    private int id_pelicula;
    private String formato;
    private int costo_dia;
    private int dias;
    private String total_renta;

    public int getId_renta() {
        return id_renta;
    }
    public void setId_renta(int id_renta) {
        this.id_renta = id_renta;
    }

    public int getId_cliente() {
        return id_cliente;
    }
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_pelicula() {
        return id_pelicula;
    }
    public void setId_pelicula(int id_pelicula) {
        this.id_pelicula = id_pelicula;
    }
    
    public String getFormato() {
        return formato;
    }
    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getCosto_dia() {
        return costo_dia;
    }
    public void setCosto_dia(int costo_dia) {
        this.costo_dia = costo_dia;
    }

    public int getDias() {
        return dias;
    }
    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getTotal_renta() {
        return total_renta;
    }

    public void setTotal_renta(String total_renta) {
        this.total_renta = total_renta;
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
            setId_renta(rs.getInt("id_renta"));
            setId_cliente(rs.getInt("id_cliente"));
            setId_pelicula(rs.getInt("id_pelicula"));            
            setFormato(rs.getString("formato"));
            setCosto_dia(rs.getInt("costo_dia"));   
            setDias(rs.getInt("dias")); 
            setTotal_renta(rs.getString("total_renta")); 
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
            sql="Select * from renta;";
            ps=conexion.prepareStatement(sql);
            rs=ps.executeQuery();
            moverPrimero();
            System.out.println("seleccionando todo peliculas ");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error 107 seleccionar todo "+ex.getMessage());
        }
    }// seleccionar todo
    
    public void insertar(int id_cliente,int id_pelicula,String formato,int dias,int costo_dia,String total_renta){
        try{seleccionarTodo();
            sql="INSERT into renta(id_cliente,id_pelicula,formato,dias,costo_dia,total_renta) values(?,?,?,?,?,?);";
            ps=conexion.prepareStatement(sql);
            ps.setInt(1,id_cliente);
            ps.setInt(2,id_pelicula);
            ps.setString(3,formato);
            ps.setInt(4,costo_dia);
            ps.setInt(5, dias);
            ps.setString(6,total_renta);
            ps.executeUpdate();
            seleccionarTodo();
            moverPrimero();
            System.out.println("insertando datos peliculas ");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error 108 insertar datos "+ex.getMessage());
        }
    }// insertando datos
    
    public void eliminar(int id_renta){
        try{
            sql="DELETE FROM renta WHERE id_renta= ?;";
            ps=conexion.prepareStatement(sql);
            ps.setInt(1,id_renta);
            ps.executeUpdate();
            seleccionarTodo();
            moverPrimero();
            System.out.println("dato borrado peliculas ");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error 109 Borrar datos "+ ex.getMessage());
        }
    }//borrar datos
    
    
}
