package com.gl.GradedProject2.Sayan_Das;
import java.util.*;

import java.util.*;

public class SkyscraperConstruction {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        
        // Input total number of floors
        System.out.println("Enter the total number of floors in the building:");
        int N = scanner.nextInt();
        
        // Input floor sizes for each day
        int[] floorSizes = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Enter the floor size given on day " + (i + 1) + ":");
            floorSizes[i] = scanner.nextInt();
        }		
        
        // Create a stack to store the assembled floors in descending order
        Stack<Integer> assembledFloors = new Stack<>();
        
        // Output the order of construction
        System.out.println("\nThe order of construction is as follows:\n");
        for (int i = 0; i < N; i++) {
            System.out.println("Day: " + (i + 1));
            int floorSize = floorSizes[i];
            boolean assembled = false;
            
            // Check for floors that can be assembled
            while (!assembledFloors.isEmpty()) {
                int topFloor = assembledFloors.peek();
                if (floorSize > topFloor) {
                    System.out.print(topFloor + " ");
                    assembledFloors.pop();
                } else {
                    break;
                }
            }
            
            // If the current floor can be assembled, add it to the stack
            assembledFloors.push(floorSize);
            
            System.out.println("\n");
        }
        
    }
}



