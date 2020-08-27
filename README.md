# Graph Traversal Algorithms

Breadth First Search and Depth First Search Non-Recursive implementation in Java.
Both Algorithms take O(|V| + |E|) Time Complexity, where V = set of Vertices, E = set of Edges.
Works for n-ary Trees and Directed Graphs.

The ***TestRunFileInput.java*** file reads the Input Graph from the text file ***graphFile.txt***.
The first line of the ***graphFile.txt*** file is the names of the *Vertices*. Second line onwards
each lines coontains the Edge name in format:
> <Vertex1><Vertex2>; Example, AB, CD and so on, where AB is a directed edge from vertex A to vertex B.
There should be no space in between <Vertex1> and <Vertex2>.

The ***TestRunStaticInput*** file has the Input Graph provided in the code itself; Self explanatory.
