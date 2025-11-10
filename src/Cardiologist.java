public class Cardiologist extends HealthProfessional {
    private boolean performsSurgery;
    private String researchFocus;

    // 默认构造器
    public Cardiologist() {
        super();
        this.performsSurgery = false;
        this.researchFocus = "Cardiac Health";
    }

    // 带参数构造器
    public Cardiologist(int id, String name, String specialization,
                        boolean performsSurgery, String researchFocus) {
        super(id, name, specialization);
        this.performsSurgery = performsSurgery;
        this.researchFocus = researchFocus;
    }

    // 打印详细信息
    @Override
    public void printDetails() {
        System.out.println("Health Professional Type: Cardiologist");
        super.printDetails();
        System.out.println("Performs Surgery: " + performsSurgery);
        System.out.println("Research Focus: " + researchFocus);
        System.out.println("------------------------");
    }

    // Getter和Setter方法
    public boolean isPerformsSurgery() {
        return performsSurgery;
    }

    public void setPerformsSurgery(boolean performsSurgery) {
        this.performsSurgery = performsSurgery;
    }

    public String getResearchFocus() {
        return researchFocus;
    }

    public void setResearchFocus(String researchFocus) {
        this.researchFocus = researchFocus;
    }
}