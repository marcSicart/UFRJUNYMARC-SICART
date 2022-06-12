import java.util.List;
public class Institut {

    private List<Aula> aules;
    
    private String nom;

    public Institut(List<Aula> aules, String nom) {
        this.aules = aules;
        this.nom = nom;
    }
    
    public List<Aula> getAules() {
        return aules;
    }

    public void setAules(List<Aula> aules) {
        this.aules = aules;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
}
