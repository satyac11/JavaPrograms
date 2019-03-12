package com.dfs;

import java.util.Stack;

public class Dfs {
	//Node head;
	Node []array;
	int size;
	
	public Dfs(int size) {
		this.size = size;
		array = new Node[size];
		for(int i=0;i<size;i++) {
			array[i] = new Node();
		}
	}
	
	public void add(int source,int destination) {
		Node newNode = new Node(destination);
		newNode.next = array[source].next;
		array[source].next = newNode;
	}
	
	public void dfsExplore(int startVertex) {
		Boolean[] visited = new Boolean[size];
		for(int i=0;i<size;i++) {
			visited[i] = false;
		}
		Stack<Integer> st = new Stack<Integer>();
		st.push(startVertex);
		
		while(!st.isEmpty()) {
			int n = st.pop();
			st.push(n);
			visited[n]=true;
			Node head = array[n];
			Boolean isDone = true;
			
			while(head!=null) {
				if(visited[head.value]==false) {
					st.push(head.value);
					visited[head.value]=true;
					isDone = false;
					break;
				}
				else {
					head = head.next;
				}
			}
			
			if(isDone==true) {
				int out = st.pop();
				System.out.println("Visited Node: "+out);
			}
		}
	}
	
}
