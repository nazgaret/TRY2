package nazgaret;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class graphick {
    public static void main (String [] args) {

        String s1;
        s1= "Надпись";

        JFrame frame = new JFrame("АБВГДЭ");
        frame.setVisible(true);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        FlowLayout fl = new FlowLayout();
        frame.setLayout(fl);

        Button btn = new Button("Клик");
        btn.setPreferredSize(new Dimension(100,50));
        frame.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello World!");



            }

        });

        JLabel label = new JLabel(s1);
        label.setPreferredSize(new Dimension(250,50));
        frame.add(label);

    }
}
