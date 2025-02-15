package HolidayTravelVehicles;

import java.util.ArrayList;

public class Salesperson {
  private int salespersonID;
  private String name;
  private String phoneNumber;
  private String address;
  private static int nextID = 1;
  private ArrayList<Invoice> invoices;
  private ArrayList<Vehicle> vehiclesSold;

  public Salesperson(String name, String phoneNumber, String address) {
    this.salespersonID = nextID++;
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.address = address;
    this.invoices = new ArrayList<Invoice>();
    this.vehiclesSold = new ArrayList<Vehicle>();
  }

  public String getName() {
    return this.name;
  }
}
