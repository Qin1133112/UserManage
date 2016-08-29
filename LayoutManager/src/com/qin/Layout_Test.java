package com.qin;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Layout_Test {

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		//flowLayout(frame);
		//borderLayout(frame);
		//gridLayout(frame);
		//cardLayout(frame);
		absolutely_Flowout(frame);
	}
	/*
	 * 绝对定位setBounds(int x,int y,int width,int heigth)
	 * (x,y)位置左上角坐标
	 */
	public static void absolutely_Flowout(JFrame frame) {
		frame.setLayout(null);
		JLabel title=new JLabel("www.com.cn");
		JButton enter=new JButton("进入");
		JButton help=new JButton("帮助");
		frame.setSize(200,90);
		title.setBounds(45,5,150,20);
		enter.setBounds(10,30,80,20);
		help.setBounds(100,30,80,20);
		frame.add(title);
		frame.add(enter);
		frame.add(help);
		frame.setVisible(true);
	}
	/*
	 * CardLayout是将一组组件重叠地进行布局，如卡片一般，每次只展现一个界面
	 */
	public static void cardLayout(JFrame frame) {
		Container cont=frame.getContentPane();//取得窗体容器
		CardLayout card=new CardLayout();
		frame.setLayout(card);
		cont.add(new JLabel("标签A",JLabel.CENTER),"first");
		cont.add(new JLabel("标签B",JLabel.CENTER),"second");
		cont.add(new JLabel("标签C",JLabel.CENTER),"third");
		cont.add(new JLabel("标签D",JLabel.CENTER),"fourth");
		cont.add(new JLabel("标签E",JLabel.CENTER),"fifth");
		frame.pack();
		frame.setVisible(true);
		card.show(cont, "third");
		for(int i=0;i<5;i++){
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			card.next(cont);
		}
	}
	/*
	 * GridLayout以表格形式进行管理，必须设置显示的行数和列数
	 * 计算器的操作可使用此布局
	 */
	public static void gridLayout(JFrame frame) {
		frame.setLayout(new GridLayout(3,5,3,3));//行，列，水平间距，垂直间距
		JButton but=null;
		for(int i=0;i<13;i++){
			but=new JButton("按钮"+i);
			frame.add(but);
		}
		frame.pack();
		frame.setVisible(true);
	}
	/*
	 * BorderLayout窗体版面分东南西北中五个区域
	 */
	public static void borderLayout(JFrame frame) {
		frame.setLayout(new BorderLayout(3,3));
		frame.add(new JButton("东"),BorderLayout.EAST);
		frame.add(new JButton("南"),BorderLayout.SOUTH);
		frame.add(new JButton("西"),BorderLayout.WEST);
		frame.add(new JButton("北"),BorderLayout.NORTH);
		frame.add(new JButton("中"),BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}
	/*
	 * 流式布局管理器
	 */
	public static void flowLayout(JFrame frame) {
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,3,3));
		JButton but=null;
		for(int i=0;i<9;i++){
			but=new JButton("按钮"+i);
			frame.add(but);
		}
		frame.setSize(280,123);
		frame.setVisible(true);
	}

}
