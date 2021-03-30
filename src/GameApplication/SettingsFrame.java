package GameApplication;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SettingsFrame extends JFrame {

    private SnakeAndLadder frame;
    private JPanel contentPane;
    private Initial initial;
    private JButton btn;
    private AskPosition ap;
    public int d, l, s;
    private int i;

    /**
     * Create the frame.
     */
    public SettingsFrame(SnakeAndLadder mf) {
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Hungry Snakesssss and Broken Ladders");
        setSize(450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        frame = mf;

        initial = new Initial();
        initial.setBounds(0, 0, 444, 199);
        initial.setVisible(true);
        contentPane.add(initial);

        ap = new AskPosition();
        ap.setBounds(0, 0, 444, 209);
        ap.setVisible(false);
        contentPane.add(ap);

        btn = new JButton("Done");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (btn.getText().equals("Done")) {
                    if (initial.dimension.getText().isEmpty()
                            || initial.snakes.getText().isEmpty()
                            || initial.ladders.getText().isEmpty())
                        JOptionPane.showMessageDialog(null, "Empty fields",
                                "Error!!", JOptionPane.ERROR_MESSAGE);

                    else {
                        d = Integer.valueOf(initial.dimension.getText());
                        s = Integer.valueOf(initial.snakes.getText());
                        l = Integer.valueOf(initial.ladders.getText());

                        if (d < 5 || d > 12)
                            JOptionPane.showMessageDialog(null,
                                    "Dimension should be between 5 and 12",
                                    "Error!!", JOptionPane.ERROR_MESSAGE);

                        else if (s < 0)
                            JOptionPane.showMessageDialog(null,
                                    "Invalid number of snakes", "Error!!",
                                    JOptionPane.ERROR_MESSAGE);
                        else if (l < 0)
                            JOptionPane.showMessageDialog(null,
                                    "Invalid number of ladders", "Error!!",
                                    JOptionPane.ERROR_MESSAGE);
                        else {
                            frame.dimension =d;
                            if(d%2==1)
                            {
                                frame.evenCell =Color.WHITE;
                                frame.oddCell =Color.WHITE;
                            }
                            else
                            {
                                frame.evenCell =Color.WHITE;
                                frame.oddCell =Color.WHITE;
                            }

                            frame.gridPanel.setVisible(false);
                            frame.gridPanel = new GridPanel(d);
                            frame.gridPanel.setBounds(0, 0, 508, 551);
                            frame.contentPane.add(frame.gridPanel);

                            frame.Nsnakes =s;
                            frame.Nladders =l;
                            initial.setVisible(false);
                            btn.setText("OK");
                            i = 1;
                            changePosition();

                        }
                    }
                }

                else if (btn.getText().equals("OK")) {
                    if (i <= s) {
                        String str1 = ap.getStart(), str2 = ap.getEnd();
                        if (str1.isEmpty() || str2.isEmpty())
                            JOptionPane.showMessageDialog(null,
                                    "Empty Fields!!", "Error!!",
                                    JOptionPane.ERROR_MESSAGE);
                        else {

                            int start =Integer.valueOf(str1);
                            int end =Integer.valueOf(str2);
                            frame.snakes[i-1][0] = start;frame.gridPanel.grid[start].setBackground(frame.snakehead);
                            frame.snakes[i-1][1] = end;frame.gridPanel.grid[start].setBackground(frame.snaketail);
                            i++;
                            changePosition();

                        }
                    } else if (i > s && i <= (s + l)) {
                        String str1 = ap.getStart(), str2 = ap.getEnd();
                        if (str1.isEmpty() || str2.isEmpty())
                            JOptionPane.showMessageDialog(null,
                                    "Empty Fields!!", "Error!!",
                                    JOptionPane.ERROR_MESSAGE);

                        else {
                            int start =Integer.valueOf(str1);
                            int end =Integer.valueOf(str2);

                            frame.ladders[i - s -1][0] = start;frame.gridPanel.grid[start].setBackground(frame.ladderstart);
                            frame.ladders[i - s -1][1] = end;frame.gridPanel.grid[start].setBackground(frame.ladderend);
                            i++;
                            changePosition();

                        }
                    }
                }

            }
        });
        btn.setFont(new Font("Times New Roman", Font.BOLD, 16));
        btn.setBounds(176, 220, 89, 31);
        contentPane.add(btn);

        setLocationRelativeTo(null);
    }

    public void changePosition() {

        if (i <= s) {
            ap.setSnakeMessage(i);
            ap.setVisible(true);

        } else if (i > s && i <= (s + l)) {
            ap.setLadderMessage(i - s);
            ap.setVisible(true);

        } else if (i == s + l + 1) {
            frame.reinitialise();
            dispose();

        }

    }

    public int getPlayers() {
        return d;
    }

    public int getSnakes() {
        return s;
    }

    public int getLadders() {
        return l;
    }
}
