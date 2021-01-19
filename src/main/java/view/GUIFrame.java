package main.java.view;

import java.awt.*;
import java.io.File;

import javax.swing.*;

public class GUIFrame extends JFrame {
    private static String FRAME_NAME = "RPG Player Log - Alpha";
    private static Dimension MINIMUM_SIZE = new Dimension(512, 512);

    // Panels to be modified by inner components
    private JPanel northPanel;
    private JPanel southPanel;
    private JPanel westPanel;
    private JPanel eastPanel;
    private JPanel contentPanel;
    private JScrollPane centerPanel;

    public GUIFrame() {
        super(FRAME_NAME);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        // TODO: change minimum size to be the largest component in center panel?
        // setMinimumSize(MINIMUM_SIZE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        // Add Menu Bar
        setJMenuBar(new MainMenuBar(this));
        initializeLayout();
        addCharacterStats();
        addButtons();

    }

    /**
     * TODO: remove after testing
     */
    private void addButtons() {
        for (int i = 0; i < 30; ++i) {
            JButton button = new JButton(Integer.toString(i));
            // removes box around text
            button.setFocusable(false);
            contentPanel.add(button);
        }
    }

    /**
     * TODO: testing old components being added to new layout
     */
    private void addCharacterStats() {
        CharacterStatView characterStatView = new CharacterStatView();
        contentPanel.add(characterStatView);
    }

    /**
     * Populates the frame. creates the scrollpane and content panel that holds
     * components
     */
    private void initializeLayout() {
        northPanel = new JPanel();
        northPanel.setBackground(Color.GRAY);
        northPanel.setPreferredSize(new Dimension(50, 50));
        add(northPanel, BorderLayout.NORTH);
        southPanel = new JPanel();
        southPanel.setBackground(Color.GRAY);
        southPanel.setPreferredSize(new Dimension(50, 50));
        add(southPanel, BorderLayout.SOUTH);
        westPanel = new JPanel();
        westPanel.setBackground(Color.DARK_GRAY);
        westPanel.setPreferredSize(new Dimension(50, 50));
        add(westPanel, BorderLayout.WEST);
        eastPanel = new JPanel();
        eastPanel.setBackground(Color.DARK_GRAY);
        eastPanel.setPreferredSize(new Dimension(50, 50));
        add(eastPanel, BorderLayout.EAST);

        // Content Panel is the center panel that the scrollPane will view
        contentPanel = new JPanel();
        contentPanel.setLayout(new WrapLayout());
        contentPanel.setBackground(Color.BLACK);
        contentPanel.setMinimumSize(new Dimension(100, 100));

        centerPanel = new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        centerPanel.setViewportView(contentPanel);
        // to speed up the scroll speed
        centerPanel.getVerticalScrollBar().setUnitIncrement(16);

        add(centerPanel, BorderLayout.CENTER);
    }

    /**
     * Adds the pane to the flow layout of the central panel
     */
    public void addToContentPanel(Component component) {
        contentPanel.add(component);
    }

    /**
     * Toggles the display visible/not depending on isVisible boolean
     */
    public void displayGUI() {
        setVisible(true);
    }

    /**
     * Opens a window to return a filepath string
     * 
     * @return FilePath string to the selected file
     */
    public static String getFile() {
        // import javax.swing.*; to open
        File file = null;
        JFileChooser chooser = new JFileChooser(System.getProperty("user.dir"));
        // displays the file window
        int tmp = chooser.showOpenDialog(null);
        file = chooser.getSelectedFile();
        if (file != null) {
            return file.toString();
        } else
            return "";
    }
}
