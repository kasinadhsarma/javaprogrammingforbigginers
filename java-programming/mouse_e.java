import java.awt.*;
import java.awt.event.*;

public class mouse_e {
    public static void main(String args[]) {
        guiBox gb = new guiBox();
    }
}

class guiBox implements MouseListener {
    Frame f;
    Button b;
    Label l;

    guiBox() {
        f = new Frame();
        l = new Label();
        b = new Button("Click Me");

        f.add(b);
        f.add(l);

        b.addMouseListener(this);

        f.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 10));
        f.setSize(250, 150);
        f.setVisible(true);
    }

    public void mouseClicked(MouseEvent me) {
        l.setText("Mouse clicked");
        f.add(l);
        f.setVisible(true);
    }

    public void mouseEntered(MouseEvent me) {
        l.setText("Mouse Entered");
        f.add(l);
        f.setVisible(true);
    }

    public void mouseExited(MouseEvent me) {
        l.setText("Mouse Exited");
        f.add(l);
        f.setVisible(true);
    }
    @Override
    public void mousePressed(MouseEvent me) {
    }
    @Override
    public void mouseReleased(MouseEvent me) {
    }
}
