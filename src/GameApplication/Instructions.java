package GameApplication;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;


public class Instructions extends JFrame {

    private JPanel contentPane;

    /**
     * Create the frame.
     */
    public Instructions() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize( 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblJustRollThe = new JLabel("Just Roll the Dice!!" ,JLabel.CENTER);
        lblJustRollThe.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblJustRollThe.setBounds(10, 38, 414, 29);
        contentPane.add(lblJustRollThe);

        JLabel lblTryToClimb = new JLabel("Try to climb the Broken ladders and stay safe to reach " ,JLabel.CENTER);
        lblTryToClimb.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblTryToClimb.setBounds(0, 75, 434, 29);
        contentPane.add(lblTryToClimb);

        JLabel lblFromTheSnakesfirst = new JLabel("Escape from the Hungry snakes.First one to reach" ,JLabel.CENTER);
        lblFromTheSnakesfirst.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblFromTheSnakesfirst.setBounds(0, 115, 434, 35);
        contentPane.add(lblFromTheSnakesfirst);

        JLabel lblFinalPositionWins = new JLabel("final position wins the game!!!!" ,JLabel.CENTER);
        lblFinalPositionWins.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblFinalPositionWins.setBounds(0, 161, 434, 29);
        contentPane.add(lblFinalPositionWins);

        setLocationRelativeTo(null);
    }
}
