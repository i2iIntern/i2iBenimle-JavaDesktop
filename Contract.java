package i2i.benimle;

/**
 *
 * @author Furkan KAYALI
 */
public class Contract {

    private int ID;
    RatePlan ratePlan;
    private String msisdnNumber;


    public Contract(int ID){
        this.setID(ID);
        I2iBenimle.logger.info("\nContract ıd: "+ID);
        I2iBenimle.logger.info("\nratePlan nesnesi oluşturuluyor");
        ratePlan = new RatePlan(this.ID);
    }
    public String getMsisdnNumber() {
        return msisdnNumber;
    }

    public void setMsisdnNumber(String msisdnNumber) {
        this.msisdnNumber = msisdnNumber;
    }
    public int getID(){
        return ID;
    }
    
    private void setID(int value){
        this.ID = value;
    }
}
