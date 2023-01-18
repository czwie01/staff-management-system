package hc.managementsystem;

public class StaffManagementSystem {
    public static void main(String[] args) {
        Address addressM = new Address("nameA surnameA","street A","1","00000");
        StaffMember m = new StaffMember("nameA","surnameA", addressM);
        StaffMember n = new StaffMember("nameB","surnameA", addressM);
        System.out.println( m.equals(n));
    }
}