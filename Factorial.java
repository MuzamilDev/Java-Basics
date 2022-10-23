import javax.swing.*;
import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        String st;
        int n , i, f=1;
        st= JOptionPane.showInputDialog("Enter a number");
        n=Integer.parseInt(st);
        for(i=1; i<=n; i++)
            f=f*i;
        JOptionPane.showMessageDialog(null, "The factorial is " + f);
        System.exit(0);

    }
    }
