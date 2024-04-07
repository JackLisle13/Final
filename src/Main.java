import javax.swing.*;
import java.awt.*;

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

        JLabel[] keysQ = new JLabel[10];
        keysQ[0] = new JLabel("Q");
        keysQ[1] = new JLabel("W");
        keysQ[2] = new JLabel("E");
        keysQ[3] = new JLabel("R");
        keysQ[4] = new JLabel("T");
        keysQ[5] = new JLabel("Y");
        keysQ[6] = new JLabel("U");
        keysQ[7] = new JLabel("I");
        keysQ[8] = new JLabel("O");
        keysQ[9] = new JLabel("P");


        JLabel[] keysA = new JLabel[9];
        keysQ[0] = new JLabel("A");
        keysQ[1] = new JLabel("S");
        keysQ[2] = new JLabel("D");
        keysQ[3] = new JLabel("F");
        keysQ[4] = new JLabel("G");
        keysQ[5] = new JLabel("H");
        keysQ[6] = new JLabel("J");
        keysQ[7] = new JLabel("K");
        keysQ[8] = new JLabel("L");

        JLabel[] keysZ = new JLabel[7];
        keysQ[0] = new JLabel("Z");
        keysQ[1] = new JLabel("X");
        keysQ[2] = new JLabel("C");
        keysQ[3] = new JLabel("V");
        keysQ[4] = new JLabel("B");
        keysQ[5] = new JLabel("N");
        keysQ[6] = new JLabel("M");


        //row 1
        panel.add(new JLabel());
        panel.add(new JLabel("             Termle"));
        panel.add(new JLabel());

        //row 2
        panel.add(new JLabel());
        panel.add(tiles);
        panel.add(new JLabel());

        //row 3
        panel.add(new JLabel());
        for(int i = 0; i < keysQ.length; i++){
            tiles.add(keysQ[i]);
        }
        for(int i = 0; i < keysA.length; i++){
            tiles.add(keysA[i]);
        }
        for(int i = 0; i < keysZ.length; i++){
            tiles.add(keysZ[i]);
        }
        panel.add(new JLabel());


    }
}