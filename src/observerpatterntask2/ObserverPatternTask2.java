/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpatterntask2;

/**
 *
 * @title ObserverPatternTask2.java
 * @author James Mitchell 92020474
 * @date 25/09/2019
 */
public class ObserverPatternTask2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TicketSystem ticketSystem = new TicketSystem();
        
        // register the observers 
        ticketSystem.registerObserver(new Patient(231));
        ticketSystem.registerObserver(new Patient(232));
        ticketSystem.registerObserver(new Patient(233));
        ticketSystem.registerObserver(new Patient(234));
        ticketSystem.registerObserver(new Patient(235));
        
        //callPatient() should issue notification.
        ticketSystem.callPatient();
        ticketSystem.callPatient();
        
    }
    
}
