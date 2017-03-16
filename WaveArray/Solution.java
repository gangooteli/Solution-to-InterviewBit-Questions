public class Solution {
	public ArrayList<Integer> wave(ArrayList<Integer> a) {
	   Collections.sort(a);
	   int i=0, size=a.size(),temp=0;
	   if(size==1){
	       return a;
	   }
	   /*
	   for(i=0;i<size;i++){
	       System.out.println(a.get(i));
	   }
	   */
	   //System.out.println(a.get(i));
	   //return a;
	   i=0;
	   
	   while(i<size-1){
	       temp=a.get(i);
	       a.set(i, a.get(i+1));
	       a.set(i+1,temp);
	       i=i+2;
	   }
	   return a;
	}
}
