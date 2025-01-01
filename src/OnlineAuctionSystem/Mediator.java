package OnlineAuctionSystem;

public interface Mediator {
    public void addColleagues(Colleague bidder);
    public void placeBid(Colleague bidder, int amount);
}
