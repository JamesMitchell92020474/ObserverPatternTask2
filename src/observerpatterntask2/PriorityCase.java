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
 * @title PriorityCase.java
 * @author James Mitchell 92020474
 * @date 25/09/2019
 */
public class PriorityCase implements Observer{
    
    // mandatory method because implements Observer

    /**
     *
     * @param mySubject
     * @param calledNumber
     */
    
    @Override
    public void update(Observable mySubject, Object calledNumber) {

        System.out.println("Hi, i am a priority case. I will see the doctor first instead.\n");
        
        // now decrement the Subject's number counter, so the waiting patient gets called next
        TicketSystem subjectTicketSys = (TicketSystem) mySubject;
        subjectTicketSys.decrementTicketNumber();
    }
}