package learning;

public class ex02_1 {
    public String name;
    public double price;
    public int quantity;

    public double totalValueinStock(){
        return price * quantity;
    }
     public void addProducts(int quantity){
        this.quantity += quantity;
     }
     public void removeProducts(int quantity){
        this.quantity -= quantity;
     }
}
