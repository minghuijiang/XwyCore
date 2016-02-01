package message;

import component.User;

public class SystemMsg {

	//public static const SET_SELECT_SEX:Object = {ctl:"game", act:"freeselectsex"};
		//SelectSex.as: line 72: 	App.net.send(new HttpGetParams(PHPConsts.SET_SELECT_SEX).getHttpString(), 
		//{gender:this._id}, this.onComplete);
		//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_alreadyselect"}

		/**
		 * 选择性别
		 * 女-0, 男-1
		 * @param user
		 * @param gender
		 * @return
		 */
		public static String setSelectSex(User user,int gender) {
			return user.send(
				"&ctl=game&act=freeselectsex",
				"{\"gender\":%d}",gender
			);
		}

		

}
