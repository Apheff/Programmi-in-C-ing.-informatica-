import javax.swing.JOptionPane;

public class TestMatrix {

    private static int readInt(String message)
    {
        String s = (String)JOptionPane.showInputDialog(
                                null,
                                message,
                                "Input",
                                JOptionPane.PLAIN_MESSAGE,
                                null,
                                null,
                                "0");

        return Integer.parseInt(s);

    
    }

    public static void main(String[] args) {

        InputWindow in = new InputWindow();
        int rows = readInt("Inserire il numero di righe");
        int columns = readInt("Inserire il numero di colonne");


        IntegerMatrix matrix = new IntegerMatrix(rows, columns);

        int ijVal = -1;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++) {
                ijVal = readInt("Inserire il valore di matrix[" + i + "][" + j + "]");
                matrix.setValue(i, j, ijVal);
            }

        boolean quit = false;
        String str = null;
        int i = -1;
        int j = -1;
        while (!quit) {
            int confirm = JOptionPane.showConfirmDialog(null, "Desideri proseguire?", "Visualizzazione interattiva", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.NO_OPTION)
                quit = true;
            else {
                i = readInt("Inserire indice di riga i");
                j = readInt("Inserire indice di colonna j");
                System.out.println("matrix[" + i + "][" + j + "] = " + matrix.getValue(i, j));
            }
        }
    }
} // end class