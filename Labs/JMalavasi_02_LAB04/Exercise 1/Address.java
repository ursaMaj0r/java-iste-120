/**
 * Address - Class to model a single address
 * @author  J. Malavasi
 * @version 20210218
 */
 
public class Address 
{
   // attributes of an Address
   private String street;
   private String city;
   private String state;
   private int zip;
   
   /**
    * Address constructor.
    * @param street the street of the address
    * @param city  the city of the address
    * @param state the state of the address
    * @param zip the zip of the address
    */
   public Address(String street, String city, String state, int zip) 
   {
     this.street = street;
     this.city = city;
     this.state = state;
     this.zip = zip;
   }
   
    /**
    * toString - Accessor to print address information
    * @return the full address
    */
   public String toString() {
      String output = street + System.lineSeparator() + city + ", " + state + " " + zip;
      return output;
   }
}