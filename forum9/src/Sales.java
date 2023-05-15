public class Sales {

// each object contains details of one sale

    private String itemID;     // id of the item

    private double value;      // the price of one item

    private int quantity;      // the number of the items sold

// constructor missing
    Sales(String ID, double value, int quantity){
        this.itemID = ID;
        this.value = value;
        this.quantity = quantity;
    }

    public double getValue() {return value;}

    public int getQuantity() {return quantity;}

    public String getItemID(){
        return itemID;
    }

    public double getTotal(){
        return this.getValue() * this.getQuantity();
    }

}