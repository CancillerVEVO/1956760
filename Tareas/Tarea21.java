import javax.swing.JOptionPane;

public class Tarea21 {
    public static void main(String[] args) {
        String title = "Suma de Matrices";
        String[] sizeStr = JOptionPane
                .showInputDialog(null, "Dimension de matrices(NxM):", title, JOptionPane.PLAIN_MESSAGE).split("x");
        int n = Integer.parseInt(sizeStr[0]), m = Integer.parseInt(sizeStr[1]), matNo = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Numero de matrices a sumar: ", title, JOptionPane.PLAIN_MESSAGE));

        String[][] matLines = new String[matNo][m];
        int[][][] matrix = new int[matNo][n][m];
        int[][] sum = new int[n][m];

        for (int i = 0; i < matNo; ++i) {
            for (int j = 0; j < n; ++j) {
                matLines[i][j] = JOptionPane.showInputDialog(null,
                        "Matriz: " + (i + 1) + "/" + matNo + ", Fila: " + (j + 1) + "/" + n, title,
                        JOptionPane.PLAIN_MESSAGE);
                String[] row = matLines[i][j].split(" ");
                for (int k = 0; k < m; ++k)
                    matrix[i][j][k] = Integer.parseInt(row[k]);
            }
        }

        for (int i = 0; i < matNo; ++i)
            for (int j = 0; j < n; ++j)
                for (int k = 0; k < m; ++k)
                    sum[j][k] += matrix[i][j][k];

        String message = "";
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j)
                message += sum[i][j] + " ";
            message += "\n";
        }

        JOptionPane.showMessageDialog(null, message, title, JOptionPane.PLAIN_MESSAGE);
    }
}
