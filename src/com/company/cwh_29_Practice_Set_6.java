package com.company;

public class cwh_29_Practice_Set_6 {
    static void main(String[] args) {
        // Practice problem 1
        /*

        float [] marks = {98.1f, 45.7f, 79.5f, 99.5f, 80.5f};
        float sum = 0;
        for(float element: marks) {
            sum += element;
        }
        System.out.println("The sum of the marks is: " + sum);

        */

        // Practice problem 2
        /*
        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float num = 100.0f;
        boolean isInArray = false;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == num) {
                isInArray = true;
            }
        }
        if(isInArray){
            System.out.println("The value is present in the array");
        }
        else{
            System.out.println("The value is not present in the array");
        }
         */
        // Practice problem 3
        /*
        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(float element: marks) {
            sum += element;
        }
        System.out.println("The value of the average marks is: " + sum/marks.length);

         */
        // Practice problem 4
        /*
        int [][] mat1 = {{1, 2, 3},
                         {4, 5, 6}};
        int [][] mat2 = {{2, 6, 13},
                         {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                           {0, 0, 0}};
        for(int row = 0; row < mat1.length; row++) {  // row number of times
            for(int col = 0; col < mat1[row].length; col++) { // coloumn number of times
                System.out.format("Setting value for i=%d and j=%d\n",row,col);
                result[row][col] = mat1[row][col] + mat2[row][col];
            }
        }
        //  Printing the elements of a 2-D Array
        for(int row = 0; row < mat1.length; row++) {  // row number of times
            for(int col = 0; col < mat1[row].length; col++) { // coloumn number of times
                System.out.print(result[row][col] + " ");
                result[row][col] = mat1[row][col] + mat2[row][col];
            }
            System.out.println(""); // Prints a new line
        }

         */

        // Practice problem 5 (Reversing an array)
        // ***   Swapping logic
        /*
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;

        for (int i = 0; i < n; i++) {
            // Swap a[i] and a[l-1-i]
            //   a     b    temp
            //  |4|   |3|   ||
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }


         */

        // Practice problem 6
        /*
        int [] arr = {18, 2, 3, 45, 35, 6, 17, 8, 9};
        int max = 0; // or int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum number is " + max);


         */

        // Practice problem 7
        //System.out.println(Integer.MAX_VALUE);
        //System.out.println(Integer.MIN_VALUE);
          /*
        int [] arr = {18, 2, 3, 45, 35, 6, 17, 8, 9};
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Minimum value is " + min);

        */
        // Practice problem 8
        boolean isSorted = true;
        int[] arr = {18, 2, 3, 45, 35, 6, 17, 8, 9};
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The given array is sorted");
        }
        else {
            System.out.println("The given array is not sorted");
        }

        
    }
}
