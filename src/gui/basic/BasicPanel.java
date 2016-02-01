package gui.basic;

import com.mingJiang.gui.Messagable;
import com.mingJiang.util.xml.TagElement;

import data.StaticInfo;

import javax.swing.JPanel;

/**
 * Basic panel, implemented by all Panel Object, MainPanel is a subClass of
 * BasicPanel and should be unique in each GUI program every Basic Panel get a
 * reference object to the Main Panel.
 *
 *
 * @author Ming Jiang
 *
 */
public abstract class BasicPanel extends JPanel implements Messagable {

    protected MainPanel main;

    /**
     * use to implements more complex structure. make sure include following.
     *
     * <pre>
     *  call initPanel(booelan enable);
     *
     * override initPanel(boolean enable); to setup complex structure.
     * </pre>
     */
    protected BasicPanel() {// use to implements more complex structure.

    }

    public BasicPanel(MainPanel main) {
        this.main = main;
    }

    protected void initPanel(boolean enable) {
        initComponent();
        addListener();
        setEnabled(enable);
    }

    /**
     *  initial component
     */
    protected abstract void initComponent();

    /**
     * add listener
     */
    protected abstract void addListener();

    /**
     * serialize method.
     * @param data 
     */
    public abstract void readSerializedString(TagElement data);
    public abstract String toSerializedString();

    public abstract void update();

    @Override
    public void setMsg(String msg) {
    	if(main!=null)
    		main.setMsg(msg);
    	else
    		StaticInfo.setMsg(msg);
    }

    @Override
    public void log(String msg) {
    	if(main!=null)
    		main.log(msg);
    	else
    		StaticInfo.log(msg);
    }

    @Override
    public void error(String msg){
    	if(main!=null)
    		main.error(msg);
    	else
    		StaticInfo.error(msg);
    }
}
