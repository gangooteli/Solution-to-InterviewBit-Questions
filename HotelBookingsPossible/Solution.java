public class Solution {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        //Map<Integer,Integer> pair
        int size= depart.size();
        int i=0,max_overlap=0,start=0,end=0,overlap=0,guest=0;
        int C[][] = new int[size*2][2];
        for(i=0;i<size;i++){
                C[i][0]=arrive.get(i);
                C[i][1]=0;//arrival encoding
        }
        for(i=0;i<size;i++){
                C[size+i][0]=depart.get(i);
                C[size+i][1]=1;//depart encoding
        }
        Arrays.sort(C, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        });
        int temp=0;
        for(i=1;i<2*size;i++){
            if(C[i][0]==C[i-1][0]){
                if(C[i][1]==1){
                    temp=C[i][1];
                    C[i][1]=C[i-1][1];
                    C[i-1][1]=temp;
                }
            }
        }
        /*
        //for(i=0;i<2*size;i++){
            System.out.println(C[i][0]+" "+C[i][1]);
        }
        */
        for(i=0;i<2*size;i++){
            if(guest>K){
                return false;
            }
            if(C[i][1]==0){
                guest++;
            }
            else if(C[i][1]==1){
                guest--;
            }
        }
        /*
        start=C[0][0];
        end=C[0][1];
        for(i=1;i<size;i++){
            if(flag==0){
                break;
            }
            if(C[i][0]>end){
                start=C[i][0];
                end=C[i][1];
                overlap=0;
            }
            else if(C[i][0]<end){
                overlap++;
                flag--;
                
            }
        }
        */
        return true;
        
    }
}
