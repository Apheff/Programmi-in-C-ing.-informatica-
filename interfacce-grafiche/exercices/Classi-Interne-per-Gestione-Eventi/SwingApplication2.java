import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import java.awt.event.KeyEvent;



public class SwingApplication2 extends JFrame{

    private int numClicks = 0;
    private int numSlowClicks = 0;
    private final static String LABEL1_PREFIX = "Number of button clicks: ";
    private final static String LABEL2_PREFIX = "Execution of Slow Method: ";
    private JLabel label1;
    private JLabel label2;
    private JButton button1;
    private JButton button2;
    
    public SwingApplication2(){
        super("SwingApplication2");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel(new GridLayout(2, 2)); // Nx1 grid is encoded as 0x1
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30)); //top, left, bottom, right
        
        // first pair button-label1
        this.button1 = new JButton("I'm a Swing button");
        button1.setMnemonic(KeyEvent.VK_ENTER);
        // button1.addActionListener(eventHandlerbutton1());
        
        button1.addActionListener(new ActionListener() {    //Fourth method  
            @Override
            public void actionPerformed(ActionEvent e){
                numClicks++;
                label1.setText(LABEL1_PREFIX + numClicks);
            }
        });
        this.label1 = new JLabel(LABEL1_PREFIX + this.numClicks);

        // second pair button1-label2
        this.button2 = new JButton("Start Slow Method");
        button1.setMnemonic(KeyEvent.VK_ENTER);
        //button2.addActionListener(eventHandlerbutton2());

        button2.addActionListener(new ActionListener() {    //Fourth method
            @Override
            public void actionPerformed(ActionEvent e){
                slowMethod(1);
                numSlowClicks++;
                label2.setText(LABEL1_PREFIX + numSlowClicks);
            }
        });
        this.label2 = new JLabel(LABEL2_PREFIX + this.numSlowClicks);        

        panel.add(button1);
        panel.add(button2);
        panel.add(this.label1);
        panel.add(this.label2);
        panel.setBackground(new Color(251, 243, 213));
        button1.setBackground(new Color(156, 175, 170));
        button2.setBackground(new Color(156, 175, 170));

        label1.setHorizontalAlignment(JLabel.CENTER);
        label2.setHorizontalAlignment(JLabel.CENTER);  
    
        Container contPane = this.getContentPane();
        contPane.add(panel, BorderLayout.CENTER);

        this.pack();

    } //end constructor

    private void slowMethod(int sec)
    {
        try
        {
            Thread.sleep(1000 * sec);
        }
        catch(InterruptedException ie)
        { // "catch" executes when "try" fails
            ie.printStackTrace();
        }
    }// end slowMethod


    //First method
    /*
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == this.button1){
            this.numClicks++;
            this.label1.setText(LABEL1_PREFIX + this.numClicks);
        }
        else if (e.getSource() == this.button2){
            slowMethod(1);
            this.numSlowClicks++;
            this.label2.setText(LABEL2_PREFIX + this.numSlowClicks);
        }
    } // end actionPerformed
    */

    //Second method
    /*
    private class EventHandlerButton1 implements ActionListener(){
        
        @Override
        public void actionPerformed(ActionEvent e){
            numClicks++;
            label1.setText(LABEL1_PREFIX + numClicks);
        }
    }// end EventHandlerButton1() inner class
    
    private class EventHandlerButton2 implements ActionListener(){
        
        @Override
        public void actionPerformed(ActionEvent e){
            slowMethod(1);
            numSlowClicks++;
            label2.setText(LABEL2_PREFIX + numSlowClicks);
        }
    }// end EventHandlerButton2() inner class
    */

    //Third Method
    /*
    private ActionListener eventHandlerbutton1(){
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                numClicks++;
                label1.setText(LABEL1_PREFIX + numClicks);
            }
        };
    }
    
    private ActionListener eventHandlerbutton2(){
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                slowMethod(1);
                numSlowClicks++;
                label2.setText(LABEL1_PREFIX + numSlowClicks);
            }
        };
    }
    */

    public static void main(String[] args) throws Exception{
        
        /*
        Examples of UI Look and Feel
        - UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        - UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        - UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
        - UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        - UIManager.setLookAndFell("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFell")
        */
        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

        // multithread functionality
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingApplication2().setVisible(true);
            }
        });
    } //end main

} // end class