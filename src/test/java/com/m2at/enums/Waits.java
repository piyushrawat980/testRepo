package com.m2at.enums;

public enum Waits 
{
	
	Explicit_Wait(10L);
	
	private long waitTime; 
	
	private Waits(long waitTime)
	{
		this.waitTime= waitTime;
	}

	public long waitTime()
	{
		return waitTime;
	}
}
