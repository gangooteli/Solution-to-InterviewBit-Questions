public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> findPerm(final String A, int B) {
        ArrayList<Integer> arr = new ArrayList<Integer>(A.length()+1);
        int i=0,j=0,size=A.length(),k=0;
        
        for(i=0;i<=size;i++){
            arr.add(0);
        }
        /*
        for(i=size;i>-1;i++){
            System.out.println(arr.get(i));
        }
        */
        /*
        for(i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        */
        
        //System.out.println("hello");
        for(i=arr.size()-1;i>0;i--){
            //System.out.println("hello2");
            arr.set(i,arr.get(i)+k);
            if(A.charAt(i-1)=='D'){
                k++;
            }
        }
        arr.set(i,arr.get(i)+k+1);
        /*
        for(i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        System.out.println("Hello");
        */
        
        for(i=1;i<=size;i++){
           // System.out.println("Hello");
            if(A.charAt(i-1)=='D'){
                arr.set(i,arr.get(i)+1);
            }
            else arr.set(i,(arr.get(i)+i+1));
        }
        /*
        for(i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        System.out.println("Hello");
        */
        return arr;
    }
}
