/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Jorch17
 */
public class ViewRenta extends javax.swing.JPanel {

    /**
     * Creates new form ViewRenta
     */
    public ViewRenta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_title = new javax.swing.JLabel();
        jl_id_renta = new javax.swing.JLabel();
        jl_id_cliente = new javax.swing.JLabel();
        jl_id_pelicula = new javax.swing.JLabel();
        jl_formato = new javax.swing.JLabel();
        jl_costo_dia = new javax.swing.JLabel();
        jl_dias = new javax.swing.JLabel();
        jl_total_renta = new javax.swing.JLabel();
        jtf_id_renta = new javax.swing.JTextField();
        jtf_id_cliente = new javax.swing.JTextField();
        jtf_id_pelicula = new javax.swing.JTextField();
        jtf_formato = new javax.swing.JTextField();
        jtf_costo_dia = new javax.swing.JTextField();
        jtf_dias = new javax.swing.JTextField();
        jtf_total_renta = new javax.swing.JTextField();
        jbtn_primero = new javax.swing.JButton();
        jbtn_anterior = new javax.swing.JButton();
        jbtn_siguiente = new javax.swing.JButton();
        jbtn_ultimo = new javax.swing.JButton();
        jbtn_nuevo = new javax.swing.JButton();
        jbtn_insertar = new javax.swing.JButton();

        jl_title.setText("RENTA DE PELICULAS");

        jl_id_renta.setText("Id Renta :");

        jl_id_cliente.setText("Id Cliente :");

        jl_id_pelicula.setText("Id Pelicula :");

        jl_formato.setText("Formato :");

        jl_costo_dia.setText("Costo X Dia :");

        jl_dias.setText("Dias :");

        jl_total_renta.setText("Total de Renta :");

        jbtn_primero.setText("|<");

        jbtn_anterior.setText("<");

        jbtn_siguiente.setText(">");

        jbtn_ultimo.setText(">|");

        jbtn_nuevo.setText("Nuevo");

        jbtn_insertar.setText("Insertar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jl_title)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_id_renta)
                            .addComponent(jl_id_cliente)
                            .addComponent(jl_id_pelicula)
                            .addComponent(jl_formato)
                            .addComponent(jl_costo_dia)
                            .addComponent(jl_dias)
                            .addComponent(jl_total_renta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_id_renta)
                            .addComponent(jtf_id_cliente)
                            .addComponent(jtf_id_pelicula)
                            .addComponent(jtf_formato)
                            .addComponent(jtf_costo_dia)
                            .addComponent(jtf_dias)
                            .addComponent(jtf_total_renta, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtn_primero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtn_anterior)
                        .addGap(13, 13, 13)
                        .addComponent(jbtn_siguiente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtn_ultimo)
                        .addGap(7, 7, 7)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn_nuevo)
                    .addComponent(jbtn_insertar))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_title)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_id_renta)
                            .addComponent(jtf_id_renta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_id_cliente)
                            .addComponent(jtf_id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_id_pelicula)
                            .addComponent(jtf_id_pelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_formato)
                            .addComponent(jtf_formato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_costo_dia)
                            .addComponent(jtf_costo_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_dias)
                            .addComponent(jtf_dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_total_renta)
                            .addComponent(jtf_total_renta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtn_primero)
                            .addComponent(jbtn_anterior)
                            .addComponent(jbtn_siguiente)
                            .addComponent(jbtn_ultimo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jbtn_insertar)
                        .addGap(32, 32, 32)
                        .addComponent(jbtn_nuevo)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jbtn_anterior;
    public javax.swing.JButton jbtn_insertar;
    public javax.swing.JButton jbtn_nuevo;
    public javax.swing.JButton jbtn_primero;
    public javax.swing.JButton jbtn_siguiente;
    public javax.swing.JButton jbtn_ultimo;
    private javax.swing.JLabel jl_costo_dia;
    private javax.swing.JLabel jl_dias;
    private javax.swing.JLabel jl_formato;
    private javax.swing.JLabel jl_id_cliente;
    private javax.swing.JLabel jl_id_pelicula;
    private javax.swing.JLabel jl_id_renta;
    private javax.swing.JLabel jl_title;
    private javax.swing.JLabel jl_total_renta;
    public javax.swing.JTextField jtf_costo_dia;
    public javax.swing.JTextField jtf_dias;
    public javax.swing.JTextField jtf_formato;
    public javax.swing.JTextField jtf_id_cliente;
    public javax.swing.JTextField jtf_id_pelicula;
    public javax.swing.JTextField jtf_id_renta;
    public javax.swing.JTextField jtf_total_renta;
    // End of variables declaration//GEN-END:variables
}
