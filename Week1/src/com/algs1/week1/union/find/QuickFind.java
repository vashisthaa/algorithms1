package com.algs1.week1.union.find;

/**
 * @author Vashistha Singh
 *
 *         The idea here is to make the find connected query faster.
 */
public class QuickFind {

	private int[] id;

	public QuickFind(int N) {
		id = new int[N];
		for (int i = 0; i < N; i++) {
			id[i] = i;
		}
	}

	public void union(int p, int q) {
		int pid = id[p];
		int qid = id[q];
		for (int i = 0; i < id.length; i++) {
			if (id[i] == pid) {
				id[i] = qid;
			}
		}
	}

	public boolean connected(int p, int q) {
		return id[p] == id[q];
	}

}
