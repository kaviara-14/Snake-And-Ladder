package GameApplication;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GridPanel extends JPanel{

    public JPanel[] grid; // names the grid of buttons

    public GridPanel(int dimension) { // constructor with 2 parameters
        setLayout(new GridLayout(dimension, dimension ,5 , 5)); // set layout of
        // frame
        int total = dimension * dimension;
        grid = new JPanel[total + 1]; // allocate the size of grid

        int number, direction;
        if (dimension % 2 == 0) {
            number = total;
            direction = -1;
        } else {
            number = total + 1 - dimension;
            direction = 1;
        }

        for (int y = 0; y < dimension; y++) {
            for (int x = 0; x < dimension; x++) {
                grid[number] = new JPanel();
                grid[number].setLayout(new GridBagLayout());// For centering the
                // label
                if ((x + y) % 2 == 0)
                    grid[number].setBackground(Color.WHITE);
                else
                    grid[number].setBackground(Color.WHITE);

                grid[number].add(new JLabel("" + (number)));
                add(grid[number]); // adds button to grid
                number = number +direction;
            }
            if(dimension%2 ==0 )
            {
                if( direction == -1)
                    number =number +1 -dimension;
                else
                    number = number -1 -dimension;
            }
            else
            {
                if(direction==1)
                    number =number -1 -dimension;
                else
                    number=number +1 -dimension;
            }
            direction*=-1;

        }

        setVisible(true);
    }
}