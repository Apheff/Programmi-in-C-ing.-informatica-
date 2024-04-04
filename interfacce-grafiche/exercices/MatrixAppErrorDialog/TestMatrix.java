package MatrixAppErrorDialog;

import javax.swing.JOptionPane;

public class TestMatrix {

    /*

        PIKA PIKAAA
        ⠸⣷⣦⠤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣠⣤⠀⠀⠀
        ⠀⠙⣿⡄⠈⠑⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠔⠊⠉⣿⡿⠁⠀⠀⠀
        ⠀⠀⠈⠣⡀⠀⠀⠑⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠊⠁⠀⠀⣰⠟⠀⠀⠀⣀⣀
        ⠀⠀⠀⠀⠈⠢⣄⠀⡈⠒⠊⠉⠁⠀⠈⠉⠑⠚⠀⠀⣀⠔⢊⣠⠤⠒⠊⠉⠀⡜
        ⠀⠀⠀⠀⠀⠀⠀⡽⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠩⡔⠊⠁⠀⠀⠀⠀⠀⠀⠇
        ⠀⠀⠀⠀⠀⠀⠀⡇⢠⡤⢄⠀⠀⠀⠀⠀⡠⢤⣄⠀⡇⠀⠀⠀⠀⠀⠀⠀⢰⠀
        ⠀⠀⠀⠀⠀⠀⢀⠇⠹⠿⠟⠀⠀⠤⠀⠀⠻⠿⠟⠀⣇⠀⠀⡀⠠⠄⠒⠊⠁⠀
        ⠀⠀⠀⠀⠀⠀⢸⣿⣿⡆⠀⠰⠤⠖⠦⠴⠀⢀⣶⣿⣿⠀⠙⢄⠀⠀⠀⠀⠀⠀
        ⠀⠀⠀⠀⠀⠀⠀⢻⣿⠃⠀⠀⠀⠀⠀⠀⠀⠈⠿⡿⠛⢄⠀⠀⠱⣄⠀⠀⠀⠀
        ⠀⠀⠀⠀⠀⠀⠀⢸⠈⠓⠦⠀⣀⣀⣀⠀⡠⠴⠊⠹⡞⣁⠤⠒⠉⠀⠀⠀⠀⠀
        ⠀⠀⠀⠀⠀⠀⣠⠃⠀⠀⠀⠀⡌⠉⠉⡤⠀⠀⠀⠀⢻⠿⠆⠀⠀⠀⠀⠀⠀⠀
        ⠀⠀⠀⠀⠀⠰⠁⡀⠀⠀⠀⠀⢸⠀⢰⠃⠀⠀⠀⢠⠀⢣⠀⠀⠀⠀⠀⠀⠀⠀
        ⠀⠀⠀⢶⣗⠧⡀⢳⠀⠀⠀⠀⢸⣀⣸⠀⠀⠀⢀⡜⠀⣸⢤⣶⠀⠀⠀⠀⠀⠀
        ⠀⠀⠀⠈⠻⣿⣦⣈⣧⡀⠀⠀⢸⣿⣿⠀⠀⢀⣼⡀⣨⣿⡿⠁⠀⠀⠀⠀⠀⠀
        ⠀⠀⠀⠀⠀⠈⠻⠿⠿⠓⠄⠤⠘⠉⠙⠤⢀⠾⠿⣿⠟⠋
        

    questo codice non e' sicuro perche' sottoposto a dei attacchi

    private static int readInt(String message){
        

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
    */
    private static int readInt(String message){
        
        int redInt = Integer.MAX_VALUE;


        String s = null;
        while(redInt == Integer.MAX_VALUE){
            try{
                s = (String)JOptionPane.showInputDialog(
                                        null,
                                        message,
                                        "Input",
                                        JOptionPane.PLAIN_MESSAGE,
                                        null,
                                        null,
                                        "0");
                redInt = Integer.parseInt(s);
            }
            catch(NumberFormatException nfe){
                errorMsgDialog("Devi inserire un valore intero.");
            }
        }//end while
        
        return redInt;
    }//end readInt()

    private static void errorMsgDialog(String errorMsg){
        JOptionPane.showMessageDialog(
                                    null,
                                    errorMsg,
                                    "Insert Error",
                                    0);
    }

    public static void main(String[] args) {

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
        int i = -1;
        int j = -1;
        while (!quit) {

            int confirm = JOptionPane.showConfirmDialog(null, "Desideri proseguire?", "Visualizzazione interattiva", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.NO_OPTION)
                quit = true;
            else {
                i = readInt("Inserire indice di riga i");
                j = readInt("Inserire indice di colonna j");
                try{
                    //System.out.println("matrix[" + i + "][" + j + "] = " + matrix.getValue(i, j));
                    String msg= "matrix[" + i + "][" + j + "] = " + matrix.getValue(i, j);
                    JOptionPane.showMessageDialog(null, msg, "Matrix call value", JOptionPane.PLAIN_MESSAGE);
                }
                catch(ArrayIndexOutOfBoundsException aioobe){
                    errorMsgDialog( "Attento inserisci i valori nei limiti dell'array.");
                }
            }
        }
    }
} // end class