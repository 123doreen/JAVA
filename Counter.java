import java.awt.*;
import java.awt.event.*;

public class Counter extends Frame implements ActionListener {
    private int count = 0;
    private Label countLabel;
    private Button countButton;

    public Counter() {
        super("Counter");

        countLabel = new Label("Count: 0");
        countButton = new Button("Increment");

        setLayout(new FlowLayout());

        add(countLabel);
        add(countButton);

        countButton.addActionListener(this);

        setSize(200, 100);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        // Increment count and update label
        count++;
        countLabel.setText("Count: " + count);
    }

    public static void main(String[] args) {
        new Counter();
    }
}
