package nasa;


/*

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.File;

import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
/**
 *
 * @author paye
 */
/*
public class mamy {
    private JSONObject jsonObj;
    public  mamy(String jSonText) throws FileNotFoundException, IOException, IndexOutOfBoundsException {
        
         BufferedReader br = new BufferedReader(new FileReader(new File(jSonText)));
        
        String jSonText1 = "";
        String line = "";
        while((line = br.readLine()) != null){
            jSonText1+= line;
        }
        jsonObj = JSONObject.fromObject(jSonText1);
    //System.out.println(jsonObj);
//return jsonObj;
    }
    
    public JSONObject getJsonObject() {
        return jsonObj;
    }
    
    
    public String obtenirLaValeurDe(String valeur){
        return jsonObj.getString(valeur);
    }
    
    public  int ObteniLaValeurDeAnnÃ©e(String valeur){
    return jsonObj.getInt(valeur);
    }
    
        public static  boolean huite (JSONObject document,String text)throws FileNotFoundException, IOException{
      
            boolean reponse1=false,reponse2=false,reponse4=false,reponse5=false,SansReponse3=false;
         
      JSONObject root =  ( JSONObject)JSONSerializer.toJSON(text) ;
       
               
        
        
             
             
            if(root.getString("annee").compareTo("2014") == 0){
                reponse1 =  true ;
           }
        if (root.getString("voiture").compareToIgnoreCase("porsche")==0){
            reponse2 = true ;
        }
         switch (document.getString("modele") ){
            
        case ("boxter") :
            break;
            
            // LES CALCULS A FAIRE POUR LES PRIMES ET les RESULTATs DE L ASSURANCE 
             
          
            case ("Cayman"):
                
                break;
            case ( "Carrera"):
              //  solution =  60000;
                break;
            case  ("911 Carrera"): 
                
                break;
            case ("911 Cabriolet Carrera"):
                break;
            case  ("911 Carrera S Cabriolet"):
                break;
            case ("Carrera 4S Cabriolet"):
                break;
                
            case ( "Turbo S") :
                break;
            case ("911 Turbo"):
                break;
            case ("911 Turbo S"):
                break;
            case ("911 GT3"):
                break;
            case ("Panamera"):
                break;
            case ("Panamera S"):
                break;
            case ("Panamera S E-Hybride"):
                break;
            case ( "Panamera 4S"):
                break;
            case ("Panamera GTS"):
                break;
            case ( "Panamera Turbo"):
                break;
                
            case("Panamera Turbo Executive") :
                break;
            case("Cayenne"):
                break;
            case ( "Cayenne Diesel"):
                break;
            case( "Cayenne S"):
                break;
            case ("Cayenne S Hybride"):
                break;
            case ( "Cayenne GTS"):
                break;
            case ( " Cayenne Turbo"):
                break;
            case("Cayenne Turbo S"):
                break;
            default: 
               SansReponse3 =  true ;
    }
           if(root.getString("burinage").compareTo("PROACTIF") == 0){
                reponse4 =  true ;
           }
           
if(root.getBoolean("garage_interieur") == true ){
                reponse4 =  true ;
           }
if ( root.getBoolean("systeme_alarm") == true ){
                reponse5 =  true ;
}
        }
        
return (  reponse1 &&  reponse2 && (!SansReponse3)&& reponse4 && reponse5 );
        
    }

}
    
    
*/