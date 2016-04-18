package analyzingscores;
import java.util.Scanner;
public class AnalyzingScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter scores(maximum 10 and enter negative number to end: ");
        int numberOfScores = 0;
        int aboveOrEqual = 0;
        int below = 0;
        double average = 0;
        double[] scores = new double[10];
        for ( int i = 0; i < 10; i++){
            double a = input.nextDouble();
            if (a >= 0)
                scores[i] = a;
            else 
                break;
            }//end of for
        for (int i = 0; i < scores.length; i++){
            average += scores[i];
            if (scores[i] != 0)
                numberOfScores++;
        }
        average /= numberOfScores;
        for (int i = 0; i < scores.length; i++){
            if (scores[i] != 0){
            if (scores[i] >= average)
                aboveOrEqual++;
            else
                below++;
            }
        }//end of for
        System.out.println("There are "+aboveOrEqual+" scores above or equal average.");
        System.out.println("There are "+below+" scores below average.");
 
    }//end of main
    
}
