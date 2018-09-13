package code;

import java.util.Arrays;
import java.util.NoSuchElementException;

//Kode var originalt skrevet på engelsk, derfor er de originale metodenavnene beholdt i kommentarer 
//over alle metoder.

public class Oblig1 {
    
    private Oblig1() {}
    
  //public static int max(int[] arrayOfNumbers) {
    public static int maks(int[] arrayOfNumbers) {
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
    
  //public static int invertions(int[] arrayOfNumbers) {
    public static int ombyttinger(int[] arrayOfNumbers) {
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
    
  //public static int amountOfUniqueSorted(int[] arrayOfNumbers) {
    public static int antallUlikeSortert(int[] arrayOfNumbers) {
        if (arrayOfNumbers.length < 1) 
            return 0;
        
        if (ombyttinger(arrayOfNumbers) > 0)
            throw new IllegalStateException("Supplied array of integers have to be sorted");
        
        int amountOfUniqueNumbers = 1;
        for (int i = 1; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] > arrayOfNumbers[i - 1]) {
                amountOfUniqueNumbers++;
            }
        }
        
        return amountOfUniqueNumbers;
    }
    
  //public static int amountOfUniqueUnsorted(int[] arrayOfNumbers) {
    public static int antallUlikeUsortert(int[] arrayOfNumbers) {
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
    
  //public static int[] partialSort(int[] arrayOfNumbers) {
    public static int[] delsortering(int[] arrayOfNumbers) {
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
    
  //public static char[] rotate(char[] arrayOfChars) {
    public static char[] rotasjon(char[] arrayOfChars) {
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
  
  //public static char[] rotate(char[] arrayOfChars, int rotations) {
    public static char[] rotasjon(char[] arrayOfChars, int rotations) {
        int arrayLength = arrayOfChars.length;
        if (arrayLength <= 1) {
            return arrayOfChars;
        }
        
        rotations = Math.floorMod(rotations, arrayLength);
        
        int indexOfLastValue = arrayLength - 1;
        char[] lastValuesOfArray = new char[rotations];
        
        for (int i = 0; i < rotations; i++) {
            lastValuesOfArray[i] = arrayOfChars[indexOfLastValue - i];
        }
        
        int arrayIterator = indexOfLastValue;
        
        while (arrayIterator >= rotations) {
            arrayOfChars[arrayIterator] = arrayOfChars[arrayIterator - rotations];
            arrayIterator--;
        }
        
        while (arrayIterator >= 0) {
            arrayOfChars[arrayIterator] = lastValuesOfArray[rotations - (arrayIterator + 1)];
            arrayIterator--;
        }
        
        return arrayOfChars;
    }
    
  //public static String merge(String firstString, String secondString) {
    public static String flett(String firstString, String secondString) {
        int totalLength = firstString.length() + secondString.length();
        
        char[] result = new char[totalLength];
        int firstStringIndexIterator = 0;
        int secondStringIndexIterator = 0;
        int indexIterator = 0;
        
        while (indexIterator < totalLength) {
            if (firstStringIndexIterator < firstString.length()) {
                result[indexIterator++] = firstString.charAt(firstStringIndexIterator++);
            }
            if (secondStringIndexIterator < secondString.length()) {
                result[indexIterator++] = secondString.charAt(secondStringIndexIterator++);
            }
        }
        
        return new String(result);
    }
    
  //public static String merge(String... strings) {
    public static String flett(String... strings) {
        int totalArrayLength = 0;
        
        for (String string: strings) {
            totalArrayLength += string.length();
        }
        
        char[] result = new char[totalArrayLength];
        int[] stringIndexIterators = new int[strings.length];
        int indexIterator = 0;
        
        while (indexIterator < totalArrayLength) {
            for (int i = 0; i < strings.length; i++) {
                if (stringIndexIterators[i] < strings[i].length()) {
                    result[indexIterator++] = strings[i].charAt(stringIndexIterators[i]++);
                }
            }
        }
        
        return new String(result);
    }
    
  //public static int[] indexSort(int[] arrayOfNumbers) {
    public static int[] indekssortering(int[] arrayOfNumbers) {
        int arrayLength = arrayOfNumbers.length;
        int lastElementPosition = arrayLength - 1;
        
        if (arrayLength < 1)
            return new int[] {};
        
        int[] copyOfInputArray = Arrays.copyOf(arrayOfNumbers, arrayLength);
        int[] sortedIndeces = new int[arrayOfNumbers.length];
        
        for (int i = 0; i < arrayLength; i++) {
            sortedIndeces[i] = i;
        }
        
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < lastElementPosition ; j++) {
                if (copyOfInputArray[j] > copyOfInputArray[j + 1]) {
                    swap(copyOfInputArray, j, j + 1);
                    swap(sortedIndeces, j, j + 1);
                }
            }
        }
        
        
        return sortedIndeces;
    }

  //public static int[] threeSmallest(int[] arrayOfNumbers) {
    public static int[] tredjeMin(int[] arrayOfNumbers) {
        int lengthOfArray = arrayOfNumbers.length;
        if (lengthOfArray < 3)
            throw new NoSuchElementException("Input array contains less than 3 numbers");
        
        int[] indexOfThreeSmallestNumbers = indekssortering(Arrays.copyOf(arrayOfNumbers, 3));
        int smallest = indexOfThreeSmallestNumbers[0];
        int secondSmallest = indexOfThreeSmallestNumbers[1];
        int thirdSmallest= indexOfThreeSmallestNumbers[2];
        
        for (int i = 3; i < lengthOfArray; i++) {
            if (arrayOfNumbers[i] < arrayOfNumbers[thirdSmallest]) {
                if (arrayOfNumbers[i] < arrayOfNumbers[secondSmallest]) {
                    if (arrayOfNumbers[i] < arrayOfNumbers[smallest]) {
                        thirdSmallest = secondSmallest;
                        secondSmallest = smallest;
                        smallest = i;
                    } else {
                        thirdSmallest = secondSmallest;
                        secondSmallest = i;
                    }
                } else {
                    thirdSmallest = i;
                }
            }
        }
        
        return new int[] {smallest, secondSmallest, thirdSmallest};
    }
    
  //public static boolean stringContains(String firstString, String secondString) {
    public static boolean inneholdt(String needle, String hayStack) {
        if ("".equals(needle))
            return true;
        if ("".equals(hayStack))
            return false;
        
        char[] needleCharArray = needle.toCharArray();
        char[] hayStackCharArray = hayStack.toCharArray();
        
        for (int i = 0; i < needleCharArray.length; i++) {
            for (int j = i; j < hayStackCharArray.length; j++) {
                if (needleCharArray[i] == hayStackCharArray[j]) {
                    swap(hayStackCharArray, i, j);
                    break;
                }
            }
        }
        
        for (int i = 0; i < needleCharArray.length; i++) {
            if (needleCharArray[i] != hayStackCharArray[i])
                return false;
        }
        
        return true;
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
    
    private static void swap(char[] arrayOfChars, int indexA, int indexB) {
        char temporaryHolderValue = arrayOfChars[indexA];
        arrayOfChars[indexA] = arrayOfChars[indexB];
        arrayOfChars[indexB] = temporaryHolderValue;
    }
    
}