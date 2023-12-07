package com.arun.beans;

public class Beta 
{
	private Alpha alpha;
	
	
	public Beta()
	{
		System.out.println("Beta Object si  Created");
	}

	@Override
	public String toString() {
		return "Beta [alpha=" + alpha + "]";
	}

	public Alpha getAlpha() {
		return alpha;
	}

	public void setAlpha(Alpha alpha) {
		this.alpha = alpha;
		
	}
	

}
