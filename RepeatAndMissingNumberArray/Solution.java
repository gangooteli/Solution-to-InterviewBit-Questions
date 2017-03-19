public class Solution {
	// DO NOT MODIFY THE LIST
	public ArrayList<Integer> repeatedNumber(final List<Integer> a) {
	    
    	long x1 = 0, x2=0,sum =0,count=1,diff1=0,a1=0,b1=0,diff2=0;
    
        for(int i:a){
    	    diff1 = diff1 +(count-i);//b1-a1
    	    diff2 = diff2 + (long)(Math.pow(count,2)-Math.pow(i,2)); //b1^2-a1^2
    	    count++;
    	}
    	
    	sum = diff2/diff1;
    	b1 = (sum+diff1)/2;
        a1 = (sum-diff1)/2;
    	
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	result.add((int) a1);
    	result.add((int) b1);
    	return result;
    }
	
	
}
