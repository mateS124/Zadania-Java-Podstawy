package pl.sdacademy.java.basic.exercises.Day3.Task9;

import java.util.Objects;


public class OrderItem extends Order {
    private static String productName;
    private static int quantity;
    private static double price;

    public OrderItem(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public static double getAmount(){

        return quantity * price;
    }

    public int getQuantity() {
        return quantity;
    }

    public static double getPrice() {

        return price;
    }

    public static String getProductName() {
        return productName;
    }

    public boolean isCorrect(){
        if (price < 0 || quantity < 0){
            return false;
        }
        return true;
    }

    public static void print(OrderItem orderItem){
        //for(OrderItem orderItem : orderItems) {
            System.out.println(OrderItem.getProductName() + "|" + OrderItem.getPrice() + "|" + OrderItem.getAmount());
       // }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderItem)) return false;
        OrderItem orderItem = (OrderItem) o;
        return quantity == orderItem.quantity && Double.compare(orderItem.price, price) == 0 && Objects.equals(productName, orderItem.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, quantity, price);
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
