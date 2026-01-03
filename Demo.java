import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Demo implements ActionListener {

    JButton jb, jb1;

    public Demo() {
        JFrame jf = new JFrame("Multiple Components");

        jf.setSize(500, 500);
        jf.setLayout(null);

        JLabel j1 = new JLabel("Hi I am First Label");
        j1.setBounds(150, 50, 200, 30);
        jf.add(j1);

        JTextField jtf=new JTextField("hie shravya here");
        jtf.setBounds(250,300,100,50);
        jf.add(jtf);

        jb = new JButton("Click");
        jb.setBounds(150, 100, 120, 40);
        jb.addActionListener(this);
        jf.add(jb);

        JLabel j2 = new JLabel("Hi I am Second Label");
        j2.setBounds(150, 160, 200, 30);
        jf.add(j2);

        jb1 = new JButton("Click Me");
        jb1.setBounds(150, 210, 120, 40);
        jb1.addActionListener(this);
        jf.add(jb1);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Demo();   // calling default constructor
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == jb) {
            System.out.println("First button clicked");
        } 
        else if (e.getSource() == jb1) {
            System.out.println("Second button clicked");
        }
    }
}
