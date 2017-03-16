public class Solution {
	// DO NOT MODIFY THE LIST
	public int maximumGap(final List<Integer> a) {
	    int i=0,j=0;
	    double size1=a.size();
	    if(size1<2.0){
	        return 0; 
	    }
	    else if(size1==2.0){
	        return Math.abs(a.get(1)-a.get(0));
	    }
	    
	    double min=Double.MAX_VALUE, max=Double.MIN_VALUE, num=0;
	    
	    for(i=0;i<size1;i++){
	        //num=a.get(i);
	        if(a.get(i).compareTo((int)min)<0){
	            min=a.get(i);
	        }
	        if(a.get(i).compareTo((int)max)>0){
	            max=a.get(i);
	        }
	    }
	    
	    if(max==min){
	        return 0;
	    }
	    double gap = (max-min)/(size1-1.0);
	    //System.out.println("gap "+gap);
	    
	    
	    //ArrayList<ArrayList<Integer>> hole1 = new ArrayList<ArrayList<Integer>>();//min
	    //ArrayList<ArrayList<Integer>> hole2 = new ArrayList<ArrayList<Integer>>();//max
	    
	    //ArrayList<Integer> hole1 = new ArrayList<Integer>();
	    //ArrayList<Integer> hole2 = new ArrayList<Integer>();
	    
	    int [][]hole1 = new int[(int)size1][2];
	    //int []hole2 = new int[]
	    for(i=0;i<(size1);i++){
	        hole1[i][0] = Integer.MAX_VALUE;
	        hole1[i][1] = Integer.MIN_VALUE;
	        
	        //hole1.add(;
	        //hole1.add(Integer.MAX_VALUE);
	        //hole2.add(new ArrayList<Integer>());
	        //hole2.add(Integer.MIN_VALUE);
	    }
	    
	    int index=-1;
	    int x=0,y=0;
	    int z=0;
	    for(i=0;i<size1;i++){
	        index=(int)((a.get(i)-min)/gap);
	        //System.out.println(" index "+index);
	        //x=hole1.get(index);
	        x= hole1[index][0];
	        //y=hole2.get(index);
	        y=hole1[index][1];
	        z=a.get(i);
	        /*
	        if(hole1.get(index).compareTo(z)>0){
	            hole1.set(index,z);
	        }
	        if(hole2.get(index).compareTo(z)<0){
	            hole2.set(index,z);
	        }
	        */
	        
	        if(hole1[index][0]>z){
	            hole1[index][0]=z;
	        }
	        if(hole1[index][1]<z){
	            hole1[index][1]=z;
	        }
	        
	        
	        //System.out.println(" num "+hole1.get(index));
	    }
	    /*
	    for(i=0;i<size1;i++){
	        System.out.println("index "+i+" min "+hole1.get(i).get(0)+" max "+hole2.get(i).get(0));
	    }
	    */
	    int max_diff=Integer.MIN_VALUE, prev=hole1[0][1],diff=0;
	    for(i=1;i<size1;i++){
	        
	        if(hole1[i][0]!=Integer.MAX_VALUE){
	            diff=hole1[i][0]-prev;
	            prev=hole1[i][1];
	            if(max_diff<diff){
	                max_diff=diff;
	            }
	        }
	        
	        
	        /*
	        if(!hole1.get(i).equals(Integer.MAX_VALUE)){
	            diff=hole1.get(i)-prev;
	            prev=hole2.get(i);
	            if(max_diff<diff){
	                max_diff=diff;
	            }
	        }
	        */
	        
	    }
	    
	    return max_diff;
	    
	}
}
