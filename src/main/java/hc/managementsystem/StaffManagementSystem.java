package hc.managementsystem;

public class StaffManagementSystem {
    public static void main(String[] args) {
        Address addressA = new Address("MaxMusterMannA","StrasseA","01", "00000");
        Address addressB = new Address("MaxMusterMannA","StrasseA","01", "00000");
        System.out.println( addressA.equals(addressB));
    }
}