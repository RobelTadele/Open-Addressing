package com.Robel;

public class HashTable {

    int collisions = 0;
    public String[] tabel;

    int size;
    int quadCounter;

    //Constructor
    HashTable(){
        tabel = new String[10];
    }

    //User number of Table
    HashTable(int table_size){
        tabel = new String[table_size];
        size = table_size;
    }

    //Linear
    public int linearProbing(String input){
        int hashCode = (input.hashCode() % tabel.length);

        if(hashCode < 0){
            hashCode = hashCode * -1;
        }
        return recursiveProbing(input, hashCode);
    }

    //Linear Recursive
    private int recursiveProbing(String input, int hashCode) {

        if(tabel[hashCode] == null) {
            tabel[hashCode] = input;
            return 0;
        }else{
            collisions++;
            hashCode++;
            return recursiveProbing(input, hashCode);
        }
    }

    //Quadratic Probing
    public int quadraticProbing(String input) {
        quadCounter = 1;
        int hashCode = (input.hashCode() % tabel.length );

        if (hashCode < 0){
            hashCode = hashCode * -1;
    }

        return recursiveQuadratic(input, hashCode);
    }

    //Quadratic recursive
    private int recursiveQuadratic(String input, int hashCode) {

        if(tabel[hashCode] == null){
            tabel[hashCode] = input;
            return 0;
        }else{
            collisions++;
            hashCode = (hashCode + (quadCounter * quadCounter))%tabel.length ;
            quadCounter++;
            return recursiveQuadratic(input, hashCode);
        }
    }


    //Hash Code Printer
    void printer(){
        for (int i = 0; i < tabel.length; i++) {
            System.out.println(tabel[i]);

            if(tabel[i] != null){
                System.out.println("HashCode: " + i);
                System.out.println();
            }
        }
    }



}
