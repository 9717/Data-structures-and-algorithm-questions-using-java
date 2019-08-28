package lecture19;

public class Heapclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap<Integer> heap=new Heap<>();
		heap.add(35);
		heap.add(30);
		heap.add(25);
		heap.add(20);
		heap.add(15);
		heap.add(10);
		heap.add(5);
		heap.add(8);
		heap.add(12);
		heap.display();
		System.out.println("***********");
		heap.remove();
		heap.display();
		

	}

}
