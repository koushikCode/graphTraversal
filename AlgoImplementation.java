/*
 * BOTH ALGORITHM TAKES O(|V| + |E|) TIME COMPLEXITY, WHERE V = SET OF VERTICES, E = SET OF EDGES
 * Works for n-ary Trees and Directed Graphs
 */
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class AlgoImplementation {

	public void breadthFS(Vertex start) {
		// Non-Recursive approach
		
		System.out.println("\nBFS ORDER ");
		Queue<Vertex> queue = new LinkedList<>(); // Queue is used as the ADT

		start.setVisited(true);
		queue.add(start);

		while (!queue.isEmpty()) {

			Vertex actualVertex = queue.remove();
			System.out.print(actualVertex + " ");

			for (Vertex v : actualVertex.getNeighbourList()) {
				if (!v.isVisited()) {
					v.setVisited(true);
					queue.add(v);
				}
			}
		}
	}

	public void depthFS(List<Vertex> list) {
		
		System.out.println("\nDFS ORDER ");
		for (Vertex v : list) {
			if (!v.isVisited()) {
				v.setVisited(true);
				dfsWithStack(v);
			}
		}
	}

	private void dfsWithStack(Vertex rootVertex) {
		// Non-Recursive approach
		Stack<Vertex> stack = new Stack<>(); // Stack is used as the ADT

		stack.push(rootVertex);
		rootVertex.setVisited(true);

		while (!stack.isEmpty()) {

			Vertex actualVertex = stack.pop();
			System.out.print(actualVertex + " ");

			for (Vertex v : actualVertex.getNeighbourList()) {
				if (!v.isVisited()) {
					v.setVisited(true);
					stack.push(v);
				}
			}
		}
	}
}
