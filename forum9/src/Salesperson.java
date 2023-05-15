import java.util.LinkedList;

public class Salesperson {

// each object contains details of one salesperson

    private String id;

    private LinkedList<Sales> salesHistory = new LinkedList<>(); // details of the different sales

    private int count = 0; // number of sales made


//constructor for a new salesperson

    public Salesperson(String id) {
        this.id = id;
    }


// constructor for a salesperson transferred (together with their sales details) from another branch

    public Salesperson(String id, LinkedList<Sales> s, int c) {
        this.id = id;
        this.salesHistory = s;
        this.count = c;
    }


    public int getCount() {
        return count;
    }


    public String getId() {
        return id;
    }


    public Sales getSalesHistory(int i) {
        return salesHistory.get(i);
    }

    public void setSalesHistory(Sales s) {
        this.salesHistory.add(s);
        count = count + 1;
    }


    public double calcTotalSales() {

// calculates total sales for the salesperson

        double result = 0;
        for (int i = 0; i < count; i++) {
            result += salesHistory.get(i).getTotal();
        }
        return result;
    }


    public Sales largestSale() {

// calculates the sale with the largest value

        if (this.count == 0) {
            return null;
        }
        int id = 0;
        for (int i = 1; i < this.count; i++) {
            if (salesHistory.get(i).getTotal() > salesHistory.get(id).getTotal()) {
                id = i;
            }
        }
        return salesHistory.get(id);

    }
}