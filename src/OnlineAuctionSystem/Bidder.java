package OnlineAuctionSystem;

public class Bidder implements Colleague{
    Mediator auctionMediator;
    String name;
    Bidder(Mediator mediator,String name){
        this.auctionMediator = mediator;
        this.name = name;
    }
    @Override
    public void placeBid(int amount) {
        auctionMediator.placeBid(this,amount);
    }

    @Override
    public void receiveNotification(String name, int amount) {
        System.out.println("Notification to " + this.name + " : "+ name + " has put a bid of "+ amount);
    }

    @Override
    public String getName() {
        return name;
    }
}
