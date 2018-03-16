import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Ваня специально для тебя делаю класс расширяемый от JFrame
 * !!Если ты до сих пор используешь NetBeans то я тебе сочувствую
 */
public class MyJFrame{
    public static JFrame mainFrame;
    /**
     * Ваня внутри конструктора можно просто использовать методы класса JFrame
     * !!Если ты до сих пор используешь NetBeans то я тебе сочувствую
     */
    public MyJFrame(){
        mainFrame = new JFrame();
        mainFrame.setTitle("Это первоначальны заголовок");
        //Размеры
        mainFrame.setSize(new Dimension(400,400));

        // устанавливаем стиль размещения компнентов тект и т.д.
        mainFrame.setLayout(new FlowLayout());

        JLabel jLabel_1 = new JLabel("1 Текст внутри окна");
        //Добавление на форму 1 вариант
        mainFrame.add(jLabel_1);


        JLabel jLabel_2 = new JLabel("2 Текст внутри окна");
        //Добавление на форму 2 вариант
        mainFrame.add(jLabel_2);

        // Устанавливаем что делать по нажатию на кнопку выход
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JButton button = new JButton("Изменить заголовок");
        button.addActionListener(new ButtonActionListener());
        mainFrame.add(button);

        // Отрисовка окна
        mainFrame.setVisible(true);

    }



    public static void main(String[] args) {
        MyJFrame myJFrame = new MyJFrame();

    }

    // Inner class implementation
    public static class ButtonActionListener implements ActionListener
    {

        public void actionPerformed(ActionEvent ae)
        {
            mainFrame.setTitle("я статический");
        }
    }



}
