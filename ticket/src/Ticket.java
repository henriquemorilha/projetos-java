public class Ticket {
    public static void main(String[] args) {
    }
    
    private String destination;
    private double price;
    private boolean isReturn;

    public Ticket() {}

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIsReturn(boolean isReturn) {
        this.isReturn = isReturn;
    }

    public String getDestination() {
        return destination;
    }

    public double getPrice() {
        return price;
    }

    public boolean getIsReturn() {
        return isReturn;
    }

    @Override
    public String toString() {
        return "Destination: " + destination + ", Price: " + price + ", Return Ticket: " + isReturn;
    }
}

