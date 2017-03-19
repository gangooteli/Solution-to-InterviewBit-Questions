public class Solution {
	public ArrayList<Integer> maxset(ArrayList<Integer> a) {
	    a.add(-1);
	    int i=0,j=0,max_index=0;
	    int start_index=Integer.MAX_VALUE,sum_len=0,max_len=0,size=a.size(),num=0;
	    long sum=0, max_sum=0;
	    ArrayList<Integer> arr = new ArrayList<Integer>();
	    
	    for(i=0;i<size;i++){
	        num=a.get(i);
	        if(num>-1){
	            sum+=(long)a.get(i);
	            sum_len++;
	            if(start_index==Integer.MAX_VALUE)
	                start_index=i;
	        }
	        else if(num<0){
	            //System.out.println(sum);
	            //System.out.println(max_sum);
	            if(sum>max_sum){
	                max_sum=sum;
	                max_index=start_index;
	                max_len=sum_len;
	            }
	            else if(sum==max_sum){
	                if(sum_len>max_len){
	                    //max_sum=sum;
	                    max_index=start_index;
	                    max_len=sum_len;
	                }
	                else if(sum_len==max_len){
	                    if(max_index>start_index){
	                        //max_sum=sum;
	                        max_index=start_index;
	                        //max_len=sum_len;
	                    }
	                }
	            }
	            sum=0;sum_len=0;start_index=Integer.MAX_VALUE;  
	            
	           // System.out.println(sum);
	            //System.out.println(max_sum);
	        }
	    }
	    
	    for(i=max_index;i<max_index+max_len;i++){
	        arr.add(a.get(i));
	    }
	    /*
	    for(i=0;i<arr.size();i++){
	        System.out.println(arr.get(i));
	    }
	    
	    */
	    return arr;
	}
}
