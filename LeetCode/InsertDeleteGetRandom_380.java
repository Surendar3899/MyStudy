package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class InsertDeleteGetRandom_380 {
    public static void main(String[] args) {
        RandomizedSet rs = new RandomizedSet();
        rs.RandomizedSet();
        boolean result = rs.insert(2);
        System.out.println("result is "+result);
        boolean result1 = rs.insert(3);
        System.out.println("result1 is "+result1);
        boolean result2 = rs.insert(2);
        System.out.println("result2 is "+result2);
        boolean rs12= rs.insert(9);
        boolean rs13 = rs.insert(45);
        int ret = rs.getRandom();
        System.out.println("ret is "+ret);


    }

   
}


/*class RandomizedSet{
    public Set<Integer> rSet = null;
    public void RandomizedSet() {
        rSet = new HashSet<>();
        
    }
    
    public boolean insert(int val) {
        /*if(rSet.add(val)){
            return true;
        }
        return false;
        return rSet.add(val);
    }
    
    public boolean remove(int val) {
        return rSet.remove(val);
    }
    
    public int getRandom() {
        int size = rSet.size();
        int item = (int)(Math.random() * size);
        return rSet.stream().skip(item).findFirst().orElse(-1);
    }
}*/

class RandomizedSet {
    ArrayList<Integer> list;
    HashMap<Integer , Integer> map; 
    Random random = new Random();
    public void RandomizedSet() {
     list = new ArrayList<>();
     map = new HashMap<>();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        map.put(val , list.size());
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        int ind = map.get(val);
        int lastInd  = list.get(list.size() - 1);

        list.set(ind , lastInd);
        map.put(lastInd , ind);
        list.remove(list.size() -1);
        map.remove(val);
        return true;


        
    }
    
    public int getRandom() {
         return list.get(random.nextInt(list.size()));
    }

}
