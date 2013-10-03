

/**
 *
 * @author paye
 */
import java.text.SimpleDateFormat;

import java.util.Date;
import java.text.ParseException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
public class DocumentJson {

   
    // variable d'instance
    private JSONObject jsonObj;
    private static int valeurOptions ;
       
    // constructeur
    public  DocumentJson(String jSonText) throws FileNotFoundException, IOException, IndexOutOfBoundsException {
        
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
    public int obtenirLaValeurDeAnnée(String valeur){
    return jsonObj.getInt(valeur);
    }
  
     public String getDate_de_naissance(String valeur, String conducteur ) {
        
        JSONObject date = (JSONObject) JSONSerializer.toJSON( conducteur );

    return date.getString(valeur);
    }
        public static void main(String[] args) throws FileNotFoundException, IOException, IndexOutOfBoundsException {
       //Obtenir les valeurs de voitures et de conducteur
          //  JSONObject jsonObj; // lire l objet
          // JSONObject voiture = (JSONObject) jsonObj.getJSONObject("voiture");
            //int annee = voiture.getInt("annee");
            
           boolean reponse1,reponse2,reponse3,SansReponse3,reponse4,reponse5;
           
           DocumentJson json = new DocumentJson("C:\\Users\\user\\Downloads\\library.json");
          
            String voiture=json.obtenirLaValeurDe("voiture");
            System.out.println(voiture);
             String conducteur=json.obtenirLaValeurDe("conducteur");
           System.out.println(conducteur);
            JSONObject voiture1 = (JSONObject) JSONSerializer.toJSON( voiture );
            int annee = voiture1.getInt( "annee" );
            if(annee == 2014 ){
               reponse1 =  true ;
            System.out.println(+annee);
            }
            String  marque = voiture1.getString("marque");
            if ( marque.compareToIgnoreCase("porsche") == 0){
                reponse2 = true ;
                 System.out.println(marque);
            }
        

           
          String  modele = voiture1.getString("modele");
             switch (modele ){
            
        case ("boxter") :
         valeurOptions =  60000 ;
            
            break;
            
            // LES CALCULS A FAIRE POUR LES PRIMES ET les RESULTATs DE L ASSURANCE 
             
          
            case ("Boxter S"):
                System.out.println("li");
                 valeurOptions = 72000;
                
                
                break;
            case ( "Cayman  "):
               valeurOptions =62000;
                break;
            case  ("Cayman S"): 
                 valeurOptions =75000;
                
                break;
            case ("911 Carrera"):
                 valeurOptions = 100000 ;
                break;
            case  ("911 Carrera S"):
                 valeurOptions = 115000;
                break;
            case ("911 Carrera Cabriolet "):
                 valeurOptions =112000;
               
                
                break;
                
            case ( "Carrera S Cabriolet") :
                 valeurOptions =129000;
                break;
            case ("Carrera 4S Cabriolet"):
                 valeurOptions =106000;
                break;
            case ("911 Carrera 4S"):
                 valeurOptions =123000;
                break;
            case ("Carrera 4 Cabriolet"):
                 valeurOptions = 120000;
                break;
            case ("911 Carrera 4S Cabriolet"):
                 valeurOptions = 137000;
                break;
            case ("Porsche 911 50 ans"):
                 valeurOptions = 142000;
                break;
            case ("911 Turbo"):
                 valeurOptions =170000;
                break;
            case ( "911 Turbo S"):
                 valeurOptions=207000;
                break;
            case ("911 GT3"):
                 valeurOptions =149000;
                break;
            case ( "Panamera "):
                 valeurOptions = 90000;
                break;
                
            case("Panamera 4") :
                 valeurOptions = 95000;
                break;
            case("Panamera S"):
                valeurOptions = 107000;
                break;
            case ( "Panamera S E-Hybride"):
                valeurOptions = 114000;
                break;
            case( "Panamera 4S"):
                valeurOptions = 113000;
                
                break;
            case ("Panamera 4S Executive "):
                valeurOptions = 144000;
                break;
            case ( "Panamera GTS "):
                valeurOptions  =130000;
                break;
            case ( " Panamera Turbo "):
                valeurOptions  = 162000;
                
                break;
            case("Panamera Turbo Executive"):
                 valeurOptions  = 185000;
                break;
            case ("Cayenne"):
              valeurOptions  = 59000;
                break;
            case ("Cayenne Diese"):
                valeurOptions  = 167000;
                break ;
                case ("Cayenne S "):
                valeurOptions  = 77000;
                    break ;
                case ("Cayenne S Hybride"):
                    valeurOptions  = 82000;
                    break ;
                    case ("Cayenne GTS"):
                    valeurOptions  = 96000;
                    break ;
                        case ("Cayenne Turbo "):
                    valeurOptions  = 125000;
                    break ;
                            case ("Cayenne Turbo S"):
                    valeurOptions  = 169000;
                    break ;
                

            default: 
                
               SansReponse3 =  true ;
            
            }
             String  burinage = voiture1.getString("burinage");
              if ( burinage.compareToIgnoreCase("PROACTIF") == 0){
                reponse4 = true ;
                 System.out.println(marque);
            }
              boolean Ouigarage = voiture1.getBoolean("garage_interieur");
              if( Ouigarage == true ){
                reponse4 =  true ;
           }
              boolean OuiAlarme =voiture1.getBoolean("systeme_alarme");
              if ( OuiAlarme == true ){
                reponse5 =  true ;
            }
            JSONObject conducteur1 = (JSONObject) JSONSerializer.toJSON( conducteur );
            String  dateDeNaissance  = conducteur1.getString ("date_de_naissance" );
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
try {

Date  vraiDate = simpleDateFormat.parse(dateDeNaissance );
           } catch (ParseException e) {
             // String dateDeNaissance = conducteur.getString("marque");
        }
        }
        //int annee = json.getInt("annee");
      
//J'arrive pas encore a isoler les valeurs de annees, marques, ....
         
        
}
