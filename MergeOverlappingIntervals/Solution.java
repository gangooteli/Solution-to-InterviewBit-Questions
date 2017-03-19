/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        int size= intervals.size(),i=0,overlap=0,temp_start=0,temp_end=0;
        ArrayList<Interval> res_interval = new ArrayList<Interval>(); 
        int arr[][] = new int [2*size][2];
        for(i=0;i<size;i++){
            arr[2*i][0]=intervals.get(i).start;
            arr[2*i+1][0]=intervals.get(i).end;
            arr[2*i][1]=0;
            arr[2*i+1][1]=1;
        }
        Arrays.sort(arr,new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2 ){
                return Integer.compare(o1[0],o2[0]);
            }
        });
        for(i=0;i<2*size;i++){
            if(arr[i][1]==0) overlap++;
            else if(arr[i][1]==1) overlap--;
            
            if(overlap==1&&arr[i][1]==0){
                temp_start=arr[i][0];
            }
            else if(overlap==0&&arr[i][1]==1){
                temp_end = arr[i][0];
                res_interval.add(new Interval(temp_start, temp_end));
            }
        }
        
        return res_interval;
    }
}
