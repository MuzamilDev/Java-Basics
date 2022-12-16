import javax.swing.*;

class first {
    float x, y;
    String st;

    void getData() {
        st = JOptionPane.showInputDialog("Enter First Number ");
        x = Integer.parseInt(st);

        st = JOptionPane.showInputDialog("Enter Second Number ");
        y = Integer.parseInt(st);
    }

    void sum() {
        JOptionPane.showMessageDialog(null, "The Sum is " + (x + y));
    }

    void Subtract() {
        JOptionPane.showMessageDialog(null, "The Minus is " + (x - y));
    }
}
    class second extends first{
        void product()
        {
            JOptionPane.showMessageDialog(null,"The Multiplication is " + (x*y));
        }
        void division()
        {
            JOptionPane.showMessageDialog(null,"The Division is " + (x/y));
        }
    }

public class calculator {
    public static void main(String[] args) {
        second obj = new second();
        obj.getData();
        obj.sum();
        obj.Subtract();
        obj.product();
        obj.division();
        System.exit(0);

    }
}
