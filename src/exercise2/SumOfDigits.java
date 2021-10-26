package exercise2;

import java.util.Scanner;


public class SumOfDigits {

    public static void main(String[] args) {
      System.out.println("Chose a number between 0 and 999");
      Scanner input= new Scanner(System.in);
      int chislo = input.nextInt();
      
      int purvacifra = chislo % 10;
      chislo = chislo/10;
      int vtoracifra = chislo % 10;
      chislo = chislo/10;
      int tretacifra = chislo % 10;

      int suma = (purvacifra + vtoracifra +tretacifra);
      

      
      
     
     
     
     
     
     
     
     System.out.println("Sum of digits: " + suma);

    }

}