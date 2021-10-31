package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.Expression;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorListener;

public class Calculator extends JFrame {

    JButton BOne = new JButton("1");
    JButton BTwo = new JButton("2");
    JButton BThree = new JButton("3");
    JButton BFour = new JButton("4");
    JButton BFive = new JButton("5");
    JButton BSix = new JButton("6");
    JButton BSeven = new JButton("7");
    JButton BEight = new JButton("8");
    JButton BNine = new JButton("9");
    JButton BDot = new JButton(".");
    JButton BEqual = new JButton("=");
    JButton BPlus = new JButton("+");
    JButton BMines = new JButton("-");
    JButton BDevide = new JButton("/");
    JButton BMulti = new JButton("×");
    JButton BZero = new JButton("0");
    JButton BClear = new JButton("Clear");

    JPanel screenContainer = new JPanel();
    JPanel row1 = new JPanel();
    JPanel row2 = new JPanel();
    JPanel row3 = new JPanel();
    JPanel row4 = new JPanel();
    JPanel row5 = new JPanel();
    JTextArea screen = new JTextArea();
    

    boolean result = false;
    boolean putDot = true;
    boolean putOperator = false;

    public Calculator() {
        GridLayout g = new GridLayout(1,4);
        GridLayout main = new GridLayout(6,1);
        main.setVgap(3);
        g.setHgap(3);
        row1.setLayout(g);
        row2.setLayout(g);
        row3.setLayout(g);
        row4.setLayout(g);
        row1.setBorder(new EmptyBorder(3,3,3,3));
        row2.setBorder(new EmptyBorder(3,3,3,3));
        row3.setBorder(new EmptyBorder(3,3,3,3));
        row4.setBorder(new EmptyBorder(3,3,3,3));
        row5.setBorder(new EmptyBorder(3,3,3,3));
        //Main Frame Setting
        setLayout(main);
        setSize(500, 600);
        setLocationRelativeTo(this);
        setTitle("Calculator");
        setResizable(false);
        setDefaultLookAndFeelDecorated(true);
        setIconImage((new ImageIcon("Images\\CalculatorIcon.png")).getImage());
        screen.setEditable(false);
        screen.setBackground(Color.WHITE);
        //Calculator Screen Layout And Its Settings

        setLayout(new GridLayout(6, 1));
        screenContainer.setSize(500, 100);
        screen.setFont(new Font("Serif", Font.BOLD, 30));
        screenContainer.add(screen);
        add(screenContainer);
        BZero.setFont(new Font("Serif", Font.BOLD, 22));
        BOne.setFont(new Font("Serif", Font.BOLD, 22));
        BTwo.setFont(new Font("Serif", Font.BOLD, 22));
        BThree.setFont(new Font("Serif", Font.BOLD, 22));
        BFour.setFont(new Font("Serif", Font.BOLD, 22));
        BFive.setFont(new Font("Serif", Font.BOLD, 22));
        BSix.setFont(new Font("Serif", Font.BOLD, 22));
        BSeven.setFont(new Font("Serif", Font.BOLD, 22));
        BEight.setFont(new Font("Serif", Font.BOLD, 22));
        BNine.setFont(new Font("Serif", Font.BOLD, 22));
        BDot.setFont(new Font("Serif", Font.BOLD, 22));
        BEqual.setFont(new Font("Serif", Font.BOLD, 22));
        BPlus.setFont(new Font("Serif", Font.BOLD, 22));
        BMines.setFont(new Font("Serif", Font.BOLD, 22));
        BMulti.setFont(new Font("Serif", Font.BOLD, 22));
        BDevide.setFont(new Font("Serif", Font.BOLD, 22));
        BClear.setFont(new Font("Serif", Font.BOLD, 22));
        BClear.setPreferredSize(new Dimension(475, 80));
        screen.setPreferredSize(new Dimension(475, 80));
        screen.setLineWrap(true);
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");

        //Button's Events
        BZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(result){
                    screen.setText("0");
                    putOperator = true;
                    result = false;
                }else{
                    screen.setText(screen.getText() + "0");
                    putOperator = true;
                }
            }
        });
        BOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(result){
                    screen.setText("1");
                    putOperator = true;
                    result = false;
                }else{
                    screen.setText(screen.getText() + "1");
                    putOperator = true;
                }
            }
        });
        BTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(result){
                    screen.setText("2");
                    putOperator = true;
                    result = false;
                }else{
                    screen.setText(screen.getText() + "2");
                    putOperator = true;
                }
            }
        });
        BThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(result){
                    screen.setText("3");
                    putOperator = true;
                    result = false;
                }else{
                    screen.setText(screen.getText() + "3");
                    putOperator = true;
                }
            }
        });
        BFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(result){
                    screen.setText("4");
                    putOperator = true;
                    result = false;
                }else{
                    screen.setText(screen.getText() + "4");
                    putOperator = true;
                }
            }
        });
        BFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(result){
                    screen.setText("5");
                    putOperator = true;
                    result = false;
                }else{
                    screen.setText(screen.getText() + "5");
                    putOperator = true;
                }
            }
        });
        BSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(result){
                    screen.setText("6");
                    putOperator = true;
                    result = false;
                }else{
                    screen.setText(screen.getText() + "6");
                    putOperator = true;
                }
            }
        });
        BSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(result){
                    screen.setText("7");
                    putOperator = true;
                    result = false;
                }else{
                    screen.setText(screen.getText() + "7");
                    putOperator = true;
                }
            }
        });
        BEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(result){
                    screen.setText("8");
                    putOperator = true;
                    result = false;
                }else{
                    screen.setText(screen.getText() + "8");
                    putOperator = true;
                }
            }
        });
        BNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(result){
                    screen.setText("9");
                    putOperator = true;
                    result = false;
                }else{
                    screen.setText(screen.getText() + "9");
                    putOperator = true;
                }
            }
        });
        BPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = screen.getText();
                if (!text.isEmpty()) {
                    if (evaluateExp.precedence(text.charAt(text.length() - 1)) != -1) {
                        screen.setText(text.substring(0, text.length() - 1) + "+");
                    } else if (putOperator && !result) {
                        screen.setText(text + "+");
                    }
                }
            }
        });
        BMines.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = screen.getText();
                if (!text.isEmpty()) {
                    if (evaluateExp.precedence(text.charAt(text.length() - 1)) != -1) {
                        screen.setText(text.substring(0, text.length() - 1) + "-");
                    } else if (putOperator && !result) {
                        screen.setText(text + "-");
                    }
                }
            }
        });
        BMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = screen.getText();
                if (!text.isEmpty()) {
                    if (evaluateExp.precedence(text.charAt(text.length() - 1)) != -1) {
                        screen.setText(text.substring(0, text.length() - 1) + "*");
                    } else if (putOperator && !result) {
                        screen.setText(text + "*");
                    }
                }
            }
        });
        BDevide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = screen.getText();
                if (!text.isEmpty()) {
                    if (evaluateExp.precedence(text.charAt(text.length() - 1)) != -1) {
                        screen.setText(text.substring(0, text.length() - 1) + "/");
                    } else if (putOperator && !result) {
                        screen.setText(text + "/");
                    }
                }
            }
        });
        BDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = screen.getText();
                if (!s.isEmpty() && putOperator && !result) {
                    screen.setText(screen.getText() + ".");
                    putOperator = false;
                }
            }
        });
        BEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                String infix = screen.getText().toString();
//                String result = evaluateExp(infix);
                // if not empty
                String text = screen.getText();
                try{
                    screen.setText(Integer.parseInt(text)+"");
                    result = true;
                }catch(NumberFormatException err){
                    if (!text.isEmpty() && evaluateExp.precedence(text.charAt(text.length() - 1)) == -1 && !text.equals("Syntax Error")) {
                    screen.setText(evaluateExp.evaluateExp(text));
                    result = true;
                }
                }
            }
        });
        BClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                screen.setText("");
            }
        });

        //setLayout(new GridLayout(0, 1));
        //Calculator Buttons
        row1.add(BSeven);
        row1.add(BEight);
        row1.add(BNine);
        row1.add(BDevide);
        row2.add(BFour);
        row2.add(BFive);
        row2.add(BSix);
        row2.add(BMulti);
        row3.add(BOne);
        row3.add(BTwo);
        row3.add(BThree);
        row3.add(BMines);
        row4.add(BZero);
        row4.add(BDot);
        row4.add(BEqual);
        row4.add(BPlus);
        row5.add(BClear);
        add(row1);
        add(row2);
        add(row3);
        add(row4);
        add(row5);

        //Show And Close
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setFocusable(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    private String postToprefix(String exp) {
        //dlemetter
        return "";
    }

}
