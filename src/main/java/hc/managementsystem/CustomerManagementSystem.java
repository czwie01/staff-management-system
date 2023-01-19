package hc.managementsystem;

import java.util.LinkedList;
import java.util.List;

public class CustomerManagementSystem {
    private final List<Customer> customerList = new LinkedList<>();


    public void addCustomer(Customer newCustomer) {
        if(!customerList.contains(newCustomer)) {
            customerList.add(newCustomer);
        }
        else{
            throw new IllegalArgumentException("Customer Entry already exists in the System.");
        }
    }

    public void addCustomer(String name, Address address) {
        Customer newCustomer = new Customer(name, address);
        if(!customerList.contains(newCustomer)) {
            customerList.add(newCustomer);
        }
        else{
            throw new IllegalArgumentException("Customer Entry already exists in the System.");
        }
    }

    public void addCustomer(String name, String street, String houseNumber, String postalCode) {
        Customer newCustomer = new Customer(name, street, houseNumber, postalCode);
        if(!customerList.contains(newCustomer)) {
            customerList.add(newCustomer);
        }
        else{
            throw new IllegalArgumentException("Customer Entry already exists in the System.");
        }
    }

    public void changeCustomerDetails(Customer customer,String nameOfDetails, String detailsChange) {

        int indexOfCustomer = customerList.indexOf(customer);

        if(indexOfCustomer > -1) {

            Address address = customer.getAddress();

            switch(detailsChange) {
                case "Name":
                    customer.setName(detailsChange);
                    address.setName(detailsChange);
                    break;

                case "Street":
                    address.setStreet(detailsChange);
                    break;

                case "House Number":
                    address.setHouseNumber(detailsChange);
                    break;

                case "Postal Code":
                    address.setPostalCode(detailsChange);
                    break;

                default:
                    throw new IllegalArgumentException("Name of details should be: \"Name\", \"Street\" ,\"House Number\", or \"Postal Code\" " );
            }
        }
        else {
            throw new IllegalArgumentException("No entry for specified Customer in the system");
        }
    }
}
