import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(400,600);
        //frame.setResizable(false);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(new GridLayout(3,3));

        JPanel tiles = new JPanel();
        tiles.setLayout(new GridLayout(0,5));
        JTextField[][] boxes = new JTextField[6][5];
        for(int i = 0; i < boxes.length; i++){
            for(int j = 0; j < boxes[i].length; j++){
                boxes[i][j] = new JTextField();
                tiles.add(boxes[i][j]);
            }
        }

        //row 1
        panel.add(new JLabel());
        panel.add(new JLabel("            Termle"));
        panel.add(new JLabel());

        //row 2
        panel.add(new JLabel());
        panel.add(tiles);
        panel.add(new JLabel());

        //row 3
        panel.add(new JLabel());
        JLabel usedLetters = new JLabel("Used letters: ");
        panel.add(usedLetters);
        panel.add(new JLabel());


        boxes[0][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(boxes[0][0].getText().length()== 1){
                    System.out.println(boxes[0][0].getText());
                    boxes[0][0].set
                }
            }
        });




    }
}