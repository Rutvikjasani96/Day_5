public class Question3 {
//    Given an array count the number of special index in the array.
    public static void main(String[] args) {
        int[] array = {4,3,2,7,6,-2};
        int countSpecialIndex = specialIndexCount(array);
        System.out.println("Count of Special Index : "+countSpecialIndex);
    }
    static int specialIndexCount(int[] array){
        int sodd = 0;
        int seven = 0;
        int countSpecialIndex = 0;
        for(int i=0;i< array.length;i++){
            if(i==0){
                sodd = Question2.sumOfOddEven(1,array,i+1,array.length-1);
                seven = Question2.sumOfOddEven(0,array,i+1,array.length-1);
            }
            else{
                sodd = Question2.sumOfOddEven(1,array,0,i-1)+Question2.sumOfOddEven(0,array,i+1,array.length-1);
                seven = Question2.sumOfOddEven(0,array,0,i-1)+Question2.sumOfOddEven(1,array,i+1,array.length-1);
            }
            if(sodd==seven){
                countSpecialIndex++;
            }
//            System.out.println(sodd);
//            System.out.println(seven);
        }
        return countSpecialIndex;
    }
}
