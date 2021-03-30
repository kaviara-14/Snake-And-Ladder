package GameApplication;

import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class SidePanel extends JPanel {
    private JTextField score1;
    private JTextField score2;
    private JTextField score3;
    private JTextField score4;

    public JLabel player1,player2,player3,player4;

    /**
     * Create the panel.
     */
    public SidePanel() {
        setLayout(null);

        player1 = new JLabel("Player 1");
        player1.setFont(new Font("Times New Roman", Font.BOLD, 16));
        player1.setBounds(44, 35, 85, 32);
        add(player1);

        player2 = new JLabel("Player 2");
        player2.setFont(new Font("Times New Roman", Font.BOLD, 16));
        player2.setBounds(44, 111, 85, 32);
        add(player2);

        player3 = new JLabel("Player 3");
        player3.setFont(new Font("Times New Roman", Font.BOLD, 16));
        player3.setBounds(44, 196, 85, 32);
        add(player3);

        player4 = new JLabel("Player 4");
        player4.setFont(new Font("Times New Roman", Font.BOLD, 16));
        player4.setBounds(44, 206, 85, 32);
        add(player4);

        score1 = new JTextField();
        score1.setEditable(false);
        score1.setBounds(139, 43, 38, 20);
        add(score1);
        score1.setColumns(10);

        score2 = new JTextField();
        score2.setEditable(false);
        score2.setBounds(139, 119, 38, 20);
        add(score2);
        score2.setColumns(10);

        score3 = new JTextField();
        score3.setEditable(false);
        score3.setBounds(139, 204, 38, 20);
        add(score3);
        score3.setColumns(10);

        score4 = new JTextField();
        score4.setEditable(false);
        score4.setBounds(139, 254, 38, 20);
        add(score4);
        score4.setColumns(10);
    }


    public void setScore1(int x)
    {
        score1.setText(""+x);
    }
    public void setScore2(int x)
    {
        score2.setText(""+x);
    }
    public void setScore3(int x)
    {
        score3.setText(""+x);
    }
    public void setScore4(int x)
    {
        score4.setText(""+x);
    }
}
