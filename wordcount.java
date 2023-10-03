import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class wordcount extends JFrame implements ActionListener  {

JLabel lb1,lb2;
JTextArea ta;
JButton b;
JButton pad,text;
wordcount()
{
    super("Char Word Count Tool - JTP");
    lb1=new JLabel("characters: ");
    lb1.setBounds(50,50,100,20);
    lb2=new JLabel("Words: ");
    lb2.setBounds(50,80,100,20);
    ta=new JTextArea();
    JScrollPane sp=new JScrollPane(ta);
    sp.setBounds(50,110,300,200);

    b=new JButton("count");
    b.setBounds(50,320,80,30);
    b.addActionListener(this);

    pad=new JButton("pad colour");
    pad.setBounds(140,320,110,30);
    pad.addActionListener(this);


    text=new JButton("text colour");
    text.setBounds(260,320,110,30);
    text.addActionListener(this);

    add(lb1);add(lb2);add(sp);add(b);add(pad);add(text);




    setSize(400,400);
    setLayout(null);
    setVisible(true);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);

}
public void actionPerformed(ActionEvent e)
{
    if(e.getSource()==b)
    {
        String text=ta.getText();
        lb1.setText("characters: "+text.length());
        String words[]=text.split("\\s");
        lb2.setText("words: "+words.length);
    }
    else if(e.getSource()==pad)
    {
        Color c=JColorChooser.showDialog(this,"Choose Color",Color.BLACK);
        ta.setBackground(c);
    }
    else if(e.getSource()==text)
    {
        Color c=JColorChooser.showDialog(this,"choose color",Color.BLACK);
        ta.setForeground(c);
    }
}
public static void main(String args[])
{
    new wordcount();
}
    
}
