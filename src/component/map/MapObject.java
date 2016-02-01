package component.map;

import com.mingJiang.util.json.Json;

public class MapObject {

	private boolean isOpen;
	private boolean isClear;
	private int mapId;
	/**
	 * {
				isopen=1,
				_cls=rmapVo,
				iscleared=1,
				cleartimes=1,
				mapcfgid=92
			}
	 */
	public MapObject(Json obj) {
		isOpen = obj.getInt("isopen")==1;
		isClear = obj.getInt("iscleared")==1;
		mapId = obj.getInt("mapcfgid");
	}
	
	
	public void change(Json change){
		isOpen = change.getInt("isopen", isOpen?1:0)==1;
		isClear = change.getInt("iscleared", isOpen?1:0)==1;
	}
	/**
	 * @return the isOpen
	 */
	public boolean isOpen() {
		return isOpen;
	}
	/**
	 * @return the isClear
	 */
	public boolean isClear() {
		return isClear;
	}
	/**
	 * @return the mapId
	 */
	public int getMapId() {
		return mapId;
	}
	/**
	 * @param isOpen the isOpen to set
	 */
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	/**
	 * @param isClear the isClear to set
	 */
	public void setClear(boolean isClear) {
		this.isClear = isClear;
	}
	/**
	 * @param mapId the mapId to set
	 */
	public void setMapId(int mapId) {
		this.mapId = mapId;
	}
	

}
