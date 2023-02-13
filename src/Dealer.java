public class Dealer{
    public int dealerId;
    public String dealerCompanyName;
    public String dealerFirstName;
    public String dealerLastName;

    public Dealer(){
        this.dealerId=1;
        this.dealerCompanyName="ZaFe";
        this.dealerFirstName="Spas";
        this.dealerLastName="Evgeniev";
    }

    public Dealer(int dealerId, String dealerCompanyName, String dealerFirstName, String dealerLastName) {
        this.dealerId = dealerId;
        this.dealerCompanyName = dealerCompanyName;
        this.dealerFirstName = dealerFirstName;
        this.dealerLastName = dealerLastName;
    }

    public int getDealerId() {
        return dealerId;
    }

    public void setDealerId(int dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerCompanyName() {
        return dealerCompanyName;
    }

    public void setDealerCompanyName(String dealerCompanyName) {
        this.dealerCompanyName = dealerCompanyName;
    }

    public String getDealerFirstName() {
        return dealerFirstName;
    }

    public void setDealerFirstName(String dealerFirstName) {
        this.dealerFirstName = dealerFirstName;
    }

    public String getDealerLastName() {
        return dealerLastName;
    }

    public void setDealerLastName(String dealerLastName) {
        this.dealerLastName = dealerLastName;
    }

    @Override
    public String   toString() {
        return "Dealer{" +
                "dealerId=" + dealerId +
                ", dealerCompanyName='" + dealerCompanyName + '\'' +
                ", dealerFirstName='" + dealerFirstName + '\'' +
                ", dealerLastName='" + dealerLastName + '\'' +
                '}';
    }
}