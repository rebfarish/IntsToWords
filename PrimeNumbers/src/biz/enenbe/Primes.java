package biz.enenbe;

public class Primes {

  public static void main(String[] args) {
    System.out.println(isPrime(3627));
  }

  public static boolean isPrime(int value) {

    boolean isPrime = true;
    if ((value % 10 == 0) || (value % 10 == 5) || (value % 10 % 2 == 0)) { //if last digit is 0 or 5 or divisible by 2

      isPrime = false;
//    } else if (value>100) {
//      if (((value % 10) + ((value / 10) % 10) + ((value / 100) % 10)) % 9 == 0) {
//        isPrime = false;
//      }
    } else {
      for (int i = 2; i < value; i++) {
        if (value % i == 0) {
          isPrime = false;
        }
      }
    }
    return isPrime;
  }

}


