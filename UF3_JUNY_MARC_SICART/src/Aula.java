import java.util.List;
public class Aula {

    private String nom;

    private int capacitat;

    private int ordinadors;

    private List<Persona> alumnes;

    public Aula(String nom, int capacitat, int ordinadors, List<Persona> alumnes) {
        this.nom = nom;
        this.capacitat = capacitat;
          if(ordinadors > this.capacitat){
            this.ordinadors = capacitat;
        }
        else{
            this.ordinadors = ordinadors;
        }
        this.alumnes = alumnes;
    }
    
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCapacitat() {
        return capacitat;
    }

    public void setCapacitat(int capacitat) {
        this.capacitat = capacitat;
    }

    public int getOrdinadors() {
        return ordinadors;
    }

    public void setOrdinadors(int ordinadors) {
        if(ordinadors > this.capacitat){
            this.ordinadors = capacitat;
        }
        else{
            this.ordinadors = ordinadors;
        }
    }

    public List<Persona> getAlumnes() {
        return alumnes;
    }

    public void setAlumnes(List<Persona> alumnes) {
        this.alumnes = alumnes;
    }
    
    
}
