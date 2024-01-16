import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomizedSet1 {
    private final Random random = new Random();
    private final Map<Integer,Integer> map = new HashMap<>();
    private int[] vals = new int[32];
    private int i=0;

    public RandomizedSet1() {
    }

    public boolean insert(int val) {
        Integer added = map.putIfAbsent(val, i);
        if(added != null) return false;
        if(i >= vals.length){
            vals = Arrays.copyOf(vals, vals.length*2);
        }
        vals[i++] = val;
        return true;
    }

    public boolean remove(int val) {
        Integer removed = map.remove(val);
        if (removed == null) return false;

        if(removed < i-1){
            vals[removed] = vals[i-1];
            map.put(vals[i-1],removed);
        }
        i--;
        return true;
    }

    public int getRandom() {
        int index= random.nextInt(i);
        return vals[index];
    }

    public static void main(String[] args) {
        RandomizedSet1 obj = new RandomizedSet1();
        boolean param_1 = obj.insert(5);
        boolean param_4 = obj.insert(7);
        boolean param_2 = obj.remove(7);
        int param_3 = obj.getRandom();
        System.out.println(param_1+" "+param_2+" "+param_3+" "+param_4);
        RandomizedSet1 obj1 = new RandomizedSet1();
        boolean param_11 = obj1.insert(5);
        boolean param_121 = obj1.insert(10);
        boolean param_21 = obj1.remove(10);
        int param_31 = obj1.getRandom();
        System.out.println(param_11+" "+param_21+" "+param_31+" "+param_121);
    }
}
