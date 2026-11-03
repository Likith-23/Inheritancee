class Animal{
    void eat(){
        System.out.println("All Animals Eat!");
    }
}

class Lion extends Animal{
    void roar(){
        System.out.println("All Lions roar!");
    }
}

class babyLion extends Lion{
    void smallroar(){
        System.out.println("All Baby Lions roar (not as much as Lions)!");
    }
}

public class Main2 {
    public static void main(String[] er) {
      babyLion obj  = new babyLion();
      obj.eat(); 
      obj.roar();
      obj.smallroar();
    }
}
