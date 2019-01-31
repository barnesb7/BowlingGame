package com.company;

import java.util.Scanner;

public class BowlingDemo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        UserMenu userMenu = new UserMenu();

        final String roll = "1";
        final String exitProgram = "2";

        int frameCounter = 1;
        String userInput;


      do{
          userMenu.showMenu();
          userInput = scan.nextLine();

          if(userInput.equals(roll)){


          frameCounter++;
          } else if (userInput.equals(exitProgram)){

          }

      }while(frameCounter <= 10);


    }
}
