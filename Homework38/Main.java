package com.company;

public class Main
{
    public static void main(String[] args)
    {
        final int rowsCount = 5;
        final int columnsCount = 8;
        int[][] randomArray = new int[rowsCount][columnsCount];
        int arrayMaxValue = Integer.MIN_VALUE;

        for (int rowIndex = 0; rowIndex < randomArray.length; rowIndex++)
        {
            for (int columnIndex = 0; columnIndex < randomArray[rowIndex].length; columnIndex++)
            {
                int randomValue = (int) ((Math.random() * 199) - 99);
                randomArray[rowIndex][columnIndex] = randomValue;

                if (randomValue > arrayMaxValue)
                    arrayMaxValue = randomValue;

                System.out.print(randomValue + (columnIndex < randomArray[rowIndex].length - 1 ? "\t\t" : "\n"));
            }
        }

        System.out.println("\nmax value of the array: " + arrayMaxValue);
    }

}


