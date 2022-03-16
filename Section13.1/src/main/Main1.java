package main;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import multithread.MyThread;

public class Main1 {
	public static void main(String[] args) {
		MyThread[] tArr = new MyThread[1000];
		for (int i = 0; i < tArr.length; i++) {
			tArr[i] = new MyThread();
			tArr[i].start();
		}
	}
	

}
