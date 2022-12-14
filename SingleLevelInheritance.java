import javax.swing.*;

class college{
    int marks;
    float gpa;
    String name;
    String st;
    String mood;

    void setName()
    {
        name=JOptionPane.showInputDialog("Enter Name");

    }
    void setMarks()
    {
        st=JOptionPane.showInputDialog("Enter number in college");
        marks=Integer.parseInt(st);

    }
}
class university extends college{

    void  GPA()
    {
        st=JOptionPane.showInputDialog(" Enter University GPA ");
        gpa=Float.parseFloat(st);
    }
    void character()
    {
        mood=JOptionPane.showInputDialog("How is His character ");

    }
    void display()
    {
        JOptionPane.showMessageDialog(null,"Name of student is " + name + " number in college is " + marks + " University GPA is " + gpa + " and character is " + mood + "\n");
    }

}

public class Students {
    public static void main(String[] args) {
        university obj =new university();
        obj.setName();
        obj.setMarks();
        obj.GPA();
        obj.character();
        obj.display();
        System.exit(0);

    }
}
