import javax.swing.*;

public class GreatestNumber {
    public static void main(String[] args) {
        String st;
        int a , b ,c;
        st=JOptionPane.showInputDialog("Enter first number");
        a=Integer.parseInt(st);

        st=JOptionPane.showInputDialog("Enter second number");
        b=Integer.parseInt(st);

        st=JOptionPane.showInputDialog("Enter third number");
        c=Integer.parseInt(st);

        if(a>b && a>c)
            JOptionPane.showMessageDialog(null,"The greatest number is " + a);
        else if (b>a && b>c)
                JOptionPane.showMessageDialog(null, "The greatest number is" + b);
        else
            JOptionPane.showMessageDialog(null, "C is greatest");
    }
}
