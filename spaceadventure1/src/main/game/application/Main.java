package application;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Main extends JFrame {

    public Main() {

        initUI();
    }

    private void initUI() {

        add(new Board());

        setResizable(false);
        pack();

        setTitle("Space Adventures!");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            Main ex = new Main();
            ex.setVisible(true);
        });
    }
}