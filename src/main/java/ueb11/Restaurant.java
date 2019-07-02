package ueb11;

public class Restaurant {
    public static void main(String[]args){
        MyDurchreiche durchreiche = new MyDurchreiche(3);
        Koch hans = new Koch("Hans", 3, durchreiche);
        Bedienung bernd = new Bedienung("Bernd", 3, durchreiche);

        new Thread(hans).start();
        new Thread(bernd).start();

    }

}
