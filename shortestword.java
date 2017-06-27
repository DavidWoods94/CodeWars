package cw;

// This is not the shortest word
public class shortestword {
	public static long findNb(long m) {
	    long sum = 0L;
	    long n = -1L;
		for(long i = 1L; sum < m; i++) {
	      sum += i * i * i;
	      if(sum == m) {
	        n = i;
	      }
	      
		}
	  return n;
	  }
	
	
	
}
