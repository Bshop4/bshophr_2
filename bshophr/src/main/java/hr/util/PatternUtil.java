package hr.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternUtil {
	
	
	public static String changeName(String name){
		
		Pattern p = Pattern.compile("\\[(.*?)\\]");
		Matcher m = p.matcher(name);
		String str = "";
		while(m.find()){
			str = m.group(1);
		}
		return str;
		
	}
	
	
}
