/*Write a java program to find whether given sentence is Pangram or not. If it is pangram, then print 1 else
print -1.A pangram is a sentence containing every letter in the English Alphabet. Ex: The quick brown
fox jumps over the lazy Dog.*/

import java.util.ArrayList;
public class primeFibbo
{
    public static void main(String[] args)
    {
        int limit=100000;
        ArrayList<Integer> arr = new ArrayList<>();
        int a=0;
        int b=1;
        int next=0;
        while(a<=limit)
        {   
            next=a+b;
            arr.add(a);
            a=b;
            b=next;
        }
        for(int q :arr)
        {
            if(isPrime(q))
            {    
                System.out.println(q);
            }
        }
    }
        public static boolean isPrime(int a)
        {
            int flag=0;
            if(a<=1)
            {
                return false;
            }
            for(int i=2;i<a;i++)
            {
                if(a%i==0)
                {
                    flag=1;
                    return false;
                }
            }
            return true;
        }
}