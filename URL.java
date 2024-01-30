
import java.awt.Desktop;
import java.net.URI;
public class URL
{
   public static void main () throws Exception 
   {
       Desktop d= Desktop.getDesktop();
       d.browse(new URI(""));
   }
}
