import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI {

    JFrame theFrame;
    JButton creator;
    JButton player;
    JPanel buttonPanel;

    public static void main(String[] args) {
        new MainGUI().buildGUI();
    }

    public void buildGUI() {
        theFrame = new JFrame("GLN FlashCard Player");
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        creator = new JButton("FlashCard Creator");
        creator.addActionListener(new MyCreatorListener());

        player = new JButton("FlashCard Player");
        player.addActionListener(new MyPlayerListener());

        GridLayout buttonGrid = new GridLayout(2,1);
        buttonGrid.setVgap(1);
        buttonPanel = new JPanel(buttonGrid);

        buttonPanel.add(creator);
        buttonPanel.add(player);

        theFrame.getContentPane().add(BorderLayout.CENTER, buttonPanel);
        theFrame.setVisible(true);
        theFrame.setSize(250, 300);
    }

    public class MyCreatorListener implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            FlashCardBuilder builder = new FlashCardBuilder();
            builder.go();
        }
    }

    public class MyPlayerListener implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            FlashCardPlayer reader = new FlashCardPlayer();
            reader.go();
        }
    }
}
