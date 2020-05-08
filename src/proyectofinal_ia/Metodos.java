
package proyectofinal_ia;
   
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;


public class Metodos {
    
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
        public ArrayList< ArrayList<String> > genres = new ArrayList<>();
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
        
        
        public ArrayList<String> Sugerencias = new ArrayList<>();
        public ArrayList<String> Catalogo = new ArrayList<>();
        public ArrayList<String> Pesos = new ArrayList<>();
        
        
        
   public void LeerArchivo()
    {
        String Path = "src/proyectofinal_ia/movie_metadata.csv";
        File file = new File(Path);
        String absolutePath = file.getAbsolutePath();                
        int c =0;
        
        try {
            Scanner input = new Scanner(new File(absolutePath));
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
                
    }
   
   public ArrayList<String> LeerData()
    {
        
        ArrayList<String> n = new ArrayList<>();
        String Path = "src/proyectofinal_ia/Recomendaciones.txt";
        File file = new File(Path);
        String absolutePath = file.getAbsolutePath();         
        
        int c =0;
        try {
            Scanner input = new Scanner(new File(absolutePath));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                n.add(line);
                
            }
            input.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return n;
    }
    
   private void ClasificarCampos(String linea)
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
               if(tempo.equals("") ) { tempo = "empty";}
               switch (contador)
               {
                   case 1: color.add(tempo);  break;
                   case 2: director_nameName.add(tempo.toLowerCase()); break;
                   case 3: num_critic_for_reviews.add(tempo);  break;
                   case 4: duration.add(tempo); break;
                   case 5: director_facebook_likes.add(tempo);   break;                   
                   case 6: actor_3_facebook_likes.add(tempo); break;
                   case 7: actor_2_name.add(tempo); break;
                   case 8:actor_1_facebook_likesNumber.add(tempo); break;
                   case 9: gross.add(tempo); break;
                   case 10:ArrayList<String> SubGeneros = new ArrayList<>(); tempo = tempo.replace("|", ","); String[] s = tempo.split(","); for(String d:s){ SubGeneros.add(d.toLowerCase());} genres.add(SubGeneros); break;
                   case 11: actor_1_namePrimary.add(tempo.toLowerCase());                           
                   case 12: movie_title.add(tempo); break;
                   case 13: num_voted_users.add(tempo); break;
                   case 14: cast_total_facebook_likes.add(tempo); break;
                   case 15: actor_3_name.add(tempo);  break;                
                   case 16: facenumber_in_poster.add(tempo); break;
                   case 17: plot_keywords.add(tempo); break;                   
                   case 18: movie_imdb_link.add(tempo); break;
                   case 19: num_user_for_reviews.add(tempo); break;
                   case 20: language.add(tempo);    break;                 
                   case 21: country.add(tempo.toLowerCase()); break;
                   case 22: content_rating.add(tempo); break;
                   case 23: budget.add(tempo); break;
                   case 24: title_year.add(tempo); break;
                   case 25: actor_2_facebook_likes.add(tempo); break;
                   case 26: if(tempo.equals("empty")) {tempo = "0";} if(tempo.equals("")) {tempo = "0";}  double n = Double.parseDouble(tempo); if(n >10){n = 1;} imdb_score.add(n+""); break;
                   case 27: aspect_ratio.add(tempo);break;
                   
               }
               tempo = "";
               contador++;                                             
           }                                 
        }
       if(tempo.equals("")) {tempo ="0";}
       movie_facebook_likes.add(tempo);
       
   }
   
   private double redondearDecimales(double valorInicial, int numeroDecimales) {
        double parteEntera, resultado;
        resultado = valorInicial;
        parteEntera = Math.floor(resultado);
        resultado=(resultado-parteEntera)*Math.pow(10, numeroDecimales);
        resultado=Math.round(resultado);
        resultado=(resultado/Math.pow(10, numeroDecimales))+parteEntera;
        return resultado;
    }
   
 public void DesignarPesosCampos(ArrayList<ArrayList<String>> Campos,ArrayList<ArrayList<String>>genres1,ArrayList<String>director_nameName1,ArrayList<String>title_year1,ArrayList<String>country1,ArrayList<String>actor_1_namePrimary1)
   {                      
       double probabilidad = 1;
       int c = 0;
       

       
       for (int i = 0; i < genres1.size(); i++) 
       {
           for (int j = 0; j < Campos.size(); j++) 
           {
                     for(String s: Campos.get(j))
                     {
                      s = s.toLowerCase();
                      if(s.equals("")) {s ="null";}
                    
                      ArrayList<String> subs = genres1.get(i);
                    if(subs.contains(s)) {
                         probabilidad = probabilidad * 0.35; 
                     } 
                     
                     if(director_nameName1.get(i).contains(s)) { 
                         probabilidad = probabilidad * 0.30; 
                     } 
                     
                     if(title_year1.get(i).contains(s)) { 
                         probabilidad = probabilidad * 0.25; 
                     } 
                     
                     if(country1.get(i).contains(s)) { 
                         probabilidad = probabilidad * 0.20; 
                     } 
                     
                     if(actor_1_namePrimary1.get(i).contains(s)) { 
                         probabilidad = probabilidad * 0.15; 
                     } 
                     
                     
                     }
                     
                     }          
           probabilidad = redondearDecimales(probabilidad,5);
           Pesos.add(probabilidad +"");
           probabilidad = 1;
           }
       
       DefinirMinimos();
       
       }       
                 
   private void DefinirMinimos()
   {
      String rangoMinimo1 = Minimos(Pesos,0)+"";
      String rangoMinimo2 = Minimos(Pesos,1)+"";
      int contador =1;
      boolean bandera = true;
      
      if(rangoMinimo1 == rangoMinimo2)                    
        {          
      while(true)
      {          
          rangoMinimo2  = Minimos(Pesos,contador)+"";
          if(rangoMinimo1 != rangoMinimo2) {bandera = false;}           
          contador++;
      }      
        }
      
       for (int i = 0; i < Pesos.size(); i++) 
       {
           if(rangoMinimo1.equals(Pesos.get(i)) || rangoMinimo2.equals(Pesos.get(i)))
           {
               Sugerencias.add(i+"");
           }
       }
        
       
       if(Sugerencias.size() > 10) { contador = 10; }
       else {contador = Sugerencias.size();}
       
       for (int i = 0; i < contador; i++) 
       {
        Random rand = new Random();
        String newitem = Sugerencias.get(rand.nextInt(Sugerencias.size()));
        
        if(Catalogo.contains(newitem))
        {
        while(true)
        {
            newitem = Sugerencias.get(rand.nextInt(Sugerencias.size()));
            if(!Catalogo.contains(newitem)) {break;}            
        }
        
        }
        Catalogo.add(newitem);
       }
                      
       int x =0;
      }
       
            
    private Double Minimos (ArrayList lista, int n){
        ArrayList<String> sortedlist = new ArrayList<>(lista); 
        Collections.sort(sortedlist); 
        double valor = Double.parseDouble(sortedlist.get(n));
        return valor;
    }
    
    public ArrayList<String> Almacenar(String campo)
    {
        ArrayList<String> retornar = new ArrayList<>();
        String[] tempo = campo.split(",");
        for(String s: tempo)
        {
            retornar.add(s);
        }
        return retornar;
    }
    
    
       
   
   }

   
   
   

