/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i2i.benimle;

import i2i_benimle.Dbi2IBenimle;

/**
 *
 * @author 7210
 */
public class Msisdn {
    private String msisdn,password;
            private int contractID;

    MyBalance balance;
    WsConnection wsPort = new WsConnection();
    
    public Msisdn(String msisdn,String password){
        setContractID(msisdn,password);
        setMsisdn(msisdn);
        setPassword(password);
        I2iBenimle.logger.info("\nGiriş başarılı Contract ID:"+contractID);
        if(-1 != getContractID()){
            I2iBenimle.logger.info("\nBalance nesnesi oluşturuluyor");
            balance = new MyBalance();
        }
    }
    
    public String getMsisdn(){
        return msisdn;
    }
    private void setMsisdn(String value){
        this.msisdn = value;
    }
    public String getPassword(){
        return password;
    }
    private void setPassword(String value){
        this.password = value;
    }
    public int getContractID(){
        return contractID;
    }
    private void setContractID(String msisdn,String password) {
        this.contractID = wsPort.service.getDbi2IBenimlePort().getContractId(msisdn, password);
    }
}
