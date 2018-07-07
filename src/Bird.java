public class Bird extends Animals {

    public Bird(){
        super();
        setSound("Tweet");
        flyingType=new ItFlys();
    }
}
