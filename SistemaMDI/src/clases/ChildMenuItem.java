package clases;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JInternalFrame;

public class ChildMenuItem extends JCheckBoxMenuItem {
    private JInternalFrame frame;

    public ChildMenuItem(JInternalFrame frame) {
      super(frame.getTitle());
      this.frame = frame;
    }

    public JInternalFrame getFrame() {
      return frame;
    }
  }

