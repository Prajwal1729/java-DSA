public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Black Pole");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        sb.setCharAt(6, 'H');
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("Tony");
        // sb1.insert(0,'S');
        // System.out.println(sb1);

        sb1.insert(2,'n');
        System.out.println(sb1);

        sb.delete(6,10);
        System.out.println(sb);
        
        sb1.delete(2,4);
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("P");
        sb2.append('r');
        sb2.append('a');
        sb2.append('j');
        sb2.append('w');
        sb2.append('a');
        sb2.append('l');
        System.out.println(sb2);
        System.out.println(sb2.length());

        StringBuilder sb3 = new StringBuilder("The man who knew the infinity");

        for(int i = 0;i<sb3.length()/2;i++){
            int f = i;
            int l = sb3.length() - 1 - i;
            char fc = sb3.charAt(f);
            char bc = sb3.charAt(l);
            sb3.setCharAt(f,bc);
            sb3.setCharAt(l,fc);

        }

        System.out.println(sb3);

    }
    
}
