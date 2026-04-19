package swings;
 
	import java.awt.Color;
	import java.awt.Font;
	import javax.swing.*;

	public class SwingExample1 {
		    SwingExample1() {
		        JFrame jfrm = new JFrame("Swing Application");

		        jfrm.setSize(500, 200);
		        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		        JLabel jlab = new JLabel("Hello! VI C, Welcome to Swing Programming");
		        jlab.setFont(new Font("Serif", Font.PLAIN, 32));
		        jlab.setForeground(Color.BLUE);

		        jfrm.add(jlab);
		        jfrm.setVisible(true);
		    }

		    public static void main(String[] args) {
		        new SwingExample1();
		    }
		}

  
