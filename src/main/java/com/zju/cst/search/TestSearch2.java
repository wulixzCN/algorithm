package com.zju.cst.search;

public class TestSearch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//������������
		int[]  arr = {11,22,32,45,56,67,74,89,96,100};
		//����Ҫ���ҵķ���
		int score = 32;
		
//		int index = binarySearch(arr , score);
		
		int index = diguiSearch(arr,score);
		
		//�������
		if(index == -1) {
			System.out.println("���ҽ��������");
		}
		else {
			System.out.println(score + "��������: "+ index);
		}
	}
	
	/*�ǵݹ���ҷ���
	 * T(n) = O(log2n)
	 * S(n) = O(1)
	 */
	public static int binarySearch(int[] arr, int score) {
		int high = arr.length -1;
		int low = 0;
		
		//��mid ֵ
		
		//�ж��Ƿ����
		while (low < high) {
			int mid = (low + high) /2 ;
			//�۰����
			if (score == arr[mid]) {
				return mid;
			}
			else if(score > arr[mid]) {
				low = mid + 1;
			}
			else {
				high = mid -1;
			}
		}	
		
		return -1;
	}
	
	/**
	* T(n) = O(log(n))
	 * S(n) = O(log(n))
	 * @param arr
	 * @param score
	 * @return
	 */
	
	public static int diguiSearch(int[] arr,int score) {
		int high = arr.length -1;
		int low = 0;
		return digui(arr,score,high,low);	
		
	}
	public static int digui(int[] arr,int score,int high, int low) {	
		//�ݹ�Ľ�������
		if(low > high)return -1;
		int mid = (low + high) /2 ;
		if (score == arr[mid]) {
			return mid;
		}else if(score > arr[mid]) {
			low = mid + 1;
			return digui(arr,score,high,low);	
		}
		else {
			high = mid -1;
			return digui(arr,score,high,low);	
		}	
	}


}
