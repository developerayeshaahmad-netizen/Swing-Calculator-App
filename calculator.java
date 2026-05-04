
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {

            tf.setText(tf.getText() + "1");

        } else if (e.getSource() == b2) {

            tf.setText(tf.getText() + "2");

        }

        else if (e.getSource() == b3) {

            tf.setText(tf.getText() + "3");

        } else if (e.getSource() == b4) {

            tf.setText(tf.getText() + "4");

        } else if (e.getSource() == b5) {

            tf.setText(tf.getText() + "5");

        } else if (e.getSource() == b6) {

            tf.setText(tf.getText() + "6");

        } else if (e.getSource() == b7) {

            tf.setText(tf.getText() + "7");

        } else if (e.getSource() == b8) {

            tf.setText(tf.getText() + "8");

        } else if (e.getSource() == b9) {

            tf.setText(tf.getText() + "9");

        } else if (e.getSource() == b0) {

            tf.setText(tf.getText() + "0");

        }

        else if (e.getSource() == bp) {

            num1 = Double.parseDouble(tf.getText());
            Operator = "+";
            tf.setText("");
        } else if (e.getSource() == bm) {

            num1 = Double.parseDouble(tf.getText());
            Operator = "*";
            tf.setText("");
        } else if (e.getSource() == bmi) {

            num1 = Double.parseDouble(tf.getText());
            Operator = "-";
            tf.setText("");
        } else if (e.getSource() == bd) {

            num1 = Double.parseDouble(tf.getText());
            Operator = "/";
            tf.setText("");
        }

        else if (e.getSource() == be) {

            num2 = Double.parseDouble(tf.getText());

            if (Operator.equals("+")) {

                result = num1 + num2;

            } else if (Operator.equals("-")) {

                result = num1 - num2;

            } else if (Operator.equals("*")) {

                result = num1 * num2;

            } else if (Operator.equals("/")) {

                if (num2 == 0) {
                    tf.setText("Error");
                    return;
                }

                result = num1 / num2;

            }

            tf.setText(String.valueOf(result));

        } else if (e.getSource() == bc) {

            tf.setText("");
            num1 = 0;
            num2 = 0;
            Operator = "";
        }

    }

    JFrame frame = new JFrame("My Calculator");
    Container c = frame.getContentPane();
    JTextField tf = new JTextField(20);
    JPanel tpanel = new JPanel();
    JPanel lpanel = new JPanel();
    JLabel label = new JLabel();
    JPanel buttonPanel = new JPanel();
    JButton b1 = new JButton("1");
    JButton b3 = new JButton("3");
    JButton b2 = new JButton("2");
    JButton bp = new JButton("+");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton bmi = new JButton("-");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton bm = new JButton("*");
    JButton bc = new JButton("C");
    JButton b0 = new JButton("0");
    JButton be = new JButton("=");
    JButton bd = new JButton("/");

    String firstNumber;
    double num1;
    String secondNumber;
    double num2;
    double result;

    String Operator;

    calculator() {

        frame.setSize(600, 600);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());

        tpanel.setLayout(new FlowLayout());
        tpanel.add(tf);
        tf.setFont(new Font("Ariel Black", Font.BOLD, 32));
        tf.setHorizontalAlignment(JTextField.RIGHT);

        label.setText("A basic calculator");
        lpanel.setLayout(new BorderLayout());
        lpanel.add(label, BorderLayout.SOUTH);
        label.setFont(new Font("Ariel Black", Font.BOLD, 15));

        buttonPanel.setLayout(new GridLayout(4, 4));
        buttonPanel.add(b1);
        b1.addActionListener(this);
        buttonPanel.add(b2);
        b2.addActionListener(this);
        buttonPanel.add(b3);
        b3.addActionListener(this);
        buttonPanel.add(bp);
        bp.addActionListener(this);

        buttonPanel.add(b4);
        b4.addActionListener(this);
        buttonPanel.add(b5);
        b5.addActionListener(this);
        buttonPanel.add(b6);
        b6.addActionListener(this);
        buttonPanel.add(b7);
        b7.addActionListener(this);

        buttonPanel.add(b8);
        b8.addActionListener(this);
        buttonPanel.add(b9);
        b9.addActionListener(this);
        buttonPanel.add(b0);
        b0.addActionListener(this);
        buttonPanel.add(bmi);
        bmi.addActionListener(this);

        buttonPanel.add(bm);
        bm.addActionListener(this);
        buttonPanel.add(bc);
        bc.addActionListener(this);
        buttonPanel.add(bd);
        bd.addActionListener(this);
        buttonPanel.add(be);
        be.addActionListener(this);

        c.add(tpanel, BorderLayout.NORTH);
        c.add(lpanel, BorderLayout.SOUTH);
        c.add(buttonPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new calculator();

    }

}