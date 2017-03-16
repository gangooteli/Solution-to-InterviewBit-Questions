public class Solution {
	public void nextPermutation(ArrayList<Integer> a) {
	    int i=0,n=a.size(),temp=0,count=0,index=0;
	    for(i=n-2;i>0;i--){
	        if(a.get(i+1)>a.get(i)){
	            count=1;
	            index=i;
	            break;
	            
	        }
	    }
	    
	    
	    /*
	    \
	    
	    for(i=0;i<n;i++)
	        System.out.println(a.get(i));
	    System.out.println("hello3");
	    
	    /*
	    System.out.println(a.get(index));
	    System.out.println(a.get(n-1));
	    System.out.println("hello3");
	    /*
	    temp=a.get(index);
	    a.set(index,a.get(n-1));
	    a.set(n-1,temp);
	    System.out.println("hello3");
	    System.out.println(a.get(index));
	    System.out.println(a.get(n-1));
	    */
	    //index+=1;
	    /*
	    for(i=0;i<n;i++)
	        System.out.println(a.get(i));
	    System.out.println("hello3");
	    
	    System.out.println(a.get(index));
	    System.out.println(a.get(n-1));
	    
	    */
	    if(count==1){
	        int j=0;
	    for(j=n-1;j>index;j--){
	        if(a.get(j)>a.get(index)) break;
	    }
	    
	    temp=a.get(j);
	    a.set(j,a.get(index));
	    a.set(index,temp);
	        for(i=0;i<(n-index)/2;i++){
	            temp=a.get(i+index+1);
	            a.set(i+index+1,a.get(n-i-1));
	            a.set(n-i-1,temp);
	        }    
	    }
	    /*
	    
	    for(i=0;i<n;i++)
	        System.out.println(a.get(i));
	    System.out.println("hello3");
	    
	    /*
	    
	    System.out.println("hello1");
	    for(i=0;i<n;i++)
	        System.out.println(a.get(i));
	    */ 
	    
	    if(count==0){
	      //  System.out.println("hello2");
	        for(i=0;i<n/2;i++){
	            temp=a.get(i);
	            a.set(i,a.get(n-i-1));
	            a.set(n-i-1,temp);
	        }
	    }
	    
	    /*
	    
	    for(i=0;i<n;i++)
	        System.out.println(a.get(i));
	    System.out.println("hello3");
	    */
	}
}
