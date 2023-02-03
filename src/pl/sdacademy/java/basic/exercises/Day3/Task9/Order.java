package pl.sdacademy.java.basic.exercises.Day3.Task9;

import pl.sdacademy.java.basic.exercises.Day3.Task9.OrderItem;

import java.util.Arrays;
import java.util.Objects;

public class Order {
    private static int nextIndex = 0;
    private static int maxOrderItem;
     static OrderItem[] orderItems;

    public Order(int maxOrderItem) {
        Order.maxOrderItem = maxOrderItem;
        orderItems = new OrderItem[maxOrderItem];
    }

    public Order() {
    }

    public static boolean addItem(OrderItem orderItem) {
        if(nextIndex >= maxOrderItem) {
            System.out.println("order is full");
            return false;
        }
        if(!orderItem.isCorrect()) {
            System.out.println("item is incorrect");
            return false;
        }
        orderItems[nextIndex] = orderItem;
        nextIndex++;
        return true;
    }

    public static double getTotalAmount() {
        double totalAmount = 0;
        for(OrderItem orderItem : orderItems) {
            if(orderItem != null) {
                totalAmount += orderItem.getPrice();
            }
        }
        return totalAmount;
        /*totalAmount =  Math.round(totalAmount * 100); // wyświetlanie dwóch miejsc po przecinku
        return totalAmount/100;*/
    }

    public static int getItemsCount() {
        int total = 0;
        for(OrderItem orderItem : orderItems) {
            if(orderItem != null) {
                total += orderItem.getQuantity();
            }
        }
        return total;
    }

    public static void print() {
        for(OrderItem orderItem : orderItems) {
            if(orderItem != null) {
                OrderItem.print( orderItem);
            }
        }
        System.out.println("Total amount: " + getTotalAmount());
        System.out.println("Count: " + getItemsCount());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return true;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nextIndex, maxOrderItem);
        result = 31 * result + Arrays.hashCode(orderItems);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "nextIndex=" + nextIndex +
                ", maxOrderItem=" + maxOrderItem +
                ", orderItems=" + Arrays.toString(orderItems) +
                '}';
    }
}