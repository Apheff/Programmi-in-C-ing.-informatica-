import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JOptionPane;

public class Config {

    //STATIC FIELDS
    private static Config config = null;

    //INSTANCE FIELDS
    private Properties properties;
    
    private Config() {
        BufferedReader buffRead = null;
        try {
            buffRead = new BufferedReader(
                new InputStreamReader(
                    new FileInputStream("config.txt"),"ISO-8859-1"));
            
            this.properties = new Properties();
            this.properties.load(buffRead);
        }
        catch(FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null,
                        "Configuration file not found, the program will be closed.",
                        "Serious ERROR",
                        JOptionPane.ERROR_MESSAGE);
            System.exit(-1);
        }
        catch(IOException ioe) {
            JOptionPane.showMessageDialog(null,
                        "Unable to read the configuration file, the program will be closed.",
                        "Serious ERROR",
                        JOptionPane.ERROR_MESSAGE);
            System.exit(-1);
        }
        finally {
            try {
                if (buffRead != null)
                    buffRead.close();
            }
            catch(IOException ioe) {
                ioe.printStackTrace();
            }
        } // end finally
    } // end constructor

    //INSTANCE METHODS
    public String getBackgroundColor() {
        return this.properties.getProperty("backgroundColor");
    }

    //STATIC METHODS
    public static Config getInstance() {
        if (config == null)
            config = new Config();
        return config;
    }

} // end class