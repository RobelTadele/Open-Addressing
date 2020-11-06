/*
File or Class name: Main
Program author(s): Robel Tadele
Course number and title: COSC2203, Data Structures Section 1
Assignment number and name: Open Addressing

Brief description of the purpose of the program: Finding how many words can be placed in an open
addressing hash table with and without collision using Linear Probing and Quadratic Probing

 */

package com.Robel;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        //Read in text file
        File file = new File("dictionary.txt");
        Scanner reader = new Scanner(file);

        int loadFactor = 70;  //Change with Increments of 5 :Load Factor

        int nelements = 45_403; //Number of Elements

        //Number of available spaces
        int bSpaces = (int)Math.ceil((nelements * 100.0)/ loadFactor);
        //System.out.println(bSpaces);

        HashTable myTable = new HashTable(bSpaces);

        for (int i = 0; i < nelements; i++) {
            myTable.quadraticProbing(reader.nextLine());
        }

        //Prints Number of Collisions and Non-Collision inserts
        myTable.printer();

    }
}
