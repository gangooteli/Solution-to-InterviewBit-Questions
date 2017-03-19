public class Solution {
	public ArrayList<ArrayList<Integer>> generate(int a) {
	    int size=a+1, i=0, j=0;
	    
	    
	    if(a==0){
	    return new ArrayList<ArrayList<Integer>>() ;    
	    }
	    else if(a==1){
	        ArrayList<ArrayList<Integer>> res1 = new ArrayList<ArrayList<Integer>>();
	        res1.add(new ArrayList<Integer>());
	        res1.get(0).add(1);
	        return res1;
	    }
	    else if(a==2){
	        ArrayList<ArrayList<Integer>> res2 = new ArrayList<ArrayList<Integer>>();
	        res2.add(new ArrayList<Integer>());
	        res2.get(0).add(1);
	        res2.add(new ArrayList<Integer>());
	        res2.get(1).add(1);
	        res2.get(1).add(1);
	        return res2;
	    }
	    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
	        //System.out.println("hello5");
	        res.add(new ArrayList<Integer>());

	        res.get(0).add(1);
	        res.add(new ArrayList<Integer>());
	        //System.out.println("hello6");
	        res.get(1).add(1);
	        //res.add(new ArrayList<Integer>());
	        //System.out.println("hello7");
	        res.get(1).add(1);
	        //res.add(new ArrayList<Integer>());
	        //System.out.println("hello8");
	    for(i=2;i<size-1;i++){
	        //System.out.println("hello3");
	        res.add(new ArrayList<Integer>());
	        res.get(i).add(1);
	        for(j=1;j<i;j++){
	            //System.out.println("hello4");
	            res.get(i).add(res.get(i-1).get(j)+res.get(i-1).get(j-1));
	        }
	        res.get(i).add(1);
	        //System.out.println("hello1");
	        /*
	        for(j=0;j<i+1;j++){
	            System.out.print(res.get(i).get(j));
	        }
	        System.out.println("hello2");
	        */
	    }
	    return res;
	    
	}
}
