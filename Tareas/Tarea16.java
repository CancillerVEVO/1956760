import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tarea16 {
    public static void main(String[] args) {
        String title = "Conversion de Temperatura", prompt = "Grados";
        String[] options = { "°C->°F", "°F->°C", "Salir" };

        JPanel panel = new JPanel();
        panel.add(new JLabel(prompt + ": "));
        JTextField textField = new JTextField(10);
        panel.add(textField);

        int i = JOptionPane.showOptionDialog(null, panel, title, JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, null);

        String message = textField.getText();
        double result = 0.0;

        if (message.isEmpty())
            return;
        result = Double.parseDouble(message);

        switch (i) {
        case 0:
            result = (result - 9.0 / 5.0) + 32;
            message = result + "°F";
            break;
        case 1:
            result = (result - 32) * 5.0 / 9.0;
            message = result + "°C";
            break;
        default:
            return;
        }

        JOptionPane.showMessageDialog(null, message, options[i], JOptionPane.PLAIN_MESSAGE);
    }
}
