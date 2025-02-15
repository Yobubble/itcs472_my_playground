package HolidayTravelVehicles;

import java.util.ArrayList;

public class Invoice {
  private int invoiceID;
  private double finalPrice = 0.00;
  private Customer customer;
  private Vehicle vehicle;
  private TradeInVehicle tradeInVehicle;
  private Salesperson salesperson;
  private ArrayList<DealerInstallOptions> dealerInstallOptions;
  private static int nextID = 1;

  public Invoice(Customer customer, Vehicle vehicle, TradeInVehicle tradeInVehicle, Salesperson salesperson, ArrayList<DealerInstallOptions> dealerInstallOptions) {
    this.invoiceID = nextID++;
    this.customer = customer;
    this.vehicle = vehicle;
    this.tradeInVehicle = tradeInVehicle;
    this.salesperson = salesperson;
    this.dealerInstallOptions = dealerInstallOptions;
  }

  public int getInvoiceID() {
    return this.invoiceID;
  }
}
