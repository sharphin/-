import javax.swing.*;
public class Communicate extends JFrame {
    private final int MASU = 8;
    private final int M_S = 60;
    private final int WIDTH = M_S * MASU;
    private final int HEIGHT = WIDTH;

    public static void main(String[] args) {
        Communicate frame = new Communicate("Othello");
    }
    public Communicate(String title) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300,300,WIDTH+17, HEIGHT+40);
        setTitle("Othello");
        setVisible(true);
        GameMove gm = new GameMove();
        add(gm);
    }
}