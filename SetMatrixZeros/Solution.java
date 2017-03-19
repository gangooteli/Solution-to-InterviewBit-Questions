public class Solution {
	public void setZeroes(ArrayList<ArrayList<Integer>> a) {
	    int i=0,j=0,row=-1,col=-1,k=0,num=-10;
	    int row_size= a.size(),col_size=a.get(0).size();
	    /*
	    //for(i=0;i<row_size;i++){
	        for(j=0;j<col_size;j++){
	            if(Math.abs(a.get(i).get(j))==0){
	                for(k=0;k<row_size;k++){
	                    num = a.get(k).get(j);
	                    if(num>0)
	                        a.get(k).set(j, num*-1);
	                }
	                for(k=0;k<col_size;k++){
	                    num = a.get(i).get(k);
	                    if(num>0)
	                        a.get(i).set(k, num*-1);
	                }
	            }
	        }
	    }
	    */
	    
	    int arr1[]=new int[row_size];
	    int arr2[]=new int[col_size];
	    
	    for(i=0;i<row_size;i++){
	        arr1[i]=-1;
	    }
	    for(i=0;i<col_size;i++){
	        arr2[i]=-1;
	    }
	    
	    for(i=0;i<row_size;i++){
	        for(j=0;j<col_size;j++){
	            if(a.get(i).get(j)==0){
	                //a.get(i).set(0,0);
	                //a.get(0).set(j,0);
	                arr1[i]=0;
	                arr2[j]=0;
	            }
	        }
	    }
	    /*
	    for(i=0;i<row_size;i++){
	        for(j=0;j<col_size;j++)
	            System.out.print(a.get(i).get(j)+" ");
	       System.out.println();
	    }
	    */
	    for(i=0;i<row_size;i++){
	        if(arr1[i]==0){
	            for(j=0;j<col_size;j++){
	                a.get(i).set(j,0);
	            }
	        }
	    }
	    
	    for(i=0;i<col_size;i++){
	        if(arr2[i]==0){
	            for(j=0;j<row_size;j++){
	                a.get(j).set(i,0);
	            }
	        }
	    }
	    
	    
	    /*
	    for(i=0;i<row_size;i++){
	        for(j=0;j<col_size;j++){
	            num=a.get(i).get(j);
	            if(num<0)
	                a.get(i).set(j,0);
	        }
	       //     System.out.print(a.get(i).get(j)+" ");
	     //  System.out.println();
	    }
	    
	    */
	   /*
	    for(i=0;i<row_size;i++){
	        for(j=0;j<col_size;j++)
	            System.out.print(a.get(i).get(j)+" ");
	       System.out.println();
	    }
	    */
	 
	 
	    
	}
}
