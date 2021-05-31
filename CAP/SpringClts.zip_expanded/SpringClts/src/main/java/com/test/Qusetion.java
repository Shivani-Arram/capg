package com.test;

import java.util.Iterator;
import java.util.List;

public class Qusetion {
	
	private int id;
	private String qname;
	
	private List<Answer> answ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public List<Answer> getAnsw() {
		return answ;
	}

	public void setAnsw(List<Answer> answ) {
		this.answ = answ;
	}
	
	public void disp()
	{
		System.out.println(id+" "+qname);
		
		Iterator<Answer> itr = answ.iterator();
		
		while(itr.hasNext())
		{
			Answer ans = itr.next(); 
			System.out.println(ans.getAns()+" "+ans.getAuthor());
		}
	}
}
