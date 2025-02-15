package HolidayTravelVehicles;

public class main {
  public static void main(String[] args) {
    Customer c1 = new Customer("Thanachot Onlamoon", "082-322-4222", "Bangkok, RAMA 9");
    Vehicle v1 = new Vehicle(001, "Toyota", "Camry", 2019, null, 25000.00); 
    Salesperson s1 = new Salesperson("Chaiyong", "081-234-5678", "Bangkok, RAMA 11");

    Invoice i1 = new Invoice(c1, v1, null, s1, null);
    v1.setInvoice(i1);
    v1.setSalesPerson(s1);
    System.out.println(v1.getVehicleInformation());
  }
}
