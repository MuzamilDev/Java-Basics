import javax.swing.*;

public class Table {
    public static void main(String[] args) {
        String st;
        int n , i;

        st= JOptionPane.showInputDialog("Enter a number ");
        n=Integer.parseInt(st);
         for(i=1; i<=12; i++)
             st+="\n" + i + "*" + n + "=" + i*n;
         JOptionPane.showMessageDialog(null,"The Table of "+ st);
         System.exit(0);
    }
}
