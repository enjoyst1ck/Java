import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener{
    private static final long serialVersionUID = 1L;
    private JTextField result;
    private JButton zero, one, two, three, four, five, six, seven, eight, nine, plus, minus, multiply, divide, clear, equals, changeSign;
    public Calculator()
    {
        setSize(310,420);
        setTitle("Kalkulator");
        setLayout(null);

        seven = new JButton("7");
        seven.setBounds(10,100,60,60);
        add(seven);
        seven.addActionListener(this);

        eight = new JButton("8");
        eight.setBounds(80,100,60,60);
        add(eight);
        eight.addActionListener(this);

        nine = new JButton("9");
        nine.setBounds(150,100,60,60);
        add(nine);
        nine.addActionListener(this);

        plus = new JButton("+");
        plus.setBounds(220,100,60,60);
        add(plus);
        plus.addActionListener(this);

        four = new JButton("4");
        four.setBounds(10,170,60,60);
        add(four);
        four.addActionListener(this);

        five = new JButton("5");
        five.setBounds(80,170,60,60);
        add(five);
        five.addActionListener(this);

        six = new JButton("6");
        six.setBounds(150,170,60,60);
        add(six);
        six.addActionListener(this);

        minus = new JButton("-");
        minus.setBounds(220,170,60,60);
        add(minus);
        minus.addActionListener(this);

        one = new JButton("1");
        one.setBounds(10,240,60,60);
        add(one);
        one.addActionListener(this);

        two = new JButton("2");
        two.setBounds(80,240,60,60);
        add(two);
        two.addActionListener(this);

        three = new JButton("3");
        three.setBounds(150,240,60,60);
        add(three);
        three.addActionListener(this);

        multiply = new JButton("x");
        multiply.setBounds(220,240,60,60);
        add(multiply);
        multiply.addActionListener(this);

        zero = new JButton("0");
        zero.setBounds(10,310,60,60);
        add(zero);
        zero.addActionListener(this);

        divide = new JButton("/");
        divide.setBounds(80,310,60,60);
        add(divide);
        divide.addActionListener(this);

        clear = new JButton("C");
        clear.setBounds(150,310,60,25);
        add(clear);
        clear.addActionListener(this);

        changeSign = new JButton("+/-");
        changeSign.setBounds(150,345,60,25);
        add(changeSign);
        changeSign.addActionListener(this);

        equals = new JButton("=");
        equals.setBounds(220,310,60,60);
        add(equals);
        equals.addActionListener(this);


        Font font = new Font("Arial", Font.PLAIN, 34);
        result = new JTextField("");
        result.setBounds(10,10,270,80);
        result.setHorizontalAlignment(JTextField.RIGHT);
        result.setFont(font);
        add(result);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

    }
    public static void main(String[] args) {
        Calculator app = new Calculator();
    }
}

