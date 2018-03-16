import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Ваня специально для тебя делаю класс расширяемый от JFrame
 * !!Если ты до сих пор используешь NetBeans то я тебе сочувствую
 */
public class MyJFrame extends JFrame{

    /**
     * Ваня внутри конструктора можно просто использовать методы класса JFrame
     * !!Если ты до сих пор используешь NetBeans то я тебе сочувствую
     */
    public MyJFrame(){

        setTitle("Это первоначальны заголовок");
        //Размеры
        setSize(new Dimension(400,400));

        // устанавливаем стиль размещения компнентов тект и т.д.
        setLayout(new FlowLayout());

        JLabel jLabel_1 = new JLabel("1 Текст внутри окна");
        //Добавление на форму 1 вариант
        this.add(jLabel_1);


        JLabel jLabel_2 = new JLabel("2 Текст внутри окна");
        //Добавление на форму 2 вариант
        add(jLabel_2);

        // Устанавливаем что делать по нажатию на кнопку выход
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JButton button = new JButton("Изменить заголовок");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyJFrame.this.setTitle("Новый заголовок");
            }
        } );
        add(button);

        // Отрисовка окна
        setVisible(true);

    }

    public static void main(String[] args) {
        JFrame myJFrame = new MyJFrame();

    }




}
