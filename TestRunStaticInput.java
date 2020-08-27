
import java.util.LinkedList;
import java.util.Scanner;

public class TestRunStaticInput {

	public static void main(String[] args) {

		AlgoImplementation BFSDFS = new AlgoImplementation();
		Scanner sc = new Scanner(System.in);
		LinkedList<Vertex> allVertex = new LinkedList<>();

		Vertex verA = new Vertex("A");
		Vertex verB = new Vertex("B");
		Vertex verC = new Vertex("C");
		Vertex verD = new Vertex("D");
		Vertex verE = new Vertex("E");
		Vertex verF = new Vertex("F");
		Vertex verG = new Vertex("G");

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

		System.out.println("THE GIVEN GRAPH\n================================================== \n");
		System.out.println("VERTICES " + allVertex);
		for (Vertex pv : allVertex)
			System.out.println("NEIGHBOURS OF " + pv + " ARE " + pv.getNeighbourList());

		System.out.print("\nPRESS 1 FOR BFS\nPRESS 2 FOR DFS\nENTER YOUR CHOICE >> ");
		switch (sc.nextInt()) {
		case 1:
			BFSDFS.breadthFS(allVertex.getFirst());
			break;
		case 2:
			BFSDFS.depthFS(allVertex);
			break;
		default:
			System.out.println("INAVLID CHOICE!!");
		}

		sc.close();
	}

}
