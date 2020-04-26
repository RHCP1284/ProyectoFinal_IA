package proyectofinal_ia;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Main extends javax.swing.JFrame {
    public Main() {
        initComponents();
    }

    //Listas que contendran los campos de las mejores 5000 peliculas segun IMDB    
        public ArrayList<String> color = new ArrayList<>();
        public ArrayList<String> director_nameName = new ArrayList<>();
        public ArrayList<String> num_critic_for_reviews = new ArrayList<>();
        public ArrayList<String> duration = new ArrayList<>();
        public ArrayList<String> director_facebook_likes = new ArrayList<>();
        public ArrayList<String> actor_3_facebook_likes = new ArrayList<>();
        public ArrayList<String> actor_2_name = new ArrayList<>();
        public ArrayList<String> actor_1_facebook_likesNumber = new ArrayList<>();
        public ArrayList<String> gross = new ArrayList<>();
        public ArrayList<String> genres = new ArrayList<>();
        public ArrayList<String> actor_1_namePrimary = new ArrayList<>();
        public ArrayList<String> movie_title = new ArrayList<>();
        public ArrayList<String> num_voted_users = new ArrayList<>();
        public ArrayList<String> cast_total_facebook_likes = new ArrayList<>();
        public ArrayList<String> actor_3_name = new ArrayList<>();
        public ArrayList<String> facenumber_in_poster = new ArrayList<>();                
        public ArrayList<String> plot_keywords = new ArrayList<>();
        public ArrayList<String> movie_imdb_link = new ArrayList<>();
        public ArrayList<String> num_user_for_reviews = new ArrayList<>();
        public ArrayList<String> language = new ArrayList<>();
        public ArrayList<String> country = new ArrayList<>();                        
        public ArrayList<String> content_rating = new ArrayList<>();
        public ArrayList<String> budget = new ArrayList<>();
        public ArrayList<String> title_year = new ArrayList<>();
        public ArrayList<String> actor_2_facebook_likes = new ArrayList<>();
        public ArrayList<String> imdb_score = new ArrayList<>();
        public ArrayList<String> aspect_ratio = new ArrayList<>();
        public ArrayList<String> movie_facebook_likes = new ArrayList<>();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Analizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Genero_Pelicula = new javax.swing.JTextField();
        Nombre_Pelicula = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Recomend = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Analizar.setText("Analizar");
        Analizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalizarActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese nombre de pelicula");

        jLabel2.setText("Ingrese genero de pelicula");

        Nombre_Pelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nombre_PeliculaActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(Recomend);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 42, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Nombre_Pelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(Genero_Pelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Analizar, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nombre_Pelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Genero_Pelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(Analizar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Nombre_PeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nombre_PeliculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nombre_PeliculaActionPerformed

    private void AnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalizarActionPerformed
    
        
        
        String path = "src/proyectofinal_ia/movie_metadata.csv";
        File file = new File(path);
        String absolutePath = file.getAbsolutePath(); 
        LeerArchivo(absolutePath);
        
        
    }//GEN-LAST:event_AnalizarActionPerformed

    public void LeerArchivo(String Path)
    {
        int c =0;
        try {
            Scanner input = new Scanner(new File(Path));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                if(c >0)
                {ClasificarCampos(line);}
                c++;
                
            }
            input.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        int j=0;
    }
    
   public void ClasificarCampos(String linea)
   {
       
       String tempo = "";
       int contador = 1;
       for (int i = 0; i < linea.length(); i++) 
        {
           String tempo1 = linea.charAt(i) + "";
          
           if(!tempo1.equals(","))
           {
             tempo += tempo1;
           }
           else
           {
               if(tempo.equals("") ) { tempo = " ";}
               switch (contador)
               {
                   case 1: color.add(tempo);  break;
                   case 2: director_nameName.add(tempo); break;
                   case 3:num_critic_for_reviews.add(tempo);  break;
                   case 4: duration.add(tempo); break;
                   case 5: director_facebook_likes.add(tempo);   break;                   
                   case 6: actor_3_facebook_likes.add(tempo); break;
                   case 7: actor_2_name.add(tempo); break;
                   case 8:actor_1_facebook_likesNumber.add(tempo); break;
                   case 9: gross.add(tempo); break;
                   case 10:genres.add(tempo);break;
                   case 11: actor_1_namePrimary.add(tempo);  break;
                   case 12: movie_title.add(tempo); break;
                   case 13: num_voted_users.add(tempo); break;
                   case 14: cast_total_facebook_likes.add(tempo); break;
                   case 15: actor_3_name.add(tempo);  break;                
                   case 16: facenumber_in_poster.add(tempo); break;
                   case 17:plot_keywords.add(tempo); break;
                   case 18:movie_imdb_link.add(tempo); break;
                   case 19:num_user_for_reviews.add(tempo); break;
                   case 20: language.add(tempo);    break;                 
                   case 21: country.add(tempo); break;
                   case 22: content_rating.add(tempo); break;
                   case 23: budget.add(tempo); break;
                   case 24: title_year.add(tempo); break;
                   case 25:actor_2_facebook_likes.add(tempo); break;
                   case 26: imdb_score.add(tempo); break;
                   case 27:
                   aspect_ratio.add(tempo);                    
                   break;
                   
               }
               tempo = "";
               contador++;                                             
           }                                 
        }
       if(tempo.equals("")) {tempo ="0";}
       movie_facebook_likes.add(tempo);
       
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
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Analizar;
    private javax.swing.JTextField Genero_Pelicula;
    private javax.swing.JTextField Nombre_Pelicula;
    private javax.swing.JList<String> Recomend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
