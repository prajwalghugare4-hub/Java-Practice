public class pattern{
    public static void main(String[]args){
        int n=5;
        for(int i=1;i<=2*n-1;i++){
            int spaces=2*n-2;
            int starts=i;
            if(i>n)starts=2*n-i;
                
            for(int j=1;j<=starts;j++){
              System.out.print("*");
             } 
            for(int j=1;j<=spaces;j++){
               System.out.print(" ");
            }
            for(int j=1;j<=starts;j++){
                System.out.print("*");
            }
            if(i>n)spaces+=2;
            else spaces-=2;

         System.out.println();
        }
    }
}