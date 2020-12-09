import java.awt.*;
import java.awt.event.*;

class frame
{
public static void main(String arg[])
{
Frame fobj=new Frame("marvellous");
fobj.setSize(500,500);

fobj.setVisible(true);
fobj.addWindowListener(new Hello());
}
}

class Hello implements WindowListener
{
public void WindowClosing(WindowEvent e)
{
System.exit(0);
}
public void WindowActivated(WindowEvent e)
{}
public void WindowClosed(WindowEvent e)
{}
public void WindowDeactivated(WindowEvent e)
{}
public void WindowIconified(WindowEvent e)
{}
public void WindowDeiconified(WindowEvent e)
{}
public void WindowOpened(WindowEvent e)
{}
}