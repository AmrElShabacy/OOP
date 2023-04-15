public class Main {
    public static void main(String[] args) {
        GroceryList l = new GroceryList();
        l.add(new GroceryItemOrder("milk",3,20));
        l.add(new GroceryItemOrder("sugar",7,10));
        System.out.println(l.getTotalCost());
    }
}