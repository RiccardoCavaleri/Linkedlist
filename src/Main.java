import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //creo una lista di tipo Fruit
        LinkedList<Fruit> frutti = new LinkedList<>();
        //popolo la lista richiamando il tipo e i seguenti frutti
        frutti.add(new Fruit("mela"));
        frutti.add(new Fruit("pera"));
        frutti.add(new Fruit("banana"));
        frutti.add(new Fruit("mango"));
        //stampo la lista
        System.out.println("Lista frutti : " + frutti);
        //aggiungo al primo posto un nuovo frutto (addFirst)
        frutti.addFirst(new Fruit("kiwi"));
        //aggiungo all'ultimo posto un nuovo frutto (addLast)
        frutti.addLast(new Fruit("papaya"));
        //stampo la lista aggiornata
        System.out.println("Lista frutti aggiornata : " + frutti);
    }
}