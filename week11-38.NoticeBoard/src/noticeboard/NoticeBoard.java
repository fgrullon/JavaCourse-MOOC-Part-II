package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;
    
    public NoticeBoard(){
    
    }

    @Override
    public void run() {
        frame = new JFrame("");
        frame.setSize(400, 200);
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.setVisible(true);
        
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        
        JTextField topTextArea = new JTextField();
        JButton button = new JButton("Copy!");
        JLabel bottomLabel = new JLabel();
        
        ActionEventListener listener = new ActionEventListener(topTextArea, bottomLabel);
        button.addActionListener(listener);
        
        container.add(topTextArea);
        container.add(button);
        container.add(bottomLabel);
        
    }
}
