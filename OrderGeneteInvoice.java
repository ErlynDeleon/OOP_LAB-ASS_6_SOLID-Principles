public class OrderGeneteInvoice implements Invoice{
  
  @Override
  public void generateInvoice(String fileName) {
    // Simulate generating invoice file
    System.out.println("Invoice generated: " + fileName);
  }
}
