import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tarea17 {
    public static void main(String[] args) {
        String title = "Conversion de Monedas", prompt = "Pesos";
        String[] options = { "Dolar", "Euro", "Yen", "DolarHK", "Salir" };

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
            result *= 0.05;
            break;
        case 1:
            result *= 0.044;
            break;
        case 2:
            result *= 5.71;
            break;
        case 3:
            result *= 0.39;
            break;
        default:
            return;
        }

        message = "" + result;
        JOptionPane.showMessageDialog(null, message, options[i], JOptionPane.PLAIN_MESSAGE);
    }
}
