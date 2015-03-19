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

import java.util.*;
import java.awt.*;
import java.awt.event.*;

class Vindu extends JFrame implements ActionListener{
	JPanel jp = new JPanel();
	JLabel jl = new JLabel();
	JRadioButton r0 = new JRadioButton("Svalbard");
	JRadioButton r1 = new JRadioButton("Finnmark");
	JRadioButton r2 = new JRadioButton("Troms");
	JRadioButton r3 = new JRadioButton("Nordland");
	JRadioButton r4 = new JRadioButton("Nord-Trøndelag");
	JRadioButton r5 = new JRadioButton("Sør-Trøndelag");
	JRadioButton r6 = new JRadioButton("Møre og Romsdal");
	JRadioButton r7 = new JRadioButton("Sogn og Fjordane");
	JRadioButton r8 = new JRadioButton("Hordaland");
	JRadioButton r9 = new JRadioButton("Rogaland");
	JRadioButton r10 = new JRadioButton("Vest-Agder");
	JRadioButton r11 = new JRadioButton("Aust-Agder");
	JRadioButton r12 = new JRadioButton("Telemark");
	JRadioButton r13 = new JRadioButton("Vestfold");
	JRadioButton r14 = new JRadioButton("Buskerud");
	JRadioButton r15 = new JRadioButton("Oppland");
	JRadioButton r16 = new JRadioButton("Hedemark");
	JRadioButton r17 = new JRadioButton("Oslo");
	JRadioButton r18 = new JRadioButton("Akershus");
	JRadioButton r19 = new JRadioButton("Østfold");
	
	JButton b1 = new JButton("Next");
	JTabbedPane fane = new JTabbedPane();
	ButtonGroup g = new ButtonGroup();
	
	ButtonGroup g1 = new ButtonGroup();
	JPanel jp1 = new JPanel();
	JRadioButton rb11 = new JRadioButton("Frequently asked questions");
	JRadioButton rb12 = new JRadioButton("Ask coustomer service");
	JTextField t11 = new JTextField(30);
	JTextArea t12 = new JTextArea(200,100);
	String text = "Where is the coustomer service located";
	JRadioButton rb110 = new JRadioButton(text);
	
	Centre[] c = new Centre[15];
	ArrayList<Centre> c1 = new ArrayList<>();
	ArrayList<String> uname = new ArrayList<>();
	
	JPanel jp2 = new JPanel();
	JLabel jl2 = new JLabel("Login requierd");
	JLabel jl21 = new JLabel("Username");
	JLabel jl22 = new JLabel("Password");
	JTextField t21 = new JTextField(15);
	JPasswordField t22 = new JPasswordField(15);
	JButton b21 = new JButton("Login");
	JButton b22 = new JButton("New User");
	
	
	JLabel tekst = new JLabel("");
	JPanel RP = new JPanel(new GridLayout(0, 1));
	public Vindu(){
		setTitle("Malfunction Software System");
		setVisible(true);
		setSize(700, 625);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jl.setIcon(new ImageIcon("src\\img\\fylker3.jpg"));
		jp.add(jl, BorderLayout.EAST);
		fane.add("User", jp);
		add(fane, BorderLayout.NORTH);	
		
		g.add(r0);
		g.add(r1);
		g.add(r2);
		g.add(r3);
		g.add(r4);
		g.add(r5);
		g.add(r6);
		g.add(r7);
		g.add(r8);
		g.add(r9);
		g.add(r10);
		g.add(r11);
		g.add(r12);
		g.add(r13);
		g.add(r14);
		g.add(r15);
		g.add(r16);
		g.add(r17);
		g.add(r18);
		g.add(r19);
		
		jp.add(RP, BorderLayout.WEST);
		RP.add(r0);
		RP.add(r1);
		RP.add(r2);
		RP.add(r3);
		RP.add(r4);
		RP.add(r5);
		RP.add(r6);
		RP.add(r7);
		RP.add(r8);
		RP.add(r9);
		RP.add(r10);
		RP.add(r11);
		RP.add(r12);
		RP.add(r13);
		RP.add(r14);
		RP.add(r15);
		RP.add(r16);
		RP.add(r17);
		RP.add(r18);
		RP.add(r19);
		RP.add(b1);
		
		fane.add("Coustomer Service", jp1);
		rb11.setSelected(true);
		jp1.setLayout(null);
		rb11.setBounds(100, 25, 200, 20);
		rb110.setBounds(125, 45, 500, 20);
		rb12.setBounds(100, 100, 200, 20);
		t11.setBounds(100, 130, 200, 20);
		t12.setBounds(100, 160, 300, 250);
		jp1.add(rb11);
		jp1.add(rb110);
		jp1.add(rb12);
		g1.add(rb11);
		g1.add(rb12);
		jp1.add(t11);
		jp1.add(t12);
		
		g1.clearSelection();
		
		fane.add("Administration login", jp2);
		jp2.setLayout(null);
		jl2.setBounds(200, 25, 200, 50);
		jl21.setBounds(200, 75, 150, 20);
		t21.setBounds(200, 100, 175, 20);
		jl22.setBounds(200, 125, 150, 20);
		t22.setBounds(200, 150, 175, 20);
		b21.setBounds(200, 185, 75, 20);
		b22.setBounds(280, 185, 100, 20);
		tekst.setBounds(200, 250, 300, 20);
		
		jp2.add(tekst);
		jp2.add(t21);
		jp2.add(t22);
		jp2.add(jl2);
		jp2.add(jl21);
		jp2.add(jl22);
		jp2.add(b21);
		jp2.add(b22);
		
		g.clearSelection();	
		b21.addActionListener(this);
		b1.addActionListener(this);
		r0.addActionListener(this);
		
		validate();
	}
	int index = 0;
	public void actionPerformed(ActionEvent e) {
		String u = "chrig";
		String u2 = "per";
		char[] p = {'a', 'b'};
		char[] p2 = {'a', 'b'};
		c1.add(0, new Centre(u,p));
		c1.add(1, new Centre(u2,p2));
		
		rb11.setSelected(true);
		t11.setEditable(false);
		t12.setEditable(false);
		if(e.getSource() == b1){
			if(r0.isSelected()){
				R0 r = new R0();
			}
			else if(r1.isSelected()){
				R1 r = new R1();
			}
			else if(r2.isSelected()){
				R2 r = new R2();
			}
			else if(r3.isSelected()){
				R3 r = new R3();
			}
			else if(r4.isSelected()){
				R4 r = new R4();
			}
			else if(r5.isSelected()){
				R5 r = new R5();
			}
			else if(r6.isSelected()){
				R6 r = new R6();
			}
			else if(r7.isSelected()){
				R7 r = new R7();
			}
			else if(r8.isSelected()){
				R8 r = new R8();
			}
			else if(r9.isSelected()){
				R9 r = new R9();
			}
			else if(r10.isSelected()){
				R10 r = new R10();
			}
			else if(r11.isSelected()){
				R11 r = new R11();
			}
			else if(r12.isSelected()){
				R12 r = new R12();
			}
			else if(r13.isSelected()){
				R13 r = new R13();
			}
			else if(r14.isSelected()){
				R14 r = new R14();
			}
			else if(r15.isSelected()){
				R15 r = new R15();
			}
			else if(r16.isSelected()){
				R16 r = new R16();
			}
			else if(r17.isSelected()){
				R17 r = new R17();
			}
			else if(r18.isSelected()){
				R18 r = new R18();
			}
			else if(r19.isSelected()){
				R19 r = new R19();
			}
		}
		if(e.getSource() == rb11){
			
		}
		if(e.getSource() == rb12){
			
			t11.setEditable(true);
			t12.setEditable(true);
		}
			 
		
		if(e.getSource() == b21){
			char[] password = t22.getPassword();
			String user = t21.getText();
			for(int i = 0; i<c1.size(); i++){
				if(c1.get(i).getUsername().equals(user)){
					index = i;
					if(sjekkPass(password)){
						tekst.setText("");
						Ca ca = new Ca();
						t21.setText("");
						t22.setText("");
						ca.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					}else{
						tekst.setText("Wrong username or password");
						tekst.setForeground(Color.RED);
						t21.setText("");
						t22.setText("");
					}
				}	
			}	
		}
		
		
		if(e.getSource() == b22){
			
		}
		
	}
	private boolean sjekkPass(char[] input){
		boolean ok = false;
		char[] pass = c1.get(index).getPassword();; 
		if(input.length != pass.length){
			ok = false;
		}else{
			ok = Arrays.equals(input,pass);
		}
		Arrays.fill(pass, '0');
		return ok;
	}
}

class Test1{	
	public static void main(String[] args){
		Vindu etVindu = new Vindu();
	}
}

