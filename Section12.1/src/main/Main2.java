package main;

import model.ZeroException;

public class Main2 {
	public static void main(String[] args) {
		try {
			chia(5, 0);
		} catch (ZeroException e) {
			System.out.println(e.getError());
		}

	}

	public static void chia(int a, int b) throws ZeroException {
		try {
			int kq = a / b;
			System.out.println(kq);
		} catch (Exception e) {
			throw new ZeroException("Loi: " + e);
		}
	}
}
