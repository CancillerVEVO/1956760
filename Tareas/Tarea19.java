import javax.swing.JOptionPane;

public class Tarea19 {
    public static void main(String[] args) {
        String title = "Busqueda en Vector";
        int size = Integer
                .parseInt(JOptionPane.showInputDialog(null, "Tamaño del vector: ", title, JOptionPane.PLAIN_MESSAGE));
        String vecStr = JOptionPane.showInputDialog(null, "Vector(escribir cada elemento separado por un espacio): ",
                title, JOptionPane.PLAIN_MESSAGE);
        int element = Integer
                .parseInt(JOptionPane.showInputDialog(null, "Elemento a buscar: ", title, JOptionPane.PLAIN_MESSAGE));

        String[] tmp = vecStr.split(" ");

        int[] vector = new int[size];
        for (int i = 0; i < size; ++i)
            vector[i] = Integer.parseInt(tmp[i]);

        int found = 0;
        for (int i = 0; i < size; ++i)
            if (vector[i] == element)
                found += 1;

        String message = "";
        if (found == 0)
            message = "Elemento " + element + " no fue encontrado.";
        else
            message = "Elemento " + element + " fue encontrado " + found + " veces.";
        message += "\nVector: " + vecStr;

        JOptionPane.showMessageDialog(null, message, title, JOptionPane.PLAIN_MESSAGE);
    }
}
