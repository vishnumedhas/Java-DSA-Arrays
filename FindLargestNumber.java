public class FindLargestNumber {
    
    public static int largestNumber(int[]numbers){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int []numbers={1,3,5,7,9,11,6,10,};
        System.out.println(largestNumber(numbers));
    }
}
