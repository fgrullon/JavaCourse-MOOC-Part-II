package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.*;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator calculator;
    
    public UserInterface(Calculator calculator){
        this.calculator = calculator;
    }


    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new BorderLayout());
        
        JLabel label = new JLabel("0");
        JButton button = new JButton("Click!");
        
        ClickListener listener = new ClickListener(this.calculator, label);
        button.addActionListener(listener);
        
        container.add(label);
        container.add(button, BorderLayout.SOUTH);
    }

    public JFrame getFrame() {
        return frame;
    }
}
