package OOP.Lab3;

public class MyStock {
    public static void main (String[] args){
        Stock a1 = new Stock("ORCL", "Oracle Corporation");

        a1.setPreviousClosingPrice(34.5);
        a1.setCurrentPrice(34.35);

        System.out.println("Previous Closing Price: " + a1.getPreviousClosingPrice());
        System.out.println("Current Price: " + a1.getCurrentPrice());
        System.out.println("Price Change: -" + a1.getChangePercent() + "%");
    }
}

class Stock{
    String symbol;
    String name;
    static double previousClosingPrice;
    static double currentPrice;

    public Stock(String sym, String nm){
        symbol = sym;
        name = nm;
        previousClosingPrice = 0;
        currentPrice = 0;
    }

    public String getSymbol(){
        return symbol;
    }
    public String getName(){
        return name;
    }
    
    public void setPreviousClosingPrice(double pc){
        previousClosingPrice = pc;
    }
    public void setCurrentPrice(double cp){
        currentPrice = cp;
    }
    public double getPreviousClosingPrice(){
        return previousClosingPrice;
    }
    public double getCurrentPrice(){
        return currentPrice;
    }

    public double getChangePercent(){
        return ((previousClosingPrice-currentPrice)/previousClosingPrice)*100;
    }
}