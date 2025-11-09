public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        System.out.println("Part 3 – Using classes and objects");

        // 测试 HealthProfessional 类 - 这些警告就会消失！
        HealthProfessional doctor1 = new HealthProfessional(100, "Dr. Zhang", "General Medicine");
        HealthProfessional doctor2 = new HealthProfessional(); // 使用默认构造器

        // 使用setter方法
        doctor2.setId(101);
        doctor2.setName("Dr. Wang");
        doctor2.setSpecialization("Surgery");

        // 调用printDetails方法
        doctor1.printDetails();
        doctor2.printDetails();

        // 使用getter方法
        System.out.println("Doctor 1 Name: " + doctor1.getName());
        System.out.println("Doctor 1 Specialization: " + doctor1.getSpecialization());

        System.out.println("---");
    }
}