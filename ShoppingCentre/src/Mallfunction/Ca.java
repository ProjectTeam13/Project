/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mallfunction;

/**
 *
 * @author ChristianS
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ca extends JFrame implements ActionListener{
    private JFrame jf = new JFrame();
	private JLabel jl = new JLabel("Hei");
	private JRadioButton r0 = new JRadioButton("Svalbard");
	private JRadioButton r1 = new JRadioButton("Finnmark");
	private JRadioButton r2 = new JRadioButton("Troms");
	private JRadioButton r3 = new JRadioButton("Nordland");
	private JRadioButton r4 = new JRadioButton("Nord-Trøndelag");
	private JRadioButton r5 = new JRadioButton("Sør-Trøndelag");
	private JRadioButton r6 = new JRadioButton("Møre og Romsdal");
	private JRadioButton r7 = new JRadioButton("Sogn og Fjordane");
	private JRadioButton r8 = new JRadioButton("Hordaland");
	private JRadioButton r9 = new JRadioButton("Rogaland");
	private JRadioButton r10 = new JRadioButton("Vest-Agder");
	private JRadioButton r11 = new JRadioButton("Aust-Agder");
	private JRadioButton r12 = new JRadioButton("Telemark");
	private JRadioButton r13 = new JRadioButton("Vestfold");
	private JRadioButton r14 = new JRadioButton("Buskerud");
	private JRadioButton r15 = new JRadioButton("Oppland");
	private JRadioButton r16 = new JRadioButton("Hedemark");
	private JRadioButton r17 = new JRadioButton("Oslo");
	private JRadioButton r18 = new JRadioButton("Akershus");
	private JRadioButton r19 = new JRadioButton("Østfold");
	
	private ButtonGroup b1 = new ButtonGroup();
	private JPanel jp = new JPanel(new GridLayout(0, 1));
	
	public Ca(){
		//jf.add(jl, BorderLayout.CENTER);
		jf.setSize(625, 625);
		jf.setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		jf.add(jp, BorderLayout.CENTER);
		
		b1.add(r0);
		b1.add(r1);
		b1.add(r2);
		b1.add(r3);
		b1.add(r4);
		b1.add(r5);
		b1.add(r6);
		b1.add(r7);
		b1.add(r8);
		b1.add(r9);
		b1.add(r10);
		b1.add(r11);
		b1.add(r12);
		b1.add(r13);
		b1.add(r14);
		b1.add(r15);
		b1.add(r16);
		b1.add(r17);
		b1.add(r18);
		b1.add(r19);
		
		jp.add(r0);
		jp.add(r1);
		jp.add(r2);
		jp.add(r3);
		jp.add(r4);
		jp.add(r5);
		jp.add(r6);
		jp.add(r7);
		jp.add(r8);
		jp.add(r9);
		jp.add(r10);
		jp.add(r11);
		jp.add(r12);
		jp.add(r13);
		jp.add(r14);
		jp.add(r15);
		jp.add(r16);
		jp.add(r17);
		jp.add(r18);
		jp.add(r19);
		b1.clearSelection();
		
	}
	public void actionPerformed(ActionEvent e) {
		
		
	}
	public static void main(String[] args){
		Ca ca = new Ca();
	}
}
