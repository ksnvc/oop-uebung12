package ueb11;

public class Bedienung implements Runnable{
    String name;
    Speise[] speisen;
    MyDurchreiche<Speise> durchreiche;


    public Bedienung(String name, int n, MyDurchreiche<Speise> durchreiche){
        this.name = name;
        this.speisen = new Speise[n];
        this.durchreiche = durchreiche;
    }

    @Override
    public void run() {
        for(int i = 0; i < speisen.length; i++) {


            try {
                Thread.sleep((int) (Math.random() * 3000));

            } catch (InterruptedException e) {
            }

            System.out.println(name + " hat Essen " + durchreiche.get() + " aus der Durchreiche genommen.");
        }
    }

}

