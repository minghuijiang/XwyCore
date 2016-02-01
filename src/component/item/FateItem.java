package component.item;

import com.mingJiang.util.json.Json;

public class FateItem extends Item {
    /*
     * {
     _cls=rbagitemVo6,
     id=110551117,
     itemcfgid=564,
     num=1,
     arrSellaward=[],
     fatelevelproperty=null,
     nextfatepropertylist=[
     {
     property=defence,
     valuetype=0,
     propertyvalue=6000
     }
     ],
     level=4,
     isfit=1,
     score=0,
     rwarriorId=2563890
     }
     */

    private int fateLv;
    private boolean isFit;
    private int warriorId;

    public FateItem(Json json) {
        super(json);
    }

    @Override
    public void parseItem(Json json) {
        fateLv = json.getInt("level");
        isFit = json.getInt("isfit") == 1;
        warriorId = json.getInt("rwarriorId");
    }

    public int getFateLv() {
        return fateLv;
    }

    public void setFateLv(int fateLv) {
        this.fateLv = fateLv;
    }

    public boolean isFit() {
        return isFit;
    }

    public void setFit(boolean isFit) {
        this.isFit = isFit;
    }

    public int getWarriorId() {
        return warriorId;
    }

    public void setWarriorId(int warriorId) {
        this.warriorId = warriorId;
    }

    @Override
    public String toString() {
        return "" + (isFit ? "已装备-" : "") + this.info.getItemName() + "+" + fateLv;
    }

    @Override
    public void change(Json json) {
        if(json!=null){
            this.fateLv = json.getInt("level",fateLv);
            this.isFit = json.getInt("isfit",isFit?1:0)==1;
            this.warriorId= json.getInt("rwarriorId",warriorId);
        }
    }


}
