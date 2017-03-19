public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
	    int i=0,value=Integer.MIN_VALUE,count1=0,count2=0,size=a.size();
	    if(a.size()<=2){
	        return a.get(0);
	    }
	    
	    int arr[][] = new int[2][2];
	    arr[0][0]=Integer.MIN_VALUE;
	    arr[0][1]=0;
	    arr[1][0]=Integer.MIN_VALUE;
	    arr[1][1]=0;
	    //System.out.println(arr[0][0]+" "+arr[0][1]);
	    //System.out.println(arr[1][0]+" "+arr[1][1]);
	    //System.out.println("hello");

	    
	    for(i=0;i<a.size();i++){
	        value=a.get(i);
	        //System.out.println("hellostart");
	        //System.out.println(arr[0][0]+" "+arr[0][1]);
	        //System.out.println(arr[1][0]+" "+arr[1][1]);
	        if(value!=arr[0][0] &&value!=arr[1][0]){
	            if(arr[0][1]==0) {arr[0][0]=value; arr[0][1]=1;}
	            else if(arr[1][1]==0) {arr[1][0]=value; arr[1][1]=1;}
	            else{
	            arr[0][1]-=1;
	            arr[1][1]-=1;
	            if(arr[0][1]==0)arr[0][0]=Integer.MIN_VALUE;
	            if(arr[1][1]==0)arr[1][0]=Integer.MIN_VALUE;
	            }
	        }
	        else if(value==arr[0][0]) arr[0][1]+=1;
	        else if(value==arr[1][0]) arr[1][1]+=1;
	        //System.out.println("helloend");
	        //System.out.println(arr[0][0]+" "+arr[0][1]+"    "+ arr[1][0]+" "+arr[1][1]);
	        //System.out.println(arr[1][0]+" "+arr[1][1]);
	        
	    }
	    
	    //System.out.println("hello");
	    
	    //System.out.println(arr[0][0]+" "+arr[0][1]);
	   // System.out.println(arr[1][0]+" "+arr[1][1]);
	    /*
	    if(arr[0][1]>arr[1][1]&&arr[0][1]>a.size()/3){
	        //System.out.println("hello1");
	        return arr[0][0];
	    }
	    else if(arr[0][1]<=arr[1][1]&&arr[1][1]>a.size()/3){
	        //System.out.println("hello2");
	        return arr[1][0];
	    }
	    else return -1;
	    
	    /*
	    if(arr[0][1]!=0&&arr[1][1]==0){
	        return arr[0][0];
	    }
	    if(arr[0][1]==0&&arr[1][1]!=0){
	        return arr[1][0];
	    }
	    else return -1;
	    */
	    
	    for(i=0;i<a.size();i++){
	            if(arr[0][0]==a.get(i))
	            count1++;
	            if(arr[1][0]==a.get(i))
	            count2++;
	        }
	        
	   if(count1>size/3) return arr[0][0];
	   else if(count2>size/3) return arr[1][0];
	   else return -1;
	   /*
	    if(arr[0][1]>0){
	        count=0;
	        for(i=0;i<a.size();i++){
	            if(arr[0][0]==a.get(i))
	            count++;
	        }
	        if(count>(a.size()/3))
	            return arr[0][0];
	    }
	    else if(arr[1][1]>0){
	        count=0;
	        for(i=0;i<a.size();i++){
	            if(arr[1][0]==a.get(i))
	            count++;
	        }
	        if(count>(a.size()/3))
	            return arr[1][0];
	    }
	    else return -1;
	    
	 return 0;  
	 
	 */
	}
	
}