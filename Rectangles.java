import java.awt.*;
import java.applet.*;
/* <applet code="Rectangles" width=300 height=400>
</applet>
*/
public class Rectangles extends Applet
{
public void paint(Graphics g)
{
g.drawRect(10,10,60,50);
g.fillRect(100,10,60,50);
g.drawLine(10,150,280,150);
g.drawRect(100,100,90,150);
}}