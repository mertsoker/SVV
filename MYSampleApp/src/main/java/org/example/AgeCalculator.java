package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth date in day/month/year format (e.g.: 15 05 1990):");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        LocalDate birthDate = LocalDate.of(year, month, day); // Get birth date
        LocalDate currentDate = LocalDate.now(); // Get current date

        // Calculate age difference (in years/months/days)
        Period age = Period.between(birthDate, currentDate);

        System.out.printf("You are exactly %d years, %d months, and %d days old.%n",
                age.getYears(), age.getMonths(), age.getDays());

        scanner.close();
    }
}