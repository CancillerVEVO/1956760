import javax.swing.JOptionPane;

public class Tarea22 {
    public static void main(String[] args) {
        String title = "Multiplicacion de Matrices";
        int n1, n2, m1, m2;
        n1 = n2 = m1 = m2 = 0;
        String[] s1 = JOptionPane
                .showInputDialog(null, "Dimension primer matriz(NxM):", title, JOptionPane.PLAIN_MESSAGE).split("x"),
                s2 = JOptionPane
                        .showInputDialog(null, "Dimension segunda matriz(NxM): ", title, JOptionPane.PLAIN_MESSAGE)
                        .split("x");

        n1 = Integer.parseInt(s1[0]);
        m1 = Integer.parseInt(s1[1]);
        n2 = Integer.parseInt(s2[0]);
        m2 = Integer.parseInt(s2[1]);

        if (m1 != n2) {
            JOptionPane.showMessageDialog(null,
                    "Las columnas de la primera matriz deben de ser igual a las filas de la segunda matriz.", title,
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        int[][] mat1 = new int[n1][m1], mat2 = new int[n2][m2], mult = new int[n1][m2];

        for (int i = 0; i < n1; ++i) {
            String[] line = JOptionPane
                    .showInputDialog(null, "Matriz: 1/2, Fila: " + (i + 1) + "/" + n1, title, JOptionPane.PLAIN_MESSAGE)
                    .split(" ");
            for (int j = 0; j < m1; ++j)
                mat1[i][j] = Integer.parseInt(line[j]);
        }

        for (int i = 0; i < n2; ++i) {
            String[] line = JOptionPane
                    .showInputDialog(null, "Matriz: 2/2, Fila: " + (i + 1) + "/" + n2, title, JOptionPane.PLAIN_MESSAGE)
                    .split(" ");
            for (int j = 0; j < m2; ++j)
                mat2[i][j] = Integer.parseInt(line[j]);
        }

        String message = "";

        for (int i = 0; i < n1; ++i) {
            for (int j = 0; j < m2; ++j) {
                for (int k = 0; k < n2; ++k)
                    mult[i][j] += mat1[i][k] * mat2[k][j];
                message += mult[i][j] + " ";
            }
            message += '\n';
        }

        JOptionPane.showMessageDialog(null, message, title, JOptionPane.PLAIN_MESSAGE);
    }
}
