import javax.swing.*;

public class JavaSwingExampleJButton {

	public static void main(String[] args) {
		JFrame frame = new JFrame("example");
		JButton b = new JButton("click me");
		b.setBounds(40, 90, 85, 20);
		frame.add(b);
		frame.setSize(300, 300);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
