import java.util.Scanner;
public class BestHorses
{
    public static void main(String[] args) 
    {
        int noOfHorses, maxWeight;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter number of horses:");
        //taking input by nextIn()
        
        noOfHorses = s.nextInt();
        
        int arrOfWeight[] = new int[noOfHorses];
        System.out.println("Enter weight of horses:");
        for(int i = 0; i < noOfHorses; i++)
        {
        	arrOfWeight[i] = s.nextInt();
        }
        maxWeight = arrOfWeight[0];
        for(int i = 0; i < noOfHorses; i++)
        {
        		if(maxWeight < arrOfWeight[i])
        		{
        			maxWeight = arrOfWeight[i];
        		}
        }
        System.out.println("Perfect Horse:"+maxWeight);
    }
}