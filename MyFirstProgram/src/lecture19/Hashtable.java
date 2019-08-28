package lecture19;

public class Hashtable<k, v> {
	private class HTpair {
		k key;
		v value;

		HTpair(k key, v value) {
			this.key = key;
			this.value = value;
		}

		public boolean equals(Object others) {
			HTpair op = (HTpair) others;
			return this.key.equals(op.key);

		}

		public String toString() {
			return "{" + this.key + "-" + this.value + "}";
		}
	}
	private LinkedList<HTpair>[] bucketArray;
	private int size;
	public static final int DEFAULT_CAPACITY=10;
	public Hashtable(int capacity) {
		this.bucketArray=(LinkedList<HTpair>[]) new LinkedList[capacity];
		this.size=0;
	}
	public void put(k key,v value) throws Exception{
		int bi=this.hashCode(key);
		
	}
	private int hashcode(k key)
}
