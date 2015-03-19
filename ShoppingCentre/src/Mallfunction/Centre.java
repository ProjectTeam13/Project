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
class Centre {
    private String username;
	private char[] password;
	
	public Centre(String username, char[] password){
		this.username = username;
		this.password = password;
	}
	public String getUsername(){
		return username;
	}
	public char[] getPassword(){
		return password;
	}
	public void setUsername(String u){
		this.username = u;
	}
	public void setPassword(char[] p){
		this.password = p;
	}
}
class Shop{
	private String username;
	private char[] password;
	
	public Shop(String username, char[] password){
		this.username = username;
		this.password = password;
	}
	public String getUsername(){
		return username;
	}
	public char[] getPassword(){
		return password;
	}
	public void setUsername(String u){
		this.username = u;
	}
	public void setPassword(char[] p){
		this.password = p;
	}
}
class Service{
	private String username;
	private char[] password;
	
	public Service(String username, char[] password){
		this.username = username;
		this.password = password;
	}
	public String getUsername(){
		return username;
	}
	public char[] getPassword(){
		return password;
	}
	public void setUsername(String u){
		this.username = u;
	}
	public void setPassword(char[] p){
		this.password = p;
	}
}
