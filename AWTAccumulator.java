import java.awt.*;
import java.awt.event.*;

public class AWTAccumulator extends Frame{
    private TextField tfinput;
    private TextField tfoutput;
    private int sum=0;

    public AWTAccumulator(){
        setLayout(new GridLayout(2,2));

        add(new Label("Enter integer"));

        tfinput=new TextField(10);
        add(tfinput);

        tfinput.addActionListener(new TFInputLister());

        add(new Label("The accumulated result is:"));

        tfoutput=new TextField(10);
        tfoutput.setEditable(false);
        add(tfoutput);

        setTitle("AWTAccumulator");
        setSize(350,120);
        setVisible(true);
    }
    public static void main(String[]args){
        new AWTAccumulator();
    }
    private class TFInputLister implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evt){

            int numberIN=Integer.parseInt(tfinput.getText());
            sum+=numberIN;
            tfinput.setText("");
            tfoutput.setText(sum + "");
        }
    }
}