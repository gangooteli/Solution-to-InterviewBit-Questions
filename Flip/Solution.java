public class Solution {
    public ArrayList<Integer> flip(String A) {
        int i=0, flag=0;
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        for(i=0;i<A.length();i++){
            if(A.charAt(i)!='1') flag=1;
        }
        if(flag==0) return res; 
        List<Integer> arr = new ArrayList<Integer>();//(A.length()); //array
        List<Integer> sum = new ArrayList<Integer>();//(A.length()); //sum
        List<Integer> index = new ArrayList<Integer>();
        
        
        for(i=0;i<A.length();i++){
            if(A.charAt(i)=='1'){
                arr.add(-1);
            } 
            else if(A.charAt(i)=='0'){
                arr.add(1);
            }
            sum.add(0);
            index.add(-1);
        }
        
        /*
        for(i=0;i<arr.size();i++){
            //System.out.println("start "+ j);
            System.out.println(arr.get(i)+" "+sum.get(i));
            //System.out.println("end "+ j);
        }
        */
        //System.out.println("hello");
        
        int temp =0,start=0,end=-1;
        for(i=0;i<arr.size();i++){
            
            if(temp+arr.get(i)<0){
                temp=0;
                index.set(i,-1);
                //start=i+1;
                continue;
            }
            temp = temp+arr.get(i);
            //if(temp>sum.get(i))
            
            sum.set(i,temp);
            index.set(i,i+1);
        }
        /*
        //for(i=0;i<arr.size();i++){
            //System.out.println("start "+ j);
            System.out.println(arr.get(i)+" "+sum.get(i));
            //System.out.println("end "+ j);
        }
        */
        int max_sum=Integer.MIN_VALUE, q=0;
        for(i=0;i<sum.size();i++){
            //if(sum.get(i)==1)q=i;
            if(max_sum<sum.get(i)) {
                max_sum=sum.get(i);
                end=i+1;
                //start=q;
            }
        }
        
        for(i=end-1;i>=0;i--){
            
            if(index.get(i)!=-1){
                start=index.get(i);
            }
            else break;
        }
        //start=start+1;
        //Integer max_sum = Collections.max(sum);
        //System.out.println(max_sum+" "+start+" "+end);
        res.add(start);
        res.add(end);
        return res;
    }
}
