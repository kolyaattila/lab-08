import javax.swing.*;

public class JavaSwingExampleJTextField {

	public static void main(String[] args) {
		JFrame frame = new JFrame("example");
		JTextField b = new JTextField("Change me...");
		b.setBounds(50,100,200,30);
		frame.add(b);
		frame.setSize(300,300);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}


