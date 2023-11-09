import java.awt.*;
import javax.swing.*;

public class GameMove extends JPanel{
    public static final int MASU = 8;
    public static final int M_S = 60;
    public static final int WIDTH = M_S * MASU;
    public static final int HEIGHT= M_S * MASU;

    public static final int COL_MAX = 14;//1行に表示できる文字数
    
    public static final int LETTER_MAX = 40;//表示できる限界文字数

    private String name = "ゲームでよくある文字が一文字づつ表示されていくあれの実装";

    private String[] array = name.split("");//一文字ずつ分割して配列に入れる。splitは英語で分割って意味
    //配列には{"マ","イ","ケ","ル","・","ジ","ョ","ー"};こんな感じで格納される

    //表示する行数の分の変数
    private String str_col1 = "";
    private String str_col2 = "";
    private String str_col3 = "";

    private int i = 0;//配列の添字に使う変数

     public GameMove() {
        setSize(WIDTH, HEIGHT);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(34,139,34));
        g.fillRoundRect(50, 50, 200, 100, 10, 10);//ちょっと丸い四角
        g.setColor(Color.BLACK);

        if(i < COL_MAX) {
            str_col1 = str_col1+array[i];
        } else if(i < COL_MAX*2){
            str_col2 = str_col2+array[i];
        } else if(i < COL_MAX*3){
            str_col3 = str_col3+array[i];
        }
        g.drawString(str_col1, 70,70);
        g.drawString(str_col2, 70,90);
        g.drawString(str_col3, 70,110);
        i++;
        if(i < array.length && i < LETTER_MAX) {
            sleep();
        }
    }
    public void sleep() {
        repaint();
        try{
            Thread.sleep(100);//1000で1秒
        } catch(InterruptedException e) {}
    }
}