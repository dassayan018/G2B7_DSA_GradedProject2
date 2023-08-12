package com.gl.GradedProject2.Sayan_Das;
import java.util.*;
public class SkyscraperConstruction 
{
    public static void main(String[] args) 
    {
    	Scanner scanner = new Scanner(System.in);
        
        // Input total number of floors
        System.out.println("Enter the total number of floors in the building:");
        int N = scanner.nextInt();
        
        // Input floor sizes for each day
        int[] floorSizes = new int[N];
        for (int i = 0; i < N; i++) 
        {
            System.out.println("Enter the floor size given on day " + (i + 1) + ":");
            floorSizes[i] = scanner.nextInt();
        }
        int q=N;
        int[] floorSizePresent = new int[N+1];
        
        for(int i=0,j=0;i<N;i++,j++)
        {
            j=i;
            floorSizePresent[floorSizes[j]]=1;
             
            System.out.println("Day "+(i+1)+":");
            if(floorSizes[j]==q)
            {
                while(j>=0&&q>0&&floorSizePresent[q]==1)
                {
                System.out.print(q+" ");
                q--;
                j--;
                }
                
            }
            
            System.out.println();
            }
    }
}


