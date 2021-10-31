import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        double fahrenheit;
        String celsius =JOptionPane.showInputDialog(null, "Qual a temperatura atual(Cº): ");
        double celsiusD = Double.parseDouble(celsius);
        
        fahrenheit = ((celsiusD*9)/5)+32;

        JOptionPane.showMessageDialog(null, "Seu valor em fahrenheit é de: " + fahrenheit, "Temperatura convertida", JOptionPane.INFORMATION_MESSAGE); 
        }
    }
