package lecture22;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Graph {
	private class Vertex {
		String name;
		HashMap<Vertex, Integer> nbrs;

		public Vertex(String name) {
			this.name = name;
			this.nbrs = new HashMap<>();

		}

		public void display() {
			String osf = this.name + "=>";
			Set<Vertex> nbrs = this.nbrs.keySet();
			for (Vertex nbr : nbrs) {
				osf = osf + nbr.name + "(" + this.nbrs.get(nbr) + "),";
			}
			osf = osf + "END";
			System.out.println(osf);
		}
	}

	HashMap<String, Vertex> vtces;
	private int numvtces;

	public Graph() {
		this.vtces = new HashMap<>();
		this.numvtces = 0;

	}

	public int numvtces() {
		return this.vtces.size();

	}

	public void addvertex(String name) {
		if (this.vtces.containsKey(name)) {
			return;
		}
		Vertex vtx = new Vertex(name);
		this.vtces.put(name, vtx);

	}

	public void removeVertex(String name) {
		if (!this.vtces.containsKey(name)) {
			return;
		}
		Collection<Vertex> allvtces = this.vtces.values();
		Vertex rvtx = this.vtces.get(name);
		Set<Vertex> nbr = rvtx.nbrs.keySet();

		for (Vertex nbr1 : nbr) {
			nbr1.nbrs.remove(rvtx);

		}
		this.vtces.remove(name);
	}

	public int numEdges() {
		Collection<Vertex> allvtces = this.vtces.values();
		int rv = 0;
		for (Vertex onevtx : allvtces) {
			rv = rv + onevtx.nbrs.size();
		}
		rv = rv / 2;
		return rv;
	}

	public void addEdges(String name1, String name2, int cost) {
		Vertex vtx1 = this.vtces.get(name1);
		Vertex vtx2 = this.vtces.get(name2);
		if (vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vtx2)) {
			return;
		}
		vtx1.nbrs.put(vtx2, cost);
		vtx2.nbrs.put(vtx1, cost);

	}

	public void removeEdges(String name1, String name2) {
		Vertex vtx1 = this.vtces.get(name1);
		Vertex vtx2 = this.vtces.get(name2);
		if (vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vtx2)) {
			return;
		}
		vtx1.nbrs.remove(vtx2);
		vtx2.nbrs.remove(vtx2);

	}

	private boolean hashpathIteratively(Vertex vtx1, Vertex vtx2, HashMap<Vertex, Boolean> explored) {
		LinkedList<Vertex> queue = new LinkedList<>();
		queue.add(vtx1);
		while (!queue.isEmpty()) {
			Vertex rv = queue.remove();
			if (!explored.containsKey(rv)) {
				explored.put(rv, true);

				if (rv.nbrs.containsKey(vtx2)) {
					return true;
				} else {
					Set<Vertex> nbrs = rv.nbrs.keySet();
					for (Vertex nbr : nbrs) {
						if (!explored.containsKey(nbr)) {
							queue.add(nbr);
						}
					}
				}
			}
		}
		return false;

	}
	public void Dijkstras(String source1) {
		int[] dis=new int[this.vtces.size()];
		for(int i=0;i<dis.length;i++) {
			dis[i]=Integer.MAX_VALUE;
		}
		Vertex v=this.vtces.get(source1);
		dis[source1.charAt(0)-65]=0;
		Queue<String> queue=new LinkedList<>();
		queue.add(source1);
		while(!queue.isEmpty()) {
			String str
		}
		
		
		
	}

	public void display() {
		Collection<Vertex> allVtces = this.vtces.values();
		for (Vertex onevtx : allVtces) {
			onevtx.display();
		}
		System.out.println("*********************************");
	}

}
