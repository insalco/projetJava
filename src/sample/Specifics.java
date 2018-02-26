package sample;

public class Specifics {

    /**
     * Constitution des attributs relatifs aux maladies, médicaments et traitements.
     */
    private String maladie;
    private String medicaments;
    private String traitement;

    /**
     * Constitution des attributs relatifs aux maladies, medicaments et traitements.
     * @param MALADIE
     * @param MEDICAMENTS
     * @param TRAITEMENT
     */
    public Specifics(String MALADIE, String MEDICAMENTS, String TRAITEMENT){

        this.setMaladie(MALADIE);
        this.setMedicaments(MEDICAMENTS);
        this.setTraitement(TRAITEMENT);

}

    /**
     *
     * @return
     */


    public String getMaladie() {
        return maladie;
    }

    public void setMaladie(String maladie) {
        this.maladie = maladie;
    }

    public String getMedicaments() {
        return medicaments;
    }

    public void setMedicaments(String medicaments)
    {
        this.medicaments = medicaments;
    }

    public String getTraitement() {
        return traitement;
    }

    public void setTraitement(String traitement) {
        this.traitement = traitement;
    }


}