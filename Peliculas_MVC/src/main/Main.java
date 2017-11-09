package main;
import models.ModelClientes;
import views.ViewClientes;
import controllers.ControllerClientes;

import models.ModelPeliculas;
import views.ViewPeliculas;
import controllers.ControllerPeliculas;

import models.ModelRenta;
import views.ViewRenta;
import controllers.ControllerRenta;

//import models.ModelMain;
import views.ViewMain;
import controllers.ControllerMain;

public class Main {

    public static void main(String[] args) {
        ModelClientes model_clientes = new ModelClientes();
        ViewClientes view_clientes = new ViewClientes();
        ControllerClientes controller_clientes = new ControllerClientes(model_clientes,view_clientes);
    
        ModelPeliculas model_peliculas = new ModelPeliculas();
        ViewPeliculas view_peliculas = new ViewPeliculas();
        ControllerPeliculas controller_peliculas = new ControllerPeliculas(model_peliculas,view_peliculas);
        
        ModelRenta model_renta = new ModelRenta();
        ViewRenta view_renta = new ViewRenta();
        ControllerRenta controller_renta = new ControllerRenta(model_renta,view_renta);
        
        
        //ModelMain model_main = new ModelMain();
        ViewMain view_main = new ViewMain();
        Object views[] = new Object[4];
        views[0]= view_clientes;
        views[1]= view_peliculas;
        views[2]= view_renta;
        views[3]= view_main;
        
        Object controllers[] = new Object[3];
        controllers[0]= controller_clientes;
        controllers[1]= controller_peliculas;
        controllers[2]= controller_renta;
        
        ControllerMain controller_main = new ControllerMain(views,controllers);
    }
    
    
}
