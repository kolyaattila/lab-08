import javax.swing.*;

public class JavaSwingExampleJList {

	public static void main(String[] args) {
		JFrame frame  = new JFrame("example");
		DefaultListModel<String> l = new DefaultListModel<>();

		l.addElement("first item");
		l.addElement("second item");

		JList<String> jList = new JList<>(l);
		jList.setBounds(100,100,75,75);

		frame.add(jList);
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.setLayout(null);
	}

}
