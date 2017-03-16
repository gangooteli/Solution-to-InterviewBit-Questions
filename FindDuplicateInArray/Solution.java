public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
	    
        int value_range = a.size()-1; 
        
        int range = (int)Math.sqrt(value_range);
        //System.out.println("range "+range+" "+"value_range"+value_range);
        int repeat_index=-1;
        int arr_range=0;
        if(range*range<value_range) range=range+1;
        //else arr_range = range;
        //System.out.println("range = "+range);
        //System.out.println("arr_range = "+arr_range);
        int []arr = new int[range];
        int i=0;
        for(i=0;i<range;i++){
            arr[i]=0;
        }
        int index=0;
        
        for(i=0;i<value_range+1;i++){
            index=a.get(i)/range;
            if(index*range<a.get(i))
                index+=1;
            arr[index-1]+=1;
            //System.out.println(i+1)
        }
        /*
        for(i=0;i<range;i++){
            System.out.println(i+1+" "+arr[i]);
        }
        */
        
        int flag =0;
        for(i=0;i<range-1;i++){
            if(arr[i]==range) {
                repeat_index=i;
                flag=1;
                //break;
            }
            else if(arr[i]>range){
                repeat_index=i;
                flag=0;
                break;
            }
        }
        
        if(repeat_index==-1){
            if( arr[range-1]> (value_range-( range*(range-1) ) ) ) repeat_index=range-1;
            
        }
        
        if(repeat_index<range-1&&flag==1){
                repeat_index+=1;
        }
        
        //System.out.println("repeat_index "+repeat_index+" "+"range "+range);
        int lower_limit = 0,upper_limit=0;
        lower_limit = (repeat_index*range)+1;
        upper_limit = (repeat_index+1)*range;
        //System.out.println("lower_limit "+lower_limit+" "+"upper_limit "+upper_limit);
        
        if(upper_limit>value_range) upper_limit =value_range;
        //if(lower_limit>value_range) lower_limit =value_range;
        
        //System.out.println("lower_limit "+lower_limit+" "+"upper_limit "+upper_limit);
        
        int arr1_range = upper_limit-lower_limit+1;
        int []arr1 = new int[arr1_range];
        int j=0,res=-1;
        for(i=0;i<a.size();i++){
            if(a.get(i)>=lower_limit&&a.get(i)<=upper_limit){
                if(arr1[a.get(i)-lower_limit]==a.get(i)) 
                    res=a.get(i);
                else
                    arr1[a.get(i)-lower_limit]= a.get(i);
                //System.out.println(a.get(i));
            }    
        }
        /*
        //for(i=0;i<arr1_range;i++){
            System.out.println(arr1[i]);
        }
        */
        //System.out.println(res);
        
        
        return res;
	}
}