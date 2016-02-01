package socket.msg.constant;

public class SpellStatus {

    public static final int SPELL_HIT = 0;
    public static final int SPELL_BLOCK = 1;
    public static final int SPELL_RETURNDMG = 2;
    public static final int SPELL_IMMUNE = 3;
    public static final int SPELL_GETHP = 4;

    public static String getMsg(int status) {
        switch (status) {
            case SPELL_HIT:
                return "击中";
            case SPELL_BLOCK:
                return "格挡";
            case SPELL_RETURNDMG:
                return "反弹";
            case SPELL_IMMUNE:
                return "免疫";
            case SPELL_GETHP:
                return "吸血";
            default:
                return "SpellStatus unknown status = " + status;
        }
    }
}
