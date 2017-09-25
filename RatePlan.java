/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i2i.benimle;

import i2i_benimle.Tariff;

/**
 *
 * @author Furkan KAYALI
 */
public class RatePlan {
    private String title,content;
    private int dataAmount,smsAmount,voiceAmount;
    WsConnection wsPort = new WsConnection();
    Tariff rateplan;
    public RatePlan(int ContractID){
        I2iBenimle.logger.info("\nRate plan verileri çekiliyor...");
        rateplan = wsPort.service.getDbi2IBenimlePort().getRateplan(ContractID);
        this.setTitle(rateplan.getName());
        this.setContent(rateplan.getDescription());
        this.setDataAmount(rateplan.getDataAmount());
        this.setSmsAmount(rateplan.getSmsAmount());
        this.setVoiceAmount(rateplan.getVoiceAmount());
        I2iBenimle.logger.info("\nRate plan: \ntitle : "+title+"\ncontent : "+content+"\ndata:"+dataAmount+"\nsms:"+smsAmount+"\nvoice:"+voiceAmount);
    }
    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    private void setContent(String content) {
        this.content = content;
    }

    public int getDataAmount() {
        return dataAmount;
    }

    private void setDataAmount(int dataAmount) {
        this.dataAmount = dataAmount;
    }

    public int getSmsAmount() {
        return smsAmount;
    }

    private void setSmsAmount(int smsAmount) {
        this.smsAmount = smsAmount;
    }

    public int getVoiceAmount() {
        return voiceAmount;
    }

    private void setVoiceAmount(int voiceAmount) {
        this.voiceAmount = voiceAmount;
    }
    
}
