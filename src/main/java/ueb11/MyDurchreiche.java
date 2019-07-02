package ueb11;
import sun.awt.image.ImageWatched;

import java.rmi.server.ExportException;
import java.util.Queue;
import java.util.LinkedList;


public class MyDurchreiche<Speise> implements Durchreiche<Speise> {

    int k;
    Queue<Speise> warteschlange = new LinkedList<Speise>();

    public MyDurchreiche(int k){
        this.k = k;
    }
    @Override
    public synchronized Speise get() {
        if(warteschlange.size() == 0){
            try {
                wait();
            } catch (InterruptedException e) {

        }
            notifyAll();
        }
        return warteschlange.remove();

    }

    @Override
    public synchronized void put(Speise o) {
        if(warteschlange.size() == k){
           try {
               wait();
           } catch(InterruptedException e) {
           }
        }
        warteschlange.add(o);
        notifyAll();
    }


    }

