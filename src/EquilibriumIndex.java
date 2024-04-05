public class EquilibriumIndex {
//    Q Given an array, return true if there exists an equilibrium index in the array.
    public static void main(String[] args) {
        int[] array = {1,2,3,4,8,10};
        boolean equilibriumCheck = equilibriumorNot(array);
        System.out.println("Result : "+equilibriumCheck);
    }
    static boolean equilibriumorNot(int[] array){
        int[] ps = new int[6];
        PrefixSum.prefixSum(array,ps);
        for(int i=0;i< array.length;i++){
            int sl,sr;
            if(i==0){
                sl = 0;
                sr = ps[array.length-1] - ps[i];
            }else{
                sl = ps[i-1];
                sr = ps[array.length-1] - ps[i];
            }
            if(sl==sr){
                return true;
            }
        }
        return false;
    }
}
