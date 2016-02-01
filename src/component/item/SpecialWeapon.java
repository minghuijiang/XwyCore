package component.item;

import com.mingJiang.util.json.Json;

public class SpecialWeapon extends Item {

    /*
     * {
     _cls=rbagitemVo5,
     id=35130946,
     itemcfgid=526,
     num=1,
     arrSellaward=[],
     effectvalue=860,
     nexteffectvalue=890,
     level=22,
     isfit=1,
     score=4300,
     rwarriorId=2563890
     }
     */
    private int effect;
    private int level;
    private boolean isFit;
    private int score;
    private int warriorId;

    public SpecialWeapon(Json json) {
        super(json);
    }

    @Override
    public void parseItem(Json json) {
        effect = json.getInt("effectvalue");
        level = json.getInt("level");
        isFit = json.getInt("isfit") == 1;
        score = json.getInt("score");
        warriorId = json.getInt("rwarriorId");
    }

    public int getEffect() {
        return effect;
    }

    public void setEffect(int effect) {
        this.effect = effect;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isFit() {
        return isFit;
    }

    public void setFit(boolean isFit) {
        this.isFit = isFit;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getWarriorId() {
        return warriorId;
    }

    public void setWarriorId(int warriorId) {
        this.warriorId = warriorId;
    }

    @Override
    public String toString() {
        return info.getItemName();
    }

    @Override
    public void change(Json json) {
        if(json!=null){
            this.level= json.getInt("level", level);
            this.score= json.getInt("score",score);
            this.isFit= json.getInt("isfit",isFit?1:0)==1;
            this.warriorId= json.getInt("rwarriorId",this.warriorId);
        }
    }

}
