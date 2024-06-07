//creo una classe Students dichiarando il field con 'name'
public class Fruit {
    private String name;
    //creo costruttore che inizializza 'name'
    public Fruit(String name) {
        this.name = name;
    }
    //creo getter e setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //faccio override to string
    @Override
    public String toString() {
        return "Fruit{" +
                "name= " + name +
                '}';
    }
}
