package Practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GFG {
public static boolean isValidCVVNumber(String str) {
	String regex="^[0-9]{2,3}$";
	Pattern p=Pattern.compile(regex);
	if(str==null) {
		return false;
	}
	Matcher m=p.matcher(str);
	return m.matches();
}
}
