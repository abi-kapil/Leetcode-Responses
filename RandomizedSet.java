import java.util.*;

public class RandomizedSet {
    private final HashMap<Integer, Integer> map;  // value -> index in list
    private final ArrayList<Integer> list;        // stores actual values
    private final Random rand;

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        rand = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;  // Already exists
        }

        // Add to end of list
        list.add(val);
        // Store value -> index mapping
        map.put(val, list.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;  // Doesn't exist
        }

        // Get index of element to remove
        int index = map.get(val);
        int lastElement = list.get(list.size() - 1);

        // Swap with last element
        list.set(index, lastElement);
        map.put(lastElement, index);

        // Remove last element
        list.remove(list.size() - 1);
        map.remove(val);

        return true;
    }

    public int getRandom() {
        int randomIndex = rand.nextInt(list.size());
        return list.get(randomIndex);
    }

    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();

        System.out.println(obj.insert(2));  // true
        System.out.println(obj.remove(2));  // true
        System.out.println(obj.insert(1));  // true
        System.out.println(obj.getRandom());  // 1
        System.out.println(obj.insert(3));  // true
        System.out.println(obj.getRandom());  // randomly 1 or 3
    }
}
