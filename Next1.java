import javax.swing.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Next1{
    public void instagram () {
        try {
            URI insta = new URI("https://instagram.com/drawdivision?igshid=YmMyMTA2M2Y=");
            java.awt.Desktop.getDesktop().browse(insta);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void artstation(){
        try {
            URI insta = new URI("https://instagram.com/drawdivision?igshid=YmMyMTA2M2Y=");
            java.awt.Desktop.getDesktop().browse(insta);
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public void Youtube() {
        try {
            URI insta = new URI("https://instagram.com/drawdivision?igshid=YmMyMTA2M2Y=");
            java.awt.Desktop.getDesktop().browse(insta);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        public void linkedin() {
            try {
                URI insta = new URI("https://instagram.com/drawdivision?igshid=YmMyMTA2M2Y=");
                java.awt.Desktop.getDesktop().browse(insta);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

}
