package primeraVentana;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{

    //JFrame frame;
    //JLabel lb;
    JPanel panel;
    JButton button;

    public Ventana() {

        //frame = new JFrame("MI PRIMERA VENTANA");
        panel = new JPanel();
        //lb = new JLabel("ETIQUETA");
        button = new JButton("ª");
        
        button.setSize(100, 50);
        button.setBounds(100, 100, 75, 25);
        //lb.setBounds(50, 100, 100, 30);

        //panel.add(lb);
        panel.add(button);

        setContentPane(panel);

        //frame.add(lb);
        //frame.add(lb2);
        setResizable(false);
        setBounds(10, 10, 300, 200);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }

}
