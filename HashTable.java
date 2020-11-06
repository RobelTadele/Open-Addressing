package com.Robel;

public class HashTable {

    int collisions = 0;
    public String[] table;
    int run = 0;
    int noCollision = 0;
    int size;


    //No-arg Constructor
    HashTable(){
        table = new String[10];
    }

    //User number of Table
    HashTable(int table_size){
        table = new String[table_size];
        size = table_size;
    }

    //Linear
    public int linearProbing(String input){
        //Reset Runtime
        run = 0;

        int hashCode = (input.hashCode() % size);

        if(hashCode < 0)
            hashCode = hashCode * -1;

        //If !null collision occured
        while (table[(int)hashCode] != null){
            //Linear Probing
            hashCode = (hashCode + 1)% size;
            collisions++;
            run++;
        }

        //No collision counter
        if(run == 0)
            noCollision++;

        table[hashCode] = input;
        return collisions;
    }

    //Quadratic Probing
    public int quadraticProbing(String input) {
        //Reset run time
        run = 0;

        int hashCode = (input.hashCode() % size);

        //If hash is negative change to positive
        if (hashCode < 0)
            hashCode = hashCode * -1;

        //If !null collision occured
        while (table[hashCode] != null){
            collisions++;
            run++;
            //Quadratic Probing
            hashCode = (int) Math.abs((hashCode + (long)Math.pow(collisions,2)) % size);
        }

        //No collision counter
        if(run == 0)
            noCollision++;

        table[hashCode] = input;
        return collisions;
    }


    //Hash Code Printer
    void printer(){

        /*for (int i = 0; i < table.length; i++) {
            if(table[i] != null){
                System.out.println(table[i]);
                System.out.println("HashCode: " + i);
                System.out.println();
            }
        }*/
        System.out.println("No Collision: " + noCollision);
        System.out.println();
        System.out.println("Total Collisions: " + collisions);

    }

}
