public class Profesor extends Persona {

    private String tipus;

    private String carrec;

    public Profesor(String tipus, String carrec, String nom, String cognom1, String cognom2, String email) {
        super(nom, cognom1, cognom2, email);
        this.tipus = tipus;
        this.carrec = carrec;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getCarrec() {
        return carrec;
    }

    public void setCarrec(String carrec) {
        this.carrec = carrec;
    }
    
    
}
