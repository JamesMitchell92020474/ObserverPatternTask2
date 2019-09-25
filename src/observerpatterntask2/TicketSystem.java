/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpatterntask2;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @title TicketSystem.java
 * @author James Mitchell 92020474
 * @date 25/09/2019
 */
public class TicketSystem extends Observable{
 
    // set some backing fields
    private final ArrayList<Observer> observers;
    private int currentTicketNumber;
    
    // ctor
    public TicketSystem() {
            super();
            // set some defaults
            currentTicketNumber = 231;
            observers = new ArrayList<Observer>(){};
    }

    public void callPatient() {
        setChanged();
        notifyObservers(this, currentTicketNumber);
        currentTicketNumber ++;
    }

    public void notifyObservers(Observable observable, Object currentNumber) {
            System.out.println("Notifying all waiting patients. Calling patient number " + (int) currentNumber + "?");
            observers.forEach((ob) -> {
                ob.update(observable, currentNumber);
        });
    }

    public void registerObserver(Observer observer) {
             observers.add(observer);
    }

    public void removeObserver(Observer observer) {
             observers.remove(observer);
    }
}
