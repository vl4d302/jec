package warmup;

public class Warmup1 {
	
	public Warmup1 () {}
	
	public boolean sleepIn(boolean weekday, boolean vacation) {
		
//		  if (weekday == true && vacation == false) {
//		    return false;
//		  }
//		  if (weekday == false && vacation == true) {
//		    return true;
//		  }
//		  if (weekday == false && vacation == false) {
//		    return true;
//		  }
//		  if (weekday == true && vacation == true) {
//			    return true;
//			  }
//		  return false;
//		}
//----------------------------------------------------
		
		  if (!weekday || vacation) {
		    return true;
		  }
		  
		  return false;

	}
	public int diff21(int n) {
		return (n < 21) ? Math.abs(n - 21) : (Math.abs(n-21))*2 ;
		  
	}

	
	
	
}
