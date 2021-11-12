import javax.swing.JOptionPane;

public class Tarea18 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("N"));
        if (n <= 0)
            return;

        String message = "", s;

        for (int i = 1; i <= n; ++i) {
            Double a = Math.pow(i, 2 * i - 1);
            message += a;

            s = ", ";
            if (i == n)
                s = "";

            message += s;

            if (i % 10 == 0 && i != n)
                message += "\n";
        }

        JOptionPane.showMessageDialog(null, message);
    }
}
