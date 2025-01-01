package OnlineAuctionSystem;

import java.util.ArrayList;
import java.util.List;

public class Auction implements Mediator {
    List<Colleague> colleagueList;
    int currentBid;
    Auction(){
        colleagueList = new ArrayList<>();
    }
    @Override
    public void addColleagues(Colleague bidder) {
        colleagueList.add(bidder);

    }

    @Override
    public void placeBid(Colleague bidderPlacer, int amount) {
        currentBid = amount;
        for(Colleague bidder : colleagueList){
            if(bidder.getName()!= bidderPlacer.getName()){
                bidder.receiveNotification(bidderPlacer.getName(), amount);
            }
        }

    }
}
