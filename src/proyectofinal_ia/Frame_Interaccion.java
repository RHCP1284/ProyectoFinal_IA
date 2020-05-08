package proyectofinal_ia;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Frame_Interaccion extends javax.swing.JFrame {

    public Frame_Interaccion() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_genero = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_director = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_AñoPelicula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_actor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_Pais = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_Recomendacion = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblScanner = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setText("Instrucciones: Llene los campos que necesite para obtener recomendaciones de peliculas en base a sus gustos. (No es necesario que se llene todos los campos)");

        jLabel2.setText("Ingrese genero de película");

        jLabel3.setText("Ingrese nombre de director/directora");

        jLabel4.setText("Ingrese año de lanzamiento de película");

        jLabel5.setText("Ingrese nombre de actor/actris principal");

        jLabel6.setText("Ingrese nombre de pais de producción");

        btn_Recomendacion.setText("Generar recomendaciones");
        btn_Recomendacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RecomendacionActionPerformed(evt);
            }
        });

        jLabel7.setText("Si desea escribir más de un elemento en cualquier campo puede hacerlo seguido de una coma ejemplo (Comedia, aventura,......,acción)");

        tblScanner.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        tblScanner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "# Nombre", "# Director", "# Generos", "# Año Lanzamiento", "# Duración", "# Puntuacion"
            }
        ));
        tblScanner.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        jScrollPane2.setViewportView(tblScanner);

        jLabel8.setText("Generos disponibles = [action, adventure, fantasy, sci-fi, thriller, documentary, romance, animation, comedy, family, musical, mystery, western, drama, history, sport, crime, horror, war, biography, music, game-show, reality-tv, news, short, film-noir]");

        jButton1.setText("Realizar nueva recomendacion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_genero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btn_Recomendacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_Pais, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_actor, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_AñoPelicula, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_director, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(187, 187, 187)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(185, 185, 185)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(153, 153, 153))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(149, 149, 149)))
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 1457, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_director, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_AñoPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txt_actor, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Pais, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Recomendacion, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RecomendacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RecomendacionActionPerformed
    
        ArrayList<String> Generos = new ArrayList<>();
        ArrayList<String> Directores = new ArrayList<>();
        ArrayList<String> Años = new ArrayList<>();
        ArrayList<String> Actores = new ArrayList<>();
        ArrayList<String> Paises = new ArrayList<>();
        ArrayList<ArrayList<String>> Campos =new ArrayList<>();
        Metodos m = new Metodos();
        
        //Se almacena en listas los n valores que el usuario escribio en los campos solicitados
        String genero = txt_genero.getText();
        Generos = m.Almacenar(genero);
        Campos.add(Generos);
        
        String director = txt_director.getText();
        Directores = m.Almacenar(director);
        Campos.add(Directores);
        
        String año = txt_AñoPelicula.getText();
        if(año.isEmpty()) { año = "";}
        Años = m.Almacenar(año);        
        Campos.add(Años);
        
        String actor = txt_actor.getText();
        Actores = m.Almacenar(actor);
        Campos.add(Actores);
        
        String pais = txt_Pais.getText();
        Paises = m.Almacenar(pais);
        Campos.add(Paises);
        
        
        if(genero.equals("") && director.equals("") && año.equals("") && actor.equals("") && pais.equals(""))
        {
        
            JOptionPane.showMessageDialog(null, "Debe de llenar al menos un campo");
            txt_Pais.setText("");
            txt_AñoPelicula.setText("");
            txt_genero.setText("");
            txt_director.setText("");
            txt_genero.setText("");
        }
        else
        {
         
        m.LeerArchivo();        
        m.DesignarPesosCampos(Campos,m.genres,m.director_nameName,m.title_year,m.country,m.actor_1_namePrimary);
        ArrayList<String> Nuevo = m.Catalogo;
        Imprimir(Nuevo,m.movie_title,m.director_nameName,m.title_year,m.genres,m.duration,m.imdb_score);
        ArrayList<String> Probar = new ArrayList<>();
        Probar.add(m.Sugerencias.toString());
                                                        
        String ruta = "src/ProyectoFinal_IA/Recomendaciones.txt";
        File file = new File(ruta);
        String rutaCompleta = file.getAbsolutePath();
        File archivo = new File(rutaCompleta);
          
        if(!archivo.exists()) 
        {                                  
            try 
            {
                CrearArchivo(Probar,0);
            } 
            catch (IOException ex) 
            {                
                Logger.getLogger(Frame_Interaccion.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }
        else
        {
           ArrayList<String> Doc = m.LeerData();                      
           for(String s:Probar)
           {               
               Doc.add(s);
           }
            try {
                CrearArchivo(Doc,1);
            } catch (IOException ex) {
                Logger.getLogger(Frame_Interaccion.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            
        }
        
        }
        
    }//GEN-LAST:event_btn_RecomendacionActionPerformed

    public void CrearArchivo (ArrayList<String> lista,int cond) throws IOException {
 
        String ruta = "src/ProyectoFinal_IA/Recomendaciones.txt";
        File file = new File(ruta);
        String rutaCompleta = file.getAbsolutePath();

        File archivo = new File(rutaCompleta);
        BufferedWriter bw;
        
            bw = new BufferedWriter(new FileWriter(archivo));
            for (int i = 0; i < lista.size(); i++) {                
              bw.write(lista.get(i)+"\n");                
            }
        
        bw.close();
    }
            
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel dm = (DefaultTableModel)tblScanner.getModel();
        dm.getDataVector().removeAllElements();
        dm.fireTableDataChanged(); 
        
            txt_Pais.setText("");
            txt_AñoPelicula.setText("");
            txt_genero.setText("");
            txt_director.setText("");
            txt_genero.setText("");
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Main m = null;
        try {
            m = new Main();
        } catch (IOException ex) {
            Logger.getLogger(Frame_Interaccion.class.getName()).log(Level.SEVERE, null, ex);
        }
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void Imprimir(ArrayList<String> Lista,ArrayList<String> Nombre,ArrayList<String> Director,ArrayList<String> Año,ArrayList<ArrayList<String>> Genero,ArrayList<String> pais,ArrayList<String> idioma)
    {
        DefaultTableModel tabla = (DefaultTableModel) tblScanner.getModel();
        for (int i = 0; i < Lista.size(); i++) 
        {
            int d = Integer.parseInt(Lista.get(i));
            ArrayList<String> subs = Genero.get(d);
            String v = subs.toString();       
            String min = pais.get(d);
            String añ = Año.get(d);
            if(añ.equals("empty")) {añ = "----";}
            if(min.equals("empty")) {min = "100";}
            String [] fila1 = {Nombre.get(d),Director.get(d),v,añ,min+ " mins",idioma.get(d)};                        
            tabla.addRow(fila1);
        }
        
    }
    
    
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
            java.util.logging.Logger.getLogger(Frame_Interaccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Interaccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Interaccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Interaccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_Interaccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Recomendacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblScanner;
    private javax.swing.JTextField txt_AñoPelicula;
    private javax.swing.JTextField txt_Pais;
    private javax.swing.JTextField txt_actor;
    private javax.swing.JTextField txt_director;
    private javax.swing.JTextField txt_genero;
    // End of variables declaration//GEN-END:variables
}
