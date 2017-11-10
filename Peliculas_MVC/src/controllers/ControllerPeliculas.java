package controllers;

import models.ModelPeliculas;
import views.ViewPeliculas;


public class ControllerPeliculas {
    ModelPeliculas model_peliculas;
    ViewPeliculas view_peliculas;
    
    public ControllerPeliculas(ModelPeliculas model_peliculas,ViewPeliculas view_peliculas){
        this.model_peliculas = model_peliculas;
        this.view_peliculas = view_peliculas;
        initView();
        view_peliculas.jbtn_primero.addActionListener(event -> jbtn_moverPrimero_click());
        view_peliculas.jbtn_ultimo.addActionListener(event -> jbtn_moverUltimo_click());
        view_peliculas.jbtn_anterior.addActionListener(event -> jbtn_moverAnterior_click());
        view_peliculas.jbtn_siguiente.addActionListener(event -> jbtn_moverSiguiente_click());
        view_peliculas.jbtn_nuevo.addActionListener(event -> jbtn_nuevo_click());
        view_peliculas.jbtn_insertar.addActionListener(event -> jbtn_insertar_click());
        view_peliculas.jbtn_actualizar.addActionListener(event -> jbtn_actualizar_click());
        view_peliculas.jbtn_eliminar.addActionListener(event -> jbtn_eliminar_click());
        
        
    }
    
    public void getValores(){
        view_peliculas.jtf_id_pelicula.setText("" + model_peliculas.getId_pelicula());
        view_peliculas.jtf_nombre.setText("" + model_peliculas.getNombre());
        view_peliculas.jtf_formato.setText("" + model_peliculas.getFormato());
        view_peliculas.jtf_duracion.setText("" + model_peliculas.getDuracion());
        view_peliculas.jtf_descripcion.setText("" + model_peliculas.getDescripcion());        
    }
    
    public void setValores(){
            
        model_peliculas.setNombre(view_peliculas.jtf_nombre.getText());
        model_peliculas.setFormato(view_peliculas.jtf_formato.getText());
        model_peliculas.setDuracion(view_peliculas.jtf_duracion.getText());
        model_peliculas.setDescripcion(view_peliculas.jtf_descripcion.getText());
        if(!view_peliculas.jtf_id_pelicula.getText().equals(" ")){
            model_peliculas.setId_pelicula(Integer.parseInt(view_peliculas.jtf_id_pelicula.getText()));
        }
    }
    
    public void jbtn_moverPrimero_click(){
        model_peliculas.moverPrimero();
        getValores();
    }//boton mover primero
    
    public void jbtn_moverUltimo_click(){
        model_peliculas.moverUltimo();
        getValores();
    }//boton mover ultimo
    
    public void jbtn_moverAnterior_click(){
        model_peliculas.moverAnterior();
        getValores();
    }//boton mover aterior
    
    public void jbtn_moverSiguiente_click(){
        model_peliculas.moverSiguiente();
        getValores();
    }//boton mover siguiente
    
    
    public void jbtn_nuevo_click(){
        view_peliculas.jtf_id_pelicula.setEditable(false);
        //int id = Integer.parseInt(view_peliculas.jtf_id_pelicula.getText());
        //id += 1;
        view_peliculas.jtf_id_pelicula.setText(" ");
        view_peliculas.jtf_nombre.setText(" ");
        view_peliculas.jtf_formato.setText(" ");
        view_peliculas.jtf_duracion.setText(" ");
        view_peliculas.jtf_descripcion.setText(" ");
    }// boton nuevo
    
    public void jbtn_insertar_click(){
        setValores();
        model_peliculas.insertar(/*model_peliculas.getNombre(),model_peliculas.getFormato(),model_peliculas.getDuracion(),model_peliculas.getDescripcion()*/);
        model_peliculas.seleccionarTodo();
        getValores();
    }// boton insertar
    
    public void jbtn_actualizar_click(){
        setValores();
        model_peliculas.actualizar(/*model_peliculas.getNombre(),model_peliculas.getFormato(),model_peliculas.getDuracion(),model_peliculas.getDescripcion(),model_peliculas.getId_pelicula()*/);
        getValores();
    }//boton actualizar
    
    public void jbtn_eliminar_click(){
        setValores();
        model_peliculas.eliminar(/*model_peliculas.getId_pelicula()*/);
        getValores();
    }//boton borrar
    
    public void initView(){
        model_peliculas.Conectar();
        view_peliculas.setVisible(true);
        model_peliculas.moverPrimero();
        getValores();
    }//vista de inicio  
}
