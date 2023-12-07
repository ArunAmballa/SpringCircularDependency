package com.arun.beans;

public class Alpha 
{
	
	private Beta beta;
	
	public Alpha()
	{
		System.out.println("Alpha Object Created");
	}

	public Beta getBeta() 
	{
		return beta;
	}

	public void setBeta(Beta beta) 
	{
		this.beta = beta;
		
		System.out.println("Setter Method is Invoked");
	}

	@Override
	public String toString() {
		return "Alpha [beta=" + beta + "]";
	}
	
	
	

}
