public class GroceryItemOrder {
    private String name;
    private int quantity;
    private double pricePerUnit;
    public GroceryItemOrder(String name,int q, double pricePerUnit){
        this.name = name;
        this.pricePerUnit=pricePerUnit;
        this.quantity=q;
    }
    public double getCost(){
        return quantity*pricePerUnit;
    }
    public int getq(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
}
