package behavioral.strategy;

import behavioral.strategy.core.Promote;

public class Ticket {
    private static int id = 0;
    private String name;
    private double price;
    private Promote promote;
    public Ticket(){
        ++id;
    }
    public Ticket(String name, double price) {
        ++id;
        this.name = name;
        this.price = price;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Ticket.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Promote getPromote() {
        return promote;
    }

    public void setPromote(Promote promote) {
        this.promote = promote;
    }

    public double getPromotedPrice(){
        return promote.doDiscount(price);
    }

}
