import java.util.*;

public class RandomizedSet {
    private Set<Integer> integerSet;
    private List<Integer> integerList;
    public RandomizedSet(){
        integerSet = new HashSet<>();
        integerList = new LinkedList<>();
    }

    public boolean insert(int val) {
        if(this.integerSet.add(val)) {
            this.integerList.add(val);
            return true;
        }else {
            return false;
        }
    }

    public boolean remove(int val) {
        if(this.integerSet.contains(val)){
            this.integerList.remove(integerList.indexOf(val));
            this.integerSet.remove(val);
            return true;
        }else {
            return false;
        }
    }

    public int getRandom() {
        int randomIndex = new Random().nextInt(this.integerList.size());
        return integerList.get(randomIndex);
    }

    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        boolean param_1 = obj.insert(5);
        boolean param_4 = obj.insert(7);
        boolean param_2 = obj.remove(7);
        int param_3 = obj.getRandom();
        System.out.println(param_1+" "+param_2+" "+param_3);
        RandomizedSet obj1 = new RandomizedSet();
        boolean param_11 = obj1.insert(5);
        boolean param_121 = obj1.insert(10);
        boolean param_21 = obj1.remove(10);
        int param_31 = obj1.getRandom();
        System.out.println(param_11+" "+param_21+" "+param_31);
    }
}
