/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package component.item;

import java.util.Comparator;

/**
 *
 * @author Ming Jiang
 */
public class SeedSorter implements Comparator<Seed>{

    private int prio;
    private boolean skip5;
    
    public SeedSorter(int type,boolean skip5){
        prio = type;
        this.skip5= skip5;
    }
    
    @Override
    public int compare(Seed o1, Seed o2) {
        ItemVo i1 = o1.getInfo();
        ItemVo i2 = o2.getInfo();
        if(skip5){
            if(i1.getQualitycfgid()==5)
                return +1;
            else if(i1.getQualitycfgid()==5)
                return -1;
        }
        
        if(i1.getRewardType()==prio&& i2.getRewardType()!=prio)
            return -1;
        else if(i1.getRewardType()!=prio&& i2.getRewardType()==prio)
            return +1;
        else if(i1.getRewardType()==prio&&i2.getRewardType()==prio){
            if(i1.getSeedreqtime()<i2.getSeedreqtime())
                return -1;
            else if( i1.getSeedreqtime()> i2.getSeedreqtime())
                return +1;
        }
        return 0;
        
    }
    
}
