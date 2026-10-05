// import java.util.Scanner;
// class B
// {
    // public static void prime_no(int n){
        // int cnt=0;
        // for(int i=1;i<=n;i++){
            // if(n % i ==0)cnt++;
            // if(cnt==2){
                // System.out.println("Is Prime number:"+n);
                // break;
            // }
        // }
    // }
// 
    // public static void palindrom_no(int n){
        // int temp=n;
        // int rev=0;
// 
        // while(temp!=0){
            // int digits=temp %10;
            // rev=rev*10+digits;
            // temp=temp/10;
        // }
        // if(n==rev)System.out.println(n+"Is Palindrome number");
        // else System.out.println(n+"Is not  Palindrome number");
    // }
// 
    // public static void armstrong_no(int n){
        // int temp=n;
        // int rev=0;
// 
        // while(temp!=0){
            // int digit=temp %10;
            // rev=(rev*10)+digit*digit*digit;
            // temp/=10;
        // }
        // if(n==rev)System.out.println(n+" armstrong number");
        // else System.out.println(n+"Is not Armstrong number");
    // }
// 
    // public static void perfect_no(int n) {
        //  int sum=0;
        //  for(int i=1;i<=n;i++){
            //  if( n % i ==0){
                // sum+=i;
            //  }
        //  }
        //  if(n==sum)System.out.println(n+"Is Perfect number");
        //  else System.out.println(n+"Is not perfect number");
    // }
    // public static void main(String[]args){
        // Scanner sc=new Scanner(System.in);
        // int num;
        // System.out.print("Enter the number:");
        // num=sc.nextInt();
// 
        // int choice=0;
        // System.out.println("1) Prime number \n 2)Palindrome number \n3)Armstrong number \n4)Perfect number \n5)Exit ");
        // do{
            // System.out.print("Enter Choice:");
            // choice=sc.nextInt();
// 
            // Switch (choice) {
                // case 1:
                    // prime_no(num);
                    // break;
// 
                // case 2:
                    // palindrom_no(num);
                    // break;
// 
                // case 3:
                    // armstrong_no(num);
                    // break;
// 
                // case 4:
                    // perfect_no(num);
                    // break;
                // 
                // case 5 :
                    // break;
                // 
                    // default:
                    // System.out.println("Enter b/w 1 to 5");
            // }
// 
        // }while(choice<=4);
// 
        // sc.close();
    // }
// }