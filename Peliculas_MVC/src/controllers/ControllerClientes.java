package controllers;

import models.ModelClientes;
import views.ViewClientes;

public class ControllerClientes {
    ModelClientes model_clientes;
    ViewClientes view_clientes;
    public ControllerClientes(ModelClientes model_clientes, ViewClientes view_clientes ){
        this.model_clientes = model_clientes;
        this.view_clientes = view_clientes;
        initView();
        view_clientes.jbtn_primero.addActionListener(event -> jbtn_moverPrimero_click());
        view_clientes.jbtn_ultimo.addActionListener(event -> jbtn_moverUltimo_click());
        view_clientes.jbtn_anterior.addActionListener(event -> jbtn_moverAnterior_click());
        view_clientes.jbtn_siguiente.addActionListener(event -> jbtn_moverSiguiente_click());
        view_clientes.jbtn_nuevo.addActionListener(event -> jbtn_nuevo_click());
        view_clientes.jbtn_insertar.addActionListener(event -> jbtn_insertar_click());
        view_clientes.jbtn_actualizar.addActionListener(event -> jbtn_actualizar_click());
        view_clientes.jbtn_eliminar.addActionListener(event -> jbtn_eliminar_click());
        
    }
    
    public void getValores(){
        view_clientes.jtf_id_cliente.setText(""+model_clientes.getId_cliente());
        view_clientes.jtf_nombre.setText(""+model_clientes.getNombre());
        view_clientes.jtf_telefono.setText(""+model_clientes.getTelefono());
        view_clientes.jtf_email.setText(""+model_clientes.getEmail());
        view_clientes.jtf_direccion.setText(""+model_clientes.getDireccion());
    }
    
    public void setValores(){
        model_clientes.setId_cliente(Integer.parseInt(view_clientes.jtf_id_cliente.getText()));
        model_clientes.setNombre(view_clientes.jtf_nombre.getText());
        model_clientes.setTelefono(view_clientes.jtf_telefono.getText());
        model_clientes.setEmail(view_clientes.jtf_email.getText());
        model_clientes.setDireccion(view_clientes.jtf_direccion.getText());
    }
    
    public void jbtn_moverPrimero_click(){
        model_clientes.moverPrimero();
        getValores();
    }//boton mover primero
    
    public void jbtn_moverUltimo_click(){
        model_clientes.moverUltimo();
        getValores();
    }//boton mover ultimo
    
    public void jbtn_moverAnterior_click(){
        model_clientes.moverAnterior();
        getValores();
    }//boton mover aterior
    
    public void jbtn_moverSiguiente_click(){
        model_clientes.moverSiguiente();
        getValores();
    }//boton mover siguiente
    
    public void jbtn_nuevo_click(){
        //view_clientes.jtf_id_cliente.setEditable(false);
        //int id = Integer.parseInt(view_clientes.jtf_id_cliente.getText());
        //id += 1;
        view_clientes.jtf_id_cliente.setText(" ");
        view_clientes.jtf_nombre.setText(" ");
        view_clientes.jtf_telefono.setText(" ");
        view_clientes.jtf_email.setText(" ");
        view_clientes.jtf_direccion.setText(" ");
    }// boton nuevo
    
    public void jbtn_insertar_click(){
        setValores();
        model_clientes.insertar(model_clientes.getNombre(),model_clientes.getTelefono(),model_clientes.getEmail(),model_clientes.getDireccion());
        getValores();
    }// boton insertar
    
    public void jbtn_actualizar_click(){
        setValores();
        model_clientes.actualizar(model_clientes.getNombre(),model_clientes.getTelefono(),model_clientes.getEmail(),model_clientes.getDireccion(),model_clientes.getId_cliente());
        getValores();
    }//boton actualizar
    
    public void jbtn_eliminar_click(){
        setValores();
        model_clientes.eliminar(model_clientes.getId_cliente());
        getValores();
    }//boton borrar
    
    public void initView(){
        model_clientes.Conectar();
        view_clientes.setVisible(true);
        model_clientes.moverPrimero();
        getValores();
    }//vista de inicio  
}
