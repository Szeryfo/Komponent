/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadziala;
import java.awt.*;


/**
 *
 * @author Sebastian
 */
public class Slider extends Component{
    
            Dimension d = getSize();
            int szer = d.width-1;
            int wys = d.height-1;
            int szerKlik=0;
            int wysKlik=50;
    
    public synchronized void paint(Graphics g){
            
        Dimension d = getSize();
        szer = d.width-1;
        wys = d.height-1;
        

        //dwie linie
        g.drawLine((int)(szer/2-0.01*szer), 0, (int)(szer/2-0.01*szer), wys);
        g.drawLine((int)(szer/2+0.01*szer),0 ,(int)(szer/2+0.01*szer), wys);
        // poziome
        
        g.drawLine((int)(szer/2-0.01*szer),0,(int)(szer/2+0.01*szer),0);
        g.drawLine((int)(szer/2-0.01*szer),wys,(int)(szer/2+0.01*szer),wys);
        
        // ---up,down
       g.drawLine((int)(szer/2+0.05*szer),0,(int)(szer/2+0.07*szer),0);
       g.drawLine((int)(szer/2+0.05*szer),wys,(int)(szer/2+0.07*szer),wys);
       
       for(int i=1;i<4;i++){
           int x = (wys-wys/50)-(wys/50);
           x=x/4;
            g.drawLine((int)(szer/2+0.05*szer),wys/50+x*i,(int)(szer/2+0.07*szer),wys/50+x*i);   
       }
         
       //---    
       g.drawLine((int) (szer/2-0.02*szer),(int)(wysKlik-wys*0.02),(int) (szer/2+0.02*szer),(int)(wysKlik-wys*0.02));
       g.drawLine((int) (szer/2-0.02*szer),(int)(wysKlik+wys*0.02),(int) (szer/2+0.02*szer),(int)(wysKlik+wys*0.02));
       //||      
       g.drawLine((int) (szer/2-0.02*szer),(int)(wysKlik-wys*0.02),(int) (szer/2-0.02*szer),(int)(wysKlik+wys*0.02));
       g.drawLine((int) (szer/2+0.02*szer),(int)(wysKlik+wys*0.02),(int) (szer/2+0.02*szer),(int)(wysKlik-wys*0.02));         
               
    }
    public void setWysKlik(int wys){
        this.wysKlik=wys;
    }

    
}

