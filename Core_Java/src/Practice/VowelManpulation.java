package Practice;

public class VowelManpulation {
	public StringBuffer  manipulateVowels(String str) {
StringBuffer strBuff=new StringBuffer();
for(char ch:str.toCharArray()) {
	switch(ch){
		case'a':
		case'e':
		case'i':
		case'o':
		case'u':
		strBuff.append('b');
		break;
		default:
		strBuff.append(ch);
	}
}
return strBuff;
}
}
