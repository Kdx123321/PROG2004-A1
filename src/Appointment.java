public class Appointment {
    // 患者详情
    private String patientName;
    private String patientMobile;

    // 预约时间段
    private String timeSlot;

    // 选择的医生（使用基类类型，体现多态）
    private HealthProfessional doctor;

    // 默认构造器
    public Appointment() {
        this.patientName = "Unknown";
        this.patientMobile = "0000000000";
        this.timeSlot = "09:00";
        this.doctor = null;
    }

    // 带参数构造器
    public Appointment(String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    // 打印所有实例变量
    public void printAppointmentDetails() {
        System.out.println("=== 预约详情 ===");
        System.out.println("患者姓名: " + patientName);
        System.out.println("患者手机: " + patientMobile);
        System.out.println("预约时间: " + timeSlot);
        System.out.println("医生姓名: " + doctor.getName());
        System.out.println("医生类型: " + doctor.getClass().getSimpleName());
        System.out.println("医生专业: " + doctor.getSpecialization());
        System.out.println("================================");
    }

    // Getter和Setter方法
    public String getPatientName() { return patientName; }
    public void setPatientName(String patientName) { this.patientName = patientName; }

    public String getPatientMobile() { return patientMobile; }
    public void setPatientMobile(String patientMobile) { this.patientMobile = patientMobile; }

    public String getTimeSlot() { return timeSlot; }
    public void setTimeSlot(String timeSlot) { this.timeSlot = timeSlot; }

    public HealthProfessional getDoctor() { return doctor; }
    public void setDoctor(HealthProfessional doctor) { this.doctor = doctor; }
}