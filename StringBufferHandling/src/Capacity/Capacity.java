package Capacity;

public class Capacity {

	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		
		sb.append("tushar");
		System.out.println(sb.capacity());
		
		sb.append("aabbccddaahhassggssggssgssglkhjhjsgdjuwshdusdusdu");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
	}
}
