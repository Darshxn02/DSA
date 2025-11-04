import java.util.HashMap;
import java.util.Map;

public class NumberFrequency {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 10, 30, 20, 10, 40, 50, 30, 10};

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int number : numbers) {
           
            if (frequencyMap.containsKey(number)) {
                frequencyMap.put(number, frequencyMap.get(number) + 1);
            } else {
            
                frequencyMap.put(number, 1);
            }
        }

 
        System.out.println("Number Frequencies:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " time(s)");
        }
    }
}