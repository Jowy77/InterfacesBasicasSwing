package primeraVentana;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class borderLayoutVentana extends JFrame {

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

    public borderLayoutVentana() {
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
        
        setLayout(new BorderLayout());
        
        add(bt1, BorderLayout.NORTH);
        add(bt2, BorderLayout.NORTH);
        add(bt3, BorderLayout.SOUTH);
        add(bt4,BorderLayout.SOUTH);
        add(bt5,BorderLayout.EAST);
        add(bt6,BorderLayout.EAST);
        add(bt7, BorderLayout.WEST);
        add(bt8, BorderLayout.WEST);
        add(bt9, BorderLayout.CENTER);
        add(bt10, BorderLayout.CENTER);

        setBounds(10, 10, 300, 200);
        setSize(300, 300);
        setVisible(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    }

}
