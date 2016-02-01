/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui.basic.event;

import java.util.EventListener;

/**
 *
 * @author Ming Jiang
 */
public interface PlatformChangeListener extends EventListener{
    
    public void platformChanged(PlatformChangedEvent e);
}
