package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class exp1 extends JFrame {

    private JPanel contentPane;
    private JTextField txtHelloWorld;
    private JTextField textField;
    private ButtonGroup buttongroup;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    exp1 frame = new exp1();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public exp1() {
        setTitle("test.exp1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 571, 437);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu mnNewMenu = new JMenu("File");
        menuBar.add(mnNewMenu);

        JMenu mnNewMenu_1 = new JMenu("Tools");
        mnNewMenu.add(mnNewMenu_1);

        JMenu mnNewMenu_2 = new JMenu("Delete");
        mnNewMenu_1.add(mnNewMenu_2);

        JMenu mnNewMenu_4 = new JMenu("Add");
        mnNewMenu_1.add(mnNewMenu_4);

        JSeparator separator = new JSeparator();
        mnNewMenu.add(separator);

        JMenu mnCreate = new JMenu("Create");
        mnNewMenu.add(mnCreate);

        JMenu mnNewMenu_3 = new JMenu("Import");
        mnNewMenu.add(mnNewMenu_3);

        JMenu mnNewMenu_5 = new JMenu("Export");
        mnNewMenu.add(mnNewMenu_5);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Sentence:");
        lblNewLabel.setBounds(10, 14, 58, 15);
        contentPane.add(lblNewLabel);

        txtHelloWorld = new JTextField();
        txtHelloWorld.setBounds(75, 11, 85, 21);
        txtHelloWorld.setText("Hello World!");
        contentPane.add(txtHelloWorld);
        txtHelloWorld.setColumns(10);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(165, 10, 159, 24);
        textArea.setText("世界那么大，我想来看看！");
        contentPane.add(textArea);

        textField = new JTextField();
        textField.setBounds(165, 49, 159, 21);
        contentPane.add(textField);
        textField.setColumns(20);

        JButton btnNewButton = new JButton("Click");
        btnNewButton.setBounds(354, 10, 85, 46);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("钱包那么小，哪也去不了！");
            }
        });
        contentPane.add(btnNewButton);

        JLabel lblNewLabel_1 = new JLabel("Got Point:");
        lblNewLabel_1.setBounds(31, 100, 64, 15);
        contentPane.add(lblNewLabel_1);

        JRadioButton z = new JRadioButton("0 point");
        z.setBounds(121, 96, 71, 23);
        contentPane.add(z);

        JRadioButton o = new JRadioButton("1 point");
        o.setBounds(217, 96, 71, 23);
        contentPane.add(o);

        JRadioButton t = new JRadioButton("2 point");
        t.setBounds(315, 96, 71, 23);
        contentPane.add(t);

        JRadioButton T = new JRadioButton("3 point");
        T.setBounds(401, 96, 71, 23);
        contentPane.add(T);
        ButtonGroup buttongroup = new ButtonGroup();
        buttongroup.add(z);
        buttongroup.add(o);
        buttongroup.add(t);
        buttongroup.add(T);
    }
}