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

public class R0 extends JFrame implements ActionListener{
    private JPanel jp = new JPanel();
	private JLabel jl = new JLabel();
	private JButton b0 = new JButton("s");
	private JButton b1 = new JButton("s1");
	JPanel B = new JPanel(new GridLayout(0, 1));
	public R0(){
		setTitle("Svalbard district");
		jl.setIcon(new ImageIcon("C:\\Users\\Christian\\Documents\\eclipse\\GUI\\src\\img\\svalbard.jpg"));
		setSize(625, 625);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		add(jp);
		jp.add(jl);
		jp.add(B, BorderLayout.WEST);
		B.add(b0);
		B.add(b1);
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b0){
			JTextField t = new JTextField("Hei");
			JLabel jl1 = new JLabel("Hei"); 
			JPanel jp1 = new JPanel();
			jp.add(new JPanel());
			jp1.add(jl1);
			setVisible(false);
			jp1.setVisible(true);
			jp1.add(t);
		}
	}
}
class R1 extends JFrame implements ActionListener{
	private JPanel jp = new JPanel();
	private JLabel jl = new JLabel();
	private JButton b0 = new JButton("s");
	private JButton b1 = new JButton("s1");
	JPanel B = new JPanel(new GridLayout(0, 1));
	public R1(){
		setTitle("Finnmark district");
		jl.setIcon(new ImageIcon("C:\\Users\\Christian\\Documents\\eclipse\\GUI\\src\\img\\finnmark.jpg"));
		setSize(625, 625);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		add(jp);
		jp.add(jl);
		jp.add(B, BorderLayout.WEST);
		B.add(b0);
		B.add(b1);
		
	}
	public void actionPerformed(ActionEvent e) {
		
	}
}
class R2 extends JFrame implements ActionListener{
	private JPanel jp = new JPanel();
	private JLabel jl = new JLabel();
	private JButton b0 = new JButton("s");
	private JButton b1 = new JButton("s1");
	JPanel B = new JPanel(new GridLayout(0, 1));
	public R2(){
		setTitle("Troms district");
		jl.setIcon(new ImageIcon("C:\\Users\\Christian\\Documents\\eclipse\\GUI\\src\\img\\troms.jpg"));
		setSize(625, 625);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		add(jp);
		jp.add(jl);
		jp.add(B, BorderLayout.WEST);
		B.add(b0);
		B.add(b1);
		
	}
	public void actionPerformed(ActionEvent e) {
		
	}
}
class R3 extends JFrame implements ActionListener{
	private JPanel jp = new JPanel();
	private JLabel jl = new JLabel();
	private JButton b0 = new JButton("s");
	private JButton b1 = new JButton("s1");
	JPanel B = new JPanel(new GridLayout(0, 1));
	public R3(){
		setTitle("Nordland district");
		jl.setIcon(new ImageIcon("C:\\Users\\Christian\\Documents\\eclipse\\GUI\\src\\img\\nordland.jpg"));
		setSize(625, 625);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		add(jp);
		jp.add(jl);
		jp.add(B, BorderLayout.WEST);
		B.add(b0);
		B.add(b1);
		
	}
	public void actionPerformed(ActionEvent e) {
		
	}
}
class R4 extends JFrame implements ActionListener{
	private JPanel jp = new JPanel();
	private JLabel jl = new JLabel();
	private JButton b0 = new JButton("s");
	private JButton b1 = new JButton("s1");
	JPanel B = new JPanel(new GridLayout(0, 1));
	public R4(){
		setTitle("Nord-Trøndelag district");
		jl.setIcon(new ImageIcon("C:\\Users\\Christian\\Documents\\eclipse\\GUI\\src\\img\\nord-trøndelag.jpg"));
		setSize(625, 625);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		add(jp);
		jp.add(jl);
		jp.add(B, BorderLayout.WEST);
		B.add(b0);
		B.add(b1);
	}
	public void actionPerformed(ActionEvent e) {
		
	}
}
class R5 extends JFrame implements ActionListener{
	private JPanel jp = new JPanel();
	private JLabel jl = new JLabel();
	private JButton b0 = new JButton("s");
	private JButton b1 = new JButton("s1");
	JPanel B = new JPanel(new GridLayout(0, 1));
	public R5(){
		setTitle("Sør-Trøndelag district");
		jl.setIcon(new ImageIcon("C:\\Users\\Christian\\Documents\\eclipse\\GUI\\src\\img\\sør_trøndelag.jpg"));
		setSize(625, 625);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		add(jp);
		jp.add(jl);
		jp.add(B, BorderLayout.WEST);
		B.add(b0);
		B.add(b1);
		
	}
	public void actionPerformed(ActionEvent e) {
		
	}
}
class R6 extends JFrame implements ActionListener{
	private JPanel jp = new JPanel();
	private JLabel jl = new JLabel();
	private JButton b0 = new JButton("s");
	private JButton b1 = new JButton("s1");
	JPanel B = new JPanel(new GridLayout(0, 1));
	public R6(){
		setTitle("Møre og Romsdal district");
		jl.setIcon(new ImageIcon("C:\\Users\\Christian\\Documents\\eclipse\\GUI\\src\\img\\møre_og_romsdal.jpg"));
		setSize(625, 625);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		add(jp);
		jp.add(jl);
		jp.add(B, BorderLayout.WEST);
		B.add(b0);
		B.add(b1);
		
	}
	public void actionPerformed(ActionEvent e) {
		
	}
}
class R7 extends JFrame implements ActionListener{
	private JPanel jp = new JPanel();
	private JLabel jl = new JLabel();
	private JButton b0 = new JButton("s");
	private JButton b1 = new JButton("s1");
	JPanel B = new JPanel(new GridLayout(0, 1));
	public R7(){
		setTitle("Sogn og Fjordane district");
		jl.setIcon(new ImageIcon("C:\\Users\\Christian\\Documents\\eclipse\\GUI\\src\\img\\sogn_og_fjordane.jpg"));
		setSize(625, 625);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		add(jp);
		jp.add(jl);
		jp.add(B, BorderLayout.WEST);
		B.add(b0);
		B.add(b1);
		
	}
	public void actionPerformed(ActionEvent e) {
		
	}
}
class R8 extends JFrame implements ActionListener{
	private JPanel jp = new JPanel();
	private JLabel jl = new JLabel();
	private JButton b0 = new JButton("s");
	private JButton b1 = new JButton("s1");
	JPanel B = new JPanel(new GridLayout(0, 1));
	public R8(){
		setTitle("Hordaland district");
		jl.setIcon(new ImageIcon("C:\\Users\\Christian\\Documents\\eclipse\\GUI\\src\\img\\hordaland.jpg"));
		setSize(625, 625);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		add(jp);
		jp.add(jl);
		jp.add(B, BorderLayout.WEST);
		B.add(b0);
		B.add(b1);
		
	}
	public void actionPerformed(ActionEvent e) {
		
	}
}
class R9 extends JFrame implements ActionListener{
	private JPanel jp = new JPanel();
	private JLabel jl = new JLabel();
	private JButton b0 = new JButton("s");
	private JButton b1 = new JButton("s1");
	JPanel B = new JPanel(new GridLayout(0, 1));
	public R9(){
		setTitle("Rogaland district");
		jl.setIcon(new ImageIcon("C:\\Users\\Christian\\Documents\\eclipse\\GUI\\src\\img\\rogaland.jpg"));
		setSize(625, 625);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		add(jp);
		jp.add(jl);
		jp.add(B, BorderLayout.WEST);
		B.add(b0);
		B.add(b1);
		
	}
	public void actionPerformed(ActionEvent e) {
		
	}
}
class R10 extends JFrame implements ActionListener{
	private JPanel jp = new JPanel();
	private JLabel jl = new JLabel();
	private JButton b0 = new JButton("s");
	private JButton b1 = new JButton("s1");
	JPanel B = new JPanel(new GridLayout(0, 1));
	public R10(){
		setTitle("Vest-Agder district");
		jl.setIcon(new ImageIcon("C:\\Users\\Christian\\Documents\\eclipse\\GUI\\src\\img\\vest-agder.jpg"));
		setSize(625, 625);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		add(jp);
		jp.add(jl);
		jp.add(B, BorderLayout.WEST);
		B.add(b0);
		B.add(b1);
		
	}
	public void actionPerformed(ActionEvent e) {
		
	}
}
class R11 extends JFrame implements ActionListener{
	private JPanel jp = new JPanel();
	private JLabel jl = new JLabel();
	private JButton b0 = new JButton("s");
	private JButton b1 = new JButton("s1");
	JPanel B = new JPanel(new GridLayout(0, 1));
	public R11(){
		setTitle("Aust-Agder district");
		jl.setIcon(new ImageIcon("C:\\Users\\Christian\\Documents\\eclipse\\GUI\\src\\img\\aust-agder.jpg"));
		setSize(625, 625);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		add(jp);
		jp.add(jl);
		jp.add(B, BorderLayout.WEST);
		B.add(b0);
		B.add(b1);
		
	}
	public void actionPerformed(ActionEvent e) {
		
	}
}
class R12 extends JFrame implements ActionListener{
	private JPanel jp = new JPanel();
	private JLabel jl = new JLabel();
	private JButton b0 = new JButton("s");
	private JButton b1 = new JButton("s1");
	JPanel B = new JPanel(new GridLayout(0, 1));
	public R12(){
		setTitle("Telemark district");
		jl.setIcon(new ImageIcon("C:\\Users\\Christian\\Documents\\eclipse\\GUI\\src\\img\\telemark.jpg"));
		setSize(625, 625);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		add(jp);
		jp.add(jl);
		jp.add(B, BorderLayout.WEST);
		B.add(b0);
		B.add(b1);
		
	}
	public void actionPerformed(ActionEvent e) {
		
	}
}
class R13 extends JFrame implements ActionListener{
	private JPanel jp = new JPanel();
	private JLabel jl = new JLabel();
	private JButton b0 = new JButton("s");
	private JButton b1 = new JButton("s1");
	JPanel B = new JPanel(new GridLayout(0, 1));
	public R13(){
		setTitle("Vestfold district");
		jl.setIcon(new ImageIcon("C:\\Users\\Christian\\Documents\\eclipse\\GUI\\src\\img\\vestfold.jpg"));
		setSize(625, 625);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		add(jp);
		jp.add(jl);
		jp.add(B, BorderLayout.WEST);
		B.add(b0);
		B.add(b1);
		
	}
	public void actionPerformed(ActionEvent e) {
		
	}
}
class R14 extends JFrame implements ActionListener{
	private JPanel jp = new JPanel();
	private JLabel jl = new JLabel();
	private JButton b0 = new JButton("s");
	private JButton b1 = new JButton("s1");
	JPanel B = new JPanel(new GridLayout(0, 1));
	public R14(){
		setTitle("Buskerud district");
		jl.setIcon(new ImageIcon("C:\\Users\\Christian\\Documents\\eclipse\\GUI\\src\\img\\buskerud.jpg"));
		setSize(625, 625);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		add(jp);
		jp.add(jl);
		jp.add(B, BorderLayout.WEST);
		B.add(b0);
		B.add(b1);
		
	}
	public void actionPerformed(ActionEvent e) {
		
	}
}
class R15 extends JFrame implements ActionListener{
	private JPanel jp = new JPanel();
	private JLabel jl = new JLabel();
	private JButton b0 = new JButton("s");
	private JButton b1 = new JButton("s1");
	JPanel B = new JPanel(new GridLayout(0, 1));
	public R15(){
		setTitle("Oppland district");
		jl.setIcon(new ImageIcon("C:\\Users\\Christian\\Documents\\eclipse\\GUI\\src\\img\\oppland.jpg"));
		setSize(625, 625);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		add(jp);
		jp.add(jl);
		jp.add(B, BorderLayout.WEST);
		B.add(b0);
		B.add(b1);
		
	}
	public void actionPerformed(ActionEvent e) {
		
	}
}
class R16 extends JFrame implements ActionListener{
	private JPanel jp = new JPanel();
	private JLabel jl = new JLabel();
	private JButton b0 = new JButton("s");
	private JButton b1 = new JButton("s1");
	JPanel B = new JPanel(new GridLayout(0, 1));
	public R16(){
		setTitle("Hedmark district");
		jl.setIcon(new ImageIcon("C:\\Users\\Christian\\Documents\\eclipse\\GUI\\src\\img\\hedmark.jpg"));
		setSize(625, 625);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		add(jp);
		jp.add(jl);
		jp.add(B, BorderLayout.WEST);
		B.add(b0);
		B.add(b1);
		
	}
	public void actionPerformed(ActionEvent e) {
		
	}
}
class R17 extends JFrame implements ActionListener{
	private JPanel jp = new JPanel();
	private JLabel jl = new JLabel();
	private JButton b0 = new JButton("s");
	private JButton b1 = new JButton("s1");
	JPanel B = new JPanel(new GridLayout(0, 1));
	public R17(){
		setTitle("Oslo district");
		jl.setIcon(new ImageIcon("C:\\Users\\Christian\\Documents\\eclipse\\GUI\\src\\img\\oslo.jpg"));
		setSize(625, 625);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		add(jp);
		jp.add(jl);
		jp.add(B, BorderLayout.WEST);
		B.add(b0);
		B.add(b1);
		
	}
	public void actionPerformed(ActionEvent e) {
		
	}
}
class R18 extends JFrame implements ActionListener{
	private JPanel jp = new JPanel();
	private JLabel jl = new JLabel();
	private JButton b0 = new JButton("s");
	private JButton b1 = new JButton("s1");
	JPanel B = new JPanel(new GridLayout(0, 1));
	public R18(){
		setTitle("Akershus district");
		jl.setIcon(new ImageIcon("C:\\Users\\Christian\\Documents\\eclipse\\GUI\\src\\img\\akershus.jpg"));
		setSize(625, 625);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		add(jp);
		jp.add(jl);
		jp.add(B, BorderLayout.WEST);
		B.add(b0);
		B.add(b1);
		
	}
	public void actionPerformed(ActionEvent e) {
		
	}
}
class R19 extends JFrame implements ActionListener{
	private JPanel jp = new JPanel();
	private JLabel jl = new JLabel();
	private JButton b0 = new JButton("s");
	private JButton b1 = new JButton("s1");
	JPanel B = new JPanel(new GridLayout(0, 1));
	public R19(){
		setTitle("Østfold district");
		jl.setIcon(new ImageIcon("C:\\Users\\Christian\\Documents\\eclipse\\GUI\\src\\img\\østfold.jpg"));
		setSize(625, 625);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		add(jp);
		jp.add(jl);
		jp.add(B, BorderLayout.WEST);
		B.add(b0);
		B.add(b1);
		
	}
	public void actionPerformed(ActionEvent e) {
		
	}
    
}
