package module02;

import java.util.Arrays;
import java.util.Random;

public class Task01 {

	/*
	Input: array with size = 10 can be of one of two data types: int and double. Calculate:

	sum 
	min/max
	max positive
	multiplication  
	modulus of first and last element
	second largest element
	
	As a result you should have methods with following names :
	
	sum(int array[]), sum(double[])
	min(int array[]), min(double[])
	max(int array[]), max(double[])
	maxPositive(int array[]), maxPositive(double array[]), 
	multiplication  (int array[]), multiplication (double[])
	modulus(int array[]), modulus(double[])
	secondLargest(int array[]), secondLargest(double[])  
	*/
	
	public static void main(String[] args) {
		int[] inputI=fillRandomInt(10, -15, 15);
		double[] inputD=fillRandomDouble(10, -15, 15);
				
		System.out.println("array int		: "+Arrays.toString(inputI));
		System.out.println("array double		: "+Arrays.toString(inputD));
				
		System.out.println("sum int			: "+sum(inputI));
		System.out.println("sum double		: "+sum(inputD));
		
		System.out.println("min int			: "+min(inputI));
		System.out.println("min double		: "+min(inputD));
		
		System.out.println("max int			: "+max(inputI));
		System.out.println("max double		: "+max(inputD));
						
		System.out.println("maxPositive int		: "+maxPositive(inputI));
		System.out.println("maxPositive double	: "+maxPositive(inputD));
		
		System.out.println("multiplication int	: "+multiplication(inputI));
		System.out.println("multiplication double	: "+multiplication(inputD));
		
		System.out.println("modulus int		: "+min(inputI));
		System.out.println("modulus double		: "+min(inputD));
		
		System.out.println("secondLargest int	: "+secondLargest(inputI));
		System.out.println("secondLargest double	: "+secondLargest(inputD));

	}
	
	public static int[] fillRandomInt(int size, int min, int max) {
		int[] array=new int[size];
		
		for(int i = 0; i < array.length; i++) {
			array[i]=min+new Random().nextInt((max - min) + 1);
		}
		return array;
	}
	
	public static double[] fillRandomDouble(int size, int min, int max) {
		double[] array=new double[size];
		
		for(int i = 0; i < array.length; i++) {
			array[i]=min+new Random().nextDouble()*((max - min) + 1);
		}
		return array;
	}
	
	public static int sum(int array[]) {
		
		int result=0;
		for(int i=0;i<array.length;i++) {
			result+=array[i];
		}
		return result;
	}
	
	public static double sum(double array[]) {
		
		double result=0D;
		for(int i=0;i<array.length;i++) {
			result+=array[i];
		}
		return result;
	}
	
	public static int max(int array[]) {
		
		int result=array[0];
		for(int i=1;i<array.length;i++) {
			result=Math.max(result, array[i]);
		}
		return result;
	}
	
	public static double max(double array[]) {
		
		double result=array[0];
		for(int i=1;i<array.length;i++) {
			result=Math.max(result, array[i]);
		}
		return result;
	}
	
	public static int min(int array[]) {
		
		int result=array[0];
		for(int i=1;i<array.length;i++) {
			result=Math.min(result, array[i]);
		}
		return result;
	}
	
	public static double min(double array[]) {
		
		double result=array[0];
		for(int i=1;i<array.length;i++) {
			result=Math.min(result, array[i]);
		}
		return result;
	}
	
	public static int maxPositive(int array[]) {
		int result=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]>0) {
				result=Math.max(result, array[i]);
			}
		}
		return result;
	}
	
	public static double maxPositive(double array[]) {
		double result=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]>0) {
				result=Math.max(result, array[i]);
			}
		}
		return result;
	}
			
	public static int multiplication(int array[]) {
		
		int result=0;
		for(int i=0;i<array.length-1;i++) {
			result+=array[i]*array[i++];
		}
		return result;
	}
	
	public static double multiplication(double array[]) {
		
		double result=0;
		for(int i=0;i<array.length-1;i++) {
			result+=array[i]*array[i++];
		}
		return result;
	}
	
	public static int modulus(int array[]) {
		return array[0]%array[array.length-1];
	}
	
	public static double modulus(double array[]) {
		return array[0]%array[array.length-1];
	}
	
	public static int secondLargest(int array[]) {
		//System.out.println(Arrays.toString(array));
		int step=array.length;
		while(step!=1){
			step=(int) (step/1.247);
			
			int i = 0;
        	while (i+step < array.length) {
				if(array[i]>array[i+step] ){
					int swp=array[i+step];
					array[i+step]=array[i];
					array[i]=swp;
					//System.out.println(step);
					//System.out.println(Arrays.toString(array));
				}
				i++;
			}
		};
		
		return array[array.length-2];
	}
	
	private static void doSort(double array[], int start, int end) {
       	if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                double temp = (double) array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        
        doSort(array, start, cur);
        doSort(array, cur+1, end);
    }
	
	public static double secondLargest(double array[]) {
		doSort(array, 0, array.length-1);
		//System.out.println(Arrays.toString(array));
		return array[array.length-2];
	}  
}
