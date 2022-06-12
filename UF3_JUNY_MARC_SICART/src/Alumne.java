public class Alumne extends Persona {

    private String dataNaixement;

    private int codi;

    public Alumne(String dataNaixement, int codi, String nom, String cognom1, String cognom2, String email) {
        super(nom, cognom1, cognom2, email);
        this.dataNaixement = dataNaixement;
        this.codi = codi;
    }

    public String getDataNaixement() {
        return dataNaixement;
    }

    public void setDataNaixement(String dataNaixement) {
        this.dataNaixement = dataNaixement;
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }
    
    
}
