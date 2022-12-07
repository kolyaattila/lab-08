import javax.swing.*;

public class JavaSwingExampleJMenu {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Example");

		JMenu menu = new JMenu("options");

		JMenuBar menuBar = new JMenuBar();

		JMenuItem a1 = new JMenuItem("option 1");
		JMenuItem a2 = new JMenuItem("option 2");

		menu.add(a1);
		menu.add(a2);

		menuBar.add(menu);

		frame.setJMenuBar(menuBar);
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
