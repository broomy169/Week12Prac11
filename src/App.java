import view.MainFrame;

import javax.swing.*;

/**
 * Created by jc258876 on 18/05/15.
 */
public class App {
    private static MainFrame mainFrame;

    static {
        mainFrame = new MainFrame();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                mainFrame.setVisible(true);
            }
        });
    }
}
