package hc.managementsystem;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Customer implements Comparable<Customer>{
    private String name;
    private Address address;
    private final List<Project> customerProjectList = new LinkedList<>();

    public Customer(String name, String street, String houseNumber, String postalCode) {
        this.name = name;
        this.address = new Address(name, street, houseNumber, postalCode);
    }

    public Customer(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String name, String street, String houseNumber, String postalCode) {
        this.address = new Address(name, street, houseNumber, postalCode);
    }

    public void addProjectToCustomer(Project project){
        if(customerProjectList.contains(project)){
            throw new IllegalArgumentException("Project is already assigned to the project.");
        }
        else{
            customerProjectList.add(project);
        }
    }

    public void removeProjectFromCustomer(Project project){
        if(customerProjectList.contains(project)){
            customerProjectList.remove(project);
        }
        else{
            throw new IllegalArgumentException("Project is not assigend to this customer.");
        }
    }

    public String toString(){
        return this.name;
    }

    @Override
    public int compareTo(Customer o) {
        if(this.name.compareTo(o.getName()) != 0){
            return this.name.compareTo(o.getName());
        }
        else {
            return this.address.compareTo(o.getAddress());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return this.name.equals(customer.getName())
                && this.address.equals(customer.getAddress())
                ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name,
                this.address)
                ;
    }

}

