package com.bfs;

import java.util.LinkedList;
import java.util.Queue;

import com.dfs.Node;

public class BFSGraph {
	int size;
	Node []array;
	
	public BFSGraph(int size) {
		array = new Node[size];
		for(int i=0;i<size;i++)
			array[i]= new Node();
		this.size = size;
	}
	
	public void add(int src, int dest) {
		Node newNode = new Node(dest);
		newNode.next = array[src].next;
		array[src].next = newNode;		
	}
	
	public void exploreGraph(int vertex) {
		Boolean []visited = new Boolean[size];
		for(int i=0;i<size;i++)
			visited[i]=false;
		Queue<Integer> que = new LinkedList<Integer>();
		que.add(vertex);
		while(!que.isEmpty()) {
			int out = que.poll();
			visited[out] = true;
			System.out.println("Node Visited: "+out);
			Node head = array[out];
			while(head!=null) {
				if(visited[head.value]==false) {
					que.add(head.value);
					visited[head.value]=true;
				}
				else {
					head = head.next;
				}
			}
		}
	}

}
