import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase){
        if (this.totalWeight() + suitcase.totalWeight() > maxWeight){
            return;
        }

       this.suitcases.add(suitcase);
    }

    public int totalWeight(){
        int weight = 0;
        for (Suitcase suitcase : suitcases) {
            weight = weight + suitcase.totalWeight();
        }

        return weight;
    }


    public void printItems() {
        int index = 0;
        while (index < this.suitcases.size()) {
            this.suitcases.get(index).printItems();
            index++;
        }
    }

    @Override
    public String toString() {
        if (this.suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        }

        if (this.suitcases.size() == 1) {
            return "1 suitcase (" + this.totalWeight() + " kg)";
        }

        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}
