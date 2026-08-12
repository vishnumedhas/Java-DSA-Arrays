import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimplaeArraySum{
public static int simpleArraySum(List <Integer>ar){
    int sum=0;

    for(int i=0;i<ar.size();i++){
        sum+=ar.get(i);
    }
    return sum;
}

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        List<Integer>ar=new ArrayList<>();
        for(int i=0;i<n;i++){
          ar.add(sc.nextInt());
        }
        
        System.out.println(simpleArraySum(ar));

    }
}