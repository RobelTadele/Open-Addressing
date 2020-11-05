

public class Main {

    public static void main(String[] args) {

        HashTable myTable = new HashTable(11);

        String a1 = "hello1";
        String a2 = "hello2";
        String a3 = "hello3";
        String a4 = "hello4";
        String a5 = "hello5";
        String a6 = "hello6";
        String a7 = "hello7";
        String a8 = "hello8";
        String a9 = "hello9";
        String a10 = "hello10";



       /* myTable.linearProbing(a1);
        myTable.linearProbing(a2);
        myTable.linearProbing(a3);
        myTable.linearProbing(a4);
        myTable.linearProbing(a5);
        myTable.linearProbing(a6);
        myTable.linearProbing(a7);
        myTable.linearProbing(a8);
        myTable.linearProbing(a9);
        myTable.linearProbing(a10);*/



        myTable.quadraticProbing(a1);
        myTable.quadraticProbing(a2);
        myTable.quadraticProbing(a3);
        myTable.quadraticProbing(a4);
        myTable.quadraticProbing(a5);
        myTable.quadraticProbing(a6);
        myTable.quadraticProbing(a7);
        myTable.quadraticProbing(a8);
        myTable.quadraticProbing(a9);
        myTable.quadraticProbing(a10);



        myTable.printer();
        System.out.println("Collisions: " + myTable.collisions);

    }
}
