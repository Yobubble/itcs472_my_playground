package HolidayTravelVehicles;

import java.util.ArrayList;

public class Customer { 
  private int customerID;
  private String name;
  private String phoneNumber;
  private String address;
  private static int nextID = 0;
  private ArrayList<Invoice> invoices;

  public Customer(String name, String phoneNumber, String address) {
    this.customerID = nextID++;
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.address = address;
    this.invoices = new ArrayList<Invoice>();
  }
}
