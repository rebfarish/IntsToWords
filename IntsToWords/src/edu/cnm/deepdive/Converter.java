package edu.cnm.deepdive;

public class Converter {

    /**
     * Converts any integer value to words (according to the conventions followed
     * for checks and other instruments) and returns the resulting string.
     */

    public static void main(String[] args) {
      for (int i = 0; i<=100; i++){//i can be any integer
        System.out.println(formatAsWords(i));
      }

    }

    public static String formatAsWords(int value) {

      if (value < 0 ){
        throw new IllegalArgumentException();
      }
      if(value < 20){
        return units[value];
      }
      if (value < 100){
        return tens[value/10] + units[value % 10];
      }
      if (value < 1000){
        return (units[value/100] + " hundred " + formatAsWords(value % 100)).trim();

      }
      if (value < 1000000){
        return (formatAsWords(value/1000) + " thousand " + formatAsWords(value % 1000)).trim();
      }

      if (value < 1000000000){
        return (formatAsWords(value/1000000) + " million " + formatAsWords(value % 1000000)).trim();
      }

      else{
        return formatAsWords(value/1000000000) + " billion " + formatAsWords(value % 1000000000);

      }
    }

    public  static final String[] units = {
        "",
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine",
        "ten",
        "eleven",
        "twelve",
        "thirteen",
        "fourteen",
        "fifteen",
        "sixteen",
        "seventeen",
        "eighteen",
        "nineteen"
    };

    public static final String[] tens = {
        "",
        "",
        "twenty",
        "thirty",
        "forty",
        "fifty",
        "sixty",
        "seventy",
        "eighty",
        "ninety"
    };


  }





