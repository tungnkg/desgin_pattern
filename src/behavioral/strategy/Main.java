package behavioral.strategy;

import behavioral.strategy.core.EightDiscount;
import behavioral.strategy.core.HalfDiscount;
import behavioral.strategy.core.NoDiscount;
import behavioral.strategy.core.QuarterDiscount;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random random = new Random();
        for (int i = 1; i <= 10; i++)
        {
            Ticket ticket = new Ticket();
            ticket.setName("Ticket " + i);
            ticket.setPrice(50d * i);
            generatePromoteStrategy(random, ticket);
            LogTicketDetails(ticket);

        }

    }
    private static void LogTicketDetails(Ticket ticket)
    {
        System.out.println(ticket.getName() + " has price is: " + ticket.getPrice() + ".\n" +
                "After use promoted " + ticket.getPromote().toString() + ". Price is " +ticket.getPromotedPrice() + "\n");
    }
    private static void generatePromoteStrategy(Random random, Ticket ticket)
    {
        int strategyIndex = random.nextInt(0, 3);
        switch (strategyIndex) {
            case 0 -> ticket.setPromote(new NoDiscount());
            case 1 -> ticket.setPromote(new QuarterDiscount());
            case 2 -> ticket.setPromote(new HalfDiscount());
            default -> ticket.setPromote(new EightDiscount());
        }
    }
}
