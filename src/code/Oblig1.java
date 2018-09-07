package code;

import java.util.NoSuchElementException;

public class Oblig1 {
    
    private Oblig1() {}
    
    public static int max(int[] arrayOfNumbers) {
        int arrayLength = arrayOfNumbers.length;
        int lastElementPosition = arrayLength - 1;
        
        if (arrayLength < 1)
            throw new NoSuchElementException("The provided array of integers is empty!");
        
        for (int i = 0; i < lastElementPosition; i++) {
            if (arrayOfNumbers[i] > arrayOfNumbers[i + 1]) {
                swap(arrayOfNumbers, i, i + 1);
            }
        }
        
        return arrayOfNumbers[lastElementPosition];
    }
    
    public static int invertions(int[] arrayOfNumbers) {
        int invertions = 0;
        int arrayLength = arrayOfNumbers.length;
        int lastElementPosition = arrayLength - 1;
        
        if (arrayLength < 1)
            throw new NoSuchElementException("The provided array of integers is empty!");
        
        for (int i = 0; i < lastElementPosition; i++) {
            if (arrayOfNumbers[i] > arrayOfNumbers[i + 1]) {
                swap(arrayOfNumbers, i, i + 1);
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
    
    public static int amountOfUniqueUnsorted(int[] arrayOfNumbers) {
        int amountOfUniqueNumbers = 0;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (arrayOfNumbers[i] == arrayOfNumbers[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                amountOfUniqueNumbers++;
            }
        }
        
        return amountOfUniqueNumbers;
    }
    
    public static int[] partialSort(int[] arrayOfNumbers) {
        int indexOfFirstEvenNumber = arrayOfNumbers.length;
        int arrayIterator = 0;
        
        while (indexOfFirstEvenNumber > arrayIterator) {
            if (arrayOfNumbers[arrayIterator] % 2 == 0) {
                swap(arrayOfNumbers, arrayIterator, --indexOfFirstEvenNumber);
            } else {
                arrayIterator++;
            }
        }
        
        int indexOfLastOddNumber = indexOfFirstEvenNumber - 1;
        
        quickSort(arrayOfNumbers, 0, indexOfLastOddNumber);
        quickSort(arrayOfNumbers, indexOfFirstEvenNumber, arrayOfNumbers.length - 1);
 
        return arrayOfNumbers;
    }
    
    public static char[] rotate(char[] arrayOfChars) {
        if (arrayOfChars.length <= 1) {
            return arrayOfChars;
        }

        int indexOfLastValue = arrayOfChars.length - 1;
        char lastValueInArray = arrayOfChars[indexOfLastValue];
        
        for (int i = indexOfLastValue; i >= 1; i--) {
            arrayOfChars[i] = arrayOfChars[i - 1];
        }
        
        arrayOfChars[0] = lastValueInArray;
        
        return arrayOfChars;
    }
    
    private static void quickSort(int[] arrayOfNumbers, int left, int right) {
        if (left >= right) {
            return;
        }
        
        int indexOfPivotAfterPartition = partition(arrayOfNumbers, left, right);
        quickSort(arrayOfNumbers, left, indexOfPivotAfterPartition - 1);
        quickSort(arrayOfNumbers, indexOfPivotAfterPartition + 1, right);
    }
    
    private static int partition(int[] arrayOfNumbers, int left, int right) {
        int pivot = arrayOfNumbers[right];
        
        for (int i = left; i < right; i++) {
            if (arrayOfNumbers[i] < pivot) {
                swap(arrayOfNumbers, left, i);
                left++;
            }
        }
        
        swap(arrayOfNumbers, left, right);
        return left;
    }
    
    private static void swap(int[] arrayOfNumbers, int indexA, int indexB) {
        int temporaryHolderValue = arrayOfNumbers[indexA];
        arrayOfNumbers[indexA] = arrayOfNumbers[indexB];
        arrayOfNumbers[indexB] = temporaryHolderValue;
    }
    
}