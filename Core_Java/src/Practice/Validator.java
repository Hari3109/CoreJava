package Practice;

public class Validator {
public String checkComment(String comment)throws Exception{
	String rtnValue="Comment is not spam";
	String spam[]= {"abcde","Imno","pqrst","wxyz"};
	int count=0;
	for(int i=0;i<spam.length;i++) {
		if(comment.contains(spam[i])) {
			count++;
		}try {
			if(count>2) {
				throw new SpamException("accounts ban to spam comment");
			}else if(count>0) {
				throw new SpamException("spam comment");
			}
		}catch(SpamException se) {
			throw se;
			
		}catch(Exception e) {
			
		}
		
	}
	return rtnValue;
}
public String commentTheString(String comment)throws Exception{
	String rntValue="comment posted";
	try {
		checkComment(comment);
	}catch(SpamException se) {
		
	}catch(Exception e) {
		rntValue="other Exception";
	}
	return "";
}
}
class SpamException extends Exception{
	public SpamException(String s) {
		super(s);
	}
}
