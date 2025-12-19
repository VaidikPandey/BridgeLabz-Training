public class CalculateProfitandLoss {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        float profitPercentage = (float) profit / costPrice * 100;
        System.out.println("Cost Price is INR " + costPrice+ ", Selling Price is INR " + sellingPrice);
        System.out.println("the Profit is INR " + profit + " and Profit Percentage is " + profitPercentage + "%");
    }
}