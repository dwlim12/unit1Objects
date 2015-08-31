import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Exercise17
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL(
            "https://s-media-cache-ak0.pinimg.com/originals/b2/8a/3a/b28a3a52ee99399a5389e758f7de87b6.gif");
        JOptionPane.showMessageDialog(null, "Mind Blown", "Title",
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}