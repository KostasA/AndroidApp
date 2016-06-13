package com.example.grinkoan.androidapplication;

/**
 * Created by grinkoan on 6/13/2016.
 */
public class Calculation
{
	private int m_result;

	public void add(int x, int y)
	{
		this.m_result = x + y;
	}

	public void sub(int x, int y)
	{
		this.m_result = x - y;
	}

	public int getResult()
	{
		return this.m_result;
	}

}
