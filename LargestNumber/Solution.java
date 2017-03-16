public class Solution {
	// DO NOT MODIFY THE LIST
	public String largestNumber(final List<Integer> a) {
	   
	   int count=0;
	   for(int i=0;i<a.size();i++){
	       if(a.get(i)!=0)
	       count=1;
	   }
	    
	   if(count==0) return "0";
	   
	   
	   List<Integer> c = new ArrayList<Integer>(a.size());
	   for(int i=0;i<a.size();i++){
	      c.add(a.get(i));
	   }
	   
	    
	    /*
	    String b[] = new String[a.size()];
	    
	    for(int i=0;i<a.size();i++){
	        b[i]=Integer.toString(a.get(i));
	    }
	    */
	    /*
	    //ArrayList<String> d = new ArrayList<String>();
	    for(int i=0;i<a.size();i++){
	        d.add(Integer.toString(a.get(i)));
	    }
	    */
	    
	    Collections.sort(c,new Comparator<Integer>(){
	       @Override
	       public int compare(Integer str1, Integer str2){
	           //if(str1+str2>str2+str1)
	           //return str1;
	           //else return str2;
	           String first = Integer.toString(str1)+Integer.toString(str2);
	           String second =Integer.toString(str2)+Integer.toString(str1);
	           return second.compareTo(first);
	       }
	    });
	    
	    /*
	    Collections.sort(d,new Comparator<ArrayList<String>>(){
	       @Override
	       public int compare(String str1, String str2){
	           //if(str1+str2>str2+str1)
	           //return str1;
	           //else return str2;
	           String first = str1+str2;
	           String second =str2+str1;
	           return second.compareTo(first);
	       }
	    });
	    
	    //
	    /*
	    Arrays.sort(c,new Comparator<Integer>(){
	        @Override
	        public int compare
	    }
	    */
	   /* for(int i=0;i<a.size();i++){
	        System.out.println(b[i]);
	    }
	    */
 	    StringBuffer str= new StringBuffer();
 	    for(int i=0;i<c.size();i++){
 	        //str= str+b[i];
 	        //str+=c.get(i);
 	        str = str.append(c.get(i).toString());
 	    }
 	    //System.out.println(str);
 	    return str.toString();
	}
}
/*
public class Node{
    String s;
    
    
}

*/
*/