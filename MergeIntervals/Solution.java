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
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        int size=intervals.size();
       // System.out.println(size);
        int arr[][] = new int[2*size+2][2];
        int i=0,j=0,overlap=0,count=0,temp_start=0,temp_end=0;
        ArrayList<Interval> res_interval = new ArrayList<Interval>();
        for(i=0;i<size;i++){
            //System.out.println("hello");
            arr[2*i][0]=intervals.get(i).start;
            arr[2*i][1]=0;
            //System.out.println(arr[2*i][0]+" "+arr[2*i][1]);
            arr[2*i+1][0]=intervals.get(i).end;
            arr[2*i+1][1]=1;
            //System.out.println(arr[2*i+1][0]+" "+arr[2*i+1][1]);
            //i=i+2;
        }
        /*for(i=0;i<2*size;i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
        */
        arr[2*size][0]=newInterval.start;
        arr[2*size][1]=0;
        arr[2*size+1][0]=newInterval.end;
        arr[2*size+1][1]=1;
        
        
         Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        });
        /*
        for(i=0;i<2*size+2;i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
        
        
        */
       // System.out.println("hello");
        for(i=0;i<2*size+2;i++){
         //   System.out.println(arr[i][0]+" "+arr[i][1]);
            if(arr[i][1]==0)
                overlap++;
            else if(arr[i][1]==1)
                overlap--;
            if(overlap==1&&arr[i][1]==0){
                //res_interval.set(count++)
                temp_start=arr[i][0];
               // System.out.println("start"+temp_start+" "+overlap);
            }
            else if(overlap==0&&arr[i][1]==1){
                //res_interval.set(count++)
                temp_end=arr[i][0];
               // System.out.println("end"+temp_end+" "+overlap);
                res_interval.add(new Interval(temp_start,temp_end));
            }
        }
        //System.out.println("hello");
        int res_size=res_interval.size();
        /*
        //for(i=0;i<res_size;i++){
            System.out.println(res_interval.get(i).start+" "+res_interval.get(i).end);
        }
        */
        return res_interval;
    }
}
