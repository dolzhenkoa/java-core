package module06;

public final class ArraysUtils {
	

	public static int sum(int array[]) {
		
		int result=0;
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
	

	public static int min(int array[]) {
		
		int result=array[0];
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
	

	public static int multiplication(int array[]) {
		
		int result=0;
		for(int i=0;i<array.length-1;i++) {
			result+=array[i]*array[i++];
		}
		return result;
	}
	
	public static int modulus(int array[]) {
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
	
	public static int[] reverse(int[] array) {
		int i=array.length-1;
		int[] result=new int[array.length];
		for(int item:array) {
			result[i]=item;
			i--;
		}
		return result;	
	}
	
	public static int[] findEvenElements(int[] array) {
		int[] result = null;
		for(int i=0;i<array.length-1;i++) {
			if(i%2==0) {
				if(result==null) {
					result=new int[1];
					result[0]=array[i];
				} else {
					int tmp[]=new int[result.length+1];
					System.arraycopy(result, 0, tmp, 0, result.length);
					tmp[tmp.length-1]=array[i];
					result=tmp.clone();
				}
			}
		}
		return result;
	}
}