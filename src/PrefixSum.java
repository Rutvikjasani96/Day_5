public class PrefixSum {
//    Prefix Sum of the Array
    public static void main(String[] args) {
        int[] array = {1,2,3,2,3,1,4,5,2,3};
        int ps[] = new int[array.length];
        prefixSum(array,ps);
        for(int i=0;i< ps.length;i++){
            System.out.print(" "+ps[i]);
        }
    }
    static void prefixSum(int[] array,int[] ps){
        ps[0] = array[0];
        for(int i=1;i< array.length;i++){
            ps[i] = ps[i-1]+array[i];
        }
    }
}
