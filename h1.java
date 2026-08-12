import java.util.Scanner;

class A {
     public static String convert2binary(int nums){
        String res="";
        while(nums>0){
            int rem = nums % 2;
            res = rem + res;
            nums = nums/2;
        }
        return res;
     }
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.print("Type Decimal :");
       int nums = scanner.nextInt();
       scanner.close();

      String s = convert2binary(nums);
      System.out.print("Binary number:");
      System.out.println(s);
    }
}