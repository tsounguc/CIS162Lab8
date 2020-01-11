import javax.swing.JOptionPane;
/**
 * Write a description of class Loops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Loops
{
    String numStr;
    int integer;
    int sum = 0;
    double average = 0;
    int counter = 0;
    int i;
    int numMultiples;
    public void average()
    {
        numStr = JOptionPane.showInputDialog("Enter an integer: ");
        integer = Integer.parseInt(numStr);
        while(integer >= 0)
        {
            sum += integer;
            counter += 1;
            numStr = JOptionPane.showInputDialog("Enter an integer: ");
            integer = Integer.parseInt(numStr);
        }
        average = sum/(counter* 1.0);
        JOptionPane.showMessageDialog(null, "Average " + average);
    }
    public void infinite()
    {
        int a = 1; 
        while(a > 0)
        {
            System.out.println("infinte loop");
        }
    }
    public void sum(int low, int high)
    {
        for(i = low; i<= high; i++)
        {
            sum += i;
        }            
        JOptionPane.showMessageDialog(null, "Sum: " + sum);
        sum = 0;
    }
    public void countdown(int high, int low)
    {
        for( i= high; i >= low; i--)
        {
            System.out.println(i);
        }
    }
    public int countMuitlbes (int low, int high, int digit)
    {
        int j;
        numMultiples = 0;
        for (j = low;j <= high; j++)
            if(j % digit == 0)
            {
                numMultiples += 1;
            }
        return numMultiples;
    }
}