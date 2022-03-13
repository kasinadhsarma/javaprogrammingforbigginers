import java.awt.*;
import java.awt.event.*;

public class add_2_numbers {
    public static void main(String[] args) {
        guiBox gb = new guiBox();
    }
}

class guiBox implements ActionListener {
    Frame f;
    Button b;
    TextField n1, n2;
    Label l;

    // add two numbers
    guiBox() {
        f = new Frame();
        b = new Button("=");
        l = new Label(".");

        n1 = new TextField();
        n2 = new TextField();

        // feild props
        n1.setEditable(true);
        n2.setEditable(true);

        // Bounds
        n1.setBounds(50,50,150,20);
        n2.setBounds(50,80,150,20);
        b.setBounds(50,110,150,20);
        l.setBounds(50,140,150,20);
        
        // add to frame
        f.add(n1);
        f.add(n2);
        f.add(b);
        f.add(l);

        // add button action listener
        b.addActionListener(this);

        // set layout & visible bool
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        int n1 = Integer.parseInt(this.n1.getText());
        int n2 = Integer.parseInt(this.n2.getText());
        int sum = n1 + n2;
        l.setText(String.valueOf(sum));
        f.add(l);
        f.setVisible(true);
    }
}