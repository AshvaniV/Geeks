package ds99.interview.allLevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Input {

    public static void main (String[] args)throws IOException
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            String[] size = ((String)br.readLine()).split("\\s+");
            int size1;
            int size2;
            size1 = Integer.parseInt(size[0]);
            size2 = Integer.parseInt(size[1]);
            String[] ar1 = ((String)br.readLine()).split("\\s+");
            String[] ar2 = ((String)br.readLine()).split("\\s+");
            int[] arr1= new int[size1];
            int[] arr2= new int[size2];
            for(int i = 0;i<size1;i++){
                arr1[i] = Integer.parseInt(ar1[i]);
            }


            for(int i = 0;i<size2;i++){
                arr2[i] = Integer.parseInt(ar2[i]);
            }
            //System.out.println(size1);
        }
    }


    /*
    	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++)
	        arr[i]=sc.nextInt();
	        int m=sc.nextInt();
	        System.out.println(solve(arr,n,m));
	    }
	}
    */
}
