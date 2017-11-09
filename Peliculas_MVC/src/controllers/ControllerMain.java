package controllers;
//import models.ModelMain
import views.ViewClientes;
import views.ViewPeliculas;
import views.ViewRenta;
import views.ViewMain;

public class ControllerMain {
    ViewClientes view_clientes;
    ViewPeliculas view_peliculas;
    ViewRenta view_renta;
    ViewMain view_main;
    ControllerClientes controller_clientes;
    ControllerPeliculas controller_peliculas;
    ControllerRenta controller_renta;
    
    public ControllerMain(Object views[],Object controllers[] ){
        view_clientes=(ViewClientes)views[0];
        view_peliculas=(ViewPeliculas)views[1];
        view_renta=(ViewRenta)views[2];
        view_main=(ViewMain)views[3];
        controller_clientes=(ControllerClientes)controllers[0];
        controller_peliculas=(ControllerPeliculas)controllers[1];
        controller_renta=(ControllerRenta)controllers[2];
        initView();
        view_main.jmi_clientes.addActionListener(event -> jmi_clientes_click());
        view_main.jmi_peliculas.addActionListener(event -> jmi_peliculas_click());
        view_main.jmi_renta.addActionListener(event -> jmi_renta_click());
        view_main.jmi_salir.addActionListener(event -> jmi_salir_click());
    }
    
    public void jmi_clientes_click(){
        view_main.setContentPane(view_clientes);
        view_main.revalidate();
        view_main.repaint();
    }// menu personas
    
    public void jmi_peliculas_click(){
        view_main.setContentPane(view_peliculas);
        view_main.revalidate();
        view_main.repaint();
    }//menu direcciones
    
    public void jmi_renta_click(){
        view_main.setContentPane(view_renta);
        view_main.revalidate();
        view_main.repaint();
    }//menu direcciones
    
    public void jmi_salir_click(){
        System.exit(0);
    }// menu salir
    
    public void initView(){
            view_main.setTitle("Peliculas_MVC");
            view_main.setLocationRelativeTo(null);
            view_main.setVisible(true);
        
    }// vista inicial
}
