
/*
 * THIS IS AN EXAMPLE OF A DIRECTED GRAPH. IN CASE OF DFS, THE ORDER IN WHICH THE
 * NEIGHBORING VERTICES ARE ENTERED DECIDES THE ORDER OF DFS.
*/
import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class TestRunFileInput {

	public static void main(String[] args) throws IOException {

		AlgoImplementation BFSDFS = new AlgoImplementation();
		Scanner sc = new Scanner(System.in);
		LinkedList<Vertex> allVertex = new LinkedList<>();
		String s = "";
		BufferedReader buf = new BufferedReader(
				new FileReader("C:\\Users\\user\\koushik-workspace\\DFSBFS\\src\\graphFile.txt"));

		String allv = buf.readLine();
		for (int i = 0; i < allv.length(); ++i) {
			Vertex ver = new Vertex(Character.toString(allv.charAt(i)));
			allVertex.add(ver);
		}

		while ((s = buf.readLine()) != null) {
			for (Vertex iv : allVertex) {
				if (iv.getData().equalsIgnoreCase(Character.toString(s.charAt(0)))) {
					for (Vertex ov : allVertex) {
						if (ov.getData().equalsIgnoreCase(Character.toString(s.charAt(1))))
							iv.addNeighbourVertex(ov);
					}
				}
			}
		}

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
		buf.close();
	}

}
