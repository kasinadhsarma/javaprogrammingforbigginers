import java.awt.*;
import java.awt.event.*;

public class hello_world {
    public static void main(String args[]) {
        guiBox gb = new guiBox();
    }
}

class guiBox implements ActionListener {
    Frame f;
    Button b;
    Label l;

    guiBox() {
        f = new Frame();
        l = new Label();
        b = new Button("Click Me");

        f.add(b);
        f.add(l);

        b.addActionListener(this);

        f.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 10));
        f.setSize(250, 150);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        l.setText("Hello World");
        f.add(l);
        f.setVisible(true);
    }
        // FOR CLOSING THE WINDOW
        public void windowClosing(WindowEvent e) {
            f.dispose();
        }

}
