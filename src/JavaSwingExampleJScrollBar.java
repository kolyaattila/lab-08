import javax.swing.*;

public class JavaSwingExampleJScrollBar {

	public static void main(String[] args) {
		JFrame frame = new JFrame("example");
		JScrollBar b = new JScrollBar();
		b.setBounds(90,90,40,90);
		frame.add(b);
		frame.setSize(300,300);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
