import java.util.Scanner;
public class r1 {
    static Scanner sc=new Scanner(System.in);

     static void display(int i,int n){
    
       String name;

       if(i>n)
        return;
       name=sc.next();
       System.out.print(name+" ");
        display(i+1,n);
        
    }

    public static void main(String[] args) {
        int n=5;
        int i =1;
        display(i,n);
        sc.close();
    }
    
}
