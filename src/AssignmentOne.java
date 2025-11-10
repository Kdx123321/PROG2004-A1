import java.util.ArrayList;

public class AssignmentOne {
    // Part 5: 使用ArrayList存储预约对象
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        System.out.println("Part 3 – Using classes and objects");

        // 创建3个全科医生对象
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Zhang Wei", "Family Medicine", true, "Downtown Medical Center");
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Li Mei", "General Practice", true, "Westside Community Clinic");
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Dr. Wang Gang", "Primary Care", false, "Eastside Health Center");

        // 创建2个心脏科医生对象
        Cardiologist cardio1 = new Cardiologist(201, "Dr. Chen Xia", "Cardiology", true, "Heart Failure Research");
        Cardiologist cardio2 = new Cardiologist(202, "Dr. Liu Yang", "Interventional Cardiology", true, "Cardiac Catheterization");

        // 打印所有医疗专业人员详情
        System.out.println("=== 医疗专业人员列表 ===");
        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        cardio1.printDetails();
        cardio2.printDetails();

        System.out.println("---");

        // Part 5 – Collection of appointments
        System.out.println("Part 5 – Collection of appointments");

        // 创建预约 - 体现多态性：可以接受任何HealthProfessional子类
        System.out.println("=== 创建预约 ===");
        createAppointment("张三", "0412345678", "09:00", gp1);
        createAppointment("李四", "0498765432", "10:30", gp2);
        createAppointment("王五", "0432145698", "14:00", cardio1);
        createAppointment("赵六", "0456789123", "15:30", cardio2);

        // 打印现有预约
        System.out.println("\n=== 打印所有预约 ===");
        printExistingAppointments();

        // 取消一个预约
        System.out.println("\n=== 取消预约 ===");
        cancelBooking("0498765432");

        // 再次打印显示更新后的集合
        System.out.println("\n=== 取消后的预约列表 ===");
        printExistingAppointments();

        // 测试错误情况
        System.out.println("\n=== 测试错误情况 ===");
        cancelBooking("0000000000"); // 不存在的手机号
        createAppointment("", "0411111111", "16:00", gp3); // 缺少患者姓名

        System.out.println("---");
    }

    // 创建预约方法 - 体现多态性：可以处理任何HealthProfessional子类
    public static void createAppointment(String patientName, String patientMobile,
                                         String timeSlot, HealthProfessional doctor) {
        if (patientName != null && !patientName.isEmpty() &&
                patientMobile != null && !patientMobile.isEmpty() &&
                timeSlot != null && !timeSlot.isEmpty() &&
                doctor != null) {

            Appointment newAppointment = new Appointment(patientName, patientMobile, timeSlot, doctor);
            appointments.add(newAppointment);
            System.out.println("✅ 预约创建成功: " + patientName + " - " + timeSlot + " - " + doctor.getName());
        } else {
            System.out.println("❌ 错误: 必须提供所有预约信息。");
        }
    }

    // 打印现有预约
    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("📝 暂无预约。");
        } else {
            System.out.println("📋 现有预约列表 (共 " + appointments.size() + " 个预约):");
            for (int i = 0; i < appointments.size(); i++) {
                System.out.println("预约 #" + (i + 1) + ":");
                appointments.get(i).printAppointmentDetails();
            }
        }
    }

    // 取消预约
    public static void cancelBooking(String patientMobile) {
        boolean found = false;
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getPatientMobile().equals(patientMobile)) {
                String patientName = appointments.get(i).getPatientName();
                System.out.println("❌ 取消预约: " + patientName + " (手机: " + patientMobile + ")");
                appointments.remove(i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("⚠️  错误: 未找到手机号为 " + patientMobile + " 的预约。");
        }
    }
}