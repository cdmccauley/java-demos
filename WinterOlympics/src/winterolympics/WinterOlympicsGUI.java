/*
 * WinterOlympicsGUI class
 */

package winterolympics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class WinterOlympicsGUI implements ActionListener {
    private static WinterOlympicsGUI winterOlympics;
    private static ArrayList<OlympicEvent> olympicEvents;
    private JFrame frame;
    private JPanel panelRow, rowCell, mainPanel, viewPanel, addPanel;
    private JLabel label;
    private JButton button;
    private JComboBox comboBox;
    private JTextField textField;
    
    /*
     * constructor
     * pre: none
     * post: gui is displayed
     */
    public WinterOlympicsGUI() {
        olympicEvents = new ArrayList<OlympicEvent>(0);
        frame = new JFrame();
        panelRow = new JPanel();
        rowCell = new JPanel();
        mainPanel = new JPanel();
        viewPanel = new JPanel();
        addPanel = new JPanel();
        label = new JLabel();
        button = new JButton();
        comboBox = new JComboBox();
        textField = new JTextField();
        
        launchMainPanel();
    }
    
    /*
     * instantiate gui
     * pre: none
     * post: gui is instantiated
     */
    public static void runGUI() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            winterOlympics = new WinterOlympicsGUI();
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
        } catch (InstantiationException e) {
            System.out.println("InstantiationException");
        } catch (IllegalAccessException e) {
            System.out.println("IllegalAccessException");
        } catch (UnsupportedLookAndFeelException e) {
            System.out.println("UnsupportedLookAndFeelException");
        }
    }
    
    /*
     * event listener
     * pre: none
     * post: code block for specified command performed
     */
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        JComboBox comboBoxEvent;
        String addSelection;
        OlympicEvent viewSelection;
        int storeIndex;
        JPanel rowContainer;
        JTextField textFieldContainer;
        
        switch (command) {
            case "viewEvent":
                setViewPanel();
                frame.setContentPane(viewPanel);
                frame.pack();
                break;
            case "viewEventSelected":
                comboBoxEvent = (JComboBox)event.getSource();
                viewSelection = (OlympicEvent)comboBoxEvent.getSelectedItem();
            
                setViewPanelRows(viewSelection);
                frame.pack();
                break;
            case "addEvent":
                setAddPanel();
                frame.setContentPane(addPanel);
                frame.pack();
                break;
            case "addTypeSelected":
                comboBoxEvent = (JComboBox)event.getSource();
                addSelection = (String)comboBoxEvent.getSelectedItem();

                if (addSelection.equals("Scored Event")) {
                    setAddPanelScored();
                } else if (addSelection.equals("Timed Event")) {
                    setAddPanelTimed();
                }
                frame.pack();
                break;
            case "createScored":
                String[] scoredArgs = new String[12];
                storeIndex = 0;
                
                for (int i = 1; i <= 2; i++) {
                    rowContainer = (JPanel)addPanel.getComponent(i);
                    textFieldContainer = (JTextField)rowContainer.getComponent(1);
                    scoredArgs[storeIndex] = textFieldContainer.getText();
                    storeIndex++;
                }
                for (int j = 3; j <= 7; j++) {
                    rowContainer = (JPanel)addPanel.getComponent(j);
                    for (int k = 1; k <= 3; k += 2) {
                        textFieldContainer = (JTextField)rowContainer.getComponent(k);
                        scoredArgs[storeIndex] = textFieldContainer.getText();
                        storeIndex++;
                    }
                }
                if (validateScored(scoredArgs)) {
                    createScoredEvent(scoredArgs, 5);
                    setAddPanelCreated();
                } else {
                    //System.out.println("Scored: Invalid Input");
                    rowContainer = (JPanel)addPanel.getComponent(9);
                    rowContainer.setVisible(true);
                }
                break;
            case "createTimed":
                String[] timedArgs = new String[12];
                storeIndex = 0;
                
                for (int i = 1; i <= 2; i++) {
                    rowContainer = (JPanel)addPanel.getComponent(i);
                    textFieldContainer = (JTextField)rowContainer.getComponent(1);
                    timedArgs[storeIndex] = textFieldContainer.getText();
                    storeIndex++;
                }
                for (int j = 3; j <= 7; j++) {
                    rowContainer = (JPanel)addPanel.getComponent(j);
                    
                    textFieldContainer = (JTextField)rowContainer.getComponent(1);
                    timedArgs[storeIndex] = textFieldContainer.getText();
                    storeIndex++;
                    
                    textFieldContainer = (JTextField)rowContainer.getComponent(3);
                    timedArgs[storeIndex] = textFieldContainer.getText();
                    
                    textFieldContainer = (JTextField)rowContainer.getComponent(5);
                    timedArgs[storeIndex] += ":" + textFieldContainer.getText();
                    textFieldContainer = (JTextField)rowContainer.getComponent(7);
                    timedArgs[storeIndex] += ":" + textFieldContainer.getText();
                    storeIndex++;
                }
                if (validateTimed(timedArgs)) {
                    createTimedEvent(timedArgs, 5);
                    setAddPanelCreated();
                } else {
                    //System.out.println("Timed: Invalid Input");
                    rowContainer = (JPanel)addPanel.getComponent(9);
                    rowContainer.setVisible(true);
                }
                break;
            case "mainMenu":
                frame.setContentPane(mainPanel);
                frame.pack();
                break;
            case "closeEvent":
                frame.dispose();
                break;
        }
    }
    
    /*
     * main panel
     * pre: none
     * post: main panel constructed
     */
    public void setMainPanel() {
        /* mainPanel */
        mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(400, 400));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        
        /* mainPanel row 0 */
        panelRow = new JPanel();
        label = new JLabel("Winter Olympics Medals");
        panelRow.add(label);
        mainPanel.add(panelRow);
        
        /* mainPanel row 1 */
        panelRow = new JPanel();
        button = new JButton("View Event");
        button.setActionCommand("viewEvent");
        button.addActionListener(this);
        panelRow.add(button);
        button = new JButton("Add Event");
        button.setActionCommand("addEvent");
        button.addActionListener(this);
        panelRow.add(button);
        mainPanel.add(panelRow);
    }
    
    /*
     * create and launch application window
     * pre: none
     * post: app window launched with main panel displayed
     */
    public void launchMainPanel() {
        setMainPanel();
        frame = new JFrame("Winter Olympics");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setContentPane(mainPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        /* test objects */
        String[] skiJump02 = {"Ski Jump", "2002", "Malysz", "263.0", "Lindstrom", 
            "253.0", "Amman", "269.0", "Hannawald", "267.5", "Ahonen", "261.5"};
        createScoredEvent(skiJump02, 5);
        String[] bobsleigh14 = { "Bobsleigh", "2014", "Holcomb/Langton", "0:3:46.27", 
            "Melbardis/Dreiskens", "0:3:46.48", "Hefti/Baumann", "0:3:46.05", 
            "Kasjanov/Belugin", "0:3:46.30", "Zubkov/Voyevoda", "0:3:45.39"};
        createTimedEvent(bobsleigh14, 5);
        String[] figureSkating76 = {"Figure Skating", "1976", "Cranston", "187.38", 
            "Curry", "192.74", "Hoffmann", "187.34", "Kovalev", "187.64", "Volkov", "184.08"};
        createScoredEvent(figureSkating76, 5);
        String[] biathlon84 = {"Biathlon", "1984", "Kvalfoss", "1:14:02.4", "Mougel", 
            "1:14:53.1", "Angerer", "1:11:52.7", "Ullrich", "1:14:53.7", "Roetsch", "1:13:21.4"};
        createTimedEvent(biathlon84, 5);
        /* end test objects */
    }
    
    /*
     * root view panel
     * pre: none
     * post: root view panel constructed
     */
    public void setViewPanel() {
        /* viewPanel */
        viewPanel = new JPanel();
        viewPanel.setPreferredSize(new Dimension(400, 400));
        viewPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        viewPanel.setLayout(new BoxLayout(viewPanel, BoxLayout.PAGE_AXIS));
        
        /* viewPanel row 0 */
        panelRow = new JPanel();
        label = new JLabel("Select an Event");
        panelRow.add(label);
        comboBox = setViewPanelComboBox(olympicEvents);
        comboBox.setActionCommand("viewEventSelected");
        comboBox.addActionListener(this);
        panelRow.add(comboBox);
        viewPanel.add(panelRow);
        
        /* viewPanel row 1 */
        setNavButtons(viewPanel);
    }
    
    /*
     * update view panel combobox
     * pre: none
     * post: combobox updated with list of available events
     */
    public JComboBox setViewPanelComboBox(ArrayList olympicEvents) {
        JComboBox viewPanelComboBox;
        int listItems = olympicEvents.size();
        OlympicEvent[] toComboBox = new OlympicEvent[listItems];
        
        olympicEvents.toArray(toComboBox);
        viewPanelComboBox = new JComboBox(toComboBox);
        return(viewPanelComboBox);
    }
    
    /*
     * grow root view panel
     * pre: root view panel and olympicevent objects exist
     * post: olympicevent scores sorted and appended to root view panel
     */
    public void setViewPanelRows(OlympicEvent displayEvent) {
        if (viewPanel.getComponentCount() > 1) {
            for (int i = viewPanel.getComponentCount(); i > 1; i--) {
                viewPanel.remove(i - 1);
            }
        }
        
        displayEvent.sortScores(displayEvent.getContestantScore());
        
        /* viewPanel row 1 */
        panelRow = new JPanel();
        panelRow.setLayout(new GridLayout(1, 3));
        for (int i = 0; i < 3; i++) {
            rowCell = new JPanel();
            label = new JLabel(new ImageIcon(i + ".png"));
            rowCell.add(label);
            panelRow.add(rowCell);
        }
        viewPanel.add(panelRow);
        
        /* viewPanel row 2 */
        panelRow = new JPanel();
        panelRow.setLayout(new GridLayout(1, 3));
        for (int i = 0; i < 3; i++) {
            rowCell = new JPanel();
            label = new JLabel(displayEvent.getContestantScore()[i][0]);
            rowCell.add(label);
            panelRow.add(rowCell);
        }
        viewPanel.add(panelRow);
        
        /* viewPanel row 3 */
        panelRow = new JPanel();
        panelRow.setLayout(new GridLayout(1, 3));
        for (int i = 0; i < 3; i++) {
            rowCell = new JPanel();
            label = new JLabel(displayEvent.getContestantScore()[i][1]);
            rowCell.add(label);
            panelRow.add(rowCell);
        }
        viewPanel.add(panelRow);
        
        /* viewPanel row 4 */
        setNavButtons(viewPanel);
    }
    
    /*
     * root add panel
     * pre: none
     * post: root add panel constructed
     */
    public void setAddPanel() {
        String[] typeMenu = {"Select Type To Add:", "Scored Event", "Timed Event"};
        
        /* addPanel */
        addPanel = new JPanel();
        addPanel.setPreferredSize(new Dimension(400, 400));
        addPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        addPanel.setLayout(new BoxLayout(addPanel, BoxLayout.PAGE_AXIS));
        
        /* addPanel row 0 */
        setAddPanelComboBox();
        
        /* addPanel row 1 */
        setNavButtons(addPanel);
    }
    
    /*
     * set up the combobox for the add panel
     * pre: none
     * post: combobox added to add panel
    */
    public void setAddPanelComboBox() {
        String[] typeMenu = {"Select Type To Add:", "Scored Event", "Timed Event"};
        
        if (addPanel.getComponentCount() > 0) {
            for (int i = addPanel.getComponentCount(); i > 0; i--) {
                addPanel.remove(i - 1);
            }
        }
        
        /* addPanel row 0 */
        panelRow = new JPanel();
        comboBox = new JComboBox(typeMenu);
        comboBox.setActionCommand("addTypeSelected");
        comboBox.addActionListener(this);
        panelRow.add(comboBox);
        addPanel.add(panelRow);
    }
    
    /*
     * grow root add panel to add a scored event
     * pre: root add panel constructed
     * post: root add panel grown to include input fields and buttons for scored event
    */
    public void setAddPanelScored() {
        if (addPanel.getComponentCount() > 1) {
            for (int i = addPanel.getComponentCount(); i > 1; i--) {
                addPanel.remove(i - 1);
            }
        }
        
        /* addPanel row 1 */
        panelRow = new JPanel();
        label = new JLabel("Event Name:");
        panelRow.add(label);
        textField = new JTextField(10);
        panelRow.add(textField);
        addPanel.add(panelRow);
        
        /* addPanel row 2 */
        panelRow = new JPanel();
        label = new JLabel("Event Year:");
        panelRow.add(label);
        textField = new JTextField(5);
        panelRow.add(textField);
        addPanel.add(panelRow);
        
        /* addPanel rows 3-7 */
        setAddScoredRows(5);
        
        /* addPanel row 8 */
        panelRow = new JPanel();
        button = new JButton("Create");
        button.setActionCommand("createScored");
        button.addActionListener(this);
        panelRow.add(button);
        addPanel.add(panelRow);
        
        /* addPanel row 9 */
        panelRow = new JPanel();
        label = new JLabel("Invalid input. Edit and try again.");
        panelRow.add(label);
        panelRow.setVisible(false);
        addPanel.add(panelRow);
        
        /* addPanel row 10 */
        setNavButtons(addPanel);
    }
    
    /*
     * add specified number of rows of input fields
     * pre: root add panel constructed
     * post: root add panel grown with specified number of rows of input fields
     */
    public void setAddScoredRows(int totalRows) {
        for (int i = 0; i < totalRows; i++) {
            panelRow = new JPanel();
            label = new JLabel("Name:");
            panelRow.add(label);
            textField = new JTextField(10);
            panelRow.add(textField);
            label = new JLabel("Score:");
            panelRow.add(label);
            textField = new JTextField(10);
            panelRow.add(textField);
            addPanel.add(panelRow);
        }
    }
    
    /*
     * validate arguments used to create a scored event
     * pre: none
     * post: boolean representation of valid/invalid data returned
     */
    public boolean validateScored(String[] scoredArgs) {
        boolean isValid = true;
        
        for (int i = 0; i <= 1; i++) {
            if (scoredArgs[i].equals(null) || scoredArgs[i].equals("")) {
                isValid = false;
            }
        }
        for (int j = 2; j <= 10; j += 2) {
            if (scoredArgs[j].equals(null) || scoredArgs[j].equals("") ||
                    scoredArgs[j + 1].equals(null) || scoredArgs[j + 1].equals("")) {
                isValid = false;
            }
            if (isValid) {
                try {
                    if (Double.parseDouble(scoredArgs[j + 1]) < 0) {
                        isValid = false;
                    }
                } catch (Exception e) {
                    isValid = false;
                }
            }
        }        
        return isValid;
    }
    
    /*
     * add a new scored event to the list of viewable events
     * pre: none
     * post: scoredevent object instantiated and stored in arraylist target
    */
    public void createScoredEvent(String[] eventArgs, int numCompetitors) {
        olympicEvents.add(new ScoredEvent(eventArgs, numCompetitors));
    }
    
    /*
     * grow root add panel to add a timed event
     * pre: root add panel constructed
     * post: root add panel grown to include input fields and buttons for timed event
     */
    public void setAddPanelTimed() {
        if (addPanel.getComponentCount() > 1) {
            for (int i = addPanel.getComponentCount(); i > 1; i--) {
                addPanel.remove(i - 1);
            }
        }
        
        /* addPanel row 1 */
        panelRow = new JPanel();
        label = new JLabel("Event Name:");
        panelRow.add(label);
        textField = new JTextField(10);
        panelRow.add(textField);
        addPanel.add(panelRow);
        
        /* addPanel row 2 */
        panelRow = new JPanel();
        label = new JLabel("Event Year:");
        panelRow.add(label);
        textField = new JTextField(5);
        panelRow.add(textField);
        addPanel.add(panelRow);
        
        /* addPanel rows 3-7 */
        setAddTimedRows(5);
        
        /* addPanel row 8 */
        panelRow = new JPanel();
        button = new JButton("Create");
        button.setActionCommand("createTimed");
        button.addActionListener(this);
        panelRow.add(button);
        addPanel.add(panelRow);
        
        /* addPanel row 9 */
        panelRow = new JPanel();
        label = new JLabel("Invalid input. Edit and try again.");
        panelRow.add(label);
        panelRow.setVisible(false);
        addPanel.add(panelRow);
        
        /* addPanel row 10 */
        setNavButtons(addPanel);
    }
    
    /*
     * add specified number of rows of input fields
     * pre: root add panel constructed
     * post: root add panel grown with specified number of rows of input fields
     */
    public void setAddTimedRows(int totalRows) {
        for (int i = 0; i < totalRows; i++) {
            panelRow = new JPanel();
            label = new JLabel("Name:");
            panelRow.add(label);
            textField = new JTextField(10);
            panelRow.add(textField);
            label = new JLabel("Score:");
            panelRow.add(label);
            textField = new JTextField(3);
            panelRow.add(textField);
            label = new JLabel("h   ");
            panelRow.add(label);
            textField = new JTextField(3);
            panelRow.add(textField);
            label = new JLabel("m   ");
            panelRow.add(label);
            textField = new JTextField(5);
            panelRow.add(textField);
            label = new JLabel("s");
            panelRow.add(label);
            addPanel.add(panelRow);
        }
    }
    
    /*
     * validate arguments used to create a timed event
     * pre: none
     * post: boolean representation of valid/invalid data returned
     */
    public boolean validateTimed(String[] timedArgs) {
        boolean isValid = true;
        
        for (int i = 0; i <= 1; i++) {
            if (timedArgs[i].equals(null) || timedArgs[i].equals("")) {
                isValid = false;
            }
        }
        for (int j = 2; j <= 10; j += 2) {
            if (timedArgs[j].equals(null) || timedArgs[j].equals("") ||
                    timedArgs[j + 1].equals(null) || timedArgs[j + 1].equals("")) {
                isValid = false;
            }
            if (isValid) {
                String[] splitContainer = new String[3];
                
                try {
                    splitContainer = timedArgs[j + 1].split(":");
                    Integer.parseInt(splitContainer[0]);
                    Integer.parseInt(splitContainer[1]);
                    Double.parseDouble(splitContainer[2]);
                    for (int k = 0; k < splitContainer.length; k++) {
                        if (Double.parseDouble(splitContainer[k]) < 0) {
                            isValid = false;
                        }
                    }
                } catch (Exception e) {
                    isValid = false;
                }
            }
        }
        return isValid;
    }
    
    /*
     * add a new timed event to the list of viewable events
     * pre: none
     * post: timedevent object instantiated and stored in arraylist target
     */
    public void createTimedEvent(String[] eventArgs, int numCompetitors) {
        olympicEvents.add(new TimedEvent(eventArgs, numCompetitors));
    }
    
    /*
     * display a message indicating event was created
     * pre: none
     * post: addpanel updated with message
     */
    public void setAddPanelCreated() {
        /* reset addPanel */
        setAddPanelComboBox();
        
        /* addPanel row 1 */
        panelRow = new JPanel();
        label = new JLabel("Event created successfully!");
        panelRow.add(label);
        addPanel.add(panelRow);
        
        /* addPanel row 2 */
        setNavButtons(addPanel);
        frame.pack();
    }
    
    /*
     * append a row of buttons used for navigation to bottom of panel
     * pre: none
     * post: main and close buttons appended to bottom of target panel
     */
    public void setNavButtons(JPanel toPanel) {
        panelRow = new JPanel();
        panelRow.setLayout(new BorderLayout());
        rowCell = new JPanel();
        button = new JButton("Main");
        button.setActionCommand("mainMenu");
        button.addActionListener(this);
        rowCell.add(button);
        button = new JButton("Close");
        button.setActionCommand("closeEvent");
        button.addActionListener(this);
        rowCell.add(button);
        panelRow.add(rowCell, BorderLayout.SOUTH);
        toPanel.add(panelRow);
    }
}