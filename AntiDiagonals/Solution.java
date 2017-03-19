public class Solution {
	public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> a) {
	    int i=0,j=0,n=a.size(),sum=0;
	    ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
	    arr.add(new ArrayList<Integer>());
	    arr.get(0).add(a.get(0).get(0));
	    for(sum=1;sum<n;sum++){
	       arr.add(new ArrayList<Integer>());
	       i=0;
	       while(i<=sum){
	           arr.get(sum).add(a.get(i).get(sum-i));
	           i++;
	       }
	    }
	    
	    
	    for(sum=n;sum<(2*n-1);sum++){
	        
	       arr.add(new ArrayList<Integer>());
	       i=n-1;//2
	       while(sum-i<n){
	           
	           arr.get(sum).add(a.get(sum-i).get(i));
	           i--;
	       }
	    }
	   
	   return arr;
	   
	}
}
