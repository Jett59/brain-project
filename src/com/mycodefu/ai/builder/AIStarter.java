package com.mycodefu.ai.builder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.atomic.AtomicInteger;

import javax.swing.*;

public class AIStarter {
	public static void main(String[] args) {
	JPanel panel = new JPanel();
	JFrame frame = new JFrame("ai terminal");
	frame.add(panel);
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	frame.setSize(screenSize.width, screenSize.height);
	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	frame.setVisible(true);
	panel.setBackground(Color.BLUE);
	panel.setLayout(new FlowLayout());
	JButton go = new JButton("");
	go.setBackground(Color.RED);
	panel.add(go);
	JTextField search = new JTextField("search");
	search.setBackground(Color.WHITE);
	search.setAlignmentX(screenSize.width/2);
	search.setAlignmentY(screenSize.height/2);
	search.setVisible(true);
	search.setSize(100, 100);
	panel.add(search);
	final AtomicInteger times = new AtomicInteger();
	go.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			times.set(times.get()+1);
			
		}
	});
	}
}
