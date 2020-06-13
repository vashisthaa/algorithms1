package com.algs1.week1.union.find;

/**
 * @author Vashistha Singh
 *
 *         The idea here is to use the lazy approach.
 */
public class QuickUnion {

	private int[] id;

	public QuickUnion(int N) {
		id = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
		}
	}

	private int root(int i) {
		while (i != id[i]) {
			i = id[i];
		}
		return i;
	}

	public void union(int p, int q) {
		int proot = root(p);
		int qroot = root(q);
		id[proot] = qroot;
	}

	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}

}
