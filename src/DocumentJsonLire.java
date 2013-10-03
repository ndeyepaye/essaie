package projetsession;

/**
 *
 * @author Syllius
 */
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
    private int annee;
    private String marque;
    private String modele;
    private double valeur_des_options;
    private String burinage;
    private String garage_interieur;
    private String systeme_alarme;
    private String date_de_naissance;
    private String province;
    private String ville;
    private String sexe;
    private String date_fin_cours_de_conduite;
    private boolean cours_de_conduite_reconnus_par_CAA;
    private boolean premier_contrat;
    private int duree_contrat;
    private String voiture;
    private String conducteur;
    // constructeur
    public  DocumentJson(String jSonText) throws FileNotFoundException, IOException, IndexOutOfBoundsException {
        
         BufferedReader br = new BufferedReader(new FileReader(new File(jSonText)));
        
        String jSonText1 = "";
        String line = "";
        while((line = br.readLine()) != null){
            jSonText1+= line;
        }
        jsonObj = JSONObject.fromObject(jSonText1);
    
    }
  
    /**
     * @return the annee
     */
    public int getAnnee(String valeur) {
        JSONObject voiture1 = (JSONObject) JSONSerializer.toJSON( voiture );
    return voiture1.getInt(valeur);
    }

    /**
     * @param annee the annee to set
     */
    public void setAnnee(int annee) {
        this.annee = annee;
    }

    /**
     * @return the marque
     */
    public String getMarque(String valeur) {
        JSONObject marque1 = (JSONObject) JSONSerializer.toJSON( voiture );

    return marque1.getString(valeur);
    }

    /**
     * @param marque the marque to set
     */
    public void setMarque(String marque) {
        this.marque = marque;
    }

    /**
     * @return the modele
     */
    public String getModele(String valeur) {
        JSONObject modele1 = (JSONObject) JSONSerializer.toJSON( voiture );

    return modele1.getString(valeur);
        
    }

    /**
     * @param modele the modele to set
     */
    public void setModele(String modele) {
        this.modele = modele;
    }

    /**
     * @return the valeur_des_options
     */
    public double getValeur_des_options(String valeur) {
        JSONObject option1 = (JSONObject) JSONSerializer.toJSON( voiture );

    return option1.getDouble(valeur);
    }

    /**
     * @param valeur_des_options the valeur_des_options to set
     */
    public void setValeur_des_options(double valeur_des_options) {
        this.valeur_des_options = valeur_des_options;
    }

    /**
     * @return the burinage
     */
    public String getBurinage(String valeur) {
        JSONObject burinage1 = (JSONObject) JSONSerializer.toJSON( voiture );

    return burinage1.getString(valeur);
    }

    /**
     * @param burinage the burinage to set
     */
    public void setBurinage(String burinage) {
        this.burinage = burinage;
    }

    /**
     * @return the garage_interieur
     */
    public String getGarage_interieur(String valeur) {
        JSONObject garage1 = (JSONObject) JSONSerializer.toJSON( voiture );

    return garage1.getString(valeur);
     
    }

    /**
     * @param garage_interieur the garage_interieur to set
     */
    public void setGarage_interieur(String garage_interieur) {
        this.garage_interieur = garage_interieur;
    }

    /**
     * @return the systeme_alarme
     */
    public String getSysteme_alarme(String valeur) {
       JSONObject alarme1 = (JSONObject) JSONSerializer.toJSON( voiture );

    return alarme1.getString(valeur);
    }

    /**
     * @param systeme_alarme the systeme_alarme to set
     */
    public void setSysteme_alarme(String systeme_alarme) {
        this.systeme_alarme = systeme_alarme;
    }

    /**
     * @return the date_de_naissance
     */
    public String getDate_de_naissance(String valeur) {
        JSONObject date = (JSONObject) JSONSerializer.toJSON( conducteur );

    return date.getString(valeur);
    }

    /**
     * @param date_de_naissance the date_de_naissance to set
     */
    public void setDate_de_naissance(String date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }

    /**
     * @return the province
     */
    public String getProvince(String valeur) {
        JSONObject province1 = (JSONObject) JSONSerializer.toJSON( conducteur );

        return province1.getString(valeur);
    }

    /**
     * @param province the province to set
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return the ville
     */
    public String getVille(String valeur) {
                JSONObject ville1 = (JSONObject) JSONSerializer.toJSON( conducteur );

        return ville1.getString(valeur);
    }

    /**
     * @param ville the ville to set
     */
    public void setVille(String ville) {
        this.ville = ville;
    }

    /**
     * @return the sexe
     */
    public String getSexe(String valeur) {
                JSONObject sexe1 = (JSONObject) JSONSerializer.toJSON( conducteur );

        return sexe1.getString(valeur);
    }

    /**
     * @param sexe the sexe to set
     */
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    /**
     * @return the date_fin_cours_de_conduite
     */
    public String getDate_fin_cours_de_conduite(String valeur) {
                JSONObject date1 = (JSONObject) JSONSerializer.toJSON( conducteur );

        return date1.getString(valeur);
    }

    /**
     * @param date_fin_cours_de_conduite the date_fin_cours_de_conduite to set
     */
    public void setDate_fin_cours_de_conduite(String date_fin_cours_de_conduite) {
        this.date_fin_cours_de_conduite = date_fin_cours_de_conduite;
    }

    /**
     * @return the cours_de_conduite_reconnus_par_CAA
     */
    public boolean isCours_de_conduite_reconnus_par_CAA(String valeur) {
                JSONObject cours1 = (JSONObject) JSONSerializer.toJSON( conducteur );

        return cours1.getBoolean(valeur);
        
    }

    /**
     * @param cours_de_conduite_reconnus_par_CAA the cours_de_conduite_reconnus_par_CAA to set
     */
    public void setCours_de_conduite_reconnus_par_CAA(boolean cours_de_conduite_reconnus_par_CAA) {
        this.cours_de_conduite_reconnus_par_CAA = cours_de_conduite_reconnus_par_CAA;
    }

    /**
     * @return the premier_contrat
     */
    public boolean isPremier_contrat(String valeur) {
                     JSONObject contrat1 = (JSONObject) JSONSerializer.toJSON( conducteur );
   
        return contrat1.getBoolean(valeur);
    }

    /**
     * @param premier_contrat the premier_contrat to set
     */
    public void setPremier_contrat(boolean premier_contrat) {
        this.premier_contrat = premier_contrat;
    }

    /**
     * @return the duree_contrat
     */
    public int getDuree_contrat(String valeur) throws Exception{
     DocumentJson json = new DocumentJson("library.json");
          
             duree_contrat=jsonObj.getInt("duree_contrat");
             return duree_contrat;
    }

    /**
     * @param duree_contrat the duree_contrat to set
     */
    public void setDuree_contrat(int duree_contrat) {
        this.duree_contrat = duree_contrat;
    }

    /**
     * @return the voiture
     */
    public String getVoiture() throws Exception{
        DocumentJson json = new DocumentJson("library.json");
          
             voiture=jsonObj.getString("voiture");
        return voiture;
    }

    /**
     * @param voiture the voiture to set
     */
    public void setVoiture(String voiture) {
        this.voiture = voiture;
    }

    /**
     * @return the conducteur
     */
    public String getConducteur() throws Exception{
        DocumentJson json = new DocumentJson("library.json");
          
             conducteur=jsonObj.getString("conducteur");
        return conducteur;
    }

    /**
     * @param conducteur the conducteur to set
     */
    public void setConducteur(String conducteur) {
        this.conducteur = conducteur;
    }
    
       public static void main(String[] args) throws Exception {
     
            DocumentJson json = new DocumentJson("library.json");
          
            System.out.println(json.getVoiture());
            System.out.println(json.getConducteur());
            int annee=json.getAnnee("annee");
       
           System.out.println(+annee);
                        String marque=json.getMarque("marque");
                        
           System.out.println(marque);
double option=json.getValeur_des_options("valeur_des_options");
System.out.println(+option);

String date =json.getDate_de_naissance("date_de_naissance");
           System.out.println(date);
       boolean cours=json.isCours_de_conduite_reconnus_par_CAA("cours_de_conduite_reconnus_par_CAA");
           System.out.println(cours); 
      int duree=json.getDuree_contrat("duree_contrat");
           System.out.println(+duree);
       }
      
}
