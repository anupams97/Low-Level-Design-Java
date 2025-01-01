package SimplexAlgo;

public class Transaction{
    User from;
    User to;
    int amount;
    Transaction(User from, User to, int amount ){
        this.from = from;
        this.to = to;
        this.amount =amount;
        from.amountIsOwed  += amount;
        to.amountOwe += amount;
    }
}
