package hw1.q03;

public class OfferEvaluater
{
    public boolean shouldAccept(Offer offer){
        return (getProfit(offer) >= 0);
    }

    public double getProfit(Offer offer){
        double profit = (offer.getContractCost() - offer.getContractValue());
        return profit;
    }
}

