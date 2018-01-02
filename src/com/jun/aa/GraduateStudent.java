package com.jun.aa;

public class GraduateStudent extends Student {
	int thesis;
	public GraduateStudent(){
		super();
		System.out.println("haha");
	}
	@Override
	public void print(){
		
		System.out.println(english+"\t"+math+"\t"+chinese+"\t"+thesis);
	}
	@Override
	public int getAverage(){
		return (english+math+chinese+thesis)/4;
	}
	
		
	}
	



