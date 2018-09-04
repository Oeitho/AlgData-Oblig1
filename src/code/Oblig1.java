package code;

import java.util.NoSuchElementException;

public class Oblig1 {
    
    private Oblig1() {}
    
    public static int max(int[] arrayOfIntegers) {
        int arrayLength = arrayOfIntegers.length;
        int lastElementPosition = arrayLength - 1;
        
        if (arrayLength < 1)
            throw new NoSuchElementException("The provided array of integers is empty!");
        
        for (int i = 0; i < lastElementPosition; i++) {
            if (arrayOfIntegers[i] > arrayOfIntegers[i + 1]) {
                swap(arrayOfIntegers, i, i + 1);
            }
        }
        
        return arrayOfIntegers[lastElementPosition];
    }
    
    public static int invertions(int[] arrayOfIntegers) {
        int invertions = 0;
        int arrayLength = arrayOfIntegers.length;
        int lastElementPosition = arrayLength - 1;
        
        if (arrayLength < 1)
            throw new NoSuchElementException("The provided array of integers is empty!");
        
        for (int i = 0; i < lastElementPosition; i++) {
            if (arrayOfIntegers[i] > arrayOfIntegers[i + 1]) {
                swap(arrayOfIntegers, i, i + 1);
                invertions++;
            }
        }
        
        return invertions;
    }
    
    public static int amountOfUniqueSorted(int[] arrayOfNumbers) {
        if (arrayOfNumbers.length < 1) 
            return 0;
        
        if (invertions(arrayOfNumbers) > 0)
            throw new IllegalStateException("Supplied array of integers have to be sorted");
        
        int amountOfUniqueNumbers = 1;
        for (int i = 1; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] > arrayOfNumbers[i - 1]) {
                amountOfUniqueNumbers++;
            }
        }
        
        return amountOfUniqueNumbers;
    }
    
    private static void swap(int[] arrayOfIntegers, int indexA, int indexB) {
        int temporaryHolderValue = arrayOfIntegers[indexA];
        arrayOfIntegers[indexA] = arrayOfIntegers[indexB];
        arrayOfIntegers[indexB] = temporaryHolderValue;
    }
    
}