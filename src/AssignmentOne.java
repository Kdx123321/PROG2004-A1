public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        System.out.println("Part 3 – Using classes and objects");

        // 创建3个全科医生对象
        GeneralPractitioner gp1 = new GeneralPractitioner(
                101,
                "Dr. Zhang Wei",
                "Family Medicine",
                true,
                "Downtown Medical Center"
        );

        GeneralPractitioner gp2 = new GeneralPractitioner(
                102,
                "Dr. Li Mei",
                "General Practice",
                true,
                "Westside Community Clinic"
        );

        GeneralPractitioner gp3 = new GeneralPractitioner(
                103,
                "Dr. Wang Gang",
                "Primary Care",
                false,
                "Eastside Health Center"
        );

        // 创建2个心脏科医生对象
        Cardiologist cardio1 = new Cardiologist(
                201,
                "Dr. Chen Xia",
                "Cardiology",
                true,
                "Heart Failure Research"
        );

        Cardiologist cardio2 = new Cardiologist(
                202,
                "Dr. Liu Yang",
                "Interventional Cardiology",
                true,
                "Cardiac Catheterization Techniques"
        );

        // 打印所有医疗专业人员详情
        System.out.println("=== 医疗专业人员列表 ===");
        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        cardio1.printDetails();
        cardio2.printDetails();

        System.out.println("---");

        // 演示getter方法的使用
        System.out.println("=== 使用Getter方法获取信息 ===");
        System.out.println("全科医生1的姓名: " + gp1.getName());
        System.out.println("全科医生1的诊所位置: " + gp1.getClinicLocation());
        System.out.println("心脏科医生1的研究方向: " + cardio1.getResearchFocus());
        System.out.println("心脏科医生2是否进行手术: " + cardio2.isPerformsSurgery());

        System.out.println("---");

        // 演示setter方法的使用
        System.out.println("=== 演示Setter方法 ===");
        gp1.setClinicLocation("New Central Clinic");
        System.out.println("全科医生1的新诊所位置: " + gp1.getClinicLocation());

        cardio1.setResearchFocus("Advanced Cardiac Imaging");
        System.out.println("心脏科医生1的新研究方向: " + cardio1.getResearchFocus());

        System.out.println("---");

        // 打印更新后的信息
        System.out.println("=== 更新后的医疗专业人员信息 ===");
        gp1.printDetails();
        cardio1.printDetails();

        System.out.println("---");
    }
}