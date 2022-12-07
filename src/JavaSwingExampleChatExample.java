import javax.swing.*;
import java.awt.*;

public class JavaSwingExampleChatExample {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Chat Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);

		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("FILE");
		JMenu helpMenu = new JMenu("Help");
		menuBar.add(fileMenu);
		menuBar.add(helpMenu);

		JMenuItem openOption = new JMenuItem("Open");
		JMenuItem saveOption = new JMenuItem("Save as");
		fileMenu.add(openOption);
		fileMenu.add(saveOption);

		JPanel panel = new JPanel(); // the panel is not visible in output
		JLabel label = new JLabel("Enter Text");
		JTextField tf = new JTextField(10); // accepts upto 10 characters
		JButton send = new JButton("Send");
		JButton reset = new JButton("Reset");
		panel.add(label); // Components Added using Flow Layout
		panel.add(label); // Components Added using Flow Layout
		panel.add(tf);
		panel.add(send);
		panel.add(reset);
		JTextArea ta = new JTextArea();

		frame.setJMenuBar(menuBar);
		frame.getContentPane().add(BorderLayout.SOUTH, panel);
		frame.getContentPane().add(BorderLayout.NORTH, tf);
		frame.getContentPane().add(BorderLayout.CENTER, ta);
		frame.setVisible(true);
	}

}
