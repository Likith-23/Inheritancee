//this activity is mainly to explain Hierarchical Inheritance

//parent class

class Mammals{

void mam(){

System.out.println("Inside Mammals Class");

}

}

//child class

class Lion extends Mammals{

void roar(){

System.out.println("Inside Lion class ");

}

}

//child

class Human extends Mammals{

void hum(){

System.out.println("Inside Human");

}

}

class Main4{

public static void main(String args[]){

Human obj=new Human();//object of child of child class

//obj.hum();//this will result in error to run this we have to create object of Human

obj.hum();

obj.mam();

}

}