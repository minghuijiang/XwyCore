package component.item;

import com.mingJiang.util.json.Json;
import com.mingJiang.util.json.JsonArray;

public class Weapon extends Item {

    /*
     * 		{
				
     equipopenhole=3,
     effectvalue=667,
     nexteffectvalue=677,
     level=40,
     isfit=1,
     score=3335,
     rwarriorId=2563890,
     arrEquipedstone=[139,138,137],
     upprice=1801118,
     attackprior=935,
     nextattackprior=943
     }
     */
    private int hole;
    private int effect;
    private int prior;//先攻
    private int level;
    private boolean isFit;
    private int score;
    private int warriorId;
    private int[] stone;

    public Weapon(Json json) {
        super(json);

    }

    @Override
    public void parseItem(Json json) {
    //	System.out.println(json);
        hole = json.getInt("equipopenhole");
        effect = json.getInt("effectvalue");
        prior = json.getInt("attackprior");
        level = json.getInt("level");
        isFit = json.getInt("isfit") == 1;
        score = json.getInt("score");
        warriorId = json.getInt("rwarriorId");
        stone = new int[hole];
        JsonArray stoneVal = null;
        try {
            stoneVal = json.getArray("arrEquipedstone");
        } catch (Exception e) {

        }
        if (stoneVal != null) {
            for (int i = 0; i < stoneVal.getItems().size(); i++) {
                stone[i] = stoneVal.getInt(i);
              //  System.out.println(stone[i]);
            }
        }
    }

    public int getHole() {
        return hole;
    }

    public void setHole(int hole) {
        this.hole = hole;
    }

    public int getEffect() {
        return effect;
    }

    public void setEffect(int effect) {
        this.effect = effect;
    }

    public int getPrior() {
        return prior;
    }

    public void setPrior(int prior) {
        this.prior = prior;
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

    public int[] getStone() {
        return stone;
    }

    public void setStone(int[] stone) {
        this.stone = stone;
    }
    
    public int getRawStat(){
        return this.info.getPropertyvalue();
    }

    //@Override
    @Override
    public String toString() {
        return (isFit ? "已装备-" : "") + info.getLevelNeed() + "-" + info.getItemName() + "+" + level+"  "+this.id;
    }

    @Override
    public void change(Json json) {
        if(json!=null){

            this.level= json.getInt("level", level);
            this.score= json.getInt("score",score);
            this.isFit= json.getInt("isfit",isFit?1:0)==1;
            this.warriorId= json.getInt("rwarriorId",this.warriorId);
        }
    	//System.out.println("武器变更: "+this);
    }

}
