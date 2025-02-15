package HolidayTravelVehicles;

import java.util.ArrayList;

public class Vehicle {
  private int serialNumber;
  private String name;
  private String model;
  private int year;
  private String manufacturer;
  private double baseCost;
  private Invoice invoices;
  private Salesperson salespersons;

  public Vehicle(int serialNumber, String name, String model, int year, String manufacturer, double baseCost) {
    this.serialNumber = serialNumber;
    this.name = name;
    this.model = model;
    this.year = year;
    this.manufacturer = manufacturer;
    this.baseCost = baseCost;
    this.invoices = null;
    this.salespersons = null;
  }

  public void setInvoice(Invoice invoice) {
    this.invoices = invoice;
  }

  public void setSalesPerson(Salesperson salesperson) {
    this.salespersons = salesperson;
  }

  public String getVehicleInformation() {
    return "Serial Number: " + serialNumber + "\nName: " + name + "\nModel: " + model + "\nYear: " + year + "\nManufacturer: " + manufacturer + "\nBase Cost: " + baseCost + "\n sold by: " +  this.salespersons.getName() + "\n invoice id: " + this.invoices.getInvoiceID();
  }
}
