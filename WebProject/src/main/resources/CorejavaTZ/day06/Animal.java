package com.corejava.day06;

/**���︸��*/
public class Animal {
	//��������,�������඼���е�����
	private String type;
	private String name;
	
	public Animal() {

	}

	public Animal(String type, String name) {
		this.type = type;
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//�����ķ���
	public void eat(){
		System.out.println("����Եķ���...");
	}
}