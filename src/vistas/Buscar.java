/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import modelo.Equipo;
import modelo.Marca;
import modelo.Proceso;
import modelo.TipoEquipo;
import modelo.TipoProceso;
import modelo.Usuario;

/**
 *
 * @author Ariel Mathias
 */



public class Buscar extends javax.swing.JFrame {

    /**
     * Creates new form Buscar
     */
    FondoPanel fondo = new FondoPanel();
    
    public Buscar() {
        this.setContentPane(fondo);
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

        jlbl_ingresarId = new javax.swing.JLabel();
        jtxt_ingresarIdEquipo = new javax.swing.JTextField();
        jbtn_buscarEquipo = new javax.swing.JButton();
        jbtn_mostrarEquipos = new javax.swing.JButton();
        jlbl_nombreEquipo = new javax.swing.JLabel();
        jlbl_setNombre = new javax.swing.JLabel();
        jlbl_marcaEquipo = new javax.swing.JLabel();
        jlbl_setMarcaEquipo = new javax.swing.JLabel();
        jlbl_modelo = new javax.swing.JLabel();
        jlbl_setModeloEquipo = new javax.swing.JLabel();
        jlbl_tipoProceso = new javax.swing.JLabel();
        jlbl_setModeloEquipo1 = new javax.swing.JLabel();
        jlbl_setTipoProceso = new javax.swing.JLabel();
        jlbl_numeroSerie = new javax.swing.JLabel();
        jlbl_setNumeroSerie = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtab_buscarProceso = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbl_ingresarId.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jlbl_ingresarId.setText("Ingresa ID del Equipo");

        jtxt_ingresarIdEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_ingresarIdEquipoActionPerformed(evt);
            }
        });

        jbtn_buscarEquipo.setText("Buscar");
        jbtn_buscarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_buscarEquipoActionPerformed(evt);
            }
        });

        jbtn_mostrarEquipos.setText("Mostrar Todos");
        jbtn_mostrarEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_mostrarEquiposActionPerformed(evt);
            }
        });

        jlbl_nombreEquipo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jlbl_nombreEquipo.setText("Nombre Equipo:");

        jlbl_marcaEquipo.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jlbl_marcaEquipo.setText("Marca Equipo:");

        jlbl_modelo.setText("Modelo Equipo:");

        jlbl_tipoProceso.setText("Tipo Proceso: ");

        jlbl_numeroSerie.setText("Número Serie:");

        Jtab_buscarProceso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Equipo", "Nombre Equipo", "Número de Serie", "Nombre Marca", "Nombre Proceso", "Nombre Usuario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Jtab_buscarProceso);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jlbl_ingresarId, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbl_marcaEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbl_nombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtxt_ingresarIdEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn_buscarEquipo)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn_mostrarEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbl_setNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbl_setMarcaEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlbl_tipoProceso)
                                        .addGap(772, 772, 772)
                                        .addComponent(jlbl_setTipoProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlbl_modelo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlbl_setModeloEquipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17)
                                        .addComponent(jlbl_numeroSerie)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlbl_setNumeroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlbl_setModeloEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_ingresarId, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_ingresarIdEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_buscarEquipo)
                    .addComponent(jbtn_mostrarEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbl_nombreEquipo)
                            .addComponent(jlbl_setNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbl_modelo)
                            .addComponent(jlbl_setModeloEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbl_setModeloEquipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbl_numeroSerie))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jlbl_marcaEquipo)
                                .addComponent(jlbl_setMarcaEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlbl_tipoProceso)
                            .addComponent(jlbl_setTipoProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jlbl_setNumeroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_ingresarIdEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_ingresarIdEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_ingresarIdEquipoActionPerformed

    private void jbtn_buscarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_buscarEquipoActionPerformed

        this.jtxt_ingresarIdEquipo.requestFocus();

        controlador.ContBuscarEquipo buscar = new controlador.ContBuscarEquipo();
        controlador.ContProceso proceso = new controlador.ContProceso();
        DefaultTableModel modelo = (DefaultTableModel) Jtab_buscarProceso.getModel();
        Equipo equip = new Equipo();
        TipoEquipo tipoEquip = new TipoEquipo();
        Marca marc = new Marca();
        TipoProceso tipoProces = new TipoProceso();
        Proceso proce = new Proceso();
        Usuario user = new Usuario();

        String id = null;
        String equipo;
        int estado;

        try {

            if (jtxt_ingresarIdEquipo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Debe ingresar un ID!", "Atención", JOptionPane.WARNING_MESSAGE);
            } else {

                // convertir id en String para buscar en sql
                id = jtxt_ingresarIdEquipo.getText();

                //con esto buscamos el equipo por el id y recuperamos la info
                equip = proceso.buscarenProceso(id);
                this.jlbl_setModeloEquipo.setText(equip.getModelo());//aqui obtenemos el modelo del equipo

                // aca recuperamos el tipo según el id de tipo tomado antes
                tipoEquip = proceso.buscartipo(equip.getId_tipo_equipo());
                this.jlbl_setNombre.setText(tipoEquip.getTipo_equipo());

                //aca recuperamos la marca segun el id tomado en el comienzo}
            marc = proceso.marca(equip.getId_marca());
            this.jlbl_setMarcaEquipo.setText(marc.getNombre_marca());

            // aca definimos el numero de serie de lo recuperado con la busqueda del equipo por id
            this.jlbl_setNumeroSerie.setText(equip.getNumero_serie());

            proce = buscar.buscarEquipo(id);
            user = buscar.buscarUsuario(proce.getId_usuario());

            tipoProces = buscar.buscarTipoProceso(proce.getId_tipo_proceso());
            if (tipoProces != null && tipoProces.getNombre() != null) {
                this.jlbl_setTipoProceso.setText(tipoProces.getNombre());

                String a,b,c,d,e,f;
                a=String.valueOf(proce.getId_equipo());
                b=tipoEquip.getTipo_equipo();
                c=equip.getNumero_serie();
                d=marc.getNombre_marca();
                e=tipoProces.getNombre();
                f=user.getNombre_usuario();

                String [] datos = {a,b,c,d,e,f};
                modelo.addRow(datos);
            } else {
                this.jlbl_setTipoProceso.setText("El equipo no ha sido ingresado a ningún proceso");
            }

            if (this.jlbl_setModeloEquipo.getText().isEmpty() && this.jlbl_setNombre.getText().isEmpty() && this.jlbl_setMarcaEquipo.getText().isEmpty() && this.jlbl_setNumeroSerie.getText().isEmpty() && this.jlbl_setTipoProceso.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Equipo no encontrado!", "Atención", JOptionPane.WARNING_MESSAGE);
            }

        }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Equipo no encontrado!", "Atención", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbtn_buscarEquipoActionPerformed

    private void jbtn_mostrarEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_mostrarEquiposActionPerformed

        controlador.ContBuscarEquipo buscarEquipos = new controlador.ContBuscarEquipo(); // Crear una instancia del controlador
        ArrayList<Proceso> listaEquipos = buscarEquipos.buscarEquipoLista(); // Llamar al método buscarEquipoLista

        // Creamos un modelo de tabla para manejar los datos
        DefaultTableModel modeloTabla = new DefaultTableModel();

        // Definimos las columnas de la tabla con nombres
        modeloTabla.addColumn("ID Equipo");
        modeloTabla.addColumn("Nombre Equipo");
        modeloTabla.addColumn("Número de Serie");
        modeloTabla.addColumn("Nombre Marca");
        modeloTabla.addColumn("Nombre Proceso");
        modeloTabla.addColumn("Nombre Usuario");

        // Iteramos sobre la lista de equipos y obtenemos los nombres correspondientes a los IDs
        for (Proceso proceso : listaEquipos) {
            Equipo equipo = buscarEquipos.buscarEquipo(proceso.getId_equipo());
            TipoProceso tipoProceso = buscarEquipos.buscarTipoProceso(proceso.getId_tipo_proceso());
            Usuario usuario = buscarEquipos.buscarUsuario(proceso.getId_usuario());
            Marca marca = buscarEquipos.buscarMarca(equipo.getId_marca());

            Object[] fila = {
                equipo.getId_equipo(), // ID Equipo
                equipo.getModelo(), // Nombre del Equipo
                equipo.getNumero_serie(), // Número de Serie
                marca.getNombre_marca(), // Nombre de la Marca
                tipoProceso.getNombre(), // Nombre del Proceso
                usuario.getNombre_usuario() // Nombre del Usuario
            };

            modeloTabla.addRow(fila); // Agregar fila al modelo de la tabla
        }

        // Asignamos el modelo de tabla a la JTable
        Jtab_buscarProceso.setModel(modeloTabla);

        //        controlador.ContBuscarEquipo buscar = new controlador.ContBuscarEquipo();
        //        controlador.ContProceso info = new controlador.ContProceso();
        //        bbdd.Conexion conec = new bbdd.Conexion();
        //        DefaultTableModel modelo = (DefaultTableModel) Jtab_buscarProceso.getModel();
        //
        //
        //        //ArrayList<controlador.ContBuscarEquipo> listarProcesos = new ArrayList<>();
        //        ArrayList<Proceso> listaequipos = new ArrayList<>();
        //
        ////        TipoEquipo tipoEquipo = new TipoEquipo();
        ////        TipoProceso tipoProceso = new TipoProceso();
        ////        Proceso proceso = new Proceso();
        ////        Equipo equipo = new Equipo();
        ////        Marca mrc = new Marca();
        ////        Usuario user = new Usuario();
        ////        String idEquipo = null;
        //        //String info;
        //
        //        listaequipos = buscar.buscarEquipoLista();
        //        for (Proceso proce : listaequipos) {
            //            String a,b,c,d,e,f;
            //            TipoEquipo tipoEquipo = new TipoEquipo();
            //            TipoProceso tipoProceso = new TipoProceso();
            //            Proceso proceso = new Proceso();
            //            Equipo equipo = new Equipo();
            //            Marca mrc = new Marca();
            //            Usuario user = new Usuario();
            //
            //            proceso = buscar.buscarproceso(proce.getId_proceso());
            //            a = String.valueOf(proceso.getId_equipo());
            //
            //            equipo = info.buscarenProceso(String.valueOf(proceso.getId_equipo()));
            //
            //            tipoEquipo =  info.buscartipo(equipo.getId_tipo_equipo());
            //            b = tipoEquipo.getTipo_equipo();
            //            c=equipo.getNumero_serie();
            //
            //            mrc= info.marca(equipo.getId_marca());
            //            d = mrc.getNombre_marca();
            //
            //            tipoProceso = buscar.buscarTipoProceso(proceso.getId_tipo_proceso());
            //            e = tipoProceso.getNombre();
            //
            //            user = buscar.buscarUsuario(proceso.getId_usuario());
            //            f = user.getNombre_usuario();
            //
            //            String [] datos = {a,b,c,d,e,f};
            //            modelo.addRow(datos);
            //        }
        ////        idEquipo = this.jtxt_ingresarIdEquipo.getText();
        ////
        ////        listaequipos = buscar.buscarEquipoLista(idEquipo);
        ////
        ////        for (Proceso equip : listaequipos) {
            ////
            ////            int idequip;
            ////            String model,sn,mar,pro,us;
            ////            proceso = equip;
            ////            equipo = buscar.buscarEquipo(proceso.getId_equipo());
            ////            tipoProceso = buscar.buscarTipoProceso(proceso.getId_tipo_proceso());
            ////            mrc = info.marca(equipo.getId_marca());
            ////            user= buscar.buscarUsuario(proceso.getId_usuario());
            ////            tipoEquipo= info.buscartipo(equipo.getId_tipo_equipo());
            ////
            ////            idequip=proceso.getId_equipo();
            ////            model=tipoEquipo.getTipo_equipo();
            ////            sn=equipo.getNumero_serie();
            ////            mar= mrc.getNombre_marca();
            ////            pro=tipoProceso.getNombre();
            ////            us=user.getNombre_usuario();
            ////            String [] datos ={String.valueOf(idequip),model,sn,mar,pro,us};
            ////            modelo.addRow(datos);
            ////
            ////
            ////        }
        //
        ////        //listarProcesos = buscar.buscarEquipo(idEquipo);
        ////        tipoProceso = buscar.buscarTipoProceso(tipoProceso.getId_tipo_proceso());
        ////        equipo = buscar.buscarEquipo(equipo.getId_equipo());
        ////        mrc = buscar.buscarMarca(mrc.getId_marca());
        ////        tipoEquipo = buscar.buscarTipoEquipo(tipoEquipo.getId_tipo_equipo());
        ////
        ////        // Construir la cadena con la información
        ////        info = "ID Equipo: " + equipo.getId_equipo() + "\t"
        ////                + "Nombre: " + tipoEquipo.getTipo_equipo() + "\t"
        ////                + "Modelo: " + equipo.getModelo() + "\t"
        ////                + "Código de Serie: " + equipo.getNumero_serie() + "\t"
        ////                + "Tipo Proceso: " + tipoProceso.getNombre() + "\t";
        ////
        ////        // Mostrar la información en el JTextArea
        ////        jtxtA_listaEquipos.setText(info.toString());
        //
    }//GEN-LAST:event_jbtn_mostrarEquiposActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscar().setVisible(true);
            }
        });
    }
    class FondoPanel extends JPanel {

        private Image imagen;

        public FondoPanel() {
            imagen = new ImageIcon(getClass().getResource("/imagenes/buscar.jpg")).getImage();
            setOpaque(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g); // Pinta los componentes hijos

            // Dibuja la imagen de fondo después de los componentes
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Jtab_buscarProceso;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtn_buscarEquipo;
    private javax.swing.JButton jbtn_mostrarEquipos;
    private javax.swing.JLabel jlbl_ingresarId;
    private javax.swing.JLabel jlbl_marcaEquipo;
    private javax.swing.JLabel jlbl_modelo;
    private javax.swing.JLabel jlbl_nombreEquipo;
    private javax.swing.JLabel jlbl_numeroSerie;
    private javax.swing.JLabel jlbl_setMarcaEquipo;
    private javax.swing.JLabel jlbl_setModeloEquipo;
    private javax.swing.JLabel jlbl_setModeloEquipo1;
    private javax.swing.JLabel jlbl_setNombre;
    private javax.swing.JLabel jlbl_setNumeroSerie;
    private javax.swing.JLabel jlbl_setTipoProceso;
    private javax.swing.JLabel jlbl_tipoProceso;
    private javax.swing.JTextField jtxt_ingresarIdEquipo;
    // End of variables declaration//GEN-END:variables
}