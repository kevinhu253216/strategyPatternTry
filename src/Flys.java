
public interface Flys {
    String fly();
}

 class ItFlys implements Flys{//can not have ItFlys
    public String fly(){
        return "Flying High.";
    }
}

 class CantFly implements Flys{//can not have ItFlys
    public String fly(){
        return "I can't fly.";
    }
}

class FastFly implements Flys{//can not have ItFlys
    public String fly(){
        return "Fly is so fast.";
    }
}