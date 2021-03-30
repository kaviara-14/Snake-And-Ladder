package GameApplication;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;


public class players extends JFrame {

    public JPanel contentPane ,panel ,panel1, panel2 , panel3;
    public JTextField player1Name;
    public JTextField player2Name;
    public JRadioButton rdbtn2 ,rdbtn3 ,rdbtn4;
    public JButton btnDone;
    public final ButtonGroup Group = new ButtonGroup();
    public JTextField player3Name;
    public JTextField player4Name;
    public SnakeAndLadder frame;
    public String name1, name2, name3, name4;

    /**
     * Create the frame.
     */
    public players(SnakeAndLadder mf) {
        setTitle("Hungry Snakesssss and Broken Ladders");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        frame=mf;

        btnDone = new JButton("Done");
        btnDone.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                name1 = player1Name.getText();
                name2 = player2Name.getText();
                if(rdbtn3.isSelected())
                    name3 =  player3Name.getText();
                if(rdbtn4.isSelected())
                    name4 = player4Name.getText();

                if(rdbtn2.isSelected() && (name1.isEmpty() || name2.isEmpty()))
                    JOptionPane.showMessageDialog(null, "Empty Fields" ,"Error!!" ,JOptionPane.ERROR_MESSAGE);

                else if(rdbtn3.isSelected() &&(name1.isEmpty() || name2.isEmpty() || name3.isEmpty()))
                    JOptionPane.showMessageDialog(null, "Empty Fields" ,"Error!!" ,JOptionPane.ERROR_MESSAGE);

                else if(rdbtn4.isSelected() &&(name1.isEmpty() || name2.isEmpty() || name3.isEmpty() || name4.isEmpty()))
                    JOptionPane.showMessageDialog(null, "Empty Fields" ,"Error!!" ,JOptionPane.ERROR_MESSAGE);

                else
                {
                    frame.sidePanel.player1.setText(name1);
                    frame.sidePanel.player2.setText(name2);
                    frame.sidePanel.player3.setText(name3);
                    frame.sidePanel.player4.setText(name4);
                    frame.name1 =name1;
                    frame.name2 =name2;
                    frame.name3 =name3;
                    frame.name4 =name4;
                    frame.pos1 =1;
                    frame.pos2 =1;
                    frame.pos3 =1;
                    frame.pos4 =1;
                    frame.sidePanel.setScore1(0);
                    frame.sidePanel.setScore2(0);
                    frame.currentPlayer =1;
                    frame.N =2;
                    if(rdbtn3.isSelected())
                    {
                        frame.sidePanel.setScore3(0);
                        frame.N=3;
                    }
                    if(rdbtn4.isSelected())
                    {
                        frame.sidePanel.setScore4(0);
                        frame.N=4;
                    }


                    frame.lblTurn.setText(name1 +"\'s Turn");
                    frame.lblMessage.setText("");
                    frame.setVisible(true);
                    dispose();
                    JOptionPane.showMessageDialog(null, name1 +" your colour is RED!!" );
                    JOptionPane.showMessageDialog(null, name2 +" your colour is BLACK!!");
                    frame.gridPanel.grid[1].setBackground(Color.BLACK);
                    if(rdbtn3.isSelected())
                    {
                        JOptionPane.showMessageDialog(null, name3 +" your colour is BLUE!!");
                        frame.gridPanel.grid[1].setBackground(Color.WHITE);
                    }
                    if(rdbtn4.isSelected())
                    {
                        JOptionPane.showMessageDialog(null, name4 +" your colour is ORANGE!!");
                        frame.gridPanel.grid[1].setBackground(Color.WHITE);
                    }

                }
            }
        });
        btnDone.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        btnDone.setBounds(157, 228, 89, 23);
        btnDone.setVisible(false);
        contentPane.add(btnDone);

        panel = new JPanel();
        panel.setBounds(0, 0, 434, 73);
        contentPane.add(panel);
        panel.setLayout(null);

        panel1 = new JPanel();
        panel1.setBounds(0, 84, 434, 81);
        panel1.setVisible(false);
        contentPane.add(panel1);
        panel1.setLayout(null);

        panel2 = new JPanel();
        panel2.setBounds(0, 176, 424, 41);
        panel2.setVisible(false);
        contentPane.add(panel2);
        panel2.setLayout(null);

        panel3 = new JPanel();
        panel3.setBounds(0, 206, 414, 11);
        panel3.setVisible(false);
        contentPane.add(panel3);
        panel3.setLayout(null);

        JLabel label = new JLabel("Number of Players", SwingConstants.CENTER);
        label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        label.setBounds(115, 7, 196, 32);
        panel.add(label);

        rdbtn2 = new JRadioButton("2");
        Group.add(rdbtn2);
        rdbtn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel1.setVisible(true);
                panel2.setVisible(false);
                btnDone.setVisible(true);
            }
        });
        rdbtn2.setBounds(100, 46, 109, 23);
        panel.add(rdbtn2);

        rdbtn3 = new JRadioButton("3");
        rdbtn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel1.setVisible(true);
                panel2.setVisible(true);
                btnDone.setVisible(true);
            }
        });
        Group.add(rdbtn3);
        rdbtn3.setBounds(397, 96, 19, 13);
        panel.add(rdbtn3);

        rdbtn4 = new JRadioButton("4");
        rdbtn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel1.setVisible(true);
                panel2.setVisible(true);
                panel3.setVisible(true);
                btnDone.setVisible(true);
            }
        });
        Group.add(rdbtn4);
        rdbtn4.setBounds(277, 46, 109, 23);
        panel.add(rdbtn4);

        JLabel lblPlayer = new JLabel("Player 1");
        lblPlayer.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblPlayer.setBounds(94, 11, 67, 22);
        panel1.add(lblPlayer);

        JLabel lblPlayer_1 = new JLabel("Player 2");
        lblPlayer_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblPlayer_1.setBounds(94, 56, 67, 22);
        panel1.add(lblPlayer_1);

        player1Name = new JTextField();
        player1Name.setBounds(232, 14, 86, 20);
        panel1.add(player1Name);
        player1Name.setColumns(10);

        player2Name = new JTextField();
        player2Name.setBounds(232, 59, 86, 20);
        panel1.add(player2Name);
        player2Name.setColumns(10);


        JLabel label_1 = new JLabel("Player 3");
        label_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
        label_1.setBounds(93, 12, 68, 14);
        panel2.add(label_1);

        player3Name = new JTextField();
        player3Name.setColumns(10);
        player3Name.setBounds(232, 11, 86, 20);
        panel2.add(player3Name);

        JLabel label_2 = new JLabel("Player 4");
        label_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
        label_2.setBounds(93, 12, 68, 14);
        panel3.add(label_2);

        player4Name = new JTextField();
        player4Name.setColumns(10);
        player4Name.setBounds(232, 11, 86, 20);
        panel3.add(player4Name);

        setLocationRelativeTo(null);
    }
}
