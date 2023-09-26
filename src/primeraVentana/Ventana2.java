
package primeraVentana;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana2 extends JFrame{
    JButton bt1;
    JButton bt2;
    JButton bt3;
    JButton bt4;
    JButton bt5;
    JButton bt6;
    JButton bt7;
    JButton bt8;
    JButton bt9;
    JButton bt10;

    public Ventana2() throws HeadlessException {
        
        bt1 = new JButton("a");
        bt2 = new JButton("a");
        bt3 = new JButton("a");
        bt4 = new JButton("a");
        bt5 = new JButton("a");
        bt6 = new JButton("a");
        bt7 = new JButton("a");
        bt8 = new JButton("a");
        bt9 = new JButton("a");
        bt10 = new JButton("a");
        
        
        add(bt1);
        add(bt2);
        add(bt3);
        add(bt4);
        add(bt5);
        add(bt6);
        add(bt7);
        add(bt8);
        add(bt9);
        add(bt10);
        
        //setResizable(false);
        setBounds(10, 10, 300, 200);
        setSize(300, 300);
        setLayout(new FlowLayout());
        setVisible(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }
    
    
}
