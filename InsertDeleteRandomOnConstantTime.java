import java.util.ArrayList;
import java.util.HashMap;

class InsertDeleteRandomOnConstantTime{

}

class CustomSet{
    ArrayList<Integer> list;
    HashMap<Integer,Integer> map;
     public CustomSet(){
         list = new ArrayList<>();
         map = new HashMap<>();
     }
     public boolean insert(int val){
         if(map.containsKey(val)) return false;
         map.put(val, list.size());
         list.add(list.size()-1, val);
        return false;
     }
     public boolean remove(int val){
         if(!map.containsKey(val)) return false;
         int index = map.get(val);
        return false;
     }
     public int getRandom(){
         return 0;
     }

}