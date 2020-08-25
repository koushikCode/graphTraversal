
import java.util.LinkedList;
import java.util.Scanner;

public class TestRun {

	public static void main(String[] args) {

		AlgoImplementation BFSDFS = new AlgoImplementation();
		Scanner sc = new Scanner(System.in);
		LinkedList<Vertex> allVertex = new LinkedList<>();

		/*
		 * do { System.out.print("ENTER A VERTEX >> "); Vertex ver = new
		 * Vertex(sc.nextInt());
		 * 
		 * allVertex.add(ver);
		 * 
		 * System.out.print("WANT TO ENTER ANOTHER (Y/N) ? "); sc.nextLine(); } while
		 * (sc.next().equalsIgnoreCase("Y"));
		 */

		Vertex verA = new Vertex("A");
		Vertex verB = new Vertex("B");
		Vertex verC = new Vertex("C");
		Vertex verD = new Vertex("D");
		Vertex verE = new Vertex("E");
		Vertex verF = new Vertex("F");
		Vertex verG = new Vertex("G");

		/*
		 * THIS IS AN EXAMPLE OF A DIRECTED GRAPH IN CASE OF DFS, THE ORDER IN WHICH THE
		 * NEIGHBORING VERTICES ARE ENTERED DECIDES THE ORDER OF DFS
		 */

		verA.addNeighbourVertex(verB);
		verA.addNeighbourVertex(verC);
		verA.addNeighbourVertex(verG);
		verB.addNeighbourVertex(verF);
		verC.addNeighbourVertex(verE);
		verE.addNeighbourVertex(verG);
		verF.addNeighbourVertex(verD);
		verF.addNeighbourVertex(verG);
		verG.addNeighbourVertex(verB);
		verG.addNeighbourVertex(verD);

		allVertex.add(verA);
		allVertex.add(verB);
		allVertex.add(verC);
		allVertex.add(verD);
		allVertex.add(verE);
		allVertex.add(verF);
		allVertex.add(verG);

		// Printing the given graph
		System.out.println("THE GIVEN GRAPH\n================================================== \n");
		System.out.println("VERTICES " + allVertex);
		for (Vertex pv : allVertex)
			System.out.println("NEIGHBOURS OF " + pv + " ARE " + pv.getNeighbourList());

		System.out.print("\nPRESS 1 FOR BFS\nPRESS 2 FOR DFS\nENTER YOUR CHOICE >> ");
		switch (sc.nextInt()) {
		case 1:
			System.out.println("\nBFS ORDER ");
			BFSDFS.breadthFS(verA);
			// BFSDFS.breadthFS(allVertex.getFirst());
			break;
		case 2:
			System.out.println("\nDFS ORDER ");
			BFSDFS.depthFS(allVertex);
			break;
		default:
			System.out.println("INAVLID CHOICE!!");
		}

		sc.close();
	}

}
