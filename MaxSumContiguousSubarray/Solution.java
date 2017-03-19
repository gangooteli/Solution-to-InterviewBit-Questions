public class Solution {
	// DO NOT MODFIY THE LIST. 
	public int maxSubArray(final List<Integer> a) {
	    int i=0,size=a.size(),sum=0,max=Integer.MIN_VALUE;
	    ArrayList<Integer>b = new ArrayList<Integer>();
	    if(size==1){
	       return a.get(0);
	    }
	    for(i=0;i<size;i++){
	        b.add(0);
	    }
	    /*
	    for(i=0;i<size;i++){
	        System.out.println(b.get(i));
	    }
	    */
	    //if(a.get(0)>0){
	        b.set(0,a.get(0));
	    //}
	    i=1;
	    
	    while(i<size){
	        sum = a.get(i)+b.get(i-1);
	        if(sum>a.get(i)){
	            b.set(i,sum);
	        }
	        else if(sum<=a.get(i)){
	            b.set(i,a.get(i));
	        }
	        //else 
	        i++;
	    }
	    //for(i=0;i<size;i++){
	     //   if(max<b.get(i))
	       //     max=b.get(i);
	      //  System.out.println(b.get(i));
	    //}
	    for(i=0;i<size;i++){
	        if(max<b.get(i))
	            max=b.get(i);
	        //System.out.println(b.get(i));
	    }
	    
	    return max;
	}
}
