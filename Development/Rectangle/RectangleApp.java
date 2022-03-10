import javax.swing.JOptionPane;
public class RectangleApp{
    public static void main(String[] args){
        //vars
        double width;
        double length;
        double area;
        //objects
        Rectangle rect;
        rect=new Rectangle();
        ////input
        width=Double.parseDouble(JOptionPane.showInputDialog(null,"Input width:"));
        length=Double.parseDouble(JOptionPane.showInputDialog(null,"Input length:"));
        area=rect.tangular(width, length);
        // //set
        // rect.setWidth(width);
        // rect.setLength(length);
        // //calc
        // rect.calcArea();
        // //get
        // area=rect.getArea();
        //output
        JOptionPane.showMessageDialog(null,"Rectangle Area:"+area);
    }
}