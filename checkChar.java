package checkchar;

public class checkChar {

	boolean CheckChar(char ch)
	{
		if(((ch>=65)&&(ch<=90))||((ch>=97)&&(ch<=122)))
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
