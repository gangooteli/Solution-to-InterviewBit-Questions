public class Solution {
    public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
        ArrayList<Integer> B = new ArrayList<Integer>();
        ArrayList<Integer> C = new ArrayList<Integer>();
        
        
        int i=0,size=A.size(),left_index=-1,count1=0,count2=0,right_index=-1;
        
        for(i=0;i<size;i++){
            B.add(A.get(i));
        }
        
        Collections.sort(B);
       /*
        //for(i=0;i<size;i++){
           // System.out.println(B.get(i));
        }
        */
        i=0;
        while(i<size){
           // System.out.println(i+" "+A.get(i)+" "+B.get(i));
            if(A.get(i)!=B.get(i)){
                left_index=i;
                //count1=1;
                break;
            }
            i++;
        }
        i=size-1;
        while(i>-1){
            if(A.get(i)!=B.get(i)){
                right_index=i;
                //count1=1;
                break;
            }
            i--;
        }
        
        if(left_index==-1){
            C.add(-1);
            //return C;
        }
        else{
            C.add(left_index);
            C.add(right_index);
            
        }
        
        return C;
    }
}
