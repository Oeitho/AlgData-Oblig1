package code;

import java.util.Arrays;
import java.util.NoSuchElementException;

//Kode var originalt skrevet på engelsk, derfor er de originale metodenavnene beholdt i kommentarer 
//over alle metoder.

public class Oblig1 {
    
    private Oblig1() {}
    
  //public static int max(int[] numbersToBeSearchedThrough) {
    public static int maks(int[] numbersToBeSearchedThrough) {
        int arrayLength = numbersToBeSearchedThrough.length;
        int lastElementPosition = arrayLength - 1;
        
        if (arrayLength < 1)
            throw new NoSuchElementException("The provided array of integers is empty!");
        
        for (int i = 0; i < lastElementPosition; i++) {
            if (numbersToBeSearchedThrough[i] > numbersToBeSearchedThrough[i + 1]) {
                swap(numbersToBeSearchedThrough, i, i + 1);
            }
        }
        
        return numbersToBeSearchedThrough[lastElementPosition];
    }
    
  //public static int invertions(int[] numbersToBeInverted) {
    public static int ombyttinger(int[] numbersToBeInverted) {
        int invertions = 0;
        int arrayLength = numbersToBeInverted.length;
        int lastElementPosition = arrayLength - 1;
        
        if (arrayLength < 1)
            throw new NoSuchElementException("The provided array of integers is empty!");
        
        for (int i = 0; i < lastElementPosition; i++) {
            if (numbersToBeInverted[i] > numbersToBeInverted[i + 1]) {
                swap(numbersToBeInverted, i, i + 1);
                invertions++;
            }
        }
        
        return invertions;
    }
    
  //public static int amountOfUniqueSorted(int[] numbersToBeSearchedThrough) {
    public static int antallUlikeSortert(int[] unsortedArrayOfNumbers) {
        if (unsortedArrayOfNumbers.length < 1) 
            return 0;
        
        if (ombyttinger(unsortedArrayOfNumbers) > 0)
            throw new IllegalStateException("Supplied array of integers have to be sorted");
        
        int amountOfUniqueNumbers = 1;
        for (int i = 1; i < unsortedArrayOfNumbers.length; i++) {
            if (unsortedArrayOfNumbers[i] > unsortedArrayOfNumbers[i - 1]) {
                amountOfUniqueNumbers++;
            }
        }
        
        return amountOfUniqueNumbers;
    }
    
  //public static int amountOfUniqueUnsorted(int[] numbersToBeSearchedThrough) {
    public static int antallUlikeUsortert(int[] unsortedArrayOfNumbers) {
        int amountOfUniqueNumbers = 0;
        for (int i = 0; i < unsortedArrayOfNumbers.length; i++) {
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (unsortedArrayOfNumbers[i] == unsortedArrayOfNumbers[j]) {
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
    
  //public static int[] partialSort(int[] unsortedListOfNumbers) {
    public static int[] delsortering(int[] unsortedListOfNumbers) {
        int indexOfFirstEvenNumber = unsortedListOfNumbers.length;
        int arrayIterator = 0;
        
        while (indexOfFirstEvenNumber > arrayIterator) {
            if (unsortedListOfNumbers[arrayIterator] % 2 == 0) {
                swap(unsortedListOfNumbers, arrayIterator, --indexOfFirstEvenNumber);
            } else {
                arrayIterator++;
            }
        }
        
        int indexOfLastOddNumber = indexOfFirstEvenNumber - 1;
        
        quickSort(unsortedListOfNumbers, 0, indexOfLastOddNumber);
        quickSort(unsortedListOfNumbers, indexOfFirstEvenNumber, unsortedListOfNumbers.length - 1);
 
        return unsortedListOfNumbers;
    }
    
  //public static char[] rotate(char[] charsToBerotated) {
    public static char[] rotasjon(char[] charsToBeRotated) {
        if (charsToBeRotated.length <= 1) {
            return charsToBeRotated;
        }

        int indexOfLastValue = charsToBeRotated.length - 1;
        char lastValueInArray = charsToBeRotated[indexOfLastValue];
        
        for (int i = indexOfLastValue; i >= 1; i--) {
            charsToBeRotated[i] = charsToBeRotated[i - 1];
        }
        
        charsToBeRotated[0] = lastValueInArray;
        
        return charsToBeRotated;
    }
  
  //public static char[] rotate(char[] charsToBeRotated, int rotations) {
    public static char[] rotasjon(char[] charsToBeRotated, int rotations) {
        int arrayLength = charsToBeRotated.length;
        if (arrayLength <= 1) {
            return charsToBeRotated;
        }
        
        rotations = Math.floorMod(rotations, arrayLength);
        
        int indexOfLastValue = arrayLength - 1;
        char[] lastValuesOfArray = new char[rotations];
        
        for (int i = 0; i < rotations; i++) {
            lastValuesOfArray[i] = charsToBeRotated[indexOfLastValue - i];
        }
        
        int arrayIterator = indexOfLastValue;
        
        while (arrayIterator >= rotations) {
            charsToBeRotated[arrayIterator] = charsToBeRotated[arrayIterator - rotations];
            arrayIterator--;
        }
        
        while (arrayIterator >= 0) {
            charsToBeRotated[arrayIterator] = lastValuesOfArray[rotations - (arrayIterator + 1)];
            arrayIterator--;
        }
        
        return charsToBeRotated;
    }
    
  //public static String merge(String firstStringToBeMerged, String secondStringToBeMerged) {
    public static String flett(String firstStringToBeMerged, String secondStringToBeMerged) {
        int totalLength = firstStringToBeMerged.length() + secondStringToBeMerged.length();
        
        char[] result = new char[totalLength];
        int firstStringIndexIterator = 0;
        int secondStringIndexIterator = 0;
        int indexIterator = 0;
        
        while (indexIterator < totalLength) {
            if (firstStringIndexIterator < firstStringToBeMerged.length()) {
                result[indexIterator++] = firstStringToBeMerged.charAt(firstStringIndexIterator++);
            }
            if (secondStringIndexIterator < secondStringToBeMerged.length()) {
                result[indexIterator++] = secondStringToBeMerged.charAt(secondStringIndexIterator++);
            }
        }
        
        return new String(result);
    }
    
  //public static String merge(String... stringsToBeMerged) {
    public static String flett(String... stringsToBeMerged) {
        int totalArrayLength = 0;
        
        for (String stringToBeMerged: stringsToBeMerged) {
            totalArrayLength += stringToBeMerged.length();
        }
        
        char[] result = new char[totalArrayLength];
        int[] stringIndexIterators = new int[stringsToBeMerged.length];
        int indexIterator = 0;
        
        while (indexIterator < totalArrayLength) {
            for (int i = 0; i < stringsToBeMerged.length; i++) {
                if (stringIndexIterators[i] < stringsToBeMerged[i].length()) {
                    result[indexIterator++] = stringsToBeMerged[i].charAt(stringIndexIterators[i]++);
                }
            }
        }
        
        return new String(result);
    }
    
  //public static int[] indexSort(int[] numbersToBeSorted) {
    public static int[] indekssortering(int[] numbersToBeSorted) {
        int arrayLength = numbersToBeSorted.length;
        int lastElementPosition = arrayLength - 1;
        
        if (arrayLength < 1)
            return new int[] {};
        
        int[] copyOfInputArray = Arrays.copyOf(numbersToBeSorted, arrayLength);
        int[] sortedIndeces = new int[numbersToBeSorted.length];
        
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
    
  //public static boolean stringContains(String needle, String hayStack) {
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

    private static void quickSort(int[] numbersToBeSearched, int left, int right) {
        if (left >= right) {
            return;
        }
        
        int indexOfPivotAfterPartition = partition(numbersToBeSearched, left, right);
        quickSort(numbersToBeSearched, left, indexOfPivotAfterPartition - 1);
        quickSort(numbersToBeSearched, indexOfPivotAfterPartition + 1, right);
    }
    
    private static int partition(int[] numbersToBePartitioned, int left, int right) {
        int pivot = numbersToBePartitioned[right];
        
        for (int i = left; i < right; i++) {
            if (numbersToBePartitioned[i] < pivot) {
                swap(numbersToBePartitioned, left, i);
                left++;
            }
        }
        
        swap(numbersToBePartitioned, left, right);
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