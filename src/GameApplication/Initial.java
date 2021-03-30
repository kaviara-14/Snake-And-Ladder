package GameApplication;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Initial extends JPanel {

    public JTextField dimension ,snakes, ladders;

    /**
     * Create the panel.
     */
    public Initial() {
        setLayout(null);

        dimension = new JTextField();
        dimension.setBounds(265, 31, 86, 20);
        add(dimension);
        dimension.setColumns(10);

        JLabel lblNumberOfPlayers = new JLabel("Dimension of Board");
        lblNumberOfPlayers.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblNumberOfPlayers.setBounds(60, 21, 160, 36);
        add(lblNumberOfPlayers);

        JLabel lblNewLabel = new JLabel("Number of Snakes");
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblNewLabel.setBounds(60, 85, 125, 36);
        add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Number of Ladders");
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblNewLabel_1.setBounds(60, 155, 140, 36);
        add(lblNewLabel_1);

        JLabel label = new JLabel("(5 - 12)");
        label.setFont(new Font("Tahoma", Font.PLAIN, 12));
        label.setBounds(378, 34, 46, 14);
        add(label);



        snakes = new JTextField();
        snakes.setBounds(265, 95, 86, 20);
        add(snakes);
        snakes.setColumns(10);

        ladders = new JTextField();
        ladders.setBounds(265, 165, 86, 20);
        add(ladders);
        ladders.setColumns(10);


    }

}
