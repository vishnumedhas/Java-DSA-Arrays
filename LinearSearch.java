public class LinearSearch{

    public static int Linearsearch(int []numbers,int key){
        for(int i=0;i<numbers.length;i++){
       if(numbers[i]==key){
        return i;
       }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []numbers={2,3,4,6,8,10,12,14,16};
        int key=12;
        System.out.println(Linearsearch(numbers,key));
    }
}