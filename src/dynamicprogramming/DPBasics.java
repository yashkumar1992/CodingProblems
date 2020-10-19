package dynamicprogramming;

public class DPBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int out = new DSATest().powerX(2,5);
		//System.out.println(out);
		
		
		//int out = new DPBasics().sumIterative(1);
		//System.out.println(out);
		
		System.out.println(new DPBasics().fib(10));
		

	}
	

	public int sum(int n) {
	if(n==0) {
		return 0;
	}else if(n==1) {
		return 1;
	}else {
		return n+sum(n-1);
	}
		
	}
	
	
	public int sumIterative(int n) {
		int tempSum =0;
		for(int i=0;i<=n;i++) {
			tempSum += i;
		}
			return tempSum;
		}
	
	
	public int powerX(int x,int power) {
	if(power==0) {
		return 1;
	}else if(power==1){
		return x;	
	}else {
		return x*powerX(x,power-1);
	}
		
	}
	
	    public int[] cache = new int[31];
	    public int fib(int N) {
	        if(cache[N]>0) return cache[N];
	        if(N==0) return 0;
	         if(N==1) return 1;
	        return fib(N-1)+fib(N-2);
	        
	        
	    }
	
	
	
	}


