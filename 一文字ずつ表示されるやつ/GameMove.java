import java.awt.*;
import javax.swing.*;

public class GameMove extends JPanel{
    public static final int MASU = 8;
    public static final int M_S = 60;
    public static final int WIDTH = M_S * MASU;
    public static final int HEIGHT= M_S * MASU;

    public static final int COL_MAX = 14;//1�s�ɕ\���ł��镶����
    
    public static final int LETTER_MAX = 40;//�\���ł�����E������

    private String name = "�Q�[���ł悭���镶�����ꕶ���Â\������Ă�������̎���";

    private String[] array = name.split("");//�ꕶ�����������Ĕz��ɓ����Bsplit�͉p��ŕ������ĈӖ�
    //�z��ɂ�{"�}","�C","�P","��","�E","�W","��","�["};����Ȋ����Ŋi�[�����

    //�\������s���̕��̕ϐ�
    private String str_col1 = "";
    private String str_col2 = "";
    private String str_col3 = "";

    private int i = 0;//�z��̓Y���Ɏg���ϐ�

     public GameMove() {
        setSize(WIDTH, HEIGHT);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(34,139,34));
        g.fillRoundRect(50, 50, 200, 100, 10, 10);//������Ɗۂ��l�p
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
            Thread.sleep(100);//1000��1�b
        } catch(InterruptedException e) {}
    }
}