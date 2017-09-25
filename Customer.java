package i2i.benimle;

import i2i_benimle.Dbi2IBenimle;

/**
 *
 * @author Furkan KAYALI
 */
public class Customer {
    private String firstName
            ,lastName
            ,birtOfDate;
    private int ID;
    WsConnection wsPort = new WsConnection();
    public MyBalance balance;
    public Customer(int ID){
        I2iBenimle.logger.info("\nCustomer verileri çekiliyor...");
        this.setFirstName(wsPort.service.getDbi2IBenimlePort().getCustomerCredential(ID).getFirstName());
        this.setLastName(wsPort.service.getDbi2IBenimlePort().getCustomerCredential(ID).getLastName());
        this.setID(wsPort.service.getDbi2IBenimlePort().getCustomerCredential(ID).getId());
        I2iBenimle.logger.info("\nCustomer: \nfirst name: "+ firstName+"\nlast name: "+lastName+"\nID: "+ID);
    }

    public String getFirstName(){
        return firstName;
    }
    private void setFirstName(String value){
        this.firstName = value;
    }
    public String getLastName(){
        return lastName;
    }
    private void setLastName(String value){
        this.lastName = value;
    }
    public String getBirtOfDate(){
        return birtOfDate;
    }
    private void setBirtOfDate(String value){
        this.birtOfDate = value;
    }
    public int getID(){
        return ID;
    }
    private void setID(int value){
        this.ID = value;
    }
    
    public String getFullName(){
        return firstName+"  "+lastName;
    }   
}
