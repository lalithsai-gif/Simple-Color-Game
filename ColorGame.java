import java.awt.*;
import java.awt.event.*;

class Col extends Frame implements ActionListener{
    Button b2,b3,b4,b5,b6,b7,b8,b9;
    TextField b1;
    Col(){
        setSize(300,300);
        setBackground(Color.pink);
        GridBagLayout gbl=new GridBagLayout();
        setLayout(gbl);

        GridBagConstraints g=new GridBagConstraints();
        g.fill=GridBagConstraints.BOTH;
        b1=new TextField();
        g.gridx=0;
        g.gridy=0;
        add(b1,g);

        b2=new Button("Blue");
        g.gridx=1;
        g.gridy=0;
        b2.setBackground(Color.blue);
        b2.addActionListener(this);
        add(b2,g);

        b3=new Button("Green");
        g.gridx=2;
        g.gridy=0;
        b3.setBackground(Color.green);
        b3.addActionListener(this);
        add(b3,g);

        b4=new Button("Yellow");
        g.gridx=0;
        g.gridy=1;
        b4.setBackground(Color.yellow);
        b4.addActionListener(this);
        add(b4,g);

        b5=new Button("Red");
        g.gridx=1;
        g.gridy=1;
        b5.setBackground(Color.red);
        b5.addActionListener(this);
        add(b5,g);

        b6=new Button("Cyan");
        g.gridx=2;
        g.gridy=1;
        b6.setBackground(Color.cyan);
        b6.addActionListener(this);
        add(b6,g);

        b7=new Button("Orange");
        g.gridx=0;
        g.gridy=2;
        b7.setBackground(Color.orange);
        b7.addActionListener(this);
        add(b7,g);

        b8=new Button("Clear");
        g.gridx=1;
        g.gridy=2;
        b8.setBackground(Color.white);
        b8.addActionListener(this);
        add(b8,g);

        b9=new Button("Grey");
        g.gridx=2;
        g.gridy=2;
        b9.setBackground(Color.gray);
        b9.addActionListener(this);
        add(b9,g);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b2){
            b1.setText("Blue");
            b1.setBackground(Color.blue);
        }
        else if(e.getSource()==b3){
            b1.setText("Green");
            b1.setBackground(Color.green);
        }
        else if(e.getSource()==b4){
            b1.setText("Yellow");
            b1.setBackground(Color.yellow);
        }
        else if(e.getSource()==b5){
            b1.setText("Red");
            b1.setBackground(Color.red);
        }
        else if(e.getSource()==b6){
            b1.setText("Cyan");
            b1.setBackground(Color.cyan);
        }
        else if(e.getSource()==b7){
            b1.setText("Orange");
            b1.setBackground(Color.orange);
        }
        else if(e.getSource()==b8){
            b1.setText("");
            b1.setBackground(Color.white);
        }
        else if(e.getSource()==b9){
            b1.setText("Grey");
            b1.setBackground(Color.gray);
        }
    }
}

public class ColorGame{
    public static void main(String[] args){
        Col c=new Col();
    }
}
