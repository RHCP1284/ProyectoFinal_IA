package proyectofinal_ia;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class Main extends javax.swing.JFrame {
    public Main() throws IOException {
        initComponents();
        validar();
    }
    

    public Metodos m = new Metodos();
    public ArrayList<String> Recomendaciones = new ArrayList<>();
                         
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblScanner = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("Bienvenido al recomendador de peliculas de IMDB");

        jButton2.setText("Ir Recomendacion por usuario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

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

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("Estado:");

        Status.setText("..");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(186, 186, 186)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1072, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(Status))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Frame_Interaccion fi = new Frame_Interaccion();
        fi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void validar() throws IOException
    {
        
        m.LeerArchivo();
        String ruta = "src/ProyectoFinal_IA/Recomendaciones.txt";
        File file = new File(ruta);
        String rutaCompleta = file.getAbsolutePath();
        File archivo = new File(rutaCompleta);
          
        if(archivo.exists()) 
        {
           Status.setText("Arranque en frío por recomendaciones de usuarios");
           ArranqueEnFrioData();           
        } 
        
        else 
        {
            Status.setText("Arranque en frío default");            
            ArranqueEnFrioDefault();
        }
        
    }
    
    private void ArranqueEnFrioDefault()
    {
        ArrayList<String> Puntajes = MejoresPuntuacioens(m.imdb_score);
        ArrayList<String> Recomendar = new ArrayList<>();   
        DefaultTableModel tabla = (DefaultTableModel) tblScanner.getModel();
        
        for(int i = 0; i<10;i++)
        {
            Random rand = new Random();                
            String newitem = Puntajes.get(rand.nextInt(Puntajes.size()));
            
            for (int j = 0; j < m.movie_title.size(); j++) 
            {
                String agregar = m.movie_title.get(j);
                
                    if(m.imdb_score.get(j).equals(newitem) && !Recomendar.contains(agregar))
                    {
                        ArrayList<String> subs = m.genres.get(j);
                        String v = subs.toString(); 
                         String añ = m.title_year.get(j);
                         String min = m.duration.get(j);
                         if(añ.equals("empty")) {añ = "----";}
                         if(min.equals("empty")) {min = "100";}
                        String [] fila1 = {agregar,m.director_nameName.get(j),v,añ,min+ " mins",m.language.get(j)};                        
                        tabla.addRow(fila1);
                        Recomendar.add(agregar);                                                
                        
                        break;                        
                    }                
            }            
        }
                                                               
     
    }
  
    private ArrayList<String> MejoresPuntuacioens (ArrayList<String> lista){
        
        ArrayList<String> sortedlist = new ArrayList<>(lista); 
        ArrayList<String> sorted = new ArrayList<>();
        ArrayList<String> sorted2 = new ArrayList<>();
        
        Collections.sort(sortedlist);
          for (int i = sortedlist.size()-1; i >= 0; i--) {
              String n = sortedlist.get(i);
              sorted.add(n);
          }
          
          for (int i = 0; i < sorted.size(); i++) 
          {
            double n =  Double.parseDouble(sorted.get(i));
            if(n >= 8 && n <= 10)
            {
                sorted2.add(n+"");
            }
          }
          
        return  sorted2;
   }
    
    
    private void ArranqueEnFrioData() throws FileNotFoundException, IOException
    {
                              
        String ruta = "src/ProyectoFinal_IA/Recomendaciones.txt";
        File file = new File(ruta);
        String rutaCompleta = file.getAbsolutePath();
        
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        archivo = new File (rutaCompleta);
        fr = new FileReader (archivo);
        br = new BufferedReader(fr);
                
        
        // Lectura del fichero                        
        String linea;
 
        while((linea=br.readLine())!=null)
        {                                       
         Algortimo(linea);                               
        }        

        
        int v = 0;
        if(Recomendaciones.size() > 10) {v = 10; } else {v = Recomendaciones.size();}
        ArrayList<String> Mostrar = new ArrayList<>();
        
        for (int i = 0; i < v; i++) 
        {
              Random rand = new Random();
              String newitem = Recomendaciones.get(rand.nextInt(Recomendaciones.size()));
              
            while(true)
            {
                if(!Mostrar.contains(newitem))
                {
                    Mostrar.add(newitem);
                    break;
                }
                else
                {
                    newitem = Recomendaciones.get(rand.nextInt(Recomendaciones.size()));
                }
            }
        }
        
        Imprimir(Mostrar,m.movie_title,m.director_nameName,m.title_year,m.genres,m.duration,m.imdb_score);
    }
            
    public void Imprimir(ArrayList<String> Lista,ArrayList<String> Nombre,ArrayList<String> Director,ArrayList<String> Año,ArrayList<ArrayList<String>> Genero,ArrayList<String> pais,ArrayList<String> idioma)
    {        
        DefaultTableModel tabla = (DefaultTableModel) tblScanner.getModel();
        ArrayList<String> sortedlist = new ArrayList<>(Lista); 
        Collections.sort(sortedlist); 
                
        for (int i = 0; i < sortedlist.size(); i++) 
        {            
            int d = Integer.parseInt(sortedlist.get(i));
            ArrayList<String> subs = Genero.get(d);
            String v = subs.toString();       
            String min = pais.get(d);
            String añ = Año.get(d);
            if(añ.equals("empty")) {añ = "----";}
            if(min.equals("empty")) {min = "100";}            
            String[] fila1 = {Nombre.get(d),Director.get(d),v,añ,min+ " mins",idioma.get(d)};                        
            tabla.addRow(fila1);
        }
        
        
    }
    
    public void Algortimo(String cadena)
    {       
                                          
         cadena = cadena.replace(" ", "");
         cadena = cadena.replace("[", "");
         cadena = cadena.replace("]", "");
         String[] c = cadena.split(",");
         
         
         for(String s:c)
         {
             if(!Recomendaciones.contains(s))
             {
         Recomendaciones.add(s);
             }
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Main().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Status;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblScanner;
    // End of variables declaration//GEN-END:variables
}
