package controllers;

import models.ModelRenta;
import views.ViewRenta;

public class ControllerRenta {
    ModelRenta model_renta;
    ViewRenta  view_renta;
    
    public ControllerRenta(ModelRenta model_renta,ViewRenta  view_renta){
        this.model_renta = model_renta;
        this.view_renta = view_renta;
        initView();
        view_renta.jbtn_primero.addActionListener(event -> jbtn_moverPrimero_click());
        view_renta.jbtn_ultimo.addActionListener(event -> jbtn_moverUltimo_click());
        view_renta.jbtn_anterior.addActionListener(event -> jbtn_moverAnterior_click());
        view_renta.jbtn_siguiente.addActionListener(event -> jbtn_moverSiguiente_click());
        view_renta.jbtn_nuevo.addActionListener(event -> jbtn_nuevo_click());
        view_renta.jbtn_insertar.addActionListener(event -> jbtn_insertar_click());
        
    }        
    
     public void getValores(){
        
        view_renta.jtf_id_renta.setText(""+model_renta.getId_renta());
        view_renta.jtf_id_cliente.setText(""+model_renta.getId_cliente());
        view_renta.jtf_id_pelicula.setText(""+model_renta.getId_pelicula());
        view_renta.jtf_formato.setText(""+model_renta.getFormato());
        view_renta.jtf_costo_dia.setText(""+model_renta.getCosto_dia());
        view_renta.jtf_dias.setText(""+model_renta.getDias());
        view_renta.jtf_total_renta.setText(""+model_renta.getTotal_renta());
    }
    
    public void setValores(){
        
        model_renta.setId_renta(Integer.parseInt(view_renta.jtf_id_renta.getText()));
        model_renta.setId_cliente(Integer.parseInt(view_renta.jtf_id_cliente.getText()));
        model_renta.setId_pelicula(Integer.parseInt(view_renta.jtf_id_pelicula.getText()));
        model_renta.setFormato(view_renta.jtf_formato.getText());
        model_renta.setCosto_dia(Integer.parseInt(view_renta.jtf_costo_dia.getText()));
        model_renta.setDias(Integer.parseInt(view_renta.jtf_dias.getText()));
        model_renta.setTotal_renta(view_renta.jtf_total_renta.getText());
    }
    
    public void jbtn_moverPrimero_click(){
        model_renta.moverPrimero();
        getValores();
    }//boton mover primero
    
    public void jbtn_moverUltimo_click(){
        model_renta.moverUltimo();
        getValores();
    }//boton mover ultimo
    
    public void jbtn_moverAnterior_click(){
        model_renta.moverAnterior();
        getValores();
    }//boton mover aterior
    
    public void jbtn_moverSiguiente_click(){
        model_renta.moverSiguiente();
        getValores();
    }//boton mover siguiente
    
    public void jbtn_insertar_click(){
        setValores();
        model_renta.insertar(model_renta.getId_cliente(),model_renta.getId_pelicula(),model_renta.getFormato(),model_renta.getCosto_dia(),model_renta.getDias(),model_renta.getTotal_renta());
        getValores();
    }// boton insertar
    
    public void jbtn_nuevo_click(){
        //view_clientes.jtf_id_cliente.setEditable(false);
        //int id = Integer.parseInt(view_clientes.jtf_id_cliente.getText());
        //id += 1;
        view_renta.jtf_id_renta.setText(" ");
        view_renta.jtf_id_cliente.setText(" ");
        view_renta.jtf_id_pelicula.setText(" ");
        view_renta.jtf_formato.setText(" ");
        view_renta.jtf_costo_dia.setText(" ");
        view_renta.jtf_dias.setText(" ");
        view_renta.jtf_total_renta.setText(" ");
    }// boton nuevo
    
    public void initView(){
        model_renta.Conectar();
        view_renta.setVisible(true);
        model_renta.moverPrimero();
        getValores();
    }//vista de inicio  
}
