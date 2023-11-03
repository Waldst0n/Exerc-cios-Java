package exercicioestoque;

public class Product {
    public String name;
    public  double price;
    public int quantity;

    public double totalValueStock() {
        return quantity * price;
    }

    public void  addProducts(int quantity){
        this.quantity += quantity;
    }

    public  void removeProducts(int quantity) {
        this.quantity -= quantity;


    }

    @Override
    public String toString() {
        return "name: " + name + ", $" + String.format("%.2f", price) + ", " + quantity + " units, " + "Total: " + String.format("%.2f",totalValueStock());
    }
}
