package GameApplication;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AskPosition extends JPanel {
    public JTextField start;
    public JTextField end;
    private JLabel label, label1, label2 ;

    /**
     * Create the panel.
     */
    public AskPosition() {
        setLayout(null);

        label1 = new JLabel("Head Position");
        label1.setFont(new Font("Times New Roman", Font.BOLD, 14));
        label1.setBounds(99, 93, 90, 18);
        add(label1);

        label2 = new JLabel("Tail Position");
        label2.setFont(new Font("Times New Roman", Font.BOLD, 14));
        label2.setBounds(99, 167, 90, 14);
        add(label2);

        start = new JTextField();
        start.setBounds(252, 93, 46, 20);
        add(start);
        start.setColumns(10);

        end = new JTextField();
        end.setBounds(252, 165, 46, 20);
        add(end);
        end.setColumns(10);

        JButton btnNewButton = new JButton("OK");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(start.getText().isEmpty() || end.getText().isEmpty())
                    JOptionPane.showMessageDialog(null, "Fields Empty" ,"Error!!" ,JOptionPane.ERROR_MESSAGE);

            }
        });
        btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
        btnNewButton.setBounds(158, 231, 89, 31);
        add(btnNewButton);

        label = new JLabel("Snake number 1");
        label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
        label.setBounds(135, 25, 163, 41);
        add(label);

    }

    public void setSnakeMessage(int x) {
        label.setText("Snake number " + x);
        label1.setText("Head Position");
        label2.setText("Tail Position");
        start.setText("");
        end.setText("");
    }

    public void setLadderMessage(int x) {
        label.setText("Ladder number " + x);
        label1.setText("Start Position");
        label2.setText("End Position");
        start.setText("");
        end.setText("");
    }

    public String getStart()
    {
        return start.getText();
    }

    public String getEnd()
    {
        return end.getText();
    }

}
