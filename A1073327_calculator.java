import javax.swing.*;
import java.awt.*;

class testcalculator extends JFrame{
    private JPanel contentPane;
    private JTextField Result;
    private JLabel Title1;
    private JLabel Title2;

    testcalculator(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(700,300,400,500);
        setTitle("Calculator");
        
        contentPane = new JPanel();
        contentPane.setLayout(new GridLayout(6,3,5,5));
        setContentPane(contentPane);
       
        Title1 = new JLabel("Hello");
        contentPane.add(Title1);

        Title2 = new JLabel("Calculator");
        contentPane.add(Title2);

        Result = new JTextField(40);
        Result.setEditable(false);
        Result.setText("0");
        contentPane.add(Result);

        JButton no7 = new JButton("7");
        contentPane.add(no7);

        JButton no8 = new JButton("8");
        contentPane.add(no8);

        JButton no9 = new JButton("9");
        contentPane.add(no9);

        JButton no4 = new JButton("4");
        contentPane.add(no4);

        JButton no5 = new JButton("5");
        contentPane.add(no5);
        
        JButton no6 = new JButton("6");
        contentPane.add(no6);

        JButton no1 = new JButton("1");
        contentPane.add(no1);
        
        JButton no2 = new JButton("2");
        contentPane.add(no2);
        
        JButton no3 = new JButton("3");
        contentPane.add(no3);

        JButton Plus = new JButton("+");
        contentPane.add(Plus);

        JButton no0 = new JButton("0");
        contentPane.add(no0);

        JButton Minus = new JButton("-");
        contentPane.add(Minus);

        JButton Multiply = new JButton("x");
        contentPane.add(Multiply);

        JButton Equal = new JButton("=");
        contentPane.add(Equal);

        JButton Divide = new JButton("/");
        contentPane.add(Divide);

        setVisible(true);

    }
     
}

public class A1073327_calculator{

    public static void main (String[] args) throws Exception{
        testcalculator cal = new testcalculator();
    }

}