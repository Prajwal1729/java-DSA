import java.util.*;
public class Recursion_Questions {

    public static void towerOfHanio(int n,String src,String help,String dest){
        if(n==1){
            System.out.println("Transfer disk: "+ n +" from "+ src +" to "+ dest);
            return;
        }

        towerOfHanio(n-1, src, dest, help);
        System.out.println("Transfer disk: "+ n +" from "+ src +" to "+ dest);
        towerOfHanio(n-1, help, src, dest);

    }

    public static String reverseString(String str){
        if(str.length()==1){
            return str;
        }

        char currChar = str.charAt(0);
        String nextstr = reverseString(str.substring(1));
        return nextstr + currChar;
    }

    public static int f = -1;
    public static int l  = -1;

    public static void findOccurence(String str,int idx,char ch){
        if(idx==str.length()){
            System.out.println(f);
            System.out.println(l);
            return;
            
        }

        char currChar = str.charAt(idx);
        if(currChar==ch){
            if(f==-1){
                f = idx;
            }
            else{
                l = idx;
            }
        }
        findOccurence(str, idx+1,ch);
    }

    public static boolean checkArrayisSorted(int arr[],int idx){
        if(arr.length-1 == idx){
            return true;
        }
 
        if(arr[idx] < arr[idx+1]){
            return checkArrayisSorted(arr, idx+1);
        }
        else{
            return false;
        }
    }

    public static void moveallXToEnd(String str,int idx,int count,String newString){
        if(str.length()==idx){
            for(int i = 0;i<count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if(currChar=='x'){
            count+=1;
            moveallXToEnd(str, idx+1, count, newString);
        }

        else{
            newString+=currChar;
            moveallXToEnd(str, idx+1, count, newString);
        }
    }

    public static boolean[] map = new boolean[26];

    public static void removeAllDuplicates(String str,int idx,String newString){
        if(str.length()==idx){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar - 'a']){
            removeAllDuplicates(str, idx+1, newString);
        }

        else{
            newString+=currChar;
            map[currChar-'a'] = true;
            removeAllDuplicates(str, idx+1, newString);
        }
    }

    public static void subSequences(String str, int idx,String res){
        if(str.length()==idx){
            System.out.println(res);
            return;
        }

        char currChar = str.charAt(idx);

        // Choose:
        subSequences(str, idx+1,res+currChar);

        // dont choose:
        subSequences(str, idx+1, res);
    }

    public static void uniqueSubsequences(String str,int idx,String res,HashSet<String> set){
         if(str.length()==idx){
            if(set.contains(res)){
                return;
            }
            else{
                System.out.println(res);
                set.add(res);
                return;
            }
         }

        char currChar = str.charAt(idx);
        uniqueSubsequences(str, idx+1, res+currChar, set);
        uniqueSubsequences(str, idx+1, res, set);
    }

    public static String keypad[] = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printKeyPadCombinations(String num,int idx,String res){
        if(idx==num.length()){
            System.out.println(res);
            return;
        }

        for(int i = 0;i<keypad[num.charAt(idx)-'0'].length();i++){
            char curr = keypad[num.charAt(idx) - '0'].charAt(i);
            printKeyPadCombinations(num, idx+1, res+curr);
        }

    }

    public static void permutationsOfString(String str,String perm){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }

        for(int i = 0;i<str.length();i++){
            char curr = str.charAt(i);
            String newstr = str.substring(0, i)+str.substring(i+1);
            permutationsOfString(newstr, perm+curr);
        }
    }

    public static int counttoMove(int i,int j,int n,int m){
        if(i==n || j==m){
            return 0;
        }

        if(i==n-1 || j == m-1){
            return 1;
        }
        int d = counttoMove(i+1, j, n, m);
        int r = counttoMove(i, j+1, n, m);

        return d+r;

    }

    public static int placeTiles(int n,int m){
        if(n==m){
            return 2;
        }

        if(n<m){
            return 1;

        }

        int v = placeTiles(n-m, m);
        int h = placeTiles(n-1,m);

        return v+h;
    }


    public static int invitePeople(int n){
        if(n<=1){
            return 1;
        }
        int ind = invitePeople(n-1);
        int pair = (n-1)*invitePeople(n-2);

        return pair + ind;
    }

    public static void printSubset(ArrayList<Integer> subset){
        for(int i = 0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }

   public static void findSubsets(int n,ArrayList<Integer> subset){
    if(n==0){
        printSubset(subset);
        return;

    }
    subset.add(n);
    findSubsets(n-1, subset);

    subset.remove(subset.size()-1);
    findSubsets(n-1,subset);
        
   }

    public static void main(String[] args) {
        // Tower Hanio:
        // int n = 3;
        // towerOfHanio(n,"S","H","D");

        // String str = "cake";
        // System.out.println(reverseString(str));

        // String str = "abaacdaefaah";
        // findOccurence(str, 0,'a');

        // int arr[] = {34,90,100,200};
        // System.out.println(checkArrayisSorted(arr, 0));

        // String str = "axbcxxd";
        // moveallXToEnd(str, 0, 0, "");

        // String str = "abbccda";
        // removeAllDuplicates(str, 0, "");

        // String str = "abc";
        // subSequences(str, 0, "");

        // String str = "aaa";
        // HashSet<String> set = new HashSet<>();
        // uniqueSubsequences(str, 0, "", set);

        // String num = "23";
        // printKeyPadCombinations(num, 0, "");

        // String str = "abc";
        // permutationsOfString(str,"");

        // int n = 3;
        // int m = 3;
        // System.out.println(counttoMove(0, 0, n, m));
       
        // int n = 4;
        // int m = 2;
        // System.out.println(placeTiles(n, m));

        // int n = 4;
        // System.out.println(invitePeople(n));
        
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);

    }
    
}
