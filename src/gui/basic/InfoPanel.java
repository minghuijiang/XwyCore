package gui.basic;

import com.mingJiang.util.xml.TagElement;

/**
 * Info panel used for display data,
 *
 * @author Ming Jiang
 *
 */
public abstract class InfoPanel extends BasicPanel {

    public InfoPanel() {
        super(null);
        initPanel(true);
    }

    @Override
    protected void addListener() {
    }

    @Override
    public void readSerializedString(TagElement data) {
    }

    @Override
    public String toSerializedString() {
        return "";
    }

}
