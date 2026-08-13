
import java.util.Scanner;
class A 
{     
    public static  void reverse(int []nums,int n){
          int i=0;
          while(i<n/2){
             int temp=nums[i];
             nums[i]=nums[n-i-1];
             nums[n-i-1]=temp;
            }
        System.out.print("Reversed array:");
        for(i=0;i<n;i++){
            System.out.print(nums[i]);
        }
    }
     public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.print("Enter size of array:");
        size=scanner.nextInt();
        int []nums=new int[size];

        System.out.print("Enter elements:");
        for(int i=0;i<size;i++){
           nums[i]=scanner.nextInt();
        }

        reverse(nums,size);
        scanner.close();
     }
      
}