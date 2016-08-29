package com.qin.frame;

import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

public class MyFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame("我的第一个窗体");
		f.setSize(230,80);
		f.setBackground(Color.BLUE);
		//f.setLocation(300,200);
		Point  p=new Point(300,200);
		f.setLocation(p);
		f.setVisible(true);
	}

}
