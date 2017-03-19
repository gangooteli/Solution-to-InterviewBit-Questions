public class Solution {
	public ArrayList<ArrayList<Integer>> generateMatrix(int a) {
	    int i=0,j=0, n=a,count=1;
	    ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
	    
	    for(i=0;i<n;i++){
	        arr.add(new ArrayList<Integer>());
	        for(j=0;j<n;j++){
	            arr.get(i).add(0);
	        }
	    }
	    /*
	    for(i=0;i<n;i++){
	        for(j=0;j<n;j++){
	            System.out.print(arr.get(i).get(j)+" ");
	        }
	        System.out.println();
	    }
	    */
	    i=0;
	    while(i<n/2){
	        for(j=i;j<n-i;j++){
	            arr.get(i).set(j,count);
	            //System.out.println(count);
	            count++;
	            
	        }
	        for(j=i+1;j<n-i;j++){
	            arr.get(j).set(n-i-1,count);
	            //System.out.println(count+"hello");
	            count++;
	        }
	        for(j=n-i-2;j>i;j--){
	            arr.get(n-i-1).set(j,count);
	            //System.out.println(count);
	            count++;
	        }
	        for(j=i;j<n-1-i;j++){
	            arr.get(n-j-1).set(i,count);
	            //System.out.println(count);
	            count++;
	        }
	        i++;
	    }
	    if(n%2==1){
	        arr.get((n/2)).set(((n/2)),(n*n));
	    }
	    /*
	    for(i=0;i<n;i++){
	        for(j=0;j<n;j++){
	            System.out.print(arr.get(i).get(j)+" ");
	        }
	        System.out.println();
	    }
	    */
	    
	    return arr;
	    
	}
}
