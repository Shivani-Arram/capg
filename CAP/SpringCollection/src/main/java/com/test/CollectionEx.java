package com.test;
import java.util.*;
import java.util.Iterator;
import java.util.List;
public class CollectionEx {
	/*private List<Object> list;
    public List<Object> getList() {
        return list;
    }
    public void setList(List<Object> list) {
        this.list = list;
    }
    */
    	
    	private int id;
    	private String dept;
    	
    	private List<Person> per;

    	public int getId() {
    		return id;
    	}

    	public void setId(int id) {
    		this.id = id;
    	}

    	public String getDept() {
    		return dept;
    	}

    	public void setDept(String dept) {
    		this.dept = dept;
    	}

    	public List<Person> getPer() {
    		return per;
    	}

    	public void setPer(List<Person> per) {
    		this.per = per;
    	}
    	
    	public void disp()
    	{
    		System.out.println(id+" "+dept);
    		
    		Iterator<Person> itr = per.iterator();
    		
    		while(itr.hasNext())
    		{
    			Person per = itr.next(); 
    			System.out.println(per.getPerid()+" "+per.getPers());
    		}
    	}
}
