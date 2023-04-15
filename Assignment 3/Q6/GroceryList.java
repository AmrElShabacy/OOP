import java.util.ArrayList;
public class GroceryList {
    private ArrayList<GroceryItemOrder> list;
    private int n;
    public GroceryList(){
        list = new ArrayList<>(10);
    }
    public void add(GroceryItemOrder item){
        if(n<10) {
            list.add(item);
            n+=item.getq();
        }
    }
    public double getTotalCost(){
        double total=0;
        for(GroceryItemOrder g: list){
            total+=g.getCost();
        }
        return total;
    }
}
