/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui.basic.event;

import data.server.ServerInfo;
import java.util.EventObject;

/**
 *
 * @author Ming Jiang
 */
public class PlatformChangedEvent extends EventObject{

    private ServerInfo info;
    public PlatformChangedEvent(Object source) {
        this(source,null);
    }
    
    public PlatformChangedEvent(Object source, ServerInfo info){
        super(source);
        this.info= info;
    }

    /**
     * @return the info
     */
    public ServerInfo getInfo() {
        return info;
    }
    
}
