package hc.managementsystem;

import java.util.LinkedList;

public class StaffMember implements Comparable<StaffMember>{
    private String name;
    private String surname;
    private Address address;
    private LinkedList<Object> activitiesAndProjects;

    private boolean isActive = true;
    private boolean isOnVacation = false;
    private boolean isOnSickLeave = true;
    public StaffMember(String name, String surname, String street, String houseNumber, String postalCode) {
        this.name = name;
        this.surname = surname;
        String adressname = name+" "+surname;
        this.address = new Address(adressname, street, houseNumber, postalCode);
    }

    public StaffMember(String name, String surname, Address address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }


    public Address getAddress() {
        return this.address;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setIsOnVacation(boolean isOnVacation) {
        this.isOnVacation = isOnVacation;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setIsOnSickLeave(boolean isOnSickLeave) {
        this.isOnSickLeave = isOnSickLeave;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public int compareTo(StaffMember o) {
        if(this.name.compareTo(o.getName()) !=0) {

            return this.name.compareTo(o.getName());

        }
        else if (this.surname.compareTo(o.getSurname()) !=0) {

            return this.surname.compareTo(o.getSurname());

        }
        else {

            return this.address.compareTo(o.getAddress());

        }
    }
}
