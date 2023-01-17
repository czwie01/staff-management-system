package hc.managementsystem;

public class StaffManagementSystem {
    public static void main(String[] args) {
        Anschrift anschriftA = new Anschrift("MaxMusterMannA","StrasseA","01", "00000");
        Anschrift anschriftB = new Anschrift("MaxMusterMannA","StrasseA","01", "00001");
        System.out.println( anschriftA.compareTo(anschriftB));
    }
}