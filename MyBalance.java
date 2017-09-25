package i2i.benimle;

import i2i_benimle.Balance;
/**
 *
 * @author Furkan KAYALI
 */
public class MyBalance {
    private int data,
                sms,
                voice,
                money;
    private String date;
    private Balance balance;
   
 
    public String getDate() {
        return date;
        
    }

    private void setDate(String date) {
        this.date = date;
    }
    WsConnection wsPort = new WsConnection();
    
    public MyBalance(){

    }
    public int getData(){
        return data;
    }
    private void setData(int value){
        this.data = value;
    }
    public int getSms(){
        return sms;
    }
    private void setSms(int value){
        this.sms = value;
    }
    public int getVoice(){
        return voice;
    }
    private void setVoice(int value){
        this.voice = value;
    }
    public int getMoney(){
        return money;
    }
    private void setMoney(int value){
        this.money = value;
    }
    public boolean addMoney(int value,String msisdn){ // bu class olmalı mı?
        int check = wsPort.service.getDbi2IBenimlePort().updateCustomerWallet(value,msisdn);
        switch (check) {
            case -2:
                return false;
            case -1:
                return false;
            default:
                return true;
        }
    }
    public void refresh(int ID){
        balance = wsPort.service.getDbi2IBenimlePort().getBalance(ID);
        this.setMoney(wsPort.service.getDbi2IBenimlePort().getCustomerWallet(ID).getAmount());
        this.setData(balance.getRemainingData());
        this.setSms(balance.getRemainingSms());
        this.setVoice(balance.getRemainingVoice());
        this.setDate(balance.getExpirationDate());
    }
}
