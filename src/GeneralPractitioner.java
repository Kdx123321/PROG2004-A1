public class GeneralPractitioner extends HealthProfessional {
    private boolean canPrescribeMedication;
    private String clinicLocation;

    public GeneralPractitioner() {
        super();
        this.canPrescribeMedication = true;
        this.clinicLocation = "Main Clinic";
    }

    public GeneralPractitioner(int id, String name, String specialization,
                               boolean canPrescribeMedication, String clinicLocation) {
        super(id, name, specialization);
        this.canPrescribeMedication = canPrescribeMedication;
        this.clinicLocation = clinicLocation;
    }

    @Override
    public void printDetails() {
        System.out.println("Health Professional Type: General Practitioner");
        super.printDetails();
        System.out.println("Can Prescribe Medication: " + canPrescribeMedication);
        System.out.println("Clinic Location: " + clinicLocation);
        System.out.println("------------------------");
    }
    // Getter方法
    public boolean isCanPrescribeMedication() {
        return canPrescribeMedication;
    }

    public String getClinicLocation() {
        return clinicLocation;
    }

    // Setter方法
    public void setCanPrescribeMedication(boolean canPrescribeMedication) {
        this.canPrescribeMedication = canPrescribeMedication;
    }

    public void setClinicLocation(String clinicLocation) {
        this.clinicLocation = clinicLocation;
    }
}