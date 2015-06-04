package com.practice.questions;

import java.util.Stack;

public class MatrixPath {

	static int[][] path = new int[4][5];
	static int[][] visited = new int[4][5];
		
	static {
		path[0] = new int[]{0, 0, 1, 0, 1};
		path[1] = new int[]{0, 0, 0, 0, 0};
		path[2] = new int[]{0 ,1 ,1 ,1 ,1};
		path[3] = new int[]{0 ,1 ,1 ,0 ,0};
	}
	
	public static void main(String... args){
	
		check c = new check(1,2);
		checkE e = new checkE();
		check d = (check) e;
		
		System.out.println(c.getClass());
		System.out.println(e.getClass());
		System.out.println(d.getClass());
		
		//4,1
		//0,3
		System.out.println("tarting to calculate");
		//System.out.println("Path Exist : "+pathExists(1,4,3,0));
	}
	
	static boolean pathExists(int startRow,int startCol,int targetRow, int targetCol){
		Stack<check> toVisit = new Stack<check>();
		
		toVisit.add(new check(startRow,startCol));
		
		while(! toVisit.empty()) {
			check dest = toVisit.pop();
			System.out.println("Visiting : "+dest);
			
			if(dest.col == targetCol && dest.row == targetRow) 
				return true;

			addIfAllowed(dest.row + 1, dest.col, toVisit);
			addIfAllowed(dest.row - 1, dest.col, toVisit);
			addIfAllowed(dest.row, dest.col  + 1, toVisit);
			addIfAllowed(dest.row, dest.col - 1, toVisit);
			
			System.out.println("Moves :"+toVisit);
		}
		
		return false;
	}
	
	static void addIfAllowed(int row,int col,Stack<check> toVisit){
		System.out.println("BCeck :"+row+":"+col);
		if(row < 0 || col < 0 || row >= path.length || col >= path[0].length) 
			return ;
		
		System.out.println("Ceck :"+row+":"+col);
		
		if(visited[row][col] == 0)
			visited[row][col] = 1;
		else 
			return;
		
		if(path[row][col] == 0) {
			toVisit.add(new check(row,col));
		}
	}
}

class checkE extends check {
	checkE(){
		super(1,2);
	}
}

class check {
	int row;
	int col;
	
	public check(int row,int col) {
		this.row = row;
		this.col = col;
	}
	public String toString(){
		return "["+this.row+":"+this.col+"]";
	}
}