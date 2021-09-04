package views;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainWindow extends JFrame {
    public JButton startBtn = new JButton("Start");
    public JButton stopBtn = new JButton("Stop");

    public MainWindow() {
        this.setLayout(new BoxLayout(
            this.getContentPane(), 
            BoxLayout.PAGE_AXIS));
        this.add(startBtn);
        this.add(stopBtn);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 250);
    }
    
}
