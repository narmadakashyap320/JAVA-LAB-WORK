import java.applet.Applet; import java.awt.*;
public class StringAnimation extends Applet implements Runnable {
 int x=10; Thread t; public void start(){t=new Thread(this);t.start();}
 public void run(){while(t!=null){x+=5;if(x>getWidth())x=-150;repaint();try{Thread.sleep(100);}catch(InterruptedException e){Thread.currentThread().interrupt();break;}}}
 public void paint(Graphics g){g.drawString("Welcome to Java",x,60);}
 public void stop(){t=null;}
}
