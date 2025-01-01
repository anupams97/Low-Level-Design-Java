package OnlineAuctionSystem;

public class Main {
    public static void main(String[] args) {
        Auction hawskby = new Auction();
        Bidder b1 = new Bidder(hawskby, "William Warwick");
        Bidder b2 = new Bidder(hawskby, "Beth");
        hawskby.addColleagues(b1);
        hawskby.addColleagues(b2);
        b1.placeBid(1000);
        b2.placeBid(2000);
        b1.placeBid(2500);


    }
}
