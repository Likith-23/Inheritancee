class Mammals{
    void mam(){
        System.out.println("Inside Mammal class");
    }
}

class Lion extends Mammals{
    void li(){
        System.out.println("Inside Lion Class");
    }
}

class Human extends Mammals{
    void human(){
        System.out.println("Inside Human Class");
    }
}

class Main3{
    public static void main(String [] args) {
       Lion obj = new Lion();
       obj.li();
       obj.mam();
    }
}
