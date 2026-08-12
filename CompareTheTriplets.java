import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Compare the Triplets

Alice and Bob each created a list of three integer ratings for a problem.

For each position:

If Alice's rating is greater than Bob's rating, Alice gets 1 point.
If Bob's rating is greater than Alice's rating, Bob gets 1 point.
If both ratings are equal, neither gets a point.


*/

public class CompareTheTriplets {
    
    public static List<Integer> compareTriplets(List<Integer>a,List<Integer> b){
        List<Integer>scores=new ArrayList<>();
        int Alice_score=0;
        int Bob_score=0;
        for(int i=0;i<a.size();i++){
            if(a.get(i)>b.get(i)){
                Alice_score++;
            }
            if(a.get(i)<b.get(i)){
                Bob_score++;
            }
        }
        scores.add(Alice_score);
        scores.add(Bob_score);
        return scores;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        //create Alice list
        List<Integer>a=new ArrayList<>();
        for(int i=0;i<3;i++){
            a.add(sc.nextInt());
        }

        //create Bobs list
        List<Integer>b=new ArrayList<>();
        for(int i=0;i<3;i++){
            b.add(sc.nextInt());
        }
    System.out.println(compareTriplets(a,b));

    }
}
