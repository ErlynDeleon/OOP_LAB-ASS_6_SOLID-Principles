public class OrderTest {

  public static void main(String[] args) {
    Order order = new OrderAction();
    order.calculateTotal(10.0, 2);
    order.placeOrder("John Doe", "123 Main St");

    OrderGeneteInvoice orderInvoice = new OrderGeneteInvoice();
    orderInvoice.generateInvoice("order_123.pdf");

    OrderEmailNotification orderNotification = new OrderEmailNotification();
    orderNotification.sendEmailNotification("johndoe@example.com");
  }
}

 