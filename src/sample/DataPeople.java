package sample;

public class DataPeople {

    private String nom;
    private String prenom;
    private String place;
    private String sex;
    private String nationality;
    private String annees;

    /**
     * Constitution des attributs relatifs aux noms, prenom, Place, sex, nationalité et années.
     * @param NOM
     * @param PRENOM
     * @param PLACE
     * @param SEX
     * @param NATIONALITY
     * @param ANNEES
     */
    public DataPeople(String NOM, String PRENOM, String PLACE, String SEX, String NATIONALITY, String ANNEES) {
        this.setNom(NOM);
        this.setPrenom(PRENOM);
        this.setPlace(PLACE);
        this.setSex(SEX);
        this.setNationality(NATIONALITY);
        this.setAnnees(ANNEES);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom)
    {
        this.prenom = prenom; }


    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality)
    {
        this.nationality = nationality;
    }

    public String getAnnees() {
        return annees;
    }

    public void setAnnees(String annees) {
        this.annees = annees;
    }

}
