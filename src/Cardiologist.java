// Cardiologist.java
public class Cardiologist extends HealthProfessional {
    private boolean performsSurgery;
    private String researchFocus;

    public Cardiologist() {
        super();
        this.performsSurgery = false;
        this.researchFocus = "Cardiac Health";
    }

    public Cardiologist(int id, String name, String specialization,
                       boolean performsSurgery, String researchFocus) {
        super(id, name, specialization);
        this.performsSurgery = performsSurgery;
        this.researchFocus = researchFocus;
    }

    @Override
    public void printDetails() {
        System.out.println("Health Professional Type: Cardiologist");
        super.printDetails();
        System.out.println("Performs Surgery: " + performsSurgery);
        System.out.println("Research Focus: " + researchFocus);
        System.out.println("------------------------");
    }
}
public boolean isPerformsSurgery() {
    return performsSurgery;
}

public String getResearchFocus() {
    return researchFocus;
}

public void setPerformsSurgery(boolean performsSurgery) {
    this.performsSurgery = performsSurgery;
}

public void setResearchFocus(String researchFocus) {
    this.researchFocus = researchFocus;
}
}