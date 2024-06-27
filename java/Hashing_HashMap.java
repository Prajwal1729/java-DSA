import java.util.*;
public class Hashing_HashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        // insert:
        map.put("India",140);
        map.put("Australia",40);
        map.put("US",50);
        map.put("China",150);
         
        System.out.println(map);

        map.put("China",180);
        System.out.println(map);

        // search:
        if(map.containsKey("China")){
            System.out.println("Present");
        }
        else{
            System.out.println("Not present");
        }

        System.out.println(map.get("India"));
        System.out.println(map.get("Indonesia"));


        int arr[] = {3,4,5,6,9,90,100};

        for(int val : arr){
            System.out.print(val+ " ");
        }
        System.out.println();

        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.print(e.getKey()+" ");
            System.out.print(e.getValue()+" ");
        }
        System.out.println();


        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.println(key+" "+map.get(key));
        }
        System.out.println();

        map.remove("China");
        System.out.println(map);
    }
    
}
