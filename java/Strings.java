import java.util.*;
public class Strings {
    public static void main(String[] args) {
        // String s = "Prajwal";
        Scanner sc = new Scanner(System.in);
        // String str = "The man who knew the infinity";
        // System.out.println(str);
        // String name = sc.nextLine();
        // System.out.println("Your name is: "+ name);

        // Important functions:

        // String str1 = "Black";
        // String str2 = "Hole";
        // String str3 = str1+str2;

        // System.out.println(str1 + " " +str2);

        // System.out.println(str3.length());

        // for(int i = 0;i<str3.length();i++){
        //     System.out.print(str3.charAt(i)+",");
        // }

        // System.out.println();

        // if(str1.compareTo(str2)==0){
        //     System.out.println("Equal Strings");
        // }
        // else{
        //     System.out.println("Strings are not equal");
        // }


        // if(str1 == str2){
        //     System.out.println("Equal Strings");
        // }
        // else{
        //     System.out.println("Strings are not equal");
        // }

        // beacuse it is a object it wil have diffrent functioning

        // if(new String("Prajwal")==new String("Prajwal")){
        //     System.out.println("Equal Strings");
        // }
        // else{
        //     System.out.println("Strings are not equal");

        // }

        // String s = str.substring(0,8);
        // System.out.println(s);

        // Strings are immutable

        // String str = "12345";
        // int num = Integer.parseInt(str);
        // System.out.println(num);

        // int num1 = 45536;
        // String s = Integer.toString(num1);
        // System.out.println(s);

        // int n = sc.nextInt();
        // String arr[] = new String[n];
        // int total_length = 0;
        
        // for(int i = 0;i<n;i++){
        //     arr[i] = sc.next();
        //     total_length+=arr[i].length();
        // }

        // System.out.println(total_length);

        // String s = sc.next();
        // String res ="";

        // for(int i = 0;i<s.length();i++){
        //     if(s.charAt(i) == 'e'){
        //         res+='i';
        //     }
        //     else{
        //         res+=s.charAt(i);
        //     }
        // }

        // System.out.println(res);

        String email = sc.next();
        String userNmae = "";
        for(int i = 0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }
            else{
                userNmae+=email.charAt(i);
            }
        }

        System.out.println(userNmae);


    }
    
}
