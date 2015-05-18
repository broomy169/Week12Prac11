package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jc258876 on 18/05/15.
 */
public class MainFrame extends JFrame implements ActionListener {

    private JPanel centerPanel;

    public MainFrame(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(1,2));
        JPanel leftPanel = new JPanel();
        JPanel rightPanel = new JPanel();
        centerPanel.add(leftPanel);
        centerPanel.add(rightPanel);

        leftPanel.setBorder(BorderFactory.createEtchedBorder());
        leftPanel.setBackground(new Color(0,0,0,0));

        leftPanel.add(new JButton("one"));
        leftPanel.add(new JButton("two"));
        leftPanel.add(new JButton("three"));

        rightPanel.setLayout(new BorderLayout());
        rightPanel.add(new JButton("center"), BorderLayout.CENTER);
        rightPanel.add(new JButton("north"), BorderLayout.NORTH);
        rightPanel.add(new JButton("south"), BorderLayout.SOUTH);
        rightPanel.add(new JButton("east"), BorderLayout.EAST);
        rightPanel.add(new JButton("west"), BorderLayout.WEST);



        centerPanel.setPreferredSize(new Dimension(400,400));
        add(centerPanel);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu coloursMenu = new JMenu("Colours");
        menuBar.add(coloursMenu);

        coloursMenu.add(new JMenuItem("Red"));
        coloursMenu.add(new JMenuItem("Green"));
        coloursMenu.add(new JMenuItem("Blue"));

        for (int i =0; i < coloursMenu.getItemCount(); ++i) {
            System.out.printf("%d has item: %s\n", i, coloursMenu.getItem(i));
            coloursMenu.getItem(i).addActionListener(this);
        }

        pack();
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem clickedItem = (JMenuItem) e.getSource();
        String colourName = clickedItem.getText();
        System.out.println(clickedItem);

        switch (colourName) {
            case "Red":
                centerPanel.setBackground(Color.RED);
                break;
            case "Green":
                centerPanel.setBackground(Color.GREEN);
                break;
            case "Blue":
                centerPanel.setBackground(Color.BLUE);
                break;
        }
        validate();
    }
}
