package com.github.gkttk.fifth.textprocessing.logic;


/**
 * This class is responsible for replace parts of given String, using char array.
 * Fields wordLength and substring get value from CharArrayTextChangerFactory.
 */
public class CharArrayTextChanger implements TextChanger {

    private final int wordLength;
    private final String substring;

    public CharArrayTextChanger(int wordLength, String subString) {
        this.wordLength = wordLength;
        this.substring = subString;
    }

    @Override
    public String changeText(String text) {
        char[] oldCharArray = text.toCharArray();

        int replacementWordCount = getAmountWordsRequiredLength(oldCharArray);  //get the word count for replacement

        int newArrayLength = getNewArrayLength(oldCharArray.length, replacementWordCount); //calculate new array size

        char[] newEmptyArray = new char[newArrayLength];

        char[] newArray = getNewArray(oldCharArray, newEmptyArray); //change necessary words and fill new array

        return String.valueOf(newArray);
    }

    /**
     * This method calculates how many words in given array of chars have length is equal to field worldLength.
     *
     * @param charsFromText an array of chairs
     * @return amount words for replacement
     */
    private int getAmountWordsRequiredLength(char[] charsFromText) {
        int countOfWords = 0;
        int currentLetterCount = 0;
        for (int i = 0; i < charsFromText.length; i++) {
            char currentLetter = charsFromText[i];
            if (isLetterOrDigit(currentLetter)) {
                currentLetterCount++;
                if (i == charsFromText.length - 1) {
                    if (currentLetterCount == this.wordLength) {
                        countOfWords++;
                    }
                }
            } else {
                if (currentLetterCount == this.wordLength) {
                    countOfWords++;
                }
                currentLetterCount = 0;
            }
        }

        return countOfWords;

    }

    /**
     * This method checks is a char letter or digit.
     *
     * @param letter char for checking.
     * @return true - char is letter or digit, false - char is not letter or digit.
     */
    private boolean isLetterOrDigit(char letter) {
        return Character.isLetterOrDigit(letter);
    }

    /**
     * This method calculates a new array length using count words for changing anc length of substring for replacement.
     *
     * @return new array length
     */
    private int getNewArrayLength(int oldArrayLength, int countWordsForChanging) {
        int lengthSubstringForChanging = this.substring.length();
        return (oldArrayLength - (countWordsForChanging * this.wordLength))
                + (countWordsForChanging * lengthSubstringForChanging);
    }

    /**
     * This method runs across the old array and checks conditions for replacement words. Using a method fillArray() to
     * replace words if it necessary.
     *
     * @return filled new array with replaced words
     */
    private char[] getNewArray(char[] oldArray, char[] newArray) {

        int startIndexOldArray = 0;
        int startIndexNewArray = 0;
        int countLettersInWord = 0;

        for (int currentIndexOldArray = 0; currentIndexOldArray < oldArray.length; currentIndexOldArray++) {
            char currentChar = oldArray[currentIndexOldArray];

            if (isLetterOrDigit(currentChar)) { //current symbol is a digit or a letter
                countLettersInWord++;
                if (currentIndexOldArray == oldArray.length - 1) {  //if reached the end of oldArray
                    fillArray(oldArray, newArray, countLettersInWord, startIndexOldArray, startIndexNewArray); //write to new array remaining characters
                }

            } else { //current symbol is not a digit or a letter
                fillArray(oldArray, newArray, countLettersInWord, startIndexOldArray, startIndexNewArray);
                if (countLettersInWord == this.wordLength) {
                    startIndexNewArray += this.substring.length() + 1;
                } else {
                    startIndexNewArray += countLettersInWord + 1;
                }
                newArray[startIndexNewArray - 1] = currentChar;
                startIndexOldArray = currentIndexOldArray + 1;
                countLettersInWord = 0;
            }
        }

        return newArray;
    }

    /**
     * This method replace words if it necessary or just copy words to new array if condition was not met.
     */
    private void fillArray(char[] oldArray, char[] newArray, int countLettersInWord,
                           int startIndexOldArray, int startIndexNewArray) {
        if (countLettersInWord == this.wordLength) {
            char[] substringArray = this.substring.toCharArray();
            System.arraycopy(substringArray, 0, newArray, startIndexNewArray, this.substring.length());
        } else {
            System.arraycopy(oldArray, startIndexOldArray, newArray, startIndexNewArray, countLettersInWord);
        }
    }


}
