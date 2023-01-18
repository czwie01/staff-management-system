package hc.managementsystem;

public class Customer implements Comparable<Customer>{
    private String name;
    private Address address;

    public Customer(String name, String strasse, String hausnummer, String plz) {
        this.name = name;
        this.address = new Address(name, strasse, hausnummer, plz);
    }

    public String getName() {
        return name;
    }

    public Address getAnschrift() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnschrift(String name, String strasse, String hausnummer, String plz) {
        this.address = new Address(name, strasse, hausnummer, plz);
    }

    @Override
    public int compareTo(Customer o) {
        if(this.name.compareTo(o.getName()) != 0){
            return this.name.compareTo(o.getName());
        }
        else {
            return this.address.compareTo(o.getAnschrift());
        }
    }
}

