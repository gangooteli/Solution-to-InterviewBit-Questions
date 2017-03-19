public class Solution {
	public ArrayList<Integer> getRow(int a) {
	    int size=a+1,i=0,j=0,k=0;
	    ArrayList<Integer> arr1 = new ArrayList<Integer>(size);
	    ArrayList<Integer> arr2 = new ArrayList<Integer>(size);
	    
	    if(a==0){
	        arr1.add(1);
	        return arr1;
	    }
	    else if(a==1){
	        arr1.add(1);
	        arr1.add(1);
	        return arr1;
	    }
	    for(i=0;i<size;i++){
	        arr1.add(0);
	        arr2.add(0);
	    }
	    arr1.set(0,1);
	    arr1.set(1,1);
	    for(i=0;i<size-2;i++){
	       // System.out.println("hello3");
	        arr2.set(0,1);
	      //  System.out.println("hello4");
	        for(j=1;j<size;j++){
	            //arr2[j]=arr1[j-1]+arr1[j];
	            arr2.set(j,arr1.get(j-1)+arr1.get(j));
	        }
	        for(j=0;j<size;j++){
	            arr1.set(j,arr2.get(j));
	        }
	        /*
	        for(j=0;j<size;j++){
	            System.out.print(arr1.get(j)+" ");
	        }
	        System.out.println("hello");
	        
	        for(j=0;j<size;j++){
	            System.out.print(arr2.get(j)+" ");
	        }
	        System.out.println("hello1");
	        
	        */
	    }
	    return arr2;
	    
	}
}
