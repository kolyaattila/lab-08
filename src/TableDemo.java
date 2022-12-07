import javax.swing.*;
import java.awt.*;

public class TableDemo {

	private static final String[] COLUMN_NAMES = {"First Name",
			"Last Name",
			"Sport",
			"# of Years",
			"Vegetarian"};

	private static final Object[][] DATA = {
			{"Kathy", "Smith", "Snowboarding", 5, false},
			{"John", "Doe", "Rowing", 3, true},
			{"Sue", "Black", "Knitting", 2, false},
			{"Jane", "White", "Speed reading", 20, true},
			{"Joe", "Brown", "Pool", 10, false}
	};

	public static void main(String[] args) {

		JFrame container = new JFrame("Table");
		JTable table = new JTable(DATA, COLUMN_NAMES);
		table.setCellSelectionEnabled(true);

		ListSelectionListenerImpl listSelectionListener = new ListSelectionListenerImpl(table);

		ListSelectionModel select = table.getSelectionModel();
		select.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		select.addListSelectionListener(listSelectionListener);

		JScrollPane scrollPane = new JScrollPane(table);

		container.add(scrollPane);
		container.setLayout(new BorderLayout());
		container.add(table.getTableHeader(), BorderLayout.PAGE_START);
		container.add(table, BorderLayout.CENTER);
		container.setVisible(true);
		container.setSize(300, 400);
	}

}
