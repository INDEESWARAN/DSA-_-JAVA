import java.util.*;
class HelloWorld {
   public static void main(String[] args){
       int n=8;
       Dtob(n);
   }
   
     static void Dtob(int n) {
        String s=" ";
        while(n>0){
            s=s+n%2;
            n=n/2;
        }
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
}

    
}
