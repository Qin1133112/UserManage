package com.qin.button;

import java.awt.Font;
import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyButton {

	public static void main(String[] args) {
		creatButton();
		image_Button();
	}

	public static void image_Button() {
		JFrame f=new JFrame();
		String picPath="D:"+File.separator+"test"+File.separator+"A.JPG";
		Icon icon=new ImageIcon(picPath);
		JButton but=new JButton(icon);
		f.add(but);
		f.setSize(200,70);
		f.setLocation(300,200);
		f.setVisible(true);
	}

	public static void creatButton() {
		JFrame f=new JFrame();
		JButton but=new JButton("°´Å¥");
		Font font=new Font("ËÎÌå",Font.BOLD,28);
		but.setFont(font);
		f.add(but);
		f.setSize(200,70);
		f.setLocation(300,200);
		f.setVisible(true);
	}

}
