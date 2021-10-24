package calculator;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;


public class Calculator extends JFrame{
    
    JButton BOne= new JButton("1");
        JButton BTwo= new JButton("2");
        JButton BThree= new JButton("3");
        JButton BFour= new JButton("4");
        JButton BFive= new JButton("5");
        JButton BSix= new JButton("6");
        JButton BSeven= new JButton("7");
        JButton BEight= new JButton("8");
        JButton BNine= new JButton("9");
        JButton BDot= new JButton(".");
        JButton BEqual= new JButton("=");
        JButton BPlus= new JButton("+");
        JButton BMines= new JButton("-");
        JButton BDevide= new JButton("/");
        JButton BMulti= new JButton("×");
        JButton BZero= new JButton("0");
        
        JPanel screenContainer = new JPanel();
        JPanel row1 = new JPanel();
        JPanel row2 = new JPanel();
        JPanel row3 = new JPanel();
        JPanel row4 = new JPanel();
        JTextArea screen = new JTextArea("hi");
        
        
    public Calculator(){
        
        
        //Main Frame Setting
        setLayout(new FlowLayout());
        setSize(500, 600);
        setLocationRelativeTo(this);
        setTitle("Calculator");
        setResizable(false);
        setDefaultLookAndFeelDecorated(true);
        setIconImage((new ImageIcon("Images\\CalculatorIcon.png")).getImage());
        
        //Calculator Screen Layout And Its Settings
        
        setLayout(new GridLayout(5, 1));
        screenContainer.setSize(500, 100);
        screen.setPreferredSize(new Dimension(450,80));
        screen.setMaximumSize(new Dimension(450,80));
        screen.setLineWrap(true);
        screen.setFont(new Font("Serif", Font.BOLD, 19));
        screen.setColumns(2);
        screenContainer.add(screen);
        add(screenContainer);
        BZero.setPreferredSize(new Dimension(100,75));
        BZero.setFont(new Font("Serif", Font.BOLD, 22));
        BOne.setPreferredSize(new Dimension(100,75));
        BOne.setFont(new Font("Serif", Font.BOLD, 22));
        BTwo.setPreferredSize(new Dimension(100,75));
        BTwo.setFont(new Font("Serif", Font.BOLD, 22));
        BThree.setPreferredSize(new Dimension(100,75));
        BThree.setFont(new Font("Serif", Font.BOLD, 22));
        BFour.setPreferredSize(new Dimension(100,75));
        BFour.setFont(new Font("Serif", Font.BOLD, 22));
        BFive.setPreferredSize(new Dimension(100,75));
        BFive.setFont(new Font("Serif", Font.BOLD, 22));
        BSix.setPreferredSize(new Dimension(100,75));
        BSix.setFont(new Font("Serif", Font.BOLD, 22));
        BSeven.setPreferredSize(new Dimension(100,75));
        BSeven.setFont(new Font("Serif", Font.BOLD, 22));
        BEight.setPreferredSize(new Dimension(100,75));
        BEight.setFont(new Font("Serif", Font.BOLD, 22));
        BNine.setPreferredSize(new Dimension(100,75));
        BNine.setFont(new Font("Serif", Font.BOLD, 22));
        BDot.setPreferredSize(new Dimension(100,75));
        BDot.setFont(new Font("Serif", Font.BOLD, 22));
        BEqual.setPreferredSize(new Dimension(100,75));
        BEqual.setFont(new Font("Serif", Font.BOLD, 22));
        BPlus.setPreferredSize(new Dimension(100,75));
        BPlus.setFont(new Font("Serif", Font.BOLD, 22));
        BMines.setPreferredSize(new Dimension(100,75));
        BMines.setFont(new Font("Serif", Font.BOLD, 22));
        BMulti.setPreferredSize(new Dimension(100,75));
        BMulti.setFont(new Font("Serif", Font.BOLD, 22));
        BDevide.setPreferredSize(new Dimension(100,75));
        BDevide.setFont(new Font("Serif", Font.BOLD, 22));
        
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
        add(row1);
        add(row2);
        add(row3);
        add(row4);
        
        //Show And Close
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setFocusable(true);
   }
    
    public static void main(String[] args) {
        new Calculator();
    }

    
    
}
