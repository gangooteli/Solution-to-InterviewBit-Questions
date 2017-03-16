public class Solution {
	public void rotate(ArrayList<ArrayList<Integer>> a) {
	 
	 int arr[] = new int[4];
	 int i=0,n=a.size(),temp=0;
	 
	 for(int j=0;j<n/2;j++){
    	 //System.out.println(j);
    	 i=j;
    	 while(i<n-1-j){
    	     /*
    	     arr[0]=a.get(j).get(i);
    	     arr[1]=a.get(i).get(n-j);
    	     arr[2]=a.get(n-j).get(n-i);
    	     arr[3]=a.get(n-i).get(j);
    	     
    	     temp=arr[3];
    	     arr[3]=arr[2];
    	     arr[2]=arr[1];
    	     arr[1]=ar[0];
    	     arr[0]=temp;
    	     */
    	     /*
    	     
    	     System.out.println("hello ");
    	     System.out.println(i+" "+j);
    	     System.out.println((n-i-1)+" "+j);
    	     System.out.println((n-j-1)+" "+(n-i-1));
    	     System.out.println(i+" "+(n-j-1));
    	     System.out.println(j+" "+i);
    	     System.out.println("end ");
    	     */
    	     temp = a.get(n-i-1).get(j);
    	     a.get(n-i-1).set(j,a.get(n-j-1).get(n-i-1));
    	     a.get(n-j-1).set(n-i-1,a.get(i).get(n-j-1));
    	     a.get(i).set(n-j-1, a.get(j).get(i));
    	     a.get(j).set(i,temp);
    	     i++;
    	 }
    	 
    	 //++j;
	}
	 /*
	 
	 for(i=0;i<n;i++){
	     for(int j=0;j<n;j++){
	         System.out.print(a.get(i).get(j)+" ");
	     }
	     System.out.println();
	 }
	 
	 */
	 /*
	    while(x:0->n)
        {
        	while(i:0->x){
        	    a(0,0)->a(0,n)->a(n,n)->a(n,0)
        		a(x,i)->a(i,n-x)->a(n-x,n-i)->a(n-i,x)->
        	}
        }
        */
	}
}
