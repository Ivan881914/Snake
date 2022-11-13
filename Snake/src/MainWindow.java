import javax.swing.*;
import java.awt.*;


public class MainWindow extends JFrame {

    public MainWindow(){
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1280,1280);
        setLocation(0,0);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();

//        JButton button = new JButton("Обычная кнопка");
//        mw.add(button);


    }
}
