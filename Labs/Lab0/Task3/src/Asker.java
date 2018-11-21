import javax.swing.*;

public class Asker {
	public String dialog() {
		String name = JOptionPane.showInputDialog("Name?");
		String string = "Hello, " + name + "!";
		return string;
	}
}
