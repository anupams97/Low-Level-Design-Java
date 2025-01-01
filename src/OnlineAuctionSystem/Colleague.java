package OnlineAuctionSystem;

public interface Colleague {
    public void placeBid(int amount);
    public void receiveNotification(String name, int amount);
    public String getName();

}
