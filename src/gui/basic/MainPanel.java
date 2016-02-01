package gui.basic;

/**
 * each GUI should have only one MainPanel, 
 * MainPanel control the message output.
 * @author Ming Jiang
 *
 */
public abstract class MainPanel extends BasicPanel{

   
    
	/**
	 * 
	 */
	private static final long serialVersionUID = -1115632833919545906L;
	protected MessagePanel message;
        protected LoginPanel login;
        
	public MainPanel(){
		super(null);
        initPanel(true);
	}
	
	public void initMsg(){
		message = new MessagePanel();
		//message.setFont(MultiInfo.font);
	}
	
        @Override
	public void setMsg(String msg){
		message.setMsg(msg);
	}
        
        @Override
        public void log(String log){
            message.log(log);
        }
        
        @Override
        public void error(String error){
            message.error(error);
        }

}
