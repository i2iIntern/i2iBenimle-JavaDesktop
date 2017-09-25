/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i2i.benimle;

import i2i_benimle.Dbi2IBenimle;
import i2i_benimle.Dbi2IBenimleService;

/**
 *
 * @author Furkan KAYALI
 */
public class WsConnection {
    static Dbi2IBenimleService service = new Dbi2IBenimleService();
    
    public static Dbi2IBenimle openPort(){
        return service.getDbi2IBenimlePort();
    }
}
