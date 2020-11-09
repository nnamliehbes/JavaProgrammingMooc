import java.util.ArrayList;

public class Suitcase {
    private int maximumWeight;
    private ArrayList<Item> items;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        if (totalWeight() + item.getWeight() > maximumWeight){
            ;
        } else {
            this.items.add(item);
        }
    }

    public int totalWeight(){
        int weight = 0;
        for (Item item : items) {
            weight = weight + item.getWeight();
        }

        return weight;
    }

    public void printItems() {
        for (Item item : items){
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }


    public Item heaviestItem(){

        if (items.isEmpty()){
            return null;
        }

        Item heaviest = items.get(0);

        for (Item item : items){
            if (heaviest.getWeight() < item.getWeight()){
                heaviest = item;
            }
        }

        return heaviest;
    }

    @Override
    public String toString() {
        if (items.size() == 0){
            return "no items" + " (0 kg)";
        } 
        
        if (items.size() == 1){
            return items.size() + "1 item" + "(" + totalWeight() +  " kg)";
        } 
        
        return items.size() + "items" + "(" + totalWeight() +  " kg)";
        
    }

}
