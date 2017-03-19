public class Solution {
	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
	    
	    int carry=0;
	    ArrayList<Integer> b = new ArrayList<Integer>(); 
	    for(int i = a.size()-1;i>=0;i--)
	    {
	        if(a.get(i)>9){
	            return null;
	        }
	        else{
	            if(i==a.size()-1)
	            {
	                a.set(i,a.get(i)+1);//=a.get(i)+1;
	            }
	            
	            a.set(i,a.get(i)+carry);//=a.get(i)+carry;
	            carry=a.get(i)/10;
	            a.set(i, a.get(i)%10);//=a.get(i)%10;
	        }
	    }
	    int size= a.size();
	    if(carry>0){
	        a.add(a.get(size-1));
	        for(int j=size-1;j>0;j--){
	            a.set(j,a.get(j-1));
	        }
	        a.set(0,carry);
	    }
	    
	    int zeros=0;
	    for(int k=0;k<a.size();k++){
	        if(a.get(k)>0){
	            zeros=1;
	        }
	        if(zeros==1){
	            b.add(a.get(k));
	        }
	    }
	    return b;
	}
}
