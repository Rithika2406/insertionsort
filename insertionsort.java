import java.util.*;
import java.util.Scanner;
public class Main{
    public static void main(String[]args)
    {
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=S.nextInt();
        }
        for(int i=1;i<n;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                else
                {
                   break;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}