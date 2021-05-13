package com.company;

public class Primes {

    public static void main(String[] args) {
        //цикл (от 2 до 100) вызова функции проверки простых чисел
        for (int i = 2; i < 101; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        //функция для нахождения простых чисел
        //если число простое, то возвращет true
        for (int i = 2; i < n; i++)
        {
            if (n%i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
