public class Solution {
	public int firstMissingPositive(ArrayList<Integer> a) {
	    
	    //ArrayList<Integer> a = ArrayList<Integer>();
	    int size =0,i=0, num1=0, num2=0;
	    for(i=0;i<a.size();i++){
	        if(a.get(i)<1){
	            a.remove(i);
	            i=i-1;
	        }
	    }
	    /*
	    for(i=0;i<a.size();i++){
    	   System.out.println(a.get(i));
	    }
	    
	    */
	    //System.out.println(a.size());
	    for(i=0;i<a.size();i++){
	        if(Math.abs(a.get(i))<=a.size()){
	            num1=Math.abs(a.get(i));
	            num1=num1-1;
	            //System.out.println("hello1");
	            //System.out.println(num1);
	            //System.out.println("hello2");
	            num2=a.get(num1);
	            num2=num2*-1;
	            a.set(num1,num2);
	        }
	    }
	    
	    for(i=0;i<a.size();i++){
    	    //System.out.println(a.get(i));
    	    if(a.get(i)>0){
    	        return i+1;
    	    }
	    }
	    
	    return a.size()+1;
	}
}
