import java.util.*;

import java.util.Queue;

public class BFS

{

int n;

Queue<Integer> Q = new LinkedList();

LinkedList<Integer> list[];

public void graph(int Node)

{

n = Node;

list = new LinkedList[Node];

int i;

for (i= 0; i < Node; i++)

{

list[i] = new LinkedList();

}

}

public void edge(int x, int y)

{

list[x].add(y);

}

public void trav(int x1, boolean[] x2)

{

Q.add(x1);

x2[x1] = true;

int k;

while( !Q.isEmpty() )

{

k = Q.remove();

System.out.print( k +" ");

Iterator<Integer> i = list[k].listIterator();

int j;

while( i.hasNext() )

{

j = i.next();

if( x2[j] != true )

{
Q.add(j);

x2[j] = true;

}

}

}

}

public void BFSsearch(int x1)

{

boolean x2[] = new boolean[n];

trav(x1, x2);

for ( int i = 0; i < n; i++ )

{

if( x2[i] != true )

{
trav(i, x2);
}
}
}

public static void main(String args[])

{

BFS obj = new BFS();

obj.graph(5);

obj.edge(0, 1);

obj.edge(0, 4);

obj.edge(2, 3);

obj.edge(2, 4);

System.out.println("Result :");
obj.BFSsearch(0);

}

}