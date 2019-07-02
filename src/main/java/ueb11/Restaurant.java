package ueb11;

public class Restaurant {
    public static void main(String[]args){

        MyDurchreiche durchreiche = new MyDurchreiche(3);

        Koch hans = new Koch("Hans", 3, durchreiche);
        Koch albert = new Koch("Albert", 2, durchreiche);
        Bedienung bernd = new Bedienung("Bernd", 3, durchreiche);
        Bedienung peter = new Bedienung("Peter", 2, durchreiche);

        new Thread(hans).start();
        new Thread(albert).start();
        new Thread(bernd).start();
        new Thread(peter).start();


    }

}
