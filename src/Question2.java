import java.util.Scanner;

public class Question2 {
//    Given an array & Q queries of following type.(sum of all odd & even indexed element)
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int[] array = {2,3,1,-1,0,8,5,4};
        System.out.println("Enter Q : ");
        int q = x.nextInt();
        sumofQqueries(q,array);
    }
    static void sumofQqueries(int q,int[] array){
        Scanner x = new Scanner(System.in);
        int s,e,choice;
        for(int i=1;i<=q;i++){
            System.out.print("s : ");
            s = x.nextInt();
            System.out.print("e : ");
            e = x.nextInt();
            System.out.print("if odd press 1, if even press 0 \nchoice : ");
            choice = x.nextInt();
            int ans = sumOfOddEven(choice,array,s,e);
            System.out.println("ans : "+ans);
        }
    }
    static int sumOfOddEven(int choice,int[] array,int s, int e){
        int ans;
        if(choice==0){
            int[] pse = new int[array.length];
            prefixEven(array,pse);
            if(s==0){
                ans = pse[e];
            }else {
                ans = pse[e] - pse[s - 1];
            }
            return ans;
        } else if (choice == 1) {
            int[] pso = new int[array.length];
            prefixOdd(array,pso);
            if(s==0){
                ans = pso[e];
            }else {
                ans = pso[e] - pso[s - 1];
            }
            return ans;
//            System.out.println("ans : "+ans);
        }
        return 0;
    }
    static void prefixOdd(int[] array,int[] pso){
//        Build Prefix sum of odd Indexes
        pso[0]=0;
        for(int i=1;i< array.length;i++){
            if(i%2==0){
                pso[i] = pso[i-1];
            }else{
                pso[i] = pso[i-1] + array[i];
            }
        }
//        System.out.print("Prefix Odd : ");
//        for(int i=0;i< pso.length;i++){
//            System.out.print(" "+pso[i]);
//        }
    }
    static void prefixEven(int[] array,int[] pse){
//        Build Prefix sum of Even Indexes
        pse[0]=array[0];
        for(int i=1;i< array.length;i++){
            if(i%2==0){
                pse[i] = pse[i-1]+array[i];
            }else {
                pse[i] = pse[i-1];
            }
        }
//        System.out.print("\nPrefix Even : ");
//        for(int i=0;i< pse.length;i++){
//            System.out.print(" "+pse[i]);
//        }
    }
}
