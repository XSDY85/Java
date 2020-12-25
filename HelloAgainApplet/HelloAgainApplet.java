import java.awt.*;


public class HelloAgainApplet extends java.applet.Applet {
	
	
	Font f= new Font ("TimesRoman", Font.BOLD, 40);
	public void paint(Graphics g) {
		

	g.setFont(f);
	g.setColor(Color.red);
	g.drawString("Hello", 5, 50);
	
	}

}
