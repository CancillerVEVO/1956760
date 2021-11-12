import javax.swing.JOptionPane;

public class Tarea20 {
    public static void main(String[] args) {
        String title = "Busqueda en Matriz";
        String[] sizeStr = JOptionPane
                .showInputDialog(null, "Dimension de matriz(NxM):", title, JOptionPane.PLAIN_MESSAGE).split("x");
        int n = Integer.parseInt(sizeStr[0]), m = Integer.parseInt(sizeStr[1]);

        String[] matLines = new String[m];
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; ++i) {
            matLines[i] = JOptionPane.showInputDialog(null,
                    "Fila " + (i + 1) + "/" + n + " (escribir elementos separados por un espacio):", title,
                    JOptionPane.PLAIN_MESSAGE);
            String[] elements = matLines[i].split(" ");
            for (int j = 0; j < m; ++j)
                matrix[i][j] = Integer.parseInt(elements[j]);
        }

        int element = Integer
                .parseInt(JOptionPane.showInputDialog(null, "Elemento a buscar:", title, JOptionPane.PLAIN_MESSAGE));

        int found = 0;

        for (int i = 0; i < n; ++i)
            for (int j = 0; j < m; ++j)
                if (matrix[i][j] == element)
                    found += 1;

        String message = "";

        if (found == 0)
            message = "Elemento " + element + " no fue encontrado.";
        else
            message = "Elemento " + element + " fue encontrado " + found + " veces.";

        message += "\n";

        message += String.join("\n", matLines);

        JOptionPane.showMessageDialog(null, message, title, JOptionPane.PLAIN_MESSAGE);
    }
}
