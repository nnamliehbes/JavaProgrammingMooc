public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here

        int index = 0;
        String saver = ""; 
        String delimiter = "";
        while(index < array.length){
            String[] strArray = new String[array[index]];
            for(int i = 0; i < strArray.length; i++){
                strArray[i] = "*";
            }
            saver = String.join(delimiter, strArray); 
            System.out.println(saver);
            index++;
        }
    }
}
