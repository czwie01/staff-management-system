package hc.managementsystem;

import java.util.Objects;

public class Address implements Comparable<Address> {
    private String name;
    private String street;
    private String houseNumber;
    private String postalCode;

    public Address(String name, String street, String houseNumber, String postalCode) {

        this.name = name;
        this.street = street;
        this.houseNumber = houseNumber;
        this.postalCode = postalCode;
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    String getAddressLine(){
        return this.name+" "+this.street+" "+this.houseNumber+" "+this.postalCode;
    }



    @Override
    public int compareTo(Address o) {

        if(this.name.compareTo(o.getName()) != 0) {

            return this.name.compareTo(o.getName());

        }
        else if (this.street.compareTo(o.getStreet()) != 0) {

            return this.street.compareTo(o.getStreet());

        }
        else if (this.houseNumber.compareTo(o.getHouseNumber()) != 0) {

            return this.houseNumber.compareTo(o.getHouseNumber());
        }
        else {

            return this.postalCode.compareTo(o.getPostalCode());

        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return this.name.equals(address.getName())
                && this.street.equals(address.getStreet())
                && this.houseNumber.equals(address.getHouseNumber())
                && this.postalCode.equals(address.getPostalCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name,
                this.street,
                this.houseNumber,
                this.postalCode);
    }
}
