/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpatterntask2;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @title Patient.java
 * @author James Mitchell 92020474
 * @date 25/09/2019
 */
public class Patient implements Observer{
    
    // set a backing field
    private final int ticketNumber;	

    // ctor
    public Patient(int newTicket) {
            ticketNumber = newTicket;
    }

    // mandatory method because implements Observer

    /**
     *
     * @param mySubject
     * @param calledNumber
     */
    @Override
    public void update(Observable mySubject, Object calledNumber) {
        if ( (int) calledNumber == ticketNumber) {
            System.out.println("Thanks, here is my card number " + ticketNumber + ". I am ready to see the doctor.\n");            
        }
    }
}
