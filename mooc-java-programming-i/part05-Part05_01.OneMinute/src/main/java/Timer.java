/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abdallah
 */
public class Timer {
    private ClockHand hunds, secs;
    
    public Timer(){
        this.hunds = new ClockHand(100);
        this.secs =  new ClockHand(60);
    }
    
    public void advance(){
        this.hunds.advance();
        if(this.hunds.value() == 0){
            this.secs.advance();
        }
    }
    
    public String toString(){
        String huns, seconds;
        //
        if(this.hunds.value() > 9){
            huns = String.valueOf(this.hunds.value());
        } else {
            huns = "0" + String.valueOf(this.hunds.value());
        }
        //
        if(this.secs.value() > 9){
            seconds = String.valueOf(this.secs.value());
        } else {
            seconds = "0" + String.valueOf(this.secs.value());
        }
        //
        return seconds + ":" + huns;
    }
}
