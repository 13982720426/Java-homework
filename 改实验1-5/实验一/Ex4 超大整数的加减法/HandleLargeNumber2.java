public class HandleLargeNumber2 {
public static void main(String args[]) {
    int a[] = {9,9,7,3,3,4,5,9,6,7,8,9,0,8,9,9};
    int b[] = {5,9,8,8,0,7,9,0,8,0,8,0,8,7,6,5,5,4,4,8};
    int x[],z[],flag,k=0;
    int i=0,result =0;
    for(int j:a) {
    		System.out.printf("%d",j);
    	}
    System.out.printf("\n¼õÈ¥:\n");
    for(int j:b) {
        	System.out.printf("%d",j);
    	}

    if(a.length!=b.length) {
        x=a.length>b.length?a:b;
        z=a.length<b.length?a:b;
        flag=a.length>b.length?1:-1;
        }
    else {
        x=a[0]>b[0]?a:b;
        z=a[0]<b[0]?a:b;
        flag=a[0]>b[0]?1:-1;
    }
     int y[]=new int[x.length+1];
    for(i=1;i<=z.length;i++) {
    	y[y.length-i]=z[z.length-i];
    }
    int c[]= new int[x.length+1];
    for(i=1;i<=x.length;i++) {
    	if(i<=x.length-1) {
    		result = x[x.length-i]-y[y.length-i];
    		if(result<0) {
    			result = x[x.length-i]+10-y[y.length-i];
        		c[c.length-i] = result;        		
        		x[x.length-i-1] = x[x.length-i-1]-1;
    		}
        	else {
        		c[c.length-i] = result;
        	}
    	}
    	else {
    		result = x[x.length-i]-y[y.length-i];
    		if(result<0) {
        		c[c.length-i] = result+10;        		
        		c[c.length-i-1] = x[c.length-i-1]-1;
    		}
        	else {
        		c[c.length-i] = result;
        	}
    	}
 		
    	}
  
    System.out.printf("\nµÈÓÚ:\n");
    if(flag<0)
    		System.out.printf("-");
    /*for(int j:c) {
    	System.out.printf("%d",j);
    	}*/
    for(i=0;i<c.length;i++) {
		if(c[i]!=0) {
			k=i;
			break;
			}
		}
	for(i=k;i<c.length;i++) {
		System.out.printf("%d",c[i]);
		}
   }
}