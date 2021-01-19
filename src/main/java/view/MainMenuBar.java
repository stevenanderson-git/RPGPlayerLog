package main.java.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * Custom class to build the menu bar
 */
public class MainMenuBar extends JMenuBar {
    private JFrame frame;

    public MainMenuBar(JFrame frame) {
        super();
        this.frame = frame;
        addFileMenu();
        addEditMenu();
    }

    /**
     * Create the edit menu
     */
    private void addEditMenu() {
        JMenu editMenu = new JMenu("Edit");
        add(editMenu);
    }

    /**
     * Create the File Menu
     */
    private void addFileMenu() {
        // Creates menu
        JMenu fileMenu = new JMenu("File");
        // Creates the "Open ..." option
        JMenuItem open = new JMenuItem("Open ...");
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: do something with this!
                System.out.println(GUIFrame.getFile());
            }
        });
        fileMenu.add(open);

        // Creates the "Quit" option
        JMenuItem quit = new JMenuItem("Quit");
        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        // adds quit to menu
        fileMenu.add(quit);
        // adds menu to bar
        add(fileMenu);
    }
}
