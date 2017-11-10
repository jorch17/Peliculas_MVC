package models;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ModelClientes {
    
    private Connection conexion;
    private PreparedStatement ps;
    private ResultSet rs;
    private Statement st;
    private String sql;
    
    private int id_cliente;
    private String nombre;
    private String telefono;
    private String email;
    private String direccion;


    public int getId_cliente() {
        return id_cliente;
    }
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
            setId_cliente(rs.getInt("id_cliente"));
            setNombre(rs.getString("nombre"));
            setTelefono(rs.getString("telefono"));
            setEmail(rs.getString("email"));   
            setDireccion(rs.getString("direccion")); 
            System.out.println("llenando todos los campos personas ");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error 102 llenado de valores "+ex.getMessage());
        }
    }//termina llenado de valores
    
    public void moverPrimero(){
        try{
            rs.first();
            llenarValores();
            System.out.println("boton activado mover primero cliente ");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error 103 mover Primer value "+ex.getMessage());
        }
    }//mover primero
    
    public void moverUltimo(){
        try{
            rs.last();
            llenarValores();
            System.out.println("boton activado mover ultimo cliente ");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error 104 mover ultimo value "+ex.getMessage());
        }
    }//mover ultimo
    
    public void moverSiguiente(){
        try{
            if(rs.isLast() == false){
                rs.next();
                llenarValores();
                System.out.println("boton activado mover siguiente cliente ");
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
                System.out.println("boton activado mover anterior cliente ");
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error 106 mover anterior value "+ex.getMessage());
        }
    }//mover anterior
    
    public void seleccionarTodo(){
        try{
            sql="Select * from clientes;";
            ps=conexion.prepareStatement(sql);
            rs=ps.executeQuery();
            moverPrimero();
            System.out.println("seleccionando todo personas ");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error 107 seleccionar todo "+ex.getMessage());
        }
    }// seleccionar todo
    
    public void insertar(/*String nombre,String telefono,String email,String direccion*/){
        try{
            sql="INSERT into clientes(nombre,telefono,email,direccion) values(?,?,?,?);";
            ps=conexion.prepareStatement(sql);
            ps.setString(1,nombre);
            ps.setString(2,telefono);
            ps.setString(3,email);
            ps.setString(4,direccion);
            ps.executeUpdate();
            seleccionarTodo();
            moverPrimero();
            System.out.println("insertando datos cliente ");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error 108 insertar datos "+ex.getMessage());
        }
    }// insertando datos
    
    public void eliminar(/*int id_cliente*/){
        try{
            sql="DELETE FROM clientes WHERE id_cliente= ?;";
            ps=conexion.prepareStatement(sql);
            ps.setInt(1,id_cliente);
            ps.executeUpdate();
            seleccionarTodo();
            moverPrimero();
            System.out.println("dato borrado clientes ");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error 109 Borrar datos "+ ex.getMessage());
        }
    }//borrar datos
    
    public void actualizar(/*String nombre,String telefono,String email,String direccion,int id_cliente*/){
        try{
            sql="UPDATE clientes SET nombre=?,telefono=?, email=?, direccion=? WHERE id_cliente=?;";
            ps=conexion.prepareStatement(sql);
            ps.setString(1,nombre);
            ps.setString(2,telefono);
            ps.setString(3,email);
            ps.setString(4,direccion);
            ps.setInt(5,id_cliente);
            ps.executeUpdate();
            seleccionarTodo();
            moverPrimero();
            System.out.println("datos actualizados clientes ");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error 110 Actualizar datos "+ ex.getMessage());
        }
    }//actualizar datos
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
