public class BinarySearch {
    
    public static int binarySearch(int []numbers,int target){
        int start=0;
        int end=numbers.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if(target==numbers[mid]){
                return mid;
            }
            if(numbers[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []numbers={6,11,12,17,34,47,51};
        int target=17;

        System.out.println(binarySearch(numbers, target));

    }
}
