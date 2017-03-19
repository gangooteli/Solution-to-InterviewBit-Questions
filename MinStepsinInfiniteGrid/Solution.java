public class Solution {
    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        
        int cost=0, diff=0, diff1=0,diff2=0;
        for (int i=0;i<X.size()-1;i++){
        
            diff1 = X.get(i+1)-X.get(i);
            diff2 = Y.get(i+1)-Y.get(i);
            if(diff1<0) diff1*=-1;
            if(diff2<0) diff2*=-1;
            
            diff = (diff1>diff2) ? diff1:diff2;
            cost+= diff;
            
        }
        
        return cost;
    }
}
