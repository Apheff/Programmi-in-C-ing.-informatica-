import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.Dimension;

public class HelloWorldSwing{
    public final static int FRAME_WIDTH = 800;
    public final static int FRAME_HEIGHT = 300;

    public static void main(String[] args){
        JFrame frame = new JFrame("HelloWorldSwingGUI");

        JLabel label = new JLabel("HelloWorldSwingGUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contPane = frame.getContentPane();
        contPane.add(label);
        frame.setPreferredSize(new Dimension(FRAME_WIDTH,FRAME_HEIGHT));
        frame.pack(); // creates a window that adapts the contento size (is preferable to setSize();)
        frame.setVisible(true);
    }// end main
}//end class