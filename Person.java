package ru.geekbrains.Lesson1;

class Person{
    protected String _name;
    protected String _position;
    protected String _email;
    protected String _phone;
    protected String _salary;
    protected String _age;
	
    public Person(String name, String position, String email, String phone, String salary, String age){
        this._name = name;
        this._position = position;
        this._email = email;
        this._phone = phone;
        this._salary = salary;		
		this._age = age;		
    }
	
    public void display(){
        System.out.println("Name: "+this._name+", Position:"+this._position+", Email:"+this._email+", Phone:"+this._phone+", Salary:"+this._salary+", Age:"+this._age);
    }	

}




