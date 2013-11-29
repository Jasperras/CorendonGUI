/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Create;


/**
 *
 * @author Maarten
 */
public class Customer {
  private int customerid;
  private String firstname;
  private String lastname;
  private String postalcode;
  private String address;
  private String residence;
  private String destination;
  private int phone;
  private String email;
  private String notes;

    public Customer(int customerid, String firstname, String lastname, String postalcode, String address, String residence, String destination, int phone, String email, String notes) {
        this.customerid = customerid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.postalcode = postalcode;
        this.address = address;
        this.residence = residence;
        this.destination = destination;
        this.phone = phone;
        this.email = email;
        this.notes = notes;
    }

    public Customer() {
    }

    

    public int getCustomerid() {
        return customerid;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public String getAddress() {
        return address;
    }

    public String getResidence() {
        return residence;
    }

    public String getDestination() {
        return destination;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getNotes() {
        return notes;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    
  
  
    
}
