package Lecture21;

public class Treisclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tries tries = new Tries();
		tries.add("art");
		tries.add("arts");
		tries.add("bug");
        tries.add("boy");
		tries.add("sea");
		tries.add("see");
		tries.add("seen");
		tries.display();
	System.out.println(tries.Search("artist"));
		
	}

}
