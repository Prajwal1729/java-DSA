import java.util.*;
import java.util.Arrays;
public class Hashing_Question {
    // Approach 1:
    // public static int majorityElements(int arr[]){
    //     Arrays.sort(arr);
    //     int n = arr.length;
    //     return arr[n/3];
    // }

    public static void majorityElements(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        for(int key : map.keySet()){
            if(map.get(key) > arr.length/3){
                System.out.println(key);
            }
        }

    }

    public static int unionOfArrays(int arr1[],int arr2[]){
        HashSet<Integer> s = new HashSet<>();
        for(int i = 0;i<arr1.length;i++){
            s.add(arr1[i]);
        }

        for(int i = 0;i<arr2.length;i++){
            s.add(arr2[i]);
        }

        return s.size();
    }

    public static int intersectionOfArrays(int arr1[],int arr2[]){
        HashSet<Integer> s = new HashSet<>();
        int count = 0;
        for(int i=0;i<arr1.length;i++){
            s.add(arr1[i]);
        }

        for(int i = 0;i<arr2.length;i++){
            if(s.contains(arr2[i])){
               count++;
              s.remove(arr2[i]);
            }
        }
        return count;
    }

    public static String getStart(HashMap<String,String> map){
        HashMap<String,String> revmap = new HashMap<>();

        for(String key: map.keySet()){
            revmap.put(map.get(key),key);
        }

        for(String key: map.keySet()){
            if(!revmap.containsKey(key)){
            return key;
            }
        }

        return null;
    }


    // Approach 1: O(n^2)
    public static int subArraySum(int arr[],int k){
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            int sum = 0;
            for(int j = i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k)
                  count++;
            }
        }
        return count;
    }
        public static void main(String[] args) {
        // int arr[] = {1,3,2,5,1,3,1,5,1};

        // Approach 1:
        // System.out.println(majorityElements(arr));
        
        // Approach 2:
        // majorityElements(arr);

        // int arr1[] = {7,3,9};
        // int arr2[] = {6,3,9,2,9,4};
        // System.out.println(unionOfArrays(arr1, arr2));

        // System.out.println(intersectionOfArrays(arr1, arr2));

        HashMap<String,String> map = new HashMap<>();
        map.put("Chennai","Bengaluru");
        map.put("Mumbai","Delhi");
        map.put("Goa","Chennai");
        map.put("Delhi","Goa");

        String start = getStart(map);

        while(map.containsKey(start)){
            System.out.print(start+"-->");
            start = map.get(start);
        }
        System.out.println(start);
        
        // int arr[] = {1,2,3};
        // int k = 3;

        // Approach 2: 
        int arr[] = {10,2,-2,-20,10};
        int k = -10;
        HashMap<Integer,Integer> map1 = new HashMap<>();
        map1.put(0,1);
        int ans = 0;
        int sum = 0;
        for(int j = 0;j<arr.length;j++){
            sum+=arr[j];
            if(map1.containsKey(sum-k)){
                ans+=map1.get(sum-k);
            }
            if(map1.containsKey(sum)){
                map1.put(sum,map1.get(sum)+1);
            }
            else{
                map1.put(sum,1);
            }
        }
        System.out.println(ans);
      

    }
    
}
