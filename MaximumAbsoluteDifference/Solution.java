public class Solution {
    public int maxArr(ArrayList<Integer> A) {
        //int sum_arr[] = new int(A.size());
        //int diff_arr[] = new int(A.size());
        //int max_sum=Integer.MIN_VALUE, min_sum=Integer.MAX_VALUE;
        //int max_diff=Integer.MIN_VALUE,min_diff=Integer.MAX_VALUE;
        int max_sum=0, min_sum=0;
        int max_diff=0,min_diff=0;
        int diff_arr=0,sum_arr=0;
        int i=0, size=0,diff1=0,diff2=0;
        size=A.size();
        for(i=0;i<size;i++){
            sum_arr= A.get(i)+i+1;
            diff_arr= A.get(i)-i-1;
            //System.out.println(sum_arr+" "+diff_arr);
            if(i==0) {
                max_sum=min_sum=sum_arr;
                max_diff=min_diff=diff_arr;
            }else{
                if(sum_arr>max_sum){
                    max_sum=sum_arr;
                }
                else if(sum_arr<min_sum){
                    min_sum=sum_arr;
                }
                
                if(diff_arr>max_diff){
                    max_diff=diff_arr;
                }
                else if(diff_arr<min_diff){
                    min_diff=diff_arr;
                }
            }
            //System.out.println(max_sum+" "+min_sum+"    "+max_diff+" "+min_diff);
        }
        //System.out.println("Hello");
        //System.out.println(max_sum+" "+min_sum+"    "+max_diff+" "+min_diff);
        diff1=max_sum-min_sum;
        diff2=max_diff-min_diff;
        //System.out.println(diff1+" "+diff2);
        if(Math.abs(diff1)>Math.abs(diff2)) return Math.abs(diff1);
        else return Math.abs(diff2);
        
    }
}
