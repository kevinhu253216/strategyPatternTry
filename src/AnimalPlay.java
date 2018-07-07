public class AnimalPlay {

    public static void main(String[] args){
        Animals spark=new Dog();
        Animals tweety=new Bird();

        System.out.println("Dog:"+spark.tryToFly());
        System.out.println("Bird:"+tweety.tryToFly());

        spark.setFlyingAbility(new ItFlys());

        System.out.println("Dog:"+spark.tryToFly());


        tweety.setFlyingAbility(new FastFly());

        System.out.println("Bird:"+tweety.tryToFly());
    }

}
