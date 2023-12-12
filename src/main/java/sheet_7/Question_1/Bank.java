
package sheet_7.Question_1;
import java.awt.*;
import javax.swing.*;

public class Bank {
    Bank(){
        //create the main frame (main window)
        JFrame mainFrame = new JFrame("Diffrent Layouts");
        mainFrame.setSize(500, 500);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(mainFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
    
        //declaration of layouts
        
        //main layout links to the main panel
        JPanel mainPanel = new JPanel();
        BoxLayout mainLayout = new BoxLayout(mainPanel,BoxLayout.Y_AXIS);
        mainPanel.setLayout(mainLayout);
        //adds the panel to the main frame
        mainFrame.add(mainPanel);
        
        FlowLayout layout2;
        GridLayout layout3;
        //FlowLayout layout4;
        
        //declaration of panels
        JPanel p1,p2;
        /*,p3*/ //one for each layout
        
        //declaration of components
        JLabel label1 = new JLabel("WELCOME TO MY BANK");
        
        JLabel label2 = new JLabel("Enter your Pin");
        JTextField text= new JTextField(10);
        JButton okB = new JButton (" OK ");
        
        JButton digits[] = new JButton[10];
        digits[0]=new JButton(" 0 ");
        for(int i=1;i<=9 ; i++)
            digits[i]=new JButton(" "+i+" ");
        
        JButton backB = new JButton("Backspace");
        
        //adds the components to panels & Layouts
        layout2=new FlowLayout();
        p1 = new JPanel(layout2);
        p1.add(label2);
        p1.add(text);
        p1.add(okB);
        
        layout3 = new GridLayout(4, 3, 10, 10);
        p2=new JPanel(layout3);
        for(int i=1;i<=9;i++)
            p2.add(digits[i]);
        p2.add(digits[0]);
        p2.add(backB);
        
        //add all panels to the main panel
        mainPanel.add(label1);
        mainPanel.add(p1);
        mainPanel.add(p2);
    }
    
}
