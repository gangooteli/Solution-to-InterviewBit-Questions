public class Solution {
	// DO NOT MODIFY THE LIST
	public int maximumGap(final List<Integer> A) {
	    if(A.size()==0)return -1;
	    if(A.size()==1)return 0;
	    int ans=0,i=0,max=-1;
	    
	    int C[][] = new int[A.size()][2];
	    for(int j=0;j<A.size();j++){
	        C[j][0]=A.get(j);
	        C[j][1]=j;
	    }
	    
	    Arrays.sort(C, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        });

	    int index=C[A.size()-1][1];
	    for(i=A.size()-2;i>=0;i--){
	        ans=Math.max(ans,index-C[i][1]);
	        index=Math.max(index,C[i][1]);
	     }

	    return ans;
	}
	
}