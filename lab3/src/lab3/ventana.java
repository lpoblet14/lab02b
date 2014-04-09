package lab3;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class ventana {
	public static void main (String[] args){
		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		label.setText("Hola soy un Label");
		frame.add(label);
		JButton button = new JButton();
		button.setText("presioname");
		frame.add(button);
		frame.setTitle("Mi primera ventana");
		frame.setSize(800,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
