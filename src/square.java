import javax.swing.*;
import java.awt.*;

public class square extends JTextField{
   // super();

    public void correct(){
        setBackground(Color.GREEN);
        setEditable(false);
    }

    public void notCorrect(){
        setBackground(Color.DARK_GRAY);
        setEditable(false);
    }



}
