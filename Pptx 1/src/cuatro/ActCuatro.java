package cuatro;

public class ActCuatro {

	public static Boolean isPrefix(String original, String potencialPrefijo) {
		
		char[] orig = original.toCharArray();
		char[] potencial = potencialPrefijo.toCharArray();
		
		for(int i=0; i<potencialPrefijo.length(); i++) {
			
			if(((Character)potencial[i]).equals(((Character)orig[i]))) {
				continue;
			}else {
				return Boolean.FALSE;
			}
		}
	
		return Boolean.TRUE;
	}
}
