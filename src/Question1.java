import java.util.Scanner;
public class Question1 {
//    Given an array of size N & Q queries of the format start & end. return the sum of elements from index start to end.
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        int q;
        Scanner x = new Scanner(System.in);
        System.out.print("Enter Queries : ");
        q = x.nextInt();
//        sumOfQqueries(array,q);
        int[] ps = new int[10];
        PrefixSum.prefixSum(array,ps); // Using Prefix Sum of Array
        sumofQqueriesPrefix(ps,q);
    }
    static void sumOfQqueries(int[] array,int q){
        Scanner x = new Scanner(System.in);
        int sum,s,e;
        for(int i=1;i<=q;i++){
            sum=0;
            System.out.print("Enter s : ");
            s = x.nextInt();
            System.out.print("Enter e : ");
            e = x.nextInt();
            for(int j=s;j<=e;j++)
            {
                sum = sum + array[j];
            }
            System.out.println("Sum : "+sum);
        }


    }
//        Using Prefix Sum
    static void sumofQqueriesPrefix(int[] ps,int q){
        Scanner x = new Scanner(System.in);
        int sum,s,e;
        for(int i=1;i<=q;i++){
            sum=0;
            System.out.print("Enter s : ");
            s = x.nextInt();
            System.out.print("Enter e : ");
            e = x.nextInt();
            if(s==0) {
                sum = ps[e];
            }else{
                sum = ps[e] - ps[s - 1];
            }
            System.out.println("Sum : "+sum);
        }
    }
}
