package message;

import component.User;

public class AllMsg {

	//public static const GET_GAME_POINT:Object = {ctl:"sina", act:"getgamepoint"};
	//ReadMoneyOperator.as: line 15: 	App.net.send(new HttpGetParams(PHPConsts.GET_GAME_POINT).getHttpString(), null, this.dataHandler).jumpOutOfQueue();
	//<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"><html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8" /><title> - </title><style>body {	font-size:76%;	font-family:"Lucida Grande", Verdana, Lucida, Arial, Helvetica, sans-serif;	background-color:#FEFEFE;	color:#333333;	margin:0;}a{color:#f60;}a:hover{text-decoration:none;}.dialogtitle {	margin-bottom:10px;	font-weight:bold;}.dialogContent {	padding:10px;}</style><link rel="stylesheet" href="style/dialog.css" /></head><body><div style="margin:100px auto;width:500px;"><table border="0" cellspacing="0" cellpadding="0" id="windowTable">	<tr>		<td colspan="2" class="td9TL"></td>		<td class="td9TC"></td>		<td colspan="2" class="td9TR"></td>	</tr>	<tr>		<td class="td9ML2"></td>		<td class="td9ML"></td>		<td class="td9MC" id="windowContent"><div>	<div class="dialogtitle"><div></div></div>    <div class="dialogContent">    	<div style="width:450px;">       	方法【getgamepoint】未定义，请联系网站管理员。<br />		<div align="center" style="margin-top:10px;">    <a href="javascript:history.back();"></a>		</div>    	</div>    </div></div>               </td>		<td class="td9MR"></td>		<td class="td9MR2"></td>	</tr>	<tr>		<td colspan="2" class="td9BL"></td>		<td class="td9BC"></td>		<td colspan="2" class="td9BR"></td>	</tr></table></div></body></html>

	/**
	 * facebook only
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String getGamePoint(User user) {
		return user.send(
			"&ctl=sina&act=getgamepoint",
			null
		);
	}


	//public static const SESSION:Object = {ctl:"index", act:"templogin", pf:"qzone", openkey:"854454043", pfkey:"131554665"};
	//MainInfoMgr.as: line 106: 	App.net.send(new HttpGetParams(PHPConsts.SESSION, false).getHttpString(), _loc_2, this.onLoadSessionDone, this.onLoadConfigFail, "default", "default", "default", RequestType.GAME_LOAD);
	//{"msgident":"0001","msg":"_gam_err_cantlogin","data":{"sessId":0,"_cls":"login"},"rep":"json","_cls":"msg"}

	/**
	 * 临时登陆
	 * 尝试中
	 * @param user
	 * @return
	 */
	public static String session(User user,String openId) {
		return user.send(
			"&openkey=854454043&pf=qzone&ctl=index&pfkey=131554665&act=templogin&openid="+openId,
			null
		);
	}


	//public static const INIT:Object = {ctl:"game", act:"init"};
	//<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"><html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8" /><title> - </title><style>body {	font-size:76%;	font-family:"Lucida Grande", Verdana, Lucida, Arial, Helvetica, sans-serif;	background-color:#FEFEFE;	color:#333333;	margin:0;}a{color:#f60;}a:hover{text-decoration:none;}.dialogtitle {	margin-bottom:10px;	font-weight:bold;}.dialogContent {	padding:10px;}</style><link rel="stylesheet" href="style/dialog.css" /></head><body><div style="margin:100px auto;width:500px;"><table border="0" cellspacing="0" cellpadding="0" id="windowTable">	<tr>		<td colspan="2" class="td9TL"></td>		<td class="td9TC"></td>		<td colspan="2" class="td9TR"></td>	</tr>	<tr>		<td class="td9ML2"></td>		<td class="td9ML"></td>		<td class="td9MC" id="windowContent"><div>	<div class="dialogtitle"><div></div></div>    <div class="dialogContent">    	<div style="width:450px;">       	方法【init】未定义，请联系网站管理员。<br />		<div align="center" style="margin-top:10px;">    <a href="javascript:history.back();"></a>		</div>    	</div>    </div></div>               </td>		<td class="td9MR"></td>		<td class="td9MR2"></td>	</tr>	<tr>		<td colspan="2" class="td9BL"></td>		<td class="td9BC"></td>		<td colspan="2" class="td9BR"></td>	</tr></table></div></body></html>

	/**
	 * 未知
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String init(User user) {
		return user.send(
			"&ctl=game&act=init",
			null
		);
	}


	//public static const START_APP:Object = {ctl:"index", act:"home"};
	//MainInfoMgr.as: line 136: 	App.net.send(new HttpGetParams(PHPConsts.START_APP, false).getHttpString(), {gip_session:Platform.adapter.getSessionKey(), areaId:Platform.adapter.getAreaId(), platform:Platform.adapter.getPlatform(), gip_userid:Platform.adapter.getUserId()}, this.getFaceBookSession, this.getFaceBookSession);
	//{"msgident":"0000","msg":"_gam_suc_isstop","appId":"100645087","platform":null,"cdnUrl":"http:\/\/app100645087.imgcache.qzoneapp.com\/app100645087","flashDir":"xwygame","serverUrl":"http:\/\/app100645087.qzone.qzoneapp.com\/gateway.php","debug":"0","unencrypt":"0","activitys":"firstpay,yellowbuy,rate,attention,invite,novice,cdkey","newActivity":"","activityIcons":"firstpay","socketUrl":"xwy2csr1.app100645087.twsapp.com:80|xwy2csr2.app100645087.twsapp.com:443","version":"beta201406032127","fileVer":"beta201406032127","bannerVer":"beta201406032127","mshopstart":1405353600,"mshopend":1405612740,"bannerurl":"http:\/\/bbs.open.qq.com\/forum.php?mod=forumdisplay&action=list&fid=501","rmsgList":{"402642430":{"msgtypeid":1,"msgstrid":1,"token":{"starttime":1393845480,"endtime":1420024680,"link_url":"http:\/\/bbs.open.qq.com\/thread-4444745-1-1.html","litpic":"","type":2,"desc":"\u65b0\u624b\u6307\u5bfc\u5458\u6709\u95ee\u5fc5\u7b54\u4e13\u7528\u8d34","intval":60,"ord":1,"loop":999999},"action":null,"msgtime":1393845500,"isread":0,"msgid":402642430},"404964689":{"msgtypeid":1,"msgstrid":1,"token":{"starttime":1394173140,"endtime":1420006740,"link_url":"","litpic":"","type":2,"desc":"\u8bf7\u52ff\u76f8\u4fe1\u6e38\u620f\u5185\u4f4e\u4ef7\u51fa\u552e\u5143\u5b9d\u7684\u8bc8\u9a97\u4fe1\u606f\uff0c\u8bf7\u70b9\u51fb\u5176\u540d\u5b57\uff0c\u9009\u62e9\u5c4f\u853d\u5176\u4fe1\u606f\u3002","intval":60,"ord":1,"loop":999999},"action":null,"msgtime":1394173190,"isread":0,"msgid":404964689},"6783788":{"msgtypeid":1,"msgstrid":1,"token":{"starttime":1357777740,"endtime":1422664140,"link_url":"http:\/\/bbs.open.qq.com\/thread-662653-1-1.html","litpic":"","type":2,"desc":"[\u4fa0\u7269\u8bed]\u81f3\u5c0a\u6bcf\u65e5\u767b\u5f55\u5927\u793c\u5305\u516c\u544a","intval":3,"ord":1,"loop":10},"action":null,"msgtime":1357777811,"isread":0,"msgid":6783788},"464476348":{"msgtypeid":1,"msgstrid":1,"token":{"starttime":1404181320,"endtime":1596162120,"link_url":"http:\/\/bbs.open.qq.com\/thread-2955740-1-1.html","litpic":"","type":2,"desc":"\u300a\u4fa0\u7269\u8bed\u300b\u6d88\u8d39\u6392\u884c\u699c\u89c4\u5219\u8bf4\u660e\uff08\u5fc5\u770b\uff09","intval":120,"ord":1,"loop":999999},"action":null,"msgtime":1404181355,"isread":0,"msgid":464476348},"361166257":{"msgtypeid":1,"msgstrid":1,"token":{"starttime":1387254060,"endtime":1419999660,"link_url":"http:\/\/bbs.open.qq.com\/thread-3881505-1-1.html","litpic":"","type":2,"desc":"\u5173\u4e8e\u8fd1\u671f\u6709\u9a97\u5b50\u8bf1\u5bfc\u73a9\u5bb6\u5145\u503c\u7684\u5904\u7406\u516c\u544a","intval":60,"ord":1,"loop":99999},"action":null,"msgtime":1387254147,"isread":0,"msgid":361166257}},"choseId":"","openid":null,"openkey":null,"pf":"qzone","pfkey":"","serlist":{"55":{"no":"55","id":"S55","url":"http:\/\/xwynew54.app100645087.twsapp.com","socket":"xwy55csr1.app100645087.twsapp.com:443","tgwhead":"tgw_l7_forward%0D%0AHost%3A+xwy55csr1.app100645087.twsapp.com%3A443%0D%0A%0D%0A","name":"\u5929\u5730\u4e7e\u576450\u533a","desc":"\u63a8\u8350","status":1,"zoneid":"54","merged":false},"54":{"no":"54","id":"S54","url":"http:\/\/xwynew53.app100645087.twsapp.com","socket":"xwy54csr1.app100645087.twsapp.com:443","tgwhead":"tgw_l7_forward%0D%0AHost%3A+xwy54csr1.app100645087.twsapp.com%3A443%0D%0A%0D%0A","name":"\u91d1\u6208\u94c1\u9a6c49\u533a","desc":"\u6b63\u5e38","status":2,"zoneid":"53","merged":false},"53":{"no":"53","id":"S53","url":"http:\/\/ua4xwy.app100645087.twsapp.com","socket":"fua4xwy.app100645087.twsapp.com:443","tgwhead":"tgw_l7_forward%0D%0AHost%3A+fua4xwy.app100645087.twsapp.com%3A443%0D%0A%0D%0A","name":"\u820d\u751f\u53d6\u4e49 \u539f31-39\u533a","desc":"\u6b63\u5e38","status":2,"zoneid":"52","merged":true,"old":[31,32,33,34,35,36,37,38,39,1]},"52":{"no":"52","id":"S52","url":"http:\/\/ua3xwy.app100645087.twsapp.com","socket":"fua3xwy.app100645087.twsapp.com:443","tgwhead":"tgw_l7_forward%0D%0AHost%3A+fua3xwy.app100645087.twsapp.com%3A443%0D%0A%0D%0A","name":"\u6df1\u85cf\u82e5\u865a \u539f 2-10\u533a","desc":"\u6b63\u5e38","status":2,"zoneid":"51","merged":true,"old":[2,3,4,5,6,7,8,9,10,1]},"51":{"no":"51","id":"S51","url":"http:\/\/ua2xwy.app100645087.twsapp.com","socket":"fua2xwy.app100645087.twsapp.com:443","tgwhead":"tgw_l7_forward%0D%0AHost%3A+fua2xwy.app100645087.twsapp.com%3A443%0D%0A%0D%0A","name":"\u5200\u5149\u5251\u5f71 \u539f21-30\u533a","desc":"\u6b63\u5e38","status":2,"zoneid":"50","merged":true,"old":[21,22,23,24,25,26,27,28,29,30,1]},"50":{"no":"50","id":"S50","url":"http:\/\/ua1xwy.app100645087.twsapp.com","socket":"fua1xwy.app100645087.twsapp.com:443","tgwhead":"tgw_l7_forward%0D%0AHost%3A+fua1xwy.app100645087.twsapp.com%3A443%0D%0A%0D%0A","name":"\u5251\u6307\u72c2\u6c99 \u539f11-20\u533a","desc":"\u6b63\u5e38","status":2,"zoneid":"49","merged":true,"old":[11,12,13,14,15,16,17,18,19,20,1]},"49":{"no":"49","id":"S49","url":"http:\/\/xwynew48.app100645087.twsapp.com","socket":"xwy49csr1.app100645087.twsapp.com:443","tgwhead":"tgw_l7_forward%0D%0AHost%3A+xwy49csr1.app100645087.twsapp.com%3A443%0D%0A%0D%0A","name":"\u9f99\u76d8\u864e\u8e1e48\u533a","desc":"\u6b63\u5e38","status":2,"zoneid":"48","merged":false},"48":{"no":"48","id":"S48","url":"http:\/\/xwynew47.app100645087.twsapp.com","socket":"xwy48csr1.app100645087.twsapp.com:443","tgwhead":"tgw_l7_forward%0D%0AHost%3A+xwy48csr1.app100645087.twsapp.com%3A443%0D%0A%0D%0A","name":"\u661f\u843d\u4e5d\u592947\u533a","desc":"\u6b63\u5e38","status":2,"zoneid":"47","merged":false},"47":{"no":"47","id":"S47","url":"http:\/\/xwynew46.app100645087.twsapp.com","socket":"xwy47csr1.app100645087.twsapp.com:443","tgwhead":"tgw_l7_forward%0D%0AHost%3A+xwy47csr1.app100645087.twsapp.com%3A443%0D%0A%0D%0A","name":"\u4e58\u98ce\u7834\u6d6a46\u533a","desc":"\u6b63\u5e38","status":2,"zoneid":"46","merged":false},"46":{"no":"46","id":"S46","url":"http:\/\/xwynew45.app100645087.twsapp.com","socket":"xwy46csr1.app100645087.twsapp.com:443","tgwhead":"tgw_l7_forward%0D%0AHost%3A+xwy46csr1.app100645087.twsapp.com%3A443%0D%0A%0D%0A","name":"\u6218\u65e0\u4e0d\u80dc45\u533a","desc":"\u6b63\u5e38","status":2,"zoneid":"45","merged":false},"45":{"no":"45","id":"S45","url":"http:\/\/xwynew44.app100645087.twsapp.com","socket":"xwy45csr1.app100645087.twsapp.com:443","tgwhead":"tgw_l7_forward%0D%0AHost%3A+xwy45csr1.app100645087.twsapp.com%3A443%0D%0A%0D%0A","name":"\u6392\u5c71\u5012\u6d7744\u533a","desc":"\u6b63\u5e38","status":2,"zoneid":"44","merged":false},"44":{"no":"44","id":"S44","url":"http:\/\/xwynew43.app100645087.twsapp.com","socket":"xwy44csr1.app100645087.twsapp.com:443","tgwhead":"tgw_l7_forward%0D%0AHost%3A+xwy44csr1.app100645087.twsapp.com%3A443%0D%0A%0D%0A","name":"\u8bba\u5251\u79f0\u96c443\u533a","desc":"\u6b63\u5e38","status":2,"zoneid":"43","merged":false},"43":{"no":"43","id":"S43","url":"http:\/\/xwynew42.app100645087.twsapp.com","socket":"xwy43csr1.app100645087.twsapp.com:443","tgwhead":"tgw_l7_forward%0D%0AHost%3A+xwy43csr1.app100645087.twsapp.com%3A443%0D%0A%0D%0A","name":"\u6a2a\u626b\u5343\u519b42\u533a","desc":"\u6b63\u5e38","status":2,"zoneid":"42","merged":false},"42":{"no":"42","id":"S42","url":"http:\/\/xwynew41.app100645087.twsapp.com","socket":"xwy42csr1.app100645087.twsapp.com:443","tgwhead":"tgw_l7_forward%0D%0AHost%3A+xwy42csr1.app100645087.twsapp.com%3A443%0D%0A%0D%0A","name":"\u75be\u98ce\u8fc5\u9a7041\u533a","desc":"\u6b63\u5e38","status":2,"zoneid":"41","merged":false},"41":{"no":"41","id":"S41","url":"http:\/\/xwynew40.app100645087.twsapp.com","socket":"xwy41csr1.app100645087.twsapp.com:443","tgwhead":"tgw_l7_forward%0D%0AHost%3A+xwy41csr1.app100645087.twsapp.com%3A443%0D%0A%0D%0A","name":"\u795e\u9f99\u4fa0\u5f7140\u533a","desc":"\u6b63\u5e38","status":2,"zoneid":"40","merged":false},"1":{"no":"1","id":"S1","url":"http:\/\/app100645087.qzone.qzoneapp.com","socket":"xwycsrtest.app100645087.twsapp.com:80","tgwhead":"tgw_l7_forward%0D%0AHost%3A+xwycsrtest.app100645087.twsapp.com%3A80%0D%0A%0D%0A","name":"\u4fa0\u4e4b\u7269\u8bed1\u533a","desc":"\u6b63\u5e38","status":2,"zoneid":"0","merged":false}}}

	/**
	 * 换区- 获取区服数据
	 * 		
	 * 
	 * @param user
	 * @return
	 */
	public static String startApp(User user) {
		return user.send(
			"&ctl=index&act=home",
			null
		);
	}


	

	//public static const GET_EGG:Object = {ctl:"operator", act:"gethitegg"};
	//XmasItem.as: line 407: 	App.net.send(new HttpGetParams(PHPConsts.GET_EGG).getHttpString(), null, this.loadComplete);
	//
	/**
	 * 未知- 圣诞彩蛋
	 * @param user
	 * @return
	 */
	public static String getEgg(User user) {
		return user.send(
			"&ctl=operator&act=gethitegg",
			null
		);
	}


	//public static const XMAS_EGG:Object = {ctl:"operator", act:"hitegg"};
	//XmasItem.as: line 314: 	App.net.send(new HttpGetParams(PHPConsts.XMAS_EGG).getHttpString(), {eggid:param1}, _loc_2, null, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.checkEgg, [param1]);
	//

	/**
	 * 圣诞彩蛋，  1-3
	 * @param user
	 * @return
	 */
	public static String xmasEgg(User user,int egg) {
		return user.send(
			"&ctl=operator&act=hitegg",
			"{\"eggid\":%d}",egg
		);
	}


	//public static const SPOON_GRUEL:Object = {ctl:"operator", act:"porridge"};
	//

	/**
	 * 未知
	 * @param user
	 * @return
	 */
	public static String spoonGruel(User user) {
		return user.send(
			"&ctl=operator&act=porridge",
			null
		);
	}


	//public static const INVITE:Object = {ctl:"index", act:"invite"};
	//MainUIManager.as: line 1230: 	App.net.send(new HttpGetParams(PHPConsts.INVITE).getHttpString(), {openids:_loc_2}).jumpOutOfQueue();
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_noopenids"}

	/**
	 * 邀请朋友
	 * @param user
	 * @return
	 */
	public static String invite(User user,String openId) {
		return user.send(
			"&ctl=index&act=invite",
			"{\"openids\":\"%s\"}",openId
		);
	}


	//public static const FACEBOOKFAVORITE:Object = {ctl:"sina", act:"favorite"};
	//FacebookFavorite.as: line 80: 	App.net.send(new HttpGetParams(PHPConsts.FACEBOOKFAVORITE).getHttpString(), null, this.complete).dropPoint = stage.localToGlobal(new Point(this._btnReward.x, this._btnReward.y));
	//<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"><html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8" /><title> - </title><style>body {	font-size:76%;	font-family:"Lucida Grande", Verdana, Lucida, Arial, Helvetica, sans-serif;	background-color:#FEFEFE;	color:#333333;	margin:0;}a{color:#f60;}a:hover{text-decoration:none;}.dialogtitle {	margin-bottom:10px;	font-weight:bold;}.dialogContent {	padding:10px;}</style><link rel="stylesheet" href="style/dialog.css" /></head><body><div style="margin:100px auto;width:500px;"><table border="0" cellspacing="0" cellpadding="0" id="windowTable">	<tr>		<td colspan="2" class="td9TL"></td>		<td class="td9TC"></td>		<td colspan="2" class="td9TR"></td>	</tr>	<tr>		<td class="td9ML2"></td>		<td class="td9ML"></td>		<td class="td9MC" id="windowContent"><div>	<div class="dialogtitle"><div></div></div>    <div class="dialogContent">    	<div style="width:450px;">       	方法【favorite】未定义，请联系网站管理员。<br />		<div align="center" style="margin-top:10px;">    <a href="javascript:history.back();"></a>		</div>    	</div>    </div></div>               </td>		<td class="td9MR"></td>		<td class="td9MR2"></td>	</tr>	<tr>		<td colspan="2" class="td9BL"></td>		<td class="td9BC"></td>		<td colspan="2" class="td9BR"></td>	</tr></table></div></body></html>

	/**
	 * 收藏
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String facebookfavorite(User user) {
		return user.send(
			"&ctl=sina&act=favorite",
			null
		);
	}


	//public static const GET_ADDFAVORITEAW_ARDCTL:Object = {ctl:"operator", act:"getAddFavoriteAward"};
	//MainUIManager.as: line 1422: 	App.net.send(new HttpGetParams(PHPConsts.GET_ADDFAVORITEAW_ARDCTL).getHttpString(), null, this.onAddFavoriteSucc).dropPoint = new Point(400, 300);
	//

	/**
	 * 获取收藏奖励
	 * @param user
	 * @return
	 */
	public static String getAddfavoriteawArdctl(User user) {
		return user.send(
			"&ctl=operator&act=getAddFavoriteAward",
			null
		);
	}


	//public static const GET_SHAREDAWARD:Object = {ctl:"operator", act:"getSharedAward"};
	//MainUIManager.as: line 1434: 	App.net.send(new HttpGetParams(PHPConsts.GET_SHAREDAWARD).getHttpString(), null, this.onSharedAward).dropPoint = new Point(400, 300);
	//

	/**
	 * 分享奖励
	 * @param user
	 * @return
	 */
	public static String getSharedaward(User user) {
		return user.send(
			"&ctl=operator&act=getSharedAward",
			null
		);
	}


	//public static const GUIDE:Object = {ctl:"game", act:"saveguide"};
	//MainInfoMgr.as: line 226: 	App.net.send(new HttpGetParams(PHPConsts.GUIDE).getHttpString(), _loc_2);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_ser_err_rawdataerr"}
	
	/**
	 * 新手教程
	 * @param user
	 * @return
	 */
	public static String guide(User user) {
		return user.send(
			"&ctl=game&act=saveguide",
			"{\"step\":1}"
		);
	}


	//public static const LOGIN:Object = {ctl:"game", act:"roleinit"};
	//MainInfoMgr.as: line 140: 	App.net.send(new HttpGetParams(PHPConsts.LOGIN).getHttpString(), _loc_1, this.onRoleInfoLoaded, this.onLoginFail, "default", "default", "default", RequestType.GAME_LOAD);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_roleinitok","data":{"roleInfo":{"_cls":"roleInfo","id":"823947","level":"57","money":"25535941","gamepoint":"-20288","nimbus":"1888888","petfire":"petfire","petwater":"petwater","petwind":"petwind","petthunder":"petthunder","stamina":48,"nowstamina":47,"staminarecover":1,"laststaminatime":1405563184,"buystaminatimes":0,"maxbuystaminatimes":1,"writ":"writ","nowwrit":"0","writrecover":"0","basehouse":"basehouse","uid":"515EAD50D13AE5FCA98DE4D5021CA991","contribution":"0","guildid":"","kingchip":"2260","rwid":"1708146","locationid":"0","location":"basehouse","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/0750a6de80d4f8921c9851696e396f798be61d9631027362206871d536b3f656\/50","tinyurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/0750a6de80d4f8921c9851696e396f798be61d9631027362206871d536b3f656\/30","uname":"Te","gender":"\u7537","yellowvip":0,"yellowyearvip":0,"yellowviplevel":0,"exp":"1080606","nextexp":5099900,"addFavorite":"1","sharedTime":"1405550285","achieveId":"0","achieveExpire":"0","vip":"0","totalcostpoint":0,"firstcostpoint":"0","techpoint":"4919370","fatesoul":"580","resetedebosstimes":0,"lastgaintime":"1405563794","buygaintimes":0,"gaintimes":"3","trainposnum":2,"maxpeoplegaintimes":30,"peoplegainedtimes":"5","peoplegaincdtime":1364686842,"peoplegaintimes":3,"canbuyspa":1,"qliveness":0,"qopentimes":0,"maxarenatimes":10,"arenanum":10,"buyarenatimes":0,"arenacdtime":"1392539868","arenabufftimes":"0","arenabuffaddtime":0,"guidestep":"1","func":"map,pay,online,hero,bar,team,train,sign,strengthen,manor,gain,pack,raid,invite,activityCenter,yellowDiamond,yellowDiamondGift,giftCenter,mall,challenge,inter,farm,secretary,tower,worker,friend,people,tree,back,tech,guild,auto,spa,trade,tavern,rank,trans,rob,raid_max,fate,artifact,boss,groupBattle","lastlogintime":"1405547663","onlinetimes":"5","lastonlinetime":"1405547663","slogintimes":"3","sloginrecord":{"3":1},"signday":25,"buysigntimes":"0","totalsigntimes":17,"canbuysigntimes":5,"signrecord":{"2":1,"3":1,"5":1,"6":1,"11":1,"12":1,"13":1,"14":1,"16":1,"17":1,"18":1,"19":1,"21":1,"22":1,"23":1,"24":1,"25":1},"signboxrecord":{"1":1},"sharespaceweibo":"1","attentionspace":"1","listenweibo":"1","spaceweiboaward":"1","inviteinfo":[],"inviteaward":[],"renown":"145549","renownlevel":"20","lastharvesttime":"1405550410","luckystarcdtime":"1405586410","nowluckystar":"4","blesstimes":50,"maxblesstimes":50,"lastblesstime":"1370523015","blessrecord":[],"farmnum":9,"watertimes":0,"farmfield":[],"farmplantnum":"1","matchtimes":"10","matchcdtime":"1392540647","yellowvipnew":0,"yellowvipday":0,"transcdtime":"1405563838","transnum":5,"robcdtime":"1364440501","robnum":5,"getsertimes":"10","rescuetimes":5,"revolttimes":6,"redeemtimes":0,"serbuytimes":0,"askforhelptime":"0","sercdtime":"1373162374","rolebuff":[],"tradecdtime":0,"traincdtime":"1394329589","gmemtechlist":"","offlineawardtimes":"0","verified":"0","verifiedtype":"0","achievements":"0","identity":"0","viplevel":"0","sinapayendtime":1363714632,"sinawarriorendtime":1362937032,"petid":"0","levelspecialbuy":{"10":{"_cls":"levelspecialbuy","starttime":1369382160,"isfinish":0},"20":{"_cls":"levelspecialbuy","starttime":1369382160,"isfinish":0},"30":{"_cls":"levelspecialbuy","starttime":1369382160,"isfinish":0}},"stovelastgaintime":"1405563890","stovebuffexpiretime":"1392578141","stoveday":0,"stovetotalexp":6450,"stoveuptimes":1,"stovebufftype":"1","stovemaxexp":928908,"stovehourexp":12901,"stoveinittime":"1405563891","stoveisinit":"1","addtime":"1362505032","character":"0","challengepoint":"0","freeselectsextime":"0","itemsoullastchangetime":0,"itemsoulchangetimes":0,"itemsoullastchangepropertytime":0,"itemsoulchangepropertytimes":0,"itemidentifytimes":0,"favorited":"0","honour":"305","prestige":"0","financeid":0,"financebuytime":0,"financeloop":0,"financegainHash":[],"fundid":0,"fundbuytime":0,"fundgainhash":[]},"rwarriorList":[{"_cls":"warriorVo","id":"1708146","name":"Te","level":"57","warriorcfgid":"34","quality":6,"maxhp":60492,"hp":60492,"speed":"25","exp":"1080606","nextexp":5099900,"score":89285,"en":0,"maxen":15000,"enSpd":300,"attack":16435,"defence":13944,"skillattack":17655,"skilldefence":9296,"arrEquipedskill":["109","127","130","0"],"arrAllskillVo":{"109":{"_cls":"skillBase","slevel":"1","scfgid":109},"112":{"_cls":"skillBase","slevel":"1","scfgid":112},"127":{"_cls":"skillBase","slevel":"1","scfgid":127},"130":{"_cls":"skillBase","slevel":"1","scfgid":130},"1031":{"_cls":"skillBase","slevel":"1","scfgid":1031},"1030":{"_cls":"skillBase","slevel":"1","scfgid":1030},"6":{"_cls":"skillBase","slevel":"1","scfgid":6}},"con":4491,"constars":5,"conquality":5,"conquot":20,"str":2737,"strstars":1,"strquality":5,"strquot":16,"force":2981,"forcestars":1,"forcequality":5,"forcequot":16,"agi":4098,"agistars":1,"agiquality":6,"agiquot":21,"accuracy":0,"block":35,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":10,"antisubattack":10,"antisubdefence":10,"antiunskill":10,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":"36747776","2":"36747830","3":"37171152","4":"292818426"},"artiItem":{"1":0,"2":0,"3":0,"4":"148410636"},"fateItem":{"1":0,"2":0,"3":0,"4":0,"5":0},"friendship":"0","shiplevel":"1","type":"rwarrior","attackprior":2620,"jobtype":"wtype","internode":-1,"vigour":"90407","totalvigour":"554707","loopinternode":-1,"loopintertimes":0,"talknum":0,"equipedItemInfo":null,"arrUnlockedskin":[3,4],"skinid":4,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":5700,"alchemy_limit_con":5700,"alchemy_limit_force":5700,"alchemy_limit_str":5700,"resetnamenum":"0"},{"_cls":"warriorVo","id":"1708312","name":"\u949f\u7075","level":"38","warriorcfgid":"3","quality":2,"maxhp":14004,"hp":14004,"speed":15,"exp":"467265","nextexp":541760,"score":32895,"en":0,"maxen":9000,"enSpd":300,"attack":6220,"defence":3447,"skillattack":7545,"skilldefence":2298,"arrEquipedskill":[16,1,0,0],"arrAllskillVo":{"16":{"_cls":"skillBase","slevel":"1","scfgid":16},"1":{"_cls":"skillBase","slevel":"1","scfgid":1},"1009":{"_cls":"skillBase","slevel":"1","scfgid":1009},"1024":{"_cls":"skillBase","slevel":"1","scfgid":1024}},"con":617,"constars":4,"conquality":1,"conquot":6.6,"str":694,"strstars":1,"strquality":2,"strquot":7.2,"force":879,"forcestars":4,"forcequality":2,"forcequot":8.2,"agi":599,"agistars":1,"agiquality":2,"agiquot":7,"accuracy":0,"block":10,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":10,"antisubattack":10,"antisubdefence":10,"antiunskill":10,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":"34101430","2":"33432012","3":"36747893","4":"34104918"},"artiItem":{"1":0,"2":0,"3":0,"4":0},"fateItem":{"1":0,"2":0,"3":0},"friendship":"0","shiplevel":"4","type":"rwarrior","attackprior":1480,"jobtype":"wtype","internode":"10","vigour":"328","totalvigour":"4128","loopinternode":-1,"loopintertimes":0,"talknum":0,"equipedItemInfo":null,"arrUnlockedskin":[1],"skinid":1,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":3800,"alchemy_limit_con":3800,"alchemy_limit_force":3800,"alchemy_limit_str":3800,"resetnamenum":"0"},{"_cls":"warriorVo","id":"1708467","name":"\u6728\u5a49\u6e05","level":"38","warriorcfgid":"4","quality":2,"maxhp":17330,"hp":17330,"speed":15,"exp":"467265","nextexp":541760,"score":35095,"en":0,"maxen":9000,"enSpd":300,"attack":7445,"defence":3399,"skillattack":7115,"skilldefence":2266,"arrEquipedskill":[17,2,0,0],"arrAllskillVo":{"17":{"_cls":"skillBase","slevel":"1","scfgid":17},"2":{"_cls":"skillBase","slevel":"1","scfgid":2},"1010":{"_cls":"skillBase","slevel":"1","scfgid":1010},"1025":{"_cls":"skillBase","slevel":"1","scfgid":1025}},"con":790,"constars":1,"conquality":2,"conquot":7.2,"str":879,"strstars":4,"strquality":2,"strquot":8.2,"force":873,"forcestars":4,"forcequality":1,"forcequot":6.6,"agi":583,"agistars":4,"agiquality":1,"agiquot":6.6,"accuracy":10,"block":10,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":10,"antisubattack":10,"antisubdefence":10,"antiunskill":10,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":"37171149","2":"34101429","3":"33432014","4":"37171151"},"artiItem":{"1":0,"2":0,"3":0,"4":0},"fateItem":{"1":0,"2":0,"3":"280953597"},"friendship":"0","shiplevel":"4","type":"rwarrior","attackprior":1720,"jobtype":"wtype","internode":"10","vigour":"328","totalvigour":"4128","loopinternode":-1,"loopintertimes":0,"talknum":0,"equipedItemInfo":null,"arrUnlockedskin":[1],"skinid":1,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":3800,"alchemy_limit_con":3800,"alchemy_limit_force":3800,"alchemy_limit_str":3800,"resetnamenum":"0"},{"_cls":"warriorVo","id":"1901118","name":"\u6e38\u5766\u4e4b","level":"50","warriorcfgid":"6","quality":3,"maxhp":11640,"hp":11640,"speed":15,"exp":"1332330","nextexp":3264700,"score":27910,"en":0,"maxen":12000,"enSpd":300,"attack":5090,"defence":2982,"skillattack":6250,"skilldefence":1988,"arrEquipedskill":[22,4,0,0],"arrAllskillVo":{"22":{"_cls":"skillBase","slevel":"1","scfgid":22},"4":{"_cls":"skillBase","slevel":"1","scfgid":4},"1013":{"_cls":"skillBase","slevel":"1","scfgid":1013},"1028":{"_cls":"skillBase","slevel":"1","scfgid":1028}},"con":420,"constars":1,"conquality":2,"conquot":7,"str":468,"strstars":3,"strquality":2,"strquot":7.8,"force":540,"forcestars":1,"forcequality":3,"forcequot":9,"agi":444,"agistars":2,"agiquality":2,"agiquot":7.4,"accuracy":0,"block":10,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":10,"antisubattack":10,"antisubdefence":10,"antiunskill":10,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":0,"2":0,"3":0,"4":0},"artiItem":{"1":0,"2":0,"3":0,"4":0},"fateItem":{"1":0,"2":0,"3":0,"4":0,"5":0},"friendship":"405","shiplevel":"3","type":"rwarrior","attackprior":1000,"jobtype":"wtype","internode":"-1","vigour":"0","totalvigour":"0","loopinternode":-1,"loopintertimes":0,"talknum":0,"equipedItemInfo":null,"arrUnlockedskin":[1],"skinid":1,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":5000,"alchemy_limit_con":5000,"alchemy_limit_force":5000,"alchemy_limit_str":5000,"resetnamenum":"0"},{"_cls":"warriorVo","id":"3820059","name":"\u9e20\u6469\u667a","level":"1","warriorcfgid":"7","quality":3,"maxhp":7368,"hp":7368,"speed":15,"exp":"0","nextexp":640,"score":21420,"en":0,"maxen":12000,"enSpd":300,"attack":3720,"defence":1824,"skillattack":3040,"skilldefence":1216,"arrEquipedskill":[23,5,0,0],"arrAllskillVo":{"23":{"_cls":"skillBase","slevel":"1","scfgid":23},"5":{"_cls":"skillBase","slevel":"1","scfgid":5},"1007":{"_cls":"skillBase","slevel":"1","scfgid":1007},"1022":{"_cls":"skillBase","slevel":"1","scfgid":1022}},"con":64,"constars":3,"conquality":2,"conquot":7.8,"str":74,"strstars":1,"strquality":3,"strquot":9,"force":58,"forcestars":1,"forcequality":2,"forcequot":7,"agi":58,"agistars":1,"agiquality":2,"agiquot":7,"accuracy":10,"block":10,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":10,"antisubattack":10,"antisubdefence":10,"antiunskill":10,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":0,"2":0,"3":0,"4":0},"artiItem":{"1":0,"2":0,"3":0,"4":0},"fateItem":{"1":0,"2":0,"3":0},"friendship":"0","shiplevel":"4","type":"rwarrior","attackprior":20,"jobtype":"wtype","internode":-1,"vigour":"0","totalvigour":"0","loopinternode":-1,"loopintertimes":0,"talknum":0,"equipedItemInfo":null,"arrUnlockedskin":[1],"skinid":1,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":100,"alchemy_limit_con":100,"alchemy_limit_force":100,"alchemy_limit_str":100,"resetnamenum":"0"},{"_cls":"warriorVo","id":"1900988","name":"\u6155\u5bb9\u590d","level":"50","warriorcfgid":"8","quality":3,"maxhp":12780,"hp":12780,"speed":25,"exp":"489890","nextexp":3264700,"score":29610,"en":0,"maxen":12000,"enSpd":300,"attack":4845,"defence":3267,"skillattack":4845,"skilldefence":2978,"arrEquipedskill":[24,6,0,0],"arrAllskillVo":{"24":{"_cls":"skillBase","slevel":"1","scfgid":24},"6":{"_cls":"skillBase","slevel":"1","scfgid":6},"1005":{"_cls":"skillBase","slevel":"1","scfgid":1005},"1020":{"_cls":"skillBase","slevel":"1","scfgid":1020}},"con":515,"constars":5,"conquality":2,"conquot":8.6,"str":419,"strstars":1,"strquality":2,"strquot":7,"force":419,"forcestars":1,"forcequality":2,"forcequot":7,"agi":539,"agistars":1,"agiquality":3,"agiquot":9,"accuracy":0,"block":35,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":10,"antisubattack":10,"antisubdefence":10,"antiunskill":10,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":0,"2":0,"3":0,"4":0},"artiItem":{"1":0,"2":0,"3":0,"4":0},"fateItem":{"1":0,"2":0,"3":0,"4":0,"5":0},"friendship":"10","shiplevel":"4","type":"rwarrior","attackprior":1000,"jobtype":"wtype","internode":"-1","vigour":"0","totalvigour":"0","loopinternode":-1,"loopintertimes":0,"talknum":0,"equipedItemInfo":null,"arrUnlockedskin":[1],"skinid":1,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":5000,"alchemy_limit_con":5000,"alchemy_limit_force":5000,"alchemy_limit_str":5000,"resetnamenum":"0"},{"_cls":"warriorVo","id":"3820046","name":"sb","level":"25","warriorcfgid":"9","quality":4,"maxhp":15816,"hp":15816,"speed":15,"exp":"30830","nextexp":65250,"score":34965,"en":0,"maxen":6000,"enSpd":300,"attack":7815,"defence":3153,"skillattack":5255,"skilldefence":2102,"arrEquipedskill":[19,7,0,0],"arrAllskillVo":{"19":{"_cls":"skillBase","slevel":"1","scfgid":19},"7":{"_cls":"skillBase","slevel":"1","scfgid":7},"1015":{"_cls":"skillBase","slevel":"1","scfgid":1015},"1000":{"_cls":"skillBase","slevel":"1","scfgid":1000}},"con":768,"constars":3,"conquality":3,"conquot":10.2,"str":833,"strstars":1,"strquality":4,"strquot":12,"force":501,"forcestars":1,"forcequality":3,"forcequot":9,"agi":501,"agistars":1,"agiquality":3,"agiquot":9,"accuracy":10,"block":10,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":10,"antisubattack":10,"antisubdefence":10,"antiunskill":10,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":"287556865","2":"280837810","3":0,"4":"0"},"artiItem":{"1":0,"2":0,"3":0,"4":0},"fateItem":{"1":0,"2":0,"3":0},"friendship":"1690","shiplevel":"4","type":"rwarrior","attackprior":700,"jobtype":"wtype","internode":"-1","vigour":"56043","totalvigour":"56043","loopinternode":-1,"loopintertimes":0,"talknum":0,"equipedItemInfo":null,"arrUnlockedskin":[1],"skinid":1,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":2500,"alchemy_limit_con":2500,"alchemy_limit_force":2500,"alchemy_limit_str":2500,"resetnamenum":"1"},{"_cls":"warriorVo","id":"3820047","name":"\u4e54\u5cf0","level":"38","warriorcfgid":"10","quality":4,"maxhp":18012,"hp":18012,"speed":25,"exp":"477743","nextexp":541760,"score":33530,"en":0,"maxen":6000,"enSpd":300,"attack":6940,"defence":3918,"skillattack":5805,"skilldefence":2612,"arrEquipedskill":[20,8,0,0],"arrAllskillVo":{"20":{"_cls":"skillBase","slevel":"1","scfgid":20},"8":{"_cls":"skillBase","slevel":"1","scfgid":8},"1014":{"_cls":"skillBase","slevel":"1","scfgid":1014},"1029":{"_cls":"skillBase","slevel":"1","scfgid":1029}},"con":951,"constars":5,"conquality":3,"conquot":11.4,"str":838,"strstars":1,"strquality":3,"strquot":9,"force":611,"forcestars":1,"forcequality":3,"forcequot":9,"agi":756,"agistars":1,"agiquality":4,"agiquot":12,"accuracy":0,"block":35,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":10,"antisubattack":10,"antisubdefence":10,"antiunskill":10,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":"280837808","2":"280837738","3":0,"4":0},"artiItem":{"1":0,"2":0,"3":0,"4":0},"fateItem":{"1":0,"2":0,"3":0},"friendship":"15","shiplevel":"2","type":"rwarrior","attackprior":960,"jobtype":"wtype","internode":"-1","vigour":"0","totalvigour":"0","loopinternode":-1,"loopintertimes":0,"talknum":0,"equipedItemInfo":null,"arrUnlockedskin":[1],"skinid":1,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":3800,"alchemy_limit_con":3800,"alchemy_limit_force":3800,"alchemy_limit_str":3800,"resetnamenum":"0"},{"_cls":"warriorVo","id":"3820045","name":"\u865a\u7af9","level":"39","warriorcfgid":"11","quality":4,"maxhp":17688,"hp":17688,"speed":15,"exp":"43583","nextexp":601250,"score":38995,"en":0,"maxen":6000,"enSpd":300,"attack":9055,"defence":4626,"skillattack":8110,"skilldefence":3084,"arrEquipedskill":[21,9,0,0],"arrAllskillVo":{"21":{"_cls":"skillBase","slevel":"1","scfgid":21},"9":{"_cls":"skillBase","slevel":"1","scfgid":9},"1003":{"_cls":"skillBase","slevel":"1","scfgid":1003},"1018":{"_cls":"skillBase","slevel":"1","scfgid":1018}},"con":924,"constars":1,"conquality":3,"conquot":9,"str":1261,"strstars":3,"strquality":3,"strquot":10.2,"force":1072,"forcestars":1,"forcequality":4,"forcequot":12,"agi":992,"agistars":2,"agiquality":3,"agiquot":9.6,"accuracy":0,"block":10,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":10,"antisubattack":10,"antisubdefence":10,"antiunskill":10,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":"280837807","2":"37171150","3":"34526304","4":"280837805"},"artiItem":{"1":0,"2":0,"3":0,"4":"0"},"fateItem":{"1":0,"2":0,"3":0},"friendship":"0","shiplevel":"2","type":"rwarrior","attackprior":1562,"jobtype":"wtype","internode":"-1","vigour":"0","totalvigour":"0","loopinternode":-1,"loopintertimes":0,"talknum":0,"equipedItemInfo":null,"arrUnlockedskin":[1],"skinid":1,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":3900,"alchemy_limit_con":3900,"alchemy_limit_force":3900,"alchemy_limit_str":3900,"resetnamenum":"0"}],"rwarriorgroupList":[{"_cls":"warriorgroupVo","monsters":["1708146","-1","1708467","1708312","-1","-1"],"rwgId":0},{"_cls":"warriorgroupVo","monsters":[],"rwgId":1}],"rquestList":[{"_cls":"questItem","id":"50","questcfgid":"50","gotnum":3,"gotaward":0},{"_cls":"questItem","id":"51","questcfgid":"51","gotnum":0,"gotaward":0},{"_cls":"questItem","id":"53","questcfgid":"53","gotnum":0,"gotaward":0},{"_cls":"questItem","id":"54","questcfgid":"54","gotnum":0,"gotaward":0},{"_cls":"questItem","id":"55","questcfgid":"55","gotnum":0,"gotaward":0},{"_cls":"questItem","id":"56","questcfgid":"56","gotnum":0,"gotaward":0},{"_cls":"questItem","id":"57","questcfgid":"57","gotnum":0,"gotaward":0},{"_cls":"questItem","id":"63","questcfgid":"63","gotnum":0,"gotaward":0},{"_cls":"questItem","id":"64","questcfgid":"64","gotnum":0,"gotaward":0},{"_cls":"questItem","id":"66","questcfgid":"66","gotnum":0,"gotaward":0},{"_cls":"questItem","id":"67","questcfgid":"67","gotnum":0,"gotaward":0},{"_cls":"questItem","id":"68","questcfgid":"68","gotnum":0,"gotaward":0},{"_cls":"questItem","id":"69","questcfgid":"69","gotnum":0,"gotaward":0},{"_cls":"questItem","id":"73","questcfgid":"73","gotnum":0,"gotaward":0},{"_cls":"questItem","id":"74","questcfgid":"74","gotnum":0,"gotaward":0},{"_cls":"questItem","id":180,"questcfgid":180,"gotnum":0,"gotaward":"0"},{"_cls":"questItem","id":181,"questcfgid":181,"gotnum":0,"gotaward":"0"},{"_cls":"questItem","id":"280","questcfgid":"280","gotnum":0,"gotaward":"0"},{"_cls":"questItem","id":"298","questcfgid":"298","gotnum":1,"gotaward":"0"},{"_cls":"questItem","id":"342","questcfgid":"342","gotnum":0,"gotaward":"0"},{"_cls":"questItem","id":"387","questcfgid":"387","gotnum":0,"gotaward":"0"},{"_cls":"questItem","id":"390","questcfgid":"390","gotnum":1,"gotaward":"0"},{"_cls":"questItem","id":"391","questcfgid":"391","gotnum":0,"gotaward":"0"},{"_cls":"questItem","id":"392","questcfgid":"392","gotnum":0,"gotaward":"0"},{"_cls":"questItem","id":"393","questcfgid":"393","gotnum":0,"gotaward":"0"},{"_cls":"questItem","id":"394","questcfgid":"394","gotnum":1,"gotaward":"0"},{"_cls":"questItem","id":"395","questcfgid":"395","gotnum":3,"gotaward":"0"},{"_cls":"questItem","id":"396","questcfgid":"396","gotnum":0,"gotaward":"0"},{"_cls":"questItem","id":453,"questcfgid":453,"gotnum":0,"gotaward":"0"},{"_cls":"questItem","id":454,"questcfgid":454,"gotnum":0,"gotaward":"0"},{"_cls":"questItem","id":455,"questcfgid":455,"gotnum":0,"gotaward":"0"},{"_cls":"questItem","id":456,"questcfgid":456,"gotnum":0,"gotaward":"0"},{"_cls":"questItem","id":457,"questcfgid":457,"gotnum":0,"gotaward":"0"},{"_cls":"questItem","id":458,"questcfgid":458,"gotnum":0,"gotaward":"0"},{"_cls":"questItem","id":459,"questcfgid":459,"gotnum":0,"gotaward":"0"},{"_cls":"questItem","id":460,"questcfgid":460,"gotnum":0,"gotaward":"0"},{"_cls":"questItem","id":461,"questcfgid":461,"gotnum":0,"gotaward":"0"},{"_cls":"questItem","id":462,"questcfgid":462,"gotnum":0,"gotaward":"0"},{"_cls":"questItem","id":"535","questcfgid":"535","gotnum":0,"gotaward":"0"},{"_cls":"questItem","id":"579","questcfgid":"579","gotnum":1,"gotaward":"0"},{"_cls":"questItem","id":"611","questcfgid":"611","gotnum":0,"gotaward":"0"},{"_cls":"questItem","id":"617","questcfgid":"617","gotnum":0,"gotaward":"0"}],"rstrangerList":[{"_cls":"rolebaseInfo","id":"306050","level":"67","uid":"905D2B9883B339E839C951BCE3FCC578","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/498fe6b75281db14063f0795a8e0e0cef37aaedb4afa23dfb23ddf0ed3599c82\/50","tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/498fe6b75281db14063f0795a8e0e0cef37aaedb4afa23dfb23ddf0ed3599c82\/30","uname":"%E8%B0%A2%E8%B0%A2%E4%BD%A0%E7%9A%84%E4%BB%8E%E5%89%8D%E3%80%81","gender":"\u7537","rwcfgid":"32","power":1153988,"isfriend":"isfriend","serstat":"serstat","yellowvip":1,"yellowyearvip":1,"yellowviplevel":7,"nowluckystar":"20","canbless":"0","canfire":"1","isonline":"0"},{"_cls":"rolebaseInfo","id":"698134","level":"70","uid":"80818085B447C0711D2246D123402B36","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/c3c8a59edd4f35dc7f0f8d2bb4710a1d9fddac618083cf801bb0cabf199d83ad\/50","tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/c3c8a59edd4f35dc7f0f8d2bb4710a1d9fddac618083cf801bb0cabf199d83ad\/30","uname":"%E5%9D%8F%E5%9D%8Fde%E5%A8%83%E5%A8%83","gender":"\u7537","rwcfgid":"35","power":1908650,"isfriend":"isfriend","serstat":"serstat","yellowvip":0,"yellowyearvip":0,"yellowviplevel":0,"nowluckystar":"20","canbless":"0","canfire":"1","isonline":"0"},{"_cls":"rolebaseInfo","id":"1017091","level":"70","uid":"84F8861334538BFB8D5272F028B6EDE8","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/664dc5021a4d268399e93e0a8e837970db80f2d629d9346e5aaa325f8eb8fe72\/50","tinyurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/664dc5021a4d268399e93e0a8e837970db80f2d629d9346e5aaa325f8eb8fe72\/30","uname":"%EF%BC%AAu.s%EF%BC%B4.%20%EF%BC%B3o","gender":"\u7537","rwcfgid":"37","power":2385322,"isfriend":"isfriend","serstat":"serstat","yellowvip":1,"yellowyearvip":1,"yellowviplevel":7,"nowluckystar":"20","canbless":"0","canfire":"1","isonline":"0"},{"_cls":"rolebaseInfo","id":"1060281","level":"52","uid":"14F59177902EB6D7A0680B3C4B813FDF","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/e1dc46739944d5f4b08cb882084d6f876364713facea00c6eac3d7f17dc0a270\/50","tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/e1dc46739944d5f4b08cb882084d6f876364713facea00c6eac3d7f17dc0a270\/30","uname":"da","gender":"\u7537","rwcfgid":"19","power":74460,"isfriend":"isfriend","serstat":"serstat","yellowvip":0,"yellowyearvip":0,"yellowviplevel":0,"nowluckystar":"20","canbless":"0","canfire":"1","isonline":"0"},{"_cls":"rolebaseInfo","id":"1174285","level":"70","uid":"434658BF2EADA041C10EB638DE2C139B","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/d8219673598dbd6f3f49f1703c94ed1b0b6797ba0336d103b609ebb940874ce3\/50","tinyurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/d8219673598dbd6f3f49f1703c94ed1b0b6797ba0336d103b609ebb940874ce3\/30","uname":"%E4%BD%9B%E6%B4%9B%E4%BE%9D%E5%BE%B7","gender":"\u5973","rwcfgid":"37","power":2416922,"isfriend":"isfriend","serstat":"serstat","yellowvip":1,"yellowyearvip":0,"yellowviplevel":4,"nowluckystar":"20","canbless":"0","canfire":"1","isonline":"0"},{"_cls":"rolebaseInfo","id":"1547782","level":"70","uid":"C3FCF08777C570A2B4314970E5E16159","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/26230775a2f28191d1a4e661f7090bd1dfbd8740aea6084ce548a4436d48b5f0\/50","tinyurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/26230775a2f28191d1a4e661f7090bd1dfbd8740aea6084ce548a4436d48b5f0\/30","uname":"X6","gender":"\u7537","rwcfgid":"33","power":1980363,"isfriend":"isfriend","serstat":"serstat","yellowvip":0,"yellowyearvip":0,"yellowviplevel":0,"nowluckystar":"15","canbless":"0","canfire":"1","isonline":"0"}],"rbagitemList":[{"_cls":"rbagitemVo2","id":311335991,"itemcfgid":894,"num":50,"arrSellaward":[]},{"_cls":"rbagitemVo2","id":258428303,"itemcfgid":849,"num":10,"arrSellaward":[]},{"_cls":"rbagitemVo6","id":280953575,"itemcfgid":540,"num":1,"arrSellaward":[],"fatelevelproperty":null,"nextfatepropertylist":[{"property":"maxhp","valuetype":0,"propertyvalue":2500}],"level":1,"isfit":0,"score":"0","rwarriorId":"0"},{"_cls":"rbagitemVo2","id":34541117,"itemcfgid":439,"num":2,"arrSellaward":[]},{"_cls":"rbagitemVo5","id":148410636,"itemcfgid":525,"num":7,"arrSellaward":[],"effectvalue":410,"nexteffectvalue":440,"level":7,"isfit":1,"score":2050,"rwarriorId":1708146,"talismanCombo":[],"talismanInfo":[797],"openhole":"0"},{"_cls":"rbagitemVo2","id":34532346,"itemcfgid":450,"num":3,"arrSellaward":[]},{"_cls":"rbagitemVo4","id":211976366,"itemcfgid":340,"num":22,"arrSellaward":[]},{"_cls":"rbagitemVo3","id":144002272,"itemcfgid":134,"num":25,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":10,"sub":"0"}]},{"_cls":"rbagitemVo4","id":227749987,"itemcfgid":271,"num":34,"arrSellaward":[]},{"_cls":"rbagitemVo4","id":103982274,"itemcfgid":341,"num":10,"arrSellaward":[]},{"_cls":"rbagitemVo6","id":280953581,"itemcfgid":541,"num":1,"arrSellaward":[],"fatelevelproperty":null,"nextfatepropertylist":[{"property":"attack","valuetype":0,"propertyvalue":300}],"level":1,"isfit":0,"score":"0","rwarriorId":"0"},{"_cls":"rbagitemVo3","id":146320892,"itemcfgid":176,"num":10,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":10,"sub":"0"}]},{"_cls":"rbagitemVo1","id":34101430,"itemcfgid":53,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1365095,"sub":"0"}],"equipopenhole":2,"effectvalue":311,"nexteffectvalue":316,"level":40,"isfit":1,"score":1555,"rwarriorId":1708312,"arrEquipedstone":null,"upprice":1364490,"attackprior":200,"nextattackprior":204,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo2","id":45635462,"itemcfgid":203,"num":1,"arrSellaward":[]},{"_cls":"rbagitemVo2","id":278173759,"itemcfgid":885,"num":6,"arrSellaward":[]},{"_cls":"rbagitemVo2","id":311335988,"itemcfgid":468,"num":1,"arrSellaward":[]},{"_cls":"rbagitemVo6","id":280953603,"itemcfgid":549,"num":1,"arrSellaward":[],"fatelevelproperty":null,"nextfatepropertylist":[{"property":"skilldefence","valuetype":0,"propertyvalue":600}],"level":1,"isfit":0,"score":"0","rwarriorId":"0"},{"_cls":"rbagitemVo4","id":277769556,"itemcfgid":275,"num":2,"arrSellaward":[]},{"_cls":"rbagitemVo1","id":287556865,"itemcfgid":29,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":910235,"sub":"0"}],"equipopenhole":1,"effectvalue":214,"nexteffectvalue":218,"level":40,"isfit":1,"score":1070,"rwarriorId":3820046,"arrEquipedstone":null,"upprice":909665,"attackprior":100,"nextattackprior":102,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo2","id":51122301,"itemcfgid":613,"num":110,"arrSellaward":[]},{"_cls":"rbagitemVo6","id":280953579,"itemcfgid":542,"num":1,"arrSellaward":[],"fatelevelproperty":null,"nextfatepropertylist":[{"property":"defence","valuetype":0,"propertyvalue":300}],"level":1,"isfit":0,"score":"0","rwarriorId":"0"},{"_cls":"rbagitemVo6","id":280953599,"itemcfgid":548,"num":1,"arrSellaward":[],"fatelevelproperty":null,"nextfatepropertylist":[{"property":"skillattack","valuetype":0,"propertyvalue":600}],"level":1,"isfit":0,"score":"0","rwarriorId":"0"},{"_cls":"rbagitemVo2","id":144002271,"itemcfgid":777,"num":89,"arrSellaward":[]},{"_cls":"rbagitemVo1","id":37171150,"itemcfgid":38,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":2317329,"sub":"0"}],"equipopenhole":1,"effectvalue":538,"nexteffectvalue":546,"level":51,"isfit":1,"score":2690,"rwarriorId":3820045,"arrEquipedstone":null,"upprice":2315779,"attackprior":322,"nextattackprior":324,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo6","id":280953597,"itemcfgid":540,"num":1,"arrSellaward":[],"fatelevelproperty":null,"nextfatepropertylist":[{"property":"maxhp","valuetype":0,"propertyvalue":2500}],"level":1,"isfit":1,"score":"0","rwarriorId":1708467},{"_cls":"rbagitemVo2","id":144002276,"itemcfgid":200,"num":26,"arrSellaward":[]},{"_cls":"rbagitemVo2","id":144002283,"itemcfgid":199,"num":8,"arrSellaward":[]},{"_cls":"rbagitemVo3","id":292818408,"itemcfgid":353,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":500,"sub":"0"}]},{"_cls":"rbagitemVo6","id":280953602,"itemcfgid":542,"num":1,"arrSellaward":[],"fatelevelproperty":null,"nextfatepropertylist":[{"property":"defence","valuetype":0,"propertyvalue":300}],"level":1,"isfit":0,"score":"0","rwarriorId":"0"},{"_cls":"rbagitemVo3","id":146320536,"itemcfgid":184,"num":13,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":10,"sub":"0"}]},{"_cls":"rbagitemVo4","id":103982300,"itemcfgid":337,"num":26,"arrSellaward":[]},{"_cls":"rbagitemVo2","id":51122331,"itemcfgid":198,"num":1,"arrSellaward":[]},{"_cls":"rbagitemVo2","id":311335989,"itemcfgid":779,"num":11,"arrSellaward":[]},{"_cls":"rbagitemVo2","id":271791227,"itemcfgid":883,"num":7,"arrSellaward":[]},{"_cls":"rbagitemVo13","id":288668391,"itemcfgid":797,"num":1,"arrSellaward":[]},{"_cls":"rbagitemVo2","id":83962017,"itemcfgid":244,"num":15,"arrSellaward":[]},{"_cls":"rbagitemVo1","id":33432012,"itemcfgid":34,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":910655,"sub":"0"}],"equipopenhole":1,"effectvalue":278,"nexteffectvalue":283,"level":40,"isfit":1,"score":1390,"rwarriorId":1708312,"arrEquipedstone":null,"upprice":909665,"attackprior":160,"nextattackprior":162,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo4","id":41674073,"itemcfgid":261,"num":426,"arrSellaward":[]},{"_cls":"rbagitemVo2","id":144002274,"itemcfgid":200,"num":264,"arrSellaward":[]},{"_cls":"rbagitemVo1","id":280837807,"itemcfgid":29,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":3057704,"sub":"0"}],"equipopenhole":1,"effectvalue":274,"nexteffectvalue":278,"level":55,"isfit":1,"score":1370,"rwarriorId":3820045,"arrEquipedstone":null,"upprice":3057134,"attackprior":130,"nextattackprior":132,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo3","id":146320893,"itemcfgid":179,"num":81,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":10,"sub":"0"}]},{"_cls":"rbagitemVo6","id":280953574,"itemcfgid":542,"num":1,"arrSellaward":[],"fatelevelproperty":null,"nextfatepropertylist":[{"property":"defence","valuetype":0,"propertyvalue":300}],"level":1,"isfit":0,"score":"0","rwarriorId":"0"},{"_cls":"rbagitemVo1","id":280837809,"itemcfgid":30,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":910235,"sub":"0"}],"equipopenhole":1,"effectvalue":214,"nexteffectvalue":218,"level":40,"isfit":0,"score":1070,"rwarriorId":0,"arrEquipedstone":null,"upprice":909665,"attackprior":100,"nextattackprior":102,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo2","id":45635461,"itemcfgid":196,"num":2,"arrSellaward":[]},{"_cls":"rbagitemVo4","id":277769544,"itemcfgid":270,"num":3,"arrSellaward":[]},{"_cls":"rbagitemVo3","id":146320601,"itemcfgid":172,"num":2,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":10,"sub":"0"}]},{"_cls":"rbagitemVo3","id":33158812,"itemcfgid":127,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":10,"sub":"0"}]},{"_cls":"rbagitemVo4","id":220534556,"itemcfgid":338,"num":35,"arrSellaward":[]},{"_cls":"rbagitemVo3","id":146320600,"itemcfgid":172,"num":2,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":10,"sub":"0"}]},{"_cls":"rbagitemVo3","id":146320595,"itemcfgid":171,"num":18,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":10,"sub":"0"}]},{"_cls":"rbagitemVo2","id":280835809,"itemcfgid":218,"num":0.78,"arrSellaward":[]},{"_cls":"rbagitemVo4","id":42525715,"itemcfgid":262,"num":124,"arrSellaward":[]},{"_cls":"rbagitemVo3","id":146320596,"itemcfgid":168,"num":10,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":10,"sub":"0"}]},{"_cls":"rbagitemVo5","id":293047457,"itemcfgid":526,"num":1,"arrSellaward":[],"effectvalue":200,"nexteffectvalue":230,"level":0,"isfit":0,"score":1000,"rwarriorId":"0","talismanCombo":null,"talismanInfo":null,"openhole":"0"},{"_cls":"rbagitemVo2","id":144002270,"itemcfgid":187,"num":326,"arrSellaward":[]},{"_cls":"rbagitemVo1","id":34101429,"itemcfgid":54,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1365095,"sub":"0"}],"equipopenhole":2,"effectvalue":311,"nexteffectvalue":316,"level":40,"isfit":1,"score":1555,"rwarriorId":1708467,"arrEquipedstone":null,"upprice":1364490,"attackprior":200,"nextattackprior":204,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo2","id":144002282,"itemcfgid":242,"num":7,"arrSellaward":[]},{"_cls":"rbagitemVo1","id":33432014,"itemcfgid":36,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":910655,"sub":"0"}],"equipopenhole":1,"effectvalue":278,"nexteffectvalue":283,"level":40,"isfit":1,"score":1390,"rwarriorId":1708467,"arrEquipedstone":null,"upprice":909665,"attackprior":160,"nextattackprior":162,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo3","id":144002281,"itemcfgid":133,"num":29,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":10,"sub":"0"}]},{"_cls":"rbagitemVo1","id":36747893,"itemcfgid":36,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":910655,"sub":"0"}],"equipopenhole":1,"effectvalue":278,"nexteffectvalue":283,"level":40,"isfit":1,"score":1390,"rwarriorId":1708312,"arrEquipedstone":null,"upprice":909665,"attackprior":160,"nextattackprior":162,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":37171149,"itemcfgid":37,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":911215,"sub":"0"}],"equipopenhole":1,"effectvalue":450,"nexteffectvalue":458,"level":40,"isfit":1,"score":2250,"rwarriorId":1708467,"arrEquipedstone":[],"upprice":909665,"attackprior":300,"nextattackprior":302,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo2","id":47123362,"itemcfgid":197,"num":4,"arrSellaward":[]},{"_cls":"rbagitemVo1","id":280837805,"itemcfgid":31,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":3057704,"sub":"0"}],"equipopenhole":1,"effectvalue":274,"nexteffectvalue":278,"level":55,"isfit":1,"score":1370,"rwarriorId":3820045,"arrEquipedstone":null,"upprice":3057134,"attackprior":130,"nextattackprior":132,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo2","id":34541177,"itemcfgid":253,"num":4,"arrSellaward":[]},{"_cls":"rbagitemVo6","id":280953578,"itemcfgid":540,"num":1,"arrSellaward":[],"fatelevelproperty":null,"nextfatepropertylist":[{"property":"maxhp","valuetype":0,"propertyvalue":2500}],"level":1,"isfit":0,"score":"0","rwarriorId":"0"},{"_cls":"rbagitemVo2","id":295871729,"itemcfgid":872,"num":4,"arrSellaward":[]},{"_cls":"rbagitemVo1","id":280837810,"itemcfgid":30,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":910235,"sub":"0"}],"equipopenhole":1,"effectvalue":214,"nexteffectvalue":218,"level":40,"isfit":1,"score":1070,"rwarriorId":3820046,"arrEquipedstone":null,"upprice":909665,"attackprior":100,"nextattackprior":102,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo6","id":280953600,"itemcfgid":544,"num":1,"arrSellaward":[],"fatelevelproperty":null,"nextfatepropertylist":[{"property":"skilldefence","valuetype":0,"propertyvalue":300}],"level":1,"isfit":0,"score":"0","rwarriorId":"0"},{"_cls":"rbagitemVo6","id":280953580,"itemcfgid":544,"num":1,"arrSellaward":[],"fatelevelproperty":null,"nextfatepropertylist":[{"property":"skilldefence","valuetype":0,"propertyvalue":300}],"level":1,"isfit":0,"score":"0","rwarriorId":"0"},{"_cls":"rbagitemVo3","id":33419998,"itemcfgid":128,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":10,"sub":"0"}]},{"_cls":"rbagitemVo4","id":115723626,"itemcfgid":339,"num":35,"arrSellaward":[]},{"_cls":"rbagitemVo4","id":101855243,"itemcfgid":264,"num":124,"arrSellaward":[]},{"_cls":"rbagitemVo2","id":272275049,"itemcfgid":240,"num":1,"arrSellaward":[]},{"_cls":"rbagitemVo2","id":253808189,"itemcfgid":847,"num":12,"arrSellaward":[]},{"_cls":"rbagitemVo2","id":144002284,"itemcfgid":616,"num":9,"arrSellaward":[]},{"_cls":"rbagitemVo2","id":276784537,"itemcfgid":862,"num":203,"arrSellaward":[]},{"_cls":"rbagitemVo1","id":37171152,"itemcfgid":40,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":911215,"sub":"0"}],"equipopenhole":1,"effectvalue":450,"nexteffectvalue":458,"level":40,"isfit":1,"score":2250,"rwarriorId":1708146,"arrEquipedstone":null,"upprice":909665,"attackprior":300,"nextattackprior":302,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo2","id":107076550,"itemcfgid":206,"num":1,"arrSellaward":[]},{"_cls":"rbagitemVo3","id":146320890,"itemcfgid":176,"num":105,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":10,"sub":"0"}]},{"_cls":"rbagitemVo3","id":33158811,"itemcfgid":126,"num":2,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":10,"sub":"0"}]},{"_cls":"rbagitemVo1","id":34526303,"itemcfgid":55,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1365095,"sub":"0"}],"equipopenhole":2,"effectvalue":311,"nexteffectvalue":316,"level":40,"isfit":0,"score":1555,"rwarriorId":0,"arrEquipedstone":null,"upprice":1364490,"attackprior":200,"nextattackprior":204,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo4","id":108795707,"itemcfgid":342,"num":10,"arrSellaward":[]},{"_cls":"rbagitemVo1","id":36747830,"itemcfgid":58,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1365535,"sub":"0"}],"equipopenhole":2,"effectvalue":379,"nexteffectvalue":385,"level":40,"isfit":1,"score":1895,"rwarriorId":1708146,"arrEquipedstone":null,"upprice":1364490,"attackprior":320,"nextattackprior":324,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":36747776,"itemcfgid":57,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1365535,"sub":"0"}],"equipopenhole":2,"effectvalue":379,"nexteffectvalue":385,"level":40,"isfit":1,"score":1895,"rwarriorId":1708146,"arrEquipedstone":null,"upprice":1364490,"attackprior":320,"nextattackprior":324,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo2","id":289211042,"itemcfgid":246,"num":2,"arrSellaward":[]},{"_cls":"rbagitemVo3","id":331025343,"itemcfgid":354,"num":8,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":500,"sub":"0"}]},{"_cls":"rbagitemVo3","id":292864784,"itemcfgid":373,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":500,"sub":"0"}]},{"_cls":"rbagitemVo3","id":33150504,"itemcfgid":125,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":10,"sub":"0"}]},{"_cls":"rbagitemVo2","id":144002285,"itemcfgid":204,"num":3,"arrSellaward":[]},{"_cls":"rbagitemVo2","id":144002273,"itemcfgid":189,"num":73,"arrSellaward":[]},{"_cls":"rbagitemVo1","id":34526304,"itemcfgid":56,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1365095,"sub":"0"}],"equipopenhole":2,"effectvalue":311,"nexteffectvalue":316,"level":40,"isfit":1,"score":1555,"rwarriorId":3820045,"arrEquipedstone":null,"upprice":1364490,"attackprior":200,"nextattackprior":204,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo6","id":280953601,"itemcfgid":542,"num":1,"arrSellaward":[],"fatelevelproperty":null,"nextfatepropertylist":[{"property":"defence","valuetype":0,"propertyvalue":300}],"level":1,"isfit":0,"score":"0","rwarriorId":"0"},{"_cls":"rbagitemVo4","id":108795716,"itemcfgid":343,"num":10,"arrSellaward":[]},{"_cls":"rbagitemVo13","id":288668445,"itemcfgid":798,"num":2,"arrSellaward":[]},{"_cls":"rbagitemVo3","id":146320891,"itemcfgid":176,"num":2,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":10,"sub":"0"}]},{"_cls":"rbagitemVo3","id":144002280,"itemcfgid":135,"num":21,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":10,"sub":"0"}]},{"_cls":"rbagitemVo4","id":73420858,"itemcfgid":260,"num":12632,"arrSellaward":[]},{"_cls":"rbagitemVo3","id":146320599,"itemcfgid":172,"num":11,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":10,"sub":"0"}]},{"_cls":"rbagitemVo2","id":144002275,"itemcfgid":200,"num":23,"arrSellaward":[]},{"_cls":"rbagitemVo1","id":280837808,"itemcfgid":29,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":910235,"sub":"0"}],"equipopenhole":1,"effectvalue":214,"nexteffectvalue":218,"level":40,"isfit":1,"score":1070,"rwarriorId":3820047,"arrEquipedstone":null,"upprice":909665,"attackprior":100,"nextattackprior":102,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo4","id":315363887,"itemcfgid":272,"num":1,"arrSellaward":[]},{"_cls":"rbagitemVo6","id":280953596,"itemcfgid":542,"num":1,"arrSellaward":[],"fatelevelproperty":null,"nextfatepropertylist":[{"property":"defence","valuetype":0,"propertyvalue":300}],"level":1,"isfit":0,"score":"0","rwarriorId":"0"},{"_cls":"rbagitemVo1","id":280837738,"itemcfgid":30,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":910235,"sub":"0"}],"equipopenhole":1,"effectvalue":214,"nexteffectvalue":218,"level":40,"isfit":1,"score":1070,"rwarriorId":3820047,"arrEquipedstone":null,"upprice":909665,"attackprior":100,"nextattackprior":102,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo3","id":146320597,"itemcfgid":171,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":10,"sub":"0"}]},{"_cls":"rbagitemVo4","id":101855265,"itemcfgid":263,"num":62,"arrSellaward":[]},{"_cls":"rbagitemVo3","id":146320889,"itemcfgid":175,"num":128,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":10,"sub":"0"}]},{"_cls":"rbagitemVo6","id":280953576,"itemcfgid":543,"num":1,"arrSellaward":[],"fatelevelproperty":null,"nextfatepropertylist":[{"property":"skillattack","valuetype":0,"propertyvalue":300}],"level":1,"isfit":0,"score":"0","rwarriorId":"0"},{"_cls":"rbagitemVo6","id":280953577,"itemcfgid":543,"num":1,"arrSellaward":[],"fatelevelproperty":null,"nextfatepropertylist":[{"property":"skillattack","valuetype":0,"propertyvalue":300}],"level":1,"isfit":0,"score":"0","rwarriorId":"0"},{"_cls":"rbagitemVo1","id":292818426,"itemcfgid":63,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1366130,"sub":"0"}],"equipopenhole":2,"effectvalue":558,"nexteffectvalue":567,"level":40,"isfit":1,"score":2790,"rwarriorId":1708146,"arrEquipedstone":null,"upprice":1364490,"attackprior":540,"nextattackprior":544,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":34104918,"itemcfgid":55,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1365095,"sub":"0"}],"equipopenhole":2,"effectvalue":311,"nexteffectvalue":316,"level":40,"isfit":1,"score":1555,"rwarriorId":1708312,"arrEquipedstone":null,"upprice":1364490,"attackprior":200,"nextattackprior":204,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo6","id":280953598,"itemcfgid":543,"num":1,"arrSellaward":[],"fatelevelproperty":null,"nextfatepropertylist":[{"property":"skillattack","valuetype":0,"propertyvalue":300}],"level":1,"isfit":0,"score":"0","rwarriorId":"0"},{"_cls":"rbagitemVo3","id":144002278,"itemcfgid":136,"num":33,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":10,"sub":"0"}]},{"_cls":"rbagitemVo4","id":101855226,"itemcfgid":344,"num":10,"arrSellaward":[]},{"_cls":"rbagitemVo1","id":37171151,"itemcfgid":39,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":911215,"sub":"0"}],"equipopenhole":1,"effectvalue":450,"nexteffectvalue":458,"level":40,"isfit":1,"score":2250,"rwarriorId":1708467,"arrEquipedstone":null,"upprice":909665,"attackprior":300,"nextattackprior":302,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo2","id":34108117,"itemcfgid":438,"num":1,"arrSellaward":[]}],"roperatorInfo":{"_cls":"roperatorInfo","hitegg":{"_cls":"hiteggInfo","christmascap":0},"porridge":null,"newyearbless":null,"lantern":{"_cls":"lanternInfo","mallet":0,"lanterncanshare":0},"fascination":null,"lottery":{"_cls":"lotteryInfo","lotterystat":0,"starttime":1362618660,"endtime":1363914660},"yellowshop":{"_cls":"yellowshopInfo","yellowshopcanbuy":1},"invite":{"_cls":"inviteInfo","invitenum":0,"inviteaward":[],"dayinvitenum":0,"dayinviteaward":[]},"token":"96"},"serverTime":1405564293,"_cls":"roleinitList"}}

	/**
	 * 获取登陆数据
	 * @param user
	 * @return
	 */
	public static String login(User user) {
		return user.send(
			"&ctl=game&act=roleinit",
			"{}"
		);
	}


	//public static const SAVE_GROUP:Object = {ctl:"rwarrior", act:"saverwgroup"};
	//TeamContPanel.as: line 153: 	App.net.send(new HttpGetParams(PHPConsts.SAVE_GROUP).getHttpString(), _loc_2, this.onSaveDone, this.onLoginFail);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_groupposerr"}

	/**
	 * 更换出场侠客位置
	 * @param user
	 * @return
	 */
	public static String saveGroup(User user, String groupString) {
		return user.send(
			"&ctl=rwarrior&act=saverwgroup",
			"{\"rwgid\":0,\"grouppos\":%s}", groupString
		);
	}


	//public static const B_UPGRADE:Object = {ctl:"home", act:"upbuild"};
	//<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"><html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8" /><title> - </title><style>body {	font-size:76%;	font-family:"Lucida Grande", Verdana, Lucida, Arial, Helvetica, sans-serif;	background-color:#FEFEFE;	color:#333333;	margin:0;}a{color:#f60;}a:hover{text-decoration:none;}.dialogtitle {	margin-bottom:10px;	font-weight:bold;}.dialogContent {	padding:10px;}</style><link rel="stylesheet" href="style/dialog.css" /></head><body><div style="margin:100px auto;width:500px;"><table border="0" cellspacing="0" cellpadding="0" id="windowTable">	<tr>		<td colspan="2" class="td9TL"></td>		<td class="td9TC"></td>		<td colspan="2" class="td9TR"></td>	</tr>	<tr>		<td class="td9ML2"></td>		<td class="td9ML"></td>		<td class="td9MC" id="windowContent"><div>	<div class="dialogtitle"><div></div></div>    <div class="dialogContent">    	<div style="width:450px;">       	方法【upbuild】未定义，请联系网站管理员。<br />		<div align="center" style="margin-top:10px;">    <a href="javascript:history.back();"></a>		</div>    	</div>    </div></div>               </td>		<td class="td9MR"></td>		<td class="td9MR2"></td>	</tr>	<tr>		<td colspan="2" class="td9BL"></td>		<td class="td9BC"></td>		<td colspan="2" class="td9BR"></td>	</tr></table></div></body></html>

	/**
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String bUpgrade(User user) {
		return user.send(
			"&ctl=home&act=upbuild",
			null
		);
	}


	//public static const BATTLE_LOAD:Object = {ctl:"fight", act:"startfight"};
	//	0= []

	/**
	 * 开始战斗， 获取fightId
	 * @deprecated  旧的
	 * @param user
	 * @param pkId
	 * @param mapId
	 * @param fightType
	 * @return
	 */
	public static String battleLoad(User user) {
		return user.send(
			"&ctl=fight&act=startfight",
			null
		);
	}


	//public static const C_BATTLE_LOAD:Object = {ctl:"cfight", act:"startfight"};
	//CWorldProxy.as: line 73: 	App.net.send(new HttpGetParams(PHPConsts.C_BATTLE_LOAD).getHttpString(), _loc_2, this.onWorldDataLoaded, null, "default", "default", "default", RequestType.BATTLE_INIT);
	//CWorldProxy.as: line 99: 	App.net.send(new HttpGetParams(PHPConsts.C_BATTLE_LOAD).getHttpString(), _loc_2, this.onWorldDataGuildWarLoaded, null, "default", "default", "default", RequestType.BATTLE_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_rawdataerr"}

	public static String cBattleLoad(User user,int pkId, int mapId, int fightType) {
		return user.send(
			"&ctl=cfight&act=startfight",
			"{\"froleid\":%d,\"mapcfgid\":%d,\"fighttype\":%d}", pkId, mapId, fightType
		);
	}


	//public static const BATTLE_WIN:Object = {ctl:"fight", act:"finishfight"};
	//CBattleManager.as: line 274: 	App.net.send(new HttpGetParams(PHPConsts.BATTLE_WIN).getHttpString(), _loc_4, param3, null, "default", "default", "default", 0);
	//CBattleProxy.as: line 393: 	App.net.send(new HttpGetParams(PHPConsts.BATTLE_WIN).getHttpString(), _loc_1, this.onCheatWin, null, "default", "default", "default", 0);
	//	0= []

	/**
	 * 旧的 结束战斗？
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String battleWin(User user) {
		return user.send(
			"&ctl=fight&act=finishfight",
			null
		);
	}


	//public static const BATTLE_ACTION:Object = {ctl:"fight", act:"doFight"};
	//	0= []

	/**
	 * 旧的
	 * @param user
	 * @return
	 */
	public static String battleAction(User user) {
		return user.send(
			"&ctl=fight&act=doFight",
			null
		);
	}


	//public static const EQUIP_UP:Object = {ctl:"item", act:"upequip"};
	//StrengthenCont.as: line 180: 	App.net.send(new HttpGetParams(PHPConsts.EQUIP_UP).getHttpString(), _loc_1, this.strengthResult, null, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.doubleCheck, [this._itemVo]);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_home_err_itemnotexist"}

	/**
	 * 武器升级
	 * @param user
	 * @param id
	 * @return
	 */
	public static String equipUp(User user,int id) {
		return user.send(
			"&ctl=item&act=upequip",
			"\"rbagitemid\":%d",id
		);
	}


	//public static const EQUIP_BAT_UP:Object = {ctl:"item", act:"batchupequip"};
	//StrengthenCont.as: line 205: 	App.net.send(new HttpGetParams(PHPConsts.EQUIP_BAT_UP).getHttpString(), _loc_1, this.strengthResult, null, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.doubleCheck, [this._itemVo]);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_home_err_itemnotexist"}

	/**
	 * 一键强化
	 * @param user
	 * @param id
	 * @return
	 */
	public static String equipBatUp(User user,int id) {
		return user.send(
			"&ctl=item&act=batchupequip",
			"\"rbagitemid\":%d",id
		);
	}


	//public static const EQUIP_SET:Object = {ctl:"rwarrior", act:"setequip"};
	//EquipSonCont.as: line 166: 	App.net.send(new HttpGetParams(PHPConsts.EQUIP_SET).getHttpString(), _loc_2, this.onQuickEquipSetResult);
	//EquipSonCont.as: line 204: 	App.net.send(new HttpGetParams(PHPConsts.EQUIP_SET).getHttpString(), _loc_3, this.onEquipSetResult);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_rawdataerr"}

	/**
	 * 装备 
	 * itemStr= {"1":id,"2":id,"3":id,"4":id}
	 * @param user
	 * @param warrior
	 * @param itemStr
	 * @return
	 */
	public static String equipSet(User user, int warrior , String itemStr) {
		return user.send(
			"&ctl=rwarrior&act=setequip",
			"{\"rwarriorid\":%d,\"arrequip\":%s}", warrior, itemStr
		);
	}


	//public static const EQUIP_OPEN_HOLE:Object = {ctl:"item", act:"openequiphole"};
	//<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"><html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8" /><title> - </title><style>body {	font-size:76%;	font-family:"Lucida Grande", Verdana, Lucida, Arial, Helvetica, sans-serif;	background-color:#FEFEFE;	color:#333333;	margin:0;}a{color:#f60;}a:hover{text-decoration:none;}.dialogtitle {	margin-bottom:10px;	font-weight:bold;}.dialogContent {	padding:10px;}</style><link rel="stylesheet" href="style/dialog.css" /></head><body><div style="margin:100px auto;width:500px;"><table border="0" cellspacing="0" cellpadding="0" id="windowTable">	<tr>		<td colspan="2" class="td9TL"></td>		<td class="td9TC"></td>		<td colspan="2" class="td9TR"></td>	</tr>	<tr>		<td class="td9ML2"></td>		<td class="td9ML"></td>		<td class="td9MC" id="windowContent"><div>	<div class="dialogtitle"><div></div></div>    <div class="dialogContent">    	<div style="width:450px;">       	方法【openequiphole】未定义，请联系网站管理员。<br />		<div align="center" style="margin-top:10px;">    <a href="javascript:history.back();"></a>		</div>    	</div>    </div></div>               </td>		<td class="td9MR"></td>		<td class="td9MR2"></td>	</tr>	<tr>		<td colspan="2" class="td9BL"></td>		<td class="td9BC"></td>		<td colspan="2" class="td9BR"></td>	</tr></table></div></body></html>

	/**
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String equipOpenHole(User user) {
		return user.send(
			"&ctl=item&act=openequiphole",
			null
		);
	}


	//public static const EQUIP_BESET:Object = {ctl:"item", act:"setequipstone"};
	//BesetCont.as: line 138: 	App.net.send(new HttpGetParams(PHPConsts.EQUIP_BESET).getHttpString(), param1, this.onBesetResult, this.onBesetFailure);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_home_err_paramnotvalid"}

	/**
	 * 上石头 
	 * @param user
	 * @param item
	 * @param stoneStr
	 * 	{\"0\":id,\"1\":id,\"2\":id,\"3\":id}
	 * @return
	 */
	public static String equipBeset(User user, int item, String stoneStr) {
		return user.send(
			"&ctl=item&act=setequipstone",
			 "{\"rbagequipid\":%d,\"arrstone\":%s}", item,stoneStr
		);
	}


	//public static const EQUIP_ANALYZE:Object = {ctl:"item", act:"partequip"};
	//<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"><html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8" /><title> - </title><style>body {	font-size:76%;	font-family:"Lucida Grande", Verdana, Lucida, Arial, Helvetica, sans-serif;	background-color:#FEFEFE;	color:#333333;	margin:0;}a{color:#f60;}a:hover{text-decoration:none;}.dialogtitle {	margin-bottom:10px;	font-weight:bold;}.dialogContent {	padding:10px;}</style><link rel="stylesheet" href="style/dialog.css" /></head><body><div style="margin:100px auto;width:500px;"><table border="0" cellspacing="0" cellpadding="0" id="windowTable">	<tr>		<td colspan="2" class="td9TL"></td>		<td class="td9TC"></td>		<td colspan="2" class="td9TR"></td>	</tr>	<tr>		<td class="td9ML2"></td>		<td class="td9ML"></td>		<td class="td9MC" id="windowContent"><div>	<div class="dialogtitle"><div></div></div>    <div class="dialogContent">    	<div style="width:450px;">       	方法【partequip】未定义，请联系网站管理员。<br />		<div align="center" style="margin-top:10px;">    <a href="javascript:history.back();"></a>		</div>    	</div>    </div></div>               </td>		<td class="td9MR"></td>		<td class="td9MR2"></td>	</tr>	<tr>		<td colspan="2" class="td9BL"></td>		<td class="td9BC"></td>		<td colspan="2" class="td9BR"></td>	</tr></table></div></body></html>

	/**
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String equipAnalyze(User user) {
		return user.send(
			"&ctl=item&act=partequip",
			null
		);
	}


	//public static const STONE_COMPOSE:Object = {ctl:"item", act:"mergestone"};
	//ComposeCont.as: line 70: 	App.net.send(new HttpGetParams(PHPConsts.STONE_COMPOSE).getHttpString(), _loc_2, this.composeResult, null, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.doubleCheck, [int(this._page.value)]);
	//{"rep":"object","_cls":"msg","msgident":"0007","msg":"_home_err_itemnumnotvalid"}

	/**
	 * 合成宝石
	 * @param user
	 * @param id
	 * @param num
	 * @return
	 */
	public static String stoneCompose(User user, int id, int num) {
		return user.send(
			"&ctl=item&act=mergestone",
			"{\"rbagitemid\":%d,\"num\":%d}", id, num
		);
	}


	//public static const ITEM_SELL:Object = {ctl:"item", act:"sellitem"};
	//SellProxy.as: line 37: 	App.net.send(new HttpGetParams(PHPConsts.ITEM_SELL).getHttpString(), {rbagitemid:this._itemVo.id, num:this._num}, this.sellSuccess, this.sellFailure, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.doubleCheck).dropPoint = new Point(470, 370);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_home_err_bagitemnotexist"}

	/**
	 * 出售道具
	 * @param user
	 * @return
	 */
	public static String itemSell(User user, int id, int num) {
		return user.send(
			"&ctl=item&act=sellitem",
			"{\"num\":%d,\"rbagitemid\":%d}", num, id
		);
	}


	//public static const ITEM_COMPOSE:Object = {ctl:"item", act:"bagmergefragment"};
	//UseProxy.as: line 28: 	App.net.send(new HttpGetParams(PHPConsts.ITEM_COMPOSE).getHttpString(), {rbagitemid:param1.id, num:param2}, this.composeDone, this.composeFail, "default", "default", "default", RequestType.DIALOG_INIT).dropPoint = new Point(589, 372);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_home_err_boxnotexist"}

	/**
	 * 碎片合成
	 * @param user
	 * @param id
	 * @param num
	 * @return
	 */
	public static String itemCompose(User user, int id, int num) {
		return user.send(
			"&ctl=item&act=bagmergefragment",
			"{\"num\":%d,\"rbagitemid\":%d}", num, id
		);
	}


	//public static const ITEN_OPEN:Object = {ctl:"item", act:"bagopenbox"};
	//UseProxy.as: line 32: 	App.net.send(new HttpGetParams(PHPConsts.ITEN_OPEN).getHttpString(), {rwarriorid:this._vo.id, rbagitemid:param1.id, num:param2}, this.warriorItemOpen, this.openFail, "default", "default", "default", RequestType.DIALOG_INIT);
	//UseProxy.as: line 36: 	App.net.send(new HttpGetParams(PHPConsts.ITEN_OPEN).getHttpString(), {rbagitemid:param1.id, num:param2}, this.openDone, this.openFail, "default", "default", "default", RequestType.DIALOG_INIT).dropPoint = new Point(589, 372);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_home_err_boxnotexist"}

	/**
	 * 使用道具. 
	 * @param user
	 * @param warrior
	 * @param item
	 * @param num
	 * @return
	 */
	public static String itenOpen(User user,int warrior, int item, int num) {
		return user.send(
			"&ctl=item&act=bagopenbox",
			"{\"rwarriorid\":%d, \"rbagitemid\":%d, \"num\":%d}",warrior, item, num
		);
	}
	
	/**
	 * 使用道具. warrior 可为0.
	 * @param user
	 * @param item
	 * @param num
	 * @return
	 */
	public static String itenOpen(User user, int item, int num) {
		return user.send(
			"&ctl=item&act=bagopenbox",
			"{\"rbagitemid\":%d, \"num\":%d}", item, num
		);
	}

	//public static const ITEM_RBUFF:Object = {ctl:"item", act:"baguseitem"};
	//UserRbuffProxy.as: line 18: 	App.net.send(new HttpGetParams(PHPConsts.ITEM_RBUFF).getHttpString(), {rbagitemid:param1.id, num:1}, this.composeDone, this.composeFail);
	//UserRbuffProxy.as: line 18: 	App.net.send(new HttpGetParams(PHPConsts.ITEM_RBUFF).getHttpString(), {rbagitemid:param1.id, num:1}, this.composeDone, this.composeFail);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_home_err_boxnotexist"}

	/**
	 * 使用符
	 * 小数点 TODO 保持侠客属性
	 * @param user
	 * @param item
	 * @param num
	 * @return
	 */
	public static String itemRbuff(User user, int item, int num) {
		return user.send(
			"&ctl=item&act=baguseitem",
			"{\"rbagitemid\":%d, \"num\":%d}",item, num
		);
	}


	//public static const EQUIP_SOUL_CREATE:Object = {ctl:"item", act:"createsoul"};
	//SoulCreateServices.as: line 18: 	App.net.send(new HttpGetParams(PHPConsts.EQUIP_SOUL_CREATE).getHttpString(), _loc_3, this.dealSuccess, this.dealFailure);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_item_err_rbagitemnotexist"}

	/**
	 * 添加灵魂
	 * @param user
	 * @param weapon
	 * @return
	 */
	public static String equipSoulCreate(User user,int weapon) {
		return user.send(
			"&ctl=item&act=createsoul",
			"{\"rbagitemid\":%d}",weapon
		);
	}


	//public static const EQUIP_SOUL_SOUL_CHG:Object = {ctl:"item", act:"changesoul"};
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_item_err_rbagitemnotexist"}

	/**
	 * 未知
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String equipSoulSoulChg(User user) {
		return user.send(
			"&ctl=item&act=changesoul",
			null
		);
	}


	//public static const EQUIP_SOUL_SAVE:Object = {ctl:"item", act:"dochangeproperty"};
	//SoulSaveServices.as: line 18: 	App.net.send(new HttpGetParams(PHPConsts.EQUIP_SOUL_SAVE).getHttpString(), _loc_4, this.dealSuccess, this.dealFailure);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_item_err_rbagitemnotexist"}

	/**
	 * 是否保存 属性改造
	 * @param user
	 * @param weapon
	 * @param save
	 * @return
	 */
	public static String equipSoulSave(User user, int weapon, boolean save) {
		return user.send(
			"&ctl=item&act=dochangeproperty",
			"{\"rbagitemid\":%d,\"op\":\"%s\"}",weapon,save?"save":"cancel"
		);
	}


	//public static const EQUIP_SOUL_PREP_CHG:Object = {ctl:"item", act:"changeproperty"};
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_item_err_rbagitemnotexist"}

	/**
	 * 灵魂属性改造
	 * @param user
	 * @param weapon
	 * @return
	 */
	public static String equipSoulPrepChg(User user,int weapon) {
		return user.send(
			"&ctl=item&act=changeproperty",
			"\"rbagitemid\":%d",weapon
		);
	}


	//public static const EQUIP_IDENTIFY:Object = {ctl:"item", act:"identifyequip"};
	//IdentifyServices.as: line 52: 	App.net.send(new HttpGetParams(PHPConsts.EQUIP_IDENTIFY).getHttpString(), _loc_3, this.dealSuccess, this.dealFailure);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_item_err_rbagitemnotexist"}

	/**
	 * 鉴定属性
	 * @param user
	 * @param weapon
	 * @param lockInfo
	 * 		1,2,3,4 - 这样的
	 * @return
	 */
	public static String equipIdentify(User user, int weapon, String lockInfo) {
		return user.send(
			"&ctl=item&act=identifyequip",
			"{\"rbagitemid\":%d,\"lockinfo\":[%s]}",weapon, lockInfo
		);
	}


	//public static const QUEST_FINISH:Object = {ctl:"rquest", act:"getaward"};
	//MainInfoMgr.as: line 474: 	App.net.send(new HttpGetParams(PHPConsts.QUEST_FINISH).getHttpString(), _loc_3);
	//MainInfoMgr.as: line 562: 	App.net.send(new HttpGetParams(PHPConsts.QUEST_FINISH).getHttpString(), _loc_3);
	//QuestManager.as: line 45: 	App.net.send(new HttpGetParams(PHPConsts.QUEST_FINISH).getHttpString(), _loc_4).dropPoint = param2;
	//FinishQuestProxy.as: line 17: 	App.net.send(new HttpGetParams(PHPConsts.QUEST_FINISH).getHttpString(), {questcfgid:_loc_3.id, rwarriorid:param1.id}, this.finishSuccess, this.finishFailure);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_rawdataerr"}

	/**
	 * 提交任务
	 * @param user
	 * @param quest
	 * @return
	 */
	public static String questFinish(User user,int quest) {
		return user.send(
			"&ctl=rquest&act=getaward",
			"{\"questcfgid\":%d}",quest
		);
	}


	//public static const QUEST_ACCEPT:Object = {ctl:"rquest", act:"accept"};
	//AcceptQuestProxy.as: line 25: 	App.net.send(new HttpGetParams(PHPConsts.QUEST_ACCEPT).getHttpString(), 
	//{questcfgid:_loc_3.questcfgid, rwarriorid:this._npc.id}, this.acceptSuccess, this.acceptFailure);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_noquestcfgid"}

	/**
	 * 接受任务.  未知用途
	 * @param user
	 * @return
	 */
	public static String questAccept(User user) {
		return user.send(
			"&ctl=rquest&act=accept",
			"{\"questcfgid\":%d}"
		);
	}


	//public static const SKILL_SET:Object = {ctl:"rwarrior", act:"setrwskill"};
	//SkillSonCont.as: line 129: 	App.net.send(new HttpGetParams(PHPConsts.SKILL_SET).getHttpString(), _loc_1, this.saveResult);
	//PetSkillPanel.as: line 235: 	App.net.send(new HttpGetParams(PHPConsts.SKILL_SET).getHttpString(), _loc_1, this.saveResult);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_rawdataerr"}

	/**
	 * 设置技能
	 * @param user
	 * @param warrior
	 * @param skill
	 *    skillid,skillid,skillid,skillid
	 * @return
	 */
	public static String skillSet(User user, int warrior, String skill) {
		return user.send(
			"&ctl=rwarrior&act=setrwskill",
			"{\"rwarriorid\":%d,\"arrskillid\":[%s]}",warrior, skill
		);
	}


	//public static const SKILL_UP:Object = {ctl:"home", act:"upskill"};
	//<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"><html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8" /><title> - </title><style>body {	font-size:76%;	font-family:"Lucida Grande", Verdana, Lucida, Arial, Helvetica, sans-serif;	background-color:#FEFEFE;	color:#333333;	margin:0;}a{color:#f60;}a:hover{text-decoration:none;}.dialogtitle {	margin-bottom:10px;	font-weight:bold;}.dialogContent {	padding:10px;}</style><link rel="stylesheet" href="style/dialog.css" /></head><body><div style="margin:100px auto;width:500px;"><table border="0" cellspacing="0" cellpadding="0" id="windowTable">	<tr>		<td colspan="2" class="td9TL"></td>		<td class="td9TC"></td>		<td colspan="2" class="td9TR"></td>	</tr>	<tr>		<td class="td9ML2"></td>		<td class="td9ML"></td>		<td class="td9MC" id="windowContent"><div>	<div class="dialogtitle"><div></div></div>    <div class="dialogContent">    	<div style="width:450px;">       	方法【upskill】未定义，请联系网站管理员。<br />		<div align="center" style="margin-top:10px;">    <a href="javascript:history.back();"></a>		</div>    	</div>    </div></div>               </td>		<td class="td9MR"></td>		<td class="td9MR2"></td>	</tr>	<tr>		<td colspan="2" class="td9BL"></td>		<td class="td9BC"></td>		<td colspan="2" class="td9BR"></td>	</tr></table></div></body></html>

	/**
	 * 技能升级 未开放
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String skillUp(User user) {
		return user.send(
			"&ctl=home&act=upskill",
			null
		);
	}


	//public static const INTER_UP:Object = {ctl:"inter", act:"upinter"};
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_home_err_rwarriornotexist"}
	/**
	 * 内功升级
	 * @param user
	 * @return
	 */
	public static String interUp(User user,int warrior) {
		return user.send(
			"&ctl=inter&act=upinter",
			"{\"rwarriorid\":%d}", warrior
		);
	}


	//public static const INTER_SHARE:Object = {ctl:"inter", act:"passinter"};
	//ShareVigourPanel.as: line 218: 	App.net.send(new HttpGetParams(PHPConsts.INTER_SHARE).getHttpString(), _loc_3, this.successHandler);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_inter_err_fromwarriornotexist"}

	/**
	 * 传授元气
	 * @param user
	 * @param from
	 * @param to
	 * @param cost
	 * 	是否用令牌
	 * @return
	 */
	public static String interShare(User user, int from,int to, boolean cost) {
		return user.send(
			"&ctl=inter&act=passinter",
			"{\"fromwid\":%d,\"passwid\":%d,\"passtype\":%d}", from, to, cost?2:1
		);
	}


	//public static const INTER_LOOP_UP:Object = {ctl:"inter", act:"uploopinter"};
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_home_err_rwarriornotexist"}

	/**
	 * 循环元气升级
	 * @param user
	 * @param warrior
	 * @return
	 */
	public static String interLoopUp(User user, int warrior) {
		return user.send(
			"&ctl=inter&act=uploopinter",
			"{\"rwarriorid\":%d}", warrior
		);
	}


	//public static const MAP_LOAD:Object = {ctl:"game", act:"arealist"};
	//<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"><html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8" /><title> - </title><style>body {	font-size:76%;	font-family:"Lucida Grande", Verdana, Lucida, Arial, Helvetica, sans-serif;	background-color:#FEFEFE;	color:#333333;	margin:0;}a{color:#f60;}a:hover{text-decoration:none;}.dialogtitle {	margin-bottom:10px;	font-weight:bold;}.dialogContent {	padding:10px;}</style><link rel="stylesheet" href="style/dialog.css" /></head><body><div style="margin:100px auto;width:500px;"><table border="0" cellspacing="0" cellpadding="0" id="windowTable">	<tr>		<td colspan="2" class="td9TL"></td>		<td class="td9TC"></td>		<td colspan="2" class="td9TR"></td>	</tr>	<tr>		<td class="td9ML2"></td>		<td class="td9ML"></td>		<td class="td9MC" id="windowContent"><div>	<div class="dialogtitle"><div></div></div>    <div class="dialogContent">    	<div style="width:450px;">       	方法【arealist】未定义，请联系网站管理员。<br />		<div align="center" style="margin-top:10px;">    <a href="javascript:history.back();"></a>		</div>    	</div>    </div></div>               </td>		<td class="td9MR"></td>		<td class="td9MR2"></td>	</tr>	<tr>		<td colspan="2" class="td9BL"></td>		<td class="td9BC"></td>		<td colspan="2" class="td9BR"></td>	</tr></table></div></body></html>

	/**
	 * 未知
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String mapLoad(User user) {
		return user.send(
			"&ctl=game&act=arealist",
			null
		);
	}


	//public static const MAP_CROSS:Object = {ctl:"game", act:"rmaplist"};
	//BossProxy.as: line 50: 	App.net.send(new HttpGetParams(PHPConsts.MAP_CROSS).getHttpString(), null, this.onGetBossData, null, "default", "default", "default", RequestType.DIALOG_INIT);
	//MapManager.as: line 85: 	App.net.send(new HttpGetParams(PHPConsts.MAP_CROSS).getHttpString(), null, this.onMapDataLoaded, null, "default", "default", "default", RequestType.MAP_INIT);
	//RushBarrierProxy.as: line 86: 	App.net.send(new HttpGetParams(PHPConsts.MAP_CROSS).getHttpString(), null, this.onGetRushBarrierData, null, "default", "default", "default", RequestType.DIALOG_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_rmaplist","data":{"_cls":"rmapList","rmapList":[{"_cls":"rmapVo","mapcfgid":1009,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"1003","iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":10026,"iscleared":0,"cleartimes":"0","isopen":"1"},{"_cls":"rmapVo","mapcfgid":1000,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":16,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"97","iscleared":1,"cleartimes":2,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"13","iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":1004,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":28,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"107","iscleared":1,"cleartimes":2,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":8,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"1002","iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"44","iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"106","iscleared":1,"cleartimes":2,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":24,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":40,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"99","iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":29,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"43","iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"1008","iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"1006","iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"21","iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":6,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":10005,"iscleared":0,"cleartimes":"0","isopen":"1"},{"_cls":"rmapVo","mapcfgid":4,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":30,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"109","iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"1007","iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"104","iscleared":1,"cleartimes":2,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"98","iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":100,"iscleared":1,"cleartimes":2,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"1005","iscleared":1,"cleartimes":2,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"95","iscleared":1,"cleartimes":2,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"1013","iscleared":1,"cleartimes":2,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"101","iscleared":1,"cleartimes":2,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"37","iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"22","iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"1","iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"105","iscleared":1,"cleartimes":2,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":31,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"27","iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"92","iscleared":1,"cleartimes":2,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":10025,"iscleared":0,"cleartimes":"0","isopen":"1"},{"_cls":"rmapVo","mapcfgid":"1016","iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"96","iscleared":1,"cleartimes":2,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":32,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"103","iscleared":1,"cleartimes":2,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":45,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":10001,"iscleared":0,"cleartimes":"0","isopen":"1"},{"_cls":"rmapVo","mapcfgid":23,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":10028,"iscleared":0,"cleartimes":"0","isopen":"1"},{"_cls":"rmapVo","mapcfgid":"39","iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":10002,"iscleared":0,"cleartimes":"0","isopen":"1"},{"_cls":"rmapVo","mapcfgid":10000,"iscleared":0,"cleartimes":"0","isopen":"1"},{"_cls":"rmapVo","mapcfgid":"18","iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":11,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":1019,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":12,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":9,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"38","iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":1010,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"14","iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"1101","iscleared":1,"cleartimes":2,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"94","iscleared":1,"cleartimes":2,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":26,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":1100,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"108","iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"1018","iscleared":1,"cleartimes":2,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":1014,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":7,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"41","iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"102","iscleared":1,"cleartimes":2,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":42,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":10,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":1012,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"93","iscleared":1,"cleartimes":2,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"1011","iscleared":1,"cleartimes":2,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"1001","iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"25","iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"1017","iscleared":1,"cleartimes":3,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"35","iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"1102","iscleared":0,"cleartimes":"0","isopen":"1"},{"_cls":"rmapVo","mapcfgid":"5001","iscleared":0,"cleartimes":"0","isopen":"1","dayfighted":0},{"_cls":"rmapVo","mapcfgid":5000,"iscleared":1,"cleartimes":1,"isopen":"1","dayfighted":0},{"_cls":"rmapVo","mapcfgid":33,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"34","iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"2","iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":5,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":20,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":36,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":90,"iscleared":1,"cleartimes":2,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"1015","iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":15,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"17","iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":3,"iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"19","iscleared":1,"cleartimes":1,"isopen":"1"},{"_cls":"rmapVo","mapcfgid":"91","iscleared":1,"cleartimes":2,"isopen":"1"}]}}

	/**
	 * 获取地图信息
	 * @param user
	 * @return
	 */
	public static String mapCross(User user) {
		return user.send(
			"&ctl=game&act=rmaplist",
			null
		);
	}


	//public static const USER_ADDGAIN:Object = {ctl:"tree", act:"addgain"};
	//AddGainPanel.as: line 119: 	App.net.send(new HttpGetParams(PHPConsts.USER_ADDGAIN).getHttpString(), null, this.addGainResults, this.addGainFail);
	//AddGainPanel.as: line 173: 	App.net.send(new HttpGetParams(PHPConsts.USER_ADDGAIN).getHttpString(), null, this.addGainResults, this.addGainFail);
	//TreeProxy.as: line 141: 	App.net.send(new HttpGetParams(PHPConsts.USER_ADDGAIN).getHttpString(), null, this.addGainResults, this.addGainFail).dropPoint = this._treePanel.getPoint("btnExtraGain");
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_addgain","change":{"_cls":"changeObj","role":{"805493":{"money":"7566364","gamepoint":"154","buygaintimes":"1","qliveness":"35"}},"rwarrior":null,"rwarriorskill":null,"rwarriorskillbuff":null,"rbagitem":null,"rbuild":null,"rquest":{"51":{"gotnum":1,"gotaward":1}},"rmap":null,"rwarriorinpub":null,"rwarriorgroup":null,"roperator":null},"data":{"serstatus":"0","sernum":0,"_cls":"addGain"}}

	/**
	 * 强征
	 * @param user
	 * @return
	 */
	public static String userAddgain(User user) {
		return user.send(
			"&ctl=tree&act=addgain",
			null
		);
	}


	//public static const USER_GETGAIN:Object = {ctl:"tree", act:"getgain"};
	//AddGainPanel.as: line 140: 	App.net.send(new HttpGetParams(PHPConsts.USER_GETGAIN).getHttpString(), null, this.gainSuccess, this.gainFail);
	//TreeProxy.as: line 161: 	App.net.send(new HttpGetParams(PHPConsts.USER_GETGAIN).getHttpString(), null, this.gainSuccess, this.addGainFail, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.doubleCheck).dropPoint = this._treePanel.getPoint("btnGain");
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getgain","change":{"_cls":"changeObj","role":{"805493":{"money":"7598364","lastgaintime":"1405787406","gaintimes":"1"}},"rwarrior":null,"rwarriorskill":null,"rwarriorskillbuff":null,"rbagitem":null,"rbuild":null,"rquest":{"50":{"gotnum":1,"gotaward":0}},"rmap":null,"rwarriorinpub":null,"rwarriorgroup":null,"roperator":null},"data":{"serstatus":"0","sernum":0,"_cls":"getGain"}}

	/**
	 * 征收
	 * @param user
	 * @return
	 */
	public static String userGetgain(User user) {
		return user.send(
			"&ctl=tree&act=getgain",
			null
		);
	}


	//public static const USER_GET_ALLGAIN:Object = {ctl:"tree", act:"batchgain"};
	//TreeProxy.as: line 170: 	App.net.send(new HttpGetParams(PHPConsts.USER_GET_ALLGAIN).getHttpString(), null, this.gainSuccess, this.addGainFail, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.doubleAllCheck).dropPoint = this._treePanel.getPoint("btnGain");
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_vipnotaccess"}
	
	/**
	 * 一键征收
	 * @param user
	 * @return
	 */
	public static String userGetAllgain(User user) {
		return user.send(
			"&ctl=tree&act=batchgain",
			null
		);
	}


	//public static const TREE_GETGAIN:Object = {ctl:"tree", act:"getblessaward"};
	//TreeProxy.as: line 110: 	App.net.send(new HttpGetParams(PHPConsts.TREE_GETGAIN).getHttpString(), null, this.addBlessGainResults, this.addGainFail).dropPoint = new Point(this._treePanel.stage.mouseX, this._treePanel.stage.mouseY);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getblessawardok","change":{"_cls":"changeObj","role":{"805493":{"money":"7645364","techpoint":"2251158","lastharvesttime":"1405787407","luckystarcdtime":"1405823407","nowluckystar":"0"}},"rwarrior":null,"rwarriorskill":null,"rwarriorskillbuff":null,"rbagitem":null,"rbuild":null,"rquest":null,"rmap":null,"rwarriorinpub":null,"rwarriorgroup":null,"roperator":null},"data":{"getgain":47000,"_cls":"getBlessAward"}}

	/**
	 * 收获祝福
	 * @param user
	 * @return
	 */
	public static String treeGetgain(User user) {
		return user.send(
			"&ctl=tree&act=getblessaward",
			null
		);
	}


	//public static const TREE_GETDOUBLE_GAIN:Object = {ctl:"tree", act:"doubleblessaward"};
	//TreeProxy.as: line 116: 	App.net.send(new HttpGetParams(PHPConsts.TREE_GETDOUBLE_GAIN).getHttpString(), null, this.addBlessGainResults, this.addGainFail).dropPoint = this._treePanel.getPoint("btnTreeGain");
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_vipnotaccess"}

	/**
	 * 双倍祝福
	 * @param user
	 * @return
	 */
	public static String treeGetdoubleGain(User user) {
		return user.send(
			"&ctl=tree&act=doubleblessaward",
			null
		);
	}


	//public static const TREE_BLESS:Object = {ctl:"tree", act:"blessfriend"};
	//ManorManager.as: line 225: 	App.net.send(new HttpGetParams(PHPConsts.TREE_BLESS).getHttpString(), _loc_3, this.onBlessResults, this.onBlessFail).dropPoint = new Point(450, 300);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_gam_err_friendnotexist"}

	/**
	 * 祝福朋友
	 * @param user
	 * @param friend
	 * @return
	 */
	public static String treeBless(User user,int friend) {
		return user.send(
			"&ctl=tree&act=blessfriend",
			"{\"frid\":%d}", friend
		);
	}


	//public static const AVATAR_MONEY:Object = {ctl:"rhouse", act:"peoplegain"};
	//HallProxy.as: line 47: 	App.net.send(new HttpGetParams(PHPConsts.AVATAR_MONEY).getHttpString(), _loc_2, this.onTakeMoneyResult, null, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.check, [this.takeVo]).dropPoint = this._avatarPoint;
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_home_suc_getpeoplegain","change":{"_cls":"changeObj","role":{"805493":{"money":"7645476","peoplegainedtimes":"1","peoplegaincdtime":1365992951,"peoplegaintimes":3}},"rwarrior":null,"rwarriorskill":null,"rwarriorskillbuff":null,"rbagitem":null,"rbuild":null,"rquest":null,"rmap":null,"rwarriorinpub":null,"rwarriorgroup":null,"roperator":null},"data":{"gainmoney":112,"_cls":"peoplegain"}}
	
	/**
	 * 路人金币
	 * @param user
	 * @return
	 */
	public static String avatarMoney(User user) {
		return user.send(
			"&ctl=rhouse&act=peoplegain",
			"{\"fid\":\"0\",\"money\":100}"
		);
	}


	//public static const GET_STAMINA:Object = {ctl:"game", act:"getstamina"};
	//StaminaProxy.as: line 101: 	App.net.send(new HttpGetParams(PHPConsts.GET_STAMINA).getHttpString(), {}, this.getStaminaResult);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getstamina","change":{"_cls":"changeObj","role":{"823947":{"stamina":48,"nowstamina":47,"laststaminatime":1405563184}},"rwarrior":null,"rwarriorskill":null,"rwarriorskillbuff":null,"rbagitem":null,"rbuild":null,"rquest":null,"rmap":null,"rwarriorinpub":null,"rwarriorgroup":null,"roperator":null}}
	
	/**
	 * get stamina
	 * @param user
	 * @return
	 */
	public static String getStamina(User user) {
		return user.send(
			"&ctl=game&act=getstamina",
			"{}"
		);
	}


	//public static const ADD_STAMINA:Object = {ctl:"game", act:"addstamina"};
	//BuyStaminaProxy.as: line 65: 	App.net.send(new HttpGetParams(PHPConsts.ADD_STAMINA).getHttpString(), {}, this.addStamina, this.addFailure);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_gam_err_reqnotvalid"}

	/**
	 * add stamina
	 * @param user
	 * @return
	 */
	public static String addStamina(User user) {
		return user.send(
			"&ctl=game&act=addstamina",
			"{}"
		);
	}


	//public static const TRAIN_CONFIG:Object = {ctl:"train", act:"gettraincfg"};
	//<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"><html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8" /><title> - </title><style>body {	font-size:76%;	font-family:"Lucida Grande", Verdana, Lucida, Arial, Helvetica, sans-serif;	background-color:#FEFEFE;	color:#333333;	margin:0;}a{color:#f60;}a:hover{text-decoration:none;}.dialogtitle {	margin-bottom:10px;	font-weight:bold;}.dialogContent {	padding:10px;}</style><link rel="stylesheet" href="style/dialog.css" /></head><body><div style="margin:100px auto;width:500px;"><table border="0" cellspacing="0" cellpadding="0" id="windowTable">	<tr>		<td colspan="2" class="td9TL"></td>		<td class="td9TC"></td>		<td colspan="2" class="td9TR"></td>	</tr>	<tr>		<td class="td9ML2"></td>		<td class="td9ML"></td>		<td class="td9MC" id="windowContent"><div>	<div class="dialogtitle"><div></div></div>    <div class="dialogContent">    	<div style="width:450px;">       	方法【gettraincfg】未定义，请联系网站管理员。<br />		<div align="center" style="margin-top:10px;">    <a href="javascript:history.back();"></a>		</div>    	</div>    </div></div>               </td>		<td class="td9MR"></td>		<td class="td9MR2"></td>	</tr>	<tr>		<td colspan="2" class="td9BL"></td>		<td class="td9BC"></td>		<td colspan="2" class="td9BR"></td>	</tr></table></div></body></html>

	/**
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String trainConfig(User user) {
		return user.send(
			"&ctl=train&act=gettraincfg",
			null
		);
	}


	//public static const TRAIN_LIST:Object = {ctl:"train", act:"getwarriortrain"};
	//StudyManager.as: line 62: 	App.net.send(new HttpGetParams(PHPConsts.TRAIN_LIST).getHttpString(), {}, this.getTrainDataDone);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_home_suc_getrwarriortrainlistok","data":{"rwarriortrainList":[],"_cls":"warriortrainList"}}

	/**
	 * get train init
	 * @param user
	 * @return
	 */
	public static String trainList(User user) {
		return user.send(
			"&ctl=train&act=getwarriortrain",
			"{}"
		);
	}


	//public static const TRAIN_COMMIT:Object = {ctl:"train", act:"trainwarrior"};
	//StartTrainProxy.as: line 43: 	App.net.send(new HttpGetParams(PHPConsts.TRAIN_COMMIT).getHttpString(), _loc_3, this.studyDone, this.studyFailure);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_home_err_paramerror"}

	/**
	 * train warroir
	 * @param user
	 * @param warriorId
	 * @param type
	 * @param pos
	 * @return
	 */
	public static String trainCommit(User user, int warriorId, int type, int pos) {
		return user.send(
			"&ctl=train&act=trainwarrior",
			"{\"rbuildid\":0,\"arrwarriorid\":{\"%d\":%d},\"traintype\":%d}", pos, warriorId, type
		);
	}


	//public static const TRAIN_OPEN_SEAT:Object = {ctl:"train", act:"unlocktrainpos"};
	//OpenSeatProxy.as: line 29: 	App.net.send(new HttpGetParams(PHPConsts.TRAIN_OPEN_SEAT).getHttpString(), _loc_1, this.openSeatResult, this.openSeatFailure);
	//{"rep":"object","_cls":"msg","msgident":"0999","msg":"_game_err_reqnotvalid"}

	/**
	 * unlock train
	 * @param user
	 * @return
	 */
	public static String trainOpenSeat(User user) {
		return user.send(
			"&ctl=train&act=unlocktrainpos",
			"{\"rbuildid\":0}"
		);
	}


	//public static const TRAIN_CLEAR:Object = {ctl:"train", act:"cleartraincd"};
	//ClearTimeProxy.as: line 16: 	App.net.send(new HttpGetParams(PHPConsts.TRAIN_CLEAR).getHttpString(), {pos:param1.pos}, this.clearDone, this.clearFailure);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_train_err_nowarriorintrain"}

	/**
	 * finish train
	 * @param user
	 * @param pos
	 * @return
	 */
	public static String trainClear(User user, int pos) {
		return user.send(
			"&ctl=train&act=cleartraincd",
			"{\"pos\":%d}",pos
		);
	}


	//public static const TRAIN_CLICK_BUBBLE:Object = {ctl:"train", act:"hitbubble"};
	//BubbleClickProxy.as: line 22: 	App.net.send(new HttpGetParams(PHPConsts.TRAIN_CLICK_BUBBLE).getHttpString(), {pos:param1.pos}, this.bubbleResult, this.bubbleFailure, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.check, [param1]).dropPoint = param2;
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_train_err_nowarriorintrain"}

	/**
	 *  hit bubble
	 * @param user
	 * @param pos
	 * @return
	 */
	public static String trainClickBubble(User user,int pos) {
		return user.send(
			"&ctl=train&act=hitbubble",
			"{\"pos\":%d}",pos
		);
	}


	//public static const BAR_LIST:Object = {ctl:"inpub", act:"getpubwarrior"};
	//BarManager.as: line 53: 	App.net.send(new HttpGetParams(PHPConsts.BAR_LIST).getHttpString(), {}, this.getBarDataDone, null, "default", "default", "default", RequestType.DIALOG_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_home_suc_getpubwarriorok","data":{"rwarriorinpubList":[{"_cls":"rwarriorinpubInfo","wcfgid":3,"ship":1,"unlock":1,"recruit":1},{"_cls":"rwarriorinpubInfo","wcfgid":4,"ship":3,"unlock":1,"recruit":1},{"_cls":"rwarriorinpubInfo","wcfgid":5,"ship":3,"unlock":1,"recruit":1},{"_cls":"rwarriorinpubInfo","wcfgid":6,"ship":5,"unlock":1,"recruit":1},{"_cls":"rwarriorinpubInfo","wcfgid":7,"ship":5,"unlock":1,"recruit":1},{"_cls":"rwarriorinpubInfo","wcfgid":8,"ship":5,"unlock":1,"recruit":1},{"_cls":"rwarriorinpubInfo","wcfgid":10,"ship":20,"unlock":1,"recruit":1},{"_cls":"rwarriorinpubInfo","wcfgid":9,"ship":20,"unlock":1,"recruit":1},{"_cls":"rwarriorinpubInfo","wcfgid":11,"ship":20,"unlock":1,"recruit":1},{"_cls":"rwarriorinpubInfo","wcfgid":15,"ship":100,"unlock":1,"recruit":1},{"_cls":"rwarriorinpubInfo","wcfgid":12,"ship":40,"unlock":1,"recruit":1},{"_cls":"rwarriorinpubInfo","wcfgid":13,"ship":40,"unlock":1,"recruit":1},{"_cls":"rwarriorinpubInfo","wcfgid":14,"ship":40,"unlock":1,"recruit":1},{"_cls":"rwarriorinpubInfo","wcfgid":29,"ship":200,"unlock":1,"recruit":1},{"_cls":"rwarriorinpubInfo","wcfgid":16,"ship":100,"unlock":1,"recruit":1},{"_cls":"rwarriorinpubInfo","wcfgid":25,"ship":40,"unlock":1,"recruit":1},{"_cls":"rwarriorinpubInfo","wcfgid":26,"ship":40,"unlock":1,"recruit":1},{"_cls":"rwarriorinpubInfo","wcfgid":27,"ship":40,"unlock":1,"recruit":1},{"_cls":"rwarriorinpubInfo","wcfgid":17,"ship":100,"unlock":1,"recruit":1},{"_cls":"rwarriorinpubInfo","wcfgid":30,"ship":200,"unlock":1,"recruit":1},{"_cls":"rwarriorinpubInfo","wcfgid":31,"ship":200,"unlock":1,"recruit":1}],"_cls":"getpubWarrior"}}

	/**
	 * get pub warrior info
	 * @param user
	 * @return
	 */
	public static String barList(User user) {
		return user.send(
			"&ctl=inpub&act=getpubwarrior",
			"{}"
		);
	}


	//public static const BAR_REFRESH:Object = {ctl:"inpub", act:"drinkwarrior"};
	//<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"><html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8" /><title> - </title><style>body {	font-size:76%;	font-family:"Lucida Grande", Verdana, Lucida, Arial, Helvetica, sans-serif;	background-color:#FEFEFE;	color:#333333;	margin:0;}a{color:#f60;}a:hover{text-decoration:none;}.dialogtitle {	margin-bottom:10px;	font-weight:bold;}.dialogContent {	padding:10px;}</style><link rel="stylesheet" href="style/dialog.css" /></head><body><div style="margin:100px auto;width:500px;"><table border="0" cellspacing="0" cellpadding="0" id="windowTable">	<tr>		<td colspan="2" class="td9TL"></td>		<td class="td9TC"></td>		<td colspan="2" class="td9TR"></td>	</tr>	<tr>		<td class="td9ML2"></td>		<td class="td9ML"></td>		<td class="td9MC" id="windowContent"><div>	<div class="dialogtitle"><div></div></div>    <div class="dialogContent">    	<div style="width:450px;">       	方法【drinkwarrior】未定义，请联系网站管理员。<br />		<div align="center" style="margin-top:10px;">    <a href="javascript:history.back();"></a>		</div>    	</div>    </div></div>               </td>		<td class="td9MR"></td>		<td class="td9MR2"></td>	</tr>	<tr>		<td colspan="2" class="td9BL"></td>		<td class="td9BC"></td>		<td colspan="2" class="td9BR"></td>	</tr></table></div></body></html>

	/**
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String barRefresh(User user) {
		return user.send(
			"&ctl=inpub&act=drinkwarrior",
			null
		);
	}


	//public static const BAR_WARRIOR_RECURIT:Object = {ctl:"inpub", act:"recruitwarrior"};
	//BarProxy.as: line 96: 	App.net.send(new HttpGetParams(PHPConsts.BAR_WARRIOR_RECURIT).getHttpString(), _loc_2, this.recruitResult);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_home_err_warriorislock"}

	/**
	 * recurit warrior
	 * @param user
	 * @param wid
	 * @return
	 */
	public static String barWarriorRecurit(User user,int wid) {
		return user.send(
			"&ctl=inpub&act=recruitwarrior",
			"{\"wcfgid\":%d}", wid
		);
	}


	//public static const BAR_BAT_NPC:Object = {ctl:"inpub", act:"playwarrior"};
	//BarProxy.as: line 131: 	App.net.send(new HttpGetParams(PHPConsts.BAR_BAT_NPC).getHttpString(), _loc_2, this.batResult, this.batFailed);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_home_err_playtypenotexist"}

	/**
	 * roll dice
	 * @param user
	 * @param id
	 * @param type
	 *  1 - regular
	 * @return
	 */
	public static String barBatNpc(User user, int id, int type) {
		return user.send(
			"&ctl=inpub&act=playwarrior",
			"{\"wcfgid\":%d,\"ptype\":%d}", id, type
		);
	}


	//public static const TRADE_CREATE:Object = {ctl:"trade", act:"dotrade"};
	//TradeProxy.as: line 132: 	App.net.send(new HttpGetParams(PHPConsts.TRADE_CREATE).getHttpString(), _loc_3, this.createTradeResult);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_trade_err_notradecfgid"}
	
	/**
     * 开始跑商
     *
     * @param user
     * @param tradeId
     * @param kind 0 普通跑商 1 - 3小时 2 至尊
     * @return
     */
	public static String tradeCreate(User user, int tradeId, int kind) {
		return user.send(
			"&ctl=trade&act=dotrade",
			"{\"tradecfgid\":%d,\"kind\":%d}", tradeId, kind
		);
	}


	//public static const TRADE_ACCELERATE:Object = {ctl:"trade", act:"speedtrade"};
	//TradeProxy.as: line 167: 	App.net.send(new HttpGetParams(PHPConsts.TRADE_ACCELERATE).getHttpString(), {}, this.accelerateResult);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_trade_err_tradenotexist"}

	/**
	 * speed trade
	 * @param user
	 * @return
	 */
	public static String tradeAccelerate(User user) {
		return user.send(
			"&ctl=trade&act=speedtrade",
			"{}"
		);
	}


	//public static const TRADE_VIEW_RESULT:Object = {ctl:"trade", act:"viewtrade"};
	//TradeProxy.as: line 62: 	App.net.send(new HttpGetParams(PHPConsts.TRADE_VIEW_RESULT).getHttpString(), _loc_3, this.onGetResult, null, "default", "default", "default", RequestType.DIALOG_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_rawdataerr"}

    /**
     * 查看跑商结果
     *
     * @param user
     * @param tradeId
     * @return
     */
	public static String tradeViewResult(User user, int tradeId) {
		return user.send(
			"&ctl=trade&act=viewtrade",
			"{\"tradecfgid\":%d}", tradeId
		);
	}


	//public static const TRADE_GAIN:Object = {ctl:"trade", act:"addtradebag"};
	//TradeProxy.as: line 102: 	App.net.send(new HttpGetParams(PHPConsts.TRADE_GAIN).getHttpString(), _loc_3, this.onGainResult);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_trade_err_tradenotexist"}

	/**
	 * get trade item back
	 * @param user
	 * @param route
	 * @return
	 */
	public static String tradeGain(User user, int route) {
		return user.send(
			"&ctl=trade&act=addtradebag",
			"{\"tradecfgid\":%d}", route
		);
	}


	//public static const TRADE_LIST:Object = {ctl:"trade", act:"gettrade"};
	//TradeManager.as: line 57: 	App.net.send(new HttpGetParams(PHPConsts.TRADE_LIST).getHttpString(), {}, this.onTradeDataLoaded);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_trade_suc_gettradeok","data":{"rtradeList":[],"_cls":"getTrade"}}

	/**
	 * get trade init
	 * @param user
	 * @return
	 */
	public static String tradeList(User user) {
		return user.send(
			"&ctl=trade&act=gettrade",
			"{}"
		);
	}


	//public static const TAVERN_SEND_GIFT:Object = {ctl:"hotel", act:"sendpresent"};
	//SendGiftProxy.as: line 25: 	App.net.send(new HttpGetParams(PHPConsts.TAVERN_SEND_GIFT).getHttpString(), _loc_3, this.giveResult, this.giveResult, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.doubleCheck, [param2]);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_home_err_rwarriornotexist"}

	/**
     * 送礼
     * @param user
     * @param warrior
     * @param item
     * @return 
     */
	public static String tavernSendGift(User user, int warrior, int item) {
		return user.send(
			"&ctl=hotel&act=sendpresent",
			"{\"rbagitemid\":%d,\"rwarriorid\":%d}", item, warrior
		);
	}


	//public static const TAVERN_CHAT_WITH_NPC:Object = {ctl:"hotel", act:"talkwarrior"};
	//ChatProxy.as: line 23: 	App.net.send(new HttpGetParams(PHPConsts.TAVERN_CHAT_WITH_NPC).getHttpString(), _loc_4, this.chatResult, this.chatResult);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_hotel_err_rwarriornotexist"}

	/**
	 * talk to warrior
	 * @param user
	 * @param warrior
	 * @param old
	 * @param qid
	 * @return
	 */
	public static String tavernChatWithNpc(User user, int warrior) {
		return user.send(
			"&ctl=hotel&act=talkwarrior",
			"{\"oid\":1,\"qid\":10,\"rwarriorid\":%d}", warrior
		);
	}


	//public static const TAVERN_LEARN_SKILL:Object = {ctl:"rwarrior", act:"learnskill"};
	//LearnSkillProxy.as: line 29: 	App.net.send(new HttpGetParams(PHPConsts.TAVERN_LEARN_SKILL).getHttpString(), _loc_3, this.learnResult, this.learnFailure, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.doubleCheck);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_skill_err_warriornotexist"}

	/**
	 * learn skill
	 * @param user
	 * @param warrior
	 * @param skillId
	 * @return
	 */
	public static String tavernLearnSkill(User user, int warrior, int skillId) {
		return user.send(
			"&ctl=rwarrior&act=learnskill",
			"{\"rwskillid\":%d,\"rwarriorid\":%d}", skillId, warrior
		);
	}


	//public static const TAVERN_BAT_SEND_GIFT:Object = {ctl:"hotel", act:"batchpresent"};
	//BatSendGiftProxy.as: line 28: 	App.net.send(new HttpGetParams(PHPConsts.TAVERN_BAT_SEND_GIFT).getHttpString(), {rwarriorid:param1.id}, this.sendSuccess, this.sendFailure, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.doubleCheck);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_home_err_rwarriornotexist"}

	/**
     * 全部送礼
     * @param user
     * @param warrior
     * @return 
     */
	public static String tavernBatSendGift(User user, int warrior) {
		return user.send(
			"&act=batchpresent&ctl=hotel",
			"{\"rwarriorid\":%d}", warrior
		);
	}


	//public static const FRIEND_VISIT:Object = {ctl:"friend", act:"visitfriend"};
	//<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"><html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8" /><title> - </title><style>body {	font-size:76%;	font-family:"Lucida Grande", Verdana, Lucida, Arial, Helvetica, sans-serif;	background-color:#FEFEFE;	color:#333333;	margin:0;}a{color:#f60;}a:hover{text-decoration:none;}.dialogtitle {	margin-bottom:10px;	font-weight:bold;}.dialogContent {	padding:10px;}</style><link rel="stylesheet" href="style/dialog.css" /></head><body><div style="margin:100px auto;width:500px;"><table border="0" cellspacing="0" cellpadding="0" id="windowTable">	<tr>		<td colspan="2" class="td9TL"></td>		<td class="td9TC"></td>		<td colspan="2" class="td9TR"></td>	</tr>	<tr>		<td class="td9ML2"></td>		<td class="td9ML"></td>		<td class="td9MC" id="windowContent"><div>	<div class="dialogtitle"><div></div></div>    <div class="dialogContent">    	<div style="width:450px;">       	方法【visitfriend】未定义，请联系网站管理员。<br />		<div align="center" style="margin-top:10px;">    <a href="javascript:history.back();"></a>		</div>    	</div>    </div></div>               </td>		<td class="td9MR"></td>		<td class="td9MR2"></td>	</tr>	<tr>		<td colspan="2" class="td9BL"></td>		<td class="td9BC"></td>		<td colspan="2" class="td9BR"></td>	</tr></table></div></body></html>

	/**
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String friendVisit(User user) {
		return user.send(
			"&act=visitfriend&ctl=friend",
			null
		);
	}


	//public static const FRIEND_GET_BOX:Object = {ctl:"friend", act:"getftbox"};
	//<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"><html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8" /><title> - </title><style>body {	font-size:76%;	font-family:"Lucida Grande", Verdana, Lucida, Arial, Helvetica, sans-serif;	background-color:#FEFEFE;	color:#333333;	margin:0;}a{color:#f60;}a:hover{text-decoration:none;}.dialogtitle {	margin-bottom:10px;	font-weight:bold;}.dialogContent {	padding:10px;}</style><link rel="stylesheet" href="style/dialog.css" /></head><body><div style="margin:100px auto;width:500px;"><table border="0" cellspacing="0" cellpadding="0" id="windowTable">	<tr>		<td colspan="2" class="td9TL"></td>		<td class="td9TC"></td>		<td colspan="2" class="td9TR"></td>	</tr>	<tr>		<td class="td9ML2"></td>		<td class="td9ML"></td>		<td class="td9MC" id="windowContent"><div>	<div class="dialogtitle"><div></div></div>    <div class="dialogContent">    	<div style="width:450px;">       	方法【getftbox】未定义，请联系网站管理员。<br />		<div align="center" style="margin-top:10px;">    <a href="javascript:history.back();"></a>		</div>    	</div>    </div></div>               </td>		<td class="td9MR"></td>		<td class="td9MR2"></td>	</tr>	<tr>		<td colspan="2" class="td9BL"></td>		<td class="td9BC"></td>		<td colspan="2" class="td9BR"></td>	</tr></table></div></body></html>

	/**
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String friendGetBox(User user) {
		return user.send(
			"&act=getftbox&ctl=friend",
			null
		);
	}


	//public static const FRIEND_LIST:Object = {ctl:"rfriend", act:"rfriendlist"};
	//FriendsManager.as: line 128: 	App.net.send(new HttpGetParams(PHPConsts.FRIEND_LIST).getHttpString(), _loc_1, this.onFriendListLoaded, this.failedLoad, "default", "default", "default", RequestType.GAME_LOAD).jumpOutOfQueue();
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_roleinitok","data":{"rfriendList":[],"_cls":"rfriendList"}}

	/**
	 * get friend list
	 * @param user
	 * @return
	 */
	public static String friendList(User user) {
		return user.send(
			"&act=rfriendlist&ctl=rfriend",
			null
		);
	}


	//public static const SERVANT_LIST:Object = {ctl:"servant", act:"searchservants"};
	//FriendsManager.as: line 169: 	App.net.send(new HttpGetParams(PHPConsts.SERVANT_LIST).getHttpString(), null, this.onServantListLoaded, this.failedLoad, "default", "default", "default", RequestType.GAME_LOAD).jumpOutOfQueue();
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_ser_suc_getserServantsok","data":{"list":[{"_cls":"rolebaseInfo","id":"1012518","level":"63","uid":"B1C72CA83B1453F2A8FA77B23223E22C","tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/72a0df78bf8c85f279bce38be5e21afb5e0fec79093c6f33ee0c7a93c9d94b40\/30","uname":"%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%CE%B2%D0%AD","isfriend":0,"serstat":0,"yellowvip":0,"yellowyearvip":0,"yellowviplevel":0},{"_cls":"rolebaseInfo","id":"997071","level":"61","uid":"BEC588D10F6EC982E9FDDD60CDC4FA83","tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/70fb95bc2540bb9173f434789fa6482f8c948cb9463f5d4ec38569815da8040f\/30","uname":"%EF%BC%8D%E9%9A%8F%E6%80%A7%E3%81%A3","isfriend":0,"serstat":1,"yellowvip":0,"yellowyearvip":0,"yellowviplevel":0},{"_cls":"rolebaseInfo","id":"995290","level":"61","uid":"1704C92BCD3D7080F7D1F56A799CB07D","tinyurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/2d7c83b1ac618316a4df3d10acfcf3b98d71a66c100183866f4509e8bc4e8ae5\/30","uname":"%E7%A0%B4%E7%A2%8E%E3%81%AE%E5%BF%B5","isfriend":0,"serstat":1,"yellowvip":0,"yellowyearvip":0,"yellowviplevel":0},{"_cls":"rolebaseInfo","id":"1014186","level":"63","uid":"06B0AFF032A7F18C34F483ABC2A039D8","tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/c5ae6cde08828a629d44b2d5ec738406579547a77c9bc93d9a41b6149cfaa0a8\/30","uname":"%E2%8A%99%E4%BE%BD%E6%9C%B2%E9%AD%85%E2%8A%99","isfriend":0,"serstat":0,"yellowvip":0,"yellowyearvip":0,"yellowviplevel":0},{"_cls":"rolebaseInfo","id":"992947","level":"61","uid":"218C6C5098414BAA1E100AF2E59B9739","tinyurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/95dac2d0238d3f7bd5007a95c179cba5a7cb6457d773eabd797075aeb24da40d\/30","uname":"%E4%B8%8D%E8%99%9A%E4%BC%AA%E6%80%8E%E4%B9%88%E6%B4%BB%E3%80%82","isfriend":0,"serstat":0,"yellowvip":0,"yellowyearvip":0,"yellowviplevel":0},{"_cls":"rolebaseInfo","id":"1008326","level":"63","uid":"63A3A61CC93A80C38DEF01D81908C139","tinyurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/a3b4f421c655798aa84f6f4001611a7f3fd8dffaeef677de602eabb148466637\/30","uname":"%E6%9C%89%E5%AE%89%E5%85%A8%E6%84%9F%E7%9A%84%E7%94%B7%E5%AD%A9","isfriend":0,"serstat":1,"yellowvip":0,"yellowyearvip":0,"yellowviplevel":0}],"_cls":"getSomeservants"}}

	/**
	 * get servant list
	 * @param user
	 * @return
	 */
	public static String servantList(User user) {
		return user.send(
			"&act=searchservants&ctl=servant",
			null
		);
	}


	//public static const GETFRIEND_IN_GAME:Object = {ctl:"friend", act:"getfriends"};
	//FriendsManager.as: line 206: 	App.net.send(new HttpGetParams(PHPConsts.GETFRIEND_IN_GAME).getHttpString(), _loc_1, this.loadGameFriendComplete).jumpOutOfQueue();
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_friend_suc_getfriendlistok","data":{"friendList":[{"_cls":"rolebaseInfo","id":"732334","level":"64","uid":"4618E29B9ED7D8028CE0753F0FD8EA07","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/d8219673598dbd6f3529a3639fb21cf6460844320ceeb24b292c9b126f362e41\/50","tinyurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/d8219673598dbd6f3529a3639fb21cf6460844320ceeb24b292c9b126f362e41\/30","uname":"%E5%B8%85%E7%8B%82%E5%82%B2%E9%85%B7","gender":"\u7537","rwcfgid":"rwcfgid","power":"power","isfriend":1,"serstat":0,"yellowvip":0,"yellowyearvip":0,"yellowviplevel":0,"nowluckystar":"20","canbless":0,"canfire":"1","isonline":0},{"_cls":"rolebaseInfo","id":"1553015","level":"70","uid":"CFAE597A87063185B5B86D66615023ED","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/06d264c84a243d4696be1f890c588d2216d6b2b444664cb543a4103620892fca\/50","tinyurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/06d264c84a243d4696be1f890c588d2216d6b2b444664cb543a4103620892fca\/30","uname":"%E6%8A%97%E5%91%BD%E4%B9%8B%E5%BF%83","gender":"\u7537","rwcfgid":"rwcfgid","power":"power","isfriend":1,"serstat":1,"yellowvip":1,"yellowyearvip":1,"yellowviplevel":8,"nowluckystar":"20","canbless":0,"canfire":"1","isonline":1},{"_cls":"rolebaseInfo","id":"1671832","level":"65","uid":"AEC114DEB3D75362F103101D5030E77D","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/9663e46f64cf283510cfea1f4ebdc6373237267140097d6697ed0b0339f2339a\/50","tinyurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/9663e46f64cf283510cfea1f4ebdc6373237267140097d6697ed0b0339f2339a\/30","uname":"%E6%B7%A1%E6%B7%A1%E7%9A%84%E8%93%9D","gender":"\u5973","rwcfgid":"rwcfgid","power":"power","isfriend":1,"serstat":0,"yellowvip":0,"yellowyearvip":0,"yellowviplevel":0,"nowluckystar":"20","canbless":0,"canfire":"1","isonline":0}],"_cls":"getFriendList"}}

	/**
	 * get game friends
	 * @param user
	 * @return
	 */
	public static String getfriendInGame(User user) {
		return user.send(
			"&act=getfriends&ctl=friend",
			null
		);
	}


	//public static const INVITE_IN_GAME_FRIEND:Object = {ctl:"friend", act:"invitefriend"};
	//MainInfoMgr.as: line 864: 	App.net.send(new HttpGetParams(PHPConsts.INVITE_IN_GAME_FRIEND).getHttpString(), {frid:param1}, this.inviteComplete).jumpOutOfQueue();
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_friend_err_friendnotexist"}

	/**
	 * add game friend
	 * @param user
	 * @param fid
	 * @return
	 */
	public static String inviteInGameFriend(User user, int fid) {
		return user.send(
			"&act=invitefriend&ctl=friend",
			"{\"frid\":%d}", fid
		);
	}


	//public static const FRIEND_CHECK:Object = {ctl:"friend", act:"dofriend"};
	//MailItem.as: line 221: 	App.net.send(new HttpGetParams(PHPConsts.FRIEND_CHECK).getHttpString(), {frid:_loc_2, type:param1}, this.checkOk).jumpOutOfQueue();
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_friend_err_friendnotexist"}

	/**
	 * accept friend
	 * @param user
	 * @param fid
	 * @return
	 */
	public static String friendCheck(User user,int fid) {
		return user.send(
			"&act=dofriend&ctl=friend",
			"{\"type\":1,\"frid\":%d}", fid
		);
	}


	//public static const DELETE_FRIEND:Object = {ctl:"friend", act:"delfriend"};
	//FriendRender.as: line 289: 	App.net.send(new HttpGetParams(PHPConsts.DELETE_FRIEND).getHttpString(), {frid:param1.id}, this.delComplete);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_friend_err_friendnotexist"}

	/**
	 * delete friend
	 * @param user
	 * @param fid
	 * @return
	 */
	public static String deleteFriend(User user,int fid) {
		return user.send(
			"&act=delfriend&ctl=friend",
			"{\"frid\":%d}", fid
		);
	}


	//public static const GET_ARENAV2:Object = {ctl:"rarenanew", act:"getarena"};
	//InitArenaDataService.as: line 31: 	App.net.send(new HttpGetParams(PHPConsts.GET_ARENAV2).getHttpString(), null, this.getChallengerDataDone, this.failureHandler, "default", "default", "default", RequestType.DIALOG_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getarenaok","data":{"rank":21844,"wins":0,"orank":21844,"awardstatus":1,"arenausers":[{"_cls":"arenanewlist","id":"435679","level":"63","status":"status","uname":"%E9%9D%92%E6%98%A5%E5%9C%A8%E5%B2%81%E6%9C%88%E4%B8%AD%E9%97%AA%E5%85%89","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/7fe09d3230f2c6471707b1bc69134bc9e83b5c5e79f1ad9b116775ee4c542488\/30","rank":22924,"wins":0,"power":292538,"warriorcfgid":"33","groupinfo":[{"_cls":"warriorVo","id":"2364028","name":"\u6885\u8d85\u98ce","level":"54","warriorcfgid":"14","quality":4,"maxhp":39352,"hp":39352,"speed":15,"exp":"2104800","nextexp":4210360,"score":56456,"en":0,"maxen":9000,"enSpd":300,"attack":9760,"defence":7533,"skillattack":10120,"skilldefence":5032,"arrEquipedskill":[27,12,0,0],"arrAllskillVo":{"27":{"_cls":"skillBase","slevel":"1","scfgid":27},"12":{"_cls":"skillBase","slevel":"1","scfgid":12},"1012":{"_cls":"skillBase","slevel":"1","scfgid":1012},"1027":{"_cls":"skillBase","slevel":"1","scfgid":1027}},"con":2441,"constars":1,"conquality":4,"conquot":12.6,"str":1102,"strstars":4,"strquality":3,"strquot":11,"force":1074,"forcestars":2,"forcequality":3,"forcequot":10,"agi":1811,"agistars":2,"agiquality":4,"agiquot":13.3,"accuracy":1,"block":35,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":10,"antisubattack":10,"antisubdefence":10,"antiunskill":10,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":"21836331","2":"226071339","3":"16548756","4":"226071340"},"artiItem":{"1":0,"2":0,"3":0,"4":0},"fateItem":{"1":"23292677","2":"28832132","3":"23293501","4":"85852204","5":"200649098"},"friendship":"45","shiplevel":"2","type":"rwarrior","attackprior":3921,"jobtype":"wtype","internode":"6","vigour":"523","totalvigour":"23273","loopinternode":-1,"loopintertimes":0,"talknum":0,"equipedItemInfo":[{"_cls":"rbagitemVo1","id":21836331,"itemcfgid":85,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":5335752,"sub":"0"}],"equipopenhole":3,"effectvalue":797,"nexteffectvalue":807,"level":53,"isfit":1,"score":3985,"rwarriorId":2364028,"arrEquipedstone":[140,139,137],"upprice":5334017,"attackprior":1039,"nextattackprior":1047,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":226071339,"itemcfgid":66,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":2120,"sub":"0"}],"equipopenhole":2,"effectvalue":234,"nexteffectvalue":245,"level":0,"isfit":1,"score":1170,"rwarriorId":2364028,"arrEquipedstone":null,"upprice":0,"attackprior":775,"nextattackprior":779,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":16548756,"itemcfgid":60,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":147173,"sub":"0"}],"equipopenhole":2,"effectvalue":277,"nexteffectvalue":283,"level":23,"isfit":1,"score":1385,"rwarriorId":2364028,"arrEquipedstone":null,"upprice":146128,"attackprior":252,"nextattackprior":256,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":226071340,"itemcfgid":67,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":2120,"sub":"0"}],"equipopenhole":2,"effectvalue":234,"nexteffectvalue":245,"level":0,"isfit":1,"score":1170,"rwarriorId":2364028,"arrEquipedstone":null,"upprice":0,"attackprior":775,"nextattackprior":779,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null}],"arrUnlockedskin":[1],"skinid":1,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":5400,"alchemy_limit_con":5400,"alchemy_limit_force":5400,"alchemy_limit_str":5400,"resetnamenum":"0"},{"_cls":"warriorVo","id":"1164938","name":"\u9ec4\u84c9","level":"56","warriorcfgid":"12","quality":4,"maxhp":28936,"hp":28936,"speed":15,"exp":"3681970","nextexp":4784100,"score":57376,"en":0,"maxen":12000,"enSpd":300,"attack":12710,"defence":5934,"skillattack":15470,"skilldefence":3816,"arrEquipedskill":[25,10,0,0],"arrAllskillVo":{"25":{"_cls":"skillBase","slevel":"1","scfgid":25},"10":{"_cls":"skillBase","slevel":"1","scfgid":10},"1001":{"_cls":"skillBase","slevel":"1","scfgid":1001},"1016":{"_cls":"skillBase","slevel":"1","scfgid":1016}},"con":1573,"constars":2,"conquality":3,"conquot":10,"str":1692,"strstars":4,"strquality":3,"strquot":11.3,"force":2084,"forcestars":1,"forcequality":4,"forcequot":12,"agi":1278,"agistars":3,"agiquality":3,"agiquot":10.6,"accuracy":1,"block":10,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":10,"antisubattack":10,"antisubdefence":10,"antiunskill":10,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":"14730441","2":"17200243","3":"18302524","4":"18293482"},"artiItem":{"1":"20484351","2":"22515838","3":"19883472","4":"28784265"},"fateItem":{"1":"23291669","2":"23291775","3":"23293624","4":"148441619","5":"148442545"},"friendship":"220","shiplevel":"2","type":"rwarrior","attackprior":2352,"jobtype":"wtype","internode":"3","vigour":"2725","totalvigour":"14225","loopinternode":-1,"loopintertimes":0,"talknum":0,"equipedItemInfo":[{"_cls":"rbagitemVo1","id":14730441,"itemcfgid":57,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":239402,"sub":"0"}],"equipopenhole":2,"effectvalue":301,"nexteffectvalue":307,"level":27,"isfit":1,"score":1505,"rwarriorId":1164938,"arrEquipedstone":[129,131],"upprice":238357,"attackprior":268,"nextattackprior":272,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":17200243,"itemcfgid":58,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":591201,"sub":"0"}],"equipopenhole":2,"effectvalue":337,"nexteffectvalue":343,"level":33,"isfit":1,"score":1685,"rwarriorId":1164938,"arrEquipedstone":[134],"upprice":590156,"attackprior":292,"nextattackprior":296,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":18302524,"itemcfgid":60,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1045,"sub":"0"}],"equipopenhole":2,"effectvalue":139,"nexteffectvalue":145,"level":0,"isfit":1,"score":695,"rwarriorId":1164938,"arrEquipedstone":null,"upprice":0,"attackprior":160,"nextattackprior":164,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":18293482,"itemcfgid":63,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":591796,"sub":"0"}],"equipopenhole":2,"effectvalue":495,"nexteffectvalue":504,"level":33,"isfit":1,"score":2475,"rwarriorId":1164938,"arrEquipedstone":[136,134],"upprice":590156,"attackprior":512,"nextattackprior":516,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null}],"arrUnlockedskin":[1],"skinid":1,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":5600,"alchemy_limit_con":5600,"alchemy_limit_force":5600,"alchemy_limit_str":5600,"resetnamenum":"0"},{"_cls":"warriorVo","id":"785986","name":"\u9752\u6625\u5728\u5c81\u6708\u4e2d\u95ea\u5149","level":"63","warriorcfgid":"33","quality":3,"maxhp":42460,"hp":42460,"speed":"25","exp":"5628188","nextexp":32131900,"score":77876,"en":0,"maxen":15000,"enSpd":300,"attack":19630,"defence":8361,"skillattack":19270,"skilldefence":5434,"arrEquipedskill":["113","15","0","0"],"arrAllskillVo":{"110":{"_cls":"skillBase","slevel":"1","scfgid":110},"113":{"_cls":"skillBase","slevel":"1","scfgid":113},"128":{"_cls":"skillBase","slevel":"1","scfgid":128},"131":{"_cls":"skillBase","slevel":"1","scfgid":131},"1031":{"_cls":"skillBase","slevel":"1","scfgid":1031},"1030":{"_cls":"skillBase","slevel":"1","scfgid":1030},"5":{"_cls":"skillBase","slevel":"1","scfgid":5},"2":{"_cls":"skillBase","slevel":"1","scfgid":2},"15":{"_cls":"skillBase","slevel":"1","scfgid":15}},"con":2700,"constars":1,"conquality":3,"conquot":9.4,"str":3016,"strstars":4,"strquality":3,"strquot":11,"force":2844,"forcestars":4,"forcequality":2,"forcequot":8.3,"agi":2087,"agistars":4,"agiquality":2,"agiquot":8.3,"accuracy":11,"block":11,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":10,"antisubattack":10,"antisubdefence":10,"antiunskill":10,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":"225696472","2":"220452144","3":"220452143","4":"220447986"},"artiItem":{"1":"132010165","2":"148447387","3":"32702136","4":"18553309"},"fateItem":{"1":"28831768","2":"23290328","3":"23292745","4":"28831907","5":"85852322","6":"200649100"},"friendship":"0","shiplevel":"1","type":"rwarrior","attackprior":5864,"jobtype":"wtype","internode":"9","vigour":"2468","totalvigour":"25518","loopinternode":-1,"loopintertimes":0,"talknum":0,"equipedItemInfo":[{"_cls":"rbagitemVo1","id":225696472,"itemcfgid":89,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1821565,"sub":"0"}],"equipopenhole":3,"effectvalue":787,"nexteffectvalue":799,"level":40,"isfit":1,"score":3935,"rwarriorId":785986,"arrEquipedstone":null,"upprice":1819330,"attackprior":1515,"nextattackprior":1523,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":220452144,"itemcfgid":66,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":2120,"sub":"0"}],"equipopenhole":2,"effectvalue":234,"nexteffectvalue":245,"level":0,"isfit":1,"score":1170,"rwarriorId":785986,"arrEquipedstone":null,"upprice":0,"attackprior":775,"nextattackprior":779,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":220452143,"itemcfgid":68,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":2120,"sub":"0"}],"equipopenhole":2,"effectvalue":234,"nexteffectvalue":245,"level":0,"isfit":1,"score":1170,"rwarriorId":785986,"arrEquipedstone":null,"upprice":0,"attackprior":775,"nextattackprior":779,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":220447986,"itemcfgid":91,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":2443582,"sub":"0"}],"equipopenhole":3,"effectvalue":823,"nexteffectvalue":835,"level":43,"isfit":1,"score":4115,"rwarriorId":785986,"arrEquipedstone":null,"upprice":2441347,"attackprior":1539,"nextattackprior":1547,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null}],"arrUnlockedskin":[3,4],"skinid":4,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":6300,"alchemy_limit_con":6300,"alchemy_limit_force":6300,"alchemy_limit_str":6300,"resetnamenum":"0"},{"_cls":"warriorVo","id":"4018839","name":"\u5929\u5c71\u59e5\u59e5","level":"49","warriorcfgid":"15","quality":4,"maxhp":25130,"hp":25130,"speed":25,"exp":"1672720","nextexp":2387320,"score":47545,"en":0,"maxen":9000,"enSpd":300,"attack":9230,"defence":5883,"skillattack":10515,"skilldefence":4032,"arrEquipedskill":[28,13,0,0],"arrAllskillVo":{"28":{"_cls":"skillBase","slevel":"1","scfgid":28},"13":{"_cls":"skillBase","slevel":"1","scfgid":13},"1006":{"_cls":"skillBase","slevel":"1","scfgid":1006},"1021":{"_cls":"skillBase","slevel":"1","scfgid":1021}},"con":1360,"constars":5,"conquality":3,"conquot":11.4,"str":1026,"strstars":1,"strquality":3,"strquot":9,"force":1123,"forcestars":1,"forcequality":3,"forcequot":9,"agi":1311,"agistars":1,"agiquality":4,"agiquot":12,"accuracy":0,"block":35,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":10,"antisubattack":10,"antisubdefence":10,"antiunskill":10,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":"13819936","2":"18773878","3":"15541908","4":"220807473"},"artiItem":{"1":0,"2":0,"3":0,"4":0},"fateItem":{"1":"200649025","2":"200649097","3":"200649027","4":"200649028"},"friendship":"15","shiplevel":"2","type":"rwarrior","attackprior":2275,"jobtype":"wtype","internode":-1,"vigour":"2020","totalvigour":"2020","loopinternode":-1,"loopintertimes":0,"talknum":0,"equipedItemInfo":[{"_cls":"rbagitemVo1","id":13819936,"itemcfgid":53,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":187916,"sub":"0"}],"equipopenhole":2,"effectvalue":236,"nexteffectvalue":241,"level":25,"isfit":1,"score":1180,"rwarriorId":4018839,"arrEquipedstone":null,"upprice":187311,"attackprior":140,"nextattackprior":144,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":18773878,"itemcfgid":58,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1045,"sub":"0"}],"equipopenhole":2,"effectvalue":139,"nexteffectvalue":145,"level":0,"isfit":1,"score":695,"rwarriorId":4018839,"arrEquipedstone":null,"upprice":0,"attackprior":160,"nextattackprior":164,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":15541908,"itemcfgid":40,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1550,"sub":"0"}],"equipopenhole":1,"effectvalue":130,"nexteffectvalue":138,"level":0,"isfit":1,"score":650,"rwarriorId":4018839,"arrEquipedstone":null,"upprice":0,"attackprior":220,"nextattackprior":222,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":220807473,"itemcfgid":67,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":2120,"sub":"0"}],"equipopenhole":2,"effectvalue":234,"nexteffectvalue":245,"level":0,"isfit":1,"score":1170,"rwarriorId":4018839,"arrEquipedstone":null,"upprice":0,"attackprior":775,"nextattackprior":779,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null}],"arrUnlockedskin":[1],"skinid":1,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":4900,"alchemy_limit_con":4900,"alchemy_limit_force":4900,"alchemy_limit_str":4900,"resetnamenum":"0"},{"_cls":"warriorVo","id":"4006565","name":"\u897f\u6bd2","level":"49","warriorcfgid":"17","quality":4,"maxhp":23858,"hp":23858,"speed":15,"exp":"2021210","nextexp":2387320,"score":47755,"en":0,"maxen":9000,"enSpd":300,"attack":11090,"defence":5508,"skillattack":10395,"skilldefence":3532,"arrEquipedskill":[30,15,0,0],"arrAllskillVo":{"30":{"_cls":"skillBase","slevel":"1","scfgid":30},"15":{"_cls":"skillBase","slevel":"1","scfgid":15},"1004":{"_cls":"skillBase","slevel":"1","scfgid":1004},"1019":{"_cls":"skillBase","slevel":"1","scfgid":1019}},"con":1254,"constars":3,"conquality":3,"conquot":10.2,"str":1398,"strstars":1,"strquality":4,"strquot":12,"force":1099,"forcestars":1,"forcequality":3,"forcequot":9,"agi":1136,"agistars":1,"agiquality":3,"agiquot":9,"accuracy":10,"block":10,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":10,"antisubattack":10,"antisubdefence":10,"antiunskill":10,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":"199609180","2":"21836321","3":"200584296","4":"21836308"},"artiItem":{"1":0,"2":0,"3":0,"4":0},"fateItem":{"1":"200649029","2":"200649030","3":"200649099","4":"200649026"},"friendship":"15","shiplevel":"2","type":"rwarrior","attackprior":3290,"jobtype":"wtype","internode":-1,"vigour":"2020","totalvigour":"2020","loopinternode":-1,"loopintertimes":0,"talknum":0,"equipedItemInfo":[{"_cls":"rbagitemVo1","id":199609180,"itemcfgid":65,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":2120,"sub":"0"}],"equipopenhole":2,"effectvalue":234,"nexteffectvalue":245,"level":0,"isfit":1,"score":1170,"rwarriorId":4006565,"arrEquipedstone":null,"upprice":0,"attackprior":775,"nextattackprior":779,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":21836321,"itemcfgid":62,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1640,"sub":"0"}],"equipopenhole":2,"effectvalue":198,"nexteffectvalue":207,"level":0,"isfit":1,"score":990,"rwarriorId":4006565,"arrEquipedstone":null,"upprice":0,"attackprior":380,"nextattackprior":384,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":200584296,"itemcfgid":68,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":2120,"sub":"0"}],"equipopenhole":2,"effectvalue":234,"nexteffectvalue":245,"level":0,"isfit":1,"score":1170,"rwarriorId":4006565,"arrEquipedstone":null,"upprice":0,"attackprior":775,"nextattackprior":779,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":21836308,"itemcfgid":63,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1640,"sub":"0"}],"equipopenhole":2,"effectvalue":198,"nexteffectvalue":207,"level":0,"isfit":1,"score":990,"rwarriorId":4006565,"arrEquipedstone":null,"upprice":0,"attackprior":380,"nextattackprior":384,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null}],"arrUnlockedskin":[1],"skinid":1,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":4900,"alchemy_limit_con":4900,"alchemy_limit_force":4900,"alchemy_limit_str":4900,"resetnamenum":"0"}],"skinid":4},{"_cls":"arenanewlist","id":"1479247","level":"67","status":"status","uname":"___%E5%8E%9F%E6%9D%A5%E5%A4%AA%E7%86%9F%E6%82%89%E4%BA%86%E4%BC%9A%E9%99%8C%E7%94%9F","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/4fab3571c2a80dab9522c77c0c639cffcfc5c28fe7ff57196359df11c461ac07\/30","rank":22923,"wins":21,"power":533012,"warriorcfgid":"32","groupinfo":[{"_cls":"warriorVo","id":"4114092","name":"\u59ff\u6001\u4e36\u6cab","level":"58","warriorcfgid":"12","quality":5,"maxhp":50452,"hp":50452,"speed":15,"exp":"471539","nextexp":5431600,"score":91386,"en":0,"maxen":12000,"enSpd":300,"attack":20471,"defence":11276,"skillattack":24715,"skilldefence":8248,"arrEquipedskill":[25,10,0,0],"arrAllskillVo":{"25":{"_cls":"skillBase","slevel":"1","scfgid":25},"10":{"_cls":"skillBase","slevel":"1","scfgid":10},"1001":{"_cls":"skillBase","slevel":"1","scfgid":1001},"1016":{"_cls":"skillBase","slevel":"1","scfgid":1016}},"con":2934,"constars":1,"conquality":4,"conquot":12,"str":3390,"strstars":3,"strquality":4,"strquot":13.6,"force":4273,"forcestars":1,"forcequality":5,"forcequot":16,"agi":3072,"agistars":2,"agiquality":4,"agiquot":12.8,"accuracy":0,"block":14,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":12,"antisubattack":12,"antisubdefence":12,"antiunskill":12,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":25,"equipedItem":{"1":"314190550","2":"309677266","3":"307136095","4":"310698682"},"artiItem":{"1":"258656234","2":"259268202","3":"267332222","4":"267303467"},"fateItem":{"1":"282934388","2":"286238491","3":"267342588","4":"280340442","5":"297287691"},"friendship":"300","shiplevel":"3","type":"rwarrior","attackprior":9792,"jobtype":"wtype","internode":-1,"vigour":"3947","totalvigour":"322697","loopinternode":"-1","loopintertimes":"4","talknum":0,"equipedItemInfo":[{"_cls":"rbagitemVo1","id":314190550,"itemcfgid":93,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":492817,"sub":"0"}],"equipopenhole":3,"effectvalue":1028,"nexteffectvalue":1048,"level":30,"isfit":1,"score":5140,"rwarriorId":4114092,"arrEquipedstone":[131],"upprice":489677,"attackprior":2140,"nextattackprior":2148,"soul":4,"arrSoulproperty":{"property":"reduceskilldmg","valuetype":1,"value":25,"max":40},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":4,"property":"con","value":92,"max":"150"},"2":{"propertyquality":3,"property":"skilldefence","value":804,"max":"1500"}}},{"_cls":"rbagitemVo1","id":309677266,"itemcfgid":94,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":492817,"sub":"0"}],"equipopenhole":3,"effectvalue":1028,"nexteffectvalue":1048,"level":30,"isfit":1,"score":5140,"rwarriorId":4114092,"arrEquipedstone":[127],"upprice":489677,"attackprior":2140,"nextattackprior":2148,"soul":2,"arrSoulproperty":{"property":"reducedmg","valuetype":1,"value":25,"max":40},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":2,"property":"attack","value":371,"max":"1500"},"2":{"propertyquality":3,"property":"maxhp","value":1824,"max":"3600"}}},{"_cls":"rbagitemVo1","id":307136095,"itemcfgid":96,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1634224,"sub":"0"}],"equipopenhole":3,"effectvalue":1208,"nexteffectvalue":1228,"level":39,"isfit":1,"score":6040,"rwarriorId":4114092,"arrEquipedstone":[],"upprice":1631084,"attackprior":2212,"nextattackprior":2220,"soul":5,"arrSoulproperty":{"property":"reducedmg","valuetype":1,"value":25,"max":40},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":3,"property":"agi","value":77,"max":"150"},"2":{"propertyquality":3,"property":"force","value":84,"max":"150"}}},{"_cls":"rbagitemVo1","id":310698682,"itemcfgid":95,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":492817,"sub":"0"}],"equipopenhole":3,"effectvalue":1028,"nexteffectvalue":1048,"level":30,"isfit":1,"score":5140,"rwarriorId":4114092,"arrEquipedstone":null,"upprice":489677,"attackprior":2140,"nextattackprior":2148,"soul":4,"arrSoulproperty":{"property":"reduceskilldmg","valuetype":1,"value":25,"max":40},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":4,"property":"defence","value":1040,"max":"1500"},"2":{"propertyquality":2,"property":"con","value":70,"max":"150"}}}],"arrUnlockedskin":[1],"skinid":1,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":5800,"alchemy_limit_con":5800,"alchemy_limit_force":5800,"alchemy_limit_str":5800,"resetnamenum":"1"},{"_cls":"warriorVo","id":"4197177","name":"\u59ff\u6001\u4e36\u5e05","level":"54","warriorcfgid":"31","quality":4,"maxhp":65372,"hp":65372,"speed":25,"exp":"1726309","nextexp":4210360,"score":86723,"en":0,"maxen":6000,"enSpd":300,"attack":16353,"defence":13719,"skillattack":15576,"skilldefence":9466,"arrEquipedskill":[97,85,0,0],"arrAllskillVo":{"97":{"_cls":"skillBase","slevel":"1","scfgid":97},"85":{"_cls":"skillBase","slevel":"1","scfgid":85},"1038":{"_cls":"skillBase","slevel":"1","scfgid":1038},"1045":{"_cls":"skillBase","slevel":"1","scfgid":1045}},"con":4121,"constars":5,"conquality":4,"conquot":15.2,"str":2456,"strstars":1,"strquality":4,"strquot":12,"force":2388,"forcestars":1,"forcequality":4,"forcequot":12,"agi":4233,"agistars":4,"agiquality":4,"agiquot":14.6,"accuracy":0,"block":35,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":12,"antisubattack":12,"antisubdefence":12,"antiunskill":12,"addattackdmg":36,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":17,"equipedItem":{"1":"321489654","2":"316802018","3":"319388381","4":"320297784"},"artiItem":{"1":0,"2":0,"3":0,"4":0},"fateItem":{"1":"300941329","2":"259273048","3":"267342462","4":0,"5":0},"friendship":"1175","shiplevel":"2","type":"rwarrior","attackprior":9664,"jobtype":"wtype","internode":"13","vigour":"18415","totalvigour":"221415","loopinternode":-1,"loopintertimes":0,"talknum":0,"equipedItemInfo":[{"_cls":"rbagitemVo1","id":321489654,"itemcfgid":93,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":492817,"sub":"0"}],"equipopenhole":3,"effectvalue":1028,"nexteffectvalue":1048,"level":30,"isfit":1,"score":5140,"rwarriorId":4197177,"arrEquipedstone":null,"upprice":489677,"attackprior":2140,"nextattackprior":2148,"soul":4,"arrSoulproperty":{"property":"addskillattackdmg","valuetype":1,"value":11,"max":40},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":2,"property":"skillattack","value":470,"max":"1500"},"2":{"propertyquality":4,"property":"str","value":116,"max":"150"}}},{"_cls":"rbagitemVo1","id":316802018,"itemcfgid":94,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":492817,"sub":"0"}],"equipopenhole":3,"effectvalue":1028,"nexteffectvalue":1048,"level":30,"isfit":1,"score":5140,"rwarriorId":4197177,"arrEquipedstone":null,"upprice":489677,"attackprior":2140,"nextattackprior":2148,"soul":4,"arrSoulproperty":{"property":"reduceskilldmg","valuetype":1,"value":17,"max":40},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":2,"property":"attack","value":428,"max":"1500"},"2":{"propertyquality":3,"property":"skillattack","value":746,"max":"1500"}}},{"_cls":"rbagitemVo1","id":319388381,"itemcfgid":96,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":790020,"sub":"0"}],"equipopenhole":3,"effectvalue":1088,"nexteffectvalue":1108,"level":33,"isfit":1,"score":5440,"rwarriorId":4197177,"arrEquipedstone":null,"upprice":786880,"attackprior":2164,"nextattackprior":2172,"soul":4,"arrSoulproperty":{"property":"addattackdmg","valuetype":1,"value":36,"max":40},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":3,"property":"skillattack","value":670,"max":"1500"},"2":{"propertyquality":2,"property":"attack","value":559,"max":"1500"}}},{"_cls":"rbagitemVo1","id":320297784,"itemcfgid":95,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":492817,"sub":"0"}],"equipopenhole":3,"effectvalue":1028,"nexteffectvalue":1048,"level":30,"isfit":1,"score":5140,"rwarriorId":4197177,"arrEquipedstone":null,"upprice":489677,"attackprior":2140,"nextattackprior":2148,"soul":5,"arrSoulproperty":{"property":"reduceskilldmg","valuetype":1,"value":25,"max":40},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":2,"property":"force","value":49,"max":"150"},"2":{"propertyquality":2,"property":"attack","value":536,"max":"1500"}}}],"arrUnlockedskin":[1],"skinid":1,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":5400,"alchemy_limit_con":5400,"alchemy_limit_force":5400,"alchemy_limit_str":5400,"resetnamenum":"1"},{"_cls":"warriorVo","id":3337774,"name":"___\u539f\u6765\u592a\u719f\u6089\u4e86\u4f1a\u964c\u751f","level":"67","warriorcfgid":"32","quality":5,"maxhp":104267,"hp":104267,"speed":"15","exp":"35409312","nextexp":65400700,"score":163938,"en":0,"maxen":15000,"enSpd":300,"attack":34364,"defence":19101,"skillattack":40280,"skilldefence":17991,"arrEquipedskill":["108","1","79","10"],"arrAllskillVo":{"108":{"_cls":"skillBase","slevel":"1","scfgid":108},"111":{"_cls":"skillBase","slevel":"1","scfgid":111},"126":{"_cls":"skillBase","slevel":"1","scfgid":126},"129":{"_cls":"skillBase","slevel":"1","scfgid":129},"1031":{"_cls":"skillBase","slevel":"1","scfgid":1031},"1030":{"_cls":"skillBase","slevel":"1","scfgid":1030},"10":{"_cls":"skillBase","slevel":"1","scfgid":10},"9":{"_cls":"skillBase","slevel":"1","scfgid":9},"79":{"_cls":"skillBase","slevel":"1","scfgid":79},"1":{"_cls":"skillBase","slevel":"1","scfgid":1}},"con":5960,"constars":4,"conquality":4,"conquot":14.6,"str":5968,"strstars":1,"strquality":5,"strquot":16.4,"force":7706,"forcestars":4,"forcequality":5,"forcequot":19.2,"agi":6027,"agistars":5,"agiquality":4,"agiquot":15.6,"accuracy":2,"block":16,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":10,"antisubattack":10,"antisubdefence":10,"antiunskill":10,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":26,"equipedItem":{"1":"306202128","2":"298963242","3":"291856375","4":"308586672"},"artiItem":{"1":"314500258","2":"272225644","3":"288918223","4":"288918079"},"fateItem":{"1":"281115519","2":"282933363","3":"282932941","4":"282934773","5":"297287979","6":"300941546"},"friendship":"0","shiplevel":"1","type":"rwarrior","attackprior":10786,"jobtype":"wtype","internode":"9","vigour":"12858","totalvigour":"327158","loopinternode":-1,"loopintertimes":0,"talknum":0,"equipedItemInfo":[{"_cls":"rbagitemVo1","id":306202128,"itemcfgid":93,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1161213,"sub":"0"}],"equipopenhole":3,"effectvalue":1148,"nexteffectvalue":1168,"level":36,"isfit":1,"score":5740,"rwarriorId":3337774,"arrEquipedstone":[141,140,138],"upprice":1158073,"attackprior":2188,"nextattackprior":2196,"soul":3,"arrSoulproperty":{"property":"addskillattackdmg","valuetype":1,"value":29,"max":40},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":3,"property":"con","value":80,"max":"150"},"2":{"propertyquality":2,"property":"attack","value":354,"max":"1500"}}},{"_cls":"rbagitemVo1","id":298963242,"itemcfgid":94,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":492817,"sub":"0"}],"equipopenhole":3,"effectvalue":1028,"nexteffectvalue":1048,"level":30,"isfit":1,"score":5140,"rwarriorId":3337774,"arrEquipedstone":[137,140,143],"upprice":489677,"attackprior":2140,"nextattackprior":2148,"soul":2,"arrSoulproperty":{"property":"addskillattackdmg","valuetype":1,"value":25,"max":40},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":2,"property":"skilldefence","value":564,"max":"1500"},"2":{"propertyquality":4,"property":"skilldefence","value":1073,"max":"1500"}}},{"_cls":"rbagitemVo1","id":291856375,"itemcfgid":96,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":492817,"sub":"0"}],"equipopenhole":3,"effectvalue":1028,"nexteffectvalue":1048,"level":30,"isfit":1,"score":5140,"rwarriorId":3337774,"arrEquipedstone":[139,137,138],"upprice":489677,"attackprior":2140,"nextattackprior":2148,"soul":5,"arrSoulproperty":{"property":"reduceskilldmg","valuetype":1,"value":25,"max":40},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":3,"property":"str","value":77,"max":"150"},"2":{"propertyquality":2,"property":"attack","value":420,"max":"1500"}}},{"_cls":"rbagitemVo1","id":308586672,"itemcfgid":95,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":2019903,"sub":"0"}],"equipopenhole":3,"effectvalue":1248,"nexteffectvalue":1268,"level":41,"isfit":1,"score":6240,"rwarriorId":3337774,"arrEquipedstone":[132,133,135],"upprice":2016763,"attackprior":2228,"nextattackprior":2236,"soul":5,"arrSoulproperty":{"property":"reduceskilldmg","valuetype":1,"value":26,"max":40},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":3,"property":"force","value":74,"max":"150"},"2":{"propertyquality":3,"property":"maxhp","value":1827,"max":"3600"}}}],"arrUnlockedskin":[3,4],"skinid":4,"arrPetInfo":null,"alchemy_agi":"13","alchemy_con":"8","alchemy_force":"8","alchemy_str":"5","alchemy_limit_agi":6700,"alchemy_limit_con":6700,"alchemy_limit_force":6700,"alchemy_limit_str":6700,"resetnamenum":"0"},{"_cls":"warriorVo","id":"4147024","name":"\u59ff\u6001\u4e36","level":"56","warriorcfgid":"15","quality":5,"maxhp":73361,"hp":73361,"speed":25,"exp":"4056149","nextexp":4784100,"score":96306,"en":0,"maxen":9000,"enSpd":300,"attack":17590,"defence":16282,"skillattack":14533,"skilldefence":11072,"arrEquipedskill":[28,13,0,0],"arrAllskillVo":{"28":{"_cls":"skillBase","slevel":"1","scfgid":28},"13":{"_cls":"skillBase","slevel":"1","scfgid":13},"1006":{"_cls":"skillBase","slevel":"1","scfgid":1006},"1021":{"_cls":"skillBase","slevel":"1","scfgid":1021}},"con":4867,"constars":5,"conquality":4,"conquot":15.2,"str":3008,"strstars":1,"strquality":4,"strquot":12,"force":2392,"forcestars":1,"forcequality":4,"forcequot":12,"agi":4586,"agistars":1,"agiquality":5,"agiquot":16,"accuracy":0,"block":36,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":12,"antisubattack":12,"antisubdefence":12,"antiunskill":12,"addattackdmg":38,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":"307849416","2":"318659183","3":"305895768","4":"317175554"},"artiItem":{"1":"270202849","2":0,"3":"257784070","4":"256251910"},"fateItem":{"1":"275979103","2":"282935157","3":"274187065","4":"291476585","5":"304872739"},"friendship":"640","shiplevel":"2","type":"rwarrior","attackprior":9930,"jobtype":"wtype","internode":-1,"vigour":"7898","totalvigour":"313898","loopinternode":"11","loopintertimes":"1","talknum":0,"equipedItemInfo":[{"_cls":"rbagitemVo1","id":307849416,"itemcfgid":93,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":492817,"sub":"0"}],"equipopenhole":3,"effectvalue":1028,"nexteffectvalue":1048,"level":30,"isfit":1,"score":5140,"rwarriorId":4147024,"arrEquipedstone":[],"upprice":489677,"attackprior":2140,"nextattackprior":2148,"soul":2,"arrSoulproperty":{"property":"addskillattackdmg","valuetype":1,"value":25,"max":40},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":2,"property":"con","value":44,"max":"150"},"2":{"propertyquality":3,"property":"maxhp","value":1537,"max":"3600"}}},{"_cls":"rbagitemVo1","id":318659183,"itemcfgid":94,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":492817,"sub":"0"}],"equipopenhole":3,"effectvalue":1028,"nexteffectvalue":1048,"level":30,"isfit":1,"score":5140,"rwarriorId":4147024,"arrEquipedstone":null,"upprice":489677,"attackprior":2140,"nextattackprior":2148,"soul":2,"arrSoulproperty":{"property":"addattackdmg","valuetype":1,"value":38,"max":40},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":3,"property":"skillattack","value":823,"max":"1500"},"2":{"propertyquality":2,"property":"force","value":56,"max":"150"}}},{"_cls":"rbagitemVo1","id":305895768,"itemcfgid":96,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":492817,"sub":"0"}],"equipopenhole":3,"effectvalue":1028,"nexteffectvalue":1048,"level":30,"isfit":1,"score":5140,"rwarriorId":4147024,"arrEquipedstone":[],"upprice":489677,"attackprior":2140,"nextattackprior":2148,"soul":1,"arrSoulproperty":{"property":"addskillattackdmg","valuetype":1,"value":28,"max":40},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":4,"property":"force","value":99,"max":"150"},"2":{"propertyquality":3,"property":"str","value":85,"max":"150"}}},{"_cls":"rbagitemVo1","id":317175554,"itemcfgid":95,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":492817,"sub":"0"}],"equipopenhole":3,"effectvalue":1028,"nexteffectvalue":1048,"level":30,"isfit":1,"score":5140,"rwarriorId":4147024,"arrEquipedstone":null,"upprice":489677,"attackprior":2140,"nextattackprior":2148,"soul":4,"arrSoulproperty":{"property":"addattackdmg","valuetype":1,"value":38,"max":40},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":3,"property":"defence","value":697,"max":"1500"},"2":{"propertyquality":3,"property":"defence","value":807,"max":"1500"}}}],"arrUnlockedskin":[1],"skinid":1,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":5600,"alchemy_limit_con":5600,"alchemy_limit_force":5600,"alchemy_limit_str":5600,"resetnamenum":"1"},{"_cls":"warriorVo","id":"4233898","name":"\u59ff\u6001\u4e36\u5a9a","level":"53","warriorcfgid":"49","quality":4,"maxhp":47155,"hp":47155,"speed":15,"exp":"3427359","nextexp":3950220,"score":77058,"en":0,"maxen":6000,"enSpd":300,"attack":21315,"defence":8801,"skillattack":15755,"skilldefence":6906,"arrEquipedskill":[181,182,0,0],"arrAllskillVo":{"181":{"_cls":"skillBase","slevel":"1","scfgid":181},"182":{"_cls":"skillBase","slevel":"1","scfgid":182},"1309":{"_cls":"skillBase","slevel":"1","scfgid":1309},"1310":{"_cls":"skillBase","slevel":"1","scfgid":1310}},"con":2508,"constars":1,"conquality":4,"conquot":12.4,"str":3633,"strstars":2,"strquality":4,"strquot":13.3,"force":2801,"forcestars":4,"forcequality":3,"forcequot":11,"agi":2373,"agistars":4,"agiquality":3,"agiquot":11,"accuracy":10,"block":10,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":10,"antisubattack":10,"antisubdefence":10,"antiunskill":10,"addattackdmg":20,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":"275987177","2":"290499718","3":"274384857","4":"291856384"},"artiItem":{"1":0,"2":0,"3":0,"4":0},"fateItem":{"1":"267342438","2":"287890996","3":"284894901","4":0,"5":0},"friendship":"1660","shiplevel":"2","type":"rwarrior","attackprior":7072,"jobtype":"wtype","internode":"8","vigour":"26523","totalvigour":"269523","loopinternode":-1,"loopintertimes":0,"talknum":0,"equipedItemInfo":[{"_cls":"rbagitemVo1","id":275987177,"itemcfgid":89,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1821565,"sub":"0"}],"equipopenhole":3,"effectvalue":787,"nexteffectvalue":799,"level":40,"isfit":1,"score":3935,"rwarriorId":4233898,"arrEquipedstone":[],"upprice":1819330,"attackprior":1515,"nextattackprior":1523,"soul":3,"arrSoulproperty":{"property":"addskillattackdmg","valuetype":1,"value":21,"max":30},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":4,"property":"str","value":100,"max":"125"},"2":{"propertyquality":4,"property":"force","value":88,"max":"125"}}},{"_cls":"rbagitemVo1","id":290499718,"itemcfgid":90,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":491912,"sub":"0"}],"equipopenhole":3,"effectvalue":667,"nexteffectvalue":679,"level":30,"isfit":1,"score":3335,"rwarriorId":4233898,"arrEquipedstone":null,"upprice":489677,"attackprior":1435,"nextattackprior":1443,"soul":2,"arrSoulproperty":{"property":"addattackdmg","valuetype":1,"value":17,"max":30},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":2,"property":"agi","value":60,"max":"125"},"2":{"propertyquality":2,"property":"maxhp","value":1139,"max":"3000"}}},{"_cls":"rbagitemVo1","id":274384857,"itemcfgid":92,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":2443582,"sub":"0"}],"equipopenhole":3,"effectvalue":823,"nexteffectvalue":835,"level":43,"isfit":1,"score":4115,"rwarriorId":4233898,"arrEquipedstone":[],"upprice":2441347,"attackprior":1539,"nextattackprior":1547,"soul":5,"arrSoulproperty":{"property":"addskillattackdmg","valuetype":1,"value":20,"max":30},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":2,"property":"skilldefence","value":454,"max":"1250"},"2":{"propertyquality":3,"property":"defence","value":662,"max":"1250"}}},{"_cls":"rbagitemVo1","id":291856384,"itemcfgid":91,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":2018998,"sub":"0"}],"equipopenhole":3,"effectvalue":799,"nexteffectvalue":811,"level":41,"isfit":1,"score":3995,"rwarriorId":4233898,"arrEquipedstone":null,"upprice":2016763,"attackprior":1523,"nextattackprior":1531,"soul":5,"arrSoulproperty":{"property":"addattackdmg","valuetype":1,"value":20,"max":30},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":2,"property":"con","value":39,"max":"125"},"2":{"propertyquality":2,"property":"skilldefence","value":406,"max":"1250"}}}],"arrUnlockedskin":[1],"skinid":1,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":5300,"alchemy_limit_con":5300,"alchemy_limit_force":5300,"alchemy_limit_str":5300,"resetnamenum":"1"}],"skinid":4},{"_cls":"arenanewlist","id":"1013787","level":"62","status":"status","uname":"%E8%B6%85%E9%80%9F%E5%B0%8F%E6%A2%85","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/e3e6b4bc45ca4d19ead9c1afa57b04e2b0ebac144ff41a3cb65326c3463d79c1\/30","rank":21744,"wins":0,"power":481986,"warriorcfgid":"33","groupinfo":[{"_cls":"warriorVo","id":"3262422","name":"\u5929\u5c71\u7ae5\u59e5","level":"56","warriorcfgid":"15","quality":5,"maxhp":99060,"hp":99060,"speed":25,"exp":"610091","nextexp":4784100,"score":123610,"en":0,"maxen":9000,"enSpd":300,"attack":18558,"defence":20049,"skillattack":16220,"skilldefence":13997,"arrEquipedskill":[28,13,0,0],"arrAllskillVo":{"28":{"_cls":"skillBase","slevel":"1","scfgid":28},"13":{"_cls":"skillBase","slevel":"1","scfgid":13},"1006":{"_cls":"skillBase","slevel":"1","scfgid":1006},"1021":{"_cls":"skillBase","slevel":"1","scfgid":1021}},"con":6175,"constars":5,"conquality":4,"conquot":15.2,"str":2659,"strstars":1,"strquality":4,"strquot":12,"force":2215,"forcestars":1,"forcequality":4,"forcequot":12,"agi":5433,"agistars":1,"agiquality":5,"agiquot":16,"accuracy":0,"block":39,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":14,"antisubattack":14,"antisubdefence":14,"antiunskill":14,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":"158810365","2":"94565487","3":"90525729","4":"85443360"},"artiItem":{"1":"240484545","2":0,"3":"62622401","4":"59822686"},"fateItem":{"1":"78635729","2":"240471333","3":"62476388","4":"128044490","5":"171765405"},"friendship":"795","shiplevel":"3","type":"rwarrior","attackprior":7901,"jobtype":"wtype","internode":-1,"vigour":"8136","totalvigour":"201636","loopinternode":"11","loopintertimes":0,"talknum":0,"equipedItemInfo":[{"_cls":"rbagitemVo1","id":158810365,"itemcfgid":93,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":2227054,"sub":"0"}],"equipopenhole":3,"effectvalue":1268,"nexteffectvalue":1288,"level":42,"isfit":1,"score":6340,"rwarriorId":3262422,"arrEquipedstone":[143,141,136],"upprice":2223914,"attackprior":2236,"nextattackprior":2244,"soul":2,"arrSoulproperty":{"property":"addskillattackdmg","valuetype":1,"value":38,"max":40},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":3,"property":"agi","value":87,"max":"150"},"2":{"propertyquality":2,"property":"force","value":45,"max":"150"}}},{"_cls":"rbagitemVo1","id":94565487,"itemcfgid":90,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1821565,"sub":"0"}],"equipopenhole":3,"effectvalue":787,"nexteffectvalue":799,"level":40,"isfit":1,"score":3935,"rwarriorId":3262422,"arrEquipedstone":[132,137,139],"upprice":1819330,"attackprior":1515,"nextattackprior":1523,"soul":2,"arrSoulproperty":{"property":"addskillattackdmg","valuetype":1,"value":20,"max":30},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":3,"property":"skillattack","value":595,"max":"1250"},"2":{"propertyquality":2,"property":"force","value":48,"max":"125"}}},{"_cls":"rbagitemVo1","id":90525729,"itemcfgid":92,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1821565,"sub":"0"}],"equipopenhole":3,"effectvalue":787,"nexteffectvalue":799,"level":40,"isfit":1,"score":3935,"rwarriorId":3262422,"arrEquipedstone":[138,136,137],"upprice":1819330,"attackprior":1515,"nextattackprior":1523,"soul":1,"arrSoulproperty":{"property":"reduceskilldmg","valuetype":1,"value":30,"max":30},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":2,"property":"con","value":33,"max":"125"},"2":{"propertyquality":3,"property":"skilldefence","value":542,"max":"1250"}}},{"_cls":"rbagitemVo1","id":85443360,"itemcfgid":91,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1821565,"sub":"0"}],"equipopenhole":3,"effectvalue":787,"nexteffectvalue":799,"level":40,"isfit":1,"score":3935,"rwarriorId":3262422,"arrEquipedstone":[137,132,139],"upprice":1819330,"attackprior":1515,"nextattackprior":1523,"soul":5,"arrSoulproperty":{"property":"reducedmg","valuetype":1,"value":20,"max":30},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":2,"property":"skilldefence","value":289,"max":"1250"},"2":{"propertyquality":3,"property":"attack","value":613,"max":"1250"}}}],"arrUnlockedskin":[1],"skinid":1,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":5600,"alchemy_limit_con":5600,"alchemy_limit_force":5600,"alchemy_limit_str":5600,"resetnamenum":"0"},{"_cls":"warriorVo","id":"2189097","name":"\u8d85\u901f\u5c0f\u6885","level":"62","warriorcfgid":"33","quality":5,"maxhp":64296,"hp":64296,"speed":"25","exp":"15101100","nextexp":24957400,"score":142530,"en":0,"maxen":15000,"enSpd":300,"attack":42900,"defence":17277,"skillattack":33095,"skilldefence":11280,"arrEquipedskill":["113","78","84","15"],"arrAllskillVo":{"110":{"_cls":"skillBase","slevel":"1","scfgid":110},"113":{"_cls":"skillBase","slevel":"1","scfgid":113},"128":{"_cls":"skillBase","slevel":"1","scfgid":128},"131":{"_cls":"skillBase","slevel":"1","scfgid":131},"1031":{"_cls":"skillBase","slevel":"1","scfgid":1031},"1030":{"_cls":"skillBase","slevel":"1","scfgid":1030},"2":{"_cls":"skillBase","slevel":"1","scfgid":2},"78":{"_cls":"skillBase","slevel":"1","scfgid":78},"84":{"_cls":"skillBase","slevel":"1","scfgid":84},"15":{"_cls":"skillBase","slevel":"1","scfgid":15}},"con":4528,"constars":4,"conquality":4,"conquot":15,"str":7269,"strstars":2,"strquality":5,"strquot":17.6,"force":4989,"forcestars":2,"forcequality":4,"forcequot":13.3,"agi":4790,"agistars":2,"agiquality":4,"agiquot":13.3,"accuracy":12,"block":16,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":14,"antisubattack":14,"antisubdefence":14,"antiunskill":14,"addattackdmg":0,"addskillattackdmg":18,"reducedmg":25,"reduceskilldmg":0,"equipedItem":{"1":"176132875","2":"166395538","3":"180250615","4":"178020975"},"artiItem":{"1":"67633713","2":"74671684","3":"168787101","4":"168786612"},"fateItem":{"1":"143218163","2":"130012579","3":"72503624","4":"251053331","5":"148984077","6":"251054376"},"friendship":"0","shiplevel":"1","type":"rwarrior","attackprior":10572,"jobtype":"wtype","internode":"4","vigour":"17520","totalvigour":"219320","loopinternode":-1,"loopintertimes":0,"talknum":0,"equipedItemInfo":[{"_cls":"rbagitemVo1","id":176132875,"itemcfgid":93,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1822470,"sub":"0"}],"equipopenhole":3,"effectvalue":1228,"nexteffectvalue":1248,"level":40,"isfit":1,"score":6140,"rwarriorId":2189097,"arrEquipedstone":[144,142,137],"upprice":1819330,"attackprior":2220,"nextattackprior":2228,"soul":3,"arrSoulproperty":{"property":"addattackdmg","valuetype":1,"value":25,"max":40},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":2,"property":"defence","value":357,"max":"1500"},"2":{"propertyquality":3,"property":"attack","value":705,"max":"1500"}}},{"_cls":"rbagitemVo1","id":166395538,"itemcfgid":94,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":2227054,"sub":"0"}],"equipopenhole":3,"effectvalue":1268,"nexteffectvalue":1288,"level":42,"isfit":1,"score":6340,"rwarriorId":2189097,"arrEquipedstone":[140,137,135],"upprice":2223914,"attackprior":2236,"nextattackprior":2244,"soul":3,"arrSoulproperty":{"property":"reducedmg","valuetype":1,"value":25,"max":40},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":2,"property":"force","value":63,"max":"150"},"2":{"propertyquality":3,"property":"str","value":89,"max":"150"}}},{"_cls":"rbagitemVo1","id":180250615,"itemcfgid":96,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1161213,"sub":"0"}],"equipopenhole":3,"effectvalue":1148,"nexteffectvalue":1168,"level":36,"isfit":1,"score":5740,"rwarriorId":2189097,"arrEquipedstone":[140,137,135],"upprice":1158073,"attackprior":2188,"nextattackprior":2196,"soul":3,"arrSoulproperty":{"property":"addskillattackdmg","valuetype":1,"value":18,"max":40},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":4,"property":"agi","value":112,"max":"150"},"2":{"propertyquality":3,"property":"str","value":89,"max":"150"}}},{"_cls":"rbagitemVo1","id":178020975,"itemcfgid":95,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1161213,"sub":"0"}],"equipopenhole":3,"effectvalue":1148,"nexteffectvalue":1168,"level":36,"isfit":1,"score":5740,"rwarriorId":2189097,"arrEquipedstone":[140,138,137],"upprice":1158073,"attackprior":2188,"nextattackprior":2196,"soul":5,"arrSoulproperty":{"property":"addskillattackdmg","valuetype":1,"value":20,"max":40},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":3,"property":"agi","value":71,"max":"150"},"2":{"propertyquality":3,"property":"agi","value":72,"max":"150"}}}],"arrUnlockedskin":[3,4,6],"skinid":"6","arrPetInfo":null,"alchemy_agi":"37","alchemy_con":"15","alchemy_force":"40","alchemy_str":"12","alchemy_limit_agi":6200,"alchemy_limit_con":6200,"alchemy_limit_force":6200,"alchemy_limit_str":6200,"resetnamenum":"0"},{"_cls":"warriorVo","id":"4091448","name":"\u897f\u6bd2","level":"37","warriorcfgid":"17","quality":4,"maxhp":20760,"hp":20760,"speed":15,"exp":"52599","nextexp":488010,"score":44945,"en":0,"maxen":9000,"enSpd":300,"attack":10245,"defence":4935,"skillattack":8825,"skilldefence":3590,"arrEquipedskill":[30,15,0,0],"arrAllskillVo":{"30":{"_cls":"skillBase","slevel":"1","scfgid":30},"15":{"_cls":"skillBase","slevel":"1","scfgid":15},"1004":{"_cls":"skillBase","slevel":"1","scfgid":1004},"1019":{"_cls":"skillBase","slevel":"1","scfgid":1019}},"con":900,"constars":3,"conquality":3,"conquot":10.2,"str":1059,"strstars":1,"strquality":4,"strquot":12,"force":795,"forcestars":1,"forcequality":3,"forcequot":9,"agi":795,"agistars":1,"agiquality":3,"agiquot":9,"accuracy":10,"block":10,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":10,"antisubattack":10,"antisubdefence":10,"antiunskill":10,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":0,"2":0,"3":0,"4":0},"artiItem":{"1":0,"2":0,"3":0,"4":0},"fateItem":{"1":"251052531","2":"251052652","3":"251052692"},"friendship":"800","shiplevel":"2","type":"rwarrior","attackprior":740,"jobtype":"wtype","internode":-1,"vigour":"0","totalvigour":"0","loopinternode":-1,"loopintertimes":0,"talknum":0,"equipedItemInfo":[],"arrUnlockedskin":[1],"skinid":1,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":3700,"alchemy_limit_con":3700,"alchemy_limit_force":3700,"alchemy_limit_str":3700,"resetnamenum":"0"},{"_cls":"warriorVo","id":"4091429","name":"\u5317\u4e10","level":"44","warriorcfgid":"30","quality":4,"maxhp":31832,"hp":31832,"speed":15,"exp":"110589","nextexp":873930,"score":62543,"en":0,"maxen":6000,"enSpd":300,"attack":18695,"defence":6033,"skillattack":11316,"skilldefence":4622,"arrEquipedskill":[96,84,0,0],"arrAllskillVo":{"96":{"_cls":"skillBase","slevel":"1","scfgid":96},"84":{"_cls":"skillBase","slevel":"1","scfgid":84},"1037":{"_cls":"skillBase","slevel":"1","scfgid":1037},"1044":{"_cls":"skillBase","slevel":"1","scfgid":1044}},"con":1406,"constars":4,"conquality":3,"conquot":11.3,"str":2689,"strstars":1,"strquality":4,"strquot":12,"force":1186,"forcestars":1,"forcequality":3,"forcequot":9,"agi":1161,"agistars":2,"agiquality":3,"agiquot":10,"accuracy":10,"block":10,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":10,"antisubattack":10,"antisubdefence":10,"antiunskill":10,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":"49032372","2":"85443361","3":"49054147","4":0},"artiItem":{"1":0,"2":0,"3":0,"4":0},"fateItem":{"1":"171764455","2":"64559533","3":"251052649","4":"60399121"},"friendship":"770","shiplevel":"2","type":"rwarrior","attackprior":2413,"jobtype":"wtype","internode":"2","vigour":"8366","totalvigour":"35366","loopinternode":-1,"loopintertimes":0,"talknum":0,"equipedItemInfo":[{"_cls":"rbagitemVo1","id":49032372,"itemcfgid":25,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1322,"sub":"0"}],"equipopenhole":1,"effectvalue":28,"nexteffectvalue":30,"level":1,"isfit":1,"score":140,"rwarriorId":4091429,"arrEquipedstone":null,"upprice":1162,"attackprior":2,"nextattackprior":4,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":85443361,"itemcfgid":90,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":2226149,"sub":"0"}],"equipopenhole":3,"effectvalue":811,"nexteffectvalue":823,"level":42,"isfit":1,"score":4055,"rwarriorId":4091429,"arrEquipedstone":[],"upprice":2223914,"attackprior":1531,"nextattackprior":1539,"soul":3,"arrSoulproperty":{"property":"reducedmg","valuetype":1,"value":25,"max":30},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":4,"property":"con","value":92,"max":"125"},"2":{"propertyquality":2,"property":"skillattack","value":536,"max":"1250"}}},{"_cls":"rbagitemVo1","id":49054147,"itemcfgid":28,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":160,"sub":"0"}],"equipopenhole":1,"effectvalue":26,"nexteffectvalue":28,"level":0,"isfit":1,"score":130,"rwarriorId":4091429,"arrEquipedstone":null,"upprice":0,"attackprior":0,"nextattackprior":2,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null}],"arrUnlockedskin":[1],"skinid":1,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":4400,"alchemy_limit_con":4400,"alchemy_limit_force":4400,"alchemy_limit_str":4400,"resetnamenum":"0"},{"_cls":"warriorVo","id":"2490385","name":"\u9ec4\u84c9","level":"56","warriorcfgid":"12","quality":5,"maxhp":44252,"hp":44252,"speed":15,"exp":"2057077","nextexp":4784100,"score":96003,"en":0,"maxen":12000,"enSpd":300,"attack":24028,"defence":10452,"skillattack":27318,"skilldefence":7921,"arrEquipedskill":[25,10,0,0],"arrAllskillVo":{"25":{"_cls":"skillBase","slevel":"1","scfgid":25},"10":{"_cls":"skillBase","slevel":"1","scfgid":10},"1001":{"_cls":"skillBase","slevel":"1","scfgid":1001},"1016":{"_cls":"skillBase","slevel":"1","scfgid":1016}},"con":2441,"constars":1,"conquality":4,"conquot":12,"str":3526,"strstars":3,"strquality":4,"strquot":13.6,"force":3913,"forcestars":1,"forcequality":5,"forcequot":16,"agi":2434,"agistars":2,"agiquality":4,"agiquot":12.8,"accuracy":0,"block":10,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":10,"antisubattack":10,"antisubdefence":10,"antiunskill":10,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":"80116132","2":"181721865","3":"72963961","4":"71161422"},"artiItem":{"1":"55417396","2":"57942131","3":"53479195","4":"52182598"},"fateItem":{"1":"130125003","2":"251064222","3":"64559689","4":"64559692","5":"72503628"},"friendship":"960","shiplevel":"3","type":"rwarrior","attackprior":7845,"jobtype":"wtype","internode":-1,"vigour":"1218","totalvigour":"215218","loopinternode":"6","loopintertimes":"2","talknum":0,"equipedItemInfo":[{"_cls":"rbagitemVo1","id":80116132,"itemcfgid":89,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1821565,"sub":"0"}],"equipopenhole":3,"effectvalue":787,"nexteffectvalue":799,"level":40,"isfit":1,"score":3935,"rwarriorId":2490385,"arrEquipedstone":[135,138,140],"upprice":1819330,"attackprior":1515,"nextattackprior":1523,"soul":3,"arrSoulproperty":{"property":"reducedmg","valuetype":1,"value":20,"max":30},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":2,"property":"agi","value":35,"max":"125"},"2":{"propertyquality":2,"property":"con","value":52,"max":"125"}}},{"_cls":"rbagitemVo1","id":181721865,"itemcfgid":94,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1027741,"sub":"0"}],"equipopenhole":3,"effectvalue":1128,"nexteffectvalue":1148,"level":35,"isfit":1,"score":5640,"rwarriorId":2490385,"arrEquipedstone":[138,133,132],"upprice":1024601,"attackprior":2180,"nextattackprior":2188,"soul":2,"arrSoulproperty":{"property":"reduceskilldmg","valuetype":1,"value":36,"max":40},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":3,"property":"skilldefence","value":753,"max":"1500"},"2":{"propertyquality":3,"property":"agi","value":74,"max":"150"}}},{"_cls":"rbagitemVo1","id":72963961,"itemcfgid":92,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1821565,"sub":"0"}],"equipopenhole":3,"effectvalue":787,"nexteffectvalue":799,"level":40,"isfit":1,"score":3935,"rwarriorId":2490385,"arrEquipedstone":[133,134,136],"upprice":1819330,"attackprior":1515,"nextattackprior":1523,"soul":3,"arrSoulproperty":{"property":"reducedmg","valuetype":1,"value":20,"max":30},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":3,"property":"attack","value":548,"max":"1250"},"2":{"propertyquality":2,"property":"skillattack","value":403,"max":"1250"}}},{"_cls":"rbagitemVo1","id":71161422,"itemcfgid":91,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1821565,"sub":"0"}],"equipopenhole":3,"effectvalue":787,"nexteffectvalue":799,"level":40,"isfit":1,"score":3935,"rwarriorId":2490385,"arrEquipedstone":[132,134,133],"upprice":1819330,"attackprior":1515,"nextattackprior":1523,"soul":5,"arrSoulproperty":{"property":"addattackdmg","valuetype":1,"value":17,"max":30},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":2,"property":"agi","value":46,"max":"125"},"2":{"propertyquality":2,"property":"con","value":59,"max":"125"}}}],"arrUnlockedskin":[1],"skinid":1,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":5600,"alchemy_limit_con":5600,"alchemy_limit_force":5600,"alchemy_limit_str":5600,"resetnamenum":"0"}],"skinid":"6"},{"_cls":"arenanewlist","id":"1332124","level":"65","status":"status","uname":"%E3%83%A1%E3%82%9B%E6%93%A6%E4%B8%8D%E6%8E%89%E7%9A%84%E7%96%AF%E7%8B%82","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/466d8af2d61025117cb849b516f6d7c71353aa8e8f5a3627789acb3ebc1199b4\/30","rank":21644,"wins":0,"power":224967,"warriorcfgid":"33","groupinfo":[{"_cls":"warriorVo","id":"2969446","name":"\u30e1\u309b\u64e6\u4e0d\u6389\u7684\u75af\u72c2","level":"65","warriorcfgid":"33","quality":3,"maxhp":32584,"hp":32584,"speed":"15","exp":"40710092","nextexp":47798100,"score":60186,"en":0,"maxen":15000,"enSpd":300,"attack":15345,"defence":7206,"skillattack":12655,"skilldefence":4884,"arrEquipedskill":["110","128","7","5"],"arrAllskillVo":{"110":{"_cls":"skillBase","slevel":"1","scfgid":110},"113":{"_cls":"skillBase","slevel":"1","scfgid":113},"128":{"_cls":"skillBase","slevel":"1","scfgid":128},"131":{"_cls":"skillBase","slevel":"1","scfgid":131},"1031":{"_cls":"skillBase","slevel":"1","scfgid":1031},"1030":{"_cls":"skillBase","slevel":"1","scfgid":1030},"2":{"_cls":"skillBase","slevel":"1","scfgid":2},"5":{"_cls":"skillBase","slevel":"1","scfgid":5},"7":{"_cls":"skillBase","slevel":"1","scfgid":7}},"con":2117,"constars":5,"conquality":2,"conquot":8.6,"str":2609,"strstars":1,"strquality":3,"strquot":9,"force":2091,"forcestars":2,"forcequality":2,"forcequot":7.6,"agi":1942,"agistars":2,"agiquality":2,"agiquot":7.6,"accuracy":10,"block":11,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":10,"antisubattack":10,"antisubdefence":10,"antiunskill":10,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":"86892308","2":"86892309","3":"86892311","4":"150893824"},"artiItem":{"1":"158182261","2":"105120690","3":"154320902","4":"141246634"},"fateItem":{"1":"106264380","2":"110606438","3":"105928023","4":"105928064","5":"156219279","6":0},"friendship":"0","shiplevel":"1","type":"rwarrior","attackprior":3023,"jobtype":"wtype","internode":"3","vigour":"1278","totalvigour":"11578","loopinternode":-1,"loopintertimes":0,"talknum":0,"equipedItemInfo":[{"_cls":"rbagitemVo1","id":86892308,"itemcfgid":37,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":452154,"sub":"0"}],"equipopenhole":1,"effectvalue":402,"nexteffectvalue":410,"level":34,"isfit":1,"score":2010,"rwarriorId":2969446,"arrEquipedstone":[131],"upprice":450604,"attackprior":288,"nextattackprior":290,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":86892309,"itemcfgid":38,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":513850,"sub":"0"}],"equipopenhole":1,"effectvalue":410,"nexteffectvalue":418,"level":35,"isfit":1,"score":2050,"rwarriorId":2969446,"arrEquipedstone":[127],"upprice":512300,"attackprior":290,"nextattackprior":292,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":86892311,"itemcfgid":40,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":513850,"sub":"0"}],"equipopenhole":1,"effectvalue":410,"nexteffectvalue":418,"level":35,"isfit":1,"score":2050,"rwarriorId":2969446,"arrEquipedstone":[129],"upprice":512300,"attackprior":290,"nextattackprior":292,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":150893824,"itemcfgid":87,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":491412,"sub":"0"}],"equipopenhole":3,"effectvalue":567,"nexteffectvalue":577,"level":30,"isfit":1,"score":2835,"rwarriorId":2969446,"arrEquipedstone":[134,133,132],"upprice":489677,"attackprior":855,"nextattackprior":863,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null}],"arrUnlockedskin":[3,4],"skinid":"4","arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":6500,"alchemy_limit_con":6500,"alchemy_limit_force":6500,"alchemy_limit_str":6500,"resetnamenum":"0"},{"_cls":"warriorVo","id":"3274843","name":"\u4e54\u5cf0","level":"56","warriorcfgid":"10","quality":4,"maxhp":28072,"hp":28072,"speed":25,"exp":"4319615","nextexp":4784100,"score":45991,"en":0,"maxen":6000,"enSpd":300,"attack":7830,"defence":6888,"skillattack":7935,"skilldefence":4572,"arrEquipedskill":[20,8,0,0],"arrAllskillVo":{"20":{"_cls":"skillBase","slevel":"1","scfgid":20},"8":{"_cls":"skillBase","slevel":"1","scfgid":8},"1014":{"_cls":"skillBase","slevel":"1","scfgid":1014},"1029":{"_cls":"skillBase","slevel":"1","scfgid":1029}},"con":1741,"constars":1,"conquality":4,"conquot":12.6,"str":1166,"strstars":4,"strquality":3,"strquot":11,"force":1207,"forcestars":2,"forcequality":3,"forcequot":10,"agi":1636,"agistars":2,"agiquality":4,"agiquot":13.3,"accuracy":1,"block":35,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":10,"antisubattack":10,"antisubdefence":10,"antiunskill":10,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":"105923311","2":"83397266","3":"81215129","4":"95092990"},"artiItem":{"1":"102886017","2":0,"3":"101395071","4":"99867209"},"fateItem":{"1":"105931119","2":"105933045","3":"105931116","4":0,"5":0},"friendship":"180","shiplevel":"3","type":"rwarrior","attackprior":2212,"jobtype":"wtype","internode":"6","vigour":"2153","totalvigour":"10903","loopinternode":-1,"loopintertimes":0,"talknum":0,"equipedItemInfo":[{"_cls":"rbagitemVo1","id":105923311,"itemcfgid":61,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1640,"sub":"0"}],"equipopenhole":2,"effectvalue":198,"nexteffectvalue":207,"level":0,"isfit":1,"score":990,"rwarriorId":3274843,"arrEquipedstone":null,"upprice":0,"attackprior":380,"nextattackprior":384,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":83397266,"itemcfgid":34,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":111421,"sub":"0"}],"equipopenhole":1,"effectvalue":198,"nexteffectvalue":203,"level":24,"isfit":1,"score":990,"rwarriorId":3274843,"arrEquipedstone":null,"upprice":110431,"attackprior":128,"nextattackprior":130,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":81215129,"itemcfgid":32,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":68012,"sub":"0"}],"equipopenhole":1,"effectvalue":134,"nexteffectvalue":138,"level":20,"isfit":1,"score":670,"rwarriorId":3274843,"arrEquipedstone":null,"upprice":67442,"attackprior":60,"nextattackprior":62,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":95092990,"itemcfgid":63,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":870189,"sub":"0"}],"equipopenhole":2,"effectvalue":522,"nexteffectvalue":531,"level":36,"isfit":1,"score":2610,"rwarriorId":3274843,"arrEquipedstone":[],"upprice":868549,"attackprior":524,"nextattackprior":528,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null}],"arrUnlockedskin":[1],"skinid":1,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":5600,"alchemy_limit_con":5600,"alchemy_limit_force":5600,"alchemy_limit_str":5600,"resetnamenum":"0"},{"_cls":"warriorVo","id":"3398789","name":"\u6bb5\u8a89","level":"52","warriorcfgid":"9","quality":4,"maxhp":12420,"hp":12420,"speed":15,"exp":"2994480","nextexp":3702380,"score":29895,"en":0,"maxen":6000,"enSpd":300,"attack":7355,"defence":2955,"skillattack":5940,"skilldefence":2250,"arrEquipedskill":[19,7,0,0],"arrAllskillVo":{"19":{"_cls":"skillBase","slevel":"1","scfgid":19},"7":{"_cls":"skillBase","slevel":"1","scfgid":7},"1015":{"_cls":"skillBase","slevel":"1","scfgid":1015},"1000":{"_cls":"skillBase","slevel":"1","scfgid":1000}},"con":645,"constars":3,"conquality":3,"conquot":10.2,"str":1071,"strstars":1,"strquality":4,"strquot":12,"force":808,"forcestars":1,"forcequality":3,"forcequot":9,"agi":625,"agistars":2,"agiquality":3,"agiquot":10,"accuracy":10,"block":10,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":10,"antisubattack":10,"antisubdefence":10,"antiunskill":10,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":"0","2":"95087854","3":"0","4":"83397267"},"artiItem":{"1":0,"2":0,"3":0,"4":0},"fateItem":{"1":"0","2":"0","3":"0","4":0,"5":0},"friendship":"600","shiplevel":"2","type":"rwarrior","attackprior":1280,"jobtype":"wtype","internode":"1","vigour":"549","totalvigour":"1799","loopinternode":-1,"loopintertimes":0,"talknum":0,"equipedItemInfo":[{"_cls":"rbagitemVo1","id":95087854,"itemcfgid":34,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":68432,"sub":"0"}],"equipopenhole":1,"effectvalue":178,"nexteffectvalue":183,"level":20,"isfit":1,"score":890,"rwarriorId":3398789,"arrEquipedstone":null,"upprice":67442,"attackprior":120,"nextattackprior":122,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":83397267,"itemcfgid":35,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":68432,"sub":"0"}],"equipopenhole":1,"effectvalue":178,"nexteffectvalue":183,"level":20,"isfit":1,"score":890,"rwarriorId":3398789,"arrEquipedstone":null,"upprice":67442,"attackprior":120,"nextattackprior":122,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null}],"arrUnlockedskin":[1],"skinid":1,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":5200,"alchemy_limit_con":5200,"alchemy_limit_force":5200,"alchemy_limit_str":5200,"resetnamenum":"0"},{"_cls":"warriorVo","id":"3667185","name":"\u9ec4\u84c9","level":"55","warriorcfgid":"12","quality":4,"maxhp":24804,"hp":24804,"speed":15,"exp":"559645","nextexp":4483440,"score":42095,"en":0,"maxen":12000,"enSpd":300,"attack":8450,"defence":3747,"skillattack":10465,"skilldefence":2778,"arrEquipedskill":[25,10,0,0],"arrAllskillVo":{"25":{"_cls":"skillBase","slevel":"1","scfgid":25},"10":{"_cls":"skillBase","slevel":"1","scfgid":10},"1001":{"_cls":"skillBase","slevel":"1","scfgid":1001},"1016":{"_cls":"skillBase","slevel":"1","scfgid":1016}},"con":1052,"constars":2,"conquality":3,"conquot":10,"str":1170,"strstars":3,"strquality":3,"strquot":10.2,"force":1653,"forcestars":1,"forcequality":4,"forcequot":12,"agi":889,"agistars":3,"agiquality":3,"agiquot":10.6,"accuracy":1,"block":10,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":10,"antisubattack":10,"antisubdefence":10,"antiunskill":10,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":"83397265","2":"124353424","3":"0","4":"86892310"},"artiItem":{"1":0,"2":0,"3":0,"4":0},"fateItem":{"1":"110606298","2":"156219559","3":"105928036","4":"109980843","5":0},"friendship":"375","shiplevel":"2","type":"rwarrior","attackprior":1892,"jobtype":"wtype","internode":"2","vigour":"267","totalvigour":"8517","loopinternode":-1,"loopintertimes":0,"talknum":0,"equipedItemInfo":[{"_cls":"rbagitemVo1","id":83397265,"itemcfgid":33,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":125866,"sub":"0"}],"equipopenhole":1,"effectvalue":203,"nexteffectvalue":208,"level":25,"isfit":1,"score":1015,"rwarriorId":3667185,"arrEquipedstone":[],"upprice":124876,"attackprior":130,"nextattackprior":132,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":124353424,"itemcfgid":62,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1640,"sub":"0"}],"equipopenhole":2,"effectvalue":198,"nexteffectvalue":207,"level":0,"isfit":1,"score":990,"rwarriorId":3667185,"arrEquipedstone":null,"upprice":0,"attackprior":380,"nextattackprior":384,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":86892310,"itemcfgid":39,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":292490,"sub":"0"}],"equipopenhole":1,"effectvalue":378,"nexteffectvalue":386,"level":31,"isfit":1,"score":1890,"rwarriorId":3667185,"arrEquipedstone":null,"upprice":290940,"attackprior":282,"nextattackprior":284,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null}],"arrUnlockedskin":[1],"skinid":1,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":5500,"alchemy_limit_con":5500,"alchemy_limit_force":5500,"alchemy_limit_str":5500,"resetnamenum":"0"},{"_cls":"warriorVo","id":"4138883","name":"\u6885\u671d\u98ce","level":"30","warriorcfgid":"14","quality":4,"maxhp":17568,"hp":17568,"speed":15,"exp":"137095","nextexp":238790,"score":31560,"en":0,"maxen":9000,"enSpd":300,"attack":5755,"defence":3798,"skillattack":5655,"skilldefence":2812,"arrEquipedskill":[27,12,0,0],"arrAllskillVo":{"27":{"_cls":"skillBase","slevel":"1","scfgid":27},"12":{"_cls":"skillBase","slevel":"1","scfgid":12},"1012":{"_cls":"skillBase","slevel":"1","scfgid":1012},"1027":{"_cls":"skillBase","slevel":"1","scfgid":1027}},"con":1074,"constars":5,"conquality":3,"conquot":11.4,"str":751,"strstars":1,"strquality":3,"strquot":9,"force":751,"forcestars":1,"forcequality":3,"forcequot":9,"agi":906,"agistars":1,"agiquality":4,"agiquot":12,"accuracy":0,"block":35,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":10,"antisubattack":10,"antisubdefence":10,"antiunskill":10,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":"104298751","2":"150893618","3":"83397268","4":"124353425"},"artiItem":{"1":0,"2":0,"3":0,"4":0},"fateItem":{"1":0,"2":0,"3":0},"friendship":"0","shiplevel":"2","type":"rwarrior","attackprior":1940,"jobtype":"wtype","internode":-1,"vigour":"1299","totalvigour":"1299","loopinternode":-1,"loopintertimes":0,"talknum":0,"equipedItemInfo":[{"_cls":"rbagitemVo1","id":104298751,"itemcfgid":61,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":102800,"sub":"0"}],"equipopenhole":2,"effectvalue":378,"nexteffectvalue":387,"level":20,"isfit":1,"score":1890,"rwarriorId":4138883,"arrEquipedstone":null,"upprice":101160,"attackprior":460,"nextattackprior":464,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":150893618,"itemcfgid":62,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1640,"sub":"0"}],"equipopenhole":2,"effectvalue":198,"nexteffectvalue":207,"level":0,"isfit":1,"score":990,"rwarriorId":4138883,"arrEquipedstone":null,"upprice":0,"attackprior":380,"nextattackprior":384,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":83397268,"itemcfgid":36,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":68432,"sub":"0"}],"equipopenhole":1,"effectvalue":178,"nexteffectvalue":183,"level":20,"isfit":1,"score":890,"rwarriorId":4138883,"arrEquipedstone":null,"upprice":67442,"attackprior":120,"nextattackprior":122,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":124353425,"itemcfgid":63,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1640,"sub":"0"}],"equipopenhole":2,"effectvalue":198,"nexteffectvalue":207,"level":0,"isfit":1,"score":990,"rwarriorId":4138883,"arrEquipedstone":null,"upprice":0,"attackprior":380,"nextattackprior":384,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null}],"arrUnlockedskin":[1],"skinid":1,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":3000,"alchemy_limit_con":3000,"alchemy_limit_force":3000,"alchemy_limit_str":3000,"resetnamenum":"0"}],"skinid":"4"},{"_cls":"arenanewlist","id":"564496","level":"64","status":"status","uname":"ND-T","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/5c5a7a3fa78e6f9bb9459ea89116e8f7917b1fe4916f13fc5741ee270f03d997\/30","rank":21544,"wins":0,"power":243491,"warriorcfgid":"33","groupinfo":[{"_cls":"warriorVo","id":"1258640","name":"\u6bb5\u8a89","level":"50","warriorcfgid":"9","quality":4,"maxhp":17978,"hp":17978,"speed":15,"exp":"3226960","nextexp":3264700,"score":40370,"en":0,"maxen":6000,"enSpd":300,"attack":11185,"defence":4521,"skillattack":6910,"skilldefence":2854,"arrEquipedskill":[19,7,0,0],"arrAllskillVo":{"19":{"_cls":"skillBase","slevel":"1","scfgid":19},"7":{"_cls":"skillBase","slevel":"1","scfgid":7},"1015":{"_cls":"skillBase","slevel":"1","scfgid":1015},"1000":{"_cls":"skillBase","slevel":"1","scfgid":1000}},"con":824,"constars":1,"conquality":4,"conquot":12.4,"str":1347,"strstars":4,"strquality":4,"strquot":14.6,"force":902,"forcestars":4,"forcequality":3,"forcequot":11,"agi":777,"agistars":1,"agiquality":4,"agiquot":12,"accuracy":10,"block":10,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":10,"antisubattack":10,"antisubdefence":10,"antiunskill":10,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":"19025473","2":"19031762","3":"18933202","4":"18921085"},"artiItem":{"1":0,"2":0,"3":0,"4":0},"fateItem":{"1":"30703088","2":"30703082","3":0,"4":0,"5":0},"friendship":"665","shiplevel":"2","type":"rwarrior","attackprior":1220,"jobtype":"wtype","internode":"11","vigour":"2431","totalvigour":"24931","loopinternode":-1,"loopintertimes":0,"talknum":0,"equipedItemInfo":[{"_cls":"rbagitemVo1","id":19025473,"itemcfgid":53,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":2349,"sub":"0"}],"equipopenhole":2,"effectvalue":116,"nexteffectvalue":121,"level":1,"isfit":1,"score":580,"rwarriorId":1258640,"arrEquipedstone":null,"upprice":1744,"attackprior":44,"nextattackprior":48,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":19031762,"itemcfgid":54,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":2349,"sub":"0"}],"equipopenhole":2,"effectvalue":116,"nexteffectvalue":121,"level":1,"isfit":1,"score":580,"rwarriorId":1258640,"arrEquipedstone":null,"upprice":1744,"attackprior":44,"nextattackprior":48,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":18933202,"itemcfgid":36,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":6430,"sub":"0"}],"equipopenhole":1,"effectvalue":98,"nexteffectvalue":103,"level":4,"isfit":1,"score":490,"rwarriorId":1258640,"arrEquipedstone":null,"upprice":5440,"attackprior":88,"nextattackprior":90,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":18921085,"itemcfgid":55,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":2349,"sub":"0"}],"equipopenhole":2,"effectvalue":116,"nexteffectvalue":121,"level":1,"isfit":1,"score":580,"rwarriorId":1258640,"arrEquipedstone":null,"upprice":1744,"attackprior":44,"nextattackprior":48,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null}],"arrUnlockedskin":[1],"skinid":1,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":5000,"alchemy_limit_con":5000,"alchemy_limit_force":5000,"alchemy_limit_str":5000,"resetnamenum":"0"},{"_cls":"warriorVo","id":"1074523","name":"ND-T","level":"64","warriorcfgid":"33","quality":3,"maxhp":32342,"hp":32342,"speed":"15","exp":"10032720","nextexp":39736900,"score":65515,"en":0,"maxen":15000,"enSpd":300,"attack":19525,"defence":7647,"skillattack":12520,"skilldefence":4938,"arrEquipedskill":["110","128","15","0"],"arrAllskillVo":{"110":{"_cls":"skillBase","slevel":"1","scfgid":110},"113":{"_cls":"skillBase","slevel":"1","scfgid":113},"128":{"_cls":"skillBase","slevel":"1","scfgid":128},"131":{"_cls":"skillBase","slevel":"1","scfgid":131},"1031":{"_cls":"skillBase","slevel":"1","scfgid":1031},"1030":{"_cls":"skillBase","slevel":"1","scfgid":1030},"2":{"_cls":"skillBase","slevel":"1","scfgid":2},"7":{"_cls":"skillBase","slevel":"1","scfgid":7},"77":{"_cls":"skillBase","slevel":"1","scfgid":77},"78":{"_cls":"skillBase","slevel":"1","scfgid":78},"15":{"_cls":"skillBase","slevel":"1","scfgid":15}},"con":2021,"constars":1,"conquality":3,"conquot":9.4,"str":2985,"strstars":4,"strquality":3,"strquot":11,"force":1994,"forcestars":4,"forcequality":2,"forcequot":8.3,"agi":1819,"agistars":1,"agiquality":3,"agiquot":9,"accuracy":10,"block":10,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":10,"antisubattack":10,"antisubdefence":10,"antiunskill":10,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":"20062651","2":"21431469","3":"30728897","4":"23744386"},"artiItem":{"1":"83670305","2":"133721610","3":"60653944","4":"55871555"},"fateItem":{"1":"30703081","2":"30703083","3":0,"4":"30703080","5":0,"6":0},"friendship":"0","shiplevel":"1","type":"rwarrior","attackprior":2628,"jobtype":"wtype","internode":"11","vigour":"2824","totalvigour":"32124","loopinternode":-1,"loopintertimes":0,"talknum":0,"equipedItemInfo":[{"_cls":"rbagitemVo1","id":20062651,"itemcfgid":57,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":39711,"sub":"0"}],"equipopenhole":2,"effectvalue":211,"nexteffectvalue":217,"level":12,"isfit":1,"score":1055,"rwarriorId":1074523,"arrEquipedstone":[131,129],"upprice":38666,"attackprior":208,"nextattackprior":212,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":21431469,"itemcfgid":58,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":4586737,"sub":"0"}],"equipopenhole":2,"effectvalue":469,"nexteffectvalue":475,"level":55,"isfit":1,"score":2345,"rwarriorId":1074523,"arrEquipedstone":[130,129],"upprice":4585692,"attackprior":380,"nextattackprior":384,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":30728897,"itemcfgid":64,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1640,"sub":"0"}],"equipopenhole":2,"effectvalue":198,"nexteffectvalue":207,"level":0,"isfit":1,"score":990,"rwarriorId":1074523,"arrEquipedstone":[128,126],"upprice":0,"attackprior":380,"nextattackprior":384,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":23744386,"itemcfgid":63,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1640,"sub":"0"}],"equipopenhole":2,"effectvalue":198,"nexteffectvalue":207,"level":0,"isfit":1,"score":990,"rwarriorId":1074523,"arrEquipedstone":[127,125],"upprice":0,"attackprior":380,"nextattackprior":384,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null}],"arrUnlockedskin":[3,4],"skinid":4,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":6400,"alchemy_limit_con":6400,"alchemy_limit_force":6400,"alchemy_limit_str":6400,"resetnamenum":"0"},{"_cls":"warriorVo","id":"2465663","name":"\u6768\u8fc7","level":"55","warriorcfgid":"25","quality":4,"maxhp":18708,"hp":18708,"speed":15,"exp":"1725800","nextexp":4483440,"score":41880,"en":0,"maxen":9000,"enSpd":300,"attack":11210,"defence":4887,"skillattack":7480,"skilldefence":3098,"arrEquipedskill":[89,77,0,0],"arrAllskillVo":{"89":{"_cls":"skillBase","slevel":"1","scfgid":89},"77":{"_cls":"skillBase","slevel":"1","scfgid":77},"1033":{"_cls":"skillBase","slevel":"1","scfgid":1033},"1040":{"_cls":"skillBase","slevel":"1","scfgid":1040}},"con":989,"constars":3,"conquality":3,"conquot":10.2,"str":1382,"strstars":1,"strquality":4,"strquot":12,"force":1016,"forcestars":1,"forcequality":3,"forcequot":9,"agi":899,"agistars":1,"agiquality":3,"agiquot":9,"accuracy":10,"block":10,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":10,"antisubattack":10,"antisubdefence":10,"antiunskill":10,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":"20064225","2":"18933200","3":"20074239","4":"20062652"},"artiItem":{"1":0,"2":0,"3":0,"4":0},"fateItem":{"1":0,"2":0,"3":0,"4":0,"5":0},"friendship":"380","shiplevel":"2","type":"rwarrior","attackprior":1628,"jobtype":"wtype","internode":"0","vigour":"3069","totalvigour":"5569","loopinternode":-1,"loopintertimes":0,"talknum":0,"equipedItemInfo":[{"_cls":"rbagitemVo1","id":20064225,"itemcfgid":57,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1045,"sub":"0"}],"equipopenhole":2,"effectvalue":139,"nexteffectvalue":145,"level":0,"isfit":1,"score":695,"rwarriorId":2465663,"arrEquipedstone":null,"upprice":0,"attackprior":160,"nextattackprior":164,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":18933200,"itemcfgid":34,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":68432,"sub":"0"}],"equipopenhole":1,"effectvalue":178,"nexteffectvalue":183,"level":20,"isfit":1,"score":890,"rwarriorId":2465663,"arrEquipedstone":[126],"upprice":67442,"attackprior":120,"nextattackprior":122,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":20074239,"itemcfgid":56,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":14255,"sub":"0"}],"equipopenhole":2,"effectvalue":141,"nexteffectvalue":146,"level":6,"isfit":1,"score":705,"rwarriorId":2465663,"arrEquipedstone":[128],"upprice":13650,"attackprior":64,"nextattackprior":68,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":20062652,"itemcfgid":59,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":14695,"sub":"0"}],"equipopenhole":2,"effectvalue":175,"nexteffectvalue":181,"level":6,"isfit":1,"score":875,"rwarriorId":2465663,"arrEquipedstone":null,"upprice":13650,"attackprior":184,"nextattackprior":188,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null}],"arrUnlockedskin":[1],"skinid":1,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":5500,"alchemy_limit_con":5500,"alchemy_limit_force":5500,"alchemy_limit_str":5500,"resetnamenum":"0"},{"_cls":"warriorVo","id":"1330273","name":"\u4e54\u5cf0","level":"57","warriorcfgid":"10","quality":4,"maxhp":32414,"hp":32414,"speed":25,"exp":"2549800","nextexp":5099900,"score":52415,"en":0,"maxen":6000,"enSpd":300,"attack":10395,"defence":7881,"skillattack":8130,"skilldefence":5094,"arrEquipedskill":[20,8,0,0],"arrAllskillVo":{"20":{"_cls":"skillBase","slevel":"1","scfgid":20},"8":{"_cls":"skillBase","slevel":"1","scfgid":8},"1014":{"_cls":"skillBase","slevel":"1","scfgid":1014},"1029":{"_cls":"skillBase","slevel":"1","scfgid":1029}},"con":2027,"constars":3,"conquality":4,"conquot":13.8,"str":1189,"strstars":1,"strquality":4,"strquot":12,"force":1146,"forcestars":1,"forcequality":4,"forcequot":12,"agi":1897,"agistars":4,"agiquality":4,"agiquot":14.6,"accuracy":0,"block":35,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":10,"antisubattack":10,"antisubdefence":10,"antiunskill":10,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":"76218119","2":"133723043","3":"21445447","4":"20082713"},"artiItem":{"1":"29617228","2":"30752246","3":"25236166","4":"24276399"},"fateItem":{"1":"30703086","2":"30702512","3":0,"4":0,"5":0},"friendship":"525","shiplevel":"2","type":"rwarrior","attackprior":2280,"jobtype":"wtype","internode":"12","vigour":"3365","totalvigour":"29365","loopinternode":-1,"loopintertimes":0,"talknum":0,"equipedItemInfo":[{"_cls":"rbagitemVo1","id":76218119,"itemcfgid":61,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1640,"sub":"0"}],"equipopenhole":2,"effectvalue":198,"nexteffectvalue":207,"level":0,"isfit":1,"score":990,"rwarriorId":1330273,"arrEquipedstone":null,"upprice":0,"attackprior":380,"nextattackprior":384,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":133723043,"itemcfgid":62,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1640,"sub":"0"}],"equipopenhole":2,"effectvalue":198,"nexteffectvalue":207,"level":0,"isfit":1,"score":990,"rwarriorId":1330273,"arrEquipedstone":null,"upprice":0,"attackprior":380,"nextattackprior":384,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":21445447,"itemcfgid":40,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1550,"sub":"0"}],"equipopenhole":1,"effectvalue":130,"nexteffectvalue":138,"level":0,"isfit":1,"score":650,"rwarriorId":1330273,"arrEquipedstone":null,"upprice":0,"attackprior":220,"nextattackprior":222,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":20082713,"itemcfgid":59,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1045,"sub":"0"}],"equipopenhole":2,"effectvalue":139,"nexteffectvalue":145,"level":0,"isfit":1,"score":695,"rwarriorId":1330273,"arrEquipedstone":[132,131],"upprice":0,"attackprior":160,"nextattackprior":164,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null}],"arrUnlockedskin":[1],"skinid":1,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":5700,"alchemy_limit_con":5700,"alchemy_limit_force":5700,"alchemy_limit_str":5700,"resetnamenum":"0"},{"_cls":"warriorVo","id":"3967362","name":"\u6b27\u9633\u950b","level":"41","warriorcfgid":"17","quality":4,"maxhp":19152,"hp":19152,"speed":15,"exp":"172290","nextexp":720140,"score":40180,"en":0,"maxen":9000,"enSpd":300,"attack":9975,"defence":4788,"skillattack":6995,"skilldefence":3032,"arrEquipedskill":[30,15,0,0],"arrAllskillVo":{"30":{"_cls":"skillBase","slevel":"1","scfgid":30},"15":{"_cls":"skillBase","slevel":"1","scfgid":15},"1004":{"_cls":"skillBase","slevel":"1","scfgid":1004},"1019":{"_cls":"skillBase","slevel":"1","scfgid":1019}},"con":1026,"constars":3,"conquality":3,"conquot":10.2,"str":1135,"strstars":1,"strquality":4,"strquot":12,"force":919,"forcestars":1,"forcequality":3,"forcequot":9,"agi":866,"agistars":1,"agiquality":3,"agiquot":9,"accuracy":10,"block":10,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":10,"antisubattack":10,"antisubdefence":10,"antiunskill":10,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":"20074240","2":"18916822","3":"18896586","4":"19488867"},"artiItem":{"1":0,"2":0,"3":0,"4":0},"fateItem":{"1":0,"2":0,"3":0,"4":0},"friendship":"75","shiplevel":"2","type":"rwarrior","attackprior":944,"jobtype":"wtype","internode":-1,"vigour":"0","totalvigour":"0","loopinternode":-1,"loopintertimes":0,"talknum":0,"equipedItemInfo":[{"_cls":"rbagitemVo1","id":20074240,"itemcfgid":53,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":605,"sub":"0"}],"equipopenhole":2,"effectvalue":111,"nexteffectvalue":116,"level":0,"isfit":1,"score":555,"rwarriorId":3967362,"arrEquipedstone":null,"upprice":0,"attackprior":40,"nextattackprior":44,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":18916822,"itemcfgid":30,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1732,"sub":"0"}],"equipopenhole":1,"effectvalue":58,"nexteffectvalue":62,"level":1,"isfit":1,"score":290,"rwarriorId":3967362,"arrEquipedstone":null,"upprice":1162,"attackprior":22,"nextattackprior":24,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":18896586,"itemcfgid":32,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1732,"sub":"0"}],"equipopenhole":1,"effectvalue":58,"nexteffectvalue":62,"level":1,"isfit":1,"score":290,"rwarriorId":3967362,"arrEquipedstone":null,"upprice":1162,"attackprior":22,"nextattackprior":24,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":19488867,"itemcfgid":55,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":605,"sub":"0"}],"equipopenhole":2,"effectvalue":111,"nexteffectvalue":116,"level":0,"isfit":1,"score":555,"rwarriorId":3967362,"arrEquipedstone":null,"upprice":0,"attackprior":40,"nextattackprior":44,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null}],"arrUnlockedskin":[1],"skinid":1,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":4100,"alchemy_limit_con":4100,"alchemy_limit_force":4100,"alchemy_limit_str":4100,"resetnamenum":"0"}],"skinid":4}],"_cls":"getarenalist"}}

	/**
	 *  get arena list
	 * @param user
	 * @return
	 */
	public static String getArenav2(User user) {
		return user.send(
			"&act=getarena&ctl=rarenanew",
			null
		);
	}


	//public static const START_ARENAV2:Object = {ctl:"rarenanew", act:"startarena"};
	//ArenaBattleProxy.as: line 29: 	App.net.send(new HttpGetParams(PHPConsts.START_ARENAV2).getHttpString(), _loc_2, this.readyBattle, this.onFailHandler, "default", "default", "default", RequestType.DIALOG_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_rawdataerr"}

	/**
	 * fight arena, get fightString
	 * @param user
	 * @param rank
	 * @return
	 */
	public static String startArenav2(User user, int rank) {
		return user.send(
			"&act=startarena&ctl=rarenanew",
			"{\"rank\":%d}", rank
		);
	}


	//public static const ADD_ARENANUMV2:Object = {ctl:"rarenanew", act:"addarenanum"};
	//AddArenaNumService.as: line 66: 	App.net.send(new HttpGetParams(PHPConsts.ADD_ARENANUMV2).getHttpString(), _loc_2, this.successAddTime, this.failureHandler, "default", "default", "default", RequestType.DIALOG_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_addarenanumok","change":{"_cls":"changeObj","role":{"805493":{"gamepoint":"94","arenanum":11,"buyarenatimes":"1"}},"rwarrior":null,"rwarriorskill":null,"rwarriorskillbuff":null,"rbagitem":null,"rbuild":null,"rquest":null,"rmap":null,"rwarriorinpub":null,"rwarriorgroup":null,"roperator":null},"data":{"nowarenanum":11,"buyarenatimes":1,"_cls":"addarenanum"}}

	/**
	 * add arena number
	 * @param user
	 * @return
	 */
	public static String addArenanumv2(User user) {
		return user.send(
			"&act=addarenanum&ctl=rarenanew",
			"{\"type\":1}"
		);
	}


	//public static const CLEAR_ARENACDV2:Object = {ctl:"rarenanew", act:"cleararenacd"};
	//ClearCDService.as: line 25: 	App.net.send(new HttpGetParams(PHPConsts.CLEAR_ARENACDV2).getHttpString(), null, this.onClearCD, this.failureHandler, "default", "default", "default", RequestType.NORMAL, "default", "default", "default", "default", "default", this.clearCDCheck);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_cleararenacdok","change":{"_cls":"changeObj","role":{"805493":{"gamepoint":"89","arenacdtime":"0"}},"rwarrior":null,"rwarriorskill":null,"rwarriorskillbuff":null,"rbagitem":null,"rbuild":null,"rquest":null,"rmap":null,"rwarriorinpub":null,"rwarriorgroup":null,"roperator":null},"data":{"CDTime":0,"_cls":"cleararenacd"}}

	/**
	 * clear cd
	 * @param user
	 * @return
	 */
	public static String clearArenacdv2(User user) {
		return user.send(
			"&act=cleararenacd&ctl=rarenanew",
			null
		);
	}


	//public static const ARENA_WORSHIPV2:Object = {ctl:"rarenanew", act:"arenaworship"};
	//PrayServices.as: line 27: 	App.net.send(new HttpGetParams(PHPConsts.ARENA_WORSHIPV2).getHttpString(), _loc_3, this.onGetPray, null, "default", "default", "default", RequestType.NORMAL).dropPoint = new Point(480, 300);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_rankerror"}

	/**
	 * 膜拜
	 * 
	 * @param user
	 * @param type
	 *            1 = 铜币 2 = 20令牌 3 = 100令牌
	 * @param rank
	 * @return
	 */
	public static String arenaWorshipv2(User user, int type, int rank) {
		return user.send(
			"&act=arenaworship&ctl=rarenanew",
			"{\"type\":%d,\"rank\":%d}", type, rank
		);
	}


	//public static const ARENA_NEWSV2:Object = {ctl:"rarenanew", act:"getarenanews"};
	//<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"><html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8" /><title> - </title><style>body {	font-size:76%;	font-family:"Lucida Grande", Verdana, Lucida, Arial, Helvetica, sans-serif;	background-color:#FEFEFE;	color:#333333;	margin:0;}a{color:#f60;}a:hover{text-decoration:none;}.dialogtitle {	margin-bottom:10px;	font-weight:bold;}.dialogContent {	padding:10px;}</style><link rel="stylesheet" href="style/dialog.css" /></head><body><div style="margin:100px auto;width:500px;"><table border="0" cellspacing="0" cellpadding="0" id="windowTable">	<tr>		<td colspan="2" class="td9TL"></td>		<td class="td9TC"></td>		<td colspan="2" class="td9TR"></td>	</tr>	<tr>		<td class="td9ML2"></td>		<td class="td9ML"></td>		<td class="td9MC" id="windowContent"><div>	<div class="dialogtitle"><div></div></div>    <div class="dialogContent">    	<div style="width:450px;">       	方法【getarenanews】未定义，请联系网站管理员。<br />		<div align="center" style="margin-top:10px;">    <a href="javascript:history.back();"></a>		</div>    	</div>    </div></div>               </td>		<td class="td9MR"></td>		<td class="td9MR2"></td>	</tr>	<tr>		<td colspan="2" class="td9BL"></td>		<td class="td9BC"></td>		<td colspan="2" class="td9BR"></td>	</tr></table></div></body></html>

	/**
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String arenaNewsv2(User user) {
		return user.send(
			"&act=getarenanews&ctl=rarenanew",
			null
		);
	}


	//public static const ARENA_GETAWARDV2:Object = {ctl:"rarenanew", act:"getaward"};
	//GetDailyAwardServices.as: line 16: 	App.net.send(new HttpGetParams(PHPConsts.ARENA_GETAWARDV2).getHttpString(), null, this.getSuccess, this.getFailure).dropPoint = param1;
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getquestawardok","change":{"_cls":"changeObj","role":{"805493":{"money":"7795476","honour":"2331"}},"rwarrior":null,"rwarriorskill":null,"rwarriorskillbuff":null,"rbagitem":null,"rbuild":null,"rquest":null,"rmap":null,"rwarriorinpub":null,"rwarriorgroup":null,"roperator":null},"data":{"orank":21844,"awardList":[{"type":"money","cfgid":0,"num":150000},{"type":"honour","cfgid":0,"num":100}],"_cls":"getquestaward"}}

	/**
	 * arena daily awards
	 * @param user
	 * @return
	 */
	public static String arenaGetawardv2(User user) {
		return user.send(
			"&act=getaward&ctl=rarenanew",
			null
		);
	}


	//public static const ARENA_GETTOP3:Object = {ctl:"rarenanew", act:"gettop3"};
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_item_suc_gettop3ok","data":{"_cls":"gettop3","list":[{"_cls":"arenanewtop","id":"200324","level":"71","uname":"\u5343\u97f3","rank":1,"warriorcfgid":"35","power":5175521,"skinid":7,"headurl":"headurl"},{"_cls":"arenanewtop","id":"1654401","level":"70","uname":"\u672a\u4e88","rank":2,"warriorcfgid":"34","power":4517993,"skinid":5,"headurl":"headurl"},{"_cls":"arenanewtop","id":"284961","level":"71","uname":"\u4e1c\u5e73","rank":3,"warriorcfgid":"33","power":4606035,"skinid":5,"headurl":"headurl"}]}}

	/**
	 * get top 3 info
	 * @param user
	 * @return
	 */
	public static String arenaGettop3(User user) {
		return user.send(
			"&act=gettop3&ctl=rarenanew",
			null
		);
	}


	//public static const ARENA_GETTOP10:Object = {ctl:"rarenanew", act:"gettop10"};
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_item_suc_gettop10ok","data":{"_cls":"gettop10","list":[{"_cls":"arenanewtop","id":"200324","level":"71","uname":"\u5343\u97f3","rank":1,"warriorcfgid":"35","power":5050879,"skinid":7,"headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/7e23615195608a7d21cd8663179bccf24f66fab1848e9e6e9d97368cf1d11eab\/30"},{"_cls":"arenanewtop","id":"1654401","level":"70","uname":"\u672a\u4e88","rank":2,"warriorcfgid":"34","power":4419930,"skinid":5,"headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/b025b6dd00a560fc60e258791a58d5a93d2584ffb1d8ef4334e2815378434d61\/30"},{"_cls":"arenanewtop","id":"284961","level":"71","uname":"\u4e1c\u5e73","rank":3,"warriorcfgid":"33","power":4509205,"skinid":5,"headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/95dac2d0238d3f7bc9c52c84668034042892430e7589e432bf5d1cf8f8131616\/30"},{"_cls":"arenanewtop","id":"201633","level":"70","uname":"\u5f69\u9759","rank":4,"warriorcfgid":"37","power":4829885,"skinid":5,"headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/98bd624e95e0910faa167894a68a8d13dc1698dd02401bbea460495f2f86f057\/30"},{"_cls":"arenanewtop","id":"1321393","level":"71","uname":"\u975e.","rank":5,"warriorcfgid":"34","power":3980449,"skinid":7,"headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/d8219673598dbd6f9eef8bdbb6acbdead0cd8b8c0f74b37250a6ebdf74083fbb\/30"},{"_cls":"arenanewtop","id":"1134394","level":"71","uname":"\u888f\u63b1\u5beb\u9bd6\u042f\ue822","rank":6,"warriorcfgid":"37","power":4922271,"skinid":7,"headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/79a40b79ee1c826e29759913e28d473db21b4c4b7d2ce6a07b80795a938b5be7\/30"},{"_cls":"arenanewtop","id":"1577468","level":"70","uname":"\u5929","rank":7,"warriorcfgid":"33","power":4446660,"skinid":7,"headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/3e19c07980db807650c78216b2ae57961258fb11fdda0c6b972d2bfb6ed66fe7\/30"},{"_cls":"arenanewtop","id":"424606","level":"70","uname":"\u5927\u6d77","rank":8,"warriorcfgid":"37","power":4338462,"skinid":5,"headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/36b63235a3d985e56da89ad9159a98ba3d02c52517babf74b5022ce276860430\/30"},{"_cls":"arenanewtop","id":"693996","level":"71","uname":"\u89c1\u732b\u5fc5\u8c03\u620f","rank":9,"warriorcfgid":"36","power":4476887,"skinid":5,"headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/d8219673598dbd6f4329e43afb58a50b4105e9d9570ac2036368638927414625\/30"},{"_cls":"arenanewtop","id":"312726","level":"70","uname":"\u84dd\u7425\u73c0","rank":10,"warriorcfgid":"36","power":4188425,"skinid":7,"headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/d8219673598dbd6f8fbaca6489fd85d7f9d1177ff58dde185f7b3ce7ef7294fc\/30"}]}}

	/**
	 * get top 10 info
	 * @param user
	 * @return
	 */
	public static String arenaGettop10(User user) {
		return user.send(
			"&act=gettop10&ctl=rarenanew",
			null
		);
	}


	//public static const ARENA_GETRECORD:Object = {ctl:"rarenanew", act:"getlog"};
	//<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"><html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8" /><title> - </title><style>body {	font-size:76%;	font-family:"Lucida Grande", Verdana, Lucida, Arial, Helvetica, sans-serif;	background-color:#FEFEFE;	color:#333333;	margin:0;}a{color:#f60;}a:hover{text-decoration:none;}.dialogtitle {	margin-bottom:10px;	font-weight:bold;}.dialogContent {	padding:10px;}</style><link rel="stylesheet" href="style/dialog.css" /></head><body><div style="margin:100px auto;width:500px;"><table border="0" cellspacing="0" cellpadding="0" id="windowTable">	<tr>		<td colspan="2" class="td9TL"></td>		<td class="td9TC"></td>		<td colspan="2" class="td9TR"></td>	</tr>	<tr>		<td class="td9ML2"></td>		<td class="td9ML"></td>		<td class="td9MC" id="windowContent"><div>	<div class="dialogtitle"><div></div></div>    <div class="dialogContent">    	<div style="width:450px;">       	方法【getlog】未定义，请联系网站管理员。<br />		<div align="center" style="margin-top:10px;">    <a href="javascript:history.back();"></a>		</div>    	</div>    </div></div>               </td>		<td class="td9MR"></td>		<td class="td9MR2"></td>	</tr>	<tr>		<td colspan="2" class="td9BL"></td>		<td class="td9BC"></td>		<td colspan="2" class="td9BR"></td>	</tr></table></div></body></html>

	/**
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String arenaGetrecord(User user) {
		return user.send(
			"&act=getlog&ctl=rarenanew",
			null
		);
	}


	//public static const GET_MANOR_DATA:Object = {ctl:"rfriend", act:"visitmanor"};
	//GetManorDataProxy.as: line 49: 	App.net.send(new HttpGetParams(PHPConsts.GET_MANOR_DATA).getHttpString(), _loc_4, this.workerDataDone, this.workerDataFailure, "default", "default", "default", RequestType.DIALOG_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_friend_visitmanorok","change":{"_cls":"changeObj","role":{"805493":{"nowluckystar":"0","redeemtimes":0,"serbuytimes":0,"askforhelptime":"0"}},"rwarrior":null,"rwarriorskill":null,"rwarriorskillbuff":null,"rbagitem":null,"rbuild":null,"rquest":null,"rmap":null,"rwarriorinpub":null,"rwarriorgroup":null,"roperator":null},"data":{"servantlist":[],"myserinfo":{"_cls":"myserinfo","nowskin":"1","unlockskin":[1],"serstatus":"0","sercdtime":"1398715427"},"_cls":"visitmanor"}}

	/**
	 * get friend farm info
	 * @param user
	 * @param fid
	 * @return
	 */
	public static String getManorData(User user,int fid) {
		return user.send(
			"&act=visitmanor&ctl=rfriend",
			"{\"fid\":%d}", fid
		);
	}
	/**
	 * get self farm info
	 * @param user
	 * @param fid
	 * @return
	 */
	public static String getManorData(User user) {
		return user.send(
			"&act=visitmanor&ctl=rfriend",
			"{}"
		);
	}

	//public static const WORKER_SEARCH:Object = {ctl:"servant", act:"searchservants"};
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_ser_suc_getserServantsok","data":{"list":[{"_cls":"rolebaseInfo","id":"997922","level":"61","uid":"A866161A4D3B0D4192A1C1114D4652FF","tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/e3ba89159b95d5389246d375e29a02c6fa9c06be13d70350d190ddf2b668f207\/30","uname":"%E9%9B%BE%E9%87%8C%E7%9C%8B%E8%8A%B1","isfriend":0,"serstat":0,"yellowvip":0,"yellowyearvip":0,"yellowviplevel":0},{"_cls":"rolebaseInfo","id":"1009183","level":"63","uid":"45E4869BE0A62154C931B7D6788DC0F3","tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/f804ebf18ceb24ca0e90123c0685e7ec1ebb89803c2fbcc199061abaa9ea4727\/30","uname":"%E3%80%80%E3%80%80x%E3%80%82%E3%80%80%E3%80%80%E3%80%80%E3%80%80","isfriend":0,"serstat":0,"yellowvip":1,"yellowyearvip":0,"yellowviplevel":7},{"_cls":"rolebaseInfo","id":"1000813","level":"62","uid":"A3692089C1A69E296100BFFCB61F0BF4","tinyurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/d8219673598dbd6f669f4ce3e6d20246fc7e1917e1120f2c9d6b2b5b31071a39\/30","uname":"%E2%97%95%E2%80%BF%E2%97%95%E8%82%A5%E5%98%9F%E5%98%9F%E5%B7%A6%E8%A1%9B%E9%96%80%EF%BC%82","isfriend":0,"serstat":0,"yellowvip":1,"yellowyearvip":0,"yellowviplevel":7},{"_cls":"rolebaseInfo","id":"1011211","level":"63","uid":"2BCD13F81CEF3B079E8F61FF25699FA6","tinyurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/038094b731b54fb49d723d845022127b95b494ccc556ab24a8810a478dc6cfc0\/30","uname":"%E6%97%A0%E8%A8%80","isfriend":0,"serstat":0,"yellowvip":0,"yellowyearvip":0,"yellowviplevel":0},{"_cls":"rolebaseInfo","id":"997093","level":"61","uid":"94D2BAE7B4AF78CCE5A0D8480589E739","tinyurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/44998d08d841120e5039618c38a48cf1fc8750c65c216a1ba0205775d3da3774\/30","uname":"%E8%8D%B7%E8%8E%B9","isfriend":0,"serstat":1,"yellowvip":0,"yellowyearvip":0,"yellowviplevel":0},{"_cls":"rolebaseInfo","id":"999689","level":"61","uid":"D0D4282E52036B44220C03CF3DD88C44","tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/3e19c07980db8076c4397459bfa45f9e5826a3029d6da2b3f20516dcd8ae9760\/30","uname":"%E7%97%9B%E7%BB%8F%E5%A6%82%E6%AD%A4%E5%A4%9A%E5%A8%87%E7%96%BC%E5%BE%97%E8%8F%87%E5%87%89%E6%8A%98%E8%85%B0","isfriend":0,"serstat":0,"yellowvip":0,"yellowyearvip":0,"yellowviplevel":0}],"_cls":"getSomeservants"}}

	public static String workerSearch(User user) {
		return user.send(
			"&act=searchservants&ctl=servant",
			null
		);
	}


	//public static const WORKER_HELPLIST:Object = {ctl:"servant", act:"helplists"};
	//GetHelpList.as: line 15: 	App.net.send(new HttpGetParams(PHPConsts.WORKER_HELPLIST).getHttpString(), {}, this.getSuccess, this.getFailure).jumpOutOfQueue();
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_ser_suc_gethelplistok","data":{"list":[{"_cls":"servantList","rid":"200206","rname":"Leo","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/d8219673598dbd6f8a3b5fb8f1fb004160f05f126b745947533357f7e0d93362\/30"},{"_cls":"servantList","rid":"200245","rname":"ena","rlevel":"70","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/2eaee6da8ea3be0294b299679a35ca823b91e919db6923cc7625b70f6cc9fa9a\/30"},{"_cls":"servantList","rid":"200253","rname":"%20%20%20%20%20%20%20%20You%27re%20beautiful","rlevel":"28","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/e3e6b4bc45ca4d1979a7f3b56abfb8004695bb82d4e3bf75ec77e85d145513e3\/30"},{"_cls":"servantList","rid":"200324","rname":"%E5%8D%83%E9%9F%B3","rlevel":"71","serstatus":"1","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/7e23615195608a7d21cd8663179bccf24f66fab1848e9e6e9d97368cf1d11eab\/30"},{"_cls":"servantList","rid":"200375","rname":"For%20you%2C","rlevel":"62","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/b7f3014cca60d94da79639d3aac984c9a561c4f0f46a1ed1fece5195fbfb2cba\/30"},{"_cls":"servantList","rid":"201969","rname":"%E8%80%81%E7%94%B7%E5%AD%A9","rlevel":"68","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/f34adfa077cbb5a826e82057af7bdcc464174447d1ccb24d3b069272af764208\/30"},{"_cls":"servantList","rid":"202528","rname":"%E9%97%AE%E5%A4%A9","rlevel":"70","serstatus":"2","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/d8219673598dbd6f5f702eacb1aa840c3895c90761c1d705f08755007f5bfa1f\/30"},{"_cls":"servantList","rid":"203492","rname":"%E5%9B%A0%E4%B8%BA%E6%9C%89%E4%BD%A0","rlevel":"51","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/d8219673598dbd6ff421354183709f7ab8bc21a29d43179618a23e0515ad4002\/30"},{"_cls":"servantList","rid":"207041","rname":"%EF%BF%A3%E2%97%87%E5%85%B6%E5%AF%A6%E6%88%91%E4%B8%8D%E6%8B%BD%EF%B9%8F","rlevel":"63","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/c5ae6cde08828a62520ebfaf7aa60b93aefe83acbca89a111ac40cf2bd420ba2\/30"},{"_cls":"servantList","rid":"208693","rname":"%E5%A2%AE%E8%90%BD%E7%9A%84%E7%B6%BE%E6%B3%A2%E9%BA%97%E5%85%B6%E5%AF%A6%E4%B9%9F%E6%B2%92%E4%BB%80%E9%BA%BC","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/d8219673598dbd6f2e2f8c5161b832b1fb4900d326f4a6a56b3d08e45e519a93\/30"},{"_cls":"servantList","rid":"212692","rname":"%E5%85%B0%E6%B3%A2%E5%A4%A7%E4%BA%BA","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/4f00332eab5981197de998356b683f9b2151d0556c2c636e5c91d21807a12c42\/30"},{"_cls":"servantList","rid":"212801","rname":"%E9%9F%A9%E7%89%B9","rlevel":"32","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/30eb7b4d48340a148824541b3846c94469ea72701a3808ecadb86563dd1e27f3\/30"},{"_cls":"servantList","rid":"213501","rname":"%E6%B5%81%E5%88%83%E8%8B%A5%E7%81%AB","rlevel":"64","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/d8219673598dbd6f1f5c8d440cfa82cc7d5c34821dfc121a2b261fa63bb072cc\/30"},{"_cls":"servantList","rid":"214985","rname":"%EF%B8%B6%E3%84%A3%E6%B7%B1%E8%97%8D%E2%95%AC%E9%9B%AA","rlevel":"61","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/66bf56f23b09103d0160ae591c31b8564351885158cb31063cbf7d16886e8930\/30"},{"_cls":"servantList","rid":"217311","rname":"%E6%83%85%20%20%E7%AF%80%20%20%E4%B8%A5%20%20%E9%87%8D","rlevel":"46","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/e3e6b4bc45ca4d1931a23187887d9c495f81d6cc03b1c407d0a1ca41206e88fb\/30"},{"_cls":"servantList","rid":"227447","rname":"%E3%80%80","rlevel":"61","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/d8219673598dbd6fbc6026590985d8ae70bb620dea79ff2809c1b344edfee212\/30"},{"_cls":"servantList","rid":"228813","rname":"%20%E5%88%B9%E9%82%A3%E6%B0%B8%E6%81%92","rlevel":"68","serstatus":"2","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/d8219673598dbd6fdde45252a94405bc475fd8c4aef16fe98e56d8f8feb95d8a\/30"},{"_cls":"servantList","rid":"230993","rname":"%E8%99%B1%E5%AD%90%E7%8E%8B","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/d597256039151b48cfc1b8b8ea9e0690bf6f03693aeed2a4808be109ca26379c\/30"},{"_cls":"servantList","rid":"232768","rname":"%E5%85%AD%E5%B0%8F%E7%8B%82%E7%96%AF","rlevel":"61","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/d8219673598dbd6f602afeade186253dfb661e47121fce3ada64a164058b8abc\/30"},{"_cls":"servantList","rid":"233011","rname":"I%CC%B6%20%CC%B6%CC%B6%CC%B6%CC%B6%CC%B6L%CC%B6%CC%B6vo%CC%B6%CC%B6e%CC%B6%CC%B6Y%CC%B6ou%20","rlevel":"55","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/9166df98a69ece765ab73c19f9f1f686ffddd0a9bb8bc5c9b50b2ab4588649b6\/30"},{"_cls":"servantList","rid":"233132","rname":"%20%20%20%20%20%20%E9%AD%82%E9%B8%A3%20.","rlevel":"60","serstatus":"1","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/d8219673598dbd6f18dce3d16b9bb056199d5ed14875ad43bcdf40fcd4c9e59b\/30"},{"_cls":"servantList","rid":"234749","rname":"%E4%BD%A9%E6%81%A9%E3%83%9A%E3%82%A4%E3%83%B3%0A","rlevel":"64","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/c5ae6cde08828a62ab9ae8533adb42d3718665b3b24876d0b6e1dff9a6c9dfd7\/30"},{"_cls":"servantList","rid":"234888","rname":"%E5%A4%B1%E5%A3%B0%E2%92%8BEv%C4%93r","rlevel":"61","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/24a23b928380475d09e12d6832ffd24861472750aaa645a59a4d4c5095c17f6b\/30"},{"_cls":"servantList","rid":"236540","rname":"neko.","rlevel":"70","serstatus":"1","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/cc7df3ef7156cabbf29ef5254d46bc54a1ac89d7d1e75c8385fc5c71b2f4b416\/30"},{"_cls":"servantList","rid":"236996","rname":"%27%27%27%27%27%27","rlevel":"50","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/47c5081aeef5bc9d7f3a274606d3ad0c1670ae58b3df9ccce12785cdbc9b0b64\/30"},{"_cls":"servantList","rid":"241415","rname":"%E6%B5%AA%E5%AD%909.%214%E5%9F%98%E7%BB%B1","rlevel":"62","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/c2a5760c145f85bd7ba77c3c9e9a6ed94a122f986d72120b76bf8b0788d5c991\/30"},{"_cls":"servantList","rid":"244820","rname":"Sai","rlevel":"70","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/786c4e691e2555527c5ef360ac023f71cf67890615b612fac0246c63ef48d597\/30"},{"_cls":"servantList","rid":"247012","rname":"%C2%B2%C2%BA%C2%B9%E2%81%B4%E6%B2%A1%E4%BA%8B%E8%87%AA%E5%B7%B1%E6%89%BE%E4%B9%90%E5%AD%90","rlevel":"60","serstatus":"1","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/6c56fabc3bc7003c91fdcc6f4fa15c89f748889d9aa453d67a3b6eeea94d6f56\/30"},{"_cls":"servantList","rid":"247772","rname":"%EF%BC%AD%E2%97%8B%E2%9C%98%EF%BC%AE","rlevel":"61","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/d8219673598dbd6f09b7d22b665af8e1bd729f1f1204d29cc66c76e61251bbd4\/30"},{"_cls":"servantList","rid":"251556","rname":"%E6%88%91%E5%BF%AB%E4%B9%90%2F%E6%8F%A1%E6%89%8B","rlevel":"44","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/b7f3014cca60d94db7ecef2a8ff8b4f60765d3c065131f81578581072999f0f2\/30"},{"_cls":"servantList","rid":"255077","rname":"%E3%80%80","rlevel":"70","serstatus":"1","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/95dac2d0238d3f7bb3ac7d0f1b5ccc547ee49345d25020baa6618301c26988ea\/30"},{"_cls":"servantList","rid":"255531","rname":"%E4%B8%93%E5%B1%9E%E5%A5%B9%E7%9A%84man","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/6ce38f6522756a25d82750622878ee7deb5a05a0f8d6f673b973486d7fdb8c65\/30"},{"_cls":"servantList","rid":"255644","rname":"%E5%88%98%E5%85%B5","rlevel":"64","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/a08975d5f4d44fdd30e01ea7484d86216905b47d5f049cc1323b25f7af4b5518\/30"},{"_cls":"servantList","rid":"256673","rname":"%E9%87%8D%E7%94%9F","rlevel":"50","serstatus":"1","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/06d264c84a243d465028a69f5c9613d38895f6cd89ea2a036ea0b0ffebe2aa01\/30"},{"_cls":"servantList","rid":"257167","rname":"%20%20%20%20%20%E6%AE%87%20%20%20%20%20%20","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/498fe6b75281db143309f6c846b1e3be1790a5faa1186bea0e3a1229be878b85\/30"},{"_cls":"servantList","rid":"258778","rname":"%E4%BB%B0%E6%9C%9B%E6%9C%88%E5%8D%8A%E7%A9%BA","rlevel":"70","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/56c09ef7bd51149626f5954d8a58fd278f275d262108af1ec3dd2e19ccb23fd8\/30"},{"_cls":"servantList","rid":"258795","rname":"%5E%E6%89%A7%E5%AD%90%3D%E4%B9%8B%E6%89%8B%5E","rlevel":"52","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/9a39e278ce662d464536410ed0832b1c3b181a875abb229a1e7e4dd25275755c\/30"},{"_cls":"servantList","rid":"259554","rname":"%E5%85%89%E5%A4%B4%E5%B0%8F%E5%AD%90","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/b7f3014cca60d94df85b067a70d0f414ee13e4a535d2a75f2c2922233f1b5cd5\/30"},{"_cls":"servantList","rid":"261797","rname":"%E8%B4%A4%E7%8B%BC","rlevel":"70","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/72a0df78bf8c85f220a4d8b3b1c56ceb705b8598c751fff3b408466b71e17a82\/30"},{"_cls":"servantList","rid":"263918","rname":"%E6%97%A0%E6%89%80%E8%B0%93","rlevel":"67","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/95dac2d0238d3f7b744b4a6564d14bd77131396edfc4bebe4b2a68790cb43ee5\/30"},{"_cls":"servantList","rid":"266257","rname":"%E2%82%A1%20.%E7%80%9F%E7%80%9F%E9%9B%A8%E9%9C%8F","rlevel":"70","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/987d8a8a241df456fe8933288c6e2256efd736f30119dd7c0619660485f2db7a\/30"},{"_cls":"servantList","rid":"266837","rname":"%E8%B0%81%E4%B8%8D%E5%A5%BD%E5%A5%BD%E7%8E%A9","rlevel":"70","serstatus":"2","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/6284653af722a248275a6ca4d3316bbbcd396abd9208d1d419f4f12add6ed212\/30"},{"_cls":"servantList","rid":"270877","rname":"%26%E8%82%8C%E8%82%89%E5%B0%8F%E4%BC%99%26","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/6cce447836a3548cba1e922950ca44afcaf853e4169cb28c40081fdef47dd903\/30"},{"_cls":"servantList","rid":"273046","rname":"%E7%94%9F%E6%AD%BB%E7%9C%8B%E6%B7%A1%EF%BC%8C%E4%B8%8D%E6%9C%8D%E5%B0%B1%E5%B9%B2%EF%BC%81","rlevel":"65","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/27f0303c24a7cbb7029c108b0f1477f27f53b9e10a39c9a39528dce011fe4eba\/30"},{"_cls":"servantList","rid":"280637","rname":"%E6%BD%9C%E6%B0%B4%E4%B8%AD","rlevel":"56","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/72a0df78bf8c85f2cce7688714ebb51b3c3863ba165464a3e75cf144a83f8402\/30"},{"_cls":"servantList","rid":"280768","rname":"%E6%AD%A4%E5%88%BB%E6%83%98%E7%84%B6","rlevel":"70","serstatus":"2","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/43a357988b13b4b840ce6eea5f532af9af7a19fcb625da0054c6adf76e4399a4\/30"},{"_cls":"servantList","rid":"282815","rname":"Yesnow%E5%A4%9C%E9%9B%AA","rlevel":"45","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/d8219673598dbd6f48674ad1e9bd6638dec9f5dd64d0591545ce448b15e5656a\/30"},{"_cls":"servantList","rid":"285630","rname":"%E6%B0%B4%E8%90%BD%E7%9F%B3","rlevel":"50","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/9ac0f34f3caf9f844e0e00ffcfd01681b57931d43d3cf413cffbeff826e1477e\/30"},{"_cls":"servantList","rid":"286008","rname":"%E8%BF%B7%E8%BF%AD%E9%A6%99","rlevel":"60","serstatus":"2","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/7f7c2417913f508dd1547ab2f4eabdbc1d2bb7a45be36e1e9716af2538cc3622\/30"},{"_cls":"servantList","rid":"288875","rname":"%E3%81%9E_%E2%86%97%E5%9B%A2%E9%95%BF","rlevel":"56","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/add7ffb0474c0a7a23e97e459f2db67ed7d21cf53597dc0c9ab6af361db647ee\/30"},{"_cls":"servantList","rid":"291062","rname":"%E5%A4%A7%E9%B9%8F","rlevel":"61","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/7ae014cf6cba5e8536816c2793814fdcdb87f4fe9e1356df58d162e97c91250e\/30"},{"_cls":"servantList","rid":"292301","rname":"%20%20%20%20%20%20%20%20%20%20%20%20%20%20%E3%82%9B%20%20%20%20%20%20%20%20%20%20%20","rlevel":"42","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/786c4e691e255552ea27d6c30abdcef53000ddf486b6ab7e539c4e86bec5c633\/30"},{"_cls":"servantList","rid":"294017","rname":"Mr.AGui","rlevel":"62","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/f51818d5e8a4796946826876028838c72f9d6b44bda9c67a5d9ff4d060591843\/30"},{"_cls":"servantList","rid":"295995","rname":"%20%E9%80%9D%E5%8E%BB%E3%80%81%E9%82%A3%E5%85%89%E9%98%B4%E3%80%82","rlevel":"52","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/e7516f198a8aeedf51ff15e4fe94ad48e4bd2c73d2d8e61c83713169efd5fcae\/30"},{"_cls":"servantList","rid":"296492","rname":"%E5%9B%9E%E9%A6%96%E8%BF%87%E5%8E%BB","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/665315de1d9ca6c1076ffbe28683249e5ad6f20a8f8806cbd6bc4986d13a4268\/30"},{"_cls":"servantList","rid":"299063","rname":"%E7%9B%92%E5%AD%90%E9%87%8C%E7%9A%84%E7%8C%AA","rlevel":"40","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/3a82b5eb1d60a74869b2fef2de8f313bf3843c8d16ed237b94c45ccf8915d528\/30"},{"_cls":"servantList","rid":"299498","rname":"%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%E5%BF%83%E9%87%8C%E8%AF%9D%E4%B8%B6","rlevel":"37","serstatus":"2","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/36cb4828641e5a852aeec36570cda530591ce8d867bac9237974b9ab6aa28879\/30"},{"_cls":"servantList","rid":"299648","rname":"%2F%2F%3A%E8%B7%AF%E4%BA%BA%20%E4%B8%81","rlevel":"70","serstatus":"2","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/817afe2e6f5f55c5a29ba90022f923e89bbddf3276a0d98f546a79abb265321a\/30"},{"_cls":"servantList","rid":"305395","rname":"%E5%97%A8%E5%93%88%E5%97%A8","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/e0ae2b38f3966ef469da0bb1df3163191e672639d85cf1b3e1ccd6bdc7fcb78a\/30"},{"_cls":"servantList","rid":"306321","rname":"%E6%9D%8E%E6%A3%AE","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/498fe6b75281db14455ec047c40cf0168cfba9a88515c3f2d1f8695bf7588b97\/30"},{"_cls":"servantList","rid":"306523","rname":"%E5%8F%8C%E7%BF%BC%E5%BF%83","rlevel":"45","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/4296d9220a80af68d1d87bb60bda966bfd6c4b7ad7a36a50248cfa73dd0de553\/30"},{"_cls":"servantList","rid":"309972","rname":"YARLEND","rlevel":"61","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/24a23b928380475d49165099afe8bed32ae6554baa8055e2e1213cfb28b97282\/30"},{"_cls":"servantList","rid":"310753","rname":"%E5%93%81","rlevel":"50","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/13675a92aec0dfe2c76ec624eb719c2c6e688da6cae9bde8c3338a45ef2caf69\/30"},{"_cls":"servantList","rid":"311782","rname":"963","rlevel":"61","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/27f0303c24a7cbb7265a2a9d34d9b0947eea7dc52d76654739764d4ab2e32fa6\/30"},{"_cls":"servantList","rid":"312509","rname":"DON","rlevel":"45","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/43a357988b13b4b8e7284244c58a8cb783f16322b0f681418f8dde2a291afb0d\/30"},{"_cls":"servantList","rid":"312726","rname":"%E8%93%9D%E7%90%A5%E7%8F%80","rlevel":"70","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/d8219673598dbd6f8fbaca6489fd85d7f9d1177ff58dde185f7b3ce7ef7294fc\/30"},{"_cls":"servantList","rid":"315508","rname":"------","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/27a87a80731bf0f8e14350e40bbcce886352f09c141c5353113080e1f96b393e\/30"},{"_cls":"servantList","rid":"316124","rname":"%E6%AC%A2%E5%93%A5%20","rlevel":"64","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/52b3f85468b1f756787ec01112d2b1e8d91cef0e0b6c064cff366771799370b6\/30"},{"_cls":"servantList","rid":"318369","rname":"%E6%B7%A1%EF%BC%86%E5%AE%9A","rlevel":"63","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/4296d9220a80af68790073857b70ea67069b75725364f0cdaf1e1f66eee7eef6\/30"},{"_cls":"servantList","rid":"318483","rname":"%E3%80%8C%E5%87%A0%E5%BA%A6%E6%B2%89%E6%B7%AA%E3%80%8D","rlevel":"56","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/9166df98a69ece76b5eaaaac467d9149fea65b269552aee513212bdc9a3a4ca6\/30"},{"_cls":"servantList","rid":"321810","rname":"%E8%BD%AC%E8%BA%AB%C2%B7%E5%BE%AE%E7%AC%91","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/498fe6b75281db14343b7a6f1336fffd33353bbae24189b4c4bc84a31bb132bc\/30"},{"_cls":"servantList","rid":"322317","rname":"%E2%95%B0%E8%BF%BD%E5%BF%86%C2%B0%E4%BC%BC%E6%B0%B4%E6%B5%81%E5%B9%B4","rlevel":"64","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/498fe6b75281db1425268bf10da0870217d8a16e6a0034a30f8e917090fe46ee\/30"},{"_cls":"servantList","rid":"322391","rname":"%E6%89%AC%E7%BE%BD","rlevel":"70","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/aed75a034169d9d726a0060f2dc50755affe5cac28e5e460952bc33ca3cb0e58\/30"},{"_cls":"servantList","rid":"323006","rname":"%E3%80%80","rlevel":"63","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/36b63235a3d985e5979ce0b2f4993a45e2a378c8d12b49bfe9d7151fa10a52e1\/30"},{"_cls":"servantList","rid":"325472","rname":"%E3%81%BE%E3%81%9F%E3%81%9F%E3%81%8F%E9%96%93%E3%81%AB------------","rlevel":"57","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/d8219673598dbd6fca00a38268beda807e3bf2b6a44631476c4a0a56dd28385e\/30"},{"_cls":"servantList","rid":"325743","rname":"%E6%9F%90%E7%9F%A5%E5%90%8D%E6%91%84%E5%83%8F","rlevel":"55","serstatus":"2","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/664dc5021a4d2683257ac057008483c2c541b1f7e6ffc56d1fcfac7267871520\/30"},{"_cls":"servantList","rid":"326930","rname":"%E9%9D%92%E7%9C%BC%E3%81%AE%E7%99%BD%E9%BE%99","rlevel":"70","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/f4a6c3864d2726c3c3dd92b6dd9890fd78d3023382367e00e1498028ae087d58\/30"},{"_cls":"servantList","rid":"329365","rname":"%20","rlevel":"70","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/d8219673598dbd6fe0314960ed8a2621857d30a11a8059aa2f2d287446897870\/30"},{"_cls":"servantList","rid":"329682","rname":"%E6%B8%85%E6%B0%B4%E9%BE%99%E5%8D%8E","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/aff242e95d20fb90c7b3db71c84738ee44344ed46447ffccd903e1d43891dc28\/30"},{"_cls":"servantList","rid":"333018","rname":"%E5%A4%8F%E6%B2%AB%E5%86%B0%E7%82%B9%C2%B0%E3%80%86xm","rlevel":"58","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/a77546418354b602a5d56e7498caf7d941463d0d4e60dafb455b41e022d67ad8\/30"},{"_cls":"servantList","rid":"333613","rname":"%E7%8D%A8%E7%AE%9B%E5%8A%8D%E6%84%99","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/4296d9220a80af688a274ee781dedb5445a37149a1b1911fb1f242b7a730e1f6\/30"},{"_cls":"servantList","rid":"334934","rname":"%E5%90%8D%E5%AD%97%E6%8D%A2%E4%BA%86%E5%BE%88%E9%95%BF%E5%BE%88%E9%95%BF%E5%BE%88%E9%95%BF%E5%BE%88%E9%95%BF","rlevel":"47","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/06d264c84a243d4657c12e8d279e158b36b33a4b7d02a9113603f41b8a87439a\/30"},{"_cls":"servantList","rid":"336164","rname":"%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20Smile","rlevel":"44","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/30eb7b4d48340a14a9d553c043137c70590d2d8ca44c3af2a12e970efba5fa76\/30"},{"_cls":"servantList","rid":"338637","rname":"%E3%82%9B%E7%89%B9%E5%88%AB%E6%8E%A8%E8%8D%90%E3%80%81","rlevel":"61","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/43a357988b13b4b843c836bbb8006d64381e9b4ee46a1be6e6a7d58c510bc31b\/30"},{"_cls":"servantList","rid":"338804","rname":"%E5%A0%95%E8%90%BD%E7%9A%84%E7%97%95%E8%BF%B9","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/66bf56f23b09103d92245cb5c65ba99ce5e20523cf34446240a1c42a01f4031a\/30"},{"_cls":"servantList","rid":"339729","rname":"%E5%B0%8F%E6%B3%AA","rlevel":"55","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/656a8af7868e041fd6921318b28cf4bbf673ee67f3a48541474e3d55e8b6ea50\/30"},{"_cls":"servantList","rid":"342115","rname":"%E9%AD%94%E5%8A%9Bgg","rlevel":"50","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/d8219673598dbd6f93b086d0046d15abbdbcb6f9da41d5d6a5fa1ae57ef61d09\/30"},{"_cls":"servantList","rid":"342363","rname":"%E5%8F%B6%E7%A5%88%E6%A2%A6%E7%97%95","rlevel":"61","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/8742d6cd742bfcfba43f2db72ee12f5ec471c72461165c30abce3aa6bffc93aa\/30"},{"_cls":"servantList","rid":"343280","rname":"%E2%94%8CD%E8%B0%83d%C4%9B%E6%B5%AA%E6%BC%AB","rlevel":"70","serstatus":"1","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/f222d66b35733712b5560b5580896b4eeb46210731eb56118f41c519574fda66\/30"},{"_cls":"servantList","rid":"346628","rname":"%E3%83%A4o%E7%8B%AC%E7%89%B9%E4%B9%8B%E8%95%9Eo%CE%BF%CE%9F%20","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/95dac2d0238d3f7b09b09a1f9cf4cddaf72e665105e9f542476338c0d404e24c\/30"},{"_cls":"servantList","rid":"347665","rname":"Smile%E3%83%BE%E6%B7%A1%E8%8E%A3c","rlevel":"58","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/b6e6e5980eb5ec288640329deb9978328c884ed55379e4f970748aeee9b905f5\/30"},{"_cls":"servantList","rid":"348897","rname":"Dragon","rlevel":"70","serstatus":"2","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/30eb7b4d48340a1434a2f5a31c70895b8468fe8eac41ffa4720cff6339fd7892\/30"},{"_cls":"servantList","rid":"349096","rname":"Cloud","rlevel":"36","serstatus":"1","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/f222d66b357337120ff7a5f9e0ded68a49254fdef6cbf66a1f6086483e72851f\/30"},{"_cls":"servantList","rid":"350079","rname":"%E4%BD%8E%E5%A4%B4%E3%83%A1%E5%90%BB%E5%A6%B3","rlevel":"50","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/13675a92aec0dfe2ba56f46bcbe051e6ac00a24e445a9193575fc529531aa233\/30"},{"_cls":"servantList","rid":"350088","rname":"%E6%A8%B1","rlevel":"50","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/9a39e278ce662d46fa8dc05713bd2ed0a21551eaa3e8d41657ec06189bc98ccd\/30"},{"_cls":"servantList","rid":"355881","rname":"%E9%B8%A0%E7%BE%BD%E5%8D%83%E5%8F%B6","rlevel":"46","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/7d1071aaa9059bf443f5dc6ded6c9341bad043e122b02550692c2bf1cae7f09e\/30"},{"_cls":"servantList","rid":"356511","rname":"%E5%BD%BC%E5%B2%B8%3A%3A%E7%AC%91%E9%A2%9C","rlevel":"60","serstatus":"2","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/7e23615195608a7d7d94b99aa010d3a27330369b44c839ef787de0c82b6257aa\/30"},{"_cls":"servantList","rid":"359793","rname":"%E3%80%8E%E6%99%93%E4%B8%B6%E6%87%82Z%E3%80%8F%20","rlevel":"50","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/36cb4828641e5a8530e73706296bfff464d788cb3aa4a3d097f3e1ee6772bdee\/30"},{"_cls":"servantList","rid":"360233","rname":"%20%20%20%20%20%20%E9%80%A0%E6%A2%A6%E5%B0%91%E5%B9%B4%EF%BC%8C","rlevel":"56","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/79cbb2c24e1465a900a2b6e69c9432b1ee998e44c700f0960a4dba5336d15daa\/30"},{"_cls":"servantList","rid":"369116","rname":"%E9%85%92%E9%A6%99%EF%B8%B6%E9%95%B6%E5%B5%8C%E6%98%8E%E6%9C%88%26%E6%97%B6%E5%85%89%EF%BC%8C%E6%BB%BF","rlevel":"51","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/2a449cab5ae96a600c83c4f447a583d0ed4f77de31745a2e7bee3fc120338040\/30"},{"_cls":"servantList","rid":"369780","rname":"%E4%B8%A8%E5%88%9D%E7%A7%8B%E4%B8%A8","rlevel":"63","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/a3b4f421c655798aa030a91da75f7e575ff570708b3e2a3f37ca427052afe86c\/30"},{"_cls":"servantList","rid":"372432","rname":"%E3%82%9E%EF%B9%8F%E9%9D%92%E6%98%A5%E5%BE%AE%E5%87%89%E3%80%81%E4%B8%8D%E6%82%B2%E4%BC%A4%E3%83%9F","rlevel":"61","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/52b3f85468b1f7562ec984a0ef3863cb8357ae74f94063a787666e0d1dd58652\/30"},{"_cls":"servantList","rid":"385694","rname":"%E9%83%81%E9%9F%B3","rlevel":"59","serstatus":"1","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/d8219673598dbd6ff2f908cf2c4ccaa098100cd902c72bb7817d37db701747cb\/30"},{"_cls":"servantList","rid":"388454","rname":"%E5%94%89%E5%A3%B0%E5%8F%B9%E6%B0%94","rlevel":"45","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/d02f66f3bfd09f50d29a9b226319924865354f50b70c36dceccf95f81b125455\/30"},{"_cls":"servantList","rid":"390176","rname":"Bruce%2Fty%E5%87%9D%E8%A7%86","rlevel":"50","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/06d264c84a243d464077952ae8e1b40023d1d62b87f1eefbf330c23110002620\/30"},{"_cls":"servantList","rid":"390420","rname":"%E3%83%AB%E3%82%AB-%E3%82%AB~%E2%98%86","rlevel":"40","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/540a7228d181380ac5d5b44007ae3f5a9b80cbb2c6ddd250b64b282bfce4f8f2\/30"},{"_cls":"servantList","rid":"391310","rname":"___IU%C2%B0","rlevel":"65","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/c01bf9e83c6e1006e75ec1d05007ee6b9c97b8cf98c27be38504ec929c0c9f7b\/30"},{"_cls":"servantList","rid":"393394","rname":"%E6%88%90","rlevel":"61","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/fa5d80ebf9fc89aaf8b0a703cf31dda24a61f162906e6f4e76ae4bd4d226b46e\/30"},{"_cls":"servantList","rid":"395987","rname":"life","rlevel":"50","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/c3c8a59edd4f35dc8e03fffd0b4b5a06996907277935eeab806a03b1a099ca55\/30"},{"_cls":"servantList","rid":"399378","rname":"%E5%BF%AB%E5%88%B0%E6%88%91%E7%A2%97%E9%87%8C%E6%9D%A5","rlevel":"69","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/4296d9220a80af685332a40fecb8e29884d0dfe4f3f798bfefe18bb69723aa30\/30"},{"_cls":"servantList","rid":"399567","rname":"%E6%81%92%E5%AE%87%E6%B1%BD%E8%BD%A6%E7%94%A8%E5%93%81","rlevel":"61","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/ba1528f95cccf95b8c4f11d09f06bea1de6e829d1a6d2977384bf8a7615ecba1\/30"},{"_cls":"servantList","rid":"400066","rname":"%E6%97%A0%E8%83%BD%E5%8A%A0%E5%8F%AF%E7%AC%91","rlevel":"59","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/cd1e3e8458dc491b332f4384b929061dbdfd571c5b874ce1233de4a8c3d070cf\/30"},{"_cls":"servantList","rid":"404382","rname":"Hal%C2%B0","rlevel":"53","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/a77546418354b602236fc15166e77d33b2446328e4b02d7f8b75153ca7c95b7a\/30"},{"_cls":"servantList","rid":"410633","rname":"%E8%B1%9A","rlevel":"65","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/4296d9220a80af68ba067748c9c0a1a55c11fd0cae3028c17981f74ef1344a8b\/30"},{"_cls":"servantList","rid":"413657","rname":"%28%23%E2%80%B5%E2%80%B2%29","rlevel":"70","serstatus":"2","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/43a357988b13b4b87f519c4125c75f016591d81c95b785817399cb2fafbceb0c\/30"},{"_cls":"servantList","rid":"417011","rname":"%E6%9D%AF%20%E6%9C%AA%20%E6%BB%A1","rlevel":"56","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/a77546418354b602caa2b5c672ee8301daa3dfc9696f0b8498ab788beb6e5399\/30"},{"_cls":"servantList","rid":"420816","rname":"%E7%B0%8C%E7%B0%8C%E5%86%AC%E9%A3%8E","rlevel":"70","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/1f7774915cb0d6730dd74f430259b4f9337f5175c1dae9fb82875af47391657c\/30"},{"_cls":"servantList","rid":"430650","rname":"%E6%B4%AA%E6%96%8C","rlevel":"67","serstatus":"0","headurl":"http:\/\/pyapp.qlogo.cn\/campus\/c265e4bd629300c515f985c5ba18590e18cbfe2ea732c086ca71b66343fa8fca31d89f32e9744b94\/30"},{"_cls":"servantList","rid":"444053","rname":"%E2%9C%BF%20%E3%80%82%E5%A8%81%E5%BB%89%E7%8E%8B%E5%AD%90","rlevel":"70","serstatus":"2","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/7f7c2417913f508dfdef871cac020cefcf552a91bc48c46b9b9a928e20c35279\/30"},{"_cls":"servantList","rid":"448096","rname":"MichiGO","rlevel":"48","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/74b89545229ac4d4f3b7344714e0426790f9dd25d42407eab1f5c8dd1c50ea33\/30"},{"_cls":"servantList","rid":"451555","rname":"-%E2%9D%A4Ctrl%2B%C2%A0C%C2%A0","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/d8219673598dbd6fe83fa5d14b3814f813ba8bc8dbc53a92928edf962b9441cb\/30"},{"_cls":"servantList","rid":"457325","rname":"%E2%84%A1%E5%BA%85%E3%80%81%E9%97%9F%EF%B9%8F","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/b7f3014cca60d94dcba01e8c2bf0ff1c1254a8bd7c3af42ce534b7fd5de4f5a6\/30"},{"_cls":"servantList","rid":"472450","rname":"%E9%BE%8D%E7%8C%AB","rlevel":"70","serstatus":"1","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/e310302343d2c249746299c8fa320423cda3f8c912777f1d8d34721c2d7b3156\/30"},{"_cls":"servantList","rid":"473542","rname":"%CE%B6%E0%B8%B1%CD%A1%CC%AF%CC%AF%DE%93%DE%87%DE%87%DE%87%E0%B8%B1%20%DE%93%DE%87%DE%87","rlevel":"62","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/0f93d128bb501f6b72a533829ca7652c7528113dfeca1c9e4dca94e7526ed70c\/30"},{"_cls":"servantList","rid":"486200","rname":"6%E6%9C%8817%E5%8F%B7%E5%A4%A9%E4%BD%BF","rlevel":"70","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/7e23615195608a7dcd069aca8c0ec9c2bf314cee436d26cf7edc459c5e02f7af\/30"},{"_cls":"servantList","rid":"502699","rname":"%E5%8C%97%E6%96%97","rlevel":"64","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/9bb02f677231281bf4b05b6077d62436d0609f876ea1e840d464e732d4d73c20\/30"},{"_cls":"servantList","rid":"504383","rname":"%20%20%20%20%20%20%20%20%20%20%20%20%20%E3%80%80%20","rlevel":"50","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/d597256039151b48ec26d20aa4c5634f8dd10a17aabb9840f7c10b489c2cafc1\/30"},{"_cls":"servantList","rid":"522835","rname":"%E3%81%90o%CE%BF%E3%82%9E%E9%9D%99%E7%84%B6","rlevel":"50","serstatus":"1","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/8742d6cd742bfcfbd2a4cd800882bc82102b676941a3c212cd87de7fc4c955e6\/30"},{"_cls":"servantList","rid":"527960","rname":"%E2%80%94%E2%94%81%E2%95%8B%E3%81%86%E3%8A%B0%E2%96%90%20%E7%8D%A8%E9%86%89%E2%95%8B%E2%94%81%E2%80%94","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/e9da67923fea3e45ff8e40f391383fdfbedccf168fe46cef513e7ad9aa91b78b\/30"},{"_cls":"servantList","rid":"529168","rname":"%E5%81%B4%E8%80%B3%E3%81%B9%E5%82%BE%E8%81%BD","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/30eb7b4d48340a14072c19d517f9472cf5997208c6c98a1ad0c33ae7b980fe8b\/30"},{"_cls":"servantList","rid":"532383","rname":"%E2%80%9DAng%20%E3%80%82%E7%89%B5%20%20%20","rlevel":"66","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/d8219673598dbd6ff3ee6b0c26d45dad6577fa8e9f5b7640434479abfaf83520\/30"},{"_cls":"servantList","rid":"533387","rname":"Jerome%E4%B8%B6","rlevel":"50","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/fa5d80ebf9fc89aa9c23dca13601293a12cedcd4a2250815ef74977ac416a47b\/30"},{"_cls":"servantList","rid":"542934","rname":"%E9%98%B2%E5%BE%A1%E8%89%BE%E6%BB%8B%E4%BD%A0%E6%88%91%E6%9C%89%E8%B4%A3","rlevel":"51","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/13675a92aec0dfe2ad58e41daaedddbebe9b276b273ae3b37f205418d934c2af\/30"},{"_cls":"servantList","rid":"546853","rname":"%E5%B0%8F%E5%90%B5%E5%B0%8F%E9%97%B9%E5%B0%8F%E5%B9%B8%E7%A6%8F%E3%81%B7","rlevel":"62","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/72a0df78bf8c85f298151fcd15161aa1a2ed677beeadc8f0709f7eae16d30d23\/30"},{"_cls":"servantList","rid":"550483","rname":"%E2%88%9D%E3%80%81%E7%88%B1%E5%B0%B1%E4%B8%80%E4%B8%AA%E5%AD%97","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/d8219673598dbd6fe073db01c1a46649e50f47559a8f0fa9339657e16dde5495\/30"},{"_cls":"servantList","rid":"556364","rname":"%E3%82%9B%E2%99%AB%20%E4%B8%93%E6%8A%A2%E5%B0%8F%E5%AD%A9%E6%A3%92%E6%A3%92%E7%B3%96%E3%82%9B","rlevel":"66","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/13675a92aec0dfe201d80af5b148f434a56757b30d7404f515ce5b02211fafc9\/30"},{"_cls":"servantList","rid":"560676","rname":"%EF%BD%80%E7%89%BD%E8%91%97%E7%8F%8E%E6%97%B3%E6%89%8B","rlevel":"41","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/04a024c5447b334e667821ead747714a3a71f4cc9ae79c4062eb5956e781e847\/30"},{"_cls":"servantList","rid":"563987","rname":"%E2%94%8F%20%28%E3%82%9C%CF%89%E3%82%9C%29%3D%E2%98%9E%E8%B5%B0%E4%BD%A0%21","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/95dac2d0238d3f7b34a584d582e137300abcca77f5fba6a04de85d606d02e005\/30"},{"_cls":"servantList","rid":"574979","rname":"%E5%B9%BB%E8%B1%A1%E4%B9%8B%E5%B0%98","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/c3c8a59edd4f35dc2434714da24509b4407e9187d555aeea5ad94f6a66491a2b\/30"},{"_cls":"servantList","rid":"580075","rname":"%E5%8A%89%E5%BF%97%E5%89%9B%F0%9F%92%8Bsweet%E2%80%A6","rlevel":"49","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/aff242e95d20fb90f20b27ad0c9e08b2e92159acf80fc9f6a15eb7b23a99e374\/30"},{"_cls":"servantList","rid":"582249","rname":"%E4%BC%B1%E8%8B%A5%E5%AE%89%E5%A5%BD%E3%80%81%E4%BE%BF%E6%98%AF%E6%99%B4%E5%85%B2%E2%95%AE%20","rlevel":"69","serstatus":"2","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/7e23615195608a7d68cda0e5eb3d20af0752891ca93a4b62bb70f1f260119739\/30"},{"_cls":"servantList","rid":"585154","rname":"%E6%97%A2%E5%BE%80%E4%B8%8D%E5%92%8E","rlevel":"64","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/4cbc55a7f9a344246fa11be8103e1a6bf77486f40f1ced249b097ab9b3bc1109\/30"},{"_cls":"servantList","rid":"590028","rname":"%E8%BF%9B%E5%87%BB%E3%81%AE%E5%B7%A8%E4%BA%BA","rlevel":"58","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/d8219673598dbd6f096c76d9f5bbff12eff3d6eff49a81d096afe636e77de9d4\/30"},{"_cls":"servantList","rid":"593474","rname":"%E6%B4%BB%E5%9C%A8%E5%BD%93%E4%B8%8B%E3%80%82","rlevel":"58","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/f804ebf18ceb24ca22214b9c148f24c1e6ae62cf5f917238e944d2c5f25cceab\/30"},{"_cls":"servantList","rid":"597860","rname":"%20%20%20%201o%20%2C","rlevel":"44","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/c0ec4a6dd928858563c814d4c79857765443fe7c70825cae1a566f78f37524f9\/30"},{"_cls":"servantList","rid":"599695","rname":"%E5%8D%8A%E4%BA%BA%E9%97%B4","rlevel":"40","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/79cbb2c24e1465a98d05004de93c9b38aea825a4d4c6562158c1fd981029996d\/30"},{"_cls":"servantList","rid":"599760","rname":"%20%20%E5%8F%8C%E9%B1%BC%E5%BA%A7","rlevel":"41","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/7f7c2417913f508d8c8ebbfa8498fd21ce0e4aa9de2928ecb1e801d4fecfd82a\/30"},{"_cls":"servantList","rid":"599970","rname":"%E4%BB%BB%E7%88%BD","rlevel":"45","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/f222d66b35733712c2aacdb0d13f4d8a00357b4fd2e795781a3b8236ea908cdc\/30"},{"_cls":"servantList","rid":"605377","rname":"%E5%93%B2%E4%BF%8A","rlevel":"42","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/2eaee6da8ea3be02bfc5bee11826cecf22c2d2e68a060d2e9c7089dbf2ef5cb1\/30"},{"_cls":"servantList","rid":"607835","rname":"%E3%82%9E%E7%B4%9F%E5%A7%A9%E9%8B%B6%E8%8D%87%E3%82%9E","rlevel":"65","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/aff242e95d20fb905668127cf369d5b1858cba341da8e04afb99444d2afb3dc9\/30"},{"_cls":"servantList","rid":"608244","rname":"%20%20%20%20%20%E3%81%83%E5%AE%89%E4%BA%8E%E5%91%BD%E2%80%94%E2%80%94","rlevel":"50","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/d8219673598dbd6fff51668fa47ebd24c7af0af36b876ad458d0696d35b86657\/30"},{"_cls":"servantList","rid":"608984","rname":"%E7%B4%AB%E9%BE%8D~~","rlevel":"70","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/79cbb2c24e1465a91b833d4706ce02fc24b64dcd9a1c8d426a3f78238a049bd3\/30"},{"_cls":"servantList","rid":"618749","rname":"%E6%B8%85%E6%B8%85","rlevel":"65","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/6c56fabc3bc7003c5fc7edd9addb7364813df3bd35c845b095de0639a03d017f\/30"},{"_cls":"servantList","rid":"618900","rname":"%E7%89%A7%E7%AB%A5","rlevel":"63","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/f804ebf18ceb24cabeecc4d2bb9a1149b25bd567f5a7e9eae362a569d0e57a50\/30"},{"_cls":"servantList","rid":"627050","rname":"%E5%81%9A%E5%9B%9E%E8%87%AA%E5%B7%B1","rlevel":"55","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/7ffd5223f03d7a330fe484955a02abd215265177c23438deafddc038df473e83\/30"},{"_cls":"servantList","rid":"639663","rname":"%E6%B4%9B%E9%9C%9C","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/1853067e57572c80c7cd3c5b420688c9297049d47b8c753a\/30"},{"_cls":"servantList","rid":"641308","rname":"..","rlevel":"62","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/462fee9d8b2be9cc5ab538cdf483d333adcec8396ce4a148c51dd49c1e05f520\/30"},{"_cls":"servantList","rid":"647745","rname":"%E6%83%85%E4%B8%B6%E8%BF%B7","rlevel":"66","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/30eb7b4d48340a144959677d327ab1a85ce26c46f369d7017ea7a8703cc0d085\/30"},{"_cls":"servantList","rid":"650042","rname":"%E6%B5%B7%E9%98%94%E5%A4%A9%E7%A9%BA%E5%98%BF%E5%98%BF","rlevel":"50","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/498fe6b75281db149a1e4865e67b91ddb63de5ff16641cb3c7c262c4ae3b4adf\/30"},{"_cls":"servantList","rid":"658431","rname":"%20%20%E7%9C%8B%E4%B8%8D%E6%87%82%E9%9B%BE%E4%B8%8E%E5%B0%98%2A","rlevel":"70","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/786c4e691e255552639c21c2720fdb1f39770bd7ab113eb585c8bfeb2c66e274\/30"},{"_cls":"servantList","rid":"662718","rname":"%E8%B5%B5%E5%8B%87%E6%99%BA","rlevel":"46","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/d02133ecec528eb16a7ea43a0cc60ce4d0c18d37907b774995ee7b0f963647ea\/30"},{"_cls":"servantList","rid":"665327","rname":"%20%E2%84%A1Faith%E2%95%AE%C2%B0","rlevel":"36","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/a77546418354b602a1643639274ec0b5fd6f8593156d6331a7314d862c30db16\/30"},{"_cls":"servantList","rid":"665949","rname":"%E5%A3%B9%E8%9A%8A","rlevel":"43","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/498fe6b75281db142324692d7d79cba9df2b00f3176cf9deff76c79e5b2d2e1e\/30"},{"_cls":"servantList","rid":"666267","rname":"%E2%99%AA%E3%80%81%E5%A8%9C%20%20%E5%A8%9C~","rlevel":"40","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/30eb7b4d48340a14c29a8163edbc9c112ba1f0ac4c311ed3e5b5c456aa04c3e4\/30"},{"_cls":"servantList","rid":"693800","rname":"%E6%80%9D%E8%A1%8C","rlevel":"54","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/2ed71fc3734a421f53dbee281948e07daf7233ef9d6f0ac236c75e83fa69b71f\/30"},{"_cls":"servantList","rid":"696293","rname":"%20%E2%95%B0%E3%82%9D%E4%B8%8D%E5%B8%AE%E5%88%AB%E4%BA%BA%E5%85%BB%E5%AA%B3%E5%A6%87","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/a9791e23721585338307990ee694fe5fca3bf54a6bd03b941d71ff351a1e7bec\/30"},{"_cls":"servantList","rid":"696400","rname":"%CE%B6%DE%93%DE%87%DE%87%DE%87.%E6%9E%97","rlevel":"50","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/43a357988b13b4b8247aa6fdbcd9ac6ddd495f61c89c38dfd2beae553e29859a\/30"},{"_cls":"servantList","rid":"699570","rname":"%20%20%E7%A9%BA%E5%BD%A7%E9%B8%B7%E3%80%81%20","rlevel":"53","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/e790024e73f87b80e27e94f99656d72521bc3a3ffdcb2d03a6e8d600779b0adf\/30"},{"_cls":"servantList","rid":"702383","rname":"%E6%A9%98%E9%AD%85%E8%8A%B1%E9%96%8B%2Fka","rlevel":"55","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/d8219673598dbd6fba08f5bd17cc8d98028ba9b2472ff8ae97f8417d31f001dd\/30"},{"_cls":"servantList","rid":"705644","rname":"%E5%AE%88%E6%9C%9B%E8%80%85","rlevel":"26","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/c3c8a59edd4f35dca685176efb7a6ed42645285ed502f1e7b65d26e3a965f473\/30"},{"_cls":"servantList","rid":"705796","rname":"%E4%B8%80%E8%8B%86%E9%9A%8F%E7%BC%98%E3%82%9E%E2%95%83","rlevel":"50","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/d8219673598dbd6fc0e85b9b4a68a819abf6c03839b7fb7247a4c5804fcc2b4c\/30"},{"_cls":"servantList","rid":"711217","rname":"%E5%B9%B2%E5%BF%B5","rlevel":"37","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/95dac2d0238d3f7bf2defba41b021ca1ffa6ef35c178241bb3d0b0d4ae9b87a6\/30"},{"_cls":"servantList","rid":"714318","rname":"%E8%BD%A9","rlevel":"63","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/30eb7b4d48340a14ee86bcc4a7217274ab59bed87faf8de607f536dc811968ad\/30"},{"_cls":"servantList","rid":"716978","rname":"%E5%BF%98%E8%AE%B0","rlevel":"37","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/665315de1d9ca6c1653eca0e3598a9e90d2a86ab7b80f37818e28629735cef59\/30"},{"_cls":"servantList","rid":"719327","rname":"%E2%86%90a%2Fmg%E7%88%B1%E4%BD%A0%E2%86%92","rlevel":"70","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/6178af35c2e1e4d5170e1e248136622ce0b7327f5c5eac26d49a8f26d87142ed\/30"},{"_cls":"servantList","rid":"720018","rname":"%E5%90%8E%E6%9D%A5","rlevel":"70","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/c2a5760c145f85bd8a0f0497be195a99768952a78735c02a1309ac319903af0d\/30"},{"_cls":"servantList","rid":"720884","rname":"%E8%88%9E%E8%8B%8D%E7%A9%B9","rlevel":"46","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/ef0f77762b396aaf2b9d0aa34f0a5f8da61dd4896047b02b627cd8f7cb22ef28\/30"},{"_cls":"servantList","rid":"723043","rname":"%E9%A3%8E%E5%B0%8A","rlevel":"35","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/3b9a4bbcdd70c7038342a91375fd3feb8f628fc49fa0490504ab696d8ad46090\/30"},{"_cls":"servantList","rid":"723213","rname":"%E7%B0%A1%E5%96%AE","rlevel":"66","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/fa5d80ebf9fc89aa9c76d85583fd0c0cfb973316963ffb0e4e9e5f9466d0581a\/30"},{"_cls":"servantList","rid":"726519","rname":"%E9%92%93%E9%B1%BC%E5%B2%9B%E4%BA%8B%E4%BB%B6%E4%B8%B6%E6%88%91%E6%96%B9%E8%A1%A8%E7%A4%BA%E8%B0%B4%E8%B4%A3","rlevel":"37","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/d8219673598dbd6f5fa2c3d1223ae3b8f961c186e2d25fc30832f8cf55031acb\/30"},{"_cls":"servantList","rid":"726855","rname":"%E8%90%8C%E5%A4%A7%E6%B1%89%2C","rlevel":"70","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/e1bf14f30edae71b4e7f56cc8db6c174c202c037e44105a8573ffd7be94816b9\/30"},{"_cls":"servantList","rid":"726892","rname":"%E7%AE%80%E7%88%B1%E4%B8%80%E7%94%9F","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/95dac2d0238d3f7bb600f4ed320e79841984d883894c141ccf14a1770827320a\/30"},{"_cls":"servantList","rid":"728271","rname":"%E7%AA%9D%E7%AA%9D%E2%80%A6%E2%80%A6","rlevel":"46","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/95dac2d0238d3f7bb5985ca84ae824b58e2c00fc285509cc156971402d5791aa\/30"},{"_cls":"servantList","rid":"730423","rname":"%20Zax","rlevel":"41","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/fa5d80ebf9fc89aa0d6785e2e7d6f50323d0261706d295ed09012e2502ca82f2\/30"},{"_cls":"servantList","rid":"730462","rname":"%E4%B8%8D%E4%BD%9C%E6%AD%BB","rlevel":"45","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/43a357988b13b4b840c7bc26fc2f53e914b33b44dfe802f066eae9a3652a9a77\/30"},{"_cls":"servantList","rid":"734155","rname":"%E4%B9%9D%E5%BD%A9%E7%BE%8A%E5%A8%83","rlevel":"49","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/c93a02897e353cac55477e1ebdbb6c92028d43fcb56de0dbd2dd64ea7bc22701\/30"},{"_cls":"servantList","rid":"736228","rname":"%E7%88%B1L.O.V.E","rlevel":"42","serstatus":"1","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/95dac2d0238d3f7bafab28d959082980a42a85548a8189b35b2ff6f8fa117277\/30"},{"_cls":"servantList","rid":"736436","rname":"%E5%AD%A4","rlevel":"39","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/e3e6b4bc45ca4d195388729a77808d76ea0a5eae75ba5077e672c71162a735af\/30"},{"_cls":"servantList","rid":"736487","rname":"%E2%9D%A4%E7%92%90%E3%80%81","rlevel":"65","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/a77546418354b602e06ee2c6e583d69ccd2d642642fec1ccfdb38cbccabf091e\/30"},{"_cls":"servantList","rid":"736876","rname":"%E8%8F%9F%E5%AD%90%C2%B7%E8%80%81%E5%A9%86","rlevel":"39","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/72a0df78bf8c85f2d259bdf3ee74e60addcc384a399cc7ebe7302b1a72e6d635\/30"},{"_cls":"servantList","rid":"740269","rname":"%E2%95%AD%E2%98%85%E3%83%A1%E3%83%AA%E3%82%9E%E7%BE%8A","rlevel":"70","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/d8219673598dbd6fa96837f613f43eb69d5b23945056183ab152dea47eba7ff0\/30"},{"_cls":"servantList","rid":"740706","rname":"1s%20%E2%80%B5%E5%AF%B6%E5%AF%B6","rlevel":"50","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/c3c8a59edd4f35dce764b1383ece7bbb4e16ea204c2df574524857ea60b9a911\/30"},{"_cls":"servantList","rid":"740988","rname":"%E5%85%8E%20%E5%AD%92%C2%B7%20%E8%80%81%E5%85%AC","rlevel":"38","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/69fd5260a8d973c3695332aef23e2f0129f90de861af6a51e302c18dc93deb2e\/30"},{"_cls":"servantList","rid":"745165","rname":"For%20love%20persistent","rlevel":"35","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/76d2050cd97433655819986369117af6ad0b240c51e93aa974a32ae59ac60fbc\/30"},{"_cls":"servantList","rid":"759818","rname":"%E7%9A%AE%E8%9B%8B","rlevel":"50","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/c2a5760c145f85bdd604442b4dbd55e7eb2ed8841ada92ca297bd661983aa15f\/30"},{"_cls":"servantList","rid":"761270","rname":"771430743","rlevel":"49","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/f804ebf18ceb24ca603b146a437e3eace9e59987b329d045036c16ae5608e712\/30"},{"_cls":"servantList","rid":"765097","rname":"%E3%82%B8%E4%BA%BA%E5%9C%A8%E5%81%9A%EF%BC%8C%E5%A4%A9%E5%9C%A8%E7%9C%8B%E2%80%B3","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/e1bf14f30edae71b901dfba64f5b1756a10079e451b59a6516004fa56599903d\/30"},{"_cls":"servantList","rid":"771116","rname":"%E6%99%82%E5%85%89%E6%98%AF%E8%A8%98%E6%86%B6%E7%9A%84%E6%A9%A1%E7%9A%AE%E6%93%A6%E2%80%B3","rlevel":"70","serstatus":"1","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/72a0df78bf8c85f265e62dc0c71b7c445e26e45460ed7763948105b92f4c507e\/30"},{"_cls":"servantList","rid":"773214","rname":"%20%20%20%20Golgotha","rlevel":"53","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/b025b6dd00a560fce1ce0d5e3ded97ee443d765d1c0d7a24d41c14d919eeb5fd\/30"},{"_cls":"servantList","rid":"773253","rname":"%20%20%20%20%20%E5%85%AB%E5%8D%83%E5%87%89%E3%80%82%20%20","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/d8219673598dbd6f64dfd5f0305ae4167d851a7ddf1be66063de3d4145da939d\/30"},{"_cls":"servantList","rid":"776982","rname":"%E0%B9%91%DB%A9%DB%9E%DB%A9%E0%B9%91","rlevel":"45","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/d8219673598dbd6fbd28a837da8fd05566de493d648dd82e824474b1152e6396\/30"},{"_cls":"servantList","rid":"777653","rname":"%20%20%20%20%20%E7%88%B1%E4%B8%8A%E4%B8%80%E4%B8%AA%E4%BA%BA%DE%93%E0%B9%93","rlevel":"64","serstatus":"2","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/f4b7d7aba47b71769a34c6a87b0a5f275fb574d202d56acc4e5ee7eabcae4251\/30"},{"_cls":"servantList","rid":"778905","rname":"%E2%97%87%E6%82%B8%E5%8A%A8%E3%80%81%E4%BC%B1%E7%BA%AF%E6%83%85%E7%9A%84%E7%9C%BC%E7%9C%B8%E3%82%9E","rlevel":"38","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/d8219673598dbd6f7626bc058f4dd10cd6e0716cc10772091af255a117d0d068\/30"},{"_cls":"servantList","rid":"781321","rname":"%E3%80%80%20S%20%26%20M","rlevel":"55","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/cd1e3e8458dc491b92f764013834fc2cfe8c50d0bc43af1e3d4051043d10a589\/30"},{"_cls":"servantList","rid":"791590","rname":"182871751","rlevel":"47","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/3b9a4bbcdd70c7038b6ab7745bf0dbc2c065d862726517dd59261571f108675d\/30"},{"_cls":"servantList","rid":"792007","rname":"ever","rlevel":"39","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/47c5081aeef5bc9d0c315e6c72fc59ee39ad56f596197b33eb34e7819d3a2c50\/30"},{"_cls":"servantList","rid":"792425","rname":"%E3%80%80%E3%80%80%E3%80%80%E3%80%80%E3%80%80%E3%80%80%E3%80%80%20%20","rlevel":"50","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/30eb7b4d48340a14cf0e8ef6439ce6ed6fde6dbeaad82843f5d64bb7a04d1f13\/30"},{"_cls":"servantList","rid":"793278","rname":"%E6%9C%A8%E6%98%9C","rlevel":"45","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/c3c8a59edd4f35dc66f82ddee86ba5f3c35d289a73cdac3a3a1d03545032ec00\/30"},{"_cls":"servantList","rid":"797427","rname":"%E6%83%B3%E7%9D%A1%E8%A7%89%E8%A7%89T_T","rlevel":"67","serstatus":"2","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/884461b98a364a916ff491c55792783620678ea9341034eb5c64a4c1ad22bbc0\/30"},{"_cls":"servantList","rid":"798388","rname":"loxmi%20%20%27","rlevel":"50","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/d8219673598dbd6f7b7e6b38bb0d83cc2f09c8cb20e5fa33ec76d779e68d2579\/30"},{"_cls":"servantList","rid":"800261","rname":"%E8%99%9B%E5%83%9E%E4%B8%B6%E4%B8%8D%E6%AD%A2%E4%BA%8E%E8%A1%A8%E9%9D%A2%E8%80%8C%E4%BA%8E%E5%BF%83","rlevel":"40","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/ef0f77762b396aaf6347292bd8202323d929133450bba1b9101535ac47a99d24\/30"},{"_cls":"servantList","rid":"802711","rname":"%20%20%20%20%2010%E7%82%B945","rlevel":"54","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/1b764e909d6d67fa43e8f9bc660e482a619c5c2450cdafe86cba11b212a7f93f\/30"},{"_cls":"servantList","rid":"805000","rname":"%E8%8B%A5%E5%B0%98","rlevel":"50","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/e1bf14f30edae71b75350341374b050b5dc9175eed55911e06b5f2183ce73395\/30"},{"_cls":"servantList","rid":"806310","rname":"%E3%80%80%20%E3%80%80%E3%80%80","rlevel":"35","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/d8219673598dbd6fbab2e8eca36d2a8b9386063c1756848ebcacea10bbec4faa\/30"},{"_cls":"servantList","rid":"811625","rname":"%20%E5%BC%A0%E5%97%A8%E5%97%A8%20%E2%9D%80","rlevel":"51","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/a77546418354b6022aa45149a8b15587f7ca0a5ee046942ab214c3b67bc32881\/30"},{"_cls":"servantList","rid":"812618","rname":"yi%E4%BA%BD%E7%8D%A8%E5%A5%8F%E3%80%81","rlevel":"70","serstatus":"1","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/30eb7b4d48340a14d8600947eab8ef9e3ecfb8c6baeb7a62cc6f284e206f1dda\/30"},{"_cls":"servantList","rid":"814220","rname":"%E6%88%8F%EF%BC%82%E4%B8%AD%EF%BC%82%E6%88%8F","rlevel":"66","serstatus":"2","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/06d264c84a243d46f71287b9c597d2dae8bb427f236f14f3e3713ab672153dd6\/30"},{"_cls":"servantList","rid":"817493","rname":"%E5%A4%9C%E8%89%B2%E6%96%91%E6%96%93","rlevel":"40","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/d8219673598dbd6fbc99edf9cb3de29f015659ecba598a0c2902dc2f42988205\/30"},{"_cls":"servantList","rid":"818833","rname":"%20%20%20%20%20Roy%20%20%20","rlevel":"54","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/1c5672d740efc4006e1672f09805d8f51ea58cdf702827aa99d1d831b0e593aa\/30"},{"_cls":"servantList","rid":"820841","rname":"Mr.","rlevel":"35","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/c2a5760c145f85bdd5d638476c1aff7839fdd8ada6c15a4522cb9a687c2aad61\/30"},{"_cls":"servantList","rid":"821927","rname":"%E3%80%82%E3%80%82%E3%80%82%E3%80%82","rlevel":"50","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/51e7eb7bff718a8d1bd4179dad75b72d566cd545a34ddb4a98d7f378b46e1200\/30"},{"_cls":"servantList","rid":"822364","rname":"demo","rlevel":"52","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/aff242e95d20fb90e24d62de1a54b7af6489bf7658310004c63f357dd6566f50\/30"},{"_cls":"servantList","rid":"822942","rname":"%E7%81%B0%E8%89%B2%E9%83%8E","rlevel":"70","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/e3e6b4bc45ca4d1942cfcc7ff04dbb527c50d0e4552770a3caee8b7f96f6dc02\/30"},{"_cls":"servantList","rid":"823192","rname":"demo%C2%B0%E8%89%B2","rlevel":"47","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/f274f43a49eb0b0c8ea58e79f29ad1d7838a0be3ea003974aeb07bf47f881162\/30"},{"_cls":"servantList","rid":"823938","rname":"%E4%BD%95%E4%BB%A5%E8%BF%B0%E8%AF%B4","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/7ae19cb8cfdf29ce568097880c0431676c1c7e7816525d792a780b0acac0fc85\/30"},{"_cls":"servantList","rid":"823942","rname":"0.0","rlevel":"55","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/6b58a205b729c641c9010646c0e35513250c90685c470a33271dc2373e37d716\/30"},{"_cls":"servantList","rid":"823947","rname":"Te","rlevel":"57","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/0750a6de80d4f8921c9851696e396f798be61d9631027362206871d536b3f656\/30"},{"_cls":"servantList","rid":"823962","rname":"xsawda","rlevel":"56","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/5e52f30bee80e644ad8e02c53bbe1a8438b714663d874b62e5e959ac8afea17f\/30"},{"_cls":"servantList","rid":"827520","rname":"__%E5%B0%8F%E9%98%AA%E5%8D%83%E5%AF%BB","rlevel":"70","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/d8219673598dbd6f272b814948cee895914e21b23ea55452feafe6789a78028e\/30"},{"_cls":"servantList","rid":"832506","rname":"Flying%20wild","rlevel":"55","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/ecdab82720caeb862cf895fd71b41a100edb6a1379d445aa0a0f33519a623614\/30"},{"_cls":"servantList","rid":"835054","rname":"%CE%B6%E0%B8%B1%CD%A1%DE%93%DE%87%DE%87%DE%87%E0%B9%93%E5%B0%8F%E8%8F%87%E5%87%89","rlevel":"49","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/4296d9220a80af68ed19acd5ac266483ef93fe2e4a28aa8fe0b028362c5cd9c6\/30"},{"_cls":"servantList","rid":"835354","rname":"%20%E6%B2%A6%E4%B8%BA%E7%A5%9E%20","rlevel":"45","serstatus":"2","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/95dac2d0238d3f7b0d928922c1ab57b35cde24e3ae18b445be456d9372c12d20\/30"},{"_cls":"servantList","rid":"835805","rname":"%E7%A2%A7%E6%B5%B7%E5%90%AC%E6%B6%9B","rlevel":"62","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/db27b58f0b80aa73e0301f93062634161e82d1ca73adf3e8517cda3c0e994c9a\/30"},{"_cls":"servantList","rid":"835939","rname":"%E3%80%80%E3%80%80Embrace.%20","rlevel":"53","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/02421c7a7300de782725c9461f033f2cac8c0311f5d86ff8dd5cb80b14f2d1ba\/30"},{"_cls":"servantList","rid":"837701","rname":"%E5%94%90%E5%B0%B8%E5%BC%8E%E6%91%86%E6%89%8B%E4%B8%B6","rlevel":"54","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/5ea6f89b60a64ee4a01b5a6529b11b93f7c58689375913ff9ebd8f44c75c6fbc\/30"},{"_cls":"servantList","rid":"839524","rname":"%E5%94%AF%E7%BE%8E%E2%86%97up","rlevel":"34","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/2eb5c218e66807b919599023b50c886f10501a8f3f89c5b87eee45bb0b1a182b\/30"},{"_cls":"servantList","rid":"841028","rname":"%E8%B5%B5%E5%B0%8F%E9%99%8C","rlevel":"40","serstatus":"1","headurl":"http:\/\/pyapp.qlogo.cn\/campus\/5022c26fde2bc698fa7f778e92635e3620fcb086aa7de06b26f017b829feae05c7ce4410a33674c6\/30"},{"_cls":"servantList","rid":"844407","rname":"%E4%B8%8D%E7%88%B1%E8%AF%B4%E8%AF%9D","rlevel":"46","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/13675a92aec0dfe2ad93b14a41446069bdccf9250052f980c65631778f950bdf\/30"},{"_cls":"servantList","rid":"844547","rname":"%20%EF%BD%83%EF%BD%8C%EF%BD%8F%EF%BD%93%EF%BC%A5","rlevel":"50","serstatus":"1","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/d8219673598dbd6fa4906c902d647719c491e9f19ab2874ef7ec566cabf9e4e8\/30"},{"_cls":"servantList","rid":"844950","rname":"%E4%B8%80%E4%B8%AA%E4%BA%BA%E2%95%AE%E9%94%99%E8%A7%89","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/fa5d80ebf9fc89aa33b1725fa711da6b289c57f347d7b0eee9d9608be34251db\/30"},{"_cls":"servantList","rid":"847481","rname":"%E6%88%91%E8%AF%B4%EF%BC%8C%E5%81%9A%E6%A2%A6%E4%B9%9F%E4%B8%8D%E6%94%BE%E8%BF%87%E4%BD%A0","rlevel":"48","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/292b3877d2cf7db220ca0fd6ede0d12d519da028a78cb63e744388085269b1fd\/30"},{"_cls":"servantList","rid":"847508","rname":"%E4%B8%8B%E4%B8%80%E7%AB%99%E5%B9%B8%E7%A6%8F%20","rlevel":"56","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/79cbb2c24e1465a9b604eed0e08bda3e09b3ae488ead2056b6422b23e1612735\/30"},{"_cls":"servantList","rid":"848061","rname":"%60%20%E6%9C%A8%20%E5%AD%90%20.","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/498fe6b75281db14574595ff10a60335baef27bb44a3bc806e6f27164d84dd6f\/30"},{"_cls":"servantList","rid":"850265","rname":"%E6%B6%88%E9%80%9D%E7%9A%84%E2%80%9C%E4%B8%80%E2%80%9D","rlevel":"35","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/e9448680db830fde3954216e92fbdded2f09a8647e61f064a2b8cc46dbc5f481\/30"},{"_cls":"servantList","rid":"857529","rname":"%E5%BC%A0%E7%90%AA","rlevel":"42","serstatus":"0","headurl":"http:\/\/pyapp.qlogo.cn\/campus\/c265e4bd629300c5b5cfb74d618f3f68db1548dfae0662803625f0f54bbbcb45b0b0b68395d33000\/30"},{"_cls":"servantList","rid":"858525","rname":"%E3%80%80%20%E5%90%AB%E7%AC%91%E9%A5%AE%E6%AF%92%E9%85%92%E3%80%81-Dsb%E3%80%80%E3%80%80","rlevel":"50","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/3c95e76578f48cf2a807e5bc3c1816288a91afd90ddc965a955e7c1981314679\/30"},{"_cls":"servantList","rid":"860048","rname":"Grown%20Ups","rlevel":"55","serstatus":"1","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/2ed71fc3734a421ffe770e470f3ec1bda4bfaf4e63d6994f257079f3af1c8107\/30"},{"_cls":"servantList","rid":"861988","rname":"%E8%90%BD%E8%88%9E","rlevel":"45","serstatus":"0","headurl":"http:\/\/pyapp.qlogo.cn\/campus\/2756df205403cb394e8274483013a97e354807902b67224fb2b33fe3dfc6829bb1a6e941d883f470\/30"},{"_cls":"servantList","rid":"862798","rname":"321","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/d8219673598dbd6f871dbbe3e5bfe539eaa2a3697ecbd2f01d10ff802d8bfde2\/30"},{"_cls":"servantList","rid":"869900","rname":"%E7%A8%8B%E4%BA%91","rlevel":"50","serstatus":"0","headurl":"http:\/\/pyapp.qlogo.cn\/campus\/5bb20c8fc9051a7953663742b3f6edbc77f290af06f61116ea69fd22a033cd69c5a002d8383fec5e\/30"},{"_cls":"servantList","rid":"874258","rname":"%E5%AE%88%E6%88%91%E7%9A%84%E8%AF%BA%E8%A8%80%E5%AE%88%E4%BD%A0%E7%9A%84%E5%BF%83","rlevel":"53","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/c85850a92d682b0e1ed5345914a95d264988f1e3db7bb9c3f96a82100a977ab9\/30"},{"_cls":"servantList","rid":"889614","rname":"N~","rlevel":"40","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/4296d9220a80af68714c0d11806b2479ed66708afe018eab95c26d75d90b6ffc\/30"},{"_cls":"servantList","rid":"897700","rname":"%E5%A4%A9%E5%AE%87%E6%9C%BA%E6%A2%B0%E5%8A%A0%E5%B7%A5","rlevel":"62","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/d8219673598dbd6f3f52408a51dfe1c2cd4bb1b60cfe6397585d73e21c9594f5\/30"},{"_cls":"servantList","rid":"897890","rname":"sb%E4%BA%8C%E5%8F%B7","rlevel":"54","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/44def254279f2d6f26e5bde34705cc530d5b0023585cdb7238e629a2288a60c4\/30"},{"_cls":"servantList","rid":"897912","rname":"sb%E4%B8%80%E5%8F%B7","rlevel":"53","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/4c9e187290f2d3258bd63e4f494d6e90ee570702c3be53c44d228e952568cccb\/30"},{"_cls":"servantList","rid":"905609","rname":"%E5%8A%8D%E8%B5%B0%E5%81%8F%E9%8B%92","rlevel":"70","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/d8219673598dbd6ff2f814d77a777c52f0afb93e1c368d2cb187bbcdfb79eb12\/30"},{"_cls":"servantList","rid":"907443","rname":"Eight%E3%80%82","rlevel":"70","serstatus":"1","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/664dc5021a4d2683d0f4a256429d3eaa7b4826955eb179527386ad33cfb10347\/30"},{"_cls":"servantList","rid":"912004","rname":"ming1%E5%8F%B7","rlevel":"54","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/379459bca9ce811870f1f7448b2bc240b409af24fad288e278fed540dafb73d0\/30"},{"_cls":"servantList","rid":"912069","rname":"ming%202%E5%8F%B7","rlevel":"55","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/f11821bb3470e0ec8bad442eaf3083374214cd3f8ec585bc2e252f426be92af3\/30"},{"_cls":"servantList","rid":"912267","rname":"ming3%E5%8F%B7","rlevel":"54","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/8afa4a794bd7fc80fc776abcb5484ccf6b9068acac6f1f4b3c3e33501dde362d\/30"},{"_cls":"servantList","rid":"912340","rname":"ming4%E5%8F%B7","rlevel":"53","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/aec5e7977e798f69c6f07f707982fb398ba90731d7bbbb85d693dd371343d557\/30"},{"_cls":"servantList","rid":"914501","rname":"%E6%9C%AA%E6%9D%A5%E7%9A%84%E6%AF%8F%E4%B8%80%E6%AD%A5%E4%B8%80%E8%84%9A%E5%8D%B0","rlevel":"32","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/c3c8a59edd4f35dc3a0799e96b902091072ab562cb8fff820c4b1e4e3cc0c3ff\/30"},{"_cls":"servantList","rid":"934067","rname":"%E9%AD%87%E7%B4%AB%E7%9E%B3","rlevel":"40","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/6a1d3f1c5ae2a37d54953f0c176f62b03cc93c70f4f7f0fb7b638cfb7115d9d1\/30"},{"_cls":"servantList","rid":"939542","rname":"%2A%EF%B9%80%20%E9%82%A3%E4%B8%80%E6%8A%B9%EF%BC%8C%E7%9C%8B%E4%B8%8D%E5%88%B0%E7%9A%84%E5%BF%A7%E4%BC%A4","rlevel":"50","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/2eaee6da8ea3be0245df32540709fc843246792f29291b75a465df7550e35aa7\/30"},{"_cls":"servantList","rid":"940622","rname":"%E3%80%80","rlevel":"47","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/31943909f1b08cad6bc5e9fc385580e33636d8613f8254f4124dce0d3151ae68\/30"},{"_cls":"servantList","rid":"943580","rname":"%E5%A4%A7%E8%91%9B%E9%98%81","rlevel":"47","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/c3c8a59edd4f35dc172d7e5921ee701cb886207d529a656a2cd2ed59cfcedb9c\/30"},{"_cls":"servantList","rid":"944890","rname":"%E5%B0%8F%E9%B8%A1%E5%BF%AB%E8%B7%91","rlevel":"38","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/251e049d9f7fdfd2fa44d4277f28738b746170a00c70b62acce8b1682259d1dc\/30"},{"_cls":"servantList","rid":"954805","rname":"%EF%B9%8F%20%E5%B8%82%E4%B8%BC%20%EF%BC%BC","rlevel":"40","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/d8219673598dbd6f825bb5f84903a063534687093b29be85d509a04562ed7d1f\/30"},{"_cls":"servantList","rid":"954856","rname":".","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/170ce7d8d346ba3ca2e2b139c8fab91551583db39276c3b2d0e4f01c2eed51a7\/30"},{"_cls":"servantList","rid":"959965","rname":"skdj","rlevel":"51","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/1a7aac0b602db6b1b4e6f911ee1a955fb21c7b110042f30e0ac33547b040674d\/30"},{"_cls":"servantList","rid":"959981","rname":"asds","rlevel":"52","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/65c8bbf7f945570cc617ff1295b8ff2bff3c242ed5e70b69ce8baa839795fcf3\/30"},{"_cls":"servantList","rid":"972267","rname":"Rochas","rlevel":"59","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/2ed71fc3734a421fcbcd2a1c10a824df0dc72ed39908310459c8f50254c0245e\/30"},{"_cls":"servantList","rid":"973647","rname":"%E5%B1%B1%E8%8D%94%E6%9E%9D%E8%88%AC%E7%9A%84%E4%B9%B3","rlevel":"65","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/c0ec4a6dd9288585bc2b68a686800bd99c95620f0c81f9b41660f847a36e2870\/30"},{"_cls":"servantList","rid":"974944","rname":"%E5%88%BA%E8%80%B3%E4%B8%B6","rlevel":"40","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/c2a5760c145f85bd6fe0d2ec4b29f822d9cabd6392389922ee0ef6a8c1a09969\/30"},{"_cls":"servantList","rid":"976513","rname":"%E9%A3%8E%E8%A1%8C%E5%A4%A9%E8%BE%B9","rlevel":"40","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/664dc5021a4d2683daaf388f6f30b8e0e990adf3b58848a531997bf4ed33de76\/30"},{"_cls":"servantList","rid":"979089","rname":"%E4%B8%B6%20%CE%92%C4%AB%D0%98%C2%B0","rlevel":"41","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/e310302343d2c249d8c55efd20de0c32214913ed94914465ee4da11c4cf9facf\/30"},{"_cls":"servantList","rid":"979100","rname":"%E5%86%B7%E7%9C%B8%E3%80%83","rlevel":"50","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/fa5d80ebf9fc89aa1c107ad356952884961a99dd8f1aea68a5ebe4efaf824a2b\/30"},{"_cls":"servantList","rid":"989395","rname":"%E5%B0%8F%E9%99%88","rlevel":"62","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/d8219673598dbd6fb10d632622c3a909dec7317d4fbcb66806778f0e068c3556\/30"},{"_cls":"servantList","rid":"998230","rname":"%E6%98%93%E8%92%99%E8%92%99","rlevel":"55","serstatus":"2","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/d02133ecec528eb18c2766f5b45d80b10ad358886ef3c72ebbf6ba3dafc83eca\/30"},{"_cls":"servantList","rid":"1001111","rname":"%E9%92%95%E4%BA%BA%E9%92%9B%E5%84%8D","rlevel":"50","serstatus":"2","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/d8219673598dbd6f866dbf48a55ae2d9a75b2fda07f7795d6d892b9656d21c64\/30"},{"_cls":"servantList","rid":"1001877","rname":"%E7%B2%89%E5%88%87%E5%BC%80%E6%9D%A5%E9%83%BD%E6%98%AF%E9%BB%91","rlevel":"70","serstatus":"2","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/7b35c3f0a22c8eec9931f3bd8b4a845cce6fd91f72b264bcaef159b74e72d224\/30"},{"_cls":"servantList","rid":"1009003","rname":"%E3%80%81%E7%81%B0%E8%89%B2%E6%A0%BC%E8%B0%83","rlevel":"42","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/2eaee6da8ea3be0289249916259bc748efd96191dfa4270753542732a076e8e1\/30"},{"_cls":"servantList","rid":"1015339","rname":"%E9%98%BF%E5%91%86","rlevel":"70","serstatus":"2","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/aed75a034169d9d79f87c1176cf15a1ac0221562357a635fd4104e6d2eedda8b\/30"},{"_cls":"servantList","rid":"1015594","rname":"%E9%99%88%E5%BF%97%E4%BC%9F","rlevel":"46","serstatus":"0","headurl":"http:\/\/pyapp.qlogo.cn\/campus\/c265e4bd629300c5d05816240f65b85e862b52a8797517a0c474ee616a7e4d77beace3319ca5a37f\/30"},{"_cls":"servantList","rid":"1024976","rname":"%E4%B9%90%E7%BF%94%E6%97%85%E9%80%94","rlevel":"70","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/43a357988b13b4b87ef52a2917bbe28fc8ae1b8756353bbaca95773fdf1693f4\/30"},{"_cls":"servantList","rid":"1034789","rname":"%E2%9D%80%E3%80%9E%E5%8D%8A%E5%A4%B1%E3%80%81%E2%96%A0","rlevel":"56","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/a5f4ad537cfaea41143732792a309a1f24e3314d2e4026c3949c2722d39d12a4\/30"},{"_cls":"servantList","rid":"1042576","rname":"%20%20-%20%E6%9C%89%E7%8E%8D%E4%B9%8B%E5%B9%B4%20%E4%B8%B6","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/4296d9220a80af68f5231e6ed931fcebf118000a72d0c5d197ff6c456a8b2ecc\/30"},{"_cls":"servantList","rid":"1042975","rname":"%E4%BC%A0%E8%AF%B4%E4%B8%AD%E7%9A%84%E4%BA%8C%E7%90%83","rlevel":"50","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/a77546418354b602d06a68567660e7307eb58268f91626037b4f4d67f37881a1\/30"},{"_cls":"servantList","rid":"1050759","rname":"1425298667","rlevel":"51","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/02670c74ff98d35bfe48bf5e5d4018dfffb3b846c9e1df87e72aa8136c5d87d7\/30"},{"_cls":"servantList","rid":"1050775","rname":"2564316455","rlevel":"51","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/1e1e6e6274bbe95b5981a5aa8a7d8aad6fa76308c80f6e3cd9e29523af74b5e6\/30"},{"_cls":"servantList","rid":"1050789","rname":"2826307698","rlevel":"52","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/90b4cd661d76f2b3b8660ef261dba75ece3c6759dcc34a9f24d78bf63a6e69e6\/30"},{"_cls":"servantList","rid":"1050794","rname":"1824151090","rlevel":"52","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/363bd566c868db7ac91e38296add1a86ef758c779dd30a22515efd052259b23b\/30"},{"_cls":"servantList","rid":"1050804","rname":"123","rlevel":"51","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/6f25c1c5c855495535f2f8189a1dea2b83f3dd758e394e6814aa20ab3d1a0f0c\/30"},{"_cls":"servantList","rid":"1051435","rname":"%E5%B0%8F%E8%B4%9D","rlevel":"50","serstatus":"1","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/0bf1d03d3e108b5ea2d7eaeed00b1d3d5c7a07db7c89af8037599e90651e4a4a\/30"},{"_cls":"servantList","rid":"1052478","rname":"%EF%B9%8E%E9%AA%A4%E9%9B%A8%E8%90%BD%E7%BA%A2%E5%B0%98","rlevel":"50","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/2ed71fc3734a421f43ab10a0c1481178aba56ce0d2721fa70d4c6de0bcce2bee\/30"},{"_cls":"servantList","rid":"1060263","rname":"2830049931","rlevel":"51","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/d6deffae2113b8180a5d6de6805c3fe20c5c10e3cd7acabf339e7ce3762503cc\/30"},{"_cls":"servantList","rid":"1060281","rname":"da","rlevel":"52","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/e1dc46739944d5f4b08cb882084d6f876364713facea00c6eac3d7f17dc0a270\/30"},{"_cls":"servantList","rid":"1060284","rname":"1265687119","rlevel":"52","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/75006f23901557b461e78efecb8e7bb1f3b3738857734aa35c6528851a6783e1\/30"},{"_cls":"servantList","rid":"1060286","rname":"fasdas","rlevel":"51","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/0f93d128bb501f6b0c328051fb57d6b86b94e72f5ad423a1ab2baaf62015e81c\/30"},{"_cls":"servantList","rid":"1060289","rname":"2328676992","rlevel":"51","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/53a78d290aff2afd342f40b4b59fdf521b658a2c01bda86f66b5e0948fd5149b\/30"},{"_cls":"servantList","rid":"1094712","rname":"Jason%20Statham","rlevel":"47","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/4296d9220a80af6880bf6e68a9168c48d0152b0a264e20e4ed81d3a9769ba289\/30"},{"_cls":"servantList","rid":"1097816","rname":"%E8%98%91%E8%8F%87%E8%98%91%E8%8F%87%E5%AE%83%E4%B8%8D%E4%BC%9A%E5%BC%80%E8%8A%B1","rlevel":"37","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/dee7d2af4301cb5ed6eb5635f1f18bed64dbe4060c3638ab87075be649a9c7dd\/30"},{"_cls":"servantList","rid":"1101786","rname":"%20%E8%90%BD%E8%90%BD%E5%8F%B6%E5%AD%90","rlevel":"48","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/30eb7b4d48340a149f9d1bfb5611679b0c5282d0a088a8287866da6612ec9990\/30"},{"_cls":"servantList","rid":"1111492","rname":"%E4%B8%87%E8%8F%AF%E9%95%9C","rlevel":"70","serstatus":"1","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/ecdab82720caeb862c0afe7f01da598ff7361e0324011b19458a5dd65294f6ba\/30"},{"_cls":"servantList","rid":"1112031","rname":"%E8%B8%8F%E9%9B%AA%E5%BD%92%E6%9D%A5","rlevel":"49","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/f4a6c3864d2726c382c3c87f26ea289fa695060790222d8f5acb40c5a4fc9ada\/30"},{"_cls":"servantList","rid":"1126660","rname":"o%E6%89%BF%E7%A5%9E%E4%B9%8B%E4%BD%91%EF%B8%B6%EF%B8%B5%EF%B8%B6","rlevel":"64","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/63536c60195e77073babadf61db6d7d72df2ac13eb65eef4aa907dac11191dd8\/30"},{"_cls":"servantList","rid":"1128249","rname":"%E5%8D%8A%E5%A4%8F%C2%B0","rlevel":"61","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/c3c8a59edd4f35dc3ddafc28f7258bc0145ba1565ea95efffcc638e3d4322734\/30"},{"_cls":"servantList","rid":"1132548","rname":"%20%E3%80%80%20%20","rlevel":"64","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/786c4e691e255552b0c7ad79c642fe31f21b82c1bfbdced48884fd239ee3d43a\/30"},{"_cls":"servantList","rid":"1137084","rname":"360%C2%B0%E7%9A%84%E8%BD%AC%E8%BA%AB%E3%80%81%E6%8A%B9%E5%8E%BB%E6%B7%A1%E7%84%B6","rlevel":"69","serstatus":"2","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/e1bf14f30edae71bcec4a3cfa23fd2557d53f188cbb47bd24b23d5b7dbe73dea\/30"},{"_cls":"servantList","rid":"1146423","rname":"%E3%80%80%E3%80%80%E3%80%80","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/c5ae6cde08828a62fb12fdbe3ddb942a9019082700607026cdddb02151f32211\/30"},{"_cls":"servantList","rid":"1149234","rname":"Moon%20Star.","rlevel":"59","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/bb18df8f89cb0b19e75c8ab23be28fc7c44b2d75dc4cf0f1439c24b437f4d78c\/30"},{"_cls":"servantList","rid":"1151633","rname":"%E3%80%81%E3%80%8123","rlevel":"54","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/24a23b928380475d1238332920693696287e51264aaae9ce145112534c274aba\/30"},{"_cls":"servantList","rid":"1152698","rname":"%E7%BF%94%E5%A4%A9%E4%B9%8B%E7%BF%BC","rlevel":"35","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/d8219673598dbd6fa7e2ed51d511e0f6e34dbd233adb8479ff8c18447d90d8ab\/30"},{"_cls":"servantList","rid":"1153803","rname":"Sagittarius%20%E3%82%9B","rlevel":"43","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/aff242e95d20fb9093792b630f14ed07e10fee0b45b4153e4f18425a80802021\/30"},{"_cls":"servantList","rid":"1156541","rname":"%E2%95%83%E2%86%92Mark.","rlevel":"70","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/d8219673598dbd6fe333f065897a136348da0604401d5ff96fe02be23f6e792f\/30"},{"_cls":"servantList","rid":"1156555","rname":"jimmy","rlevel":"50","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/c0ec4a6dd9288585c9e8d4c943b2b29ea0b8b9d14e9352a37297a3d8db2ef707\/30"},{"_cls":"servantList","rid":"1157566","rname":"%E9%9C%B8%E6%B0%94%E5%B0%91%E5%B9%B4","rlevel":"40","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/5c0da7fea984e4752d703e148b3548987f6b0e73ff1a1cf9802cab740563cf64\/30"},{"_cls":"servantList","rid":"1158776","rname":"%E5%8E%8C%E4%B8%96Small%20Devil","rlevel":"53","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/987d8a8a241df456302444152d693e5e56d809cb4d1295aa83abbf164c407bc2\/30"},{"_cls":"servantList","rid":"1165931","rname":"%E9%87%8C%E8%8E%8E","rlevel":"51","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/27f0303c24a7cbb74b460547c40ffc8c0bcbf48c317fd6623543b2cc28302ecf\/30"},{"_cls":"servantList","rid":"1178777","rname":"%E9%9D%92%E6%A2%85%E5%84%BF","rlevel":"70","serstatus":"2","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/79a40b79ee1c826e1a4a03110b846c6e7589b488eef6ae6a9ac59afc3ea0c79a\/30"},{"_cls":"servantList","rid":"1190107","rname":"%E6%88%91%E5%B0%B1%E6%98%AF%E6%88%91","rlevel":"53","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/6ce38f6522756a25ebaa1198ba3a85dd76dd570a5bea7bea58085512f5593ae9\/30"},{"_cls":"servantList","rid":"1195828","rname":"%E6%AD%A3%E5%A3%B9","rlevel":"42","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/c5ae6cde08828a621b2ac836fa4de0ca933b225f657150dd837ef8cf2bb0496e\/30"},{"_cls":"servantList","rid":"1196874","rname":"%E9%86%89%E6%A2%A6%E4%BA%BA%E7%94%9F","rlevel":"70","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/53c8b2459dd978f9dc0078a38679eea563751e6a5521953671374d755c0268a7\/30"},{"_cls":"servantList","rid":"1198554","rname":"%E7%99%BD%E5%BC%80%E6%B0%B4","rlevel":"64","serstatus":"1","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/ea05ddb08708ec2854b49fe4c6b67dd56dc3e697a70b852633ed3ff339d4a9e3\/30"},{"_cls":"servantList","rid":"1209734","rname":"%E2%84%A1%E3%80%87nLy%E3%80%81%E9%A2%A8%E3%83%B3","rlevel":"63","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/30eb7b4d48340a1467112c03765843f860ace62021eab2eced40144b4da0e6c9\/30"},{"_cls":"servantList","rid":"1215234","rname":"%E4%B8%8B%E5%BC%A6%E6%9C%88%2Fbaiy","rlevel":"50","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/d8219673598dbd6f0cece8bb2c0de69aa4f3783a1b304cd90d2e842b926fdeea\/30"},{"_cls":"servantList","rid":"1218820","rname":"%E6%8B%96%E7%9D%80%E6%97%B6%E4%BB%A3%E7%9A%84%E5%90%8E%E8%85%BF%E4%B8%B6","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/c3c8a59edd4f35dccfc0711b78c13b2092b8888d02f27e9ec85f4becf189fd09\/30"},{"_cls":"servantList","rid":"1236978","rname":"%2Fkel%E5%88%9B%E4%B8%96%E7%A5%9E%E5%85%BD-%E9%A0%AD%E9%A0%AD%E6%98%AF%E9%81%93","rlevel":"45","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/d8219673598dbd6fd27ed1a54a86871699758efbec25b265c7afacd02ee54b72\/30"},{"_cls":"servantList","rid":"1244701","rname":"%E5%86%85%E6%B6%B5","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/d8219673598dbd6f5720e1d5a41101b493e3d9276b0b39857c47fdd7c2ef3f2b\/30"},{"_cls":"servantList","rid":"1248816","rname":"%E4%BE%A0%E7%89%A9%E8%AF%AD3%E5%8F%B7","rlevel":"69","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/1aafae7bc1cf22dd9d63e121c21d32f91e563fc88c6f6c65a54e23c724cb73a5\/30"},{"_cls":"servantList","rid":"1262321","rname":"%E6%B8%B8","rlevel":"40","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/b25c6cd5a95bd3b5fc87dffe4a9a824d64860a1aca4d6718b994cb24ac382b4a\/30"},{"_cls":"servantList","rid":"1307489","rname":"%E5%8F%9B%E9%80%86%E3%81%AE%E8%8A%B1","rlevel":"62","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/95fe82b316555733aaa9fd56e2ee55565ffb40a280cf23abc57a3e76167a4cf6\/30"},{"_cls":"servantList","rid":"1311057","rname":"%E7%88%B1%E2%89%A0%E6%84%9B","rlevel":"39","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/60ad0390c81643babc8d413390d34d7f97c6515d5cdf243bce2a5876bc1654b5\/30"},{"_cls":"servantList","rid":"1322764","rname":"%E6%A8%B1%E2%84%A2%E6%BC%A9%5E_%5E%E8%92%BE%E8%A9%88%C3%97_%C3%97","rlevel":"46","serstatus":"1","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/5026d6c576077a39cde22ef4ffc8ec0863651f6df39bafb9266d0884b1e646b5\/30"},{"_cls":"servantList","rid":"1333034","rname":"%E5%B0%8F%E5%B0%8F%E5%AD%90%EF%BC%81%EF%BC%81","rlevel":"57","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/817afe2e6f5f55c537414a6c587e645c0170d4cce96a21e722094aeb4decfd45\/30"},{"_cls":"servantList","rid":"1334036","rname":"Arnold%E3%82%9B","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/665315de1d9ca6c10c2940c38c440c2b722209f42c47a4c5fc4cb695a4040f7c\/30"},{"_cls":"servantList","rid":"1351757","rname":"%E7%B4%85%E9%A1%8F%E2%94%85%E7%AC%91%E8%AA%B0%E8%83%BD%E6%93%81%E6%B4%A7%E3%80%86","rlevel":"51","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/987d8a8a241df4566e47222021b97e7cc6f69f1fef6135015e73ce0e16b33eda\/30"},{"_cls":"servantList","rid":"1384214","rname":"%E5%9B%A7ne%C2%A0Piece%C2%A0","rlevel":"70","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/95dac2d0238d3f7be77c49439c062bd658667afd336942d8989309d73d39992a\/30"},{"_cls":"servantList","rid":"1389883","rname":"Emotional","rlevel":"70","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/6944a42a345aa1db547d9fb7b2e65da4bb5d8340aa35eccc9ea9a4e744b03e17\/30"},{"_cls":"servantList","rid":"1415670","rname":"%E5%9B%A7o%28%E2%95%AF%E2%96%A1%E2%95%B0%29o%E5%9B%A7","rlevel":"50","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/4dfae49d99e1ce13a65d9e95c9813e5db41142ed4b848702615f4d140543c790\/30"},{"_cls":"servantList","rid":"1417106","rname":"%E8%91%9B%E9%A3%9E","rlevel":"51","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/06d264c84a243d4645c574a164fda9b3d765fc3335c083e075bcb33f56d15ed9\/30"},{"_cls":"servantList","rid":"1426844","rname":"%E6%9A%97%E6%9C%88%E6%98%9F%E8%BE%B0","rlevel":"45","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/27f0303c24a7cbb7cdb0754e8f1124c03454bffc747ce9f90aa5a25102b52833\/30"},{"_cls":"servantList","rid":"1428129","rname":"%E7%9B%B8%E7%BA%A6%E8%8B%9E%E7%B1%B3%E5%9C%B0%EF%BC%82","rlevel":"53","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/72a0df78bf8c85f221c1d3deff6082f221cbf2e80a076f669abc220aa3c70e5b\/30"},{"_cls":"servantList","rid":"1441697","rname":"%E3%82%9B%E7%9E%AC%E9%97%B4%E3%80%81%E9%81%97%E5%A4%B1","rlevel":"60","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/987d8a8a241df4563a1cf5d9742d26c5ce5add3a3e678f959f75aec72da6f2f0\/30"},{"_cls":"servantList","rid":"1476143","rname":"%E4%B8%86%3F%EF%BC%A0%E4%B9%96%3F%EF%BC%A0","rlevel":"40","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/2ed71fc3734a421f43b04d9dec6c878568003ff05299ed9a3f2dfe0ea838c66b\/30"},{"_cls":"servantList","rid":"1476428","rname":"%E7%8C%A5%E5%90%9B%E5%AD%90","rlevel":"70","serstatus":"1","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/4296d9220a80af68589c902b5c97502efe9585558bfca2820e39dd2081a9f386\/30"},{"_cls":"servantList","rid":"1481822","rname":"On%20the%20Road","rlevel":"70","serstatus":"0","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/a9791e2372158533d0ea593eb3da8b82adc94612a0c4126d3e333a7cebf93606\/30"},{"_cls":"servantList","rid":"1510886","rname":"%E5%88%80%E9%94%8B","rlevel":"70","serstatus":"2","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/d8219673598dbd6fdc346bd4cfe54b18207022f9b15c358ecad8630de3f2f85a\/30"},{"_cls":"servantList","rid":"1514162","rname":"CONBAN","rlevel":"65","serstatus":"2","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/d8219673598dbd6f5c82e473b3ec89df30d63b46de2f88f757c0c885ae2a1085\/30"},{"_cls":"servantList","rid":"1543722","rname":"%E9%98%BF%E7%8B%B8.","rlevel":"45","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/f073124f4308d6f6070f5b3b6658a8a888f2c87d1c5fb08c25c279250b361888\/30"},{"_cls":"servantList","rid":"1547782","rname":"X6","rlevel":"70","serstatus":"1","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/26230775a2f28191d1a4e661f7090bd1dfbd8740aea6084ce548a4436d48b5f0\/30"},{"_cls":"servantList","rid":"1557922","rname":"%E6%91%A9%E8%A5%BFMoses","rlevel":"64","serstatus":"0","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/51e7eb7bff718a8d789c1374347809b01ff083861a2bb09ebbe7f0d036a79468\/30"},{"_cls":"servantList","rid":"1588672","rname":"%E8%A3%85%E7%86%8A%E7%9A%84%E7%AC%A8%E7%8C%AA%E6%A5%9E%E5%85%85%E8%B1%A1","rlevel":"50","serstatus":"0","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/30eb7b4d48340a14eb32e715a9511a0508299af24d11ff43a2e1a666803203c9\/30"},{"_cls":"servantList","rid":"1615733","rname":"%20%20%20%20%E6%AE%87","rlevel":"46","serstatus":"0","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/786c4e691e255552f1771bbc19e41839f7409b67f1ed78d010ca24653fea4c2c\/30"}],"_cls":"getlist"}}

	/**
	 * help list
	 * @param user
	 * @return
	 */
	public static String workerHelplist(User user) {
		return user.send(
			"&act=helplists&ctl=servant",
			"{}"
		);
	}


	//public static const WORKER_CATCH:Object = {ctl:"servant", act:"startcapture"};
	//CatchFightProxy.as: line 113: 	App.net.send(new HttpGetParams(PHPConsts.WORKER_CATCH).getHttpString(), {caprid:this._vo.id}, this.catchCheckResult, this.catchFailure);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_ser_err_capriderr"}

	/**
	 * start capture servant
	 * @param user
	 * @param sid
	 * @return
	 */
	public static String workerCatch(User user,int sid) {
		return user.send(
			"&act=startcapture&ctl=servant",
			"{\"caprid\":%d}", sid
		);
	}


	//public static const WORKER_ASSIGN:Object = {ctl:"servant", act:"capturesuc"};
	//FightResultProxy.as: line 71: 	App.net.send(new HttpGetParams(PHPConsts.WORKER_ASSIGN).getHttpString(), {caprid:this._flightData.vo.id, frid:this._flightData.tofightrid}, this.onAssignResult, this.onAssignFailure);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_ser_err_capriderr"}

	/**
	 * finish fight
	 * @param user
	 * @param capId
	 * @return
	 */
	public static String workerAssign(User user, int capId) {
		return user.send(
			"&act=capturesuc&ctl=servant",
			"{\"frid\":%d,\"caprid\":%d}", capId, capId
		);
	}


	//public static const WORKER_ADDNUM:Object = {ctl:"servant", act:"addsernum"};
	//AddTimesProxy.as: line 43: 	App.net.send(new HttpGetParams(PHPConsts.WORKER_ADDNUM).getHttpString(), {type:WorkerConts.TIMES0_CATCH}, this.addTimesResult);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_ser_suc_addnumok","change":{"_cls":"changeObj","role":{"805493":{"gamepoint":"79","getsertimes":"11","serbuytimes":"1"}},"rwarrior":null,"rwarriorskill":null,"rwarriorskillbuff":null,"rbagitem":null,"rbuild":null,"rquest":null,"rmap":null,"rwarriorinpub":null,"rwarriorgroup":null,"roperator":null}}

	/**
	 * add more catch time
	 * @param user
	 * @return
	 */
	public static String workerAddnum(User user) {
		return user.send(
			"&act=addsernum&ctl=servant",
			"{\"type\":0}"
		);
	}


	//public static const WORKER_GAIN:Object = {ctl:"servant", act:"servantgain"};
	//WorkDealProxy.as: line 61: 	App.net.send(new HttpGetParams(PHPConsts.WORKER_GAIN).getHttpString(), {type:this._type, serid:this._vo.rid}, this.onAcceResult, this.onFailure).dropPoint = this._operatePoint;
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_ser_err_noserid"}

	/**
	 * fast gain money from worker 榨压
	 * @param user
	 * @param sid
	 * @param type
	 * 0 regular,  1 gamepoint.
	 * @return
	 */
	public static String workerGain(User user,int sid, int type) {
		return user.send(
			"&act=servantgain&ctl=servant",
			"{\"type\":%d, \"serid\":%d}", type, sid
		);
	}


	//public static const WORKER_LIBERATE:Object = {ctl:"servant", act:"servantrelease"};
	//LiberateProxy.as: line 44: 	App.net.send(new HttpGetParams(PHPConsts.WORKER_LIBERATE).getHttpString(), {otherid:this._vo.rid}, this.success, this.failure).dropPoint = this._point;
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_ser_err_releaseiderr"}

	/**
	 * release worker
	 * @param user
	 * @param sid
	 * @return
	 */
	public static String workerLiberate(User user, int sid) {
		return user.send(
			"&act=servantrelease&ctl=servant",
			"{\"otherid\":%d}", sid
		);
	}


	//public static const WORKER_GETMASTER:Object = {ctl:"servant", act:"getmasterinfo"};
	//CatchFightProxy.as: line 89: 	App.net.send(new HttpGetParams(PHPConsts.WORKER_GETMASTER).getHttpString(), {otherid:this._vo.id}, this.getMasterSuccess, this.catchFailure);
	//FightProxy.as: line 54: 	App.net.send(new HttpGetParams(PHPConsts.WORKER_GETMASTER).getHttpString(), {otherid:this._flightId}, this.getMasterSuccess, this.onFailure, "default", "default", "default", RequestType.DIALOG_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_ser_err_seriderr"}

	/**
	 * get master info
	 * @param user
	 * @param sid
	 * @return
	 */
	public static String workerGetmaster(User user,int sid) {
		return user.send(
			"&act=getmasterinfo&ctl=servant",
			"{\"otherid\":%d}", sid
		);
	}


	//public static const WORKER_FLIGHT:Object = {ctl:"servant", act:"servantfight"};
	//AskHelpProxy.as: line 16: 	App.net.send(new HttpGetParams(PHPConsts.WORKER_FLIGHT).getHttpString(), {type:2, otherid:this.getIds(param1)}, this.askSuccess, this.askFailure);
	//FightProxy.as: line 110: 	App.net.send(new HttpGetParams(PHPConsts.WORKER_FLIGHT).getHttpString(), {type:this._type, otherid:this._flightId}, this.onFlightResult, this.onFailure, "default", "default", "default", RequestType.DIALOG_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_ser_err_serstatuschange","data":{"serstatuschange":4,"nowstatus":"0","_cls":"changestatus"}}

	/**
	 * worker fight, 
	 * @param user
	 * @param sid
	 * @param type
	 *  0 反抗 , 1 解救, 2 求救
	 * @return
	 */
	public static String workerFlight(User user,int sid, int type) {
		return user.send(
			"&act=servantfight&ctl=servant",
			"{\"type\":%d,\"otherid\":%d}",type, sid
		);
	}


	//public static const WORKER_FLIGHT_APPLY:Object = {ctl:"servant", act:"servantfightsuc"};
	//FightResultProxy.as: line 112: 	App.net.send(new HttpGetParams(PHPConsts.WORKER_FLIGHT_APPLY).getHttpString(), {type:this._flightData.type, frid:this._flightData.tofightrid, otherid:this._flightData.otherid}, this.onSueecss);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_ser_err_serstatuschange","data":{"serstatuschange":4,"nowstatus":"0","_cls":"changestatus"}}
	/**
	 * worker fight finish, 
	 * @param user
	 * @param sid
	 * @param type
	 *   0 反抗 , 1 解救, 2 求救
	 * @return
	 */
	public static String workerFlightApply(User user,int sid, int type) {
		return user.send(
			"&act=servantfightsuc&ctl=servant",
			"{\"type\":%d,\"otherid\":%d}",type, sid
		);
	}


	//public static const WORKER_RANSOM:Object = {ctl:"servant", act:"servantredeem"};
	//RansomProxy.as: line 28: 	App.net.send(new HttpGetParams(PHPConsts.WORKER_RANSOM).getHttpString(), {}, this.ransomSuccess, this.ransomFailure).dropPoint = this._operatePoint;
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_ser_err_serstatuschange","data":{"serstatuschange":4,"nowstatus":"0","_cls":"changestatus"}}

	/**
	 * 奴隶交赎金
	 * @param user
	 * @return
	 */
	public static String workerRansom(User user) {
		return user.send(
			"&act=servantredeem&ctl=servant",
			"{}"
		);
	}


	//public static const WORKER_FAWN:Object = {ctl:"servant", act:"fawnmaster"};
	//FawnProxy.as: line 39: 	App.net.send(new HttpGetParams(PHPConsts.WORKER_FAWN).getHttpString(), {}, this.fawnSuccess, this.fawnFailure).dropPoint = this._operatePoint;
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_ser_err_serstatuschange","data":{"serstatuschange":4,"nowstatus":"0","_cls":"changestatus"}}

	/**
	 * 奴隶讨好
	 * @param user
	 * @return
	 */
	public static String workerFawn(User user) {
		return user.send(
			"&act=fawnmaster&ctl=servant",
			"{}"
		);
	}


	//public static const FARM_GET_DATA:Object = {ctl:"farm", act:"getfarm"};
	//GetFarmDataService.as: line 22: 	App.net.send(new HttpGetParams(PHPConsts.FARM_GET_DATA).getHttpString(), _loc_3, this.getSuccess, this.getFailure);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getfarminfook","data":{"farmnum":5,"rfarmFieldList":[],"rfarmPlantList":[],"_cls":"getFarmInfo"}}

	/**
	 * get friend farm data.
	 * @param user
	 * @param fid
	 * @return
	 */
	public static String farmGetData(User user,int fid) {
		return user.send(
			"&act=getfarm&ctl=farm",
			"{\"frid\":%d}", fid
		);
	}
	
	/**
	 * get farm data.
	 * @param user
	 * @return
	 */
	public static String farmGetData(User user) {
		return user.send(
			"&act=getfarm&ctl=farm",
			"{}"
		);
	}

	//public static const FARM_DO_PLANT:Object = {ctl:"farm", act:"doplant"};
	//PlantService.as: line 28: 	App.net.send(new HttpGetParams(PHPConsts.FARM_DO_PLANT).getHttpString(), {field:param3, rseedid:param2.id}, this.plantSuccess, this.plantFailure, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.doubleCheck);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_gam_err_farmfieldnotvalid"}

	/**
	 * 种植
	 * @param user
	 * @param seedId
	 * @param field
	 * @return
	 */
	public static String farmDoPlant(User user,int seedId, int field) {
		return user.send(
			"&act=doplant&ctl=farm",
			"{\"rseedid\":%d,\"field\":%d}", seedId, field
		);
	}


	//public static const FARM_PICK_PLANT:Object = {ctl:"farm", act:"pickplant"};
	//HarvestService.as: line 24: 	App.net.send(new HttpGetParams(PHPConsts.FARM_PICK_PLANT).getHttpString(), {field:param2}, this.harvestSuccess, this.harvestFailure, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.check, [this._farmData, this._fieldId]).dropPoint = this._operatePoint;
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_gam_err_farmfieldnotvalid"}

	/**
	 * 收获种子
	 * @param user
	 * @param field
	 * @return
	 */
	public static String farmPickPlant(User user,int field) {
		return user.send(
			"&act=pickplant&ctl=farm",
			"{\"field\":%d}", field
		);
	}


	//public static const FARM_WATER_PLANT:Object = {ctl:"farm", act:"waterplant"};
	//WaterService.as: line 33: 	App.net.send(new HttpGetParams(PHPConsts.FARM_WATER_PLANT).getHttpString(), {field:param2, frid:param3.id}, this.waterSuccess, this.waterFailure, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.doubleCheck, [this._farmData, param2]).dropPoint = this._operatePoint;
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_gam_err_farmfieldnotvalid"}

	/**
	 * 给朋友浇水
	 * @param user
	 * @param fid
	 * @param field
	 * @return
	 */
	public static String farmWaterPlant(User user,int fid, int field) {
		return user.send(
			"&act=waterplant&ctl=farm",
			"{\"field\":%d,\"frid\":%d}", field, fid
		);
	}


	//public static const FARM_CUT_PLANT:Object = {ctl:"farm", act:"cutplant"};
	//CutService.as: line 34: 	App.net.send(new HttpGetParams(PHPConsts.FARM_CUT_PLANT).getHttpString(), {field:this._fieldId}, this.cutSuccess, this.cutFailure);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_gam_err_farmfieldnotvalid"}

	/**
	 * 清除作物
	 * @param user
	 * @param field
	 * @return
	 */
	public static String farmCutPlant(User user,int field) {
		return user.send(
			"&act=cutplant&ctl=farm",
			"{\"field\":%d}", field
		);
	}


	//public static const FARM_UNLOCK_FIELD:Object = {ctl:"farm", act:"unlockfield"};
	//UnlockService.as: line 37: 	App.net.send(new HttpGetParams(PHPConsts.FARM_UNLOCK_FIELD).getHttpString(), {}, this.unlockSuccess, this.unlockFailure, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.doubleCheck, [this._farmData]);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_unlockfieldok","change":{"_cls":"changeObj","role":{"805493":{"money":"7715476","farmnum":6}},"rwarrior":null,"rwarriorskill":null,"rwarriorskillbuff":null,"rbagitem":null,"rbuild":null,"rquest":null,"rmap":null,"rwarriorinpub":null,"rwarriorgroup":null,"roperator":null}}

	/**
	 * 增加农田
	 * @param user
	 * @return
	 */
	public static String farmUnlockField(User user) {
		return user.send(
			"&act=unlockfield&ctl=farm",
			"{}"
		);
	}


	//public static const FARM_UP_FIELD:Object = {ctl:"farm", act:"upfield"};
	//UpFieldService.as: line 45: 	App.net.send(new HttpGetParams(PHPConsts.FARM_UP_FIELD).getHttpString(), {field:this._fieldId}, this.upSuccess, this.upFailure, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.doubleCheck);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_gam_err_farmfieldnotvalid"}

	/**
	 * 农田升级
	 * @param user
	 * @param field
	 * @return
	 */
	public static String farmUpField(User user, int field) {
		return user.send(
			"&act=upfield&ctl=farm",
			"{\"field\":%d}", field
		);
	}


	//public static const FARM_BAT_WATER:Object = {ctl:"farm", act:"batchwater"};
	//BatWaterService.as: line 29: 	App.net.send(new HttpGetParams(PHPConsts.FARM_BAT_WATER).getHttpString(), {frid:param3.id}, this.waterSuccess, this.waterFailure, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.doubleCheck).dropPoint = param4;
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_gam_err_friendnotexist"}

	/**
	 * 一键浇水
	 * @param user
	 * @param fid
	 * @return
	 */
	public static String farmBatWater(User user, int fid) {
		return user.send(
			"&act=batchwater&ctl=farm",
			"{\"frid\":%d}", fid
		);
	}


	//public static const FARM_UNLOCK_SKIN:Object = {ctl:"farm", act:"unlockskin"};
	//ManorManager.as: line 316: 	App.net.send(new HttpGetParams(PHPConsts.FARM_UNLOCK_SKIN).getHttpString(), {skinid:param1.skinid}, this.unlockResult);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_farmskin_err_farmskincfgnotexist"}

	/**
	 * 解锁农田背景
	 * @param user
	 * @param skinid
	 * @return
	 */
	public static String farmUnlockSkin(User user,int skinid) {
		return user.send(
			"&act=unlockskin&ctl=farm",
			"{\"skinid\":%d}", skinid
		);
	}


	//public static const FARM_FITMENT:Object = {ctl:"farm", act:"setskin"};
	//ManorManager.as: line 333: 	App.net.send(new HttpGetParams(PHPConsts.FARM_FITMENT).getHttpString(), {skinid:_loc_2.skinid}, this.fitmentResult);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_farmskin_err_farmskincfgnotexist"}

	/**
	 * 设置农田背景
	 * @param user
	 * @param skinid
	 * @return
	 */
	public static String farmFitment(User user,int skinid) {
		return user.send(
			"&act=setskin&ctl=farm",
			"{\"skinid\":%d}", skinid
		);
	}


	//public static const GET_SECRETARY_REWARD:Object = {ctl:"secretary", act:"openbox"};
	//SecretaryProxy.as: line 63: 	App.net.send(new HttpGetParams(PHPConsts.GET_SECRETARY_REWARD).getHttpString(), null, this.onGetReward, null, "default", "default", "default", RequestType.NORMAL).dropPoint = new Point(760, 480);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_secretary_suc_openboxok","change":{"_cls":"changeObj","role":{"805493":{"money":"7720476","techpoint":"2251658","qopentimes":"1"}},"rwarrior":null,"rwarriorskill":null,"rwarriorskillbuff":null,"rbagitem":null,"rbuild":null,"rquest":null,"rmap":null,"rwarriorinpub":null,"rwarriorgroup":null,"roperator":null},"data":{"qopentimes":1,"_cls":"qlivenessOpenBox"}}

	/**
	 * 领取小秘箱子
	 * @param user
	 * @return
	 */
	public static String getSecretaryReward(User user) {
		return user.send(
			"&act=openbox&ctl=secretary",
			null
		);
	}


	//public static const TRANSPORT_OPEN:Object = {ctl:"transport", act:"opentransport"};
	//GetTransportDataProxy.as: line 16: 	App.net.send(new HttpGetParams(PHPConsts.TRANSPORT_OPEN).getHttpString(), {}, this.openTransportHandler, this.openFailure);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_trans_suc_opentransok","change":{"_cls":"changeObj","role":null,"rwarrior":null,"rwarriorskill":null,"rwarriorskillbuff":null,"rbagitem":null,"rbuild":null,"rquest":null,"rmap":null,"rwarriorinpub":null,"rwarriorgroup":null,"roperator":null},"data":{"rTransLevel":"1","transgainmoney":79650,"_cls":"mytransinfo"}}

	/**
	 * init train
	 * @param user
	 * @return
	 */
	public static String transportOpen(User user) {
		return user.send(
			"&act=opentransport&ctl=transport",
			"{}"
		);
	}


	//public static const TRANSPORT_STARTTRANSPORT:Object = {ctl:"transport", act:"starttransport"};
	//GoTransportProxy.as: line 19: 	App.net.send(new HttpGetParams(PHPConsts.TRANSPORT_STARTTRANSPORT).getHttpString(), {}, this.transportStartHandler, this.transportFailure, "default", "default", "default", RequestType.DIALOG_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_trans_suc_starttransok","change":{"_cls":"changeObj","role":{"805493":{"transcdtime":"1405787455"}},"rwarrior":null,"rwarriorskill":null,"rwarriorskillbuff":null,"rbagitem":null,"rbuild":null,"rquest":null,"rmap":null,"rwarriorinpub":null,"rwarriorgroup":null,"roperator":null},"data":{"transinfo":{"_cls":"transinfo","transtime":1405787435,"tofightmap":10001,"fighttype":3,"transcarlevel":"1","transsection":0,"transgain":79650,"transallrobids":"1007878,0,0,1004844,1006997,0"},"robinfo":[{"_cls":"rolebaseInfo","id":"1007878","level":"62","uid":"83EF5BBD8646235FC5A8239506CCAB59","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/36b63235a3d985e5cdebe0acf19d1b5c444f980a15e8d5f6dc23891c20dd9c4e\/50","tinyurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/36b63235a3d985e5cdebe0acf19d1b5c444f980a15e8d5f6dc23891c20dd9c4e\/30","uname":"%3A%CB%89%20%20%20%E3%80%81%E5%B0%8F%E6%A5%BC%E6%98%A8%E5%A4%9C%E5%8F%88%E6%98%A5%E9%9B%A8%E2%80%B3","gender":"\u7537","rwcfgid":"rwcfgid","power":420457,"isfriend":"isfriend","serstat":"serstat","yellowvip":1,"yellowyearvip":1,"yellowviplevel":5,"nowluckystar":"0","canbless":"0","canfire":"1","isonline":"0"},{"_cls":"rolebaseInfo","id":"1004844","level":"59","uid":"303770EA8D407A0E700E81B558B8D62F","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/0e60a52ae2700defd602ecd3baf73657a69f9e3cb5a095bc6e507d6aa6f77bfb\/50","tinyurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/0e60a52ae2700defd602ecd3baf73657a69f9e3cb5a095bc6e507d6aa6f77bfb\/30","uname":"%E9%94%8B%E9%94%8B","gender":"\u7537","rwcfgid":"rwcfgid","power":142961,"isfriend":"isfriend","serstat":"serstat","yellowvip":0,"yellowyearvip":0,"yellowviplevel":0,"nowluckystar":"0","canbless":"0","canfire":"1","isonline":"0"},{"_cls":"rolebaseInfo","id":"1006997","level":"62","uid":"DF3AB09F522276AAF9E4163FAA578FF4","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/3b9a4bbcdd70c70357f63e8bdeb5ff2728747ee7074d2e54ea9858f98eab1b57\/50","tinyurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/3b9a4bbcdd70c70357f63e8bdeb5ff2728747ee7074d2e54ea9858f98eab1b57\/30","uname":"Brian","gender":"\u7537","rwcfgid":"rwcfgid","power":785221,"isfriend":"isfriend","serstat":"serstat","yellowvip":1,"yellowyearvip":0,"yellowviplevel":5,"nowluckystar":"0","canbless":"0","canfire":"1","isonline":"0"}],"_cls":"starttrans"}}

	/**
	 * start transport
	 * @param user
	 * @return
	 */
	public static String transportStarttransport(User user) {
		return user.send(
			"&act=starttransport&ctl=transport",
			"{}"
		);
	}


	//public static const TRANSPORT_TODOTRANSPORT:Object = {ctl:"transport", act:"todotransport"};
	//<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"><html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8" /><title> - </title><style>body {	font-size:76%;	font-family:"Lucida Grande", Verdana, Lucida, Arial, Helvetica, sans-serif;	background-color:#FEFEFE;	color:#333333;	margin:0;}a{color:#f60;}a:hover{text-decoration:none;}.dialogtitle {	margin-bottom:10px;	font-weight:bold;}.dialogContent {	padding:10px;}</style><link rel="stylesheet" href="style/dialog.css" /></head><body><div style="margin:100px auto;width:500px;"><table border="0" cellspacing="0" cellpadding="0" id="windowTable">	<tr>		<td colspan="2" class="td9TL"></td>		<td class="td9TC"></td>		<td colspan="2" class="td9TR"></td>	</tr>	<tr>		<td class="td9ML2"></td>		<td class="td9ML"></td>		<td class="td9MC" id="windowContent"><div>	<div class="dialogtitle"><div></div></div>    <div class="dialogContent">    	<div style="width:450px;">       	方法【todotransport】未定义，请联系网站管理员。<br />		<div align="center" style="margin-top:10px;">    <a href="javascript:history.back();"></a>		</div>    	</div>    </div></div>               </td>		<td class="td9MR"></td>		<td class="td9MR2"></td>	</tr>	<tr>		<td colspan="2" class="td9BL"></td>		<td class="td9BC"></td>		<td colspan="2" class="td9BR"></td>	</tr></table></div></body></html>
	/**
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String transportTodotransport(User user) {
		return user.send(
			"&act=todotransport&ctl=transport",
			null
		);
	}


	//public static const TRANSPORT_TOENDTRANSPORT:Object = {ctl:"transport", act:"toendtransport"};
	//<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"><html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8" /><title> - </title><style>body {	font-size:76%;	font-family:"Lucida Grande", Verdana, Lucida, Arial, Helvetica, sans-serif;	background-color:#FEFEFE;	color:#333333;	margin:0;}a{color:#f60;}a:hover{text-decoration:none;}.dialogtitle {	margin-bottom:10px;	font-weight:bold;}.dialogContent {	padding:10px;}</style><link rel="stylesheet" href="style/dialog.css" /></head><body><div style="margin:100px auto;width:500px;"><table border="0" cellspacing="0" cellpadding="0" id="windowTable">	<tr>		<td colspan="2" class="td9TL"></td>		<td class="td9TC"></td>		<td colspan="2" class="td9TR"></td>	</tr>	<tr>		<td class="td9ML2"></td>		<td class="td9ML"></td>		<td class="td9MC" id="windowContent"><div>	<div class="dialogtitle"><div></div></div>    <div class="dialogContent">    	<div style="width:450px;">       	方法【toendtransport】未定义，请联系网站管理员。<br />		<div align="center" style="margin-top:10px;">    <a href="javascript:history.back();"></a>		</div>    	</div>    </div></div>               </td>		<td class="td9MR"></td>		<td class="td9MR2"></td>	</tr>	<tr>		<td colspan="2" class="td9BL"></td>		<td class="td9BC"></td>		<td colspan="2" class="td9BR"></td>	</tr></table></div></body></html>

	/**
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String transportToendtransport(User user) {
		return user.send(
			"&act=toendtransport&ctl=transport",
			null
		);
	}


	//public static const TRANSPORT_FINISHTRANSPORT:Object = {ctl:"transport", act:"finishtransport"};
	//TransportBattleProxy.as: line 163: 	App.net.send(new HttpGetParams(PHPConsts.TRANSPORT_FINISHTRANSPORT).getHttpString(), {}, this.finishTransportHandler);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_trans_err_transinfoerr"}

	/**
	 * end transport
	 * @param user
	 * @return
	 */
	public static String transportFinishtransport(User user) {
		return user.send(
			"&act=finishtransport&ctl=transport",
			"{}"
		);
	}


	//public static const TRANSPORT_CLEARCD:Object = {ctl:"transport", act:"transrobclearcd"};
	//ClearCDProxy.as: line 28: 	App.net.send(new HttpGetParams(PHPConsts.TRANSPORT_CLEARCD).getHttpString(), {type:this._type}, this.clearSuccess, this.clearFailure);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_clearnotype"}

	/**
	 * speed rob cool down, useless. 
	 * @param user
	 * @return
	 */
	public static String transportClearcd(User user) {
		return user.send(
			"&act=transrobclearcd&ctl=transport",
			"{\"type\":1}"
		);
	}


	//public static const TRANSPORT_OPENROB:Object = {ctl:"transport", act:"openrob"};
	//GetGrobDataProxy.as: line 23: 	App.net.send(new HttpGetParams(PHPConsts.TRANSPORT_OPENROB).getHttpString(), {}, this.openRobHandler, this.openFailure);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_trans_suc_openrobok","data":{"nowcarnum":8,"_cls":"openrob"}}

	/**
	 * open rob
	 * @param user
	 * @return
	 */
	public static String transportOpenrob(User user) {
		return user.send(
			"&act=openrob&ctl=transport",
			"{}"
		);
	}


	//public static const TRANSPORT_GRABLIST:Object = {ctl:"transport", act:"getroblist"};
	//GetGrobListProxy.as: line 19: 	App.net.send(new HttpGetParams(PHPConsts.TRANSPORT_GRABLIST).getHttpString(), {num:int(param2 * TransportConsts.SCREEN)}, this.getSuccess, this.getFailure).jumpOutOfQueue();
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getroblistok","data":{"roblist":[{"_cls":"roblist","id":"1000890","nickname":"%E5%A4%A9","tinyurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/9b22afd5caa2368cca534264bafb3af0efa61e0f0fca6161ccc358ae65bb6078\/30","level":"63","carlevel":1,"award":69300,"power":272509},{"_cls":"roblist","id":"1002695","nickname":"Maya","tinyurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/88476d757e59c5774428d52c4cfee335712c5cdb631ae56c1b99fe65749296a0\/30","level":"63","carlevel":1,"award":69300,"power":278705},{"_cls":"roblist","id":"1003341","nickname":"%E5%8D%9C%E5%8D%9C","tinyurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/d02133ecec528eb134989f3be4d809104474f54cba6480af42c7448d804d5249\/30","level":"63","carlevel":"1","award":69300,"power":649260},{"_cls":"roblist","id":"1003504","nickname":"%E7%81%AC%E8%9D%B4%E8%9D%B6","tinyurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/13675a92aec0dfe2ea9f154d59b6750e09e4b521ae7d316c5d9cd434fb43fd42\/30","level":"63","carlevel":"2","award":86625,"power":675749},{"_cls":"roblist","id":"1003886","nickname":"%E7%8E%8B%E5%AD%90%E6%AE%BF%E4%B8%8B","tinyurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/5c20f48aadf95580d3e6d07e5c27d6b2b0a3f88339f74b8d062a41cb3d2fff74\/30","level":"63","carlevel":1,"award":69300,"power":272088},{"_cls":"roblist","id":"1004693","nickname":"%E6%9C%88%E5%A4%9C%E3%81%AE%E7%B9%81%E6%98%9F","tinyurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/0f93d128bb501f6b4dff7d0b4e68f9fd0db57b8f55f40bee37168017abd929fa\/30","level":"63","carlevel":1,"award":69300,"power":203834},{"_cls":"roblist","id":"1004761","nickname":"JD%E8%91%A3%E5%B0%91","tinyurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/47c5081aeef5bc9de9f2b20a3218ce95ef43e57ab51f4788b9306a23912e6705\/30","level":"63","carlevel":1,"award":69300,"power":187711},{"_cls":"roblist","id":"1009397","nickname":"%E5%B9%B8%E7%A6%8F%E6%9C%89%E5%A4%9A%E8%BF%9C","tinyurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/47326b19230cd3931ba15ada248a5c08a4c73254e15c08726e589cd9bf828fff\/30","level":"63","carlevel":"1","award":69300,"power":578424},{"_cls":"roblist","id":"1000813","nickname":"%E2%97%95%E2%80%BF%E2%97%95%E8%82%A5%E5%98%9F%E5%98%9F%E5%B7%A6%E8%A1%9B%E9%96%80%EF%BC%82","tinyurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/d8219673598dbd6f669f4ce3e6d20246fc7e1917e1120f2c9d6b2b5b31071a39\/30","level":"62","carlevel":1,"award":50400,"power":494530},{"_cls":"roblist","id":"1001590","nickname":"%E4%BA%BA%E7%94%9F%E5%A6%82%E8%8C%B6","tinyurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/ef0f77762b396aaf02fdbf385cb4ccde659f016c655f332342ce9d36740a1901\/30","level":"62","carlevel":1,"award":50400,"power":242264},{"_cls":"roblist","id":"1004019","nickname":"%E7%9F%B3%E5%A4%B4%E5%89%AA%E5%88%80%E5%B8%83","tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/06d264c84a243d46a3959e04a92c2c29faf25d476e8611e89bfb858f8c5f05f9\/30","level":"62","carlevel":"2","award":63000,"power":637168},{"_cls":"roblist","id":"1004085","nickname":"%E8%B0%B6%E8%8A%B1","tinyurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/d2dda8780a21a4bfabad6be3991cca291505d03a0153acf68380326f6586205a\/30","level":"62","carlevel":1,"award":50400,"power":246094},{"_cls":"roblist","id":"1005229","nickname":"%E7%B4%AB%E9%BE%99","tinyurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/53c8b2459dd978f9fd3fb813462c84162a9124ed68af2168ba936ace4675fe52\/30","level":"62","carlevel":1,"award":50400,"power":267009},{"_cls":"roblist","id":"1005866","nickname":"%E2%9D%80%20%E5%BF%98%E5%B7%9D%E3%80%82","tinyurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/ef0f77762b396aaf55941b1b9c48ceaf4990e7fa3cad1d27c177b4b24bbd4212\/30","level":"62","carlevel":1,"award":50400,"power":354570},{"_cls":"roblist","id":"1006526","nickname":"%E7%8E%8B%E7%A7%8B%E5%85%83","tinyurl":"http:\/\/pyapp.qlogo.cn\/campus\/98980cd3c4e8fa6154e6595d3b54f842b629731cc96ece2af5adaaf8a07363d5a8ff31240b0107b2\/30","level":"62","carlevel":1,"award":50400,"power":244952},{"_cls":"roblist","id":"1006826","nickname":"%20%20%20%E9%9F%B3%E3%80%82","tinyurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/06d264c84a243d46ac013b18a251f18f0b933a6c33a3ae4a084bd0210c1f1b73\/30","level":"62","carlevel":"1","award":50400,"power":718824},{"_cls":"roblist","id":"1009776","nickname":"%E7%8C%AB%E5%92%AA%E8%89%BE%E7%B1%B3","tinyurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/df0e0f500325cfb9a3962155b1f7e6e2d273859537ceb3f8fb65ad3e7a01858d\/30","level":"62","carlevel":"1","award":50400,"power":345016},{"_cls":"roblist","id":"1009831","nickname":"%E5%94%90%E9%92%B0.%E5%B0%8F%E5%AE%9D","tinyurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/6c56fabc3bc7003c62d294bdab6608be6534e66d3ac5924df48af5a5bf96515f\/30","level":"62","carlevel":1,"award":50400,"power":233443},{"_cls":"roblist","id":"1000246","nickname":"%EF%BC%8A%EF%B9%80%E2%95%AE%27%E5%93%A5%E3%80%82%E2%91%A0%E7%9B%B4%E8%8F%B0%E5%96%AE%2F%E2%98%85%27","tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/7274964bcf3cf6d5ba06ab618cdff3f4e5506c1ba846eacbc0202b94914803ff\/30","level":"59","carlevel":1,"award":47600,"power":184874},{"_cls":"roblist","id":"1001662","nickname":"%E2%98%A0%20Tiramis%C3%B9","tinyurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/bb2526e8387739e98d0a44a6f30b03cb01e57cad607a9da7095ebc9966d2061e\/30","level":"59","carlevel":1,"award":47600,"power":432552},{"_cls":"roblist","id":"1001977","nickname":"%E3%80%80%E3%80%80%E3%80%80%E3%80%80%E3%80%80%E3%80%80%E3%80%80%E3%80%80%E3%80%80","tinyurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/79f4ae944aeb875e417602cf0414f4386fcae93e982f80e4caf8aee9151efe48\/30","level":"59","carlevel":1,"award":47600,"power":224066},{"_cls":"roblist","id":"1005606","nickname":"%E6%B2%B9%E6%9D%A1","tinyurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/27a87a80731bf0f896f81acf39a2a05fe3f0e38c200e6b860cf6e5d624b313c3\/30","level":"59","carlevel":1,"award":47600,"power":201539},{"_cls":"roblist","id":"1006510","nickname":"%E2%95%B0%E3%81%A4%E3%82%9B%E7%A9%BA%E7%99%BD%E3%80%81%E6%A0%BC%20%20","tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/253cc2e8021ac81417c012d8f867668186dc3b32fbbef49d07dddc836fb5d7b3\/30","level":"59","carlevel":1,"award":47600,"power":188243},{"_cls":"roblist","id":"1008141","nickname":"%E3%82%9B%E5%B0%8F%E6%96%B0%E5%90%83%E4%BA%86%E6%A8%B1%E6%A1%83%E7%9A%84%E4%B8%B8%E5%AD%90%C2%B0%20","tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/79a40b79ee1c826e237e4c3670efee8c61cf543f29e6a9805b7dddb6c6951095\/30","level":"59","carlevel":"1","award":47600,"power":351024},{"_cls":"roblist","id":"1008344","nickname":"%E8%80%81%E7%8B%BC","tinyurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/e8fadc99fa5128e2242923028c6356ae420c37dd533d689ea3cb9339e82551be\/30","level":"59","carlevel":1,"award":47600,"power":148938},{"_cls":"roblist","id":"1008982","nickname":"bobo","tinyurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/bb1ce4c4d9e008fbf667f0d816e612872c1c1cd4cf7c3fec18745dfdf46d0523\/30","level":"59","carlevel":1,"award":47600,"power":154897},{"_cls":"roblist","id":"1010122","nickname":"%E5%AE%89%E5%AD%90%E4%BC%8A","tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/14f7e4286bded835bb3e2cb6ab2881f6e08f709674afef15c1d94db195475d27\/30","level":"59","carlevel":"1","award":47600,"power":250464},{"_cls":"roblist","id":"1011910","nickname":"%E4%BF%84%E2%86%98%E9%82%A3__%E7%A9%BA%E7%99%BD%E2%95%84%E9%8D%80%EF%B8%B6%EF%BF%A3%E6%9C%AA%E6%9D%A5","tinyurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/aff242e95d20fb900bf5e0b9a47fc661e05c813a78538228ce85dc5a166b6ef4\/30","level":"59","carlevel":"1","award":47600,"power":407451},{"_cls":"roblist","id":"1017532","nickname":"2338055591","tinyurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/8afa4a794bd7fc802ecf42b0f3a70e75c32c8f656f45099c271e58b5ac95eaa4\/30","level":"59","carlevel":1,"award":47600,"power":83745},{"_cls":"roblist","id":"1018447","nickname":"Reecho","tinyurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/43a357988b13b4b8649eb26236640ecd42cf4ac025e27c158c9c5deee9ba3d7a\/30","level":"59","carlevel":"2","award":59500,"power":393501},{"_cls":"roblist","id":"1019235","nickname":"%E9%86%89%E9%A3%8E","tinyurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/36cb4828641e5a85b808ad9ed1bba519dcb1456f79084a4249e9371928ce8b97\/30","level":"59","carlevel":1,"award":47600,"power":169567},{"_cls":"roblist","id":"1019845","nickname":"Disappear","tinyurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/b025b6dd00a560fcca360b416d9a650b41ece73a1108f40e5a94f05ed47b3684\/30","level":"59","carlevel":1,"award":47600,"power":200747},{"_cls":"roblist","id":"1021116","nickname":"%E5%A4%8F%E5%A4%A9.....","tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/cdcb0a34c017a833b80f5e333be9503b90b10c43f083b0fbe2c64d724b077c4e\/30","level":"59","carlevel":1,"award":47600,"power":73800},{"_cls":"roblist","id":"1022267","nickname":"%E0%B9%91%DB%A9%DB%A9%DB%A9%DB%A9%E0%B9%91%20","tinyurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/664dc5021a4d2683adc239f16ec7649877e6597f5a9e455aa62258f85bc750a0\/30","level":"59","carlevel":1,"award":47600,"power":252030},{"_cls":"roblist","id":"1023345","nickname":"%E4%BB%8A%E6%99%9A%E6%89%93%E8%80%81%E8%99%8E%E4%B8%B6","tinyurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/2ed71fc3734a421f02c0aa3d9ae8f9ddf223b45feadf049e0da175db5def381b\/30","level":"59","carlevel":1,"award":47600,"power":193158},{"_cls":"roblist","id":"1023365","nickname":"%E9%9D%99%E6%AD%A2%E3%81%9F%E3%81%AE%E9%9B%AA%E3%81%A7","tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/6c56fabc3bc7003c6aacb3426a387eaf8dd9d383749a2a7a6eaa0fafa86a02a7\/30","level":"59","carlevel":"1","award":47600,"power":252265}],"_cls":"getroblist"}}

	/**
	 * get rob list
	 * @param user
	 * @return
	 */
	public static String transportGrablist(User user) {
		return user.send(
			"&act=getroblist&ctl=transport",
			"{\"num\":30}"
		);
	}


	//public static const TRANSPORT_STARTROB:Object = {ctl:"transport", act:"startrob"};
	//GoGrabProxy.as: line 18: 	App.net.send(new HttpGetParams(PHPConsts.TRANSPORT_STARTROB).getHttpString(), {robid:param1.id}, this.startRobHandler, this.failureHandler, "default", "default", "default", RequestType.DIALOG_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_nopkroleid"}

	/**
	 * start rob
	 * @param user
	 * @param rid
	 * @return
	 */
	public static String transportStartrob(User user,int rid) {
		return user.send(
			"&act=startrob&ctl=transport",
			"{\"robid\":%d}",rid
		);
	}


	//public static const GET_TOWERDATA:Object = {ctl:"rtower", act:"getrtower"};
	//TowerProxy.as: line 158: 	App.net.send(new HttpGetParams(PHPConsts.GET_TOWERDATA).getHttpString(), null, this.onGetTowerData, null, "default", "default", "default", RequestType.DIALOG_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getrtowerok","data":{"rtowerList":[{"id":"999","resettimes":0,"rmapfloor":0,"cleartowertimes":3,"rmapdropitemList":null,"_cls":"rtowerFloor"},{"id":1006,"resettimes":1,"rmapfloor":2,"cleartowertimes":0,"rmapdropitemList":null,"_cls":"rtowerFloor"},{"id":"1000","resettimes":0,"rmapfloor":3,"cleartowertimes":2,"rmapdropitemList":null,"_cls":"rtowerFloor"},{"id":1007,"resettimes":1,"rmapfloor":0,"cleartowertimes":0,"rmapdropitemList":null,"_cls":"rtowerFloor"},{"id":"1001","resettimes":0,"rmapfloor":1,"cleartowertimes":45,"rmapdropitemList":null,"_cls":"rtowerFloor"},{"id":1008,"resettimes":1,"rmapfloor":0,"cleartowertimes":0,"rmapdropitemList":null,"_cls":"rtowerFloor"},{"id":"1002","resettimes":0,"rmapfloor":0,"cleartowertimes":14,"rmapdropitemList":null,"_cls":"rtowerFloor"},{"id":1009,"resettimes":1,"rmapfloor":0,"cleartowertimes":0,"rmapdropitemList":null,"_cls":"rtowerFloor"},{"id":"1003","resettimes":0,"rmapfloor":0,"cleartowertimes":9,"rmapdropitemList":null,"_cls":"rtowerFloor"},{"id":1010,"resettimes":1,"rmapfloor":0,"cleartowertimes":0,"rmapdropitemList":null,"_cls":"rtowerFloor"},{"id":"1004","resettimes":0,"rmapfloor":0,"cleartowertimes":0,"rmapdropitemList":null,"_cls":"rtowerFloor"},{"id":1011,"resettimes":1,"rmapfloor":0,"cleartowertimes":0,"rmapdropitemList":null,"_cls":"rtowerFloor"}],"_cls":"rtowerList"}}

	/**
	 * 塔数据
	 * @param user
	 * @return
	 */
	public static String getTowerdata(User user) {
		return user.send(
			"&act=getrtower&ctl=rtower",
			null
		);
	}


	//public static const GET_TOWERAUTO:Object = {ctl:"rtower", act:"autofight"};
	//TowerProxy.as: line 130: 	App.net.send(new HttpGetParams(PHPConsts.GET_TOWERAUTO).getHttpString(), {rtowerid:param1.id}, this.onGetAutoFight, null, "default", "default", "default", RequestType.NORMAL, "default", "default", "default", "default", "default", this.doubleCheck);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_rawdataerr"}

	/**
     * 自动扫荡塔
     *
     * @param user
     * @param id 999 = 枯木 90-99 困难： 160-169 1000 =黑石 100-109 170-179 1001 青铜
     * 110-119 180-189 1002 白银 120-129 190-199 1003 黄金 130 139 200-209 1004 钻石
     * 140 149 210-219 1005 天晶 150-159 220-229
     * @return
     */
	public static String getTowerauto(User user,int id) {
		return user.send(
			"&act=autofight&ctl=rtower",
			"{\"rtowerid\":%d}", id
		);
	}


	//public static const TOWER_REVIVE:Object = {ctl:"rtower", act:"relivertower"};
	//TowerProxy.as: line 292: 	App.net.send(new HttpGetParams(PHPConsts.TOWER_REVIVE).getHttpString(), null, this.onTowerRevive, null, "default", "default", "default", RequestType.DIALOG_INIT);
	//<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"><html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8" /><title> - </title><style>body {	font-size:76%;	font-family:"Lucida Grande", Verdana, Lucida, Arial, Helvetica, sans-serif;	background-color:#FEFEFE;	color:#333333;	margin:0;}a{color:#f60;}a:hover{text-decoration:none;}.dialogtitle {	margin-bottom:10px;	font-weight:bold;}.dialogContent {	padding:10px;}</style><link rel="stylesheet" href="style/dialog.css" /></head><body><div style="margin:100px auto;width:500px;"><table border="0" cellspacing="0" cellpadding="0" id="windowTable">	<tr>		<td colspan="2" class="td9TL"></td>		<td class="td9TC"></td>		<td colspan="2" class="td9TR"></td>	</tr>	<tr>		<td class="td9ML2"></td>		<td class="td9ML"></td>		<td class="td9MC" id="windowContent"><div>	<div class="dialogtitle"><div></div></div>    <div class="dialogContent">    	<div style="width:450px;">       	方法【relivertower】未定义，请联系网站管理员。<br />		<div align="center" style="margin-top:10px;">    <a href="javascript:history.back();"></a>		</div>    	</div>    </div></div>               </td>		<td class="td9MR"></td>		<td class="td9MR2"></td>	</tr>	<tr>		<td colspan="2" class="td9BL"></td>		<td class="td9BC"></td>		<td colspan="2" class="td9BR"></td>	</tr></table></div></body></html>

	/**
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String towerRevive(User user) {
		return user.send(
			"&act=relivertower&ctl=rtower",
			null
		);
	}


	//public static const TOWER_RESET:Object = {ctl:"rtower", act:"resetrtower"};
	//TowerProxy.as: line 191: 	App.net.send(new HttpGetParams(PHPConsts.TOWER_RESET).getHttpString(), _loc_1, this.doResetTower, null, "default", "default", "default", RequestType.NORMAL);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_rawdataerr"}
	
	/**
     * 重置扫荡塔
     *
     * @param user
     * @param id 999 = 枯木 90-99 困难： 160-169 1000 =黑石 100-109 170-179 1001 青铜
     * 110-119 180-189 1002 白银 120-129 190-199 1003 黄金 130 139 200-209 1004 钻石
     * 140 149 210-219 1005 天晶 150-159 220-229
     * @return
     */
	public static String towerReset(User user,int id) {
		return user.send(
			"&act=resetrtower&ctl=rtower",
			"{\"rtowerid\":%d,\"addone\":0}", id
		);
	}


	//public static const TOWER_ADDNUM:Object = {ctl:"rtower", act:"addfight"};
	//ExchangeProxy.as: line 107: 	App.net.send(new HttpGetParams(PHPConsts.TOWER_ADDNUM).getHttpString(), null, this.refreshAddTime, null, "default", "default", "default", RequestType.DIALOG_INIT).dropPoint = new Point(470, 300);
	//TowerProxy.as: line 222: 	App.net.send(new HttpGetParams(PHPConsts.TOWER_ADDNUM).getHttpString(), null, this.refreshAddTime, null, "default", "default", "default", RequestType.DIALOG_INIT);
	//<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"><html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8" /><title> - </title><style>body {	font-size:76%;	font-family:"Lucida Grande", Verdana, Lucida, Arial, Helvetica, sans-serif;	background-color:#FEFEFE;	color:#333333;	margin:0;}a{color:#f60;}a:hover{text-decoration:none;}.dialogtitle {	margin-bottom:10px;	font-weight:bold;}.dialogContent {	padding:10px;}</style><link rel="stylesheet" href="style/dialog.css" /></head><body><div style="margin:100px auto;width:500px;"><table border="0" cellspacing="0" cellpadding="0" id="windowTable">	<tr>		<td colspan="2" class="td9TL"></td>		<td class="td9TC"></td>		<td colspan="2" class="td9TR"></td>	</tr>	<tr>		<td class="td9ML2"></td>		<td class="td9ML"></td>		<td class="td9MC" id="windowContent"><div>	<div class="dialogtitle"><div></div></div>    <div class="dialogContent">    	<div style="width:450px;">       	方法【addfight】未定义，请联系网站管理员。<br />		<div align="center" style="margin-top:10px;">    <a href="javascript:history.back();"></a>		</div>    	</div>    </div></div>               </td>		<td class="td9MR"></td>		<td class="td9MR2"></td>	</tr>	<tr>		<td colspan="2" class="td9BL"></td>		<td class="td9BC"></td>		<td colspan="2" class="td9BR"></td>	</tr></table></div></body></html>

	/**
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String towerAddnum(User user) {
		return user.send(
			"&act=addfight&ctl=rtower",
			null
		);
	}


	//public static const EXCHANGE_ALL:Object = {ctl:"challengepoint", act:"exchange"};
	//TowerProxy.as: line 68: 	App.net.send(new HttpGetParams(PHPConsts.EXCHANGE_ALL).getHttpString(), 
	//{changeid:event.data, type:ExChangeType.TOWER_TYPE}, this.changeComplete);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_gam_err_paramerr"}

	/**
	 * 
	 * @param user
	 * @param type
	 *         	public static const TOWER_TYPE:uint = 1;  挑战点
		        public static const GROUP_TYPE:uint = 2;  人品
		        public static const JJC_TYPE:uint = 3;    荣耀
 		        public static const GUILD_WAR_TYPE:uint = 4; 碎片
		        public static const FASCINATION:uint = 5;  魅力
	 * @param changeId
	 * @param num
	 * @return
	 */
	public static String exchangeAll(User user, int type, int changeId, int num) {
		return user.send(
			"&act=exchange&ctl=challengepoint",
			"{\"type\":%d,\"changeid\":%d,\"num\":%d,}", type, changeId, num
		);
	}
	/**
	 * 兑换挑战点
	 * @param user
	 * @param changeId
	 * 	1	req: 1000	award: 侠客卡-神剑传人 1
		2	req: 10		award: 完美的残影护盔 1
		3	req: 10		award: 完美的残影双环 1
		4	req: 10		award: 完美的残影护符 1
		5	req: 10		award: 完美的残影护甲 1
		6	req: 40		award: 完美的逐日战盔 1
		7	req: 40		award: 完美的逐日大弓 1
		8	req: 40		award: 完美的逐日护符 1
		9	req: 40		award: 完美的逐日战甲 1
		10	req: 75		award: 完美的赤霄战盔 1
		11	req: 75		award: 完美的赤霄长枪 1
		12	req: 75		award: 完美的赤霄护符 1
		13	req: 75		award: 完美的赤霄战甲 1
		14	req: 120	award: 完美的饕餮头盔 1
		15	req: 120	award: 完美的饕餮神剑 1
		16	req: 120	award: 完美的饕餮护符 1
		17	req: 120	award: 完美的饕餮盔甲 1
		18	req: 200	award: 完美的狼神头盔 1
		19	req: 200	award: 完美的狼神神剑 1
		20	req: 200	award: 完美的狼神护符 1
		21	req: 200	award: 完美的狼神盔甲 1
		22	req: 500	award: 完美的貔貅头盔 1
		23	req: 500	award: 完美的貔貅神剑 1
		24	req: 500	award: 完美的貔貅护符 1
		25	req: 500	award: 完美的貔貅盔甲 1
	 * @param num
	 * @return
	 */
	public static String exchangeChallenge(User user, int changeId, int num) {
		return exchangeAll(user, 1, changeId, num);
	}
	
	/**
	 * 兑换人品
	 * @param user
	 * @param changeId
	 * 	1	req: 5000	award: 侠客卡-波斯公主 1
		2	req: 100	award: 普通的力量果实 1
		3	req: 100	award: 普通的生命果实 1
		4	req: 100	award: 普通的防御果实 1
		5	req: 100	award: 普通的内力果实 1
		6	req: 20		award: 神兵天晶素材包 1
		7	req: 20		award: 神兵虎魄素材包 1
		8	req: 20		award: 神兵神舞素材包 1
		9	req: 20		award: 神兵噬魂素材包 1
		10	req: 20		award: 神兵太虚素材包 1
		11	req: 20		award: 神兵风皇素材包 1
		12	req: 20		award: 神兵帝恨素材包 1
		13	req: 20		award: 神兵星宿劫素材包 1
	 * @param num
	 * @return
	 */
	public static String exchangeCharacter(User user, int changeId, int num) {
		return exchangeAll(user, 2, changeId, num);
	}

	/**
	 * 兑换荣耀值
	 * @param user
	 * @param changeId
	 * 	1	req: 200000	award: 侠客卡-红妆教主 1
		2	req: 10000	award: 侠客卡-天绝师太 1
		3	req: 30		award: 五级铜币种子 1
		4	req: 50		award: 三级阅历种子 1
		5	req: 50		award: 二级生命强化符 1
		6	req: 50		award: 二级力量强化符 1
		7	req: 50		award: 二级防御强化符 1
		8	req: 50		award: 二级内力强化符 1
	 * @param num
	 * @return
	 */
	public static String exchangeHonor(User user, int changeId, int num) {
		return exchangeAll(user, 3, changeId, num);
	}
	
	/**
	 * 兑换帮派王者碎片
	 * @param user
	 * @param changeId
	 * 	1	req: 2000	award: 天晶 1
		2	req: 2000	award: 虎魄 1
		3	req: 2000	award: 神舞 1
		4	req: 2000	award: 噬魂 1
		5	req: 20		award: 紫色神兵素材包 1
		6	req: 10		award: 人符·临 1
		7	req: 10		award: 人符·兵 1
		8	req: 10		award: 人符·斗 1
		9	req: 10		award: 人符·者 1
		10	req: 10		award: 人符·皆 1
		11	req: 10		award: 人符·阵 1
		12	req: 10		award: 人符·列 1
		13	req: 10		award: 人符·前 1
		14	req: 10		award: 人符·行 1
		15	req: 8000	award: 残剑 1
		16	req: 8000	award: 飞雪 1
		17	req: 8000	award: 无名 1
		18	req: 8000	award: 长空 1
		19	req: 40		award: 橙色神兵素材包 1
	 * @param num
	 * @return
	 */
	public static String exchangeGuild(User user, int changeId, int num) {
		return exchangeAll(user, 4, changeId, num);
	}

	/**
	 * 兑换魅力
	 * @param user
	 * @param changeId
	 * 	1	req: 4		award: 时装碎片(侠客) 1
		2	req: 8		award: 合成幸运符 1
		3	req: 80		award: 五级阅历卡 1
		4	req: 80		award: 灵魂转换符 1
		5	req: 200	award: 情人节福袋 1
		6	req: 9999	award: 情人节时装秘钥 1
	 * @param num
	 * @return
	 */
	public static String exchangeFascination(User user, int changeId, int num) {
		return exchangeAll(user, 5, changeId, num);
	}
	
	//public static const TRANSFER_COFIRM:Object = {ctl:"rwarrior", act:"setcamp"};
	//TransferProxy.as: line 125: 	App.net.send(new HttpGetParams(PHPConsts.TRANSFER_COFIRM).getHttpString(), _loc_1, this.onSelected, null, "default", "default", "default", RequestType.NORMAL);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_gam_err_warriorcfgnotvalid"}

	/**
	 * 转职
	 * @param user
	 * @param wid
		 * 19 男主角暗器
	     * 20 男主角剑士
	     * 21 男主角拳师
	     * 22 女主角暗器
	     * 23 女主角剑士
	     * 24 女主角拳师
	 * @return
	 */
	public static String transferCofirm(User user,int wid) {
		return user.send(
			"&act=setcamp&ctl=rwarrior",
			"{\"warriorcfgid\":%d}", wid
		);
	}


	//public static const GROW_UP:Object = {ctl:"rwarrior", act:"reincarnate"};
	//TransferProxy.as: line 98: 	App.net.send(new HttpGetParams(PHPConsts.GROW_UP).getHttpString(), null, this.onGrowUp, null, "default", "default", "default", RequestType.DIALOG_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0003","msg":"_gam_err_hasreincarnated"}

	/**
	 * 二转
	 * @param user
	 * @return
	 */
	public static String growUp(User user) {
		return user.send(
			"&act=reincarnate&ctl=rwarrior",
			null
		);
	}


	//public static const MALE_Transfer:Object = {ctl:"rwarrior", act:"sexchange"};
	//TransferProxy.as: line 70: 	App.net.send(new HttpGetParams(PHPConsts.MALE_Transfer).getHttpString(), null, this.onMaleChange, null, "default", "default", "default", RequestType.DIALOG_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0999","msg":"_gam_err_reqnotvalid"}

	/**
	 * 变性- 葵花宝典
	 * @param user
	 * @return
	 */
	public static String maleTransfer(User user) {
		return user.send(
			"&act=sexchange&ctl=rwarrior",
			null
		);
	}


	//public static const MAP_RAIDS:Object = {ctl:"rmap", act:"towipeout"};
	//RaidsPanel.as: line 152: 	App.net.send(new HttpGetParams(PHPConsts.MAP_RAIDS).getHttpString(), _loc_2, this.showResult, null, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.doubleCheck);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_rmap_err_rawdataerr"}

	/**
	 * 扫荡江湖
	 * @param user
	 * @param mapId
	 * @param swipeNum
	 * @return
	 */
	public static String mapRaids(User user,int mapId, int swipeNum) {
		return user.send(
			"&act=towipeout&ctl=rmap",
			"{\"mid\":%d,\"num\":%d}", mapId, swipeNum
		);
	}


	//public static const GET_RANK:Object = {ctl:"match", act:"openmatch"};
	//MatchProxy.as: line 188: 	App.net.send(new HttpGetParams(PHPConsts.GET_RANK).getHttpString(), null, this.refreshRankData, null, "default", "default", "default", RequestType.NORMAL);
	//MatchProxy.as: line 201: 	App.net.send(new HttpGetParams(PHPConsts.GET_RANK).getHttpString(), null, this.refreshMyData, null, "default", "default", "default", RequestType.DIALOG_INIT);
	//MatchProxy.as: line 218: 	App.net.send(new HttpGetParams(PHPConsts.GET_RANK).getHttpString(), null, this.getRankDataDone, null, "default", "default", "default", RequestType.DIALOG_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_match_suc_openmatchok","data":{"matchinfo":null,"_cls":"openmatch"}}

	/**
	 * 获取天梯列表
	 * @param user
	 * @return
	 */
	public static String getRank(User user) {
		return user.send(
			"&act=openmatch&ctl=match",
			null
		);
	}


	//public static const REFRESH_MATCHLIST:Object = {ctl:"match", act:"renewmatchlist"};
	//	null-====

	/**
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String refreshMatchlist(User user) {
		return user.send(
			"&act=renewmatchlist&ctl=match",
			null
		);
	}


	//public static const RANK_SIGNUP:Object = {ctl:"match", act:"applymatch"};
	//MatchProxy.as: line 226: 	App.net.send(new HttpGetParams(PHPConsts.RANK_SIGNUP).getHttpString(), null, this.onSignUpDone, null, "default", "default", "default", RequestType.NORMAL);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_match_suc_applymatchok","data":{"applymatch":true,"_cls":"applymatch"}}

	/**
	 * 天梯报名
	 * @param user
	 * @return
	 */
	public static String rankSignup(User user) {
		return user.send(
			"&act=applymatch&ctl=match",
			null
		);
	}


	//public static const START_MATCH:Object = {ctl:"match", act:"startmatch"};
	//MatchProxy.as: line 408: 	App.net.send(new HttpGetParams(PHPConsts.START_MATCH).getHttpString(), _loc_5, this.readyBattle, this.onFailHandler, "default", "default", "default", RequestType.DIALOG_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_nopkroleid"}

	/**
	 * 开始天梯
	 * @param user
	 * @param pkId
	 * @return
	 */
	public static String startMatch(User user, int pkId) {
		return user.send(
			"&act=startmatch&ctl=match",
			"{\"pkroleid\":%d}", pkId
		);
	}


	//public static const RANK_NEWS:Object = {ctl:"match", act:"getnews"};
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_match_suc_getnewsok","data":{"newslist":[],"_cls":"getnews"}}

	/**
	 * 天梯消息
	 * @param user
	 * @return
	 */
	public static String rankNews(User user) {
		return user.send(
			"&act=getnews&ctl=match",
			null
		);
	}


	//public static const RANK_MYINFO:Object = {ctl:"match", act:"getcurmatchinfo"};
	//	null-====

	/**
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String rankMyinfo(User user) {
		return user.send(
			"&act=getcurmatchinfo&ctl=match",
			null
		);
	}


	//public static const RANK_HISTORYRANK:Object = {ctl:"match", act:"getallrank"};
	//RankListProxy.as: line 199: 	App.net.send(new HttpGetParams(PHPConsts.RANK_HISTORYRANK).getHttpString(), this.selectData, this.onGetHistoryRankData, null, "default", "default", "default", RequestType.NORMAL);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_match_suc_getallrankok","data":{"topranklist":[],"mymatchinfo":[],"_cls":"getallrank"}}

	/**
	 * 历史排名信息
	 * @param user
	 * @return
	 */
	public static String rankHistoryrank(User user) {
		return user.send(
			"&act=getallrank&ctl=match",
			null
		);
	}


	//public static const RANK_HISTORYGROUP:Object = {ctl:"match", act:"getmarealist"};
	//RankListProxy.as: line 185: 	App.net.send(new HttpGetParams(PHPConsts.RANK_HISTORYGROUP).getHttpString(), this.selectData, this.onGetHistoryGroupData, null, "default", "default", "default", RequestType.NORMAL).jumpOutOfQueue();
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_infoerr"}

	/**
	 * 分区信息
	 * @param user
	 * @param bid
	 * 1 -25-40级, 2 - 41-50级, 3 - 51-60 , 4 61-70, 5 71-80
	 * @param pid
	 * 	第几届天梯
	 * @return
	 */
	public static String rankHistorygroup(User user, int bid, int pid) {
		return user.send(
			"&act=getmarealist&ctl=match",
			"{\"mid\":1,\"bid\":%d,\"pid\":%d}",bid, pid
		);
	}


	//public static const RANK_LATESTRANK:Object = {ctl:"match", act:"getlastsarearank"};
	//RankListProxy.as: line 100: 	App.net.send(new HttpGetParams(PHPConsts.RANK_LATESTRANK).getHttpString(), null, this.onGetLastRankData).jumpOutOfQueue();
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_match_suc_getsarearankok","data":{"mylasthour":{"_cls":"mylasthour","barea":"61-70\u7ea7\u522b","marea":"A\u533a","sarea":"\u9ed1\u77f3\u7ec4","rank":0,"score":0},"lasthourlist":[{"_cls":"lastlist","rank":1,"headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/c2a5760c145f85bd33f4dfa60a685a993f44844da529fab1e4af96ba565b0231\/30","rid":679023,"nickname":"%E9%A2%A4%E6%8A%96%E5%A5%8B%E6%96%97%E7%9A%84%E6%A2%A6","score":"984","level":"70"},{"_cls":"lastlist","rank":2,"headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/6b08dedcdcc878a7089e9245a74d8ed35a84513ee59682f70dc2cbc4a7d29273\/30","rid":865600,"nickname":"%E7%8A%B4%E9%AD%83%E5%8D%AC%E6%88%98%E5%B9%9F","score":"964","level":"70"},{"_cls":"lastlist","rank":3,"headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/efbd2f21100944bb5a1fe19d8cdecbc415eb5a7031bcd5b2f13d5e5c1ba1d5b1\/30","rid":587947,"nickname":"%E5%BF%AB%E4%B9%90%E7%94%9F%E6%B4%BB","score":"945","level":"70"},{"_cls":"lastlist","rank":4,"headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/b199772f2370c247841823098e787c8280ac8e8d29fb7a420fa5afb756db1e93\/30","rid":1268956,"nickname":"%E5%A4%AA%E9%98%B3","score":"923","level":"63"},{"_cls":"lastlist","rank":5,"headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/2ed71fc3734a421fc35b80417e4278b01e9b61b520f680d4bf7da8a14bf7f3d8\/30","rid":1555304,"nickname":"%E5%94%AF%E4%B8%80%C2%B0","score":"902","level":"68"},{"_cls":"lastlist","rank":6,"headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/aff242e95d20fb90446f63b61e5d523d20ce02aa2c57dcf4a26c46f9db182420\/30","rid":1282084,"nickname":"2","score":"896","level":"66"},{"_cls":"lastlist","rank":7,"headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/9424a1989a7bc182ff6ab3bec3454718b4b247f51a395fd3b5af9bf83f5c416b\/30","rid":1671016,"nickname":"%E5%BC%80%E5%BF%83%E4%B8%9C%E4%B8%9C","score":"856","level":"69"},{"_cls":"lastlist","rank":8,"headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/bed3912a4b2f2d3cc78ed95e0c234803767c3c9e96f49841b2edf54259d9e384\/30","rid":1249087,"nickname":"A~A","score":"850","level":"66"},{"_cls":"lastlist","rank":8,"headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/653597e212093c4241a83ef1f4f28c68961090ce211082b2e3d86b30e12cab11\/30","rid":1249071,"nickname":"D~D","score":"850","level":"65"},{"_cls":"lastlist","rank":8,"headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/4c9e187290f2d32537918aeb7e7d8ae77a08751b2bad413e13862a54529d85ca\/30","rid":1219820,"nickname":"C~C","score":"850","level":"66"},{"_cls":"lastlist","rank":8,"headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/5cfced1bb8f7ba665863cac6eac23387257084ee5e9d576d2aad565ca1c809bb\/30","rid":1219653,"nickname":"B~B","score":"850","level":"66"},{"_cls":"lastlist","rank":9,"headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/0e922826e66025bc2c0355d68b8db5ec2523d53156ec5a6815359a8c9e634abe\/30","rid":759739,"nickname":"%20%20%E5%A4%A7%E8%9F%B9~","score":"833","level":"70"},{"_cls":"lastlist","rank":10,"headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/6c56fabc3bc7003c05a6f90d27df8bffb4f0a7998700d3160c2fb9b6d4d21e18\/30","rid":463335,"nickname":"%E2%80%BB%E8%90%BD%E5%8F%B6%E2%80%BB..%CE%BE%E7%9F%A5%E7%A7%8B%CE%BE","score":"801","level":"64"}],"_cls":"getsarearank"}}

	/**
	 * 排名前十
	 * @param user
	 * @return
	 */
	public static String rankLatestrank(User user) {
		return user.send(
			"&act=getlastsarearank&ctl=match",
			null
		);
	}


	//public static const RANK_GETMYMATCHLOG:Object = {ctl:"match", act:"getmymatchlog"};
	//RankListProxy.as: line 126: 	App.net.send(new HttpGetParams(PHPConsts.RANK_GETMYMATCHLOG).getHttpString(), null, this.onGetMyMatchLogData, null, "default", "default", "default", RequestType.NORMAL).jumpOutOfQueue();
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_match_suc_getmymatchlogok","data":{"mymatchlog":[{"_cls":"matchloglist","period":74,"barea":"61-70\u7ea7\u522b","marea":"B\u533a","sarea":"\u9ed1\u77f3\u7ec4","rank":87,"score":"0"},{"_cls":"matchloglist","period":66,"barea":"61-70\u7ea7\u522b","marea":"A\u533a","sarea":"\u9ed1\u77f3\u7ec4","rank":86,"score":"85"},{"_cls":"matchloglist","period":61,"barea":"61-70\u7ea7\u522b","marea":"B\u533a","sarea":"\u9ed1\u77f3\u7ec4","rank":119,"score":"0"},{"_cls":"matchloglist","period":59,"barea":"61-70\u7ea7\u522b","marea":"D\u533a","sarea":"\u9ed1\u77f3\u7ec4","rank":96,"score":"170"},{"_cls":"matchloglist","period":29,"barea":"51-60\u7ea7\u522b","marea":"D\u533a","sarea":"\u9ed1\u77f3\u7ec4","rank":117,"score":"0"},{"_cls":"matchloglist","period":28,"barea":"51-60\u7ea7\u522b","marea":"B\u533a","sarea":"\u9ed1\u77f3\u7ec4","rank":127,"score":"196"},{"_cls":"matchloglist","period":25,"barea":"51-60\u7ea7\u522b","marea":"E\u533a","sarea":"\u9752\u94dc\u7ec4","rank":82,"score":"2127"},{"_cls":"matchloglist","period":24,"barea":"41-50\u7ea7\u522b","marea":"F\u533a","sarea":"\u9ec4\u91d1\u7ec4","rank":66,"score":"16219"},{"_cls":"matchloglist","period":23,"barea":"25-40\u7ea7\u522b","marea":"B\u533a","sarea":"\u94bb\u77f3\u7ec4","rank":84,"score":"19278"},{"_cls":"matchloglist","period":21,"barea":"25-40\u7ea7\u522b","marea":"G\u533a","sarea":"\u94bb\u77f3\u7ec4","rank":78,"score":"16976"},{"_cls":"matchloglist","period":20,"barea":"25-40\u7ea7\u522b","marea":"P\u533a","sarea":"\u9ec4\u91d1\u7ec4","rank":34,"score":"16158"},{"_cls":"matchloglist","period":19,"barea":"25-40\u7ea7\u522b","marea":"A\u533a","sarea":"\u94bb\u77f3\u7ec4","rank":21,"score":"18430"},{"_cls":"matchloglist","period":18,"barea":"25-40\u7ea7\u522b","marea":"G\u533a","sarea":"\u94bb\u77f3\u7ec4","rank":42,"score":"16900"},{"_cls":"matchloglist","period":17,"barea":"25-40\u7ea7\u522b","marea":"Q\u533a","sarea":"\u94bb\u77f3\u7ec4","rank":61,"score":"16782"},{"_cls":"matchloglist","period":16,"barea":"25-40\u7ea7\u522b","marea":"Q\u533a","sarea":"\u94bb\u77f3\u7ec4","rank":35,"score":"17641"},{"_cls":"matchloglist","period":15,"barea":"25-40\u7ea7\u522b","marea":"I\u533a","sarea":"\u9ec4\u91d1\u7ec4","rank":33,"score":"15141"},{"_cls":"matchloglist","period":14,"barea":"25-40\u7ea7\u522b","marea":"L\u533a","sarea":"\u9ec4\u91d1\u7ec4","rank":121,"score":"13230"},{"_cls":"matchloglist","period":13,"barea":"25-40\u7ea7\u522b","marea":"I\u533a","sarea":"\u767d\u94f6\u7ec4","rank":116,"score":"7162"}],"_cls":"getmymatchlog"}}

	/**
	 * 我的历史排名
	 * @param user
	 * @return
	 */
	public static String rankGetmymatchlog(User user) {
		return user.send(
			"&act=getmymatchlog&ctl=match",
			null
		);
	}


	//public static const RANK_GETFRIENDRANK:Object = {ctl:"match", act:"getlastfriendrank"};
	//RankListProxy.as: line 152: 	App.net.send(new HttpGetParams(PHPConsts.RANK_GETFRIENDRANK).getHttpString(), null, this.onGetFriendRankData, null, "default", "default", "default", RequestType.NORMAL).jumpOutOfQueue();
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_match_suc_getfriendmatchok","data":{"mylasthour":{"_cls":"mylasthour","barea":"61-70\u7ea7\u522b","marea":"A\u533a","sarea":"\u9ed1\u77f3\u7ec4","rank":0,"score":0},"lasthourfriendlist":[{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/7e23615195608a7d21cd8663179bccf24f66fab1848e9e6e9d97368cf1d11eab\/30","rid":"200324","nickname":"%E5%8D%83%E9%9F%B3","level":"71","barea":"61-70\u7ea7\u522b","marea":"A\u533a","lhsarea":"\u94bb\u77f3\u7ec4","lhrank":7,"lhscore":"15117"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/cc7df3ef7156cabbf29ef5254d46bc54a1ac89d7d1e75c8385fc5c71b2f4b416\/30","rid":"236540","nickname":"neko.","level":"70","barea":"61-70\u7ea7\u522b","marea":"B\u533a","lhsarea":"\u9ec4\u91d1\u7ec4","lhrank":13,"lhscore":"12597"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/786c4e691e2555527c5ef360ac023f71cf67890615b612fac0246c63ef48d597\/30","rid":"244820","nickname":"Sai","level":"70","barea":"61-70\u7ea7\u522b","marea":"B\u533a","lhsarea":"\u9ec4\u91d1\u7ec4","lhrank":276,"lhscore":"11602"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/6c56fabc3bc7003c91fdcc6f4fa15c89f748889d9aa453d67a3b6eeea94d6f56\/30","rid":"247012","nickname":"%C2%B2%C2%BA%C2%B9%E2%81%B4%E6%B2%A1%E4%BA%8B%E8%87%AA%E5%B7%B1%E6%89%BE%E4%B9%90%E5%AD%90","level":"60","barea":"51-60\u7ea7\u522b","marea":"A\u533a","lhsarea":"\u767d\u94f6\u7ec4","lhrank":5,"lhscore":"9535"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/95dac2d0238d3f7bb3ac7d0f1b5ccc547ee49345d25020baa6618301c26988ea\/30","rid":"255077","nickname":"%E3%80%80","level":"70","barea":"61-70\u7ea7\u522b","marea":"B\u533a","lhsarea":"\u9ec4\u91d1\u7ec4","lhrank":146,"lhscore":"12074"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/56c09ef7bd51149626f5954d8a58fd278f275d262108af1ec3dd2e19ccb23fd8\/30","rid":"258778","nickname":"%E4%BB%B0%E6%9C%9B%E6%9C%88%E5%8D%8A%E7%A9%BA","level":"70","barea":"61-70\u7ea7\u522b","marea":"A\u533a","lhsarea":"\u767d\u94f6\u7ec4","lhrank":161,"lhscore":"9871"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/72a0df78bf8c85f220a4d8b3b1c56ceb705b8598c751fff3b408466b71e17a82\/30","rid":"261797","nickname":"%E8%B4%A4%E7%8B%BC","level":"70","barea":"61-70\u7ea7\u522b","marea":"B\u533a","lhsarea":"\u9ec4\u91d1\u7ec4","lhrank":323,"lhscore":"11313"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/9ac0f34f3caf9f844e0e00ffcfd01681b57931d43d3cf413cffbeff826e1477e\/30","rid":"285630","nickname":"%E6%B0%B4%E8%90%BD%E7%9F%B3","level":"50","barea":"41-50\u7ea7\u522b","marea":"A\u533a","lhsarea":"\u94bb\u77f3\u7ec4","lhrank":6,"lhscore":"12472"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/817afe2e6f5f55c5a29ba90022f923e89bbddf3276a0d98f546a79abb265321a\/30","rid":"299648","nickname":"%2F%2F%3A%E8%B7%AF%E4%BA%BA%20%E4%B8%81","level":"70","barea":"61-70\u7ea7\u522b","marea":"B\u533a","lhsarea":"\u9ec4\u91d1\u7ec4","lhrank":142,"lhscore":"12082"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/d8219673598dbd6f8fbaca6489fd85d7f9d1177ff58dde185f7b3ce7ef7294fc\/30","rid":"312726","nickname":"%E8%93%9D%E7%90%A5%E7%8F%80","level":"70","barea":"61-70\u7ea7\u522b","marea":"A\u533a","lhsarea":"\u9752\u94dc\u7ec4","lhrank":10,"lhscore":"3646"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/aed75a034169d9d726a0060f2dc50755affe5cac28e5e460952bc33ca3cb0e58\/30","rid":"322391","nickname":"%E6%89%AC%E7%BE%BD","level":"70","barea":"61-70\u7ea7\u522b","marea":"B\u533a","lhsarea":"\u767d\u94f6\u7ec4","lhrank":108,"lhscore":"10233"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/f4a6c3864d2726c3c3dd92b6dd9890fd78d3023382367e00e1498028ae087d58\/30","rid":"326930","nickname":"%E9%9D%92%E7%9C%BC%E3%81%AE%E7%99%BD%E9%BE%99","level":"70","barea":"61-70\u7ea7\u522b","marea":"B\u533a","lhsarea":"\u94bb\u77f3\u7ec4","lhrank":28,"lhscore":"13857"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/f222d66b35733712b5560b5580896b4eeb46210731eb56118f41c519574fda66\/30","rid":"343280","nickname":"%E2%94%8CD%E8%B0%83d%C4%9B%E6%B5%AA%E6%BC%AB","level":"70","barea":"61-70\u7ea7\u522b","marea":"B\u533a","lhsarea":"\u9ec4\u91d1\u7ec4","lhrank":21,"lhscore":"12535"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/7f7c2417913f508dfdef871cac020cefcf552a91bc48c46b9b9a928e20c35279\/30","rid":"444053","nickname":"%E2%9C%BF%20%E3%80%82%E5%A8%81%E5%BB%89%E7%8E%8B%E5%AD%90","level":"70","barea":"61-70\u7ea7\u522b","marea":"A\u533a","lhsarea":"\u9ed1\u77f3\u7ec4","lhrank":85,"lhscore":"0"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/e310302343d2c249746299c8fa320423cda3f8c912777f1d8d34721c2d7b3156\/30","rid":"472450","nickname":"%E9%BE%8D%E7%8C%AB","level":"70","barea":"61-70\u7ea7\u522b","marea":"B\u533a","lhsarea":"\u94bb\u77f3\u7ec4","lhrank":54,"lhscore":"13071"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/7e23615195608a7dcd069aca8c0ec9c2bf314cee436d26cf7edc459c5e02f7af\/30","rid":"486200","nickname":"6%E6%9C%8817%E5%8F%B7%E5%A4%A9%E4%BD%BF","level":"70","barea":"61-70\u7ea7\u522b","marea":"B\u533a","lhsarea":"\u767d\u94f6\u7ec4","lhrank":13,"lhscore":"10972"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/79cbb2c24e1465a91b833d4706ce02fc24b64dcd9a1c8d426a3f78238a049bd3\/30","rid":"608984","nickname":"%E7%B4%AB%E9%BE%8D~~","level":"70","barea":"61-70\u7ea7\u522b","marea":"B\u533a","lhsarea":"\u9ed1\u77f3\u7ec4","lhrank":84,"lhscore":"0"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/c2a5760c145f85bd8a0f0497be195a99768952a78735c02a1309ac319903af0d\/30","rid":"720018","nickname":"%E5%90%8E%E6%9D%A5","level":"70","barea":"61-70\u7ea7\u522b","marea":"B\u533a","lhsarea":"\u767d\u94f6\u7ec4","lhrank":226,"lhscore":"9023"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/e1bf14f30edae71b4e7f56cc8db6c174c202c037e44105a8573ffd7be94816b9\/30","rid":"726855","nickname":"%E8%90%8C%E5%A4%A7%E6%B1%89%2C","level":"70","barea":"61-70\u7ea7\u522b","marea":"A\u533a","lhsarea":"\u767d\u94f6\u7ec4","lhrank":53,"lhscore":"10766"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/72a0df78bf8c85f265e62dc0c71b7c445e26e45460ed7763948105b92f4c507e\/30","rid":"771116","nickname":"%E6%99%82%E5%85%89%E6%98%AF%E8%A8%98%E6%86%B6%E7%9A%84%E6%A9%A1%E7%9A%AE%E6%93%A6%E2%80%B3","level":"70","barea":"61-70\u7ea7\u522b","marea":"B\u533a","lhsarea":"\u9ec4\u91d1\u7ec4","lhrank":66,"lhscore":"12228"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/30eb7b4d48340a14d8600947eab8ef9e3ecfb8c6baeb7a62cc6f284e206f1dda\/30","rid":"812618","nickname":"yi%E4%BA%BD%E7%8D%A8%E5%A5%8F%E3%80%81","level":"70","barea":"61-70\u7ea7\u522b","marea":"A\u533a","lhsarea":"\u9ec4\u91d1\u7ec4","lhrank":198,"lhscore":"11815"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/e3e6b4bc45ca4d1942cfcc7ff04dbb527c50d0e4552770a3caee8b7f96f6dc02\/30","rid":"822942","nickname":"%E7%81%B0%E8%89%B2%E9%83%8E","level":"70","barea":"61-70\u7ea7\u522b","marea":"A\u533a","lhsarea":"\u9ec4\u91d1\u7ec4","lhrank":163,"lhscore":"11914"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/0750a6de80d4f8921c9851696e396f798be61d9631027362206871d536b3f656\/30","rid":"823947","nickname":"Te","level":"57","barea":"51-60\u7ea7\u522b","marea":"A\u533a","lhsarea":"\u9ed1\u77f3\u7ec4","lhrank":39,"lhscore":"0"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/d8219673598dbd6f272b814948cee895914e21b23ea55452feafe6789a78028e\/30","rid":"827520","nickname":"__%E5%B0%8F%E9%98%AA%E5%8D%83%E5%AF%BB","level":"70","barea":"61-70\u7ea7\u522b","marea":"B\u533a","lhsarea":"\u9ec4\u91d1\u7ec4","lhrank":274,"lhscore":"11607"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/664dc5021a4d2683d0f4a256429d3eaa7b4826955eb179527386ad33cfb10347\/30","rid":"907443","nickname":"Eight%E3%80%82","level":"70","barea":"61-70\u7ea7\u522b","marea":"B\u533a","lhsarea":"\u9ec4\u91d1\u7ec4","lhrank":110,"lhscore":"12135"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/aed75a034169d9d79f87c1176cf15a1ac0221562357a635fd4104e6d2eedda8b\/30","rid":"1015339","nickname":"%E9%98%BF%E5%91%86","level":"70","barea":"61-70\u7ea7\u522b","marea":"A\u533a","lhsarea":"\u767d\u94f6\u7ec4","lhrank":130,"lhscore":"10252"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/43a357988b13b4b87ef52a2917bbe28fc8ae1b8756353bbaca95773fdf1693f4\/30","rid":"1024976","nickname":"%E4%B9%90%E7%BF%94%E6%97%85%E9%80%94","level":"70","barea":"61-70\u7ea7\u522b","marea":"A\u533a","lhsarea":"\u9ec4\u91d1\u7ec4","lhrank":91,"lhscore":"12036"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/ecdab82720caeb862c0afe7f01da598ff7361e0324011b19458a5dd65294f6ba\/30","rid":"1111492","nickname":"%E4%B8%87%E8%8F%AF%E9%95%9C","level":"70","barea":"61-70\u7ea7\u522b","marea":"B\u533a","lhsarea":"\u94bb\u77f3\u7ec4","lhrank":67,"lhscore":"12940"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/79a40b79ee1c826e1a4a03110b846c6e7589b488eef6ae6a9ac59afc3ea0c79a\/30","rid":"1178777","nickname":"%E9%9D%92%E6%A2%85%E5%84%BF","level":"70","barea":"61-70\u7ea7\u522b","marea":"A\u533a","lhsarea":"\u9ec4\u91d1\u7ec4","lhrank":271,"lhscore":"11554"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/53c8b2459dd978f9dc0078a38679eea563751e6a5521953671374d755c0268a7\/30","rid":"1196874","nickname":"%E9%86%89%E6%A2%A6%E4%BA%BA%E7%94%9F","level":"70","barea":"61-70\u7ea7\u522b","marea":"B\u533a","lhsarea":"\u9ed1\u77f3\u7ec4","lhrank":84,"lhscore":"0"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/ea05ddb08708ec2854b49fe4c6b67dd56dc3e697a70b852633ed3ff339d4a9e3\/30","rid":"1198554","nickname":"%E7%99%BD%E5%BC%80%E6%B0%B4","level":"64","barea":"61-70\u7ea7\u522b","marea":"A\u533a","lhsarea":"\u767d\u94f6\u7ec4","lhrank":436,"lhscore":"5395"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/5026d6c576077a39cde22ef4ffc8ec0863651f6df39bafb9266d0884b1e646b5\/30","rid":"1322764","nickname":"%E6%A8%B1%E2%84%A2%E6%BC%A9%5E_%5E%E8%92%BE%E8%A9%88%C3%97_%C3%97","level":"46","barea":"41-50\u7ea7\u522b","marea":"A\u533a","lhsarea":"\u767d\u94f6\u7ec4","lhrank":9,"lhscore":"7183"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/95dac2d0238d3f7be77c49439c062bd658667afd336942d8989309d73d39992a\/30","rid":"1384214","nickname":"%E5%9B%A7ne%C2%A0Piece%C2%A0","level":"70","barea":"61-70\u7ea7\u522b","marea":"A\u533a","lhsarea":"\u9ec4\u91d1\u7ec4","lhrank":135,"lhscore":"11957"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/4296d9220a80af68589c902b5c97502efe9585558bfca2820e39dd2081a9f386\/30","rid":"1476428","nickname":"%E7%8C%A5%E5%90%9B%E5%AD%90","level":"70","barea":"61-70\u7ea7\u522b","marea":"B\u533a","lhsarea":"\u767d\u94f6\u7ec4","lhrank":114,"lhscore":"10201"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/a9791e2372158533d0ea593eb3da8b82adc94612a0c4126d3e333a7cebf93606\/30","rid":"1481822","nickname":"On%20the%20Road","level":"70","barea":"61-70\u7ea7\u522b","marea":"A\u533a","lhsarea":"\u9752\u94dc\u7ec4","lhrank":28,"lhscore":"3058"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/d8219673598dbd6fdc346bd4cfe54b18207022f9b15c358ecad8630de3f2f85a\/30","rid":"1510886","nickname":"%E5%88%80%E9%94%8B","level":"70","barea":"61-70\u7ea7\u522b","marea":"A\u533a","lhsarea":"\u767d\u94f6\u7ec4","lhrank":479,"lhscore":"4634"},{"_cls":"mfriendlist","headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/26230775a2f28191d1a4e661f7090bd1dfbd8740aea6084ce548a4436d48b5f0\/30","rid":"1547782","nickname":"X6","level":"70","barea":"61-70\u7ea7\u522b","marea":"B\u533a","lhsarea":"\u9ec4\u91d1\u7ec4","lhrank":303,"lhscore":"11443"}],"_cls":"getfriendmatch"}}

	/**
	 * 好友天梯信息
	 * @param user
	 * @return
	 */
	public static String rankGetfriendrank(User user) {
		return user.send(
			"&act=getlastfriendrank&ctl=match",
			null
		);
	}


	//public static const CLEAR_MATCHCD:Object = {ctl:"match", act:"clearmatchcd"};
	//MatchProxy.as: line 136: 	App.net.send(new HttpGetParams(PHPConsts.CLEAR_MATCHCD).getHttpString(), null, this.onClearCD, null, "default", "default", "default", RequestType.NORMAL, "default", "default", "default", "default", "default", this.clearCDCheck);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_match_err_matchCDtimecleared"}

	/**
	 * 清除天梯冷却
	 * @param user
	 * @return
	 */
	public static String clearMatchcd(User user) {
		return user.send(
			"&act=clearmatchcd&ctl=match",
			null
		);
	}


	//public static const TOP_MATCH_PLAYER:Object = {ctl:"match", act:"gettopsarearank"};
	//MatchProxy.as: line 354: 	App.net.send(new HttpGetParams(PHPConsts.TOP_MATCH_PLAYER).getHttpString(), null, this.setTopData).jumpOutOfQueue();
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_match_suc_getsarearankok","data":{
	//"mylasthour":{"_cls":"mylasthour","barea":"61-70\u7ea7\u522b","marea":"A\u533a","sarea":"\u9ed1\u77f3\u7ec4","rank":0,"score":0},"lasthourlist":[{"_cls":"lastlist","rank":1,"headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/292b3877d2cf7db20187af74839b8cd0d239c6eb3050c570deca843a1d943c09\/30","rid":1274524,"nickname":"%E6%89%80%E7%BE%85%E9%96%80%E7%9A%84%E7%99%BD%E5%85%94","score":"15978","level":"72"},{"_cls":"lastlist","rank":2,"headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/d8219673598dbd6f9eef8bdbb6acbdead0cd8b8c0f74b37250a6ebdf74083fbb\/30","rid":1321393,"nickname":"%E9%9D%9E.","score":"15977","level":"71"},{"_cls":"lastlist","rank":3,"headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/c3c8a59edd4f35dcf2d369a0c289fbf17e9e6badc5c000c794369a2ed0f68c55\/30","rid":1626033,"nickname":"%E6%9C%A8%E5%96%B5","score":"15917","level":"71"},{"_cls":"lastlist","rank":4,"headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/e9f38b63f90d11393ad107712073b2241342873813384d52\/30","rid":324570,"nickname":"%E3%83%AB%E3%82%AB-%E3%82%AB~%E2%98%86%20","score":"15887","level":"70"},{"_cls":"lastlist","rank":5,"headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/2ed71fc3734a421fd49b4fba7593e48cc70af3722653084af4e86881f5b92032\/30","rid":1465346,"nickname":"%E5%A4%A9%E5%B2%9A","score":"15435","level":"70"},{"_cls":"lastlist","rank":6,"headurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/d8219673598dbd6f601d3aad3a900e309e222e1be825b7fcccdbf2434d4b864f\/30","rid":214447,"nickname":"%EF%BF%A0%E7%A0%B4%E6%99%93%E2%99%82","score":"15357","level":"70"},{"_cls":"lastlist","rank":7,"headurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/7e23615195608a7d21cd8663179bccf24f66fab1848e9e6e9d97368cf1d11eab\/30","rid":200324,"nickname":"%E5%8D%83%E9%9F%B3","score":"15117","level":"71"},{"_cls":"lastlist","rank":8,"headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/d8219673598dbd6f1e2608dfda3db9e72a6488602559d85af35da0639dd74505\/30","rid":200595,"nickname":"%E9%98%BF%E7%94%98","score":"14994","level":"70"},{"_cls":"lastlist","rank":9,"headurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/d8219673598dbd6f497ac89ef210833b581a9e35a1a2305ccfc2b9f99f450133\/30","rid":200299,"nickname":"DCoquelicot","score":"14891","level":"71"},{"_cls":"lastlist","rank":10,"headurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/04a024c5447b334eb20d1cc53ac9313efe49966e46f494ca3ade77ca9b45d03c\/30","rid":226312,"nickname":"B%E8%90%8C%E8%90%8C%EF%BC%88%5B%E3%82%9D%CF%89%C2%B7%EF%BC%89~%E2%98%86","score":"14872","level":"70"}],"_cls":"getsarearank"}}

	/**
	 * 天梯排行
	 * @param user
	 * @return
	 */
	public static String topMatchPlayer(User user) {
		return user.send(
			"&act=gettopsarearank&ctl=match",
			null
		);
	}


	//public static const GET_ONLINE_AWARD:Object = {ctl:"operator", act:"getonlineaward"};
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_gam_err_onlinecfgnotexist"}

	/**
	 * 连续在线奖励
	 * @param user
	 * @return
	 */
	public static String getOnlineAward(User user) {
		return user.send(
			"&act=getonlineaward&ctl=operator",
			null
		);
	}


	//public static const GET_SLOGIN_AWARD:Object = {ctl:"operator", act:"getsloginaward"};
	//SignProxy.as: line 191: 	App.net.send(new HttpGetParams(PHPConsts.GET_SLOGIN_AWARD).getHttpString(), null, this.showSloginAward, null, "default", "default", "default", RequestType.NORMAL).dropPoint = new Point(450, 300);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getsloginawardok","change":{"_cls":"changeObj","role":{"805493":{"money":"7760476","techpoint":"2254658","sloginrecord":{"4":1},"renown":"270688"}},"rwarrior":null,"rwarriorskill":null,"rwarriorskillbuff":null,"rbagitem":null,"rbuild":null,"rquest":null,"rmap":null,"rwarriorinpub":null,"rwarriorgroup":null,"roperator":null}}

	/**
	 * 每日礼包
	 * @param user
	 * @return
	 */
	public static String getSloginAward(User user) {
		return user.send(
			"&act=getsloginaward&ctl=operator",
			null
		);
	}


	//public static const GET_SIGN_AWARD:Object = {ctl:"operator", act:"getsignaward"};
	//SignProxy.as: line 204: 	App.net.send(new HttpGetParams(PHPConsts.GET_SIGN_AWARD).getHttpString(), null, this.signRewardDataCompleteHandler, null, "default", "default", "default", RequestType.NORMAL).dropPoint = new Point(450, 300);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getsloginawardok","change":{"_cls":"changeObj","role":{"805493":{"totalsigntimes":1,"signrecord":{"4":1}}},"rwarrior":null,"rwarriorskill":null,"rwarriorskillbuff":null,"rbagitem":{"115377033":{"num":437}},"rbuild":null,"rquest":null,"rmap":null,"rwarriorinpub":null,"rwarriorgroup":null,"roperator":null},"data":{"awardcfgId":8,"_cls":"getSignnAward"}}

	/**
	 * 每日登陆
	 * @param user
	 * @return
	 */
	public static String getSignAward(User user) {
		return user.send(
			"&act=getsignaward&ctl=operator",
			null
		);
	}


	//public static const OPEN_SIGN_BOX:Object = {ctl:"operator", act:"opensignbox"};
	//{"rep":"object","_cls":"msg","msgident":"0003","msg":"_gam_err_signreqdaynotvalid"}

	/**
	 * 累计登陆礼盒
	 * TODO num ?need?
	 * @param user
	 * @param box
	 * @return
	 */
	public static String openSignBox(User user, int box) {
		return user.send(
			"&act=opensignbox&ctl=operator",
			"{\"num\":%d}",box
		);
	}


	//public static const BUY_SIGN:Object = {ctl:"operator", act:"buysign"};
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_buysignok","change":{"_cls":"changeObj","role":{"805493":{"gamepoint":"59","buysigntimes":"1","totalsigntimes":2,"canbuysigntimes":4,"signrecord":{"4":1,"1":2}}},"rwarrior":null,"rwarriorskill":null,"rwarriorskillbuff":null,"rbagitem":null,"rbuild":null,"rquest":null,"rmap":null,"rwarriorinpub":null,"rwarriorgroup":null,"roperator":null}}

	/**
	 * 补签
	 * @param user
	 * @return
	 */
	public static String buySign(User user) {
		return user.send(
			"&act=buysign&ctl=operator",
			null
		);
	}


	//public static const ATTENTION_QZONE:Object = {ctl:"operator", act:"attentionspace"};
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_isattentioned"}

	/**
	 * 无用
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String attentionQzone(User user) {
		return user.send(
			"&act=attentionspace&ctl=operator",
			null
		);
	}


	//public static const APRECIATE_FACEBOOK:Object = {ctl:"operator", act:"appreciate"};
	//AttentionOperator.as: line 24: 	App.net.send(new HttpGetParams(PHPConsts.APRECIATE_FACEBOOK).getHttpString(), null, this.complete);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_islistened"}

	/**
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String apreciateFacebook(User user) {
		return user.send(
			"&act=appreciate&ctl=operator",
			null
		);
	}


	//public static const ATTENTION_WEIBO:Object = {ctl:"operator", act:"listenweibo"};
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_islistened"}

	/**
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String attentionWeibo(User user) {
		return user.send(
			"&act=listenweibo&ctl=operator",
			null
		);
	}


	//public static const GET_SPACEWEIBO_AWARD:Object = {ctl:"operator", act:"getspaceweiboaward"};
	//ActivityProxy.as: line 305: 	App.net.send(new HttpGetParams(PHPConsts.GET_SPACEWEIBO_AWARD).getHttpString(), null, this.showAttentionReward, null, "default", "default", "default", RequestType.NORMAL).dropPoint = new Point(470, 300);
	//ActivityCenterProxy.as: line 290: 	App.net.send(new HttpGetParams(PHPConsts.GET_SPACEWEIBO_AWARD).getHttpString(), null, this.showAttentionReward, null, "default", "default", "default", RequestType.NORMAL).dropPoint = new Point(470, 300);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_gam_err_spaceweiboisaward"}

	/**
	 * 领取关注奖励
	 * @param user
	 * @return
	 */
	public static String getSpaceweiboAward(User user) {
		return user.send(
			"&act=getspaceweiboaward&ctl=operator",
			null
		);
	}


	//public static const GET_INVITE_AWARD:Object = {ctl:"operator", act:"getinviteaward"};
	//ActivityCenterProxy.as: line 260: 	App.net.send(new HttpGetParams(PHPConsts.GET_INVITE_AWARD).getHttpString(), _loc_3, this.showInviteReward, null, "default", "default", "default", RequestType.NORMAL).dropPoint = new Point(450, 300);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_gam_err_invitecfgnotexist"}

	/**
	 * 邀请奖励
	 * @deprecated
	 * @param user
	 * @param eventID
	 * @return
	 * TODO cause lock
	 */
	public static String getInviteAward(User user,int eventID) {
		return user.send(
			"&act=getinviteaward&ctl=operator",
			"{\"num\":%d}",eventID
		);
	}


	//public static const INVITE_FRIENDS:Object = {ctl:"operator", act:"invitefriend"};
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_gam_err_paramerr"}

	/**
	 * 邀请好友
	 * @param user
	 * @return
	 */
	public static String inviteFriends(User user,String uid) {
		return user.send(
			"&act=invitefriend&ctl=operator",
			"{\"openids\":\"%s\"}",uid
		);
	}


	//public static const INVITE_GETINVITEINIT:Object = {ctl:"operator", act:"getinviteInit"};
	//	null-====

	/**
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String inviteGetinviteinit(User user) {
		return user.send(
			"&act=getinviteInit&ctl=operator",
			null
		);
	}


	//public static const DAY_INVITE_FRIEND:Object = {ctl:"operator", act:"dayinvitefriend"};
	//MainUIManager.as: line 1229: 	App.net.send(new HttpGetParams(PHPConsts.DAY_INVITE_FRIEND).getHttpString(), {openids:_loc_2}, this.inviteComplete).jumpOutOfQueue();
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_gam_err_paramerr"}

	/**
	 * 每日邀请好友
	 * @param user
	 * @param openId
	 * @return
	 */
	public static String dayInviteFriend(User user,String openId) {
		return user.send(
			"&act=dayinvitefriend&ctl=operator",
			"{\"openids\":\"%s\"}",openId
		);
	}


	//public static const DAY_INVITE_REWARD:Object = {ctl:"operator", act:"getdayinviteaward"};
	//MainUIManager.as: line 1257: 	App.net.send(new HttpGetParams(PHPConsts.DAY_INVITE_REWARD).getHttpString(), {typeid:event.mainUIEventData}, this.getInviteGiftComplete).dropPoint = new Point(470, 400);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_gam_err_invitecfgnotexist"}

	/**
	 * 每日邀请好友奖励
	 * @param user
	 * @return
	 */
	public static String dayInviteReward(User user) {
		return user.send(
			"&act=getdayinviteaward&ctl=operator",
			"{\"typeid\":1}"
		);
	}


	//public static const GET_NEWS:Object = {ctl:"operator", act:"getnews"};
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getnewsok","data":
	//{"newsList":{"1":{"order":1,"content":"1111"},"2":{"order":2,"content":"2222"},"4":{"order":4,"content":"3333"},
	//"10":{"order":10,"content":"3333"}},"_cls":"getNews"}}

	/**
	 * 新闻
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String getNews(User user) {
		return user.send(
			"&act=getnews&ctl=operator",
			null
		);
	}


	//public static const SHARE_SPACEWEIBO:Object = {ctl:"operator", act:"sharespaceweibo"};
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_isshared"}

	/**
	 * 分享微博
	 * @param user
	 * @return
	 */
	public static String shareSpaceweibo(User user) {
		return user.send(
			"&act=sharespaceweibo&ctl=operator",
			null
		);
	}


	//public static const BUY_GOODS:Object = {ctl:"shop", act:"buygoods"};
	//Cost.as: line 331: 	App.net.send(new HttpGetParams(PHPConsts.BUY_GOODS).getHttpString(), _loc_6, null, null, "default", "default", "default", RequestType.NORMAL).dropPoint = new Point(470, 300);
	//Cost.as: line 335: 	App.net.send(new HttpGetParams(PHPConsts.BUY_GOODS).getHttpString(), _loc_6, buyItemParamFromJs, null, "default", "default", "default", RequestType.NORMAL);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_ser_err_mshopbuylackitem"}

	/**
	 * 商店购买
	 * TODO 尝试黄钻
	 * @param user
	 * @param goodId
	 * 	1	goodsid: 1	goodstype : 1	buytype: 1	award: 菊花宝典
		2	goodsid: 2	goodstype : 0	buytype: 1	award: 四级宝石箱子
		3	goodsid: 3	goodstype : 0	buytype: 1	award: 一级宝石箱子
		4	goodsid: 4	goodstype : 0	buytype: 1	award: 二级宝石箱子
		5	goodsid: 5	goodstype : 0	buytype: 1	award: 三级宝石箱子
		6	goodsid: 6	goodstype : 0	buytype: 1	award: 二级防御强化符
		7	goodsid: 7	goodstype : 0	buytype: 1	award: 二级力量强化符
		8	goodsid: 8	goodstype : 0	buytype: 1	award: 二级生命强化符
		9	goodsid: 9	goodstype : 0	buytype: 1	award: 二级内力强化符
		10	goodsid: 10	goodstype : 0	buytype: 1	award: 一级内力强化符
		11	goodsid: 11	goodstype : 0	buytype: 1	award: 一级防御强化符
		12	goodsid: 12	goodstype : 0	buytype: 1	award: 一级力量强化符
		13	goodsid: 13	goodstype : 0	buytype: 1	award: 一级生命强化符
		14	goodsid: 14	goodstype : 0	buytype: 1	award: 灵魂转换符
		15	goodsid: 15	goodstype : 0	buytype: 0	award: 合成幸运符
		16	goodsid: 16	goodstype : 1	buytype: 0	award: 幸运符X100
	 * @param goodType
	 * @param buyType
	 * @return
	 */
	public static String buyGoods(User user,int goodId, int goodType, int buyType) {
		return user.send(
			"&act=buygoods&ctl=shop",
			"{\"goodstype\":0,\"goodsid\":%d,\"buytype\":2}", goodType, goodId, buyType
		);
	}


	//public static const GET_SHOPINFO:Object = {ctl:"shop", act:"getshopinfo"};
	//BaseSNSAdapter.as: line 53: 	App.net.send(new HttpGetParams(PHPConsts.GET_SHOPINFO).getHttpString(), _loc_3, this.onUpdateBuyItemList, null, "default", "default", "default", RequestType.NORMAL);
	//ExternalInterfaceManager.as: line 47: 	App.net.send(new HttpGetParams(PHPConsts.GET_SHOPINFO).getHttpString(), _loc_3, onUpdateBuyItemList, null, "default", "default", "default", RequestType.NORMAL);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_notoken"}

	/**
	 * 完成购买
	 * @param user
	 * @param token
	 * @return
	 */
	public static String getShopinfo(User user,String token) {
		return user.send(
			"&act=getshopinfo&ctl=shop",
			"{\"token\":\"%s\"}", token
		);
	}


	//public static const GET_YELLOWVIPAWARD:Object = {ctl:"game", act:"getyellowvipaward"};
	//<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"><html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8" /><title> - </title><style>body {	font-size:76%;	font-family:"Lucida Grande", Verdana, Lucida, Arial, Helvetica, sans-serif;	background-color:#FEFEFE;	color:#333333;	margin:0;}a{color:#f60;}a:hover{text-decoration:none;}.dialogtitle {	margin-bottom:10px;	font-weight:bold;}.dialogContent {	padding:10px;}</style><link rel="stylesheet" href="style/dialog.css" /></head><body><div style="margin:100px auto;width:500px;"><table border="0" cellspacing="0" cellpadding="0" id="windowTable">	<tr>		<td colspan="2" class="td9TL"></td>		<td class="td9TC"></td>		<td colspan="2" class="td9TR"></td>	</tr>	<tr>		<td class="td9ML2"></td>		<td class="td9ML"></td>		<td class="td9MC" id="windowContent"><div>	<div class="dialogtitle"><div></div></div>    <div class="dialogContent">    	<div style="width:450px;">       	方法【getyellowvipaward】未定义，请联系网站管理员。<br />		<div align="center" style="margin-top:10px;">    <a href="javascript:history.back();"></a>		</div>    	</div>    </div></div>               </td>		<td class="td9MR"></td>		<td class="td9MR2"></td>	</tr>	<tr>		<td colspan="2" class="td9BL"></td>		<td class="td9BC"></td>		<td colspan="2" class="td9BR"></td>	</tr></table></div></body></html>

	/**
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String getYellowvipaward(User user) {
		return user.send(
			"&act=getyellowvipaward&ctl=game",
			null
		);
	}


	//public static const SEND_YELLOWVIPAWARD:Object = {ctl:"operator", act:"sendyellowvipaward"};
	//ActivityProxy.as: line 237: 	App.net.send(new HttpGetParams(PHPConsts.SEND_YELLOWVIPAWARD).getHttpString(), _loc_2, this.getGiftCompleteFromPhp, null, "default", "default", "default", RequestType.NORMAL).dropPoint = new Point(480, 300);
	//ActivityCenterProxy.as: line 174: 	App.net.send(new HttpGetParams(PHPConsts.SEND_YELLOWVIPAWARD).getHttpString(), _loc_2, this.getGiftCompleteFromPhp, null, "default", "default", "default", RequestType.NORMAL).dropPoint = new Point(480, 300);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_rawdataerr"}

	/**
	 * 领取黄钻奖励
	 * @param user
	 * @param type
	 * TODO check type
	 * @return
	 */
	public static String sendYellowvipaward(User user,int type) {
		return user.send(
			"&act=sendyellowvipaward&ctl=operator",
			"{\"type\":%d}",type
		);
	}


	//public static const PANDA_YELLOWYEAR:Object = {ctl:"shop", act:"getoptoken"};
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getoperatortokenok",
	//"data":{"actid":"UM121227132754657","mid":"1",
	//"token":"4021A324754CCD7EA01836261D0AFF7207622","_cls":"getOperatorToken"}}

	/**
	 * 冲黄钻送熊猫
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String pandaYellowyear(User user) {
		return user.send(
			"&act=getoptoken&ctl=shop",
			null
		);
	}


	//public static const PANDA_GETINFO:Object = {ctl:"shop", act:"getopinfo"};
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_notoken"}

	/**
	 * 黄钻熊猫
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String pandaGetinfo(User user) {
		return user.send(
			"&act=getopinfo&ctl=shop",
			null
		);
	}


	//public static const NEW_YEAR:Object = {ctl:"operator", act:"newyearbless"};
	//ActivityCenterProxy.as: line 352: 	App.net.send(new HttpGetParams(PHPConsts.NEW_YEAR).getHttpString(), null).dropPoint = new Point(597, 441);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_operator_err_cantbless"}

	/**
	 * 新年祝福
	 * @param user
	 * @return
	 */
	public static String newYear(User user) {
		return user.send(
			"&act=newyearbless&ctl=operator",
			null
		);
	}


	//public static const LION_DANCEINFO:Object = {ctl:"lion", act:"getliondance"};
	//YuanxiaoItem.as: line 182: 	App.net.send(new HttpGetParams(PHPConsts.LION_DANCEINFO).getHttpString(), null, this.loadComplete);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getliondanceinfook","data":
	//{"liondanceInfo":{"_cls":"liondanceVo","nowstamina":0,"totalstamina":3000000,"stat":3,"breaktime":1363532824,"loop":10},"rliondanceInfo":{"_cls":"rliondanceVo","repairexptime_1":0,"repairexptime_2":0,"repairexptime_3":0,"totalcontripoint":0,"nowcontripoint":0,"nowdancetimes":0,"lastcontripoint":0,"lastdancetimes":0,"maxdancetimes":"99999","endtime":1405873855,"lanternfestivalstatus":1},"lionrankList":[{"_cls":"lionrankVo","rid":342008,"level":"66","intgender":1,"tinyurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/02421c7a7300de78804bf2f3c234156860d1d3f9cb6ee127b84c4d28d0cf1f89\/30","nickname":"%CE%B6%DE%93%DE%87%DE%87%DE%87.%EF%BC%A4","contripoint":"125572","rank":1},{"_cls":"lionrankVo","rid":201633,"level":"70","intgender":0,"tinyurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/98bd624e95e0910faa167894a68a8d13dc1698dd02401bbea460495f2f86f057\/30","nickname":"%E5%BD%A9%E9%9D%99","contripoint":"60563","rank":2},{"_cls":"lionrankVo","rid":450915,"level":"70","intgender":0,"tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/95dac2d0238d3f7b5dfefcb936dccd5c0d4d38e55e0e4b829286e3a8de2cbf5f\/30","nickname":"Elizabeth","contripoint":"41748","rank":3},{"_cls":"lionrankVo","rid":200901,"level":"53","intgender":1,"tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/72a0df78bf8c85f243da4a6c003023960eb1ba1ebe5465be3b1421af52313dd3\/30","nickname":"%E5%B9%BB%E6%B5%B7%E4%B9%8B%E6%AD%8C","contripoint":"2187","rank":50}],"lionrankInfo":{"_cls":"lionrankVo","rid":"805493","level":"62","intgender":1,"tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/a77546418354b602972ff24e401e695c845bf6a505f47f5ca4267d6cb2d76347\/30","nickname":"Ming","contripoint":0,"rank":0},"_cls":"getLiondanceInfo"}}

	/**
	 * 舞狮活动
	 * @param user
	 * @return
	 */
	public static String lionDanceinfo(User user) {
		return user.send(
			"&act=getliondance&ctl=lion",
			null
		);
	}


	//public static const FIX_LION:Object = {ctl:"lion", act:"repairlion"};
	//YuanxiaoItem.as: line 206: 	App.net.send(new HttpGetParams(PHPConsts.FIX_LION).getHttpString(), {type:1}, this.fixComplete, null, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.checkFixLion, [1]).dropPoint = localToGlobal(new Point(this._btnGeneral.x, this._btnGeneral.y));
	//YuanxiaoItem.as: line 219: 	App.net.send(new HttpGetParams(PHPConsts.FIX_LION).getHttpString(), {type:2}, this.fixComplete, null, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.checkFixLion, [2]).dropPoint = localToGlobal(new Point(this._btnHard.x, this._btnHard.y));
	//YuanxiaoItem.as: line 256: 	App.net.send(new HttpGetParams(PHPConsts.FIX_LION).getHttpString(), {type:3, num:param1}, this.fixComplete, null, "default", "default", "default", 0, "default", "default", "default", "default", "default", null, null).dropPoint = localToGlobal(new Point(this._btnExtremely.x, this._btnExtremely.y));
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_gam_err_repairtypenotexist"}

	/**
	 * 舞狮活动. 修复
	 * @param user
	 * @param type
	 * 1 普通  2 加强  3 高级
	 * @return
	 */
	public static String fixLion(User user, int type ) {
		return user.send(
			"&act=repairlion&ctl=lion",
			"{\"type\":%d}",type
		);
	}


	//public static const PLAY_LION:Object = {ctl:"lion", act:"liondance"};
	//YuanxiaoItem.as: line 324: 	App.net.send(new HttpGetParams(PHPConsts.PLAY_LION).getHttpString(), {num:param1}, this.playComplete, null, "default", "default", "default", 0, "default", "default", "default", "default", "default");
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_gam_err_dancetimeserr"}

	/**
	 * 舞狮 . 跳舞
	 * @param user
	 * @return
	 */
	public static String playLion(User user) {
		return user.send(
			"&act=liondance&ctl=lion",
			null
		);
	}


	//public static const REPLACE_LION:Object = {ctl:"lion", act:"remedialdance"};
	//YuanxiaoItem.as: line 420: 	App.net.send(new HttpGetParams(PHPConsts.REPLACE_LION).getHttpString(), {num:param1}, this.replaceComplete, null, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.checkReplaceNum);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_gam_err_dancetimeserr"}

	/**
	 * 舞狮 替换
	 * @param user
	 * @return
	 */
	public static String replaceLion(User user) {
		return user.send(
			"&act=remedialdance&ctl=lion",
			null
		);
	}


	//public static const HANDED_MALLET:Object = {ctl:"lion", act:"handupmallet"};
	//YuanxiaoItem.as: line 333: 	App.net.send(new HttpGetParams(PHPConsts.HANDED_MALLET).getHttpString(), null, this.handedComplete, null, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.malletCheck);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_gam_err_operatorisclose"}

	/**
	 * 舞狮
	 * @param user
	 * @return
	 */
	public static String handedMallet(User user) {
		return user.send(
			"&act=handupmallet&ctl=lion",
			null
		);
	}


	//public static const LION_RANK:Object = {ctl:"lion", act:"getrank"};
	//YuanxiaoItem.as: line 502: 	App.net.send(new HttpGetParams(PHPConsts.LION_RANK).getHttpString(), null, this.rankComplete);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getlionrankinfook","data":
	//{"lionrankList":[{"_cls":"lionrankVo","rid":342008,"level":"66","intgender":1,"tinyurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/02421c7a7300de78804bf2f3c234156860d1d3f9cb6ee127b84c4d28d0cf1f89\/30","nickname":"%CE%B6%DE%93%DE%87%DE%87%DE%87.%EF%BC%A4","contripoint":"125572","rank":1},{"_cls":"lionrankVo","rid":201633,"level":"70","intgender":0,"tinyurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/98bd624e95e0910faa167894a68a8d13dc1698dd02401bbea460495f2f86f057\/30","nickname":"%E5%BD%A9%E9%9D%99","contripoint":"60563","rank":2},{"_cls":"lionrankVo","rid":450915,"level":"70","intgender":0,"tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/95dac2d0238d3f7b5dfefcb936dccd5c0d4d38e55e0e4b829286e3a8de2cbf5f\/30","nickname":"Elizabeth","contripoint":"41748","rank":3},{"_cls":"lionrankVo","rid":316455,"level":"68","intgender":1,"tinyurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/a5f4ad537cfaea41eadca789138fdd8fde060cf159b9291b\/30","nickname":"Ray","contripoint":"29004","rank":4},{"_cls":"lionrankVo","rid":200486,"level":"64","intgender":0,"tinyurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/95dac2d0238d3f7b3a38b46d07c424fe5cdf7de7e044dc54213426355b17bf1b\/30","nickname":"%E5%B9%BD%E5%B9%BD%E9%B1%BC","contripoint":"26970","rank":5},{"_cls":"lionrankVo","rid":295676,"level":"70","intgender":0,"tinyurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/a9791e2372158533c273cacd636cce7728288fdef4ece3e28e15e5a4fcdc303b\/30","nickname":"%E5%81%9A%E5%9B%9E%E8%87%AA%E5%B7%B1","contripoint":"26573","rank":6},{"_cls":"lionrankVo","rid":680318,"level":"61","intgender":1,"tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/d8219673598dbd6f44627f18718959607bc3f695c21b47cd6a306e7ab43b3f61\/30","nickname":"%E6%98%93%E5%A4%A9%E6%A2%B5","contripoint":"25271","rank":7},{"_cls":"lionrankVo","rid":350502,"level":"66","intgender":0,"tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/c0ec4a6dd92885857926a131e249bd9baa989c33626217866d89e3c8c2b80362\/30","nickname":"%E5%A4%A7%E5%90%9B%EF%BC%8C","contripoint":"25149","rank":8},{"_cls":"lionrankVo","rid":634537,"level":"70","intgender":0,"tinyurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/d8219673598dbd6fb91e97027c24b61e366c775f6d71b65ebe768ef779a92938\/30","nickname":"%E3%81%83%E7%84%B1%E3%81%A4","contripoint":"25106","rank":9},{"_cls":"lionrankVo","rid":443861,"level":"70","intgender":0,"tinyurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/d8219673598dbd6f368be8d4c2071470a5a73fdbf83e120c8dbc04db42632fb2\/30","nickname":"%E6%B5%81%E5%85%89%E9%A3%9E%E9%80%9D","contripoint":"24802","rank":10},{"_cls":"lionrankVo","rid":314817,"level":"60","intgender":0,"tinyurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/13675a92aec0dfe2757e486a0bde4d6759ab4c4c5a983346076bd795d80bc58f\/30","nickname":"%E6%B3%A8%E5%AE%9A%E6%98%AF%E6%82%B2%E5%89%A7","contripoint":"23569","rank":11},{"_cls":"lionrankVo","rid":220926,"level":"70","intgender":0,"tinyurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/5506a0965719fa6cf9899e87785f2bd7872fcec1c7e1e8a09ca1e347ffe85494\/30","nickname":"%E7%B4%AB%E9%9C%9E","contripoint":"14869","rank":12},{"_cls":"lionrankVo","rid":200397,"level":"70","intgender":0,"tinyurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/95dac2d0238d3f7b90ba146568d2b24e58b3f708048426a16d7fbe0781731e12\/30","nickname":"%E8%BD%BB%E6%AD%8C","contripoint":"13131","rank":13},{"_cls":"lionrankVo","rid":200299,"level":"71","intgender":0,"tinyurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/d8219673598dbd6f497ac89ef210833b581a9e35a1a2305ccfc2b9f99f450133\/30","nickname":"DCoquelicot","contripoint":"12710","rank":14},{"_cls":"lionrankVo","rid":239811,"level":"70","intgender":0,"tinyurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/a9791e2372158533226b77533c5c0c802ae800c7b72dcf8b695d6bea1a5ab0aa\/30","nickname":".%20%E2%95%AC%E5%B9%B8%E7%A6%8F%E8%B5%B7%E9%BB%9E%E5%9C%A8%E6%AD%A4%E2%95%9C%E2%95%AF%E3%80%81%20%20","contripoint":"10771","rank":15},{"_cls":"lionrankVo","rid":306050,"level":"67","intgender":1,"tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/498fe6b75281db14063f0795a8e0e0cef37aaedb4afa23dfb23ddf0ed3599c82\/30","nickname":"%E8%B0%A2%E8%B0%A2%E4%BD%A0%E7%9A%84%E4%BB%8E%E5%89%8D%E3%80%81","contripoint":"9695","rank":16},{"_cls":"lionrankVo","rid":214685,"level":"70","intgender":0,"tinyurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/59bb13cedfb74079a77daad0c6aab43364169f17d958866a93ea816341588266\/30","nickname":"%E6%B5%81%E5%85%89%E5%89%AA%E5%BD%B1","contripoint":"9118","rank":17},{"_cls":"lionrankVo","rid":564428,"level":"70","intgender":0,"tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/36b63235a3d985e5a5451753b3a799dd4c1bdee6e27bdabdfab8cf106b380e52\/30","nickname":"Caster","contripoint":"9104","rank":18},{"_cls":"lionrankVo","rid":354152,"level":"60","intgender":1,"tinyurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/31943909f1b08cad9d72a2845362cae7dc3605407c4366c756ca5cedfe8b2dee\/30","nickname":"_.%E4%BD%8E%E8%B0%83%E2%80%A6","contripoint":"9064","rank":19},{"_cls":"lionrankVo","rid":367805,"level":"60","intgender":0,"tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/70fb95bc2540bb915cbcb7ae2f7bff692dec8f9c368eb1cf4497bb4a78a87bd9\/30","nickname":"%E8%A5%BF%E4%BC%AF%E5%88%A9%E4%BA%9A%E3%81%AE%E5%A4%A7%E5%91%9C%E5%96%B5","contripoint":"9043","rank":20},{"_cls":"lionrankVo","rid":626209,"level":"70","intgender":1,"tinyurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/e9448680db830fdea5beb6c07e162cc5c7dcedc1c8ab1898e6de798dd89dd3e2\/30","nickname":"%20%E7%A8%8B%E6%9B%A6","contripoint":"8422","rank":21},{"_cls":"lionrankVo","rid":238997,"level":"70","intgender":0,"tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/e3e6b4bc45ca4d198484f407fe2f384ea7de61366856023acd23d702922003ab\/30","nickname":"%E4%BE%91","contripoint":"8162","rank":22},{"_cls":"lionrankVo","rid":370313,"level":"66","intgender":1,"tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/d8219673598dbd6fe23df9197a2260bf1e653fab1be4b5cf0391de7dc4a1783a\/30","nickname":"%E5%BE%81%EF%BD%9E%EF%BD%9E%EF%BD%9E","contripoint":"7190","rank":23},{"_cls":"lionrankVo","rid":332081,"level":"60","intgender":0,"tinyurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/d8219673598dbd6f6e4a85881a7b5473822ce953f8e8b6b4fdd752e027a6d4fa\/30","nickname":"%20%E7%9F%BF%E9%B8%9F","contripoint":"7184","rank":24},{"_cls":"lionrankVo","rid":312801,"level":"70","intgender":0,"tinyurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/d8219673598dbd6f343724943912206f2e805b6a3f9f01514ac7e6fe52cb2d9a\/30","nickname":"drowsm","contripoint":"7101","rank":25},{"_cls":"lionrankVo","rid":200302,"level":"70","intgender":0,"tinyurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/1d94aa47750d474793ad38903f368a5b3b68662e45ba6bcf8b0ba6684ba0a021\/30","nickname":"%E6%81%8B%E4%B8%B6%E6%B2%99%E8%80%B6","contripoint":"7013","rank":26},{"_cls":"lionrankVo","rid":292765,"level":"61","intgender":1,"tinyurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/660fc3a9b572a9292ff1dc469e47f924ff91efea576590603e81e626157281e7\/30","nickname":"10.16%E2%95%AD%E3%82%A1%EF%B9%96","contripoint":"7005","rank":27},{"_cls":"lionrankVo","rid":333587,"level":"69","intgender":0,"tinyurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/3b9a4bbcdd70c703d29795bc7046a18616a610d94b5fed16f55d8e98dd92cc02\/30","nickname":"%E3%83%A4wo%E7%81%AC","contripoint":"6967","rank":28},{"_cls":"lionrankVo","rid":324570,"level":"70","intgender":0,"tinyurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/e9f38b63f90d11393ad107712073b2241342873813384d52\/30","nickname":"%E3%83%AB%E3%82%AB-%E3%82%AB~%E2%98%86%20","contripoint":"6938","rank":29},{"_cls":"lionrankVo","rid":200324,"level":"71","intgender":0,"tinyurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/7e23615195608a7d21cd8663179bccf24f66fab1848e9e6e9d97368cf1d11eab\/30","nickname":"%E5%8D%83%E9%9F%B3","contripoint":"6870","rank":30},{"_cls":"lionrankVo","rid":202879,"level":"70","intgender":0,"tinyurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/d8219673598dbd6f923149ae537d2b8f10ac49571dc965763406a17a8d4a4a92\/30","nickname":"%E3%83%AC%E3%83%B3%E3%83%A1%E3%82%A4%E3%82%AB","contripoint":"6480","rank":31},{"_cls":"lionrankVo","rid":386678,"level":"70","intgender":0,"tinyurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/8742d6cd742bfcfbe31cbfda9156edacc2adee0c17a0bff51dcf8b09f473497a\/30","nickname":"%E5%AE%89%E7%84%B6%E8%87%AA%E8%8B%A5","contripoint":"6397","rank":32},{"_cls":"lionrankVo","rid":426014,"level":"60","intgender":0,"tinyurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/d47345cf8aa3c8490d3ff5fe0ad179f3e3d260f9770be2a24f080232cc206f3a\/30","nickname":"%E6%9C%88%E7%BC%BA%E6%9C%89%E6%86%BE","contripoint":"5392","rank":33},{"_cls":"lionrankVo","rid":621519,"level":"63","intgender":0,"tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/a3b4f421c655798a732cc02b5fe137defc56c965fec1539f92bfcd1e4d2999c3\/30","nickname":"Love%20you%20never%20change","contripoint":"4180","rank":34},{"_cls":"lionrankVo","rid":282413,"level":"70","intgender":1,"tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/d8219673598dbd6fab1b89adc12bfffdcc116693c943816a21ea8edb356d1c85\/30","nickname":"%20VENT%22","contripoint":"3930","rank":35},{"_cls":"lionrankVo","rid":233595,"level":"70","intgender":0,"tinyurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/786c4e691e25555249d3c1af49fc502fb27f30632ab35fc6e47dc8f98efaddde\/30","nickname":"The%20fallen%20devil","contripoint":"3453","rank":36},{"_cls":"lionrankVo","rid":250164,"level":"70","intgender":0,"tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/a9791e2372158533b6f767c5d880304e23977a8aa4c70f7a858a3d3a26c5341a\/30","nickname":"%E5%88%B0%E5%88%B0","contripoint":"3020","rank":37},{"_cls":"lionrankVo","rid":202547,"level":"70","intgender":0,"tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/63536c60195e770712a845b8875ffe98f6391384d0158e84e1b67b9216385a6f\/30","nickname":"%E5%86%B7%E6%9C%88%E4%B9%8B%E5%B7%85","contripoint":"2961","rank":38},{"_cls":"lionrankVo","rid":569979,"level":"66","intgender":1,"tinyurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/d8219673598dbd6fa9d360656a7aeaedeb49a542e8823b7d2767e6e2b4bf1226\/30","nickname":"HATA","contripoint":"2956","rank":39},{"_cls":"lionrankVo","rid":201387,"level":"70","intgender":1,"tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/d8219673598dbd6f38a09ebc235543e3d77e7b52184684f4ac9dd2165f6eb135\/30","nickname":"%E6%88%91%E7%9A%84%E5%82%BB%E7%93%9C","contripoint":"2808","rank":40},{"_cls":"lionrankVo","rid":559160,"level":"60","intgender":1,"tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/c3c8a59edd4f35dc93919685923831df6eedf150910f146b37323636ce969f65\/30","nickname":"%E5%8F%A4%E6%9C%88%E8%BD%A9%E8%BE%95","contripoint":"2771","rank":41},{"_cls":"lionrankVo","rid":213481,"level":"70","intgender":1,"tinyurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/c3c8a59edd4f35dc7493e42493382135542dcadccb50d59e0f6054b46d328885\/30","nickname":"%E2%98%85-%E9%93%AD","contripoint":"2694","rank":42},{"_cls":"lionrankVo","rid":428492,"level":"60","intgender":0,"tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/43a357988b13b4b8ae9ac2cfa10f1ed067697933effed3b7108d0c4fc69f75ac\/30","nickname":"%20%20%20%20%20%20%20%20%20%20%20%20%E2%9D%80.%CE%B9","contripoint":"2549","rank":43},{"_cls":"lionrankVo","rid":380957,"level":"50","intgender":1,"tinyurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/06d264c84a243d465b3516818d312925987950715935854580532ca6ddd5966e\/30","nickname":"%20%20%E5%A4%A7%E4%B8%96%E7%95%8C%E3%80%82","contripoint":"2515","rank":44},{"_cls":"lionrankVo","rid":611469,"level":"58","intgender":1,"tinyurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/d8219673598dbd6f715bc1a66615bead4cc6f0cf1b09553a4a71c7845fb6c3d4\/30","nickname":"%D0%9Eo","contripoint":"2271","rank":45},{"_cls":"lionrankVo","rid":217012,"level":"48","intgender":1,"tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/b199772f2370c2473d416100e33e3977de557ab7d19e86b1c96d54a58eab97c7\/30","nickname":"aoisfnoasfnas","contripoint":"2269","rank":46},{"_cls":"lionrankVo","rid":210664,"level":"36","intgender":1,"tinyurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/f222d66b3573371216472f9fd4ada5319cb1986423e2477cb9a07a6ada9327bc\/30","nickname":"_%E6%89%80%E8%B0%93d%C4%9B%E5%A4%A8%E7%9C%A0%CB%8B%E7%B4%94%E5%B1%9E%E6%84%8F%E8%BF%AF%EF%BF%A3","contripoint":"2268","rank":47},{"_cls":"lionrankVo","rid":202021,"level":"58","intgender":1,"tinyurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/f9568e1674a2b91338a97d73b7fbd8340eced03e699d8488f29bf6ef50626fce\/30","nickname":"%E4%BE%A0%E7%89%A9%E8%AF%AD%E5%B0%8F%E5%8F%B73","contripoint":"2238","rank":48},{"_cls":"lionrankVo","rid":217058,"level":"49","intgender":1,"tinyurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/14ad6cd87eabd671217ec28f39e725096c5dcaf3ec16bb08b2a300c1c1339d5a\/30","nickname":"%E7%9A%84%E8%AF%B4%E6%B3%95%E6%92%92%E6%97%A6%E6%B3%95","contripoint":"2211","rank":49},{"_cls":"lionrankVo","rid":200901,"level":"53","intgender":1,"tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/72a0df78bf8c85f243da4a6c003023960eb1ba1ebe5465be3b1421af52313dd3\/30","nickname":"%E5%B9%BB%E6%B5%B7%E4%B9%8B%E6%AD%8C","contripoint":"2187","rank":50}],"lionrankInfo":{"_cls":"lionrankVo","rid":"805493","level":"62","intgender":1,"tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/a77546418354b602972ff24e401e695c845bf6a505f47f5ca4267d6cb2d76347\/30","nickname":"Ming","contripoint":0,"rank":0},"_cls":"getLionrankInfo"}}

	/**
	 * 舞狮排行
	 * @param user
	 * @return
	 */
	public static String lionRank(User user) {
		return user.send(
			"&act=getrank&ctl=lion",
			null
		);
	}


	//public static const SHARE_LION:Object = {ctl:"lion", act:"share"};
	//ActivityCenterProxy.as: line 361: 	App.net.send(new HttpGetParams(PHPConsts.SHARE_LION).getHttpString(), null).dropPoint = new Point(597, 444);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_cantshare"}

	/**
	 * 舞狮 分享
	 * @param user
	 * @return
	 */
	public static String shareLion(User user) {
		return user.send(
			"&act=share&ctl=lion",
			null
		);
	}


	//public static const SLOT_DATA:Object = {ctl:"operator", act:"getlottery"};
	//Slot.as: line 144: 	App.net.send(new HttpGetParams(PHPConsts.SLOT_DATA).getHttpString(), null, this.loadComplete);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_operator_err_lotterydisabled"}

	/**
	 * 彩票
	 * @param user
	 * @return
	 */
	public static String slotData(User user) {
		return user.send(
			"&act=getlottery&ctl=operator",
			null
		);
	}


	//public static const SLOT_LOTTERY:Object = {ctl:"operator", act:"lottery"};
	//Slot.as: line 181: 	App.net.send(new HttpGetParams(PHPConsts.SLOT_LOTTERY).getHttpString(), {type:"batch"}, this.batchCommit, null, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.batchDouble);
	//Slot.as: line 256: 	App.net.send(new HttpGetParams(PHPConsts.SLOT_LOTTERY).getHttpString(), {type:"single"}, this.commit);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_operator_err_lotterydisabled"}

	/**
	 * 彩票
	 * @param user
	 * @return
	 */
	public static String slotLottery(User user) {
		return user.send(
			"&act=lottery&ctl=operator",
			null
		);
	}


	//public static const YELLOW_BUY:Object = {ctl:"operator", act:"getyellowshop"};
	//YellowBuyItem.as: line 193: 	App.net.send(new HttpGetParams(PHPConsts.YELLOW_BUY).getHttpString(), null, this.loadComplete);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getyellowshopok","data":{"yellowshopcanbuy":1,"yellowshoptodaycfgInfo":{"_cls":"yellowshopCfg","cfgid":7,"name":"\u4e8c\u7ea7\u5b9d\u77f3\u7bb1","icon":"assets\/icons\/seeditems\/351-3.png","price":160,"yellow_price":100,"real_price":80,"awardcfgList":[{"_cls":"showItem","type":"item","cfgid":206,"num":1,"sub":"0"}]},"yellowshoptomorrowcfgInfo":{"_cls":"yellowshopCfg","cfgid":1,"name":"\u56db\u7ea7\u58f0\u671b\u5361","icon":"assets\/icons\/seeditems\/351-3.png","price":250,"yellow_price":60,"real_price":48,"awardcfgList":[{"_cls":"showItem","type":"item","cfgid":203,"num":1,"sub":"0"}]},"_cls":"getyellowshopInfo"}}

	/**
	 * 黄钻购买信息
	 * {
			data={
				yellowshopcanbuy=1,
				yellowshoptodaycfgInfo={
					name=二级宝石箱,
					cfgid=7,
					awardcfgList=[],
					yellow_price=100
				},
				yellowshoptomorrowcfgInfo={
					price=250,
					name=四级声望卡,
					real_price=48,
					cfgid=1,
					yellow_price=60
				}
			},
		}
	 * @param user
	 * @return
	 */
	public static String yellowBuy(User user) {
		return user.send(
			"&act=getyellowshop&ctl=operator",
			null
		);
	}


	//public static const ACTIVITY_LIST:Object = {ctl:"operator", act:"getactivity"};
	//BBSItem.as: line 52: 	App.net.send(new HttpGetParams(PHPConsts.ACTIVITY_LIST).getHttpString(), null, this.loadComplete);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getactivityok","data":{"activityList":[],"_cls":"getActivityInfo"}}

	/**
	 * 获取活动列表
	 * @param user
	 * @return
	 */
	public static String activityList(User user) {
		return user.send(
			"&act=getactivity&ctl=operator",
			null
		);
	}


	//public static const LEVEL_SPECIAL_RECORD:Object = {ctl:"operator", act:"addlevelspecialbuytime"};
	//LevelSpecialBuyProxy.as: line 64: 	App.net.send(new HttpGetParams(PHPConsts.LEVEL_SPECIAL_RECORD).getHttpString(), {level:param1}, null).jumpOutOfQueue();
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_levelerr"}

	/**
	 * 检查特价礼包是否过期
	 * @param user
	 * @param level
	 * 10 15 20
	 * @return
	 */
	public static String levelSpecialRecord(User user, int level) {
		return user.send(
			"&act=addlevelspecialbuytime&ctl=operator",
			"{\"level\":%d}",level
		);
	}


	//public static const YELLOW_GIFT:Object = {ctl:"operator", act:"openyellowvip"};
	//GreatYellowPanel.as: line 51: 	App.net.send(new HttpGetParams(PHPConsts.YELLOW_GIFT).getHttpString(), null, this.loadComplete);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_gettokenerr"}

	/**
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String yellowGift(User user) {
		return user.send(
			"&act=openyellowvip&ctl=operator",
			null
		);
	}


	//public static const GREAT_YELLOW:Object = {ctl:"operator", act:"getyellowvip"};
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_activitynotgotaward"}

	/**
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String greatYellow(User user) {
		return user.send(
			"&act=getyellowvip&ctl=operator",
			null
		);
	}


	//public static const GREAT_INFO:Object = {ctl:"operator", act:"getyellowopen"};
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getyvok"}

	/**
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String greatInfo(User user) {
		return user.send(
			"&act=getyellowopen&ctl=operator",
			null
		);
	}


	//public static const FUNDS_INFO:Object = {ctl:"operator", act:"getsmallfund"};
	//FundsItem.as: line 88: 	App.net.send(new HttpGetParams(PHPConsts.FUNDS_INFO).getHttpString(), null, this.loadComplete);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getsmallfundok","data":{"smallfundinfo":{"_cls":"smallfundInfo","buyid":"buyid","ripedays":[],"ripedate":[],"isover":"0","getids":[]},"smallfundcfg":[{"_cls":"smallfundCfg","id":1,"arrDayAward":[[{"_cls":"showItem","type":"techpoint","cfgid":0,"num":20000,"sub":"0"}],[{"_cls":"showItem","type":"techpoint","cfgid":0,"num":20000,"sub":"0"}],[{"_cls":"showItem","type":"techpoint","cfgid":0,"num":20000,"sub":"0"}],[{"_cls":"showItem","type":"techpoint","cfgid":0,"num":20000,"sub":"0"}],[{"_cls":"showItem","type":"techpoint","cfgid":0,"num":20000,"sub":"0"}]],"arrYellowExtraAward":[],"arrBuyreq":[{"_cls":"showItem","type":"money","cfgid":0,"num":500000,"sub":1}],"canbuy":1,"totalvalue":400,"totalvalue2":[{"_cls":"showItem","type":"techpoint","cfgid":0,"num":100000,"sub":"0"}],"buyenddate":"2014-07-21 23:59:00","startripedate":"2014-07-22 00:00:00","endripedate":"2014-07-26 23:59:00"},{"_cls":"smallfundCfg","id":2,"arrDayAward":[[{"_cls":"showItem","type":"techpoint","cfgid":0,"num":80000,"sub":"0"}],[{"_cls":"showItem","type":"techpoint","cfgid":0,"num":80000,"sub":"0"}],[{"_cls":"showItem","type":"techpoint","cfgid":0,"num":80000,"sub":"0"}],[{"_cls":"showItem","type":"techpoint","cfgid":0,"num":80000,"sub":"0"}],[{"_cls":"showItem","type":"techpoint","cfgid":0,"num":80000,"sub":"0"}]],"arrYellowExtraAward":[],"arrBuyreq":[{"_cls":"showItem","type":"gamepoint","cfgid":0,"num":400,"sub":0}],"canbuy":1,"totalvalue":1600,"totalvalue2":[{"_cls":"showItem","type":"techpoint","cfgid":0,"num":400000,"sub":"0"}],"buyenddate":"2014-07-21 23:59:00","startripedate":"2014-07-22 00:00:00","endripedate":"2014-07-26 23:59:00"},{"_cls":"smallfundCfg","id":3,"arrDayAward":[[{"_cls":"showItem","type":"techpoint","cfgid":0,"num":200000,"sub":"0"}],[{"_cls":"showItem","type":"techpoint","cfgid":0,"num":200000,"sub":"0"}],[{"_cls":"showItem","type":"techpoint","cfgid":0,"num":200000,"sub":"0"}],[{"_cls":"showItem","type":"techpoint","cfgid":0,"num":200000,"sub":"0"}],[{"_cls":"showItem","type":"techpoint","cfgid":0,"num":200000,"sub":"0"}]],"arrYellowExtraAward":[],"arrBuyreq":[{"_cls":"showItem","type":"gamepoint","cfgid":0,"num":1000,"sub":0}],"canbuy":1,"totalvalue":4000,"totalvalue2":[{"_cls":"showItem","type":"techpoint","cfgid":0,"num":1000000,"sub":"0"}],"buyenddate":"2014-07-21 23:59:00","startripedate":"2014-07-22 00:00:00","endripedate":"2014-07-26 23:59:00"}]}}

	/**
	 * 种植活动配置
	 * @param user
	 * @return
	 */
	public static String fundsInfo(User user) {
		return user.send(
			"&act=getsmallfund&ctl=operator",
			null
		);
	}


	//public static const FUNDS_BUY:Object = {ctl:"operator", act:"buysmallfund"};
	//ActivityCenterProxy.as: line 135: 	App.net.send(new HttpGetParams(PHPConsts.FUNDS_BUY).getHttpString(), {buyid:_loc_2}, this.fundsBuyComplete);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_buyiderr"}

	/**
	 * 购买种植活动
	 * @param user
	 * @param type
	 *  1  2  3
	 * @return
	 */
	public static String fundsBuy(User user, int type) {
		return user.send(
			"&act=buysmallfund&ctl=operator",
			"{\"buyid\":%d}", type
		);
	}


	//public static const FUNDS_GAIN:Object = {ctl:"operator", act:"getsmallfundaward"};
	//ActivityCenterProxy.as: line 128: 	App.net.send(new HttpGetParams(PHPConsts.FUNDS_GAIN).getHttpString(), {getid:_loc_2}, this.fundsGainComplete).dropPoint = new Point(570, 320);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_notbuyfund"}

	/**
	 * 摘取果实
	 * @param user
	 * @param id
	 * 0-4
	 * @return
	 */
	public static String fundsGain(User user, int id) {
		return user.send(
			"&act=getsmallfundaward&ctl=operator",
			"{\"getid\":%d}",id
		);
	}


	//public static const EVENT_DAILCFG:Object = {ctl:"tray", act:"getcfg"};
	//BigTurnTable.as: line 206: 	App.net.send(new HttpGetParams(PHPConsts.EVENT_DAILCFG).getHttpString(), null, this.loadCfgComplete);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getrtraycfgok","data":{"traycfgInfo":{"_cls":"trayCfg","stat":1,"starttime":1405612800,"endtime":1405871940,"loop":57,"link_url":"http:\/\/bbs.open.qq.com\/thread-3129798-1-1.html"},"trayluckycfgInfo":{"_cls":"traytypeCfg","awardluckystar":1,"reqcfgList":[{"_cls":"showItem","type":"gamepoint","cfgid":0,"num":20,"sub":"0"}],"awardcfgList":[{"_cls":"showItem","type":"item","cfgid":189,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":196,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":200,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":847,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":628,"num":10,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":133,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":134,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":135,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":136,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":446,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":447,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":595,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":616,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":204,"num":1,"sub":"0"}]},"trayacecfgInfo":{"_cls":"traytypeCfg","awardluckystar":5,"reqcfgList":[{"_cls":"showItem","type":"gamepoint","cfgid":0,"num":100,"sub":"0"}],"awardcfgList":[{"_cls":"showItem","type":"item","cfgid":189,"num":3,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":197,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":202,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":779,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":773,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":595,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":242,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":448,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":449,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":598,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":157,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":158,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":159,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":160,"num":1,"sub":"0"}]},"_cls":"getTraycfgInfo"}}

	/**
	 * 转盘信息
	 * @param user
	 * @return
	 */
	public static String eventDailcfg(User user) {
		return user.send(
			"&act=getcfg&ctl=tray",
			null
		);
	}


	//public static const EVENT_DAILINFO:Object = {ctl:"tray", act:"init"};
	//BigTurnTable.as: line 232: 	App.net.send(new HttpGetParams(PHPConsts.EVENT_DAILINFO).getHttpString(), null, this.loadInfoComplete);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getrtrayinfook","data":{"rtrayInfo":{"_cls":"rtrayVo","trayluckystar":0,"traycanshare":1},"rankInfo":{"trayrankList":[{"_cls":"trayrankVo","rid":200147,"level":"70","intgender":0,"tinyurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/6ce38f6522756a25234753d1732e1b3757c50771e68c7b430c4905c77ded77ea\/30","nickname":"%20%20%20%20%20%20%20%20%20%20%20august","luckystar":"2600","rank":1},{"_cls":"trayrankVo","rid":424606,"level":"70","intgender":0,"tinyurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/36b63235a3d985e56da89ad9159a98ba3d02c52517babf74b5022ce276860430\/30","nickname":"%E5%A4%A7%E6%B5%B7","luckystar":"2500","rank":2},{"_cls":"trayrankVo","rid":987356,"level":"70","intgender":0,"tinyurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/c5ae6cde08828a62eb9cc581424d85b28c57e05471a035bcdf76e424c9e9f627\/30","nickname":"%E6%BC%A2%E5%AD%92%E4%B8%B6%E5%96%83%E5%96%83","luckystar":"1645","rank":3},{"_cls":"trayrankVo","rid":911067,"level":"70","intgender":0,"tinyurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/52b3f85468b1f756a3f942daa18a907e8e434fe5ee9807bb25ebf98db2f5e509\/30","nickname":"moonfans","luckystar":"550","rank":4},{"_cls":"trayrankVo","rid":231565,"level":"70","intgender":0,"tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/e3e6b4bc45ca4d193a5a9a82418ad90a62255c6c4e0e28ace859de748bd34e69\/30","nickname":"%5BLoft%5D%E3%80%81%E5%A5%8B%E6%96%97","luckystar":"500","rank":5},{"_cls":"trayrankVo","rid":1265019,"level":"70","intgender":1,"tinyurl":"http:\/\/pyapp.qlogo.cn\/campus\/c265e4bd629300c569f98d2bb0eb86a5da517def1197ca8e872743c7c620d964b24e01f6f2fff91d\/30","nickname":"%E8%94%A1%E8%89%AF","luckystar":"479","rank":6},{"_cls":"trayrankVo","rid":1417326,"level":"64","intgender":1,"tinyurl":"http:\/\/thirdapp1.qlogo.cn\/qzopenapp\/a08975d5f4d44fdd7c6f2a3906692343dcf22366859018ad221de1062bc10c10\/30","nickname":"%E8%BF%9C","luckystar":"460","rank":7},{"_cls":"trayrankVo","rid":873699,"level":"70","intgender":0,"tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/56c09ef7bd511496a1a97d40bc35e2d75eb8c4edf5fcefad967bb472a01a5916\/30","nickname":"Masiah","luckystar":"443","rank":8},{"_cls":"trayrankVo","rid":1385191,"level":"70","intgender":0,"tinyurl":"http:\/\/thirdapp3.qlogo.cn\/qzopenapp\/292b3877d2cf7db272af9e261a8cbc7121eec303083b325c0a21a75de3c88137\/30","nickname":"%E5%89%91%E9%9B%A8","luckystar":"385","rank":9},{"_cls":"trayrankVo","rid":917757,"level":"70","intgender":0,"tinyurl":"http:\/\/thirdapp2.qlogo.cn\/qzopenapp\/3b9a4bbcdd70c703b1840c0a9f83505d0e61c878f72c9c8f72ca4b4ad835afd4\/30","nickname":"%20%20%20%20%20%E5%96%B5%EF%BC%9F","luckystar":"275","rank":10}],"trayrankInfo":{"_cls":"trayrankVo","rid":"805493","level":"62","intgender":1,"tinyurl":"http:\/\/thirdapp0.qlogo.cn\/qzopenapp\/a77546418354b602972ff24e401e695c845bf6a505f47f5ca4267d6cb2d76347\/30","nickname":"Ming","luckystar":0,"rank":0}},"status":0,"_cls":"trayInit"}}

	/**
	 * 转盘排名
	 * @param user
	 * @return
	 */
	public static String eventDailinfo(User user) {
		return user.send(
			"&act=init&ctl=tray",
			null
		);
	}


	//public static const EVENT_DAILLOTTERY:Object = {ctl:"tray", act:"lottery"};
	//BigTurnTable.as: line 314: 	App.net.send(new HttpGetParams(PHPConsts.EVENT_DAILLOTTERY).getHttpString(), {typeid:this._turnTableType, num:param1}, this.lotteryComplete);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_tray_err_lotterytypeerr"}

	/**
	 * 转盘
	 * @param user
	 * @param num
	 * 次数
	 * @param type
	 * lucky  普通，  ace 至尊转盘
	 * @return
	 */
	public static String eventDaillottery(User user, int num, String type) {
		return user.send(
			"&act=lottery&ctl=tray",
			"{\"num\":%d,\"typeid\":\"%s\"}", num, type
		);
	}


	//public static const EVENT_DAILLUCKY:Object = {ctl:"tray", act:"luckylottery"};
	//<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"><html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8" /><title> - </title><style>body {	font-size:76%;	font-family:"Lucida Grande", Verdana, Lucida, Arial, Helvetica, sans-serif;	background-color:#FEFEFE;	color:#333333;	margin:0;}a{color:#f60;}a:hover{text-decoration:none;}.dialogtitle {	margin-bottom:10px;	font-weight:bold;}.dialogContent {	padding:10px;}</style><link rel="stylesheet" href="style/dialog.css" /></head><body><div style="margin:100px auto;width:500px;"><table border="0" cellspacing="0" cellpadding="0" id="windowTable">	<tr>		<td colspan="2" class="td9TL"></td>		<td class="td9TC"></td>		<td colspan="2" class="td9TR"></td>	</tr>	<tr>		<td class="td9ML2"></td>		<td class="td9ML"></td>		<td class="td9MC" id="windowContent"><div>	<div class="dialogtitle"><div></div></div>    <div class="dialogContent">    	<div style="width:450px;">       	方法【luckylottery】未定义，请联系网站管理员。<br />		<div align="center" style="margin-top:10px;">    <a href="javascript:history.back();"></a>		</div>    	</div>    </div></div>               </td>		<td class="td9MR"></td>		<td class="td9MR2"></td>	</tr>	<tr>		<td colspan="2" class="td9BL"></td>		<td class="td9BC"></td>		<td colspan="2" class="td9BR"></td>	</tr></table></div></body></html>

	/**
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String eventDaillucky(User user) {
		return user.send(
			"&act=luckylottery&ctl=tray",
			null
		);
	}


	//public static const EVENT_DAILSHARE:Object = {ctl:"tray", act:"doshare"};
	//ActivityCenterProxy.as: line 368: 	App.net.send(new HttpGetParams(PHPConsts.EVENT_DAILSHARE).getHttpString(), null, this.bigTurnShare).dropPoint = new Point(400, 446);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_tray_suc_traydoshareok","change":{"_cls":"changeObj","role":{"805493":{"money":"7780476"}},"rwarrior":null,"rwarriorskill":null,"rwarriorskillbuff":null,"rbagitem":null,"rbuild":null,"rquest":null,"rmap":null,"rwarriorinpub":null,"rwarriorgroup":null,"roperator":{"805493":{}}},"data":{"traycanshare":0,"_cls":"doTrayShare"}}

	/**
	 * 转盘分享
	 * @param user
	 * @return
	 */
	public static String eventDailshare(User user) {
		return user.send(
			"&act=doshare&ctl=tray",
			null
		);
	}


	//public static const EVENT_DAILREWARDCFG:Object = {ctl:"tray", act:"awardcfg"};
	//BigTurnTable.as: line 605: 	App.net.send(new HttpGetParams(PHPConsts.EVENT_DAILREWARDCFG).getHttpString(), null, this.onLoadRewardCfg).jumpOutOfQueue();
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_awardcfgok","data":{"_cls":"awardcfg","awardcfgList":{"1-1":{"_cls":"trayawardcfg","awardcfgList":[{"_cls":"showItem","type":"item","cfgid":782,"num":1,"sub":1}],"luckystar":"8000","condcfg":"28","bakawardcfgList":[{"_cls":"showItem","type":"item","cfgid":621,"num":1,"sub":1}]},"2-2":{"_cls":"trayawardcfg","awardcfgList":[{"_cls":"showItem","type":"item","cfgid":619,"num":1,"sub":1}],"luckystar":"1000","condcfg":"","bakawardcfgList":[]},"3-3":{"_cls":"trayawardcfg","awardcfgList":[{"_cls":"showItem","type":"item","cfgid":618,"num":1,"sub":1}],"luckystar":"500","condcfg":"","bakawardcfgList":[]},"4-4":{"_cls":"trayawardcfg","awardcfgList":[{"_cls":"showItem","type":"item","cfgid":615,"num":1,"sub":1}],"luckystar":"300","condcfg":"","bakawardcfgList":[]},"5-5":{"_cls":"trayawardcfg","awardcfgList":[{"_cls":"showItem","type":"item","cfgid":615,"num":1,"sub":1}],"luckystar":"300","condcfg":"","bakawardcfgList":[]}}}}

	/**
	 * 转盘奖励配置
	 * @param user
	 * @return
	 */
	public static String eventDailrewardcfg(User user) {
		return user.send(
			"&act=awardcfg&ctl=tray",
			null
		);
	}


	//public static const EVENT_DAILGETAWARD:Object = {ctl:"tray", act:"gettrayaward"};
	//BigTurnTable.as: line 644: 	App.net.send(new HttpGetParams(PHPConsts.EVENT_DAILGETAWARD).getHttpString(), null, this.onRewardComplete);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_unfinished"}

	/**
	 * 领取大转盘奖励
	 * @param user
	 * @return
	 */
	public static String eventDailgetaward(User user) {
		return user.send(
			"&act=gettrayaward&ctl=tray",
			null
		);
	}


	//public static const CARDREWARD:Object = {ctl:"card", act:"getReward"};
	//CDKeyItem.as: line 65: 	App.net.send(new HttpGetParams(PHPConsts.CARDREWARD).getHttpString(), {cdkey:_loc_1}, this.loadComplete, this.loadFail).dropPoint = new Point(686, 330);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_card_err_cdkeyerr"}

	/**
	 * CD key 兑换
	 * @param user
	 * @param cdKey
	 * @return
	 */
	public static String cardreward(User user,String cdKey) {
		return user.send(
			"&act=getReward&ctl=card",
			"{\"cdkey\":\"%s\"}",cdKey
		);
	}


	//public static const CARDHISTORY:Object = {ctl:"card", act:"getHistory"};
	//CDKeyItem.as: line 122: 	App.net.send(new HttpGetParams(PHPConsts.CARDHISTORY).getHttpString(), null, this.loadHistoryComplete);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_card_suc_gethistory","data":[]}

	/**
	 * cd key 兑换历史
	 * @param user
	 * @return
	 */
	public static String cardhistory(User user) {
		return user.send(
			"&act=getHistory&ctl=card",
			null
		);
	}


	//public static const MAY_DAY_INFO:Object = {ctl:"operator", act:"getchangewords"};
	//MayDayItem.as: line 279: 	App.net.send(new HttpGetParams(PHPConsts.MAY_DAY_INFO).getHttpString(), null, this.loadComplete);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_err_getchangewordsok","data":{"loop":7,"starttime":1405612800,"endtime":1405871940,"bbsurl":"http:\/\/bbs.open.qq.com\/thread-4244150-1-1.html","words":["\u4ed7\u528d\u6216\u7d05\u5875\u6216\u4e5d\u5dde","\u4ed7\u528d\u7d05\u5875","\u4ed7\u528d\u9707\u4e5d\u5dde","\u4ed7\u528d\u7d05\u5875\u9707\u4e5d\u5dde"],"freechallengetimes":"10","goldchallengetimes":"100","challengecost":[{"type":"gamepoint","cfgid":0,"num":4,"sub":0}],"winnerawrad":[{"type":"item","cfgid":894,"num":2,"sub":1}],"loserawrad":[{"type":"item","cfgid":894,"num":1,"sub":1}],"fightmapid":"10027","reqcfgList":[{"1":[{"_cls":"showItem","type":"item","cfgid":887,"num":1,"sub":1},{"_cls":"showItem","type":"item","cfgid":888,"num":1,"sub":1}],"2":[{"_cls":"showItem","type":"item","cfgid":889,"num":1,"sub":1},{"_cls":"showItem","type":"item","cfgid":890,"num":1,"sub":1}],"3":[{"_cls":"showItem","type":"item","cfgid":892,"num":1,"sub":1},{"_cls":"showItem","type":"item","cfgid":893,"num":1,"sub":1}]},{"1":[{"_cls":"showItem","type":"item","cfgid":887,"num":1,"sub":1},{"_cls":"showItem","type":"item","cfgid":888,"num":1,"sub":1},{"_cls":"showItem","type":"item","cfgid":889,"num":1,"sub":1},{"_cls":"showItem","type":"item","cfgid":890,"num":1,"sub":1}]},{"1":[{"_cls":"showItem","type":"item","cfgid":887,"num":1,"sub":1},{"_cls":"showItem","type":"item","cfgid":888,"num":1,"sub":1},{"_cls":"showItem","type":"item","cfgid":891,"num":1,"sub":1},{"_cls":"showItem","type":"item","cfgid":892,"num":1,"sub":1},{"_cls":"showItem","type":"item","cfgid":893,"num":1,"sub":1}]},{"1":[{"_cls":"showItem","type":"item","cfgid":887,"num":1,"sub":1},{"_cls":"showItem","type":"item","cfgid":888,"num":1,"sub":1},{"_cls":"showItem","type":"item","cfgid":889,"num":1,"sub":1},{"_cls":"showItem","type":"item","cfgid":890,"num":1,"sub":1},{"_cls":"showItem","type":"item","cfgid":891,"num":1,"sub":1},{"_cls":"showItem","type":"item","cfgid":892,"num":1,"sub":1},{"_cls":"showItem","type":"item","cfgid":893,"num":1,"sub":1}]}],"awardcfgList":[[{"_cls":"showItem","type":"money","cfgid":0,"num":88888,"sub":"0"}],[{"_cls":"showItem","type":"techpoint","cfgid":0,"num":20000,"sub":"0"}],[{"_cls":"showItem","type":"renown","cfgid":0,"num":888,"sub":"0"}],[{"_cls":"showItem","type":"item","cfgid":882,"num":1,"sub":"0"}]],"shareAwardcfgList":[{"type":"money","cfgid":0,"num":88888}],"pkroleinfo":{"_cls":"arenalist","id":1007878,"level":"62","status":"status","uname":"nickname","headurl":"tinyurl","power":420457,"warriorcfgid":"33","groupinfo":[{"_cls":"warriorVo","id":"3428898","name":"\u5c0f\u9f99\u5973","level":"46","warriorcfgid":"26","quality":4,"maxhp":34418,"hp":34418,"speed":15,"exp":"708430","nextexp":991460,"score":61486,"en":0,"maxen":12000,"enSpd":300,"attack":17145,"defence":7535,"skillattack":14012,"skilldefence":4770,"arrEquipedskill":[90,78,0,0],"arrAllskillVo":{"90":{"_cls":"skillBase","slevel":"1","scfgid":90},"78":{"_cls":"skillBase","slevel":"1","scfgid":78},"1034":{"_cls":"skillBase","slevel":"1","scfgid":1034},"1041":{"_cls":"skillBase","slevel":"1","scfgid":1041}},"con":1531,"constars":4,"conquality":3,"conquot":11.3,"str":2349,"strstars":2,"strquality":4,"strquot":13.3,"force":1777,"forcestars":2,"forcequality":3,"forcequot":10,"agi":1552,"agistars":4,"agiquality":3,"agiquot":11,"accuracy":10,"block":10,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":10,"antisubattack":10,"antisubdefence":10,"antiunskill":10,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":"147340652","2":"148936712","3":"111042783","4":"150838805"},"artiItem":{"1":0,"2":0,"3":0,"4":0},"fateItem":{"1":"230031048","2":"230031512","3":"230031069","4":"230031046"},"friendship":"245","shiplevel":"2","type":"rwarrior","attackprior":6708,"jobtype":"wtype","internode":"6","vigour":"623","totalvigour":"23373","loopinternode":-1,"loopintertimes":0,"talknum":0,"equipedItemInfo":[{"_cls":"rbagitemVo1","id":147340652,"itemcfgid":89,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":584115,"sub":"0"}],"equipopenhole":3,"effectvalue":679,"nexteffectvalue":691,"level":31,"isfit":1,"score":3395,"rwarriorId":3428898,"arrEquipedstone":[132,129,135],"upprice":581880,"attackprior":1443,"nextattackprior":1451,"soul":3,"arrSoulproperty":{"property":"addskillattackdmg","valuetype":1,"value":20,"max":30},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":3,"property":"force","value":74,"max":"125"},"2":{"propertyquality":4,"property":"str","value":83,"max":"125"}}},{"_cls":"rbagitemVo1","id":148936712,"itemcfgid":90,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":789115,"sub":"0"}],"equipopenhole":3,"effectvalue":703,"nexteffectvalue":715,"level":33,"isfit":1,"score":3515,"rwarriorId":3428898,"arrEquipedstone":[132,131,129],"upprice":786880,"attackprior":1459,"nextattackprior":1467,"soul":4,"arrSoulproperty":{"property":"addattackdmg","valuetype":1,"value":30,"max":30},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":4,"property":"skillattack","value":887,"max":"1250"},"2":{"propertyquality":2,"property":"skillattack","value":440,"max":"1250"}}},{"_cls":"rbagitemVo1","id":111042783,"itemcfgid":92,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":682942,"sub":"0"}],"equipopenhole":3,"effectvalue":691,"nexteffectvalue":703,"level":32,"isfit":1,"score":3455,"rwarriorId":3428898,"arrEquipedstone":[132,131,130],"upprice":680707,"attackprior":1451,"nextattackprior":1459,"soul":1,"arrSoulproperty":{"property":"addskillattackdmg","valuetype":1,"value":20,"max":30},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":2,"property":"skilldefence","value":346,"max":"1250"},"2":{"propertyquality":3,"property":"defence","value":599,"max":"1250"}}},{"_cls":"rbagitemVo1","id":150838805,"itemcfgid":91,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":491912,"sub":"0"}],"equipopenhole":3,"effectvalue":667,"nexteffectvalue":679,"level":30,"isfit":1,"score":3335,"rwarriorId":3428898,"arrEquipedstone":[131,130,128],"upprice":489677,"attackprior":1435,"nextattackprior":1443,"soul":2,"arrSoulproperty":{"property":"reduceskilldmg","valuetype":1,"value":13,"max":30},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":4,"property":"maxhp","value":2173,"max":"3000"},"2":{"propertyquality":3,"property":"maxhp","value":1533,"max":"3000"}}}],"arrUnlockedskin":[1],"skinid":1,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":4600,"alchemy_limit_con":4600,"alchemy_limit_force":4600,"alchemy_limit_str":4600,"resetnamenum":"0"},{"_cls":"warriorVo","id":"4074821","name":"\u6885\u671d\u98ce","level":"42","warriorcfgid":"14","quality":5,"maxhp":65064,"hp":65064,"speed":15,"exp":"140720","nextexp":769390,"score":80420,"en":0,"maxen":9000,"enSpd":300,"attack":10890,"defence":13320,"skillattack":11827,"skilldefence":8280,"arrEquipedskill":[27,12,0,0],"arrAllskillVo":{"27":{"_cls":"skillBase","slevel":"1","scfgid":27},"12":{"_cls":"skillBase","slevel":"1","scfgid":12},"1012":{"_cls":"skillBase","slevel":"1","scfgid":1012},"1027":{"_cls":"skillBase","slevel":"1","scfgid":1027}},"con":3352,"constars":5,"conquality":4,"conquot":15.2,"str":1458,"strstars":1,"strquality":4,"strquot":12,"force":1444,"forcestars":1,"forcequality":4,"forcequot":12,"agi":3480,"agistars":1,"agiquality":5,"agiquot":16,"accuracy":0,"block":35,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":12,"antisubattack":12,"antisubdefence":12,"antiunskill":12,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":"178319082","2":"239585466","3":"239585465","4":"230017894"},"artiItem":{"1":0,"2":0,"3":"230141524","4":"230141096"},"fateItem":{"1":"110444205","2":"90217297","3":"262666040","4":"262666497"},"friendship":"15","shiplevel":"2","type":"rwarrior","attackprior":6604,"jobtype":"wtype","internode":-1,"vigour":"2077","totalvigour":"102077","loopinternode":"9","loopintertimes":0,"talknum":0,"equipedItemInfo":[{"_cls":"rbagitemVo1","id":178319082,"itemcfgid":89,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":789115,"sub":"0"}],"equipopenhole":3,"effectvalue":703,"nexteffectvalue":715,"level":33,"isfit":1,"score":3515,"rwarriorId":4074821,"arrEquipedstone":[126],"upprice":786880,"attackprior":1459,"nextattackprior":1467,"soul":2,"arrSoulproperty":{"property":"reduceskilldmg","valuetype":1,"value":20,"max":30},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":3,"property":"agi","value":69,"max":"125"},"2":{"propertyquality":2,"property":"skillattack","value":507,"max":"1250"}}},{"_cls":"rbagitemVo1","id":239585466,"itemcfgid":90,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":491912,"sub":"0"}],"equipopenhole":3,"effectvalue":667,"nexteffectvalue":679,"level":30,"isfit":1,"score":3335,"rwarriorId":4074821,"arrEquipedstone":null,"upprice":489677,"attackprior":1435,"nextattackprior":1443,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":239585465,"itemcfgid":92,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":491912,"sub":"0"}],"equipopenhole":3,"effectvalue":667,"nexteffectvalue":679,"level":30,"isfit":1,"score":3335,"rwarriorId":4074821,"arrEquipedstone":null,"upprice":489677,"attackprior":1435,"nextattackprior":1443,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":230017894,"itemcfgid":91,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":491912,"sub":"0"}],"equipopenhole":3,"effectvalue":667,"nexteffectvalue":679,"level":30,"isfit":1,"score":3335,"rwarriorId":4074821,"arrEquipedstone":null,"upprice":489677,"attackprior":1435,"nextattackprior":1443,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null}],"arrUnlockedskin":[1],"skinid":1,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":4200,"alchemy_limit_con":4200,"alchemy_limit_force":4200,"alchemy_limit_str":4200,"resetnamenum":"0"},{"_cls":"warriorVo","id":"2176480","name":":\u02c9   \u3001\u5c0f\u697c\u6628\u591c\u53c8\u6625\u96e8\u2033","level":"62","warriorcfgid":"33","quality":5,"maxhp":51252,"hp":51252,"speed":"15","exp":"3011140","nextexp":24957400,"score":98488,"en":0,"maxen":15000,"enSpd":300,"attack":31183,"defence":10281,"skillattack":24001,"skilldefence":7001,"arrEquipedskill":["110","78","0","0"],"arrAllskillVo":{"110":{"_cls":"skillBase","slevel":"1","scfgid":110},"113":{"_cls":"skillBase","slevel":"1","scfgid":113},"128":{"_cls":"skillBase","slevel":"1","scfgid":128},"131":{"_cls":"skillBase","slevel":"1","scfgid":131},"1031":{"_cls":"skillBase","slevel":"1","scfgid":1031},"1030":{"_cls":"skillBase","slevel":"1","scfgid":1030},"7":{"_cls":"skillBase","slevel":"1","scfgid":7},"2":{"_cls":"skillBase","slevel":"1","scfgid":2},"78":{"_cls":"skillBase","slevel":"1","scfgid":78}},"con":2791,"constars":3,"conquality":4,"conquot":13.6,"str":5245,"strstars":1,"strquality":5,"strquot":16,"force":3858,"forcestars":1,"forcequality":4,"forcequot":12,"agi":2667,"agistars":1,"agiquality":4,"agiquot":12,"accuracy":11,"block":10,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":10,"antisubattack":10,"antisubdefence":10,"antiunskill":10,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":"122753423","2":"120824341","3":"144469546","4":"141852294"},"artiItem":{"1":"59206912","2":"66438361","3":0,"4":"0"},"fateItem":{"1":"74083793","2":"74084271","3":"105460193","4":"90254183","5":"105460194","6":"248459227"},"friendship":"0","shiplevel":"1","type":"rwarrior","attackprior":7526,"jobtype":"wtype","internode":-1,"vigour":"3360","totalvigour":"130160","loopinternode":-1,"loopintertimes":0,"talknum":0,"equipedItemInfo":[{"_cls":"rbagitemVo1","id":122753423,"itemcfgid":89,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":2443582,"sub":"0"}],"equipopenhole":3,"effectvalue":823,"nexteffectvalue":835,"level":43,"isfit":1,"score":4115,"rwarriorId":2176480,"arrEquipedstone":[136,133,130],"upprice":2441347,"attackprior":1539,"nextattackprior":1547,"soul":3,"arrSoulproperty":{"property":"addattackdmg","valuetype":1,"value":20,"max":30},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":3,"property":"agi","value":67,"max":"125"},"2":{"propertyquality":3,"property":"maxhp","value":1401,"max":"3000"}}},{"_cls":"rbagitemVo1","id":120824341,"itemcfgid":90,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1821565,"sub":"0"}],"equipopenhole":3,"effectvalue":787,"nexteffectvalue":799,"level":40,"isfit":1,"score":3935,"rwarriorId":2176480,"arrEquipedstone":[139,134,133],"upprice":1819330,"attackprior":1515,"nextattackprior":1523,"soul":2,"arrSoulproperty":{"property":"reducedmg","valuetype":1,"value":17,"max":30},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":3,"property":"skillattack","value":611,"max":"1250"},"2":{"propertyquality":3,"property":"maxhp","value":1519,"max":"3000"}}},{"_cls":"rbagitemVo1","id":144469546,"itemcfgid":92,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":903444,"sub":"0"}],"equipopenhole":3,"effectvalue":715,"nexteffectvalue":727,"level":34,"isfit":1,"score":3575,"rwarriorId":2176480,"arrEquipedstone":[136,129,139],"upprice":901209,"attackprior":1467,"nextattackprior":1475,"soul":5,"arrSoulproperty":{"property":"addattackdmg","valuetype":1,"value":20,"max":30},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":4,"property":"attack","value":758,"max":"1250"},"2":{"propertyquality":2,"property":"skilldefence","value":347,"max":"1250"}}},{"_cls":"rbagitemVo1","id":141852294,"itemcfgid":91,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":1821565,"sub":"0"}],"equipopenhole":3,"effectvalue":787,"nexteffectvalue":799,"level":40,"isfit":1,"score":3935,"rwarriorId":2176480,"arrEquipedstone":[130,129,136],"upprice":1819330,"attackprior":1515,"nextattackprior":1523,"soul":4,"arrSoulproperty":{"property":"addattackdmg","valuetype":1,"value":13,"max":30},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":4,"property":"agi","value":87,"max":"125"},"2":{"propertyquality":4,"property":"str","value":81,"max":"125"}}}],"arrUnlockedskin":[3,4],"skinid":4,"arrPetInfo":null,"alchemy_agi":"14","alchemy_con":"26","alchemy_force":"0","alchemy_str":"12","alchemy_limit_agi":6200,"alchemy_limit_con":6200,"alchemy_limit_force":6200,"alchemy_limit_str":6200,"resetnamenum":"0"},{"_cls":"warriorVo","id":"4014982","name":"\u5929\u5c71\u59e5\u59e5","level":"44","warriorcfgid":"15","quality":4,"maxhp":74864,"hp":74864,"speed":25,"exp":"389754","nextexp":873930,"score":85058,"en":0,"maxen":9000,"enSpd":300,"attack":11260,"defence":14787,"skillattack":10660,"skilldefence":8658,"arrEquipedskill":[28,13,0,0],"arrAllskillVo":{"28":{"_cls":"skillBase","slevel":"1","scfgid":28},"13":{"_cls":"skillBase","slevel":"1","scfgid":13},"1006":{"_cls":"skillBase","slevel":"1","scfgid":1006},"1021":{"_cls":"skillBase","slevel":"1","scfgid":1021}},"con":3752,"constars":1,"conquality":4,"conquot":12.6,"str":1532,"strstars":2,"strquality":3,"strquot":10,"force":1432,"forcestars":2,"forcequality":3,"forcequot":10,"agi":3669,"agistars":2,"agiquality":4,"agiquot":13.3,"accuracy":0,"block":35,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":10,"antisubattack":10,"antisubdefence":10,"antiunskill":10,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":0,"reduceskilldmg":0,"equipedItem":{"1":"194144784","2":"209457194","3":"209457195","4":"230017920"},"artiItem":{"1":0,"2":0,"3":"90207699","4":"90174219"},"fateItem":{"1":"202927468","2":"209454652","3":"220503510","4":0},"friendship":"225","shiplevel":"2","type":"rwarrior","attackprior":6540,"jobtype":"wtype","internode":"5","vigour":"4923","totalvigour":"36423","loopinternode":-1,"loopintertimes":0,"talknum":0,"equipedItemInfo":[{"_cls":"rbagitemVo1","id":194144784,"itemcfgid":89,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":491912,"sub":"0"}],"equipopenhole":3,"effectvalue":667,"nexteffectvalue":679,"level":30,"isfit":1,"score":3335,"rwarriorId":4014982,"arrEquipedstone":null,"upprice":489677,"attackprior":1435,"nextattackprior":1443,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":209457194,"itemcfgid":90,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":491912,"sub":"0"}],"equipopenhole":3,"effectvalue":667,"nexteffectvalue":679,"level":30,"isfit":1,"score":3335,"rwarriorId":4014982,"arrEquipedstone":null,"upprice":489677,"attackprior":1435,"nextattackprior":1443,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":209457195,"itemcfgid":92,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":491912,"sub":"0"}],"equipopenhole":3,"effectvalue":667,"nexteffectvalue":679,"level":30,"isfit":1,"score":3335,"rwarriorId":4014982,"arrEquipedstone":null,"upprice":489677,"attackprior":1435,"nextattackprior":1443,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null},{"_cls":"rbagitemVo1","id":230017920,"itemcfgid":87,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":491412,"sub":"0"}],"equipopenhole":3,"effectvalue":567,"nexteffectvalue":577,"level":30,"isfit":1,"score":2835,"rwarriorId":4014982,"arrEquipedstone":null,"upprice":489677,"attackprior":855,"nextattackprior":863,"soul":"0","arrSoulproperty":null,"arrTmpSoulproperty":null,"arrAddproperty":null}],"arrUnlockedskin":[1],"skinid":1,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"0","alchemy_str":"0","alchemy_limit_agi":4400,"alchemy_limit_con":4400,"alchemy_limit_force":4400,"alchemy_limit_str":4400,"resetnamenum":"0"},{"_cls":"warriorVo","id":"3167980","name":"\u9ec4\u84c9","level":"52","warriorcfgid":"12","quality":5,"maxhp":38532,"hp":38532,"speed":15,"exp":"955756","nextexp":3702380,"score":95005,"en":0,"maxen":12000,"enSpd":300,"attack":21521,"defence":11384,"skillattack":29034,"skilldefence":8463,"arrEquipedskill":[25,10,0,0],"arrAllskillVo":{"25":{"_cls":"skillBase","slevel":"1","scfgid":25},"10":{"_cls":"skillBase","slevel":"1","scfgid":10},"1001":{"_cls":"skillBase","slevel":"1","scfgid":1001},"1016":{"_cls":"skillBase","slevel":"1","scfgid":1016}},"con":2391,"constars":1,"conquality":4,"conquot":12,"str":3293,"strstars":3,"strquality":4,"strquot":13.6,"force":4322,"forcestars":1,"forcequality":5,"forcequot":16,"agi":2395,"agistars":2,"agiquality":4,"agiquot":12.8,"accuracy":0,"block":13,"critical":"0","criticalquot":"0","criticaldmg":"0","antisubhp":10,"antisubattack":10,"antisubdefence":10,"antiunskill":10,"addattackdmg":0,"addskillattackdmg":0,"reducedmg":19,"reduceskilldmg":0,"equipedItem":{"1":"108223006","2":"115939050","3":"153999321","4":"118557803"},"artiItem":{"1":"93965418","2":"105903439","3":"55736044","4":"52455362"},"fateItem":{"1":"74084274","2":"91534309","3":"108989456","4":"231611796","5":"231612689"},"friendship":"1385","shiplevel":"3","type":"rwarrior","attackprior":7012,"jobtype":"wtype","internode":-1,"vigour":"2850","totalvigour":"124350","loopinternode":"13","loopintertimes":0,"talknum":0,"equipedItemInfo":[{"_cls":"rbagitemVo1","id":108223006,"itemcfgid":89,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":491912,"sub":"0"}],"equipopenhole":3,"effectvalue":667,"nexteffectvalue":679,"level":30,"isfit":1,"score":3335,"rwarriorId":3167980,"arrEquipedstone":[129,134,136],"upprice":489677,"attackprior":1435,"nextattackprior":1443,"soul":4,"arrSoulproperty":{"property":"reduceskilldmg","valuetype":1,"value":20,"max":30},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":3,"property":"con","value":78,"max":"125"},"2":{"propertyquality":3,"property":"force","value":71,"max":"125"}}},{"_cls":"rbagitemVo1","id":115939050,"itemcfgid":90,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":2671897,"sub":"0"}],"equipopenhole":3,"effectvalue":835,"nexteffectvalue":847,"level":44,"isfit":1,"score":4175,"rwarriorId":3167980,"arrEquipedstone":[135,133,140],"upprice":2669662,"attackprior":1547,"nextattackprior":1555,"soul":4,"arrSoulproperty":{"property":"reducedmg","valuetype":1,"value":19,"max":30},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":4,"property":"skillattack","value":734,"max":"1250"},"2":{"propertyquality":3,"property":"agi","value":66,"max":"125"}}},{"_cls":"rbagitemVo1","id":153999321,"itemcfgid":92,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":491912,"sub":"0"}],"equipopenhole":3,"effectvalue":667,"nexteffectvalue":679,"level":30,"isfit":1,"score":3335,"rwarriorId":3167980,"arrEquipedstone":[136,134,139],"upprice":489677,"attackprior":1435,"nextattackprior":1443,"soul":1,"arrSoulproperty":{"property":"reduceskilldmg","valuetype":1,"value":11,"max":30},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":3,"property":"skilldefence","value":553,"max":"1250"},"2":{"propertyquality":3,"property":"attack","value":556,"max":"1250"}}},{"_cls":"rbagitemVo1","id":118557803,"itemcfgid":91,"num":1,"arrSellaward":[{"_cls":"showItem","type":"money","cfgid":0,"num":2911733,"sub":"0"}],"equipopenhole":3,"effectvalue":847,"nexteffectvalue":859,"level":45,"isfit":1,"score":4235,"rwarriorId":3167980,"arrEquipedstone":[135,133,136],"upprice":2909498,"attackprior":1555,"nextattackprior":1563,"soul":5,"arrSoulproperty":{"property":"addskillattackdmg","valuetype":1,"value":19,"max":30},"arrTmpSoulproperty":null,"arrAddproperty":{"1":{"propertyquality":3,"property":"skillattack","value":690,"max":"1250"},"2":{"propertyquality":2,"property":"defence","value":419,"max":"1250"}}}],"arrUnlockedskin":[1],"skinid":1,"arrPetInfo":null,"alchemy_agi":"0","alchemy_con":"0","alchemy_force":"8","alchemy_str":"0","alchemy_limit_agi":5200,"alchemy_limit_con":5200,"alchemy_limit_force":5200,"alchemy_limit_str":5200,"resetnamenum":"0"}],"skinid":4},"usedchallengtimes":0,"purchasechallengtimes":0,"changewordscanshare":1,"_cls":"getchangewords"}}

	/**
	 * 大扫除配置
	 * @param user
	 * @return
	 */
	public static String mayDayInfo(User user) {
		return user.send(
			"&act=getchangewords&ctl=operator",
			null
		);
	}


	//public static const MAY_DAY_ADD_TIMES:Object = {ctl:"operator", act:"purchaseChangewordsTimes"};
	//MayDayItem.as: line 121: 	App.net.send(new HttpGetParams(PHPConsts.MAY_DAY_ADD_TIMES).getHttpString(), {times:1}, this.dataHandler, this.failHandler);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_err_purchasechangewordsok","change":{"_cls":"changeObj","role":{"805493":{"gamepoint":"55"}},"rwarrior":null,"rwarriorskill":null,"rwarriorskillbuff":null,"rbagitem":null,"rbuild":null,"rquest":null,"rmap":null,"rwarriorinpub":null,"rwarriorgroup":null,"roperator":{"805493":{}}},"data":{"times":1,"purchasechallengtimes":1,"goldchallengetimes":100}}

	/**
	 * 大扫除加次数
	 * @param user
	 * @return
	 */
	public static String mayDayAddTimes(User user) {
		return user.send(
			"&act=purchaseChangewordsTimes&ctl=operator",
			"{\"times\":1}"
		);
	}


	//public static const MAY_DAY_RECHARGE:Object = {ctl:"operator", act:"changewordsaward"};
	//MayDayItem.as: line 154: 	App.net.send(new HttpGetParams(PHPConsts.MAY_DAY_RECHARGE).getHttpString(), {changeid:param1}, this.getRewardComplete, null, "default", "default", "default", 0, "default", "default", "default", "default", "defult", this.doubleCheck, [(param1 - 1)]).dropPoint = localToGlobal(new Point((this._btnArr[(param1 - 1)] as UButton).x, (this._btnArr[(param1 - 1)] as UButton).y));
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_rawdataerr"}

	/**
	 * 兑换奖励 - TODO 更新配置
	 * @param user
	 * @param award
	 * 1 铜币 2 阅历 3 声望 4 碎片
	 * @return
	 */
	public static String mayDayRecharge(User user, int award) {
		return user.send(
			"&act=changewordsaward&ctl=operator",
			"{\"changeid\":%d}",award
		);
	}


	//public static const MAY_DAY_SHARE:Object = {ctl:"operator", act:"changewordsshare"};
	//ActivityCenterProxy.as: line 385: 	App.net.send(new HttpGetParams(PHPConsts.MAY_DAY_SHARE).getHttpString(), null, this.maydayShareComplete).dropPoint = new Point(780, 455);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_game_suc_doshareok","change":{"_cls":"changeObj","role":null,"rwarrior":null,"rwarriorskill":null,"rwarriorskillbuff":null,"rbagitem":null,"rbuild":null,"rquest":null,"rmap":null,"rwarriorinpub":null,"rwarriorgroup":null,"roperator":null},"data":{"changewordscanshare":0,"_cls":"doShare"}}

	/**
	 * 大扫除分享
	 * @param user
	 * @return
	 */
	public static String mayDayShare(User user) {
		return user.send(
			"&act=changewordsshare&ctl=operator",
			null
		);
	}


	//public static const GET_HERO_CFG:Object = {ctl:"superior", act:"getcfg"};
	//HeroItem.as: line 134: 	App.net.send(new HttpGetParams(PHPConsts.GET_HERO_CFG).getHttpString(), null, this.loadCfgComplete);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getsuperiorcfgok","data":{"superiorcfgVo":{"_cls":"superiorCfg","stat":0,"starttime":"1404489600","endtime":"1404748740","bbsurl":"http:\/\/bbs.open.qq.com\/thread-4244150-1-1.html","addarenanum":"5","gridReqcfgList":{"1":[{"_cls":"showItem","type":"item","cfgid":746,"num":1,"sub":1}],"2":[{"_cls":"showItem","type":"item","cfgid":747,"num":1,"sub":1}],"3":[{"_cls":"showItem","type":"item","cfgid":748,"num":1,"sub":1}],"4":[{"_cls":"showItem","type":"item","cfgid":749,"num":1,"sub":1}],"5":[{"_cls":"showItem","type":"item","cfgid":750,"num":1,"sub":1}],"6":[{"_cls":"showItem","type":"item","cfgid":751,"num":1,"sub":1}],"7":[{"_cls":"showItem","type":"item","cfgid":752,"num":1,"sub":1}],"8":[{"_cls":"showItem","type":"item","cfgid":753,"num":1,"sub":1}],"9":[{"_cls":"showItem","type":"item","cfgid":754,"num":1,"sub":1}]},"exchangecfgList":{"all":{"awardcfgList":[{"_cls":"showItem","type":"item","cfgid":759,"num":10,"sub":"0"},{"_cls":"showItem","type":"renown","cfgid":0,"num":500,"sub":"0"},{"_cls":"showItem","type":"money","cfgid":0,"num":250000,"sub":"0"}],"buycfgList":{"1":[{"_cls":"showItem","type":"gamepoint","cfgid":0,"num":20,"sub":0}],"2":[{"_cls":"showItem","type":"gamepoint","cfgid":0,"num":60,"sub":0}],"3":[{"_cls":"showItem","type":"gamepoint","cfgid":0,"num":120,"sub":0}],"4":[{"_cls":"showItem","type":"gamepoint","cfgid":0,"num":200,"sub":0}],"5":[{"_cls":"showItem","type":"gamepoint","cfgid":0,"num":300,"sub":0}],"6":[{"_cls":"showItem","type":"gamepoint","cfgid":0,"num":420,"sub":0}]}},"h1":{"awardcfgList":[{"_cls":"showItem","type":"money","cfgid":0,"num":100000,"sub":"0"}],"buycfgList":{"1":[{"_cls":"showItem","type":"gamepoint","cfgid":0,"num":20,"sub":0}],"2":[{"_cls":"showItem","type":"gamepoint","cfgid":0,"num":60,"sub":0}]}},"h2":{"awardcfgList":[{"_cls":"showItem","type":"money","cfgid":0,"num":100000,"sub":"0"}],"buycfgList":{"1":[{"_cls":"showItem","type":"gamepoint","cfgid":0,"num":20,"sub":0}],"2":[{"_cls":"showItem","type":"gamepoint","cfgid":0,"num":60,"sub":0}]}},"h3":{"awardcfgList":[{"_cls":"showItem","type":"money","cfgid":0,"num":100000,"sub":"0"}],"buycfgList":{"1":[{"_cls":"showItem","type":"gamepoint","cfgid":0,"num":20,"sub":0}],"2":[{"_cls":"showItem","type":"gamepoint","cfgid":0,"num":60,"sub":0}]}},"v1":{"awardcfgList":[{"_cls":"showItem","type":"renown","cfgid":0,"num":200,"sub":"0"}],"buycfgList":{"1":[{"_cls":"showItem","type":"gamepoint","cfgid":0,"num":20,"sub":0}],"2":[{"_cls":"showItem","type":"gamepoint","cfgid":0,"num":60,"sub":0}]}},"v2":{"awardcfgList":[{"_cls":"showItem","type":"renown","cfgid":0,"num":200,"sub":"0"}],"buycfgList":{"1":[{"_cls":"showItem","type":"gamepoint","cfgid":0,"num":20,"sub":0}],"2":[{"_cls":"showItem","type":"gamepoint","cfgid":0,"num":60,"sub":0}]}},"v3":{"awardcfgList":[{"_cls":"showItem","type":"renown","cfgid":0,"num":200,"sub":"0"}],"buycfgList":{"1":[{"_cls":"showItem","type":"gamepoint","cfgid":0,"num":20,"sub":0}],"2":[{"_cls":"showItem","type":"gamepoint","cfgid":0,"num":60,"sub":0}]}}}},"_cls":"getSuperiorcfgInfo"}}

	/**
	 * 画像活动
	 * @param user
	 * @return
	 */
	public static String getHeroCfg(User user) {
		return user.send(
			"&act=getcfg&ctl=superior",
			null
		);
	}


	//public static const GET_HERO_INFO:Object = {ctl:"superior", act:"init"};
	//HeroItem.as: line 127: 	App.net.send(new HttpGetParams(PHPConsts.GET_HERO_INFO).getHttpString(), null, this.loadInfoComplete);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getsuperiorcfgok","data":{"rsuperiorVo":{"_cls":"rsuperiorVo","canshare":0,"isplay":"1"},"_cls":"superiorInit"}}

	/**
	 * 画像活动初始化
	 * @param user
	 * @return
	 */
	public static String getHeroInfo(User user) {
		return user.send(
			"&act=init&ctl=superior",
			null
		);
	}


	//public static const EXCHANGE_HERO:Object = {ctl:"superior", act:"exchange"};
	//HeroItem.as: line 421: 	App.net.send(new HttpGetParams(PHPConsts.EXCHANGE_HERO).getHttpString(), _loc_2, this.exComplete, null, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.doubleCheck, [(param1 - 1)]).dropPoint = new Point(stage.mouseX, stage.mouseY);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_superior_err_exchangeparamerr"}

	/**
	 * 画像兑换奖励
	 * @param user
	 * @param type
	 * TODO
	 * @return
	 */
	public static String exchangeHero(User user,int type) {
		return user.send(
			"&act=exchange&ctl=superior",
			"{\"type\":%d}", type
		);
	}


	//public static const BUY_HERO:Object = {ctl:"superior", act:"buy"};
	//HeroItem.as: line 428: 	App.net.send(new HttpGetParams(PHPConsts.BUY_HERO).getHttpString(), param1, this.buyComplete).dropPoint = param2;
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_superior_err_exchangeparamerr"}

	/**
	 * 补足画像
	 * @param user
	 * @param type
	 * TODO type
	 * @return
	 */
	public static String buyHero(User user, int type) {
		return user.send(
			"&act=buy&ctl=superior",
			"{\"type\":%d}", type
		);
	}


	//public static const HERO_SHARE:Object = {ctl:"superior", act:"doshare"};
	//ActivityCenterProxy.as: line 402: 	App.net.send(new HttpGetParams(PHPConsts.HERO_SHARE).getHttpString(), null, this.heroShareComplete).dropPoint = new Point(760, 355);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_superior_err_cantshare"}

	/**
	 * 分享活动
	 * @param user
	 * @return
	 */
	public static String heroShare(User user) {
		return user.send(
			"&act=doshare&ctl=superior",
			null
		);
	}


	//public static const HERO_PILL:Object = {ctl:"rwarrior", act:"usealchemy"};
	//UsePill.as: line 23: 	App.net.send(new HttpGetParams(PHPConsts.HERO_PILL).getHttpString(), {rwarriorid:this._vo.id, rbagitemid:this._item.id, num:param3}, this.sellSuccess, this.sellFailure, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.doubleCheck);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_gam_err_rwarriornotexist"}

	/**
	 * 吃丹药
	 * @param user
	 * @param pillId
	 * @param warrior
	 * @param num
	 * @return
	 */
	public static String heroPill(User user,int pillId, int warrior, int num) {
		return user.send(
			"&act=usealchemy&ctl=rwarrior",
			"{\"rbagitemid\":%d,\"rwarriorid\":%d,\"num\":%d}", pillId, warrior, num
		);
	}


	//public static const EVENT_PUBLIC_CTRL:Object = {ctl:"index", act:"getopctl"};
	//MainUIManager.as: line 579: 	App.net.send(new HttpGetParams(PHPConsts.EVENT_PUBLIC_CTRL).getHttpString(), null, this.loadCtrlDataComplete).jumpOutOfQueue();
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getopctlok","data":{"opctlList":[{"_cls":"opctlCfg","activityId":"event_147180","activityTitle":"\u75af\u72c2\u6691\u5047HIGH\u7ffb\u5929","activityTabTitle":"\u75af\u72c2\u6691\u5047\uff0cHIGH\u7ffb\u5929\uff01","starttime":"1404100800","endtime":"1404140400","isDefault":"0","isIcon":"1","order":"1635"},{"_cls":"opctlCfg","activityId":"event_146523","activityTitle":"\u5468\u4e00\u9996\u5145","activityTabTitle":"\u5468\u4e00\u9996\u5145","starttime":"1402848000","endtime":"1402934340","isDefault":"0","isIcon":"1","order":"1585"},{"_cls":"opctlCfg","activityId":"event_15027","activityTitle":"\u5355\u7b14\u5145\u503c","activityTabTitle":"\u5355\u7b14\u5145\u503c","starttime":1391788800,"endtime":1391875140,"isDefault":0,"isIcon":1,"order":245},{"_cls":"opctlCfg","activityId":"event_147006","activityTitle":"\u6d88\u8d39\u5927\u793c","activityTabTitle":"\u6708\u672b\u6d88\u8d39\u5927\u793c","starttime":"1403798400","endtime":"1404057540","isDefault":"0","isIcon":"1","order":"1620"},{"_cls":"opctlCfg","activityId":"event_150073","activityTitle":"\u9650\u65f6\u5145\u503c","activityTabTitle":"\u9650\u65f6\u5145\u503c","starttime":"1404982800","endtime":"1405004400","isDefault":"0","isIcon":"1","order":"1674"},{"_cls":"opctlCfg","activityId":"event_145989","activityTitle":"\u6d88\u8d39\u9001\u5927\u793c","activityTabTitle":"\u6d88\u8d39\u9001\u5927\u793c","starttime":"1401552000","endtime":"1401811140","isDefault":"0","isIcon":"1","order":"1535"},{"_cls":"opctlCfg","activityId":"event_145394","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1400342400","endtime":"1400428740","isDefault":"0","isIcon":"1","order":"1485"},{"_cls":"opctlCfg","activityId":"event_14112","activityTitle":"\u5468\u4e00\u9996\u5145","activityTabTitle":"\u5468\u4e00\u9996\u5145","starttime":1390752000,"endtime":1390838340,"isDefault":0,"isIcon":1,"order":211},{"_cls":"opctlCfg","activityId":"event_19500","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":1395072000,"endtime":1395158340,"isDefault":0,"isIcon":1,"order":355},{"_cls":"opctlCfg","activityId":"event_14329","activityTitle":"\u86c7\u5e74\u5c3e\u7259","activityTabTitle":"\u86c7\u5e74\u5c3e\u7259","starttime":1391076000,"endtime":1391097540,"isDefault":0,"isIcon":1,"order":221},{"_cls":"opctlCfg","activityId":"event_146353","activityTitle":"\u6d88\u8d39\u597d\u793c","activityTabTitle":"\u6d88\u8d39\u597d\u793c","starttime":"1402416000","endtime":"1402588740","isDefault":"0","isIcon":"1","order":"1569"},{"_cls":"opctlCfg","activityId":"event_16079","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":1392825600,"endtime":1392998340,"isDefault":0,"isIcon":1,"order":279},{"_cls":"opctlCfg","activityId":"event_15434","activityTitle":"\u9650\u65f6\u5145\u503c","activityTabTitle":"\u9650\u65f6\u5145\u503c","starttime":1392890400,"endtime":1392901200,"isDefault":0,"isIcon":1,"order":0},{"_cls":"opctlCfg","activityId":"event_24001","activityTitle":"\u5355\u7b14\u5145\u503c","activityTabTitle":"\u5355\u7b14\u5145\u503c\u8d60\u4ee4\u724c","starttime":1396886400,"endtime":1396972740,"isDefault":0,"isIcon":1,"order":1349},{"_cls":"opctlCfg","activityId":"event_144367","activityTitle":"\u52a0\u6536\u6709\u793c","activityTabTitle":"\u6606\u4ed1\u6728\u52a0\u6536\u6709\u793c","starttime":"1398441600","endtime":"1398614340","isDefault":"0","isIcon":"1","order":"1407"},{"_cls":"opctlCfg","activityId":"event_52408","activityTitle":"\u5355\u7b14\u5145\u503c","activityTabTitle":"\u5355\u7b14\u5145\u503c","starttime":"1397836800","endtime":"1398009540","isDefault":"0","isIcon":"1","order":"1383"},{"_cls":"opctlCfg","activityId":"event_17803","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u5987\u5973\u8282\u7d2f\u8ba1\u5145\u503c","starttime":1394121600,"endtime":1394380740,"isDefault":0,"isIcon":1,"order":327},{"_cls":"opctlCfg","activityId":"event_23793","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c","starttime":1395849600,"endtime":1396022340,"isDefault":0,"isIcon":1,"order":380},{"_cls":"opctlCfg","activityId":"event_144673","activityTitle":"\u9650\u65f6\u5145\u503c","activityTabTitle":"\u9650\u65f6\u5145\u503c","starttime":"1399186800","endtime":"1399215600","isDefault":"0","isIcon":"1","order":"1432"},{"_cls":"opctlCfg","activityId":"event_144652","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1399046400","endtime":"1399132740","isDefault":"0","isIcon":"1","order":"1429"},{"_cls":"opctlCfg","activityId":"event_18285","activityTitle":"\u52a0\u6536\u6709\u793c","activityTabTitle":"\u690d\u6811\u8282\u6606\u4ed1\u6728\u52a0\u6536\u6709\u793c","starttime":1394553600,"endtime":1394726340,"isDefault":0,"isIcon":1,"order":341},{"_cls":"opctlCfg","activityId":"event_19741","activityTitle":"\u5355\u7b14\u5145\u503c","activityTabTitle":"\u5355\u7b14\u5145\u503c","starttime":1395244800,"endtime":1395331140,"isDefault":0,"isIcon":1,"order":359},{"_cls":"opctlCfg","activityId":"event_23883","activityTitle":"\u5468\u4e00\u9996\u5145","activityTabTitle":"\u5468\u4e00\u9996\u5145","starttime":"1396195200","endtime":"1396281540","isDefault":"0","isIcon":"1","order":"1319"},{"_cls":"opctlCfg","activityId":"event_16677","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c","starttime":1393344000,"endtime":1393603140,"isDefault":0,"isIcon":1,"order":300},{"_cls":"opctlCfg","activityId":"event_23994","activityTitle":"\u767e\u5143\u51b2\u51b2\u5145","activityTabTitle":"\u767e\u5143\u51b2\u51b2\u5145","starttime":"1396713600","endtime":"1396799940","isDefault":"0","isIcon":"1","order":"1341"},{"_cls":"opctlCfg","activityId":"event_145230","activityTitle":"\u7d2f\u5145\u4eab\u798f\u5229","activityTabTitle":"\u7d2f\u5145\u4eab\u798f\u5229","starttime":"1400083200","endtime":"1400255940","isDefault":"0","isIcon":"1","order":"1474"},{"_cls":"opctlCfg","activityId":"event_16502","activityTitle":"\u6bcf\u65e5\u6d88\u8d39","activityTabTitle":"\u6bcf\u65e5\u6d88\u8d39\u9886\u597d\u793c","starttime":1393084800,"endtime":1393171140,"isDefault":0,"isIcon":1,"order":294},{"_cls":"opctlCfg","activityId":"event_16270","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c","starttime":1392998400,"endtime":1393257540,"isDefault":0,"isIcon":1,"order":284},{"_cls":"opctlCfg","activityId":"event_16560","activityTitle":"\u5faa\u73af\u5145\u503c","activityTabTitle":"\u5faa\u73af\u5145\u503c","starttime":1393257600,"endtime":1393430340,"isDefault":0,"isIcon":1,"order":296},{"_cls":"opctlCfg","activityId":"event_16444","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7","starttime":1393171200,"endtime":1393257540,"isDefault":0,"isIcon":0,"order":290},{"_cls":"opctlCfg","activityId":"event_150005","activityTitle":"\u52a0\u6536\u6709\u793c","activityTabTitle":"\u6606\u4ed1\u6728\u52a0\u6536\u6709\u793c","starttime":"1404921600","endtime":"1405094340","isDefault":"0","isIcon":"1","order":"1672"},{"_cls":"opctlCfg","activityId":"event_145757","activityTitle":"\u7d2f\u5145\u5927\u56de\u9988","activityTabTitle":"\u7d2f\u5145\u5927\u56de\u9988","starttime":"1401033600","endtime":"1401292740","isDefault":"0","isIcon":"1","order":"1512"},{"_cls":"opctlCfg","activityId":"event_14771","activityTitle":"\u5145\u503c\u9001\u6a59\u88c5","activityTabTitle":"\u5145\u503c\u9001\u6a59\u88c5","starttime":1391356800,"endtime":1391529540,"isDefault":0,"isIcon":1,"order":235},{"_cls":"opctlCfg","activityId":"chargeAward","activityTitle":"","activityTabTitle":"","starttime":1369125780,"endtime":1588495380,"isDefault":0,"isIcon":0,"order":0},{"_cls":"opctlCfg","activityId":"event_23984","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c","starttime":"1396454400","endtime":"1396627140","isDefault":"0","isIcon":"1","order":"1330"},{"_cls":"opctlCfg","activityId":"event_145101","activityTitle":"\u60c5\u4eba\u8282\u5927\u8f6c\u76d8","activityTabTitle":"\u60c5\u4eba\u8282\u5927\u8f6c\u76d8","starttime":"1399824000","endtime":"1400083140","isDefault":"0","isIcon":"0","order":"1463"},{"_cls":"opctlCfg","activityId":"event_144271","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1398268800","endtime":"1398441540","isDefault":"0","isIcon":"1","order":"1401"},{"_cls":"opctlCfg","activityId":"event_147008","activityTitle":"\u52a9\u529b\u6253\u699c\u5355\u5145\u793c","activityTabTitle":"\u52a9\u529b\u6253\u699c\u5355\u5145\u793c","starttime":1403839800,"endtime":1403971140,"isDefault":0,"isIcon":1,"order":1625},{"_cls":"opctlCfg","activityId":"event_23888","activityTitle":"\u9650\u65f6\u5145\u503c","activityTabTitle":"\u611a\u4eba\u8282\u9650\u65f6\u5145\u503c","starttime":"1396335600","endtime":"1396364400","isDefault":"0","isIcon":"1","order":"1324"},{"_cls":"opctlCfg","activityId":"event_144785","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1399305600","endtime":"1399478340","isDefault":"0","isIcon":"1","order":"1444"},{"_cls":"opctlCfg","activityId":"event_146438","activityTitle":"\u63ed\u5e55\u6218\u201c\u58d5\u201d\u793c","activityTabTitle":"\u63ed\u5e55\u6218\u201c\u58d5\u201d\u793c","starttime":"1402588800","endtime":"1402761540","isDefault":"0","isIcon":"1","order":"1575"},{"_cls":"opctlCfg","activityId":"event_19560","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":1395072000,"endtime":1395244740,"isDefault":0,"isIcon":1,"order":356},{"_cls":"opctlCfg","activityId":"event_19021","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u767d\u8272\u60c5\u4eba\u8282\u7d2f\u8ba1\u6d88\u8d39","starttime":1394726400,"endtime":1394985540,"isDefault":0,"isIcon":1,"order":346},{"_cls":"opctlCfg","activityId":"event_15114","activityTitle":"\u64c2\u53f0\u7ade\u6280","activityTabTitle":"\u64c2\u53f0\u7ade\u6280","starttime":1391788800,"endtime":1391961540,"isDefault":0,"isIcon":0,"order":248},{"_cls":"opctlCfg","activityId":"event_16918","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":1393603200,"endtime":1393775940,"isDefault":0,"isIcon":1,"order":310},{"_cls":"opctlCfg","activityId":"event_146066","activityTitle":"\u5468\u4e00\u9996\u5145","activityTabTitle":"\u5468\u4e00\u9996\u5145","starttime":"1401638400","endtime":"1401724740","isDefault":"0","isIcon":"1","order":"1541"},{"_cls":"opctlCfg","activityId":"event_16795","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7","starttime":1393430400,"endtime":1393603140,"isDefault":0,"isIcon":0,"order":304},{"_cls":"opctlCfg","activityId":"event_147007","activityTitle":"\u64c2\u53f0\u7ade\u6280","activityTabTitle":"\u64c2\u53f0\u7ade\u6280\u573a","starttime":"1403798400","endtime":"1403971140","isDefault":"0","isIcon":"1","order":"1623"},{"_cls":"opctlCfg","activityId":"event_146268","activityTitle":"\u5468\u4e00\u9996\u5145","activityTabTitle":"\u5468\u4e00\u9996\u5145","starttime":"1402243200","endtime":"1402329540","isDefault":"0","isIcon":"1","order":"1562"},{"_cls":"opctlCfg","activityId":"event_147252","activityTitle":"\u7d2f\u5145\u52a9\u6210\u957f","activityTabTitle":"\u7d2f\u5145\u52a9\u6210\u957f","starttime":"1404316800","endtime":"1404489540","isDefault":"0","isIcon":"1","order":"1644"},{"_cls":"opctlCfg","activityId":"event_147258","activityTitle":"\u6d88\u8d39\u6709\u597d\u793c","activityTabTitle":"\u6d88\u8d39\u6709\u597d\u793c","starttime":"1404316800","endtime":"1404489540","isDefault":"0","isIcon":"1","order":"1646"},{"_cls":"opctlCfg","activityId":"event_16473","activityTitle":"\u6bcf\u65e5\u6d88\u8d39","activityTabTitle":"\u6bcf\u65e5\u6d88\u8d39\u9886\u597d\u793c","starttime":1392998400,"endtime":1393084740,"isDefault":0,"isIcon":1,"order":293},{"_cls":"opctlCfg","activityId":"event_146134","activityTitle":"\u6d88\u8d39\u597d\u793c","activityTabTitle":"\u6d88\u8d39\u597d\u793c","starttime":"1401811200","endtime":"1401983940","isDefault":"0","isIcon":"1","order":"1548"},{"_cls":"opctlCfg","activityId":"event_145823","activityTitle":"\u5355\u5145\u798f\u5229","activityTabTitle":"\u5355\u5145\u798f\u5229","starttime":"1401157800","endtime":"1401206340","isDefault":"0","isIcon":"1","order":"1520"},{"_cls":"opctlCfg","activityId":"event_14913","activityTitle":"\u6625\u8282\u6d88\u8d39","activityTabTitle":"\u6625\u8282\u6d88\u8d39","starttime":1391443200,"endtime":1391702340,"isDefault":0,"isIcon":1,"order":240},{"_cls":"opctlCfg","activityId":"event_146100","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1401724800","endtime":"1401811140","isDefault":"0","isIcon":"1","order":"1545"},{"_cls":"opctlCfg","activityId":"event_146067","activityTitle":"\u767b\u9646\u793c\u5305","activityTabTitle":"\u767b\u9646\u798f\u5229\u793c\u5305","starttime":"1401629400","endtime":"1401724740","isDefault":"0","isIcon":"1","order":"1542"},{"_cls":"opctlCfg","activityId":"event_15961","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":1392652800,"endtime":1392825540,"isDefault":0,"isIcon":1,"order":275},{"_cls":"opctlCfg","activityId":"event_14495","activityTitle":"\u9a6c\u5e74\u9996\u5145","activityTabTitle":"\u9a6c\u5e74\u9996\u5145","starttime":1391097600,"endtime":1391140800,"isDefault":0,"isIcon":1,"order":228},{"_cls":"opctlCfg","activityId":"event_23992","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1396627200","endtime":"1396799940","isDefault":"0","isIcon":"1","order":"1338"},{"_cls":"opctlCfg","activityId":"event_146267","activityTitle":"\u6d88\u8d39\u6709\u597d\u793c","activityTabTitle":"\u6d88\u8d39\u6709\u597d\u793c","starttime":"1402243200","endtime":"1402415940","isDefault":"0","isIcon":"1","order":"1561"},{"_cls":"opctlCfg","activityId":"event_15085","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":1391788800,"endtime":1392047940,"isDefault":0,"isIcon":1,"order":247},{"_cls":"opctlCfg","activityId":"event_24056","activityTitle":"\u767e\u5143\u51b2\u51b2\u5145","activityTabTitle":"\u767e\u5143\u51b2\u51b2\u5145","starttime":"1397491200","endtime":"1397577540","isDefault":"0","isIcon":"1","order":"1371"},{"_cls":"opctlCfg","activityId":"event_147500","activityTitle":"\u64c2\u53f0\u7ade\u6280","activityTabTitle":"\u64c2\u53f0\u7ade\u6280\u573a","starttime":"1404748800","endtime":"1404921540","isDefault":"0","isIcon":"1","order":"1665"},{"_cls":"opctlCfg","activityId":"event_147498","activityTitle":"\u7d2f\u5145\u9ad8\u989d\u9001","activityTabTitle":"\u7d2f\u5145\u9ad8\u989d\u9001","starttime":"1404748800","endtime":"1404921540","isDefault":"0","isIcon":"1","order":"1663"},{"_cls":"opctlCfg","activityId":"event_15260","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7","starttime":1391961600,"endtime":1392047940,"isDefault":0,"isIcon":0,"order":250},{"_cls":"opctlCfg","activityId":"event_145905","activityTitle":"\u767e\u5143\u51b2\u51b2\u5145","activityTabTitle":"\u767e\u5143\u51b2\u51b2\u5145","starttime":"1401379200","endtime":"1401465540","isDefault":"0","isIcon":"1","order":"1527"},{"_cls":"opctlCfg","activityId":"event_13756","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c","starttime":1390233600,"endtime":1390319940,"isDefault":0,"isIcon":1,"order":199},{"_cls":"opctlCfg","activityId":"event_147377","activityTitle":"\u6d88\u8d39\u9886\u798f\u5229","activityTabTitle":"\u6d88\u8d39\u9886\u798f\u5229","starttime":"1404489600","endtime":"1404748740","isDefault":"0","isIcon":"1","order":"1653"},{"_cls":"opctlCfg","activityId":"event_24034","activityTitle":"\u5468\u4e00\u9996\u5145","activityTabTitle":"\u5468\u4e00\u9996\u5145","starttime":"1397404800","endtime":"1397491140","isDefault":"0","isIcon":"1","order":"1367"},{"_cls":"opctlCfg","activityId":"event_144431","activityTitle":"\u5468\u4e00\u9996\u5145","activityTabTitle":"\u5468\u4e00\u9996\u5145","starttime":"1398614400","endtime":"1398700740","isDefault":"0","isIcon":"1","order":"1411"},{"_cls":"opctlCfg","activityId":"event_14551","activityTitle":"\u8fde\u7eed\u767b\u5f55","activityTabTitle":"\u8fde\u7eed\u767b\u5f55","starttime":1391097600,"endtime":1391702340,"isDefault":0,"isIcon":0,"order":230},{"_cls":"opctlCfg","activityId":"event_17343","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":1393948800,"endtime":1394121540,"isDefault":0,"isIcon":1,"order":320},{"_cls":"opctlCfg","activityId":"event_15492","activityTitle":"\u60c5\u5143\u6d88\u8d39","activityTabTitle":"\u60c5\u5143\u6d88\u8d39","starttime":1392220800,"endtime":1392393540,"isDefault":0,"isIcon":1,"order":259},{"_cls":"opctlCfg","activityId":"event_147499","activityTitle":"\u6d88\u8d39\u6709\u597d\u793c","activityTabTitle":"\u6d88\u8d39\u6709\u597d\u793c","starttime":"1404748800","endtime":"1404921540","isDefault":"0","isIcon":"1","order":"1664"},{"_cls":"opctlCfg","activityId":"event_14829","activityTitle":"\u6625\u8282\u5145\u503c","activityTabTitle":"\u6625\u8282\u5145\u503c","starttime":1391443200,"endtime":1391702340,"isDefault":0,"isIcon":1,"order":237},{"_cls":"opctlCfg","activityId":"event_16357","activityTitle":"\u5468\u4e00\u9996\u5145","activityTabTitle":"\u5468\u4e00\u9996\u5145","starttime":1393171200,"endtime":1393257540,"isDefault":0,"isIcon":1,"order":287},{"_cls":"opctlCfg","activityId":"event_13782","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c","starttime":1390320000,"endtime":1390492740,"isDefault":0,"isIcon":1,"order":200},{"_cls":"opctlCfg","activityId":"event_144270","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":"1398268800","endtime":"1398441540","isDefault":"0","isIcon":"1","order":"1400"},{"_cls":"opctlCfg","activityId":"event_144267","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c\u4ee4\u724c\u5927\u793c","starttime":1398268800,"endtime":1398441540,"isDefault":0,"isIcon":1,"order":1399},{"_cls":"opctlCfg","activityId":"event_15463","activityTitle":"\u5355\u7b14\u5145\u503c","activityTabTitle":"\u5355\u7b14\u5145\u503c","starttime":1392220800,"endtime":1392307140,"isDefault":0,"isIcon":1,"order":258},{"_cls":"opctlCfg","activityId":"event_16888","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u6625\u9f99\u8282\u7d2f\u8ba1\u6d88\u8d39","starttime":1393603200,"endtime":1393862340,"isDefault":0,"isIcon":1,"order":309},{"_cls":"opctlCfg","activityId":"event_14998","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c","starttime":1391788800,"endtime":1392047940,"isDefault":0,"isIcon":1,"order":244},{"_cls":"opctlCfg","activityId":"event_14885","activityTitle":"\u6625\u8282\u9650\u8d2d","activityTabTitle":"\u6625\u8282\u9650\u8d2d","starttime":1391529600,"endtime":1391702340,"isDefault":0,"isIcon":0,"order":239},{"_cls":"opctlCfg","activityId":"event_18740","activityTitle":"\u5355\u7b14\u5145\u503c","activityTabTitle":"\u5355\u7b14\u5145\u503c","starttime":1394640000,"endtime":1394726340,"isDefault":0,"isIcon":1,"order":342},{"_cls":"opctlCfg","activityId":"event_19205","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":1394985600,"endtime":1395071940,"isDefault":0,"isIcon":1,"order":350},{"_cls":"opctlCfg","activityId":"event_147096","activityTitle":"\u5355\u5145\u540c\u5e86\u793c","activityTabTitle":"\u8fce\u515a\u7684\u751f\u65e5\u5355\u5145\u540c\u5e86\u793c","starttime":"1404057600","endtime":"1404143940","isDefault":"0","isIcon":"1","order":"1632"},{"_cls":"opctlCfg","activityId":"event_14523","activityTitle":"\u6bcf\u65e5\u7ea2\u5305","activityTabTitle":"\u6bcf\u65e5\u7ea2\u5305","starttime":1391097600,"endtime":1391702340,"isDefault":0,"isIcon":0,"order":229},{"_cls":"opctlCfg","activityId":"event_147092","activityTitle":"\u767e\u5143\u51b2\u51b2\u5145","activityTabTitle":"\u767e\u5143\u51b2\u51b2\u5145","starttime":"1403971200","endtime":"1404057540","isDefault":"0","isIcon":"1","order":"1628"},{"_cls":"opctlCfg","activityId":"event_24064","activityTitle":"\u5355\u7b14\u5145\u503c","activityTabTitle":"\u5355\u7b14\u5145\u503c","starttime":"1397750400","endtime":"1397836740","isDefault":"0","isIcon":"1","order":"1379"},{"_cls":"opctlCfg","activityId":"event_144432","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1398614400","endtime":"1398787140","isDefault":"0","isIcon":"1","order":"1412"},{"_cls":"opctlCfg","activityId":"event_146764","activityTitle":"\u52a0\u6536\u6709\u793c","activityTabTitle":"\u6606\u4ed1\u6728\u52a0\u6536\u6709\u793c","starttime":"1403280000","endtime":"1403452740","isDefault":"0","isIcon":"1","order":"1603"},{"_cls":"opctlCfg","activityId":"event_145097","activityTitle":"\u7d2f\u5145\u56de\u9988","activityTabTitle":"\u7d2f\u5145\u56de\u9988","starttime":"1399824000","endtime":"1400083140","isDefault":"0","isIcon":"1","order":"1458"},{"_cls":"opctlCfg","activityId":"event_16299","activityTitle":"\u5341\u5143\u51b2\u51b2\u51b2","activityTabTitle":"\u5341\u5143\u51b2\u51b2\u51b2","starttime":1392998400,"endtime":1393084740,"isDefault":0,"isIcon":1,"order":285},{"_cls":"opctlCfg","activityId":"event_23996","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1396800000","endtime":"1396886340","isDefault":"0","isIcon":"1","order":"1343"},{"_cls":"opctlCfg","activityId":"event_13703","activityTitle":"\u64c2\u53f0\u7ade\u6280","activityTabTitle":"\u64c2\u53f0\u7ade\u6280","starttime":1389974400,"endtime":1390147140,"isDefault":0,"isIcon":0,"order":197},{"_cls":"opctlCfg","activityId":"event_145307","activityTitle":"\u5355\u5145\u52a0\u6218\u529b","activityTabTitle":"\u5355\u5145\u52a0\u6218\u529b","starttime":"1400256000","endtime":"1400342340","isDefault":"0","isIcon":"1","order":"1483"},{"_cls":"opctlCfg","activityId":"event_14743","activityTitle":"\u6625\u8282\u9650\u8d2d","activityTabTitle":"\u6625\u8282\u9650\u8d2d","starttime":1391184000,"endtime":1391356740,"isDefault":0,"isIcon":1,"order":234},{"_cls":"opctlCfg","activityId":"event_145060","activityTitle":"\u64c2\u53f0\u7ade\u6280","activityTabTitle":"\u64c2\u53f0\u7ade\u6280\u573a","starttime":"1399651200","endtime":"1399823940","isDefault":"0","isIcon":"1","order":"1455"},{"_cls":"opctlCfg","activityId":"event_147074","activityTitle":"\u795e\u00b7\u7ae5\u59e5\u6765\u88ad","activityTabTitle":"\u4e00\u5927\u6ce2\u795e\u00b7\u7ae5\u59e5\u6765\u88ad","starttime":"1403798400","endtime":"1404057540","isDefault":"0","isIcon":"1","order":"1627"},{"_cls":"opctlCfg","activityId":"event_17374","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":1393948800,"endtime":1394121540,"isDefault":0,"isIcon":1,"order":321},{"_cls":"opctlCfg","activityId":"event_144261","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1398096000","endtime":"1398182340","isDefault":"0","isIcon":"1","order":"1393"},{"_cls":"opctlCfg","activityId":"event_52385","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":"1397836800","endtime":"1398095940","isDefault":"0","isIcon":"1","order":"1382"},{"_cls":"opctlCfg","activityId":"event_144782","activityTitle":"\u7d2f\u5145\u5927\u793c","activityTabTitle":"\u7d2f\u5145\u5927\u793c","starttime":"1399305600","endtime":"1399478340","isDefault":"0","isIcon":"1","order":"1441"},{"_cls":"opctlCfg","activityId":"event_147199","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1404144000","endtime":"1404230340","isDefault":"0","isIcon":"1","order":"1639"},{"_cls":"opctlCfg","activityId":"event_146524","activityTitle":"\u8fde\u7eed\u767b\u9646","activityTabTitle":"\u8fde\u7eed\u767b\u9646\u6709\u597d\u793c","starttime":"1402848000","endtime":"1403452740","isDefault":"0","isIcon":"1","order":"1586"},{"_cls":"opctlCfg","activityId":"event_145005","activityTitle":"\u5145\u503c\u8d60\u539a\u793c","activityTabTitle":"\u5145\u503c\u8d60\u539a\u793c","starttime":"1399564800","endtime":"1399823940","isDefault":"0","isIcon":"1","order":"1450"},{"_cls":"opctlCfg","activityId":"event_144556","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1398873600","endtime":"1398959940","isDefault":"0","isIcon":"1","order":"1421"},{"_cls":"opctlCfg","activityId":"event_146269","activityTitle":"\u5355\u5145\u52a0\u6218\u529b","activityTabTitle":"\u5355\u5145\u52a0\u6218\u529b","starttime":"1402243200","endtime":"1402329540","isDefault":"0","isIcon":"1","order":"1563"},{"_cls":"opctlCfg","activityId":"event_13808","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c","starttime":1390492800,"endtime":1390579140,"isDefault":0,"isIcon":1,"order":201},{"_cls":"opctlCfg","activityId":"event_145102","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1399824000","endtime":"1399910340","isDefault":"0","isIcon":"1","order":"1465"},{"_cls":"opctlCfg","activityId":"event_17312","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":1393948800,"endtime":1394035140,"isDefault":0,"isIcon":1,"order":319},{"_cls":"opctlCfg","activityId":"event_17468","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c","starttime":1395072000,"endtime":1395244740,"isDefault":0,"isIcon":1,"order":324},{"_cls":"opctlCfg","activityId":"event_16328","activityTitle":"\u5341\u5143\u51b2\u51b2\u51b22","activityTabTitle":"\u5341\u5143\u51b2\u51b2\u51b22","starttime":1393084800,"endtime":1393171140,"isDefault":0,"isIcon":1,"order":286},{"_cls":"opctlCfg","activityId":"event_20824","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":1395720000,"endtime":1395849540,"isDefault":0,"isIcon":1,"order":377},{"_cls":"opctlCfg","activityId":"event_16828","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c","starttime":1393603200,"endtime":1393862340,"isDefault":0,"isIcon":1,"order":307},{"_cls":"opctlCfg","activityId":"cdkey","activityTitle":"","activityTabTitle":"","starttime":1367358420,"endtime":1588542420,"isDefault":0,"isIcon":0,"order":0},{"_cls":"opctlCfg","activityId":"event_146765","activityTitle":"\u767e\u5143\u51b2\u51b2\u5145","activityTabTitle":"\u767e\u5143\u51b2\u51b2\u5145","starttime":"1403366400","endtime":"1403452740","isDefault":"0","isIcon":"1","order":"1604"},{"_cls":"opctlCfg","activityId":"event_18084","activityTitle":"\u8fde\u7eed\u767b\u9646","activityTabTitle":"\u8fde\u7eed\u767b\u5f55\u6709\u597d\u793c","starttime":1394380800,"endtime":1394985540,"isDefault":0,"isIcon":0,"order":335},{"_cls":"opctlCfg","activityId":"event_145488","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1400515200","endtime":"1400601540","isDefault":"0","isIcon":"1","order":"1494"},{"_cls":"opctlCfg","activityId":"event_24036","activityTitle":"\u8fde\u7eed\u767b\u9646","activityTabTitle":"\u8fde\u7eed\u767b\u9646\u6709\u597d\u793c","starttime":"1397404800","endtime":"1398009540","isDefault":"0","isIcon":"1","order":"1369"},{"_cls":"opctlCfg","activityId":"event_146503","activityTitle":"\u767e\u5143\u51b2\u51b2\u5145","activityTabTitle":"\u767e\u5143\u51b2\u51b2\u5145","starttime":"1402761600","endtime":"1402847940","isDefault":"0","isIcon":"1","order":"1582"},{"_cls":"opctlCfg","activityId":"event_23879","activityTitle":"\u5355\u7b14\u5145\u503c","activityTabTitle":"\u5355\u7b14\u5145\u503c","starttime":"1396022400","endtime":"1396195140","isDefault":"0","isIcon":"1","order":"1313"},{"_cls":"opctlCfg","activityId":"event_18053","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":1394380800,"endtime":1394467140,"isDefault":0,"isIcon":1,"order":334},{"_cls":"opctlCfg","activityId":"event_150003","activityTitle":"\u7d2f\u5145\u52a9\u6210\u957f","activityTabTitle":"\u7d2f\u5145\u52a9\u6210\u957f","starttime":"1404921600","endtime":"1405094340","isDefault":"0","isIcon":"1","order":"1670"},{"_cls":"opctlCfg","activityId":"event_146519","activityTitle":"\u7d2f\u5145\u9001\u597d\u793c","activityTabTitle":"\u7d2f\u5145\u9001\u597d\u793c","starttime":"1402848000","endtime":"1403020740","isDefault":"0","isIcon":"1","order":"1583"},{"_cls":"opctlCfg","activityId":"event_17530","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":1394121600,"endtime":1394380740,"isDefault":0,"isIcon":1,"order":326},{"_cls":"opctlCfg","activityId":"event_147568","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1404835200","endtime":"1404921540","isDefault":"0","isIcon":"1","order":"1668"},{"_cls":"opctlCfg","activityId":"event_145858","activityTitle":"\u5355\u5145\u9001\u798f\u5229","activityTabTitle":"\u5355\u5145\u9001\u798f\u5229","starttime":"1401292800","endtime":"1401379140","isDefault":"0","isIcon":"1","order":"1525"},{"_cls":"opctlCfg","activityId":"event_24002","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1396972800","endtime":"1397059140","isDefault":"0","isIcon":"1","order":"1350"},{"_cls":"opctlCfg","activityId":"dial","activityTitle":"","activityTabTitle":"","starttime":"1405612800","endtime":"1406044740","isDefault":"0","isIcon":"1","order":"1701"},{"_cls":"opctlCfg","activityId":"event_14635","activityTitle":"\u5145\u503c\u9001\u6a59\u88c5","activityTabTitle":"\u5145\u503c\u9001\u6a59\u88c5","starttime":1391184000,"endtime":1391356740,"isDefault":0,"isIcon":1,"order":232},{"_cls":"opctlCfg","activityId":"event_150094","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1405094400","endtime":"1405267140","isDefault":"0","isIcon":"1","order":"1680"},{"_cls":"opctlCfg","activityId":"event_146333","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1402329600","endtime":"1402415940","isDefault":"0","isIcon":"1","order":"1566"},{"_cls":"opctlCfg","activityId":"event_147251","activityTitle":"\u9650\u65f6\u5145\u503c","activityTabTitle":"\u9650\u65f6\u5145\u503c","starttime":"1404295200","endtime":"1404313200","isDefault":"0","isIcon":"1","order":"1643"},{"_cls":"opctlCfg","activityId":"event_146352","activityTitle":"\u7d2f\u5145\u9001\u4ee4\u724c","activityTabTitle":"\u7d2f\u5145\u9001\u4ee4\u724c","starttime":"1402416000","endtime":"1402588740","isDefault":"0","isIcon":"1","order":"1568"},{"_cls":"opctlCfg","activityId":"event_15056","activityTitle":"\u9650\u65f6\u5145\u503c","activityTabTitle":"\u9650\u65f6\u5145\u503c","starttime":1391940000,"endtime":1391950800,"isDefault":0,"isIcon":1,"order":246},{"_cls":"opctlCfg","activityId":"event_146068","activityTitle":"\u8fde\u7eed\u767b\u9646","activityTabTitle":"\u8fde\u7eed\u767b\u9646\u6709\u793c","starttime":"1401638400","endtime":"1402243140","isDefault":"0","isIcon":"1","order":"1543"},{"_cls":"opctlCfg","activityId":"event_146354","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1402416000","endtime":"1402502340","isDefault":"0","isIcon":"1","order":"1570"},{"_cls":"opctlCfg","activityId":"event_18958","activityTitle":"\u5355\u7b14\u5145\u503c","activityTabTitle":"\u767d\u8272\u60c5\u4eba\u8282\u5355\u7b14\u5145\u503c","starttime":1394726400,"endtime":1394899140,"isDefault":0,"isIcon":1,"order":345},{"_cls":"opctlCfg","activityId":"event_20506","activityTitle":"\u8fde\u7eed\u767b\u9646","activityTabTitle":"\u8fde\u7eed\u767b\u9646\u6709\u597d\u793c","starttime":1395590400,"endtime":1396195140,"isDefault":0,"isIcon":1,"order":370},{"_cls":"opctlCfg","activityId":"event_14301","activityTitle":"\u5145\u503c\u9001\u6a59\u88c5","activityTabTitle":"\u5145\u503c\u9001\u6a59\u88c5","starttime":1391011200,"endtime":1391183940,"isDefault":0,"isIcon":1,"order":220},{"_cls":"opctlCfg","activityId":"event_14193","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7","starttime":1390752000,"endtime":1390838340,"isDefault":0,"isIcon":0,"order":214},{"_cls":"opctlCfg","activityId":"event_144433","activityTitle":"\u8fde\u7eed\u767b\u9646","activityTabTitle":"\u8fde\u7eed\u767b\u9646\u6709\u597d\u793c","starttime":"1398614400","endtime":"1399219140","isDefault":"0","isIcon":"1","order":"1413"},{"_cls":"opctlCfg","activityId":"event_145680","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1400947200","endtime":"1401033540","isDefault":"0","isIcon":"1","order":"1510"},{"_cls":"opctlCfg","activityId":"event_17929","activityTitle":"\u9650\u65f6\u5145\u503c","activityTabTitle":"\u5987\u5973\u8282\u9650\u65f6\u5145\u503c","starttime":1394262000,"endtime":1394283600,"isDefault":0,"isIcon":1,"order":330},{"_cls":"opctlCfg","activityId":"event_18177","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":1394467200,"endtime":1394553540,"isDefault":0,"isIcon":1,"order":338},{"_cls":"opctlCfg","activityId":"event_146520","activityTitle":"\u6d88\u8d39\u4eab\u798f\u5229","activityTabTitle":"\u6d88\u8d39\u4eab\u798f\u5229","starttime":"1402848000","endtime":"1403020740","isDefault":"0","isIcon":"1","order":"1584"},{"_cls":"opctlCfg","activityId":"event_146133","activityTitle":"\u7d2f\u5145\u4eab\u798f\u5229","activityTabTitle":"\u7d2f\u5145\u4eab\u798f\u5229","starttime":"1401811200","endtime":"1401983940","isDefault":"0","isIcon":"1","order":"1547"},{"_cls":"opctlCfg","activityId":"event_24010","activityTitle":"\u5355\u7b14\u5145\u503c","activityTabTitle":"\u9ed1\u8272\u60c5\u4eba\u8282\u5355\u7b14\u5145\u503c","starttime":"1397232000","endtime":"1397404740","isDefault":"0","isIcon":"1","order":"1358"},{"_cls":"opctlCfg","activityId":"event_146852","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1403589600","endtime":"1403625540","isDefault":"0","isIcon":"1","order":"1611"},{"_cls":"opctlCfg","activityId":"event_147198","activityTitle":"\u6d88\u8d39\u6709\u798f\u5229","activityTabTitle":"\u6d88\u8d39\u6709\u798f\u5229","starttime":"1404144000","endtime":"1404316740","isDefault":"0","isIcon":"1","order":"1637"},{"_cls":"opctlCfg","activityId":"event_23990","activityTitle":"\u5355\u7b14\u5145\u503c","activityTabTitle":"\u5355\u7b14\u5145\u503c","starttime":"1396627200","endtime":"1396713540","isDefault":"0","isIcon":"1","order":"1336"},{"_cls":"opctlCfg","activityId":"event_145098","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1399824000","endtime":"1399910340","isDefault":"0","isIcon":"1","order":"1459"},{"_cls":"opctlCfg","activityId":"event_146769","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1403452800","endtime":"1403625540","isDefault":"0","isIcon":"0","order":"1608"},{"_cls":"opctlCfg","activityId":"event_16211","activityTitle":"\u6bcf\u65e5\u6d88\u8d39","activityTabTitle":"\u6bcf\u65e5\u6d88\u8d39\u9886\u597d\u793c","starttime":1392912000,"endtime":1392998340,"isDefault":0,"isIcon":1,"order":283},{"_cls":"opctlCfg","activityId":"event_19619","activityTitle":"\u64c2\u53f0\u7ade\u6280","activityTabTitle":"\u64c2\u53f0\u7ade\u6280","starttime":1395072000,"endtime":1395244740,"isDefault":0,"isIcon":1,"order":357},{"_cls":"opctlCfg","activityId":"event_145938","activityTitle":"\u6d88\u8d39\u798f\u5229","activityTabTitle":"\u6d88\u8d39\u798f\u5229","starttime":"1401465600","endtime":"1401551940","isDefault":"0","isIcon":"1","order":"1529"},{"_cls":"opctlCfg","activityId":"event_15815","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":1392393600,"endtime":1392652740,"isDefault":0,"isIcon":1,"order":268},{"_cls":"opctlCfg","activityId":"event_145760","activityTitle":"\u8fde\u7eed\u767b\u9646","activityTabTitle":"\u8fde\u7eed\u767b\u9646\u6709\u597d\u793c","starttime":"1401033600","endtime":"1401638340","isDefault":"0","isIcon":"1","order":"1516"},{"_cls":"opctlCfg","activityId":"event_17221","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c","starttime":1393862400,"endtime":1393948740,"isDefault":0,"isIcon":1,"order":316},{"_cls":"opctlCfg","activityId":"event_150002","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1404921600","endtime":"1405007940","isDefault":"0","isIcon":"1","order":"1669"},{"_cls":"opctlCfg","activityId":"event_145658","activityTitle":"\u52a0\u6536\u6709\u793c","activityTabTitle":"\u6606\u4ed1\u6728\u52a0\u6536\u6709\u793c","starttime":"1400725800","endtime":"1400860740","isDefault":"0","isIcon":"1","order":"1504"},{"_cls":"opctlCfg","activityId":"event_144745","activityTitle":"\u8fde\u7eed\u767b\u9646","activityTabTitle":"\u8fde\u7eed\u767b\u9646\u6709\u597d\u793c","starttime":"1399219200","endtime":"1399823940","isDefault":"0","isIcon":"1","order":"1439"},{"_cls":"opctlCfg","activityId":"event_14412","activityTitle":"\u6625\u8282\u6d88\u8d39","activityTabTitle":"\u6625\u8282\u6d88\u8d39","starttime":1391011200,"endtime":1391183940,"isDefault":0,"isIcon":1,"order":223},{"_cls":"opctlCfg","activityId":"event_23880","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":"1396022400","endtime":"1396281540","isDefault":"0","isIcon":"1","order":"1314"},{"_cls":"opctlCfg","activityId":"event_23993","activityTitle":"\u767b\u9646\u793c\u5305","activityTabTitle":"\u7948\u798f\u793c\u5305","starttime":"1396594800","endtime":"1396713540","isDefault":"0","isIcon":"1","order":"1340"},{"_cls":"opctlCfg","activityId":"event_14139","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":1390579200,"endtime":1390838340,"isDefault":0,"isIcon":1,"order":212},{"_cls":"opctlCfg","activityId":"event_144260","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":"1398096000","endtime":"1398268740","isDefault":"0","isIcon":"1","order":"1392"},{"_cls":"opctlCfg","activityId":"event_14579","activityTitle":"\u6625\u8282\u5145\u503c","activityTabTitle":"\u6625\u8282\u5145\u503c","starttime":1391184000,"endtime":1391443140,"isDefault":0,"isIcon":1,"order":231},{"_cls":"opctlCfg","activityId":"event_146853","activityTitle":"\u5145\u5145\u6b22\u4e50\u9001","activityTabTitle":"\u5145\u5145\u6b22\u4e50\u9001","starttime":"1403625600","endtime":"1403798340","isDefault":"0","isIcon":"1","order":"1612"},{"_cls":"opctlCfg","activityId":"event_15521","activityTitle":"\u60c5\u5143\u9650\u8d2d\u793c\u5305","activityTabTitle":"\u60c5\u5143\u9650\u8d2d\u793c\u5305","starttime":1392220800,"endtime":1392393540,"isDefault":0,"isIcon":0,"order":260},{"_cls":"opctlCfg","activityId":"event_23884","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1396195200","endtime":"1396281540","isDefault":"0","isIcon":"1","order":"1320"},{"_cls":"opctlCfg","activityId":"event_145547","activityTitle":"\u6d88\u8d39\u4eab\u798f\u5229","activityTabTitle":"\u6d88\u8d39\u4eab\u798f\u5229","starttime":"1400601600","endtime":"1400860740","isDefault":"0","isIcon":"1","order":"1496"},{"_cls":"opctlCfg","activityId":"event_146610","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1403020800","endtime":"1403107140","isDefault":"0","isIcon":"1","order":"1593"},{"_cls":"opctlCfg","activityId":"event_15550","activityTitle":"\u60c5\u5143\u767b\u5f55\u793c\u5305","activityTabTitle":"\u60c5\u5143\u767b\u5f55\u793c\u5305","starttime":1392134400,"endtime":1392393540,"isDefault":0,"isIcon":0,"order":261},{"_cls":"opctlCfg","activityId":"event_20823","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":1395720000,"endtime":1395763140,"isDefault":0,"isIcon":1,"order":376},{"_cls":"opctlCfg","activityId":"event_144783","activityTitle":"\u6d88\u8d39\u798f\u5229","activityTabTitle":"\u6d88\u8d39\u798f\u5229","starttime":"1399305600","endtime":"1399478340","isDefault":"0","isIcon":"1","order":"1442"},{"_cls":"opctlCfg","activityId":"event_150093","activityTitle":"\u767e\u5143\u51b2\u51b2\u5145","activityTabTitle":"\u767e\u5143\u51b2\u51b2\u5145","starttime":"1405094400","endtime":"1405180740","isDefault":"0","isIcon":"1","order":"1678"},{"_cls":"opctlCfg","activityId":"event_147260","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1404316800","endtime":"1404403140","isDefault":"0","isIcon":"1","order":"1648"},{"_cls":"opctlCfg","activityId":"event_146101","activityTitle":"\u201c\u516d\u00b7\u4e00\u201d\u9001\u5b9d\u77f3","activityTabTitle":"\u201c\u516d\u00b7\u4e00\u201d\u9001\u5b9d\u77f3","starttime":"1401724800","endtime":"1401811140","isDefault":"0","isIcon":"1","order":"1546"},{"_cls":"opctlCfg","activityId":"event_19384","activityTitle":"\u8fde\u7eed\u767b\u9646","activityTabTitle":"\u8fde\u7eed\u767b\u5f55\u6709\u597d\u793c","starttime":1394985600,"endtime":1395590340,"isDefault":0,"isIcon":0,"order":353},{"_cls":"opctlCfg","activityId":"event_16735","activityTitle":"\u5faa\u73af\u5145\u503c","activityTabTitle":"\u5faa\u73af\u5145\u503c","starttime":1393430400,"endtime":1393603140,"isDefault":0,"isIcon":1,"order":302},{"_cls":"opctlCfg","activityId":"event_144259","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c","starttime":"1398096000","endtime":"1398268740","isDefault":"0","isIcon":"1","order":"1391"},{"_cls":"opctlCfg","activityId":"event_144554","activityTitle":"51%\u7279\u60e0\u8fd4\u5229","activityTabTitle":"51%\u7279\u60e0\u8fd4\u5229","starttime":"1398873600","endtime":"1399132740","isDefault":"0","isIcon":"1","order":"1419"},{"_cls":"opctlCfg","activityId":"event_147501","activityTitle":"\u9650\u65f6\u7279\u60e0","activityTabTitle":"\u75af\u72c2\u8ba9\u5229\u9650\u65f6\u7279\u60e0","starttime":"1404813600","endtime":"1404831600","isDefault":"0","isIcon":"1","order":"1666"},{"_cls":"opctlCfg","activityId":"event_147481","activityTitle":"\u9650\u65f6\u5145\u503c","activityTabTitle":"\u9650\u65f6\u5145\u503c","starttime":"1404723600","endtime":"1404745200","isDefault":"0","isIcon":"1","order":"1662"},{"_cls":"opctlCfg","activityId":"event_146609","activityTitle":"\u6d88\u8d39\u6709\u597d\u793c","activityTabTitle":"\u6d88\u8d39\u6709\u597d\u793c","starttime":"1403020800","endtime":"1403193540","isDefault":"0","isIcon":"1","order":"1592"},{"_cls":"opctlCfg","activityId":"event_15990","activityTitle":"\u52a0\u6536\u6709\u793c","activityTabTitle":"\u52a0\u6536\u6709\u793c","starttime":1392652800,"endtime":1392825540,"isDefault":0,"isIcon":0,"order":276},{"_cls":"opctlCfg","activityId":"event_20390","activityTitle":"\u5355\u7b14\u5145\u503c","activityTabTitle":"\u5355\u7b14\u5145\u503c","starttime":1395590400,"endtime":1395676740,"isDefault":0,"isIcon":1,"order":368},{"_cls":"opctlCfg","activityId":"event_146202","activityTitle":"\u5355\u5145\u9988\u8d60","activityTabTitle":"\u5355\u5145\u9988\u8d60","starttime":"1401984000","endtime":"1402156740","isDefault":"0","isIcon":"1","order":"1554"},{"_cls":"opctlCfg","activityId":"event_17960","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c","starttime":1394380800,"endtime":1394467140,"isDefault":0,"isIcon":1,"order":331},{"_cls":"opctlCfg","activityId":"event_19920","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":1395244800,"endtime":1395417540,"isDefault":0,"isIcon":1,"order":362},{"_cls":"opctlCfg","activityId":"mayday","activityTitle":"","activityTabTitle":"","starttime":"1405612800","endtime":"1405871940","isDefault":"0","isIcon":"1","order":"1703"},{"_cls":"opctlCfg","activityId":"event_23887","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1396368000","endtime":"1396454340","isDefault":"0","isIcon":"1","order":"1323"},{"_cls":"opctlCfg","activityId":"event_145006","activityTitle":"\u6d88\u8d39\u4eab\u798f\u5229","activityTabTitle":"\u6d88\u8d39\u4eab\u798f\u5229","starttime":"1399564800","endtime":"1399823940","isDefault":"0","isIcon":"1","order":"1451"},{"_cls":"opctlCfg","activityId":"event_14246","activityTitle":"\u6625\u8282\u5145\u503c","activityTabTitle":"\u6625\u8282\u5145\u503c","starttime":1391011200,"endtime":1391183940,"isDefault":0,"isIcon":1,"order":218},{"_cls":"opctlCfg","activityId":"event_24006","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":"1397059200","endtime":"1397231940","isDefault":"0","isIcon":"1","order":"1354"},{"_cls":"opctlCfg","activityId":"event_24033","activityTitle":"\u9650\u65f6\u5145\u503c","activityTabTitle":"\u9ed1\u8272\u60c5\u4eba\u8282\u9650\u65f6\u5145\u503c","starttime":"1397458800","endtime":"1397487600","isDefault":"0","isIcon":"1","order":"1366"},{"_cls":"opctlCfg","activityId":"event_145416","activityTitle":"\u7d2f\u5145\u4eab\u798f\u5229","activityTabTitle":"\u7d2f\u5145\u4eab\u798f\u5229","starttime":"1400428800","endtime":"1400601540","isDefault":"0","isIcon":"1","order":"1490"},{"_cls":"opctlCfg","activityId":"event_146854","activityTitle":"\u8d25\u5bb6\u6709\u8fd4\u5229","activityTabTitle":"\u8d25\u5bb6\u6709\u8fd4\u5229","starttime":"1403625600","endtime":"1403798340","isDefault":"0","isIcon":"1","order":"1613"},{"_cls":"opctlCfg","activityId":"event_145761","activityTitle":"\u5355\u5145\u798f\u5229","activityTabTitle":"\u5355\u5145\u798f\u5229","starttime":"1588521600","endtime":"1588607940","isDefault":"0","isIcon":"1","order":"1517"},{"_cls":"opctlCfg","activityId":"event_14166","activityTitle":"\u64c2\u53f0\u7ade\u6280","activityTabTitle":"\u64c2\u53f0\u7ade\u6280","starttime":1390579200,"endtime":1390751940,"isDefault":0,"isIcon":0,"order":213},{"_cls":"opctlCfg","activityId":"event_150006","activityTitle":"\u5355\u5145\u6709\u793c","activityTabTitle":"\u5353\u8d8a\u679c\u5b9e\u5355\u5145\u793c","starttime":"1404921600","endtime":"1405007940","isDefault":"0","isIcon":"1","order":"1673"},{"_cls":"opctlCfg","activityId":"event_145641","activityTitle":"\u52a0\u6536\u6709\u793c","activityTabTitle":"\u6606\u4ed1\u6728\u52a0\u6536\u6709\u793c","starttime":"1588521600","endtime":"1589158800","isDefault":"0","isIcon":"1","order":"1502"},{"_cls":"opctlCfg","activityId":"recruit","activityTitle":"","activityTabTitle":"","starttime":1369128060,"endtime":1588584060,"isDefault":0,"isIcon":0,"order":0},{"_cls":"opctlCfg","activityId":"event_144674","activityTitle":"\u5355\u5145\u4eab\u798f\u5229","activityTabTitle":"\u5355\u5145\u4eab\u798f\u5229","starttime":"1399132800","endtime":"1399219140","isDefault":"0","isIcon":"1","order":"1433"},{"_cls":"opctlCfg","activityId":"event_17991","activityTitle":"\u5355\u7b14\u5145\u503c","activityTabTitle":"\u5355\u7b14\u5145\u503c","starttime":1394380800,"endtime":1394467140,"isDefault":0,"isIcon":1,"order":332},{"_cls":"opctlCfg","activityId":"event_147005","activityTitle":"\u7ed9\u529b\u56de\u9988","activityTabTitle":"\u6708\u672b\u5145\u503c\u7ed9\u529b\u56de\u9988","starttime":"1403798400","endtime":"1404057540","isDefault":"0","isIcon":"1","order":"1619"},{"_cls":"opctlCfg","activityId":"event_145840","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7","starttime":"1401206400","endtime":"1401292740","isDefault":"0","isIcon":"1","order":"1522"},{"_cls":"opctlCfg","activityId":"event_146591","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1402934400","endtime":"1403020740","isDefault":"0","isIcon":"1","order":"1590"},{"_cls":"opctlCfg","activityId":"event_14857","activityTitle":"\u5145\u503c\u9001\u6a59\u88c5","activityTabTitle":"\u5145\u503c\u9001\u6a59\u88c5","starttime":1391529600,"endtime":1391702340,"isDefault":0,"isIcon":1,"order":238},{"_cls":"opctlCfg","activityId":"event_146678","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1403107200","endtime":"1403193540","isDefault":"0","isIcon":"1","order":"1596"},{"_cls":"opctlCfg","activityId":"event_146249","activityTitle":"\u767e\u5143\u51b2\u51b2\u5145","activityTabTitle":"\u767e\u5143\u51b2\u51b2\u5145","starttime":"1402156800","endtime":"1402243140","isDefault":"0","isIcon":"1","order":"1558"},{"_cls":"opctlCfg","activityId":"event_145939","activityTitle":"\u5355\u5145\u63d0\u6218\u529b","activityTabTitle":"\u5355\u5145\u63d0\u6218\u529b","starttime":"1401465600","endtime":"1401551940","isDefault":"0","isIcon":"1","order":"1530"},{"_cls":"opctlCfg","activityId":"event_24013","activityTitle":"\u5927\u8f6c\u76d8","activityTabTitle":"\u9ed1\u8272\u60c5\u4eba\u8282\u5927\u8f6c\u76d8","starttime":"1397232000","endtime":"1397491140","isDefault":"0","isIcon":"1","order":"1363"},{"_cls":"opctlCfg","activityId":"event_146770","activityTitle":"\u8fde\u7eed\u767b\u9646","activityTabTitle":"\u8fde\u7eed\u767b\u5f55\u6709\u597d\u793c","starttime":"1403452800","endtime":"1404057540","isDefault":"0","isIcon":"1","order":"1609"},{"_cls":"opctlCfg","activityId":"event_144931","activityTitle":"\u6d88\u8d39\u798f\u5229","activityTabTitle":"\u6d88\u8d39\u798f\u5229","starttime":"1399478400","endtime":"1399564740","isDefault":"0","isIcon":"1","order":"1447"},{"_cls":"opctlCfg","activityId":"event_146200","activityTitle":"\u6d88\u8d39\u4eab\u798f\u5229","activityTabTitle":"\u6d88\u8d39\u4eab\u798f\u5229","starttime":"1401984000","endtime":"1402243140","isDefault":"0","isIcon":"1","order":"1553"},{"_cls":"opctlCfg","activityId":"event_24009","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u9ed1\u8272\u60c5\u4eba\u8282\u7d2f\u8ba1\u5145\u503c","starttime":"1397232000","endtime":"1397491140","isDefault":"0","isIcon":"1","order":"1357"},{"_cls":"opctlCfg","activityId":"event_147446","activityTitle":"\u8fde\u7eed\u767b\u5f55","activityTabTitle":"\u8fde\u7eed\u767b\u5f55\u6709\u597d\u793c","starttime":"1404662400","endtime":"1405267140","isDefault":"0","isIcon":"1","order":"1659"},{"_cls":"opctlCfg","activityId":"event_146771","activityTitle":"\u5355\u5145\u8fd4\u5229","activityTabTitle":"\u5355\u5145\u8fd4\u5229","starttime":"1403452800","endtime":"1403539140","isDefault":"0","isIcon":"1","order":"1610"},{"_cls":"opctlCfg","activityId":"event_145857","activityTitle":"\u6d88\u8d39\u6709\u597d\u793c","activityTabTitle":"\u6d88\u8d39\u6709\u597d\u793c","starttime":"1401292800","endtime":"1401465540","isDefault":"0","isIcon":"1","order":"1524"},{"_cls":"opctlCfg","activityId":"event_146271","activityTitle":"\u8fde\u7eed\u767b\u9646","activityTabTitle":"\u8fde\u7eed\u767b\u9646\u6709\u597d\u793c","starttime":"1402243200","endtime":"1402847940","isDefault":"0","isIcon":"1","order":"1564"},{"_cls":"opctlCfg","activityId":"event_146856","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1403625600","endtime":"1403798340","isDefault":"0","isIcon":"1","order":"1615"},{"_cls":"opctlCfg","activityId":"event_145285","activityTitle":"\u767e\u5143\u51b2\u51b2\u5145","activityTabTitle":"\u767e\u5143\u51b2\u51b2\u5145","starttime":"1400169600","endtime":"1400255940","isDefault":"0","isIcon":"1","order":"1478"},{"_cls":"opctlCfg","activityId":"event_145175","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1399910400","endtime":"1400083140","isDefault":"0","isIcon":"1","order":"1471"},{"_cls":"opctlCfg","activityId":"event_20766","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":1395676800,"endtime":1395849540,"isDefault":0,"isIcon":1,"order":374},{"_cls":"opctlCfg","activityId":"event_144272","activityTitle":"\u5355\u7b14\u5145\u503c","activityTabTitle":"\u5355\u7b14\u5145\u503c","starttime":"1398268800","endtime":"1398355140","isDefault":"0","isIcon":"1","order":"1402"},{"_cls":"opctlCfg","activityId":"event_24005","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c\u5143\u5b9d\u793c","starttime":"1397059200","endtime":"1397231940","isDefault":"0","isIcon":"1","order":"1353"},{"_cls":"opctlCfg","activityId":"event_145306","activityTitle":"\u6d88\u8d39\u597d\u793c","activityTabTitle":"\u6d88\u8d39\u597d\u793c","starttime":"1400256000","endtime":"1400428740","isDefault":"0","isIcon":"1","order":"1482"},{"_cls":"opctlCfg","activityId":"event_145487","activityTitle":"\u767b\u9646\u793c\u5305","activityTabTitle":"\u201c5\u00b720\u201d\u767b\u9646\u793c\u5305","starttime":"1400504400","endtime":"1400601540","isDefault":"0","isIcon":"0","order":"1493"},{"_cls":"opctlCfg","activityId":"event_144651","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1399046400","endtime":"1399132740","isDefault":"0","isIcon":"1","order":"1428"},{"_cls":"opctlCfg","activityId":"event_145762","activityTitle":"\u64c2\u53f0\u7ade\u6280","activityTabTitle":"\u64c2\u53f0\u7ade\u6280\u573a","starttime":"1401033600","endtime":"1401206340","isDefault":"0","isIcon":"1","order":"1518"},{"_cls":"opctlCfg","activityId":"event_144930","activityTitle":"\u7d2f\u5145\u597d\u793c","activityTabTitle":"\u7d2f\u5145\u597d\u793c","starttime":"1399478400","endtime":"1399564740","isDefault":"0","isIcon":"1","order":"1446"},{"_cls":"opctlCfg","activityId":"event_146971","activityTitle":"\u9650\u65f6\u62a2\u8d2d","activityTabTitle":"\u559c\u5927\u666e\u5954\u9650\u65f6\u62a2\u8d2d","starttime":"1403776800","endtime":"1403794800","isDefault":"0","isIcon":"1","order":"1617"},{"_cls":"opctlCfg","activityId":"event_20449","activityTitle":"\u5468\u4e00\u9996\u5145","activityTabTitle":"\u5468\u4e00\u9996\u5145","starttime":1395590400,"endtime":1395676740,"isDefault":0,"isIcon":1,"order":369},{"_cls":"opctlCfg","activityId":"event_23991","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":"1396627200","endtime":"1396886340","isDefault":"0","isIcon":"1","order":"1337"},{"_cls":"opctlCfg","activityId":"event_145550","activityTitle":"\u9650\u65f6\u5145\u503c","activityTabTitle":"\u201c\u5c0f\u6ee1\u201d\u9650\u65f6\u5145\u503c","starttime":"1400637600","endtime":"1400684340","isDefault":"0","isIcon":"1","order":"1501"},{"_cls":"opctlCfg","activityId":"event_145007","activityTitle":"\u611f\u6069\u793c\u5305","activityTabTitle":"\u6bcd\u4eb2\u8282\u767b\u9646\u611f\u6069\u793c\u5305","starttime":"1399546800","endtime":"1399823940","isDefault":"0","isIcon":"1","order":"1452"},{"_cls":"opctlCfg","activityId":"event_20037","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c","starttime":1395417600,"endtime":1395676740,"isDefault":0,"isIcon":1,"order":364},{"_cls":"opctlCfg","activityId":"event_24062","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":"1397664000","endtime":"1397836740","isDefault":"0","isIcon":"1","order":"1377"},{"_cls":"opctlCfg","activityId":"event_18022","activityTitle":"\u5468\u4e00\u9996\u5145","activityTabTitle":"\u5468\u4e00\u9996\u5145","starttime":1394380800,"endtime":1394467140,"isDefault":0,"isIcon":1,"order":333},{"_cls":"opctlCfg","activityId":"event_14385","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":1390838400,"endtime":1391011140,"isDefault":0,"isIcon":1,"order":222},{"_cls":"opctlCfg","activityId":"event_16049","activityTitle":"\u5faa\u73af\u5145\u503c","activityTabTitle":"\u5faa\u73af\u5145\u503c","starttime":1392825600,"endtime":1392998340,"isDefault":0,"isIcon":1,"order":278},{"_cls":"opctlCfg","activityId":"event_23986","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1396454400","endtime":"1396627140","isDefault":"0","isIcon":"1","order":"1332"},{"_cls":"opctlCfg","activityId":"event_18146","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u690d\u6811\u8282\u7d2f\u8ba1\u6d88\u8d39","starttime":1394467200,"endtime":1394726340,"isDefault":0,"isIcon":1,"order":337},{"_cls":"opctlCfg","activityId":"event_13625","activityTitle":"\u9650\u65f6\u5145\u503c","activityTabTitle":"\u9650\u65f6\u5145\u503c","starttime":1390039200,"endtime":1390050000,"isDefault":0,"isIcon":1,"order":194},{"_cls":"opctlCfg","activityId":"event_146182","activityTitle":"\u5355\u5145\u5927\u793c","activityTabTitle":"\u5355\u5145\u5927\u793c","starttime":"1401897600","endtime":"1401983940","isDefault":"0","isIcon":"1","order":"1551"},{"_cls":"opctlCfg","activityId":"event_146135","activityTitle":"\u767e\u5143\u51b2\u51b2\u5145","activityTabTitle":"\u767e\u5143\u51b2\u51b2\u5145","starttime":"1401811200","endtime":"1401897540","isDefault":"0","isIcon":"1","order":"1549"},{"_cls":"opctlCfg","activityId":"event_147585","activityTitle":"ewwsfsdf","activityTabTitle":"sedwet","starttime":"1436159160","endtime":"1467608760","isDefault":"0","isIcon":"0","order":"0"},{"_cls":"opctlCfg","activityId":"event_19143","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c","starttime":1394985600,"endtime":1395071940,"isDefault":0,"isIcon":1,"order":348},{"_cls":"opctlCfg","activityId":"event_145988","activityTitle":"\u201c\u516d\u00b7\u4e00\u201d\u9001\u4ee4\u724c","activityTabTitle":"\u201c\u516d\u00b7\u4e00\u201d\u9001\u4ee4\u724c","starttime":"1401552000","endtime":"1401811140","isDefault":"0","isIcon":"1","order":"1534"},{"_cls":"opctlCfg","activityId":"event_23995","activityTitle":"\u5468\u4e00\u9996\u5145","activityTabTitle":"\u5468\u4e00\u9996\u5145","starttime":"1396800000","endtime":"1396886340","isDefault":"0","isIcon":"1","order":"1342"},{"_cls":"opctlCfg","activityId":"event_145937","activityTitle":"\u7d2f\u5145\u597d\u793c","activityTabTitle":"\u7d2f\u5145\u597d\u793c","starttime":"1401465600","endtime":"1401551940","isDefault":"0","isIcon":"1","order":"1528"},{"_cls":"opctlCfg","activityId":"event_13964","activityTitle":"\u52a0\u6536\u6709\u793c","activityTabTitle":"\u52a0\u6536\u6709\u793c","starttime":1390233600,"endtime":1390406340,"isDefault":0,"isIcon":0,"order":206},{"_cls":"opctlCfg","activityId":"event_23881","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1396022400","endtime":"1396195140","isDefault":"0","isIcon":"1","order":"1315"},{"_cls":"opctlCfg","activityId":"event_144266","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c\u9053\u5177\u5927\u793c","starttime":"1398268800","endtime":"1398441540","isDefault":"0","isIcon":"1","order":"1398"},{"_cls":"opctlCfg","activityId":"consumerank","activityTitle":"","activityTabTitle":"","starttime":"1405094400","endtime":"1405526340","isDefault":"0","isIcon":"1","order":"1679"},{"_cls":"opctlCfg","activityId":"event_14467","activityTitle":"\u6625\u8282\u9650\u8d2d\u793c\u5305","activityTabTitle":"\u6625\u8282\u9650\u8d2d\u793c\u5305","starttime":1391011200,"endtime":1391183940,"isDefault":0,"isIcon":0,"order":225},{"_cls":"opctlCfg","activityId":"event_144237","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1398009600","endtime":"1398095940","isDefault":"0","isIcon":"1","order":"1389"},{"_cls":"opctlCfg","activityId":"event_150159","activityTitle":"\u5355\u7b14\u5145\u503c","activityTabTitle":"\u5355\u7b14\u5145\u503c","starttime":"1405180800","endtime":"1405267140","isDefault":"0","isIcon":"1","order":"1682"},{"_cls":"opctlCfg","activityId":"event_146332","activityTitle":"\u64c2\u53f0\u7ade\u6280","activityTabTitle":"\u64c2\u53f0\u7ade\u6280\u573a","starttime":"1402329600","endtime":"1402502340","isDefault":"0","isIcon":"1","order":"1565"},{"_cls":"opctlCfg","activityId":"event_14941","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c","starttime":1391702400,"endtime":1391788740,"isDefault":0,"isIcon":1,"order":241},{"_cls":"opctlCfg","activityId":"event_146250","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1402156800","endtime":"1402329540","isDefault":"0","isIcon":"1","order":"1559"},{"_cls":"opctlCfg","activityId":"event_145193","activityTitle":"\u767e\u5143\u51b2\u51b2\u5145","activityTabTitle":"\u767e\u5143\u51b2\u51b2\u5145","starttime":"1399996800","endtime":"1400083140","isDefault":"0","isIcon":"1","order":"1472"},{"_cls":"opctlCfg","activityId":"valentines","activityTitle":"","activityTabTitle":"","starttime":1392307200,"endtime":1392825540,"isDefault":0,"isIcon":0,"order":263},{"_cls":"opctlCfg","activityId":"event_145308","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1400256000","endtime":"1400428740","isDefault":"0","isIcon":"1","order":"1484"},{"_cls":"opctlCfg","activityId":"event_24012","activityTitle":"\u767b\u9646\u6709\u793c","activityTabTitle":"\u9ed1\u8272\u60c5\u4eba\u8282\u767b\u9646\u793c","starttime":"1397210400","endtime":"1397491140","isDefault":"0","isIcon":"1","order":"1361"},{"_cls":"opctlCfg","activityId":"event_23890","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u611a\u4eba\u8282\u7d2f\u8ba1\u5145\u503c","starttime":"1396281600","endtime":"1396454340","isDefault":"0","isIcon":"1","order":"1327"},{"_cls":"opctlCfg","activityId":"event_24072","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c","starttime":"1397836800","endtime":"1398095940","isDefault":"0","isIcon":"1","order":"1381"},{"_cls":"opctlCfg","activityId":"event_144935","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1399478400","endtime":"1399651140","isDefault":"0","isIcon":"1","order":"1449"},{"_cls":"opctlCfg","activityId":"event_150090","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1405008000","endtime":"1405094340","isDefault":"0","isIcon":"1","order":"1675"},{"_cls":"opctlCfg","activityId":"event_15844","activityTitle":"\u64c2\u53f0\u7ade\u6280","activityTabTitle":"\u64c2\u53f0\u7ade\u6280","starttime":1392393600,"endtime":1392566340,"isDefault":0,"isIcon":0,"order":269},{"_cls":"opctlCfg","activityId":"event_147257","activityTitle":"\u7d2f\u5145\u83b7\u8fd4\u5229","activityTabTitle":"\u7d2f\u5145\u83b7\u8fd4\u5229","starttime":"1404316800","endtime":"1404489540","isDefault":"0","isIcon":"1","order":"1645"},{"_cls":"opctlCfg","activityId":"event_23679","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":1395763200,"endtime":1395849540,"isDefault":0,"isIcon":1,"order":378},{"_cls":"opctlCfg","activityId":"event_145990","activityTitle":"\u64c2\u53f0\u7ade\u6280","activityTabTitle":"\u64c2\u53f0\u7ade\u6280\u573a","starttime":"1401552000","endtime":"1401724740","isDefault":"0","isIcon":"1","order":"1537"},{"_cls":"opctlCfg","activityId":"event_24014","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1397232000","endtime":"1397404740","isDefault":"0","isIcon":"1","order":"1364"},{"_cls":"opctlCfg","activityId":"event_146487","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1402675200","endtime":"1402847940","isDefault":"0","isIcon":"1","order":"1581"},{"_cls":"opctlCfg","activityId":"event_145659","activityTitle":"\u7d2f\u5145\u5927\u793c","activityTabTitle":"\u7d2f\u5145\u7279\u60e0\u4e00\u65e5\u793c","starttime":"1400814000","endtime":"1400860740","isDefault":"0","isIcon":"1","order":"1505"},{"_cls":"opctlCfg","activityId":"event_147379","activityTitle":"\u9650\u65f6\u7279\u60e0","activityTabTitle":"\u75af\u72c2\u8ba9\u5229\u9650\u65f6\u7279\u60e0","starttime":"1404554400","endtime":"1404572400","isDefault":"0","isIcon":"1","order":"1655"},{"_cls":"opctlCfg","activityId":"event_17071","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":1393776000,"endtime":1393948740,"isDefault":0,"isIcon":0,"order":314},{"_cls":"opctlCfg","activityId":"event_145231","activityTitle":"\u5355\u5145\u8fd4\u5143\u5b9d","activityTabTitle":"\u5355\u5145\u8fd4\u5143\u5b9d","starttime":"1400083200","endtime":"1400169540","isDefault":"0","isIcon":"1","order":"1475"},{"_cls":"opctlCfg","activityId":"event_145305","activityTitle":"\u7d2f\u5145\u4ee4\u724c\u793c","activityTabTitle":"\u7d2f\u5145\u4ee4\u724c\u793c","starttime":"1400256000","endtime":"1400428740","isDefault":"0","isIcon":"1","order":"1481"},{"_cls":"opctlCfg","activityId":"event_52414","activityTitle":"\u5468\u4e00\u9996\u5145","activityTabTitle":"\u5468\u4e00\u9996\u5145","starttime":"1398009600","endtime":"1398095940","isDefault":"0","isIcon":"1","order":"1387"},{"_cls":"opctlCfg","activityId":"event_145758","activityTitle":"\u6d88\u8d39\u8d62\u5927\u793c","activityTabTitle":"\u6d88\u8d39\u8d62\u5927\u793c","starttime":"1401033600","endtime":"1401292740","isDefault":"0","isIcon":"1","order":"1513"},{"_cls":"opctlCfg","activityId":"event_14715","activityTitle":"\u6625\u8282\u6d88\u8d39","activityTabTitle":"\u6625\u8282\u6d88\u8d39","starttime":1391184000,"endtime":1391443140,"isDefault":0,"isIcon":1,"order":233},{"_cls":"opctlCfg","activityId":"event_145679","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1400860800","endtime":"1401033540","isDefault":"0","isIcon":"1","order":"1509"},{"_cls":"opctlCfg","activityId":"event_24063","activityTitle":"\u52a0\u6536\u6709\u793c","activityTabTitle":"\u6606\u4ed1\u6728\u52a0\u6536\u6709\u793c","starttime":"1397664000","endtime":"1397836740","isDefault":"0","isIcon":"1","order":"1378"},{"_cls":"opctlCfg","activityId":"event_147503","activityTitle":"\u5353\u8d8a\u679c\u5b9e\u793c","activityTabTitle":"\u5353\u8d8a\u679c\u5b9e\u5355\u5145\u793c","starttime":"1404748800","endtime":"1404835140","isDefault":"0","isIcon":"1","order":"1667"},{"_cls":"opctlCfg","activityId":"event_20822","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c","starttime":1395720000,"endtime":1395849540,"isDefault":0,"isIcon":1,"order":375},{"_cls":"opctlCfg","activityId":"event_144234","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1398009600","endtime":"1398095940","isDefault":"0","isIcon":"1","order":"1388"},{"_cls":"opctlCfg","activityId":"event_16109","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7","starttime":1392825600,"endtime":1392998340,"isDefault":0,"isIcon":1,"order":280},{"_cls":"opctlCfg","activityId":"event_15318","activityTitle":"\u5355\u7b14\u5145\u503c","activityTabTitle":"\u5355\u7b14\u5145\u503c","starttime":1392048000,"endtime":1392220740,"isDefault":0,"isIcon":1,"order":252},{"_cls":"opctlCfg","activityId":"event_146203","activityTitle":"\u767b\u9646\u793c\u5305","activityTabTitle":"\u201c66\u5927\u987a\u201d\u767b\u9646\u793c","starttime":"1401962400","endtime":"1402070340","isDefault":"0","isIcon":"1","order":"1555"},{"_cls":"opctlCfg","activityId":"event_23891","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u611a\u4eba\u8282\u7d2f\u8ba1\u6d88\u8d39","starttime":"1396281600","endtime":"1396454340","isDefault":"0","isIcon":"1","order":"1328"},{"_cls":"opctlCfg","activityId":"event_18252","activityTitle":"\u9650\u65f6\u5145\u503c","activityTabTitle":"\u690d\u6811\u8282\u9650\u65f6\u5145\u503c","starttime":1394618400,"endtime":1394629200,"isDefault":0,"isIcon":1,"order":340},{"_cls":"opctlCfg","activityId":"event_146199","activityTitle":"\u5145\u503c\u8d60\u539a\u793c","activityTabTitle":"\u5145\u503c\u8d60\u539a\u793c","starttime":"1401984000","endtime":"1402243140","isDefault":"0","isIcon":"1","order":"1552"},{"_cls":"opctlCfg","activityId":"event_145413","activityTitle":"\u8fde\u7eed\u767b\u9646","activityTabTitle":"\u8fde\u7eed\u767b\u9646\u6709\u597d\u793c","starttime":"1400428800","endtime":"1401033540","isDefault":"0","isIcon":"1","order":"1487"},{"_cls":"opctlCfg","activityId":"event_145414","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1400428800","endtime":"1400515140","isDefault":"0","isIcon":"1","order":"1488"},{"_cls":"opctlCfg","activityId":"event_145099","activityTitle":"\u6d88\u8d39\u798f\u5229","activityTabTitle":"\u6d88\u8d39\u798f\u5229","starttime":"1399824000","endtime":"1400083140","isDefault":"0","isIcon":"1","order":"1460"},{"_cls":"opctlCfg","activityId":"funds","activityTitle":"","activityTabTitle":"","starttime":"1404144000","endtime":"1404748740","isDefault":"0","isIcon":"1","order":"1638"},{"_cls":"opctlCfg","activityId":"event_146266","activityTitle":"\u7d2f\u5145\u4eab\u798f\u5229","activityTabTitle":"\u7d2f\u5145\u4eab\u798f\u5229","starttime":"1402243200","endtime":"1402415940","isDefault":"0","isIcon":"1","order":"1560"},{"_cls":"opctlCfg","activityId":"event_23989","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c","starttime":"1396627200","endtime":"1396886340","isDefault":"0","isIcon":"1","order":"1335"},{"_cls":"opctlCfg","activityId":"event_145676","activityTitle":"\u7d2f\u5145\u56de\u9988","activityTabTitle":"\u7d2f\u5145\u56de\u9988","starttime":"1400860800","endtime":"1401033540","isDefault":"0","isIcon":"1","order":"1506"},{"_cls":"opctlCfg","activityId":"event_145174","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1399910400","endtime":"1399996740","isDefault":"0","isIcon":"1","order":"1470"},{"_cls":"opctlCfg","activityId":"event_16978","activityTitle":"\u767b\u9646\u793c\u5305","activityTabTitle":"\u9f99\u62ac\u5934\u767b\u9646\u793c\u5305","starttime":1393603200,"endtime":1393775940,"isDefault":0,"isIcon":0,"order":312},{"_cls":"opctlCfg","activityId":"event_15757","activityTitle":"\u4e00\u5143\u51b2\u51b2\u51b2","activityTabTitle":"\u4e00\u5143\u51b2\u51b2\u51b2","starttime":1392480000,"endtime":1392566340,"isDefault":0,"isIcon":1,"order":266},{"_cls":"opctlCfg","activityId":"event_13834","activityTitle":"\u5355\u7b14\u5145\u503c","activityTabTitle":"\u5355\u7b14\u5145\u503c","starttime":1390233600,"endtime":1390406340,"isDefault":0,"isIcon":1,"order":202},{"_cls":"opctlCfg","activityId":"event_147250","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1404230400","endtime":"1404316740","isDefault":"0","isIcon":"1","order":"1642"},{"_cls":"opctlCfg","activityId":"event_146349","activityTitle":"\u7d2f\u5145\u9001\u9053\u5177","activityTabTitle":"\u7d2f\u5145\u9001\u9053\u5177","starttime":"1402416000","endtime":"1402588740","isDefault":"0","isIcon":"1","order":"1567"},{"_cls":"opctlCfg","activityId":"event_19677","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":1395158400,"endtime":1395244740,"isDefault":0,"isIcon":1,"order":358},{"_cls":"opctlCfg","activityId":"event_145233","activityTitle":"\u52a0\u6536\u6709\u793c","activityTabTitle":"\u6606\u4ed1\u6728\u52a0\u6536\u6709\u793c","starttime":"1400083200","endtime":"1400255940","isDefault":"0","isIcon":"1","order":"1477"},{"_cls":"opctlCfg","activityId":"event_20006","activityTitle":"\u9650\u65f6\u5145\u503c","activityTabTitle":"\u9650\u65f6\u5145\u503c","starttime":1392807600,"endtime":1392825540,"isDefault":0,"isIcon":1,"order":3},{"_cls":"opctlCfg","activityId":"event_144555","activityTitle":"\u5145\u503c\u8d60\u539a\u793c","activityTabTitle":"\u5145\u503c\u8d60\u539a\u793c","starttime":"1398873600","endtime":"1399132740","isDefault":"0","isIcon":"1","order":"1420"},{"_cls":"opctlCfg","activityId":"event_145304","activityTitle":"\u7d2f\u5145\u9053\u5177\u793c","activityTabTitle":"\u7d2f\u5145\u9053\u5177\u793c","starttime":"1400256000","endtime":"1400428740","isDefault":"0","isIcon":"1","order":"1480"},{"_cls":"opctlCfg","activityId":"event_19978","activityTitle":"\u767e\u5143\u7d2f\u5145","activityTabTitle":"\u767e\u5143\u51b2\u51b2\u5145","starttime":1395331200,"endtime":1395417540,"isDefault":0,"isIcon":1,"order":363},{"_cls":"opctlCfg","activityId":"event_24061","activityTitle":"\u767e\u5143\u51b2\u51b2\u5145","activityTabTitle":"\u767e\u5143\u51b2\u51b2\u5145","starttime":"1397664000","endtime":"1397750340","isDefault":"0","isIcon":"1","order":"1376"},{"_cls":"opctlCfg","activityId":"event_145986","activityTitle":"\u201c\u516d\u00b7\u4e00\u201d\u9001\u5b9d\u77f3","activityTabTitle":"\u201c\u516d\u00b7\u4e00\u201d\u9001\u5b9d\u77f3","starttime":"1401552000","endtime":"1401638340","isDefault":"0","isIcon":"1","order":"1532"},{"_cls":"opctlCfg","activityId":"event_16647","activityTitle":"\u767e\u5143\u51b2\u51b2\u51b2","activityTabTitle":"\u767e\u5143\u51b2\u51b2\u51b2","starttime":1393257600,"endtime":1393343940,"isDefault":0,"isIcon":1,"order":299},{"_cls":"opctlCfg","activityId":"event_144345","activityTitle":"\u5355\u7b14\u5145\u503c","activityTabTitle":"\u5355\u7b14\u5145\u503c","starttime":"1398355200","endtime":"1398441540","isDefault":"0","isIcon":"1","order":"1403"},{"_cls":"opctlCfg","activityId":"event_14274","activityTitle":"\u5355\u7b14\u5145\u503c","activityTabTitle":"\u5355\u7b14\u5145\u503c","starttime":1390838400,"endtime":1390924740,"isDefault":0,"isIcon":1,"order":219},{"_cls":"opctlCfg","activityId":"event_145417","activityTitle":"\u6d88\u8d39\u989d\u5916\u793c","activityTabTitle":"\u6d88\u8d39\u989d\u5916\u793c","starttime":"1400428800","endtime":"1400601540","isDefault":"0","isIcon":"1","order":"1491"},{"_cls":"opctlCfg","activityId":"event_15347","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":1392048000,"endtime":1392220740,"isDefault":0,"isIcon":1,"order":253},{"_cls":"opctlCfg","activityId":"event_147197","activityTitle":"\u7d2f\u5145\u9ad8\u989d\u793c","activityTabTitle":"\u7d2f\u5145\u9ad8\u989d\u793c","starttime":"1404144000","endtime":"1404316740","isDefault":"0","isIcon":"1","order":"1636"},{"_cls":"opctlCfg","activityId":"event_147376","activityTitle":"\u5355\u5145\u6709\u56de\u9988","activityTabTitle":"\u5355\u5145\u6709\u56de\u9988","starttime":"1404489600","endtime":"1404662340","isDefault":"0","isIcon":"1","order":"1651"},{"_cls":"opctlCfg","activityId":"event_146525","activityTitle":"\u9650\u65f6\u5145\u503c","activityTabTitle":"\u9650\u65f6\u5145\u503c","starttime":"1402909200","endtime":"1402930800","isDefault":"0","isIcon":"1","order":"1587"},{"_cls":"opctlCfg","activityId":"event_16151","activityTitle":"\u6d88\u8d39\u51b2\u523a","activityTabTitle":"\u6d88\u8d39\u51b2\u523a","starttime":1392804000,"endtime":1392825540,"isDefault":0,"isIcon":1,"order":281},{"_cls":"opctlCfg","activityId":"event_16415","activityTitle":"\u64c2\u53f0\u7ade\u6280","activityTabTitle":"\u64c2\u53f0\u7ade\u6280","starttime":1392998400,"endtime":1393171140,"isDefault":0,"isIcon":0,"order":289},{"_cls":"opctlCfg","activityId":"event_23892","activityTitle":"\u52a0\u6536\u6709\u793c","activityTabTitle":"\u6606\u4ed1\u6728\u52a0\u6536\u6709\u793c","starttime":"1396281600","endtime":"1396454340","isDefault":"0","isIcon":"1","order":"1329"},{"_cls":"opctlCfg","activityId":"event_23886","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1396281600","endtime":"1396367940","isDefault":"0","isIcon":"1","order":"1322"},{"_cls":"opctlCfg","activityId":"event_145104","activityTitle":"\u8fde\u7eed\u767b\u9646","activityTabTitle":"\u8fde\u7eed\u767b\u9646\u6709\u597d\u793c","starttime":"1399824000","endtime":"1400428740","isDefault":"0","isIcon":"1","order":"1467"},{"_cls":"opctlCfg","activityId":"event_15728","activityTitle":"\u4e00\u5143\u51b2\u51b2\u51b2","activityTabTitle":"\u4e00\u5143\u51b2\u51b2\u51b2","starttime":1392393600,"endtime":1392479940,"isDefault":0,"isIcon":1,"order":265},{"_cls":"opctlCfg","activityId":"event_52413","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1397836800","endtime":"1398009360","isDefault":"0","isIcon":"1","order":"1386"},{"_cls":"opctlCfg","activityId":"event_144366","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":"1398441600","endtime":"1398700740","isDefault":"0","isIcon":"1","order":"1405"},{"_cls":"opctlCfg","activityId":"event_146612","activityTitle":"\u9650\u65f6\u7279\u4f9b","activityTabTitle":"\u53f2\u65e0\u524d\u4f8b\u9650\u65f6\u7279\u4f9b","starttime":"1403083800","endtime":"1403107140","isDefault":"0","isIcon":"1","order":"1595"},{"_cls":"opctlCfg","activityId":"event_145412","activityTitle":"\u5468\u4e00\u9996\u5145","activityTabTitle":"\u5468\u4e00\u9996\u5145","starttime":"1400428800","endtime":"1400515140","isDefault":"0","isIcon":"1","order":"1486"},{"_cls":"opctlCfg","activityId":"event_18115","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u690d\u6811\u8282\u7d2f\u8ba1\u5145\u503c","starttime":1394467200,"endtime":1394726340,"isDefault":0,"isIcon":1,"order":336},{"_cls":"opctlCfg","activityId":"herond","activityTitle":"","activityTabTitle":"","starttime":"1405094400","endtime":"1405353540","isDefault":"0","isIcon":"1","order":"1681"},{"_cls":"opctlCfg","activityId":"event_146696","activityTitle":"\u611f\u6069\u56de\u9988\u9001\u5f69\u793c","activityTabTitle":"\u611f\u6069\u56de\u9988\u9001\u5f69\u793c","starttime":"1403193600","endtime":"1403452740","isDefault":"0","isIcon":"1","order":"1598"},{"_cls":"opctlCfg","activityId":"event_146611","activityTitle":"\u64c2\u53f0\u7ade\u6280","activityTabTitle":"\u64c2\u53f0\u7ade\u6280\u573a","starttime":"1403020800","endtime":"1403193540","isDefault":"0","isIcon":"1","order":"1594"},{"_cls":"opctlCfg","activityId":"event_146069","activityTitle":"\u201c\u516d\u00b7\u4e00\u201d\u9001\u5b9d\u77f3","activityTabTitle":"\u201c\u516d\u00b7\u4e00\u201d\u9001\u5b9d\u77f3","starttime":"1401638400","endtime":"1401724740","isDefault":"0","isIcon":"1","order":"1544"},{"_cls":"opctlCfg","activityId":"openbox","activityTitle":"","activityTabTitle":"","starttime":"1403798400","endtime":"1404057540","isDefault":"0","isIcon":"1","order":"1624"},{"_cls":"opctlCfg","activityId":"event_24011","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u9ed1\u8272\u60c5\u4eba\u8282\u7d2f\u8ba1\u6d88\u8d39","starttime":"1397232000","endtime":"1397491140","isDefault":"0","isIcon":"1","order":"1359"},{"_cls":"opctlCfg","activityId":"event_147097","activityTitle":"\u5468\u4e00\u9996\u5145","activityTabTitle":"\u5468\u4e00\u9996\u5145","starttime":"1404057600","endtime":"1404143940","isDefault":"0","isIcon":"1","order":"1633"},{"_cls":"opctlCfg","activityId":"event_15786","activityTitle":"\u5468\u4e00\u9996\u5145","activityTabTitle":"\u5468\u4e00\u9996\u5145","starttime":1392566400,"endtime":1392652740,"isDefault":0,"isIcon":1,"order":267},{"_cls":"opctlCfg","activityId":"event_17251","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":1393862400,"endtime":1393948740,"isDefault":0,"isIcon":1,"order":317},{"_cls":"opctlCfg","activityId":"event_23988","activityTitle":"\u767e\u5143\u51b2\u51b2\u5145","activityTabTitle":"\u767e\u5143\u51b2\u51b2\u5145","starttime":"1396540800","endtime":"1396627140","isDefault":"0","isIcon":"1","order":"1334"},{"_cls":"opctlCfg","activityId":"event_24059","activityTitle":"\u5355\u7b14\u5145\u503c","activityTabTitle":"\u5355\u7b14\u5145\u503c","starttime":"1397577600","endtime":"1397663940","isDefault":"0","isIcon":"1","order":"1374"},{"_cls":"opctlCfg","activityId":"event_144457","activityTitle":"\u6d88\u8d39\u793c","activityTabTitle":"\u6d88\u8d39\u793c","starttime":"1398700800","endtime":"1398873540","isDefault":"0","isIcon":"1","order":"1418"},{"_cls":"opctlCfg","activityId":"event_145677","activityTitle":"\u6d88\u8d39\u597d\u793c","activityTabTitle":"\u6d88\u8d39\u597d\u793c","starttime":"1400860800","endtime":"1401033540","isDefault":"0","isIcon":"1","order":"1507"},{"_cls":"opctlCfg","activityId":"event_147200","activityTitle":"\u52a0\u6536\u6709\u793c","activityTabTitle":"\u6606\u4ed1\u6728\u52a0\u6536\u6709\u793c","starttime":"1404144000","endtime":"1404316740","isDefault":"0","isIcon":"1","order":"1640"},{"_cls":"opctlCfg","activityId":"event_145100","activityTitle":"\u5468\u4e00\u9996\u5145","activityTabTitle":"\u5468\u4e00\u9996\u5145","starttime":"1399824000","endtime":"1399910340","isDefault":"0","isIcon":"1","order":"1461"},{"_cls":"opctlCfg","activityId":"event_15405","activityTitle":"\u60c5\u5143\u5145\u503c","activityTabTitle":"\u60c5\u5143\u5145\u503c","starttime":1392134400,"endtime":1392393540,"isDefault":0,"isIcon":1,"order":256},{"_cls":"opctlCfg","activityId":"event_23998","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c","starttime":"1396886400","endtime":"1397059140","isDefault":"0","isIcon":"1","order":"1346"},{"_cls":"opctlCfg","activityId":"event_20211","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":1395417600,"endtime":1395503940,"isDefault":0,"isIcon":1,"order":367},{"_cls":"opctlCfg","activityId":"event_24058","activityTitle":"\u64c2\u53f0\u7ade\u6280","activityTabTitle":"\u64c2\u53f0\u7ade\u6280\u573a","starttime":"1397491200","endtime":"1397663940","isDefault":"0","isIcon":"1","order":"1373"},{"_cls":"opctlCfg","activityId":"event_146695","activityTitle":"\u611f\u6069\u56de\u9988\u6dfb\u6218\u529b","activityTabTitle":"\u611f\u6069\u56de\u9988\u6dfb\u6218\u529b","starttime":"1403193600","endtime":"1403452740","isDefault":"0","isIcon":"1","order":"1597"},{"_cls":"opctlCfg","activityId":"event_14969","activityTitle":"\u5f00\u95e8\u7ea2\u5305","activityTabTitle":"\u5f00\u95e8\u7ea2\u5305","starttime":1391184000,"endtime":1391875140,"isDefault":0,"isIcon":0,"order":242},{"_cls":"opctlCfg","activityId":"event_17281","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c","starttime":1393948800,"endtime":1394121540,"isDefault":0,"isIcon":1,"order":318},{"_cls":"opctlCfg","activityId":"event_146439","activityTitle":"\u767b\u9646\u798f\u5229\u793c\u5305","activityTabTitle":"\u767b\u9646\u798f\u5229\u793c\u5305","starttime":"1402574400","endtime":"1402847940","isDefault":"0","isIcon":"1","order":"1579"},{"_cls":"opctlCfg","activityId":"event_17009","activityTitle":"\u5468\u4e00\u9996\u5145","activityTabTitle":"\u5468\u4e00\u9996\u5145","starttime":1393776000,"endtime":1393862340,"isDefault":0,"isIcon":1,"order":313},{"_cls":"opctlCfg","activityId":"event_13912","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":1390233600,"endtime":1390406340,"isDefault":0,"isIcon":1,"order":204},{"_cls":"opctlCfg","activityId":"event_146437","activityTitle":"\u8fce\u4e16\u754c\u676f\u798f\u5229","activityTabTitle":"\u8fce\u4e16\u754c\u676f\u6d88\u8d39\u798f\u5229","starttime":"1402588800","endtime":"1402847940","isDefault":"0","isIcon":"1","order":"1574"},{"_cls":"opctlCfg","activityId":"event_146136","activityTitle":"\u52a0\u6536\u6709\u793c","activityTabTitle":"\u6606\u4ed1\u6728\u52a0\u6536\u6709\u793c","starttime":"1401811200","endtime":"1401983940","isDefault":"0","isIcon":"1","order":"1550"},{"_cls":"opctlCfg","activityId":"event_16618","activityTitle":"\u52a0\u6536\u6709\u793c","activityTabTitle":"\u52a0\u6536\u6709\u793c","starttime":1393257600,"endtime":1393430340,"isDefault":0,"isIcon":0,"order":298},{"_cls":"opctlCfg","activityId":"event_14085","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c","starttime":1390579200,"endtime":1390838340,"isDefault":0,"isIcon":1,"order":210},{"_cls":"opctlCfg","activityId":"event_146699","activityTitle":"\u6d88\u8d39\u62ff\u798f\u5229","activityTabTitle":"\u6d88\u8d39\u62ff\u798f\u5229","starttime":"1403193600","endtime":"1403452740","isDefault":"0","isIcon":"1","order":"1602"},{"_cls":"opctlCfg","activityId":"event_17499","activityTitle":"\u64c2\u53f0\u7ade\u6280","activityTabTitle":"\u64c2\u53f0\u7ade\u6280","starttime":1394121600,"endtime":1394294340,"isDefault":0,"isIcon":1,"order":325},{"_cls":"opctlCfg","activityId":"event_23885","activityTitle":"\u8fde\u7eed\u767b\u9646","activityTabTitle":"\u8fde\u7eed\u767b\u9646\u6709\u597d\u793c","starttime":"1396195200","endtime":"1396799940","isDefault":"0","isIcon":"1","order":"1321"},{"_cls":"opctlCfg","activityId":"event_16589","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":1393257600,"endtime":1393343940,"isDefault":0,"isIcon":1,"order":297},{"_cls":"opctlCfg","activityId":"event_15376","activityTitle":"\u52a0\u6536\u6709\u793c","activityTabTitle":"\u52a0\u6536\u6709\u793c","starttime":1392048000,"endtime":1392220740,"isDefault":0,"isIcon":0,"order":254},{"_cls":"opctlCfg","activityId":"event_19802","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c","starttime":1395244800,"endtime":1395417540,"isDefault":0,"isIcon":1,"order":360},{"_cls":"opctlCfg","activityId":"event_145415","activityTitle":"\u64c2\u53f0\u7ade\u6280","activityTabTitle":"\u64c2\u53f0\u7ade\u6280\u573a","starttime":"1400428800","endtime":"1400601540","isDefault":"0","isIcon":"1","order":"1489"},{"_cls":"opctlCfg","activityId":"event_19267","activityTitle":"\u5468\u4e00\u9996\u5145","activityTabTitle":"\u5468\u4e00\u9996\u5145","starttime":1394985600,"endtime":1395071940,"isDefault":0,"isIcon":1,"order":351},{"_cls":"opctlCfg","activityId":"event_23999","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":"1396886400","endtime":"1397059140","isDefault":"0","isIcon":"1","order":"1347"},{"_cls":"opctlCfg","activityId":"event_17436","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":1394121600,"endtime":1394207940,"isDefault":0,"isIcon":1,"order":323},{"_cls":"opctlCfg","activityId":"event_16531","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c","starttime":1393257600,"endtime":1393343940,"isDefault":0,"isIcon":1,"order":295},{"_cls":"opctlCfg","activityId":"event_24060","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c","starttime":1397703600,"endtime":1397836740,"isDefault":0,"isIcon":1,"order":1375},{"_cls":"opctlCfg","activityId":"event_145194","activityTitle":"\u9650\u65f6\u5145\u503c","activityTabTitle":"\u9650\u65f6\u5145\u503c","starttime":"1400050800","endtime":"1400079600","isDefault":"0","isIcon":"1","order":"1473"},{"_cls":"opctlCfg","activityId":"event_146486","activityTitle":"\u9650\u65f6\u5145\u503c","activityTabTitle":"\u9650\u65f6\u5145\u503c","starttime":1402740000,"endtime":1402758000,"isDefault":0,"isIcon":1,"order":1580},{"_cls":"opctlCfg","activityId":"event_145549","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1400601600","endtime":"1400687940","isDefault":"0","isIcon":"1","order":"1499"},{"_cls":"opctlCfg","activityId":"event_13651","activityTitle":"\u5468\u4e00\u9996\u5145","activityTabTitle":"\u5468\u4e00\u9996\u5145","starttime":1390147200,"endtime":1390233540,"isDefault":0,"isIcon":1,"order":195},{"_cls":"opctlCfg","activityId":"event_146697","activityTitle":"\u5355\u5145\u798f\u5229","activityTabTitle":"\u5355\u5145\u798f\u5229","starttime":"1403193600","endtime":"1403279940","isDefault":"0","isIcon":"1","order":"1599"},{"_cls":"opctlCfg","activityId":"event_17101","activityTitle":"\u8fde\u7eed\u767b\u9646","activityTabTitle":"\u8fde\u7eed\u767b\u9646\u6709\u597d\u793c","starttime":1393776000,"endtime":1394380740,"isDefault":0,"isIcon":0,"order":315},{"_cls":"opctlCfg","activityId":"event_14799","activityTitle":"\u6625\u8282\u9650\u8d2d","activityTabTitle":"\u6625\u8282\u9650\u8d2d","starttime":1391356800,"endtime":1391529540,"isDefault":0,"isIcon":1,"order":236},{"_cls":"opctlCfg","activityId":"event_15932","activityTitle":"\u5faa\u73af\u5145\u503c","activityTabTitle":"\u5faa\u73af\u5145\u503c","starttime":1392652800,"endtime":1392825540,"isDefault":0,"isIcon":1,"order":274},{"_cls":"opctlCfg","activityId":"event_14056","activityTitle":"\u9650\u65f6\u5145\u503c","activityTabTitle":"\u9650\u65f6\u5145\u503c","starttime":1390557600,"endtime":1390568400,"isDefault":0,"isIcon":1,"order":209},{"_cls":"opctlCfg","activityId":"event_19081","activityTitle":"\u9650\u65f6\u5145\u503c","activityTabTitle":"\u9650\u65f6\u5145\u503c","starttime":1394953200,"endtime":1394974800,"isDefault":0,"isIcon":1,"order":347},{"_cls":"opctlCfg","activityId":"event_144558","activityTitle":"\u64c2\u53f0\u7ade\u6280","activityTabTitle":"\u64c2\u53f0\u7ade\u6280\u573a","starttime":1398873600,"endtime":1399132740,"isDefault":0,"isIcon":1,"order":1424},{"_cls":"opctlCfg","activityId":"event_147444","activityTitle":"\u767e\u5143\u51b2\u51b2\u5145","activityTabTitle":"\u767e\u5143\u51b2\u51b2\u5145","starttime":"1404662400","endtime":"1404748740","isDefault":"0","isIcon":"1","order":"1657"},{"_cls":"opctlCfg","activityId":"event_24057","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":"1397491200","endtime":"1397663940","isDefault":"0","isIcon":"1","order":"1372"},{"_cls":"opctlCfg","activityId":"event_144632","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1398960000","endtime":"1399046340","isDefault":"0","isIcon":"1","order":"1427"},{"_cls":"opctlCfg","activityId":"event_15903","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c","starttime":1392652800,"endtime":1392825540,"isDefault":0,"isIcon":1,"order":273},{"_cls":"opctlCfg","activityId":"event_14220","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c","starttime":1390838400,"endtime":1391011140,"isDefault":0,"isIcon":1,"order":217},{"_cls":"opctlCfg","activityId":"event_150091","activityTitle":"\u7d2f\u5145\u5927\u793c","activityTabTitle":"\u7d2f\u5145\u9001\u5927\u793c","starttime":"1405094400","endtime":"1405353540","isDefault":"0","isIcon":"1","order":"1676"},{"_cls":"opctlCfg","activityId":"event_14440","activityTitle":"\u52a0\u6536\u6709\u793c","activityTabTitle":"\u52a0\u6536\u6709\u793c","starttime":1390838400,"endtime":1391011140,"isDefault":0,"isIcon":1,"order":224},{"_cls":"opctlCfg","activityId":"event_18220","activityTitle":"\u767b\u9646\u793c\u5305","activityTabTitle":"\u690d\u6811\u8282\u767b\u9646\u793c\u5305","starttime":1394467200,"endtime":1394639940,"isDefault":0,"isIcon":0,"order":339},{"_cls":"opctlCfg","activityId":"event_144368","activityTitle":"\u5355\u7b14\u5145\u503c","activityTabTitle":"\u5355\u7b14\u5145\u503c","starttime":"1398441600","endtime":"1398614340","isDefault":"0","isIcon":"1","order":"1408"},{"_cls":"opctlCfg","activityId":"event_147259","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1404316800","endtime":"1404489540","isDefault":"0","isIcon":"1","order":"1647"},{"_cls":"opctlCfg","activityId":"event_145061","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1399737600","endtime":"1399823940","isDefault":"0","isIcon":"1","order":"1456"},{"_cls":"opctlCfg","activityId":"event_19442","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":1394985600,"endtime":1395071940,"isDefault":0,"isIcon":1,"order":354},{"_cls":"opctlCfg","activityId":"event_13990","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7","starttime":1390406400,"endtime":1390579140,"isDefault":0,"isIcon":0,"order":207},{"_cls":"opctlCfg","activityId":"event_24008","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1397149200","endtime":"1397231940","isDefault":"0","isIcon":"1","order":"1356"},{"_cls":"opctlCfg","activityId":"event_144744","activityTitle":"\u767e\u5143\u51b2\u51b2\u5145","activityTabTitle":"\u767e\u5143\u51b2\u51b2\u5145","starttime":"1399219200","endtime":"1399305540","isDefault":"0","isIcon":"1","order":"1438"},{"_cls":"opctlCfg","activityId":"event_145548","activityTitle":"\u5355\u7b14\u9988\u8d60","activityTabTitle":"\u5355\u7b14\u9988\u8d60","starttime":"1400601600","endtime":"1400774340","isDefault":"0","isIcon":"1","order":"1497"},{"_cls":"opctlCfg","activityId":"event_144675","activityTitle":"\u52a0\u6536\u6709\u793c","activityTabTitle":"\u6606\u4ed1\u6728\u52a0\u6536\u6709\u793c","starttime":"1399132800","endtime":"1399305540","isDefault":"0","isIcon":"1","order":"1435"},{"_cls":"opctlCfg","activityId":"event_145991","activityTitle":"\u767b\u9646\u793c\u5305","activityTabTitle":"\u767b\u9646\u793c\u5305","starttime":"1401530400","endtime":"1401638340","isDefault":"0","isIcon":"1","order":"1540"},{"_cls":"opctlCfg","activityId":"event_16706","activityTitle":"\u9650\u65f6\u5145\u503c","activityTabTitle":"\u9650\u65f6\u5145\u503c","starttime":1393408800,"endtime":1393419600,"isDefault":0,"isIcon":1,"order":301},{"_cls":"opctlCfg","activityId":"event_146526","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1402848000","endtime":"1403020740","isDefault":"0","isIcon":"1","order":"1588"},{"_cls":"opctlCfg","activityId":"event_146419","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1402502400","endtime":"1402588740","isDefault":"0","isIcon":"1","order":"1571"},{"_cls":"opctlCfg","activityId":"event_18864","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u767d\u8272\u60c5\u4eba\u8282\u7d2f\u8ba1\u5145\u503c","starttime":1394726400,"endtime":1394985540,"isDefault":0,"isIcon":1,"order":344},{"_cls":"opctlCfg","activityId":"event_16948","activityTitle":"\u9650\u65f6\u5145\u503c","activityTabTitle":"\u6625\u9f99\u8282\u9650\u65f6\u5145\u503c","starttime":1393743600,"endtime":1393765200,"isDefault":0,"isIcon":1,"order":311},{"_cls":"opctlCfg","activityId":"event_144676","activityTitle":"\u767b\u9646\u6709\u793c","activityTabTitle":"\u767b\u9646\u793c\u5305","starttime":"1399125600","endtime":"1399305540","isDefault":"0","isIcon":"1","order":"1436"},{"_cls":"opctlCfg","activityId":"event_15699","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c","starttime":1392393600,"endtime":1392652740,"isDefault":0,"isIcon":1,"order":264},{"_cls":"opctlCfg","activityId":"event_13729","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7","starttime":1390147200,"endtime":1390233540,"isDefault":0,"isIcon":0,"order":198},{"_cls":"opctlCfg","activityId":"event_145987","activityTitle":"\u201c\u516d\u00b7\u4e00\u201d\u9001\u9053\u5177","activityTabTitle":"\u201c\u516d\u00b7\u4e00\u201d\u9001\u9053\u5177","starttime":"1401552000","endtime":"1401811140","isDefault":"0","isIcon":"1","order":"1533"},{"_cls":"opctlCfg","activityId":"event_147375","activityTitle":"\u7d2f\u5145\u9001\u5927\u793c","activityTabTitle":"\u7d2f\u5145\u9001\u5927\u793c","starttime":"1404489600","endtime":"1404748740","isDefault":"0","isIcon":"1","order":"1650"},{"_cls":"opctlCfg","activityId":"event_145940","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1401465600","endtime":"1401638340","isDefault":"0","isIcon":"1","order":"1531"},{"_cls":"opctlCfg","activityId":"event_146698","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1403193600","endtime":"1403279940","isDefault":"0","isIcon":"1","order":"1600"},{"_cls":"opctlCfg","activityId":"event_16858","activityTitle":"\u5355\u7b14\u5145\u503c","activityTabTitle":"\u5355\u7b14\u5145\u503c","starttime":1393603200,"endtime":1393689540,"isDefault":0,"isIcon":1,"order":308},{"_cls":"opctlCfg","activityId":"event_145103","activityTitle":"\u767b\u9646\u793c\u5305","activityTabTitle":"\u767b\u9646\u793c\u5305","starttime":"1399791600","endtime":"1400083140","isDefault":"0","isIcon":"0","order":"1466"},{"_cls":"opctlCfg","activityId":"event_147009","activityTitle":"\u9650\u65f6\u5145\u503c","activityTabTitle":"\u9650\u65f6\u5145\u503c","starttime":"1403863200","endtime":"1403881200","isDefault":"0","isIcon":"1","order":"1626"},{"_cls":"opctlCfg","activityId":"event_145856","activityTitle":"\u7d2f\u5145\u4eab\u798f\u5229","activityTabTitle":"\u7d2f\u5145\u4eab\u798f\u5229","starttime":"1401292800","endtime":"1401465540","isDefault":"0","isIcon":"1","order":"1523"},{"_cls":"opctlCfg","activityId":"event_16210","activityTitle":"\u6bcf\u65e5\u6d88\u8d39","activityTabTitle":"\u6bcf\u65e5\u6d88\u8d39\u9886\u597d\u793c","starttime":1392825600,"endtime":1392911940,"isDefault":0,"isIcon":1,"order":282},{"_cls":"opctlCfg","activityId":"event_145859","activityTitle":"\u52a0\u6536\u6709\u793c","activityTabTitle":"\u6606\u4ed1\u6728\u52a0\u6536\u6709\u793c","starttime":"1401292800","endtime":"1401465540","isDefault":"0","isIcon":"1","order":"1526"},{"_cls":"opctlCfg","activityId":"event_146420","activityTitle":"\u52a0\u6536\u6709\u793c","activityTabTitle":"\u6606\u4ed1\u6728\u52a0\u6536\u6709\u793c","starttime":"1402502400","endtime":"1402675140","isDefault":"0","isIcon":"1","order":"1572"},{"_cls":"opctlCfg","activityId":"event_19861","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":1395244800,"endtime":1395417540,"isDefault":0,"isIcon":1,"order":361},{"_cls":"opctlCfg","activityId":"event_17405","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":1394035200,"endtime":1394121540,"isDefault":0,"isIcon":1,"order":322},{"_cls":"opctlCfg","activityId":"event_24004","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c\u9053\u5177\u793c","starttime":"1397059200","endtime":"1397231940","isDefault":"0","isIcon":"1","order":"1352"},{"_cls":"opctlCfg","activityId":"event_23878","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c","starttime":"1396022400","endtime":"1396281540","isDefault":"0","isIcon":"1","order":"1312"},{"_cls":"opctlCfg","activityId":"event_146767","activityTitle":"\u6d88\u8d39\u6709\u798f\u5229","activityTabTitle":"\u6d88\u8d39\u6709\u798f\u5229","starttime":"1403452800","endtime":"1403625540","isDefault":"0","isIcon":"1","order":"1606"},{"_cls":"opctlCfg","activityId":"event_24000","activityTitle":"\u64c2\u53f0\u7ade\u6280","activityTabTitle":"\u64c2\u53f0\u7ade\u6280","starttime":"1396886400","endtime":"1397059140","isDefault":"0","isIcon":"1","order":"1348"},{"_cls":"opctlCfg","activityId":"event_17866","activityTitle":"\u8282\u65e5\u793c\u5305","activityTabTitle":"\u5987\u5973\u8282\u5973\u6027\u798f\u5229\u793c\u5305","starttime":1394121600,"endtime":1394294340,"isDefault":0,"isIcon":1,"order":329},{"_cls":"opctlCfg","activityId":"event_145681","activityTitle":"\u9650\u65f6\u5145\u503c","activityTabTitle":"\u9650\u65f6\u5145\u503c","starttime":"1401001200","endtime":"1401030000","isDefault":"0","isIcon":"1","order":"1511"},{"_cls":"opctlCfg","activityId":"event_23882","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1396195200","endtime":"1396281540","isDefault":"0","isIcon":"1","order":"1318"},{"_cls":"opctlCfg","activityId":"event_144454","activityTitle":"\u5b9d\u77f3\u6b22\u4e50\u9001","activityTabTitle":"\u5b9d\u77f3\u6b22\u4e50\u9001","starttime":"1398700800","endtime":"1398873540","isDefault":"0","isIcon":"1","order":"1415"},{"_cls":"opctlCfg","activityId":"event_146436","activityTitle":"\u8fce\u4e16\u754c\u676f\u6709\u793c","activityTabTitle":"\u8fce\u4e16\u754c\u676f\u5145\u503c\u5927\u793c","starttime":"1402588800","endtime":"1402847940","isDefault":"0","isIcon":"1","order":"1573"},{"_cls":"opctlCfg","activityId":"event_15873","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7","starttime":1392566400,"endtime":1392652740,"isDefault":0,"isIcon":0,"order":270},{"_cls":"opctlCfg","activityId":"event_150004","activityTitle":"\u6d88\u8d39\u6709\u597d\u793c","activityTabTitle":"\u6d88\u8d39\u6709\u597d\u793c","starttime":"1404921600","endtime":"1405094340","isDefault":"0","isIcon":"1","order":"1671"},{"_cls":"opctlCfg","activityId":"event_24035","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1397404800","endtime":"1397491140","isDefault":"0","isIcon":"1","order":"1368"},{"_cls":"opctlCfg","activityId":"event_14026","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":1390446000,"endtime":1390579140,"isDefault":0,"isIcon":1,"order":208},{"_cls":"opctlCfg","activityId":"event_24007","activityTitle":"\u52a0\u6536\u6709\u793c","activityTabTitle":"\u6606\u4ed1\u6728\u52a0\u6536\u6709\u793c","starttime":"1397059200","endtime":"1397231940","isDefault":"0","isIcon":"1","order":"1355"},{"_cls":"opctlCfg","activityId":"event_145232","activityTitle":"\u6d88\u8d39\u989d\u5916\u793c","activityTabTitle":"\u6d88\u8d39\u989d\u5916\u793c","starttime":"1400083200","endtime":"1400255940","isDefault":"0","isIcon":"1","order":"1476"},{"_cls":"opctlCfg","activityId":"event_19323","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":1394985600,"endtime":1395071940,"isDefault":0,"isIcon":1,"order":352},{"_cls":"opctlCfg","activityId":"event_16019","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c","starttime":1392825600,"endtime":1392998340,"isDefault":0,"isIcon":1,"order":277},{"_cls":"opctlCfg","activityId":"event_15231","activityTitle":"\u5468\u4e00\u9996\u5145","activityTabTitle":"\u5468\u4e00\u9996\u5145","starttime":1391961600,"endtime":1392047940,"isDefault":0,"isIcon":1,"order":249},{"_cls":"opctlCfg","activityId":"event_144456","activityTitle":"\u4ee4\u724c\u6b22\u4e50\u9001","activityTabTitle":"\u4ee4\u724c\u6b22\u4e50\u9001","starttime":"1398700800","endtime":"1398873540","isDefault":"0","isIcon":"1","order":"1417"},{"_cls":"opctlCfg","activityId":"event_17834","activityTitle":"\u8282\u65e5\u6d3b\u52a8","activityTabTitle":"\u5987\u5973\u8282\u5145\u503c\u5229\u6eda\u5229","starttime":1394121600,"endtime":1394380740,"isDefault":0,"isIcon":1,"order":328},{"_cls":"opctlCfg","activityId":"event_23810","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":1395849600,"endtime":1396022340,"isDefault":0,"isIcon":1,"order":381},{"_cls":"opctlCfg","activityId":"event_144912","activityTitle":"\u767e\u5143\u51b2\u51b2\u5145","activityTabTitle":"\u767e\u5143\u51b2\u51b2\u5145","starttime":"1399392000","endtime":"1399478340","isDefault":"0","isIcon":"1","order":"1445"},{"_cls":"opctlCfg","activityId":"event_147447","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1404662400","endtime":"1404748740","isDefault":"0","isIcon":"1","order":"1660"},{"_cls":"opctlCfg","activityId":"event_147357","activityTitle":"\u5355\u5145\u793c\u4e0a\u793c","activityTabTitle":"\u5355\u5145\u793c\u4e0a\u793c","starttime":"1404403200","endtime":"1404489540","isDefault":"0","isIcon":"1","order":"1649"},{"_cls":"opctlCfg","activityId":"event_144365","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c","starttime":"1398441600","endtime":"1398700740","isDefault":"0","isIcon":"1","order":"1404"},{"_cls":"opctlCfg","activityId":"event_147095","activityTitle":"\u6d88\u8d39\u6709\u597d\u611f","activityTabTitle":"\u6d88\u8d39\u6709\u597d\u611f","starttime":"1404057600","endtime":"1404143940","isDefault":"0","isIcon":"1","order":"1631"},{"_cls":"opctlCfg","activityId":"event_144239","activityTitle":"\u8fde\u7eed\u767b\u9646","activityTabTitle":"\u8fde\u7eed\u767b\u9646\u5929\u6570","starttime":"1398009600","endtime":"1398614340","isDefault":"0","isIcon":"1","order":"1390"},{"_cls":"opctlCfg","activityId":"event_144671","activityTitle":"\u5145\u503c\u8d60\u597d\u793c","activityTabTitle":"\u5145\u503c\u8d60\u597d\u793c","starttime":"1399132800","endtime":"1399305540","isDefault":"0","isIcon":"1","order":"1430"},{"_cls":"opctlCfg","activityId":"event_145008","activityTitle":"\u5355\u5145\u9988\u8d60","activityTabTitle":"\u5355\u5145\u9988\u8d60","starttime":"1399564800","endtime":"1399737540","isDefault":"0","isIcon":"1","order":"1453"},{"_cls":"opctlCfg","activityId":"event_16386","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":1392998400,"endtime":1393257540,"isDefault":0,"isIcon":1,"order":288},{"_cls":"opctlCfg","activityId":"event_23745","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":1395849600,"endtime":1395935940,"isDefault":0,"isIcon":1,"order":379},{"_cls":"opctlCfg","activityId":"event_146201","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1401984000","endtime":"1402156740","isDefault":"0","isIcon":"1","order":"1557"},{"_cls":"opctlCfg","activityId":"event_147201","activityTitle":"\u767b\u9646\u793c\u5305","activityTabTitle":"\u7eaa\u5ff5\u5efa\u515a\u65e5\u767b\u9646\u798f\u5229\u793c\u5305","starttime":"1404144000","endtime":"1404230340","isDefault":"0","isIcon":"1","order":"1641"},{"_cls":"opctlCfg","activityId":"event_150299","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u6d88\u8d39\u5347\u597d\u611f","starttime":"1405526400","endtime":"1405612740","isDefault":"0","isIcon":"1","order":"1694"},{"_cls":"opctlCfg","activityId":"superhero","activityTitle":"","activityTabTitle":"","starttime":"1404489600","endtime":"1404748740","isDefault":"0","isIcon":"1","order":"1656"},{"_cls":"opctlCfg","activityId":"event_144455","activityTitle":"\u9053\u5177\u6b22\u4e50\u9001","activityTabTitle":"\u9053\u5177\u6b22\u4e50\u9001","starttime":"1398700800","endtime":"1398873540","isDefault":"0","isIcon":"1","order":"1416"},{"_cls":"opctlCfg","activityId":"event_24055","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c","starttime":"1397491200","endtime":"1397663940","isDefault":"0","isIcon":"1","order":"1370"},{"_cls":"opctlCfg","activityId":"event_13677","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":1389974400,"endtime":1390233540,"isDefault":0,"isIcon":1,"order":196},{"_cls":"opctlCfg","activityId":"event_146608","activityTitle":"\u7d2f\u5145\u4eab\u798f\u5229","activityTabTitle":"\u7d2f\u5145\u4eab\u798f\u5229","starttime":"1403020800","endtime":"1403193540","isDefault":"0","isIcon":"1","order":"1591"},{"_cls":"opctlCfg","activityId":"event_144934","activityTitle":"\u5355\u5145\u5927\u5956","activityTabTitle":"\u5355\u5145\u5927\u5956","starttime":"1399478400","endtime":"1399564740","isDefault":"0","isIcon":"1","order":"1448"},{"_cls":"opctlCfg","activityId":"event_23827","activityTitle":"\u64c2\u53f0\u7ade\u6280","activityTabTitle":"\u64c2\u53f0\u7ade\u6280","starttime":1395849600,"endtime":1396022340,"isDefault":0,"isIcon":1,"order":382},{"_cls":"opctlCfg","activityId":"event_146855","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1403625600","endtime":"1403711940","isDefault":"0","isIcon":"1","order":"1614"},{"_cls":"opctlCfg","activityId":"event_146972","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1403712000","endtime":"1403798340","isDefault":"0","isIcon":"1","order":"1618"},{"_cls":"opctlCfg","activityId":"event_13599","activityTitle":"\u5355\u7b14\u5145\u503c","activityTabTitle":"\u5355\u7b14\u5145\u503c","starttime":1390060800,"endtime":1390147140,"isDefault":0,"isIcon":1,"order":193},{"_cls":"opctlCfg","activityId":"event_17656","activityTitle":"\u96f7\u950b\u9ad8\u6c64","activityTabTitle":"\u96f7\u950b\u9ad8\u6c64","starttime":1394008740,"endtime":1394035140,"isDefault":0,"isIcon":1,"order":0},{"_cls":"opctlCfg","activityId":"event_23987","activityTitle":"\u5355\u7b14\u5145\u503c","activityTabTitle":"\u5355\u7b14\u5145\u503c","starttime":"1396454400","endtime":"1396540740","isDefault":"0","isIcon":"1","order":"1333"},{"_cls":"opctlCfg","activityId":"event_146857","activityTitle":"\u5355\u5145\u798f\u5229","activityTabTitle":"\u5355\u5145\u798f\u5229","starttime":"1403625600","endtime":"1403711940","isDefault":"0","isIcon":"1","order":"1616"},{"_cls":"opctlCfg","activityId":"event_150305","activityTitle":"\u6d88\u8d39\u9886\u798f\u5229","activityTabTitle":"\u6d88\u8d39\u9886\u798f\u5229","starttime":"1405612800","endtime":"1405871940","isDefault":"0","isIcon":"1","order":"1700"},{"_cls":"opctlCfg","activityId":"event_145062","activityTitle":"\u9650\u65f6\u5145\u503c","activityTabTitle":"\u6bcd\u4eb2\u8282\u9650\u65f6\u5145\u503c","starttime":"1399791600","endtime":"1399820400","isDefault":"0","isIcon":"1","order":"1457"},{"_cls":"opctlCfg","activityId":"event_144264","activityTitle":"\u9650\u65f6\u5145\u503c","activityTabTitle":"\u9650\u65f6\u5145\u503c","starttime":"1398150000","endtime":"1398178800","isDefault":"0","isIcon":"1","order":"1395"},{"_cls":"opctlCfg","activityId":"event_144672","activityTitle":"\u6d88\u8d39\u989d\u5916\u793c","activityTabTitle":"\u6d88\u8d39\u989d\u5916\u793c","starttime":"1399132800","endtime":"1399305540","isDefault":"0","isIcon":"1","order":"1431"},{"_cls":"opctlCfg","activityId":"event_24003","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1397059200","endtime":"1397145540","isDefault":"0","isIcon":"1","order":"1351"},{"_cls":"opctlCfg","activityId":"event_150212","activityTitle":"\u7d2f\u5145\u9001\u597d\u793c","activityTabTitle":"\u7d2f\u5145\u9001\u597d\u793c","starttime":"1405353600","endtime":"1405526340","isDefault":"0","isIcon":"1","order":"1687"},{"_cls":"opctlCfg","activityId":"event_150176","activityTitle":"\u4e16\u754c\u676f\u95ed\u5e55\u793c","activityTabTitle":"\u4e16\u754c\u676f\u95ed\u5e55\u793c","starttime":"1405267200","endtime":"1405353540","isDefault":"0","isIcon":"1","order":"1683"},{"_cls":"opctlCfg","activityId":"event_150214","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1405353600","endtime":"1405526340","isDefault":"0","isIcon":"1","order":"1689"},{"_cls":"opctlCfg","activityId":"event_150213","activityTitle":"\u6d88\u8d39\u8d60\u798f\u5229","activityTabTitle":"\u6d88\u8d39\u8d60\u798f\u5229","starttime":"1405353600","endtime":"1405526340","isDefault":"0","isIcon":"1","order":"1688"},{"_cls":"opctlCfg","activityId":"event_150301","activityTitle":"\u64c2\u53f0\u7ade\u6280","activityTabTitle":"\u64c2\u53f0\u7ade\u6280\u573a","starttime":"1405526400","endtime":"1405699140","isDefault":"0","isIcon":"1","order":"1696"},{"_cls":"opctlCfg","activityId":"event_150452","activityTitle":"\u9650\u65f6\u5145\u503c","activityTabTitle":"\u9650\u65f6\u5145\u503c","starttime":"1405850400","endtime":"1405868400","isDefault":"0","isIcon":"1","order":"1705"},{"_cls":"opctlCfg","activityId":"event_150303","activityTitle":"\u7d2f\u5145\u9001\u5927\u793c","activityTabTitle":"\u7d2f\u5145\u9001\u5927\u793c","starttime":"1405612800","endtime":"1405871940","isDefault":"0","isIcon":"1","order":"1698"},{"_cls":"opctlCfg","activityId":"event_150300","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1405526400","endtime":"1405612740","isDefault":"0","isIcon":"1","order":"1695"},{"_cls":"opctlCfg","activityId":"event_150178","activityTitle":"\u8fde\u7eed\u767b\u5f55","activityTabTitle":"\u8fde\u7eed\u767b\u5f55\u6709\u597d\u793c","starttime":"1405267200","endtime":"1405871940","isDefault":"0","isIcon":"1","order":"1685"},{"_cls":"opctlCfg","activityId":"event_150092","activityTitle":"\u6d88\u8d39\u6709\u798f\u5229","activityTabTitle":"\u6d88\u8d39\u6709\u798f\u5229","starttime":"1405094400","endtime":"1405353540","isDefault":"0","isIcon":"1","order":"1677"},{"_cls":"opctlCfg","activityId":"event_147098","activityTitle":"\u8fde\u7eed\u767b\u5f55","activityTabTitle":"\u8fde\u7eed\u767b\u5f55\u6709\u597d\u793c","starttime":"1404057600","endtime":"1404662340","isDefault":"0","isIcon":"1","order":"1634"},{"_cls":"opctlCfg","activityId":"event_145839","activityTitle":"\u767e\u5143\u51b2\u51b2\u5145","activityTabTitle":"\u767e\u5143\u51b2\u51b2\u5145","starttime":"1401206400","endtime":"1401292740","isDefault":"0","isIcon":"1","order":"1521"},{"_cls":"opctlCfg","activityId":"event_145173","activityTitle":"\u795e\u79d8\u5546\u5e97","activityTabTitle":"\u62a4\u58eb\u8282\u795e\u79d8\u5546\u5e97","starttime":"1399867200","endtime":"1399996740","isDefault":"0","isIcon":"0","order":"1469"},{"_cls":"opctlCfg","activityId":"event_146768","activityTitle":"\u5468\u4e00\u9996\u5145","activityTabTitle":"\u5468\u4e00\u9996\u5145","starttime":"1403452800","endtime":"1403539140","isDefault":"0","isIcon":"1","order":"1607"},{"_cls":"opctlCfg","activityId":"event_144559","activityTitle":"\u767b\u9646\u793c\u5305","activityTabTitle":"\u767b\u9646\u793c\u5305","starttime":"1398853800","endtime":"1399132740","isDefault":"0","isIcon":"1","order":"1425"},{"_cls":"opctlCfg","activityId":"event_23844","activityTitle":"\u9650\u65f6\u5145\u503c","activityTabTitle":"\u9650\u65f6\u5145\u503c","starttime":1395990000,"endtime":1396018800,"isDefault":0,"isIcon":1,"order":1311},{"_cls":"opctlCfg","activityId":"event_144453","activityTitle":"\u559c\u8fce\u201c\u4e94\u00b7\u4e00\u201d","activityTabTitle":"\u559c\u8fce\u201c\u4e94\u00b7\u4e00\u201d","starttime":"1398668400","endtime":"1398873540","isDefault":"0","isIcon":"1","order":"1414"},{"_cls":"opctlCfg","activityId":"event_147094","activityTitle":"\u836f\u4e0d\u80fd\u505c","activityTabTitle":"\u836f\u4e0d\u80fd\u505c\u7d2f\u5145\u5c5e\u6027UP\u3001UP\u3001UP","starttime":"1404057600","endtime":"1404143940","isDefault":"0","isIcon":"1","order":"1630"},{"_cls":"opctlCfg","activityId":"event_20153","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":1395417600,"endtime":1395676740,"isDefault":0,"isIcon":1,"order":366},{"_cls":"opctlCfg","activityId":"event_144557","activityTitle":"\u6d88\u8d39\u4eab\u798f\u5229","activityTabTitle":"\u6d88\u8d39\u4eab\u798f\u5229","starttime":"1398873600","endtime":"1399132740","isDefault":"0","isIcon":"1","order":"1423"},{"_cls":"opctlCfg","activityId":"event_147378","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1404489600","endtime":"1404662340","isDefault":"0","isIcon":"1","order":"1654"},{"_cls":"opctlCfg","activityId":"event_144784","activityTitle":"\u5355\u5145\u8fd4\u5143\u5b9d","activityTabTitle":"\u5355\u5145\u8fd4\u5143\u5b9d","starttime":"1399305600","endtime":"1399391940","isDefault":"0","isIcon":"1","order":"1443"},{"_cls":"opctlCfg","activityId":"event_145546","activityTitle":"\u5145\u503c\u8d60\u539a\u793c","activityTabTitle":"\u5145\u503c\u8d60\u539a\u793c","starttime":1400601600,"endtime":1400687940,"isDefault":0,"isIcon":1,"order":1495},{"_cls":"opctlCfg","activityId":"event_144265","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1398182400","endtime":"1398268740","isDefault":"0","isIcon":"1","order":"1396"},{"_cls":"opctlCfg","activityId":"event_144743","activityTitle":"\u5468\u4e00\u9996\u5145","activityTabTitle":"\u5468\u4e00\u9996\u5145","starttime":"1399219200","endtime":"1399305540","isDefault":"0","isIcon":"1","order":"1437"},{"_cls":"opctlCfg","activityId":"event_13573","activityTitle":"\u4ee4\u724c\u5927\u56de\u9988","activityTabTitle":"\u4ee4\u724c\u5927\u56de\u9988","starttime":1389974400,"endtime":1390233540,"isDefault":0,"isIcon":1,"order":192},{"_cls":"opctlCfg","activityId":"event_147445","activityTitle":"\u5468\u4e00\u9996\u5145","activityTabTitle":"\u5468\u4e00\u9996\u5145","starttime":"1404662400","endtime":"1404748740","isDefault":"0","isIcon":"1","order":"1658"},{"_cls":"opctlCfg","activityId":"event_150469","activityTitle":"\u5145\u503c\u8fd4\u5229","activityTabTitle":"\u5145\u503c\u8fd4\u5229","starttime":"1405785600","endtime":"1405871940","isDefault":"0","isIcon":"1","order":"1706"},{"_cls":"opctlCfg","activityId":"event_23985","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":"1396454400","endtime":"1396627140","isDefault":"0","isIcon":"1","order":"1331"},{"_cls":"opctlCfg","activityId":"event_23889","activityTitle":"\u767b\u9646\u793c\u5305","activityTabTitle":"\u611a\u4eba\u8282\u767b\u9646\u793c\u5305","starttime":"1396260000","endtime":"1396367940","isDefault":"0","isIcon":"1","order":"1326"},{"_cls":"opctlCfg","activityId":"event_15289","activityTitle":"\u7d2f\u8ba1\u5145\u503c","activityTabTitle":"\u7d2f\u8ba1\u5145\u503c","starttime":1392048000,"endtime":1392134340,"isDefault":0,"isIcon":1,"order":251},{"_cls":"opctlCfg","activityId":"event_23997","activityTitle":"\u8fde\u7eed\u767b\u9646","activityTabTitle":"\u8fde\u7eed\u767b\u9646\u6709\u597d\u793c","starttime":"1396800000","endtime":"1397404740","isDefault":"0","isIcon":"1","order":"1344"},{"_cls":"opctlCfg","activityId":"event_146766","activityTitle":"\u7d2f\u5145\u9ad8\u989d\u793c","activityTabTitle":"\u7d2f\u5145\u9ad8\u989d\u793c","starttime":"1403452800","endtime":"1403625540","isDefault":"0","isIcon":"1","order":"1605"},{"_cls":"opctlCfg","activityId":"event_13860","activityTitle":"\u5355\u7b14\u5145\u503c","activityTabTitle":"\u5355\u7b14\u5145\u503c","starttime":1390406400,"endtime":1390492740,"isDefault":0,"isIcon":1,"order":203},{"_cls":"opctlCfg","activityId":"event_145486","activityTitle":"\u9650\u65f6\u5145\u503c","activityTabTitle":"\u201c5\u00b720\u201d\u9650\u65f6\u5145\u503c","starttime":"1400569200","endtime":"1400598000","isDefault":"0","isIcon":"1","order":"1492"},{"_cls":"opctlCfg","activityId":"event_16765","activityTitle":"\u7d2f\u8ba1\u6d88\u8d39","activityTabTitle":"\u7d2f\u8ba1\u6d88\u8d39","starttime":1393344000,"endtime":1393603140,"isDefault":0,"isIcon":1,"order":303},{"_cls":"opctlCfg","activityId":"event_144262","activityTitle":"\u64c2\u53f0\u7ade\u6280","activityTabTitle":"\u64c2\u53f0\u7ade\u6280\u573a","starttime":"1398096000","endtime":"1398268740","isDefault":"0","isIcon":"1","order":"1394"},{"_cls":"opctlCfg","activityId":"event_147093","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1403971200","endtime":"1404057540","isDefault":"0","isIcon":"1","order":"1629"},{"_cls":"opctlCfg","activityId":"event_18804","activityTitle":"\u767b\u9646\u793c\u5305","activityTabTitle":"\u767d\u8272\u60c5\u4eba\u8282\u767b\u9646\u793c\u5305","starttime":1394640000,"endtime":1394985540,"isDefault":0,"isIcon":0,"order":343},{"_cls":"opctlCfg","activityId":"event_20095","activityTitle":"\u5355\u7b14\u5145\u503c","activityTabTitle":"\u5355\u7b14\u5145\u503c","starttime":1395417600,"endtime":1395503940,"isDefault":0,"isIcon":1,"order":365},{"_cls":"opctlCfg","activityId":"event_147448","activityTitle":"\u767b\u9646\u793c\u5305","activityTabTitle":"\u767b\u9646\u798f\u5229\u793c\u5305","starttime":"1404648000","endtime":"1404748740","isDefault":"0","isIcon":"1","order":"1661"},{"_cls":"opctlCfg","activityId":"event_145759","activityTitle":"\u5468\u4e00\u9996\u5145","activityTabTitle":"\u5468\u4e00\u9996\u5145","starttime":"1401033600","endtime":"1401119940","isDefault":"0","isIcon":"1","order":"1514"},{"_cls":"opctlCfg","activityId":"event_145678","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1400860800","endtime":"1400947140","isDefault":"0","isIcon":"1","order":"1508"},{"_cls":"opctlCfg","activityId":"event_150215","activityTitle":"\u5355\u5145\u7279\u60e0","activityTabTitle":"\u5355\u5145\u7279\u60e0","starttime":1405353600,"endtime":1405439940,"isDefault":0,"isIcon":1,"order":1690},{"_cls":"opctlCfg","activityId":"event_150264","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1405440000","endtime":"1405526340","isDefault":"0","isIcon":"1","order":"1691"},{"_cls":"opctlCfg","activityId":"event_150298","activityTitle":"\u7d2f\u5145\u6709\u793c","activityTabTitle":"\u836f\u4e0d\u80fd\u505c\u7d2f\u5145\u6709\u793c","starttime":"1405526400","endtime":"1405612740","isDefault":"0","isIcon":"1","order":"1693"},{"_cls":"opctlCfg","activityId":"event_150179","activityTitle":"\u9650\u65f6\u7279\u4ef7","activityTabTitle":"\u9650\u65f6\u7279\u4ef7\u793c\u5305","starttime":"1405267200","endtime":"1405353540","isDefault":"0","isIcon":"1","order":"1686"},{"_cls":"opctlCfg","activityId":"event_150304","activityTitle":"\u65b0\u7248\u672c\u798f\u5229","activityTabTitle":"\u5e86\u65b0\u7248\u672c\u5355\u5145\u6beb\u793c","starttime":"1405612800","endtime":"1405699140","isDefault":"0","isIcon":"1","order":"1699"},{"_cls":"opctlCfg","activityId":"event_150302","activityTitle":"\u5355\u5145\u9ad8\u989d\u793c","activityTabTitle":"\u5355\u5145\u9ad8\u989d\u793c","starttime":"1405526400","endtime":"1405612740","isDefault":"0","isIcon":"1","order":"1697"},{"_cls":"opctlCfg","activityId":"event_150265","activityTitle":"\u9650\u65f6\u5145\u503c","activityTabTitle":"\u9650\u65f6\u5145\u503c","starttime":"1405504800","endtime":"1405522800","isDefault":"0","isIcon":"1","order":"1692"},{"_cls":"opctlCfg","activityId":"event_150177","activityTitle":"\u5468\u4e00\u9996\u5145","activityTabTitle":"\u5468\u4e00\u9996\u5145","starttime":"1405267200","endtime":"1405353540","isDefault":"0","isIcon":"1","order":"1684"},{"_cls":"opctlCfg","activityId":"event_150435","activityTitle":"\u5355\u5145\u9001\u793c","activityTabTitle":"\u5355\u5145\u9001\u7cbe\u534e","starttime":"1405699200","endtime":"1405785540","isDefault":"0","isIcon":"1","order":"1704"},{"_cls":"opctlCfg","activityId":"event_150306","activityTitle":"\u4e09\u65e5\u8fde\u5145","activityTabTitle":"\u4e09\u65e5\u8fde\u5145","starttime":"1405612800","endtime":"1405699140","isDefault":"0","isIcon":"1","order":"1702"}],"_cls":"getOpctlList"}}

	/**
	 * 历史活动列表
	 * @param user
	 * @return
	 */
	public static String eventPublicCtrl(User user) {
		return user.send(
			"&act=getopctl&ctl=index",
			null
		);
	}


	//public static const EVENT_PUBLIC_CONFIG:Object = {ctl:"opconf", act:"getcfg"};
	//CfgActivityData.as: line 100: 	$http = App.net.send(new HttpGetParams(PHPConsts.EVENT_PUBLIC_CONFIG).getHttpString(), {eventid:id}, this.loadCfgActivityComplete);
	//ActivityPublicEvent.as: line 89: 	App.net.send(new HttpGetParams(PHPConsts.EVENT_PUBLIC_CONFIG).getHttpString(), 
	//{eventid:_data.id}, this.loadCfgComplete);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_opconf_err_opconfcfgnotexist"}

	/**
	 * 活动配置
	 * @param user
	 * @param event
	 * @return
	 */
	public static String eventPublicConfig(User user, String event) {
		return user.send(
			"&act=getcfg&ctl=opconf",
			"{\"eventid\":%s}", event
		);
	}


	//public static const EVENT_PUBLIC_INIT:Object = {ctl:"opconf", act:"init"};
	//CfgActivityData.as: line 126: 	$http = App.net.send(new HttpGetParams(PHPConsts.EVENT_PUBLIC_INIT).getHttpString(), {eventid:id}, this.loadActivityDataComplete);
	//ActivityPublicEvent.as: line 95: 	App.net.send(new HttpGetParams(PHPConsts.EVENT_PUBLIC_INIT).getHttpString(), {eventid:_data.id}, this.loadDataComplete);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_opconf_err_opconfcfgnotexist"}

	/**
	 * 奖励信息
	 * @param user
	 * @param event
	 * @return
	 */
	public static String eventPublicInit(User user,String event) {
		return user.send(
			"&act=init&ctl=opconf",
			"{\"eventid\":\"%s\"}", event
		);
	}


	//public static const EVENT_PUBLIC_GETREWARD:Object = {ctl:"opconf", act:"getaward"};
	//ActivityPublicEvent.as: line 226: 	App.net.send(new HttpGetParams(PHPConsts.EVENT_PUBLIC_GETREWARD).getHttpString(), {eventid:_data.id, logicid:event.activityEventData}, this.rewardComplete, null, "default", "default", "default", 0, "default", "default", "default", "default", "default").dropPoint = new Point(stage.mouseX, stage.mouseY);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_opconf_err_opconfcfgnotexist"}

	/**
	 * 领取奖励
	 * @param user
	 * @param event
	 * @param logic
	 * @return
	 */
	public static String eventPublicGetreward(User user, String event, int logic) {
		return user.send(
			"&act=getaward&ctl=opconf",
			 "{\"eventid\":\"%s\",\"logicid\":%d}", event, logic
		);
	}


	//public static const GET_HEROND_CFG:Object = {ctl:"giant", act:"getcfg"};
	//ActivityHerond.as: line 183: 	App.net.send(new HttpGetParams(PHPConsts.GET_HEROND_CFG).getHttpString(), null, this.loadCfgComplete);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getgiantcfgok","data":{"basiccfgInfo":{"_cls":"giantbasicCfg","stat":0,"loop":8,"starttime":1405094400,"endtime":1405353540},"monstercfgList":[{"_cls":"giantmonsterCfg","monsterId":1,"giantId":1,"monsterName":"\u666e\u901a\u8d22\u5bcc\u5de8\u4eba","reqangry":0,"reqtoken":10,"awardangry":10,"mustdropcfgList":[{"_cls":"showItem","type":"money","cfgid":0,"num":12000,"sub":"0"}],"randdropcfgList":[{"_cls":"showItem","type":"item","cfgid":764,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":765,"num":1,"sub":"0"}]},{"_cls":"giantmonsterCfg","monsterId":2,"giantId":2,"monsterName":"\u5947\u884c\u8d22\u5bcc\u5de8\u4eba","reqangry":0,"reqtoken":19,"awardangry":22,"mustdropcfgList":[{"_cls":"showItem","type":"money","cfgid":0,"num":20000,"sub":"0"}],"randdropcfgList":[{"_cls":"showItem","type":"item","cfgid":764,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":765,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":759,"num":5,"sub":"0"}]},{"_cls":"giantmonsterCfg","monsterId":3,"giantId":1,"monsterName":"\u666e\u901a\u540d\u671b\u5de8\u4eba","reqangry":0,"reqtoken":10,"awardangry":10,"mustdropcfgList":[{"_cls":"showItem","type":"renown","cfgid":0,"num":90,"sub":"0"}],"randdropcfgList":[{"_cls":"showItem","type":"item","cfgid":764,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":765,"num":1,"sub":"0"}]},{"_cls":"giantmonsterCfg","monsterId":4,"giantId":2,"monsterName":"\u5947\u884c\u540d\u671b\u5de8\u4eba","reqangry":0,"reqtoken":19,"awardangry":22,"mustdropcfgList":[{"_cls":"showItem","type":"renown","cfgid":0,"num":160,"sub":"0"}],"randdropcfgList":[{"_cls":"showItem","type":"item","cfgid":764,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":765,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":759,"num":5,"sub":"0"}]},{"_cls":"giantmonsterCfg","monsterId":5,"giantId":1,"monsterName":"\u666e\u901a\u9605\u5386\u5de8\u4eba","reqangry":0,"reqtoken":10,"awardangry":10,"mustdropcfgList":[{"_cls":"showItem","type":"techpoint","cfgid":0,"num":3000,"sub":"0"}],"randdropcfgList":[{"_cls":"showItem","type":"item","cfgid":764,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":765,"num":1,"sub":"0"}]},{"_cls":"giantmonsterCfg","monsterId":6,"giantId":2,"monsterName":"\u5947\u884c\u9605\u5386\u5de8\u4eba","reqangry":0,"reqtoken":19,"awardangry":22,"mustdropcfgList":[{"_cls":"showItem","type":"techpoint","cfgid":0,"num":5000,"sub":"0"}],"randdropcfgList":[{"_cls":"showItem","type":"item","cfgid":764,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":765,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":759,"num":5,"sub":"0"}]},{"_cls":"giantmonsterCfg","monsterId":7,"giantId":3,"monsterName":"\u8d85\u5927\u5de8\u4eba","reqangry":100,"reqtoken":10,"awardangry":0,"mustdropcfgList":[{"_cls":"showItem","type":"money","cfgid":0,"num":20000,"sub":"0"},{"_cls":"showItem","type":"renown","cfgid":0,"num":160,"sub":"0"},{"_cls":"showItem","type":"techpoint","cfgid":0,"num":5000,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":759,"num":20,"sub":"0"}],"randdropcfgList":[{"_cls":"showItem","type":"item","cfgid":760,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":761,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":762,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":763,"num":2,"sub":"0"}]}],"_cls":"getGiantcfgInfo"}}

	/**
	 * 巨人配置
	 * @param user
	 * @return
	 */
	public static String getHerondCfg(User user) {
		return user.send(
			"&act=getcfg&ctl=giant",
			null
		);
	}


	//public static const GET_HEROND_INIT:Object = {ctl:"giant", act:"init"};
	//ActivityHerond.as: line 189: 	App.net.send(new HttpGetParams(PHPConsts.GET_HEROND_INIT).getHttpString(), null, this.loadInitComplete);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getrtrayinfook","data":{"rgiantInfo":{"_cls":"rgiantVo","giantangry":0},"token":"173","daytokentimes":0,"_cls":"giantInit"}}

	/**
	 * 巨人初始化
	 * @param user
	 * @return
	 */
	public static String getHerondInit(User user) {
		return user.send(
			"&act=init&ctl=giant",
			null
		);
	}


	//public static const GET_HEROND_FIGHT:Object = {ctl:"giant", act:"startfight"};
	//ActivityHerond.as: line 92: 	App.net.send(new HttpGetParams(PHPConsts.GET_HEROND_FIGHT).getHttpString(), _loc_2, this.fightcomplete);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_nomonsterinfo"}

	/**
	 * 巨人战斗
	 * @param user
	 * @param monster
	 * TODO check id
	 * @return
	 */
	public static String getHerondFight(User user, int monster) {
		return user.send(
			"&act=startfight&ctl=giant",
			"{\"monsterid\":%d}",monster
		);
	}


	//public static const RANK_INFO:Object = {ctl:"plusrank", act:"getrank"};
	//RankItem.as: line 222: 	App.net.send(new HttpGetParams(PHPConsts.RANK_INFO).getHttpString(), null, this.loadComplete).jumpOutOfQueue();
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getallplusranklistok","data":{"plusrankcfgInfo":{"_cls":"plusrankCfg","starttime":1380556800,"endtime":1380639600,"bbsurl":"http:\/\/bbs.open.qq.com\/thread-2899322-1-1.html"},"plusrankList":{"exp":null,"renown":null,"score":null},"myPlusrankInfo":{"exp":{"rank":0,"gname":"\u534a\u591c\u4e09\u66f4"},"renown":{"rank":0,"gname":"\u534a\u591c\u4e09\u66f4"},"score":{"rank":0,"gname":"\u534a\u591c\u4e09\u66f4"}},"status":1,"_cls":"getAllPlusrankList"}}

	/**
	 * TODO
	 * @param user
	 * @return
	 */
	public static String rankInfo(User user) {
		return user.send(
			"&act=getrank&ctl=plusrank",
			null
		);
	}


	//public static const RANK_WARRIOR:Object = {ctl:"plusrank", act:"viewgroup"};
	//MainInfoMgr.as: line 836: 	App.net.send(new HttpGetParams(PHPConsts.RANK_WARRIOR).getHttpString(), {rid:param1}, this.warriorWatch).jumpOutOfQueue();
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_rolenotexist"}

	/**
	 * 看侠客信息
	 * @param user
	 * @return
	 */
	public static String rankWarrior(User user, int id) {
		return user.send(
			"&act=viewgroup&ctl=plusrank",
			"{\"rid\":%d}", id
		);
	}


	//public static const RANK_GETREWARDCFG:Object = {ctl:"plusrank", act:"awardcfg"};
	//RankItem.as: line 289: 	App.net.send(new HttpGetParams(PHPConsts.RANK_GETREWARDCFG).getHttpString(), null, this.onLoadRewardCfg).jumpOutOfQueue();
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_awardcfgok","data":{"_cls":"awardcfg","expawardcfg":null,"renownawardcfg":null,"scoreawardcfg":null}}

	/**
	 * TODO
	 * @param user
	 * @return
	 */
	public static String rankGetrewardcfg(User user) {
		return user.send(
			"&act=awardcfg&ctl=plusrank",
			null
		);
	}


	//public static const RANK_GETAWARD:Object = {ctl:"plusrank", act:"getaward"};
	//RankItem.as: line 302: 	App.net.send(new HttpGetParams(PHPConsts.RANK_GETAWARD).getHttpString(), {type:this._type}, this.onGetReward);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_typeerr"}

	/**
	 * 排名奖励
	 * @param user
	 * @param type
	 * TODO
	 * @return
	 */
	public static String rankGetaward(User user, int type) {
		return user.send(
			"&act=getaward&ctl=plusrank",
			"{\"type\":%d}", type
		);
	}


	//public static const CONSUME_RANK:Object = {ctl:"costrank", act:"rankinfo"};
	//ConsumeRank.as: line 138: 	App.net.send(new HttpGetParams(PHPConsts.CONSUME_RANK).getHttpString(), null, this.loadComplete).jumpOutOfQueue();
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getrankinfook","data":{"id":24,"rank":0,"cost":0,"ranklist":[{"_cls":"costrank","id":766285,"level":"70","uname":"Didu","rank":1,"cost":"123133"},{"_cls":"costrank","id":835558,"level":"70","uname":"%E6%9C%A8%E5%AD%90","rank":2,"cost":"66468"},{"_cls":"costrank","id":1229176,"level":"70","uname":"%E7%B3%96%E7%B3%96%E7%88%B8","rank":3,"cost":"48653"},{"_cls":"costrank","id":1022558,"level":"70","uname":"%E9%9C%84","rank":4,"cost":"34888"},{"_cls":"costrank","id":1184537,"level":"70","uname":"%E3%82%9D%EF%B9%8F%E6%B9%B6%EF%B8%B7","rank":5,"cost":"30400"},{"_cls":"costrank","id":1114719,"level":"70","uname":"%E5%B0%8F%E9%B1%BC%E3%82%9B%E6%97%AD%E6%97%A5%E5%86%89%E5%8D%87%E7%85%A7%E5%BF%83%E6%89%89","rank":6,"cost":"28102"},{"_cls":"costrank","id":200397,"level":"70","uname":"%E8%BD%BB%E6%AD%8C","rank":7,"cost":"24062"},{"_cls":"costrank","id":898560,"level":"70","uname":"%E2%95%83%EF%BC%B7ait...%E2%95%83%20%20","rank":8,"cost":"23450"},{"_cls":"costrank","id":1363003,"level":"70","uname":"C2","rank":9,"cost":"22680"},{"_cls":"costrank","id":1417524,"level":"70","uname":"%E8%94%B7","rank":10,"cost":"21436"},{"_cls":"costrank","id":324570,"level":"70","uname":"%E3%83%AB%E3%82%AB-%E3%82%AB~%E2%98%86%20","rank":11,"cost":"20995"},{"_cls":"costrank","id":1626033,"level":"71","uname":"%E6%9C%A8%E5%96%B5","rank":12,"cost":"20326"},{"_cls":"costrank","id":1134394,"level":"71","uname":"%E8%A2%8F%E6%8E%B1%E5%AF%AB%E9%AF%96%D0%AF%EE%A0%A2","rank":13,"cost":"17230"},{"_cls":"costrank","id":252939,"level":"70","uname":"%E5%BF%83%E3%81%AE%E5%9B%9E%E5%BF%86","rank":14,"cost":"15595"},{"_cls":"costrank","id":1332779,"level":"70","uname":"%E4%B9%9D%E8%83%BD%E9%BE%99%E8%A1%8C","rank":15,"cost":"15470"},{"_cls":"costrank","id":845617,"level":"69","uname":"%E6%9D%8E%E6%8A%A5","rank":16,"cost":"14855"},{"_cls":"costrank","id":1277228,"level":"71","uname":"%E6%99%AF%E9%BE%99","rank":17,"cost":"14570"},{"_cls":"costrank","id":202681,"level":"70","uname":"%E2%91%A6%E6%9C%88100%25","rank":18,"cost":"14565"},{"_cls":"costrank","id":1522158,"level":"70","uname":"5%E2%83%A3%EF%B8%8F8%E2%83%A3%EF%B8%8F1%E2%83%A3%EF%B8%8F1%E2%83%A3%EF%B8%8F%5E_%5E","rank":19,"cost":"14560"},{"_cls":"costrank","id":231565,"level":"70","uname":"%5BLoft%5D%E3%80%81%E5%A5%8B%E6%96%97","rank":20,"cost":"13922"},{"_cls":"costrank","id":1228604,"level":"70","uname":"%E5%BA%84%E5%91%A8%E6%A2%A6%E8%9D%B6","rank":21,"cost":"13590"},{"_cls":"costrank","id":284961,"level":"71","uname":"%E4%B8%9C%E5%B9%B3","rank":22,"cost":"12718"},{"_cls":"costrank","id":208722,"level":"71","uname":"%E4%BE%A0%E5%AE%A2%E8%99%8E","rank":23,"cost":"12516"},{"_cls":"costrank","id":1599565,"level":"70","uname":"%E9%86%89%E9%87%8C%E4%B9%BE%E5%9D%A4","rank":24,"cost":"12050"},{"_cls":"costrank","id":219708,"level":"70","uname":"%E6%98%9F%E8%BE%B0%E3%81%AE%E8%AE%B0%E5%BF%86","rank":25,"cost":"11956"},{"_cls":"costrank","id":1654401,"level":"70","uname":"%E6%9C%AA%E4%BA%88","rank":26,"cost":"11944"},{"_cls":"costrank","id":1266853,"level":"70","uname":"%E5%B0%8F%E6%A5%BC%E4%B8%80%E5%A4%9C","rank":27,"cost":"11644"},{"_cls":"costrank","id":1577468,"level":"70","uname":"%E5%A4%A9","rank":28,"cost":"11323"},{"_cls":"costrank","id":220452,"level":"70","uname":"%E3%82%9C%E6%BC%A0%E9%A2%9C%E2%95%AE","rank":29,"cost":"11044"},{"_cls":"costrank","id":1024772,"level":"70","uname":"%E5%A4%A7%E7%81%B0%E7%8B%A0","rank":30,"cost":"10714"},{"_cls":"costrank","id":1481128,"level":"70","uname":"%E6%97%A0%E7%BC%9D%E7%AE%A1%E9%94%80%E5%94%AE","rank":31,"cost":"10640"},{"_cls":"costrank","id":305999,"level":"62","uname":"%E3%82%80%E9%80%A5%E5%A4%A2%E2%88%9A%E9%81%8A%E4%BD%A1","rank":32,"cost":"10627"},{"_cls":"costrank","id":1466785,"level":"70","uname":"%E5%90%A5%E5%9A%9F%E5%90%A5%E5%91%AE","rank":33,"cost":"10508"},{"_cls":"costrank","id":896324,"level":"70","uname":"%E7%AD%89%E5%BE%85%E7%81%AC%E6%9F%90%E4%BA%BA","rank":34,"cost":"10236"},{"_cls":"costrank","id":851087,"level":"70","uname":"%E8%B1%86%E8%85%90%E9%B1%BC","rank":35,"cost":"10098"},{"_cls":"costrank","id":693996,"level":"71","uname":"%E8%A7%81%E7%8C%AB%E5%BF%85%E8%B0%83%E6%88%8F","rank":36,"cost":"10048"},{"_cls":"costrank","id":1515133,"level":"70","uname":"%E5%B4%87%E6%8B%9C%E6%9C%89%E6%94%B9%E5%8F%98","rank":37,"cost":"10027"},{"_cls":"costrank","id":1228499,"level":"70","uname":"%E6%96%AD%E7%BF%85%E7%9A%84%E8%9D%B4%E8%9D%B6","rank":38,"cost":"10015"},{"_cls":"costrank","id":221891,"level":"70","uname":"%E8%81%AA%E8%81%AA","rank":39,"cost":"9176"},{"_cls":"costrank","id":819096,"level":"70","uname":"BRIAN%20WU","rank":40,"cost":"9072"},{"_cls":"costrank","id":214447,"level":"70","uname":"%EF%BF%A0%E7%A0%B4%E6%99%93%E2%99%82","rank":41,"cost":"8776"},{"_cls":"costrank","id":576016,"level":"70","uname":"%E4%B8%9C%E6%9B%A6%E8%A2%AD%E6%9C%88","rank":42,"cost":"8604"},{"_cls":"costrank","id":1294260,"level":"70","uname":"O%E5%B0%8F%E5%A8%81O","rank":43,"cost":"8436"},{"_cls":"costrank","id":1308443,"level":"60","uname":"%E8%B5%B5%E5%AE%87","rank":44,"cost":"8360"},{"_cls":"costrank","id":574276,"level":"70","uname":"%E7%B2%89%E5%A2%A8%E7%99%BB%E5%9C%BA","rank":45,"cost":"8130"},{"_cls":"costrank","id":1374655,"level":"50","uname":"%E6%B5%AE%E5%A3%AB%E5%BE%B7","rank":46,"cost":"8056"},{"_cls":"costrank","id":383093,"level":"70","uname":"%E2%82%AF%E3%8E%95%E3%80%82%E9%95%BF%E4%B9%85%20%E3%81%85%20%E1%83%A6","rank":47,"cost":"8024"},{"_cls":"costrank","id":257824,"level":"70","uname":"%E5%8F%B6%E5%AD%90","rank":48,"cost":"7649"},{"_cls":"costrank","id":289188,"level":"70","uname":"%E4%B8%89%E5%8F%8C%E6%8B%96%E6%8B%96%E9%9E%8B","rank":49,"cost":"7524"},{"_cls":"costrank","id":1191335,"level":"70","uname":"%E9%BA%A6%E5%AD%90","rank":50,"cost":"7502"},{"_cls":"costrank","id":634537,"level":"70","uname":"%E3%81%83%E7%84%B1%E3%81%A4","rank":51,"cost":"7451"},{"_cls":"costrank","id":1091043,"level":"70","uname":"%E6%97%A0%E5%8A%9B%E8%AF%89%E8%AF%B4","rank":52,"cost":"7370"},{"_cls":"costrank","id":1229952,"level":"70","uname":"%E2%99%82%E3%81%AE%E9%98%BF%E6%96%B0%E3%81%AE","rank":53,"cost":"7360"},{"_cls":"costrank","id":1267951,"level":"70","uname":"%E6%97%A0%E4%BC%91%E6%AD%A2%E6%83%B3%E4%BD%A0","rank":54,"cost":"7272"},{"_cls":"costrank","id":226206,"level":"70","uname":"%E5%8D%88%E5%A4%9C","rank":55,"cost":"7096"},{"_cls":"costrank","id":1660227,"level":"70","uname":"..................%E6%80%9D%E5%AF%86%E8%BE%BE","rank":56,"cost":"6936"},{"_cls":"costrank","id":230514,"level":"70","uname":"%E6%9E%AB%E8%8B%A5%E9%A3%9E%E9%9B%AA","rank":57,"cost":"6876"},{"_cls":"costrank","id":1312070,"level":"70","uname":"Anne","rank":58,"cost":"6808"},{"_cls":"costrank","id":981579,"level":"70","uname":"%E5%A4%A7%E7%8F%AD","rank":59,"cost":"6750"},{"_cls":"costrank","id":1606304,"level":"71","uname":"%E2%86%97%E2%98%86%E6%97%8B%E8%BD%AC%E3%81%AE%E5%91%BD%E8%BF%90%E4%B9%8B%E8%BD%AE%E2%86%96","rank":60,"cost":"6750"},{"_cls":"costrank","id":1035272,"level":"71","uname":"%E8%A5%BF%E6%B5%81%E4%BA%A1%E5%9C%B0","rank":61,"cost":"6699"},{"_cls":"costrank","id":406078,"level":"71","uname":"%E5%A2%83%E7%95%8C%E3%81%AE%E5%BD%BC%E6%96%B9","rank":62,"cost":"6560"},{"_cls":"costrank","id":1294887,"level":"70","uname":"%E7%B1%B3%E7%B2%92","rank":63,"cost":"6557"},{"_cls":"costrank","id":203689,"level":"70","uname":"%E6%8B%B3%E7%90%83%E9%80%9A","rank":64,"cost":"6475"},{"_cls":"costrank","id":598691,"level":"70","uname":"%E9%A2%A8%E4%B9%8B%E6%81%8B","rank":65,"cost":"6443"},{"_cls":"costrank","id":935347,"level":"70","uname":"%E9%82%AA%E6%81%B6%E7%9A%84%E5%B0%8F%E5%8D%A1%E6%B4%9B%E6%96%AF","rank":66,"cost":"6428"},{"_cls":"costrank","id":589158,"level":"70","uname":"%E8%B6%8A%E7%8B%B1%E5%85%94","rank":67,"cost":"6408"},{"_cls":"costrank","id":241930,"level":"70","uname":"%E5%A5%B9%E9%9D%99%E6%82%84%E6%82%84%E7%9A%84%E6%9D%A5%E8%BF%87......","rank":68,"cost":"6404"},{"_cls":"costrank","id":372147,"level":"70","uname":"%E6%B1%9F%E5%8D%97%E9%A3%9E%E9%9B%AA","rank":69,"cost":"6280"},{"_cls":"costrank","id":200595,"level":"70","uname":"%E9%98%BF%E7%94%98","rank":70,"cost":"6259"},{"_cls":"costrank","id":1321393,"level":"71","uname":"%E9%9D%9E.","rank":71,"cost":"6216"},{"_cls":"costrank","id":1105268,"level":"70","uname":"%E6%AE%8B%E7%A9%BA","rank":72,"cost":"6188"},{"_cls":"costrank","id":1135062,"level":"70","uname":"Trace","rank":73,"cost":"6159"},{"_cls":"costrank","id":1037870,"level":"70","uname":"Embrace","rank":74,"cost":"6150"},{"_cls":"costrank","id":200761,"level":"70","uname":"%E5%9B%A7RZ","rank":75,"cost":"6112"},{"_cls":"costrank","id":1007461,"level":"70","uname":"%E6%98%9F","rank":76,"cost":"6096"},{"_cls":"costrank","id":705429,"level":"68","uname":"%E5%82%BB%E8%9B%8B","rank":77,"cost":"6092"},{"_cls":"costrank","id":1265019,"level":"70","uname":"%E8%94%A1%E8%89%AF","rank":78,"cost":"6086"},{"_cls":"costrank","id":300578,"level":"70","uname":"%E2%8C%92Endless","rank":79,"cost":"5990"},{"_cls":"costrank","id":365418,"level":"70","uname":"%E2%97%87%E7%AC%A8%E7%AC%A8%E2%97%87","rank":80,"cost":"5955"},{"_cls":"costrank","id":351050,"level":"70","uname":"%E3%84%A1%20%E5%AE%89%20%C2%B0","rank":81,"cost":"5770"},{"_cls":"costrank","id":451614,"level":"71","uname":"%E8%8E%B9%E3%80%81%E9%9B%AA%E5%A4%A9%E3%80%82","rank":82,"cost":"5753"},{"_cls":"costrank","id":1439417,"level":"70","uname":".................","rank":83,"cost":"5746"},{"_cls":"costrank","id":1109826,"level":"70","uname":"%E9%87%87%E5%A7%91%E5%A8%98%E7%9A%84%E5%B0%8F%E8%98%91%E8%8F%87%E3%80%82","rank":84,"cost":"5739"},{"_cls":"costrank","id":970640,"level":"70","uname":"~sky~","rank":85,"cost":"5730"},{"_cls":"costrank","id":1209892,"level":"70","uname":"%E4%BA%91%E6%B7%A1%E9%A3%8E%E6%B8%85","rank":86,"cost":"5671"},{"_cls":"costrank","id":296493,"level":"70","uname":"%E9%A3%98%E9%9B%B6de%E5%8F%B6%E5%AD%90","rank":87,"cost":"5662"},{"_cls":"costrank","id":1302286,"level":"65","uname":"%E8%99%B9%E3%81%97ov%E3%81%AE%E5%86%9B","rank":88,"cost":"5650"},{"_cls":"costrank","id":1221635,"level":"70","uname":"%E5%91%86%E5%91%86","rank":89,"cost":"5638"},{"_cls":"costrank","id":282413,"level":"70","uname":"%20VENT%22","rank":90,"cost":"5544"},{"_cls":"costrank","id":1553015,"level":"70","uname":"%E6%8A%97%E5%91%BD%E4%B9%8B%E5%BF%83","rank":91,"cost":"5515"},{"_cls":"costrank","id":1138267,"level":"70","uname":"%E2%98%85%E2%98%85%E2%98%85%E2%98%85%E2%98%85","rank":92,"cost":"5500"},{"_cls":"costrank","id":1274524,"level":"72","uname":"%E6%89%80%E7%BE%85%E9%96%80%E7%9A%84%E7%99%BD%E5%85%94","rank":93,"cost":"5490"},{"_cls":"costrank","id":278159,"level":"70","uname":"%E2%9D%80%E7%8B%BC%E2%98%AA","rank":94,"cost":"5474"},{"_cls":"costrank","id":1366022,"level":"65","uname":"Nuke","rank":95,"cost":"5450"},{"_cls":"costrank","id":1365965,"level":"65","uname":"%EF%BC%A3%C4%81%E3%83%BE%E5%B8%83%E4%B8%81%E7%81%AC","rank":96,"cost":"5450"},{"_cls":"costrank","id":1154965,"level":"69","uname":"%20%E6%AE%A4%20%E4%B8%B6%E9%80%8D%20%E9%81%A5","rank":97,"cost":"5450"},{"_cls":"costrank","id":1645030,"level":"50","uname":"%E5%97%BC%E3%8A%94d%C3%A9%E6%82%B8%E3%84%8A%E3%81%8B","rank":98,"cost":"5425"},{"_cls":"costrank","id":1218647,"level":"70","uname":"%E8%90%A7%E9%81%A5","rank":99,"cost":"5400"},{"_cls":"costrank","id":882147,"level":"70","uname":"%E6%B2%AB%E6%B2%AB%E4%BB%96%E7%88%B8","rank":100,"cost":"5396"},{"_cls":"costrank","id":1342321,"level":"70","uname":"%E5%A9%B7%E5%A9%B7","rank":500,"cost":"1400"},{"_cls":"costrank","id":1613814,"level":"64","uname":"LV.4%E7%BA%A7%E6%82%A3%E8%80%85","rank":1000,"cost":"520"}],"lastid":"18","lastrank":0,"rewardstatus":0,"rewardexpire":0,"_cls":"getrankinfo"}}

	/**
	 * 消费排行
	 * @param user
	 * @return
	 */
	public static String consumeRank(User user) {
		return user.send(
			"&act=rankinfo&ctl=costrank",
			null
		);
	}


	//public static const CONSUME_GETREWARD:Object = {ctl:"costrank", act:"reward"};
	//ConsumeRank.as: line 224: 	App.net.send(new HttpGetParams(PHPConsts.CONSUME_GETREWARD).getHttpString(), null, this.onReward).dropPoint = new Point(400, 300);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_awardexpire"}

	/**
	 * 领取消费排行奖励
	 * @param user
	 * @return
	 */
	public static String consumeGetreward(User user) {
		return user.send(
			"&act=reward&ctl=costrank",
			null
		);
	}


	//public static const CONSUME_CONFIG:Object = {ctl:"costrank", act:"config"};
	//ConsumeRank.as: line 161: 	App.net.send(new HttpGetParams(PHPConsts.CONSUME_CONFIG).getHttpString(), null, this.GetCfgSuccess).jumpOutOfQueue();
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getconfigok","data":{"config":{"_cls":"costrankcfg","id":24,"starttime":1405094400,"endtime":1405353540,"awardcfgList":{"1-1":{"_cls":"costrankawardcfg","awardcfgList":[{"_cls":"showItem","type":"item","cfgid":792,"num":1,"sub":1},{"_cls":"showItem","type":"item","cfgid":619,"num":1,"sub":1}],"condcfg":"50","bakawardcfgList":[{"_cls":"showItem","type":"item","cfgid":620,"num":2,"sub":1},{"_cls":"showItem","type":"item","cfgid":619,"num":1,"sub":1}]},"2-2":{"_cls":"costrankawardcfg","awardcfgList":[{"_cls":"showItem","type":"item","cfgid":792,"num":1,"sub":1}],"condcfg":"50","bakawardcfgList":[{"_cls":"showItem","type":"item","cfgid":620,"num":1,"sub":1}]},"3-3":{"_cls":"costrankawardcfg","awardcfgList":[{"_cls":"showItem","type":"item","cfgid":619,"num":1,"sub":1}],"condcfg":"","bakawardcfgList":[]},"4-10":{"_cls":"costrankawardcfg","awardcfgList":[{"_cls":"showItem","type":"item","cfgid":618,"num":1,"sub":1}],"condcfg":"","bakawardcfgList":[]},"11-20":{"_cls":"costrankawardcfg","awardcfgList":[{"_cls":"showItem","type":"item","cfgid":615,"num":1,"sub":1}],"condcfg":"","bakawardcfgList":[]}},"url":"http:\/\/bbs.open.qq.com\/thread-2955740-1-1.html","baseCost":"10000"},"_cls":"getconfig"}}

	/**
	 * 消费排行配置
	 * @param user
	 * @return
	 */
	public static String consumeConfig(User user) {
		return user.send(
			"&act=config&ctl=costrank",
			null
		);
	}


	//public static const VALENTINEINIT:Object = {ctl:"operator", act:"valentinesinit"};
	//ValentineDayItem.as: line 194: 	App.net.send(new HttpGetParams(PHPConsts.VALENTINEINIT).getHttpString(), null, this.loadComplete);
	//GetFascinationProxy.as: line 15: 	App.net.send(new HttpGetParams(PHPConsts.VALENTINEINIT).getHttpString(), null, this.loadComplete);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_valentinesinitok","data":{"valentinesCfgInfo":{"loop":1,"starttime":1392307200,"endtime":1392566340,"bbsurl":"#","buyreqc":[{"type":"gamepoint","cfgid":0,"num":10,"sub":0}],"buyaward":[{"type":"item","cfgid":885,"num":1,"sub":1}],"buytype":"9,99,520,999","sendaward":[{"type":"fascination","cfgid":0,"num":2,"sub":0}],"recvaward":[{"type":"fascination","cfgid":0,"num":1,"sub":0}]},"fascination":"valentines_1-0.4","roses":0}}

	/**
	 * 情人节活动配置
	 * @param user
	 * @return
	 */
	public static String valentineinit(User user) {
		return user.send(
			"&act=valentinesinit&ctl=operator",
			null
		);
	}


	//public static const VALENTINESEND:Object = {ctl:"operator", act:"ValentinesSent"};
	//ChooseRosePanel.as: line 56: 	App.net.send(new HttpGetParams(PHPConsts.VALENTINESEND).getHttpString(), {num:this.list_select.selectData, recverId:this._data.id}, this.loadComplete);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_valentinessentok","change":{"_cls":"changeObj","role":null,"rwarrior":null,"rwarriorskill":null,"rwarriorskillbuff":null,"rbagitem":null,"rbuild":null,"rquest":null,"rmap":null,"rwarriorinpub":null,"rwarriorgroup":null,"roperator":{"805493":{},"200217":{}}},"data":{"fascination":"valentines_1-0.4"}}

	/**
	 * 情人节送花
	 * @param user
	 * @param fid
	 * @param num
	 * @return
	 */
	public static String valentinesend(User user, int fid, int num) {
		return user.send(
			"&act=ValentinesSent&ctl=operator",
			 "{\"recverId\":%d,\"num\":%d}", fid,num
		);
	}


	//public static const VALENTINESLOG:Object = {ctl:"operator", act:"ValentinesLog"};
	//ValentineDayItem.as: line 149: 	App.net.send(new HttpGetParams(PHPConsts.VALENTINESLOG).getHttpString(), null, this.onDataLogHandler, this.failHandler).jumpOutOfQueue();
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_valentinessentok","data":{"sendLog":[{"num":9,"sendRid":"805493","recvRid":200324,"time":1392354459,"sendNickname":"Ming","recvNickname":"%E9%9F%B3"},{"num":9,"sendRid":"805493","recvRid":200324,"time":1392354944,"sendNickname":"Ming","recvNickname":"%E9%9F%B3"},{"num":12,"sendRid":"805493","recvRid":200324,"time":1392354959,"sendNickname":"Ming","recvNickname":"%E9%9F%B3"},{"num":15,"sendRid":"805493","recvRid":200324,"time":1392391793,"sendNickname":"Ming","recvNickname":"%E9%9F%B3"},{"num":0,"sendRid":"805493","recvRid":200217,"time":1392567346,"sendNickname":"Ming","recvNickname":"%E5%BD%A1%E6%9C%88%E4%B8%B6"},{"num":0,"sendRid":"805493","recvRid":200217,"time":1405787476,"sendNickname":"Ming","recvNickname":"%E5%BD%A1%E6%9C%88%E4%B8%B6"}],"recvLog":[{"num":99,"sendRid":"1333034","recvRid":805493,"time":1392314693,"sendNickname":"%E8%B4%9E%E6%93%8D%E5%B7%B2%E4%B9%B1","recvNickname":"Ming"},{"num":9,"sendRid":"280768","recvRid":805493,"time":1392521103,"sendNickname":"%E4%B8%83%E5%BD%A9%E7%99%BE%E5%90%88","recvNickname":"Ming"}]}}

	/**
	 * 情人节历史消息
	 * @param user
	 * @return
	 */
	public static String valentineslog(User user) {
		return user.send(
			"&act=ValentinesLog&ctl=operator",
			null
		);
	}


	//public static const VALENTINESRANK:Object = {ctl:"operator", act:"ValentinesRank"};
	//ValentineDayItem.as: line 92: 	App.net.send(new HttpGetParams(PHPConsts.VALENTINESRANK).getHttpString(), null, this.dataHandler, this.failHandler).jumpOutOfQueue();
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_valentinesrankok","data":{"list":{"200324":{"score":"85100","nickname":"%E5%8D%83%E9%9F%B3"},"422877":{"score":"35625","nickname":"%E4%B8%80%E9%86%89%E6%88%90%E4%BB%99"},"201774":{"score":"34328","nickname":"Fairyland"},"419826":{"score":"19436","nickname":"%E9%9D%A2%E7%8E%9B"},"1111492":{"score":"19300","nickname":"%E4%B8%87%E8%8F%AF%E9%95%9C"},"277157":{"score":"18538","nickname":"%E7%83%A6%E3%80%81%E7%83%A6"},"759127":{"score":"17746","nickname":"%E6%AF%9B%E6%AF%9B%E9%9B%A8"},"987281":{"score":"17569","nickname":"%E5%8D%95%E8%88%9E"},"200785":{"score":"17392","nickname":"%EF%B9%8F%E7%B4%B0%E9%9B%A8%E8%BC%95%E6%84%81%E3%80%9E"},"1069142":{"score":"17134","nickname":"gg"},"200761":{"score":"14449","nickname":"%E5%9B%A7RZ"},"230514":{"score":"14406","nickname":"%E6%9E%AB%E8%8B%A5%E9%A3%9E%E9%9B%AA"},"808870":{"score":"14369","nickname":"%20%E9%9C%9C%20%E5%AF%92"},"1162544":{"score":"14120","nickname":"%E5%9B%9E%E5%BF%86%E7%81%AC%E3%84%98"},"1007764":{"score":"13878","nickname":"%E2%80%AD"},"226206":{"score":"13840","nickname":"%E5%8D%88%E5%A4%9C"},"204603":{"score":"13755","nickname":"%E6%97%A0%E6%81%99"},"858189":{"score":"13692","nickname":"%E5%B9%B8"},"202681":{"score":"13410","nickname":"%E2%91%A6%E6%9C%88100%25"},"1280998":{"score":"13187","nickname":"%E8%80%81%E9%B8%A8"},"1177744":{"score":"13124","nickname":"%E5%AF%92%E6%A2%A6%E7%99%BD"},"324570":{"score":"12987","nickname":"%E3%83%AB%E3%82%AB-%E3%82%AB~%E2%98%86%20"},"718793":{"score":"12769","nickname":"%E3%82%86%E3%81%8D%E3%81%AE%E3%82%88%E3%82%8B%E3%81%AE%E3%83%86%E3%83%AC%E3%82%B5%E3%83%86%E3%83%B3"},"1172644":{"score":"12637","nickname":"%E8%90%BD%E9%94%99"},"200595":{"score":"12501","nickname":"%E9%98%BF%E7%94%98"},"200302":{"score":"12193","nickname":"%E6%81%8B%E4%B8%B6%E6%B2%99%E8%80%B6"},"424606":{"score":"12061","nickname":"%E5%A4%A7%E6%B5%B7"},"411631":{"score":"12033","nickname":"%E5%96%B5%E5%8D%A1%E7%90%B3%E3%82%9D"},"823027":{"score":"11975","nickname":"%E4%BD%90%E6%B4%B1%E9%87%98"},"278020":{"score":"11830","nickname":"%E3%81%AB%EF%BC%A4%E8%AA%BF%E3%81%AE"},"1649580":{"score":"11796","nickname":"%E7%8C%A5%E7%90%90%E7%9A%84%E8%83%BD%E7%8C%AB"},"203643":{"score":"11565","nickname":"%E4%BC%8A%E5%8F%B6"},"200626":{"score":"11430","nickname":"%E6%8D%89%E7%8C%AA%E5%8C%A0"},"200299":{"score":"11376","nickname":"DCoquelicot"},"1312070":{"score":"11356","nickname":"Anne"},"281460":{"score":"11272","nickname":"%E2%97%86%E2%97%87%E4%B8%B6%E4%B8%83%E6%9C%88%E2%99%94"},"1626033":{"score":"11225","nickname":"%E6%9C%A8%E5%96%B5"},"1321393":{"score":"11142","nickname":"%E9%9D%9E."},"1173213":{"score":"11112","nickname":"%E8%88%88"},"1391040":{"score":"11105","nickname":"%D1%8D.%CE%B9%CF%86"},"300194":{"score":"11055","nickname":"%E5%88%81%20%E6%B0%91%E3%80%81"},"311805":{"score":"11037","nickname":"%E3%84%9F%20%20%EF%BC%B3%EF%BD%8F%EF%BD%95%EF%BD%8C"},"256454":{"score":"10971","nickname":"%20%20%E2%95%AF%E5%A4%8F%E5%BE%AE%E6%B6%BC_"},"202214":{"score":"10931","nickname":"%E6%AD%BB%E6%8E%89%E7%AE%97%E4%BA%86"},"1577468":{"score":"10896","nickname":"%E5%A4%A9"},"278159":{"score":"10889","nickname":"%E2%9D%80%E7%8B%BC%E2%98%AA"},"1134810":{"score":"10872","nickname":"%E5%BC%B5%E6%9C%B6%E6%9C%B6%E4%B8%B6%20"},"1550709":{"score":"10825","nickname":"%E6%91%A9%E7%BE%AF%E2%99%91%E4%BC%A4"},"558341":{"score":"10797","nickname":"%E6%A8%B1%E5%8D%8E%E6%97%A0%E7%97%95"},"1134394":{"score":"10791","nickname":"%E8%A2%8F%E6%8E%B1%E5%AF%AB%E9%AF%96%D0%AF%EE%A0%A2"}}}}

	/**
	 * 情人节排行
	 * @param user
	 * @return
	 */
	public static String valentinesrank(User user) {
		return user.send(
			"&act=ValentinesRank&ctl=operator",
			null
		);
	}


	//public static const TECH_UPGRADE:Object = {ctl:"rtech", act:"rtechupgrade"};
	//TechUpProxy.as: line 19: 	App.net.send(new HttpGetParams(PHPConsts.TECH_UPGRADE).getHttpString(), {techid:param1.techid}, this.onUpgradeSuccess, this.onUpgradeFailure, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.check);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_tech_err_arg"}

	/**
	 * 科技升级
	 * @param user
	 * @param techId
	 * TODO
	 * @return
	 */
	public static String techUpgrade(User user,int techId ) {
		return user.send(
			"&act=rtechupgrade&ctl=rtech",
			"{\"techid\":%d}", techId
		);
	}


	//public static const TECH_LIST:Object = {ctl:"rtech", act:"rtechlist"};
	//GetTechProxy.as: line 16: 	App.net.send(new HttpGetParams(PHPConsts.TECH_LIST).getHttpString(), {}, this.getResult, this.getFailure);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_rtechlistok","data":{"rtechlist":[{"_cls":"rTech","level":2,"techid":15},{"_cls":"rTech","level":49,"techid":9},{"_cls":"rTech","level":2,"techid":14},{"_cls":"rTech","level":49,"techid":5},{"_cls":"rTech","level":1,"techid":10},{"_cls":"rTech","level":12,"techid":11},{"_cls":"rTech","level":2,"techid":16},{"_cls":"rTech","level":10,"techid":13},{"_cls":"rTech","level":2,"techid":17},{"_cls":"rTech","level":49,"techid":4},{"_cls":"rTech","level":49,"techid":6},{"_cls":"rTech","level":22,"techid":12},{"_cls":"rTech","level":58,"techid":1},{"_cls":"rTech","level":49,"techid":7},{"_cls":"rTech","level":49,"techid":2},{"_cls":"rTech","level":49,"techid":8},{"_cls":"rTech","level":2,"techid":18},{"_cls":"rTech","level":49,"techid":3}],"_cls":"getrtechList"}}

	/**
	 * 科技初始化
	 * @param user
	 * @return
	 */
	public static String techList(User user) {
		return user.send(
			"&act=rtechlist&ctl=rtech",
			null
		);
	}


	//public static const GET_RMSGLIST:Object = {ctl:"rmsg", act:"getrmsglist"};
	//BigTurnTable.as: line 526: 	App.net.send(new HttpGetParams(PHPConsts.GET_RMSGLIST).getHttpString(), _loc_1, this.getSuccess);
	//XmasItem.as: line 121: 	App.net.send(new HttpGetParams(PHPConsts.GET_RMSGLIST).getHttpString(), _loc_1, this.getSuccess);
	//ArenaProxy.as: line 588: 	App.net.send(new HttpGetParams(PHPConsts.GET_RMSGLIST).getHttpString(), _loc_2, this.onGetNews, null, "default", "default", "default", RequestType.NORMAL);
	//GetArenaRecordServices.as: line 23: 	App.net.send(new HttpGetParams(PHPConsts.GET_RMSGLIST).getHttpString(), _loc_3, this.getSuccess, this.getFailure);
	//RequestNewsServices.as: line 19: 	App.net.send(new HttpGetParams(PHPConsts.GET_RMSGLIST).getHttpString(), _loc_3, this.onGetNews, null, "default", "default", "default", RequestType.NORMAL);
	//GetFarmMsgService.as: line 35: 	App.net.send(new HttpGetParams(PHPConsts.GET_RMSGLIST).getHttpString(), _loc_1, this.getSuccess, this.getFailure);
	//MallProxy.as: line 337: 	App.net.send(new HttpGetParams(PHPConsts.GET_RMSGLIST).getHttpString(), _loc_2, this.getSuccessPublic).jumpOutOfQueue();
	//MallProxy.as: line 347: 	App.net.send(new HttpGetParams(PHPConsts.GET_RMSGLIST).getHttpString(), _loc_2, this.getSuccessPersonal).jumpOutOfQueue();
	//TreeProxy.as: line 88: 	App.net.send(new HttpGetParams(PHPConsts.GET_RMSGLIST).getHttpString(), _loc_1, this.onGetBlessList, null, "default", "default", "default", RequestType.NORMAL);
	//MatchProxy.as: line 212: 	App.net.send(new HttpGetParams(PHPConsts.GET_RMSGLIST).getHttpString(), param1, this.getRankNews, null, "default", "default", "default", RequestType.NORMAL);
	//GetFireMsgService.as: line 35: 	App.net.send(new HttpGetParams(PHPConsts.GET_RMSGLIST).getHttpString(), _loc_1, this.getSuccess, this.getFailure);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_rawdataerr"}

	/**
	 * 获取信息
	 * @param user
	 * @param channel
	 * 
	 *	 COMMON = 1;
	     ARENA = 2;
	     TOWER = 3;
	     TREE = 4;
	     FARM = 5;
	     EVENT = 10000;
	     XMAS = 30000;
	     PET = 10;
	     ARENAV2 = 13;
	 * 	11 personal 
	 *  12 public
	 *  EVENT+loop = 转盘
	 *  TODO
	 * @param num
	 * @param type
	 * "num"
	 * @return
	 */
	public static String getRmsglist(User user, int channel, int num, String type) {
		return user.send(
			"&act=getrmsglist&ctl=rmsg",
			"{\"channel\":%d,\"num\":%d,\"by\":\"%s\"}",channel, num, type
		);
	}


	//public static const GET_RMSGSTATE:Object = {ctl:"rmsg", act:"uprmsg"};
	//MailItem.as: line 238: 	App.net.send(new HttpGetParams(PHPConsts.GET_RMSGSTATE).getHttpString(), {rmsgid:this._vo.msgid, channel:this._vo.channel});
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_rmsg_err_rmsgparamerr"}

	/**
	 * TODO
	 * @param user
	 * @param channel
	 * @param msgId
	 * @return
	 */
	public static String getRmsgstate(User user, int channel, int msgId) {
		return user.send(
			"&act=uprmsg&ctl=rmsg",
			"{\"rmsgid\":%d, \"channel\":%d}", msgId, channel
		);
	}


	//public static const GET_BLESSLIST:Object = {ctl:"tree", act:"getblesslist"};
	//<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"><html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8" /><title> - </title><style>body {	font-size:76%;	font-family:"Lucida Grande", Verdana, Lucida, Arial, Helvetica, sans-serif;	background-color:#FEFEFE;	color:#333333;	margin:0;}a{color:#f60;}a:hover{text-decoration:none;}.dialogtitle {	margin-bottom:10px;	font-weight:bold;}.dialogContent {	padding:10px;}</style><link rel="stylesheet" href="style/dialog.css" /></head><body><div style="margin:100px auto;width:500px;"><table border="0" cellspacing="0" cellpadding="0" id="windowTable">	<tr>		<td colspan="2" class="td9TL"></td>		<td class="td9TC"></td>		<td colspan="2" class="td9TR"></td>	</tr>	<tr>		<td class="td9ML2"></td>		<td class="td9ML"></td>		<td class="td9MC" id="windowContent"><div>	<div class="dialogtitle"><div></div></div>    <div class="dialogContent">    	<div style="width:450px;">       	类文件【/data/uuzu/wwwroot/sites/xwybeta/beta/lib/class/rtreelog.class.php】不存在，请联系网站管理员。<br />		<div align="center" style="margin-top:10px;">    <a href="javascript:history.back();"></a>		</div>    	</div>    </div></div>               </td>		<td class="td9MR"></td>		<td class="td9MR2"></td>	</tr>	<tr>		<td colspan="2" class="td9BL"></td>		<td class="td9BC"></td>		<td colspan="2" class="td9BR"></td>	</tr></table></div></body></html>

	/**
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String getBlesslist(User user) {
		return user.send(
			"&act=getblesslist&ctl=tree",
			null
		);
	}


	//public static const GET_TREEDATA:Object = {ctl:"tree", act:"gettree"};
	//TreeProxy.as: line 68: 	App.net.send(new HttpGetParams(PHPConsts.GET_TREEDATA).getHttpString(), null, this.onGetTreeData, null, "default", "default", "default", RequestType.DIALOG_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_gettreeinfook","data":{"techaddmoney":10700,"gainmoney":32000,"addgainmoney":160000,"sernum":0,"_cls":"getTreeInfo"}}

	/**
	 * 获取树的信息
	 * @param user
	 * @return
	 */
	public static String getTreedata(User user) {
		return user.send(
			"&act=gettree&ctl=tree",
			null
		);
	}


	//public static const RESET_ELITEBOSS:Object = {ctl:"reliteboss", act:"reseteliteboss"};
	//BossProxy.as: line 133: 	App.net.send(new HttpGetParams(PHPConsts.RESET_ELITEBOSS).getHttpString(), param1, this.responseResetBoss, null, "default", "default", "default", RequestType.MAP_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_rawdataerr"}

	/**
	 * 精英 重置
	 * @param user
	 * @return
	 */
	public static String resetEliteboss(User user) {
		return user.send(
			"&act=reseteliteboss&ctl=reliteboss",
			"{\"addone\":1}"
		);
	}


	//public static const RAID_ELITEBOSS:Object = {ctl:"reliteboss", act:"autofighteliteboss"};
	//BossProxy.as: line 174: 	App.net.send(new HttpGetParams(PHPConsts.RAID_ELITEBOSS).getHttpString(), _loc_2, this.onRaidBoss, null, "default", "default", "default", RequestType.DIALOG_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_rawdataerr"}

	  /**
     * 扫荡精英
     *
     * @param user
     * @param mapIds 精英 5000 - 5002 5003 - 5005 5006- 5008 5035.
     * mapIds = "5000,5001,5002" 
     * @return
     */
	public static String raidEliteboss(User user,String mapIds) {
		return user.send(
			"&act=autofighteliteboss&ctl=reliteboss",
			"{\"mapids\":[%s]}", mapIds
		);
	}


	//public static const GET_GIFTLIST:Object = {ctl:"rgift", act:"rgiftlist"};
	//MainUIManager.as: line 670: 	App.net.send(new HttpGetParams(PHPConsts.GET_GIFTLIST).getHttpString(), null, this.onGetGiftList);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getgiftok","data":{"_cls":"giftlist","giftlist":[{"_cls":"giftCfg","giftcfgid":"145","giftname":"\u81f3\u5c0a\u4e00\u7ea7\u6bcf\u65e5\u793c\u5305","gifttype":"1","starttime":"1357920000","endtime":"1421563680","receivetype":"1","receiveintval":"0","giftdesc":"\u81f3\u5c0a\u4e00\u7ea7\u6bcf\u65e5\u793c\u5305","giftnum":"1","condition":{"viplevel":["1","1"]},"awardcfgList":[{"_cls":"showItem","type":"money","cfgid":"0","num":"100000","sub":"0"}]}]}}

	/**
	 * 礼包列表
	 * @param user
	 * @return
	 */
	public static String getGiftlist(User user) {
		return user.send(
			"&act=rgiftlist&ctl=rgift",
			null
		);
	}


	//public static const USER_GIFT:Object = {ctl:"rgift", act:"usergift"};
	//LevelGiftPanel.as: line 88: 	App.net.send(new HttpGetParams(PHPConsts.USER_GIFT).getHttpString(), {giftid:this._giftid}, this.loadComplete).dropPoint = new Point(468, 500);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_rawdataerr"}

	/**
	 * 领取礼包
	 * @param user
	 * @param giftId
	 * @return
	 */
	public static String userGift(User user, int giftId) {
		return user.send(
			"&act=usergift&ctl=rgift",
			"{\"giftid\":%d}", giftId
		);
	}


	//public static const GET_LEVELGIFT:Object = {ctl:"rgift", act:"getlevelgiftcfg"};
	//MainUIManager.as: line 676: 	App.net.send(new HttpGetParams(PHPConsts.GET_LEVELGIFT).getHttpString(), null, this.onGetLevelGift).jumpOutOfQueue();
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getgiftok","data":[{"_cls":"giftCfg","giftcfgid":"53","giftname":"10\u7ea7\u65b0\u624b\u6210\u957f\u9636\u6bb5\u793c\u5305","gifttype":"4","starttime":"1355271900","endtime":"1426119900","receivetype":"0","receiveintval":"0","giftdesc":"10\u7ea7\u65b0\u624b\u6210\u957f\u9636\u6bb5\u793c\u5305","giftnum":"1","condition":{"rlevel":["10","150"]},"awardcfgList":[{"_cls":"showItem","type":"item","cfgid":"29","num":"1","sub":"0"},{"_cls":"showItem","type":"item","cfgid":"30","num":"1","sub":"0"},{"_cls":"showItem","type":"item","cfgid":"31","num":"1","sub":"0"},{"_cls":"showItem","type":"item","cfgid":"32","num":"1","sub":"0"},{"_cls":"showItem","type":"money","cfgid":"0","num":"50000","sub":"0"}]},{"_cls":"giftCfg","giftcfgid":"54","giftname":"15\u7ea7\u65b0\u624b\u6210\u957f\u9636\u6bb5\u793c\u5305","gifttype":"4","starttime":"1355272560","endtime":"1426120560","receivetype":"0","receiveintval":"0","giftdesc":"15\u7ea7\u65b0\u624b\u6210\u957f\u9636\u6bb5\u793c\u5305","giftnum":"1","condition":{"rlevel":["15","150"]},"awardcfgList":[{"_cls":"showItem","type":"item","cfgid":"500","num":"2","sub":"0"}]},{"_cls":"giftCfg","giftcfgid":"55","giftname":"20\u7ea7\u65b0\u624b\u6210\u957f\u9636\u6bb5\u793c\u5305","gifttype":"4","starttime":"1355273280","endtime":"1426121280","receivetype":"0","receiveintval":"0","giftdesc":"20\u7ea7\u65b0\u624b\u6210\u957f\u9636\u6bb5\u793c\u5305","giftnum":"1","condition":{"rlevel":["20","150"]},"awardcfgList":[{"_cls":"showItem","type":"item","cfgid":"33","num":"1","sub":"0"},{"_cls":"showItem","type":"item","cfgid":"34","num":"1","sub":"0"},{"_cls":"showItem","type":"item","cfgid":"35","num":"1","sub":"0"},{"_cls":"showItem","type":"item","cfgid":"36","num":"1","sub":"0"}]},{"_cls":"giftCfg","giftcfgid":"56","giftname":"25\u7ea7\u65b0\u624b\u6210\u957f\u9636\u6bb5\u793c\u5305","gifttype":"4","starttime":"1355273400","endtime":"1426121400","receivetype":"0","receiveintval":"0","giftdesc":"25\u7ea7\u65b0\u624b\u6210\u957f\u9636\u6bb5\u793c\u5305","giftnum":"1","condition":{"rlevel":["25","150"]},"awardcfgList":[{"_cls":"showItem","type":"item","cfgid":"286","num":"2","sub":"0"}]},{"_cls":"giftCfg","giftcfgid":"57","giftname":"30\u7ea7\u65b0\u624b\u6210\u957f\u9636\u6bb5\u793c\u5305","gifttype":"4","starttime":"1355273400","endtime":"1426121400","receivetype":"0","receiveintval":"0","giftdesc":"30\u7ea7\u65b0\u624b\u6210\u957f\u9636\u6bb5\u793c\u5305","giftnum":"1","condition":{"rlevel":["30","150"]},"awardcfgList":[{"_cls":"showItem","type":"item","cfgid":"37","num":"1","sub":"0"},{"_cls":"showItem","type":"item","cfgid":"38","num":"1","sub":"0"},{"_cls":"showItem","type":"item","cfgid":"39","num":"1","sub":"0"},{"_cls":"showItem","type":"item","cfgid":"40","num":"1","sub":"0"}]}]}

	/**
	 * 等级礼包
	 * @param user
	 * @return
	 */
	public static String getLevelgift(User user) {
		return user.send(
			"&act=getlevelgiftcfg&ctl=rgift",
			null
		);
	}


	//public static const EQUIP_ARTI:Object = {ctl:"arti", act:"equiparti"};
	//ArtifactsProxy.as: line 156: 	App.net.send(new HttpGetParams(PHPConsts.EQUIP_ARTI).getHttpString(), _loc_3, this.onEquipSetResult, this.failHandler);
	//ArtifactsProxy.as: line 178: 	App.net.send(new HttpGetParams(PHPConsts.EQUIP_ARTI).getHttpString(), _loc_3, this.onEquipSetResult);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_arti_err_artinotexist"}

	/**
	 * 装备神兵
	 * @param user
	 * @param warrior
	 * @param arti
	 * @return
	 */
	public static String equipArti(User user, int warrior, int arti) {
		return user.send(
			"&act=equiparti&ctl=arti",
			"{\"rwarriorid\":%d,\"rbagitemId\":%d}",warrior, arti
		);
	}


	//public static const UPGREAT_ARTI:Object = {ctl:"arti", act:"upgradearti"};
	//ArtiPromotionMediator.as: line 89: 	App.net.send(new HttpGetParams(PHPConsts.UPGREAT_ARTI).getHttpString(), _loc_4, this.strengthResult, this.failHandler, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.doubleCheck, [_loc_2]);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_arti_err_itemnotexist"}

	/**
	 * 神兵升级
	 * @param user
	 * @param arti
	 * @return
	 */
	public static String upgreatArti(User user, int arti) {
		return user.send(
			"&act=upgradearti&ctl=arti",
			"{\"rbagitemId\":%d}", arti
		);
	}


	//public static const TALISMAN_BESET:Object = {ctl:"arti", act:"settalisman"};
	//ArtifactsProxy.as: line 62: 	App.net.send(new HttpGetParams(PHPConsts.TALISMAN_BESET).getHttpString(), _loc_4, this.onBesetSuccess);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_home_err_paramnotvalid"}

	/**
	 * 神兵装符文
	 * @param user
	 * @param arti
	 * @param tailsman
	 * "0":id,"1",id,"2":id
	 * @return
	 */
	public static String talismanBeset(User user, int arti, String tailsman) {
		return user.send(
			"&act=settalisman&ctl=arti",
			"{\"arrTalisman\":{%s},\"rbagitemId\":%d}",tailsman, arti
		);
	}


	//public static const TALISMAN_LEVELUP:Object = {ctl:"arti", act:"upgradeTalisman"};
	//ArtifactsProxy.as: line 74: 	App.net.send(new HttpGetParams(PHPConsts.TALISMAN_LEVELUP).getHttpString(), {rbagitemId:_loc_2.id, num:_loc_3, succnum:_loc_4}, this.onTalismanLevel);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_arti_err_talismannotexist"}

	/**
	 * 符文合成
	 * @param user
	 * @param tailsman
	 * @param num
	 * @param succ
	 * @return
	 */
	public static String talismanLevelup(User user, int tailsman, int num, int succ) {
		return user.send(
			"&act=upgradeTalisman&ctl=arti",
			"{\"rbagitemId\":%d, \"num\":%d, \"succnum\":%d}", tailsman, num, succ
		);
	}


	//public static const GET_SECRETGOODS:Object = {ctl:"shop", act:"getmysticalshop"};
	//MallProxy.as: line 161: 	App.net.send(new HttpGetParams(PHPConsts.GET_SECRETGOODS).getHttpString(), null, this.onGetSecretData, null, "default", "default", "default", RequestType.DIALOG_INIT);
	//MallProxy.as: line 280: 	App.net.send(new HttpGetParams(PHPConsts.GET_SECRETGOODS).getHttpString(), null, this.onRefreshSecretData, null, "default", "default", "default", RequestType.DIALOG_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_mshopclosed"}

	/**
	 * 获取神秘商店信息
	 * @param user
	 * @return
	 */
	public static String getSecretgoods(User user) {
		return user.send(
			"&act=getmysticalshop&ctl=shop",
			null
		);
	}


	//public static const BUY_SECRETGOOD:Object = {ctl:"shop", act:"buymysticalgoods"};
	//MallProxy.as: line 272: 	App.net.send(new HttpGetParams(PHPConsts.BUY_SECRETGOOD).getHttpString(), _loc_3, this.refreshSecretHandler, this.refreshSecretHandler, "default", "default", "default", RequestType.NORMAL).dropPoint = new Point(450, 300);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_buymgoodsiderr"}

	/**
	 * 购买神秘商店
	 * @param user
	 * @param goods
	 * @param num
	 * @return
	 */
	public static String buySecretgood(User user, int goods, int num) {
		return user.send(
			"&act=buymysticalgoods&ctl=shop",
			"{\"goodsid\":%d,\"num\":%d}", goods, num
		);
	}


	//public static const BUY_SPA_DUMPLINGS:Object = {ctl:"spa", act:"buyspa"};
	//BuySpaConfirmPanel.as: line 42: 	App.net.send(new HttpGetParams(PHPConsts.BUY_SPA_DUMPLINGS).getHttpString(), {}, null, null, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.doubleCheck).dropPoint = new Point(400, 300);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_buyspaok","change":{"_cls":"changeObj","role":{"805493":{"gamepoint":"35","nowstamina":"93","laststaminatime":1405787483,"canbuyspa":0}},"rwarrior":null,"rwarriorskill":null,"rwarriorskillbuff":null,"rbagitem":null,"rbuild":null,"rquest":null,"rmap":null,"rwarriorinpub":null,"rwarriorgroup":null,"roperator":null}}

	/**
	 * 买温泉包子
	 * @param user
	 * @return
	 */
	public static String buySpaDumplings(User user) {
		return user.send(
			"&act=buyspa&ctl=spa",
			"{}"
		);
	}


	//public static const GUILD_CREATE:Object = {ctl:"guild", act:"createguild"};
	//CreateGuildProxy.as: line 70: 	App.net.send(new HttpGetParams(PHPConsts.GUILD_CREATE).getHttpString(), _data, this.createSuccess, this.createFailure);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_guild_err_createinfoerr"}

	/**
	 * 创建帮派
	 * @param user
	 * @param name
	 * @param notice
	 * @param qq
	 * @param useMoney
	 * @return
	 */
	public static String guildCreate(User user, String name, String notice, String qq, boolean useMoney) {
		return user.send(
			"&act=createguild&ctl=guild",
			"{\"gqq\":\"%s\",\"gname\":\"%s\",\"gnotice\":\"%s\",\"typeid\":%s}", qq, name, notice, useMoney?2:1
		);
	}


	//public static const GUILD_APPLY:Object = {ctl:"guild", act:"applyguild"};
	//ApplyGuildProxy.as: line 19: 	App.net.send(new HttpGetParams(PHPConsts.GUILD_APPLY).getHttpString(), _loc_3, this.successHandler, this.failureHandler);
	//MsgProxy.as: line 25: 	App.net.send(new HttpGetParams(PHPConsts.GUILD_APPLY).getHttpString(), _loc_2, this.successHandler, this.failureHandler);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_guild_err_applyguildiderr"}

	/**
	 * 
	 * @param user
	 * @param unionId
	 * @return
	 */
	public static String guildApply(User user, int unionId) {
		return user.send(
			"&act=applyguild&ctl=guild",
			"{\"gid\":%d}", unionId
		);
	}


	//public static const GUILD_OPEN:Object = {ctl:"guild", act:"openguildbase"};
	//GetGuildProxy.as: line 16: 	App.net.send(new HttpGetParams(PHPConsts.GUILD_OPEN).getHttpString(), null, this.getSuccess, this.getFailure, "default", "default", "default", RequestType.DIALOG_INIT);
	//GetGuildProxy.as: line 17: 	App.net.send(new HttpGetParams(PHPConsts.GUILD_OPEN).getHttpString(), null, this.getSuccess, this.getFailure, "default", "default", "default", RequestType.DIALOG_INIT);
	//GetGuildProxy.as: line 17: 	App.net.send(new HttpGetParams(PHPConsts.GUILD_OPEN).getHttpString(), null, this.getSuccess, this.getFailure, "default", "default", "default", RequestType.DIALOG_INIT);
	//GetGuildProxy.as: line 16: 	App.net.send(new HttpGetParams(PHPConsts.GUILD_OPEN).getHttpString(), null, this.getSuccess, this.getFailure, "default", "default", "default", RequestType.DIALOG_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_ser_suc_toopenguildbaseok","data":{"guildinfo":{"_cls":"guildinfo","gid":"126888","gname":"\u534a\u591c\u4e09\u66f4","glevel":"16","gmoney":"12336430","gqq":"0123456","gnotice":"","applyflag":"1","extrapeople":"10","memnum":1,"topaward1":{"_cls":"showItem","type":"item","cfgid":837,"num":0,"sub":"0"},"topaward2":{"_cls":"showItem","type":"item","cfgid":838,"num":0,"sub":"0"},"chairmanrid":"805493","chairmanrnm":"Ming","chairmangender":1,"superdial":1,"changewater":0,"contribute":0,"gpower":369548},"memlist":[{"_cls":"memlist","rid":"805493","nickname":"Ming","intgender":1,"level":"62","power":369548,"gtodaycon":0,"gallcon":"11490","lastlogintime":"1405786794","ischairman":1,"online":1}],"applynum":0,"_cls":"toopenguildbase"}}

	/**
	 * 打开帮派界面
	 * @param user
	 * @return
	 */
	public static String guildOpen(User user) {
		return user.send(
			"&act=openguildbase&ctl=guild",
			null
		);
	}


	//public static const GUILD_LIST:Object = {ctl:"guild", act:"getguildlist"};
	//GetGuildListProxy.as: line 16: 	App.net.send(new HttpGetParams(PHPConsts.GUILD_LIST).getHttpString(), null, this.getSuccess, this.getFailure).jumpOutOfQueue();
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_guild_err_hasguild"}

	/**
	 * 随机帮派列表
	 * @param user
	 * @return
	 */
	public static String guildList(User user) {
		return user.send(
			"&act=getguildlist&ctl=guild",
			null
		);
	}


	//public static const GUILD_INFO_CHECK:Object = {ctl:"guild", act:"checkguildinfo"};
	//GetGuildDetailProxy.as: line 26: 	App.net.send(new HttpGetParams(PHPConsts.GUILD_INFO_CHECK).getHttpString(), _loc_3, this.successHandler, this.failureHandler);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_guild_err_checkguildiderr"}

	/**
	 * 获取帮派信息
	 * @param user
	 * @param uid
	 * @return
	 */
	public static String guildInfoCheck(User user, int uid) {
		return user.send(
			"&act=checkguildinfo&ctl=guild",
			"{\"gid\":%d}", uid
		);
	}


	//public static const START_FATE:Object = {ctl:"rfate", act:"startfate"};
	//DestinyProxy.as: line 263: 	App.net.send(new HttpGetParams(PHPConsts.START_FATE).getHttpString(), _loc_2, this.onHuntResult, null, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.doubleCheck, [event.data.handlertype]);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_fate_err_arg"}

	/**
	 * 问卦
	 * @param user
	 * @param type
	 * single   batch
	 * @return
	 */
	public static String startFate(User user, String type) {
		return user.send(
			"&act=startfate&ctl=rfate",
			"{\"handlertype\":\"%s\"}", type
		);
	}


	//public static const FATE_EXCHANGE:Object = {ctl:"rfate", act:"changesoultofate"};
	//DestinyProxy.as: line 397: 	App.net.send(new HttpGetParams(PHPConsts.FATE_EXCHANGE).getHttpString(), {fateid:_loc_2.itemcfgid}, this.exchangeSuccess);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_requesterr"}

	/**
	 * 魂值兑换
	 * @param user
	 * @param fate
	 * @return
	 */
	public static String fateExchange(User user, int fate) {
		return user.send(
			"&act=changesoultofate&ctl=rfate",
			"{\"fateid\":%d}", fate
		);
	}


	//public static const GET_COMPASSINFO:Object = {ctl:"rfate", act:"getfatecompassinfo"};
	//DestinyProxy.as: line 298: 	App.net.send(new HttpGetParams(PHPConsts.GET_COMPASSINFO).getHttpString(), null, this.onGetCompassResult);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_fateinfo","data":{"compassinfo":{"1":0}}}

	/**
	 * 挂盘信息
	 * @param user
	 * @return
	 */
	public static String getCompassinfo(User user) {
		return user.send(
			"&act=getfatecompassinfo&ctl=rfate",
			null
		);
	}


	//public static const PICK_FATE:Object = {ctl:"rfate", act:"pickfate"};
	//DestinyProxy.as: line 82: 	App.net.send(new HttpGetParams(PHPConsts.PICK_FATE).getHttpString(), _loc_2, this.onPickResult, null, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.doublePickCheck, [event.data.handlertype]);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_fate_err_arg"}

	/**
	 * 取卦
	 * @param user
	 * @param index
	 * @return
	 */
	public static String pickFate(User user, int index) {
		return user.send(
			"&act=pickfate&ctl=rfate",
			"{\"compassid\":%d,\"handlertype\":\"single\"}", index
		);
	}

	/**
	 * 一键取卦
	 * @param user
	 * @return
	 */
	public static String pickFate(User user) {
		return user.send(
			"&act=pickfate&ctl=rfate",
			"{\"handlertype\":\"batch\"}"
		);
	}

	//public static const MERGE_FATE:Object = {ctl:"rfate", act:"decomposefate"};
	//DestinyProxy.as: line 143: 	App.net.send(new HttpGetParams(PHPConsts.MERGE_FATE).getHttpString(), _loc_2, this.onMergeResult, null, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.doubleMergeCheck, [event.data.req.handlertype]).dropPoint = event.data.point;
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_fate_err_arg"}

	/**
	 * 化卦
	 * @param user
	 * @param id
	 * @return
	 */
	public static String mergeFate(User user, int id) {
		return user.send(
			"&act=decomposefate&ctl=rfate",
			"{\"handlertype\":\"single\",\"rbagitemid\":%d}", id
		);
	}

	/**
	 * 一键化卦
	 * @param user
	 * @return
	 */
	public static String mergeFate(User user) {
		return user.send(
			"&act=decomposefate&ctl=rfate",
			"{\"handlertype\":\"batch\"}"
		);
	}

	//public static const EQUIP_FATE:Object = {ctl:"rfate", act:"equipfate"};
	//DestinyProxy.as: line 224: 	App.net.send(new HttpGetParams(PHPConsts.EQUIP_FATE).getHttpString(), _loc_3, this.onEquipResult);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_fate_err_arg"}

	/**
	 * 装备卦象
	 * @param user
	 * @param warrior
	 * @param fateId
	 * @param pos
	 * @return
	 */
	public static String equipFate(User user, int warrior, int fateId, int pos) {
		return user.send(
			"&act=equipfate&ctl=rfate",
			"{\"rbagitemid\":%s,\"rwarriorid\":%s,\"fateequipid\":%d}", fateId, warrior, pos
		);
	}

	public static String unequipFate(User user, int warrior, int fateId) {
		return user.send(
			"&act=equipfate&ctl=rfate",
			"{\"rbagitemid\":%d,\"rwarriorid\":%d}", fateId, warrior
		);
	}

	//public static const UPGRADE_FATE:Object = {ctl:"rfate", act:"upgradefate"};
	//DestinyProxy.as: line 180: 	App.net.send(new HttpGetParams(PHPConsts.UPGRADE_FATE).getHttpString(), _loc_2, this.onUpgradeResult, null, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.doubleUpgradeCheck, [_loc_3]);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_fate_err_arg"}

	/**
	 * 卦象升级
	 * @param user
	 * @param id
	 * @return
	 */
	public static String upgradeFate(User user, int id) {
		return user.send(
			"&act=upgradefate&ctl=rfate",
			"{\"rbagitemid\":%d}", id
		);
	}


	//public static const GUILD_GET_APPLYLIST:Object = {ctl:"guild", act:"getguildapplylist"};
	//GetApplyListProxy.as: line 18: 	App.net.send(new HttpGetParams(PHPConsts.GUILD_GET_APPLYLIST).getHttpString(), null, this.getSuccess, this.getFailure);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_guild_suc_togetguildapplylistok","data":{"applylist":[],"_cls":"togetguildapplylist"}}

	/**
	 * 获取帮派申请信息
	 * @param user
	 * @return
	 */
	public static String guildGetApplylist(User user) {
		return user.send(
			"&act=getguildapplylist&ctl=guild",
			null
		);
	}


	//public static const GUILD_APPLY_DEAL:Object = {ctl:"guild", act:"chmoperateapply"};
	//ApplyDealProxy.as: line 29: 	App.net.send(new HttpGetParams(PHPConsts.GUILD_APPLY_DEAL).getHttpString(), _loc_4, this.dealSuccess, this.dealFailure);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_guild_err_operateapplyparamerr"}

	/**
	 * 处理申请信息
	 * @param user
	 * @param rid
	 * @param kind
	 *  AGREE:int = 1;
        IGNORE:int = 2;
        IGNORE_ALL:int = 3;
	 * @return
	 */
	public static String guildApplyDeal(User user, int rid, int kind) {
		return user.send(
			"&act=chmoperateapply&ctl=guild",
			"{\"kind\":%d,\"rid\":%d}", kind, rid
		);
	}


	//public static const GUILD_GET_LOG:Object = {ctl:"guild", act:"getguildlogs"};
	//GetLogListProxy.as: line 17: 	App.net.send(new HttpGetParams(PHPConsts.GUILD_GET_LOG).getHttpString(), _loc_2, this.getSuccess, this.getFailure);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_guild_suc_togetguildlogsok","data":{"rmsglist":[{"_cls":"rmsg","channel":9,"msgid":469352429,"msgtypeid":1,"msgstrid":5,"token":{"rolename":"%E9%82%B9%E9%B8%BF%E5%8D%9A"},"action":"","msgtime":1405231230,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352425,"msgtypeid":1,"msgstrid":5,"token":{"rolename":"%E8%9E%8D%E5%92%8C%E7%95%85"},"action":"","msgtime":1405231229,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352424,"msgtypeid":1,"msgstrid":7,"token":{"rolename":"%E9%82%B9%E9%B8%BF%E5%8D%9A","num":10000,"num2":100,"num3":100},"action":"","msgtime":1405231229,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352419,"msgtypeid":1,"msgstrid":5,"token":{"rolename":"%E8%8B%8F%E5%8D%8E%E8%BE%89"},"action":"","msgtime":1405231228,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352418,"msgtypeid":1,"msgstrid":7,"token":{"rolename":"%E8%9E%8D%E5%92%8C%E7%95%85","num":10000,"num2":100,"num3":100},"action":"","msgtime":1405231228,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352413,"msgtypeid":1,"msgstrid":5,"token":{"rolename":"%E6%9D%AD%E4%BF%8A%E6%99%BA"},"action":"","msgtime":1405231228,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352407,"msgtypeid":1,"msgstrid":5,"token":{"rolename":"%E6%A0%BE%E5%98%89%E5%BA%86"},"action":"","msgtime":1405231228,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352399,"msgtypeid":1,"msgstrid":5,"token":{"rolename":"%E4%BF%9E%E9%A3%9E%E9%B9%8F"},"action":"","msgtime":1405231227,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352398,"msgtypeid":1,"msgstrid":2,"token":{"rolename":"%E9%82%B9%E9%B8%BF%E5%8D%9A"},"action":"","msgtime":1405231227,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352396,"msgtypeid":1,"msgstrid":7,"token":{"rolename":"%E8%8B%8F%E5%8D%8E%E8%BE%89","num":10000,"num2":100,"num3":100},"action":"","msgtime":1405231227,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352390,"msgtypeid":1,"msgstrid":7,"token":{"rolename":"%E6%9D%AD%E4%BF%8A%E6%99%BA","num":10000,"num2":100,"num3":100},"action":"","msgtime":1405231227,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352389,"msgtypeid":1,"msgstrid":7,"token":{"rolename":"%E6%A0%BE%E5%98%89%E5%BA%86","num":10000,"num2":100,"num3":100},"action":"","msgtime":1405231227,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352382,"msgtypeid":1,"msgstrid":5,"token":{"rolename":"%E6%B0%B4%E5%AE%8F%E5%A3%AE"},"action":"","msgtime":1405231226,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352381,"msgtypeid":1,"msgstrid":2,"token":{"rolename":"%E8%9E%8D%E5%92%8C%E7%95%85"},"action":"","msgtime":1405231226,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352378,"msgtypeid":1,"msgstrid":7,"token":{"rolename":"%E4%BF%9E%E9%A3%9E%E9%B9%8F","num":10000,"num2":100,"num3":100},"action":"","msgtime":1405231226,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352367,"msgtypeid":1,"msgstrid":5,"token":{"rolename":"%E5%AD%94%E5%AE%BE%E5%AE%9E"},"action":"","msgtime":1405231226,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352359,"msgtypeid":1,"msgstrid":5,"token":{"rolename":"%E6%B1%A0%E5%BB%BA%E5%BC%BC"},"action":"","msgtime":1405231226,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352350,"msgtypeid":1,"msgstrid":5,"token":{"rolename":"%E6%88%90%E9%A3%9E%E7%BF%94"},"action":"","msgtime":1405231225,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352349,"msgtypeid":1,"msgstrid":7,"token":{"rolename":"%E6%B0%B4%E5%AE%8F%E5%A3%AE","num":10000,"num2":100,"num3":100},"action":"","msgtime":1405231225,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352348,"msgtypeid":1,"msgstrid":2,"token":{"rolename":"%E8%8B%8F%E5%8D%8E%E8%BE%89"},"action":"","msgtime":1405231225,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352338,"msgtypeid":1,"msgstrid":2,"token":{"rolename":"%E6%9D%AD%E4%BF%8A%E6%99%BA"},"action":"","msgtime":1405231225,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352323,"msgtypeid":1,"msgstrid":5,"token":{"rolename":"%E7%94%B3%E9%A3%9E%E8%88%9F"},"action":"","msgtime":1405231225,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352322,"msgtypeid":1,"msgstrid":7,"token":{"rolename":"%E5%AD%94%E5%AE%BE%E5%AE%9E","num":10000,"num2":100,"num3":100},"action":"","msgtime":1405231225,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352321,"msgtypeid":1,"msgstrid":2,"token":{"rolename":"%E6%A0%BE%E5%98%89%E5%BA%86"},"action":"","msgtime":1405231225,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352306,"msgtypeid":1,"msgstrid":5,"token":{"rolename":"%E6%B1%AA%E9%B8%BF%E5%85%89"},"action":"","msgtime":1405231225,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352305,"msgtypeid":1,"msgstrid":7,"token":{"rolename":"%E6%B1%A0%E5%BB%BA%E5%BC%BC","num":10000,"num2":100,"num3":100},"action":"","msgtime":1405231225,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352304,"msgtypeid":1,"msgstrid":7,"token":{"rolename":"%E6%88%90%E9%A3%9E%E7%BF%94","num":10000,"num2":100,"num3":100},"action":"","msgtime":1405231224,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352303,"msgtypeid":1,"msgstrid":2,"token":{"rolename":"%E4%BF%9E%E9%A3%9E%E9%B9%8F"},"action":"","msgtime":1405231224,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352287,"msgtypeid":1,"msgstrid":5,"token":{"rolename":"%E5%B7%A9%E6%B6%B5%E7%95%85"},"action":"","msgtime":1405231224,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352286,"msgtypeid":1,"msgstrid":7,"token":{"rolename":"%E7%94%B3%E9%A3%9E%E8%88%9F","num":10000,"num2":100,"num3":100},"action":"","msgtime":1405231224,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352277,"msgtypeid":1,"msgstrid":5,"token":{"rolename":"%E5%86%89%E6%B6%B5%E6%B6%A4"},"action":"","msgtime":1405231224,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352276,"msgtypeid":1,"msgstrid":2,"token":{"rolename":"%E6%B0%B4%E5%AE%8F%E5%A3%AE"},"action":"","msgtime":1405231223,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352275,"msgtypeid":1,"msgstrid":7,"token":{"rolename":"%E6%B1%AA%E9%B8%BF%E5%85%89","num":10000,"num2":100,"num3":100},"action":"","msgtime":1405231223,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352256,"msgtypeid":1,"msgstrid":5,"token":{"rolename":"%E4%B8%98%E9%94%A6%E7%A8%8B"},"action":"","msgtime":1405231223,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352251,"msgtypeid":1,"msgstrid":7,"token":{"rolename":"%E5%B7%A9%E6%B6%B5%E7%95%85","num":10000,"num2":100,"num3":100},"action":"","msgtime":1405231223,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352247,"msgtypeid":1,"msgstrid":2,"token":{"rolename":"%E5%AD%94%E5%AE%BE%E5%AE%9E"},"action":"","msgtime":1405231223,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352244,"msgtypeid":1,"msgstrid":5,"token":{"rolename":"%E5%82%85%E5%BE%B7%E5%8D%8E"},"action":"","msgtime":1405231223,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352235,"msgtypeid":1,"msgstrid":2,"token":{"rolename":"%E6%B1%A0%E5%BB%BA%E5%BC%BC"},"action":"","msgtime":1405231223,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352229,"msgtypeid":1,"msgstrid":7,"token":{"rolename":"%E5%86%89%E6%B6%B5%E6%B6%A4","num":10000,"num2":100,"num3":100},"action":"","msgtime":1405231222,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352225,"msgtypeid":1,"msgstrid":2,"token":{"rolename":"%E6%88%90%E9%A3%9E%E7%BF%94"},"action":"","msgtime":1405231222,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352210,"msgtypeid":1,"msgstrid":5,"token":{"rolename":"%E4%BD%99%E5%BC%98%E5%8D%9A"},"action":"","msgtime":1405231222,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352209,"msgtypeid":1,"msgstrid":7,"token":{"rolename":"%E4%B8%98%E9%94%A6%E7%A8%8B","num":10000,"num2":100,"num3":100},"action":"","msgtime":1405231222,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352208,"msgtypeid":1,"msgstrid":2,"token":{"rolename":"%E7%94%B3%E9%A3%9E%E8%88%9F"},"action":"","msgtime":1405231222,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352193,"msgtypeid":1,"msgstrid":5,"token":{"rolename":"%E6%9F%B4%E5%BB%BA%E6%9C%AC"},"action":"","msgtime":1405231222,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352191,"msgtypeid":1,"msgstrid":7,"token":{"rolename":"%E5%82%85%E5%BE%B7%E5%8D%8E","num":10000,"num2":100,"num3":100},"action":"","msgtime":1405231222,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352189,"msgtypeid":1,"msgstrid":2,"token":{"rolename":"%E6%B1%AA%E9%B8%BF%E5%85%89"},"action":"","msgtime":1405231221,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352176,"msgtypeid":1,"msgstrid":5,"token":{"rolename":"%E5%AE%93%E6%89%BF%E5%B9%B3"},"action":"","msgtime":1405231221,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352165,"msgtypeid":1,"msgstrid":5,"token":{"rolename":"3013988642"},"action":"","msgtime":1405231221,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352164,"msgtypeid":1,"msgstrid":7,"token":{"rolename":"%E4%BD%99%E5%BC%98%E5%8D%9A","num":10000,"num2":100,"num3":100},"action":"","msgtime":1405231221,"isread":0,"isopt":"0"},{"_cls":"rmsg","channel":9,"msgid":469352163,"msgtypeid":1,"msgstrid":2,"token":{"rolename":"%E5%B7%A9%E6%B6%B5%E7%95%85"},"action":"","msgtime":1405231221,"isread":0,"isopt":"0"}],"_cls":"togetguildlogs"}}

	/**
	 * 获取帮派记录
	 * @param user
	 * @param num
	 * @return
	 */
	public static String guildGetLog(User user,int num) {
		return user.send(
			"&act=getguildlogs&ctl=guild",
			"{\"num\":%d}", num
		);
	}


	//public static const GUILD_DISBAND:Object = {ctl:"guild", act:"dismissguild"};
	//DisbandProxy.as: line 33: 	App.net.send(new HttpGetParams(PHPConsts.GUILD_DISBAND).getHttpString(), null, this.disbandSuccess, this.disbandFailure);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_guild_suc_todismissguildok","change":{"_cls":"changeObj","role":{"805493":{"contribution":"0","guildid":"","gmemtechlist":""}},"rwarrior":null,"rwarriorskill":null,"rwarriorskillbuff":null,"rbagitem":null,"rbuild":null,"rquest":null,"rmap":null,"rwarriorinpub":null,"rwarriorgroup":null,"roperator":null}}

	/**
	 * 解散帮派... 慎用
	 * @param user
	 * @return
	 */
	public static String guildDisband(User user) {
		return user.send(
			"&act=dismissguild&ctl=guild",
			null
		);
	}


	//public static const GUILD_INFO_SET:Object = {ctl:"guild", act:"updatesetting"};
	//SetGuildInfoProxy.as: line 22: 	App.net.send(new HttpGetParams(PHPConsts.GUILD_INFO_SET).getHttpString(), _loc_4, this.setSuccess, this.end);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_guild_err_createinfoerr"}

	/**
	 * 修改信息
	 * @param user
	 * @param qq
	 * @param notice
	 * @param acceptApply
	 * TODO 0?1?
	 * @return
	 */
	public static String guildInfoSet(User user, String qq, String notice, boolean acceptApply) {
		return user.send(
			"&act=updatesetting&ctl=guild",
			"{\"gqq\":\"%s\",\"applyflag\":%d,\"gnotice\":\"%s\"}", qq, acceptApply?1:0,notice
		);
	}


	//public static const GUILD_CREATOR_OPERATE:Object = {ctl:"guild", act:"chmoperatemem"};
	//CreatorOperateProxy.as: line 53: 	App.net.send(new HttpGetParams(PHPConsts.GUILD_CREATOR_OPERATE).getHttpString(), _loc_1, this.operateSuccess, this.operateFailure);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_guild_err_operatememparamerr"}

	/**
	 * 帮主管理
	 * @param user
	 * @param mem
	 * @param kind
	 * 1 踢人   2 转让帮主
	 * @return
	 */
	public static String guildCreatorOperate(User user, int mem, int kind) {
		return user.send(
			"&act=chmoperatemem&ctl=guild",
			"{\"kind\":%d,\"rid\":%d}", kind,  mem
		);
	}


	//public static const GUILD_MEMBER_OPERATE:Object = {ctl:"guild", act:"memoperatemem"};
	//MemberOperateProxy.as: line 41: 	App.net.send(new HttpGetParams(PHPConsts.GUILD_MEMBER_OPERATE).getHttpString(), _loc_1, this.operateSuccess, this.operateFailure);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_guild_err_memoperateparamerr"}

	/**
	 * 帮派会员操作
	 * @param user
	 * @param kind
	 * 1 退出   TODO 2弹劾？
	 * @return
	 */
	public static String guildMemberOperate(User user,int kind) {
		return user.send(
			"&act=memoperatemem&ctl=guild",
			"{\"kind\":%d,\"rid\":0}", kind
		);
	}


	//public static const GUILD_MALL_PLAYDIAL:Object = {ctl:"guild", act:"playdial"};
	//GuildMallManager.as: line 69: 	App.net.send(new HttpGetParams(PHPConsts.GUILD_MALL_PLAYDIAL).getHttpString(), {kind:this._id}, this.getReward, this.getFail, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.Dcheck, [this._id]);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_guild_err_noguild"}

	/**
	 * 帮派转盘
	 * @param user
	 * @param type
	 * 2 大转盘  1小转盘
	 * @return
	 */
	public static String guildMallPlaydial(User user, int type) {
		return user.send(
			"&act=playdial&ctl=guild",
			"{\"kind\":%d}", type
		);
	}


	//public static const GET_ONLINE_TIME:Object = {ctl:"system", act:"logoltime"};
	//OnLineProxy.as: line 66: 	App.net.send(new HttpGetParams(PHPConsts.GET_ONLINE_TIME).getHttpString(), null, this.onGetTotalTime);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_logoltimesuc","data":{"totaloltime":0,"_cls":"logoltime"}}

	/**
	 * 获取在线时间
	 * @param user
	 * @return
	 */
	public static String getOnlineTime(User user) {
		return user.send(
			"&act=logoltime&ctl=system",
			null
		);
	}


	//public static const GET_SINA_ONLINE_TIME:Object = {ctl:"sina", act:"getonlinetime"};
	//OnLineProxy.as: line 51: 	App.net.send(new HttpGetParams(PHPConsts.GET_SINA_ONLINE_TIME).getHttpString(), null, this.onGetSinaTotalTime);
	//<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"><html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8" /><title> - </title><style>body {	font-size:76%;	font-family:"Lucida Grande", Verdana, Lucida, Arial, Helvetica, sans-serif;	background-color:#FEFEFE;	color:#333333;	margin:0;}a{color:#f60;}a:hover{text-decoration:none;}.dialogtitle {	margin-bottom:10px;	font-weight:bold;}.dialogContent {	padding:10px;}</style><link rel="stylesheet" href="style/dialog.css" /></head><body><div style="margin:100px auto;width:500px;"><table border="0" cellspacing="0" cellpadding="0" id="windowTable">	<tr>		<td colspan="2" class="td9TL"></td>		<td class="td9TC"></td>		<td colspan="2" class="td9TR"></td>	</tr>	<tr>		<td class="td9ML2"></td>		<td class="td9ML"></td>		<td class="td9MC" id="windowContent"><div>	<div class="dialogtitle"><div></div></div>    <div class="dialogContent">    	<div style="width:450px;">       	方法【getonlinetime】未定义，请联系网站管理员。<br />		<div align="center" style="margin-top:10px;">    <a href="javascript:history.back();"></a>		</div>    	</div>    </div></div>               </td>		<td class="td9MR"></td>		<td class="td9MR2"></td>	</tr>	<tr>		<td colspan="2" class="td9BL"></td>		<td class="td9BC"></td>		<td colspan="2" class="td9BR"></td>	</tr></table></div></body></html>

	/**
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String getSinaOnlineTime(User user) {
		return user.send(
			"&act=getonlinetime&ctl=sina",
			null
		);
	}


	//public static const GUILD_GET_TECH:Object = {ctl:"guild", act:"getguildtech"};
	//GetGuildTechProxy.as: line 18: 	App.net.send(new HttpGetParams(PHPConsts.GUILD_GET_TECH).getHttpString(), null, this.getSuccess, this.getFailure, "default", "default", "default", RequestType.DIALOG_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_guild_err_noguild"}

	/**
	 * 帮派科技
	 * @param user
	 * @return
	 */
	public static String guildGetTech(User user) {
		return user.send(
			"&act=getguildtech&ctl=guild",
			null
		);
	}


	//public static const GUILD_TECH_OP:Object = {ctl:"guild", act:"operateguildtech"};
	//GuildTechOpProxy.as: line 45: 	App.net.send(new HttpGetParams(PHPConsts.GUILD_TECH_OP).getHttpString(), _loc_2, this.opSuccess, null, "default", "default", "default", RequestType.DIALOG_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_guild_err_guildtechiderr"}

    /**
     * 升级帮派科技
     * @param user
     * @param tech
     * @param kind   个人激活 = 1  帮派开启 = 2
     * @return 
     */
	public static String guildTechOp(User user, int tech, int kind) {
		return user.send(
			"&act=operateguildtech&ctl=guild",
			"{\"techid\":%d,\"kind\":%d}", tech, kind
		);
	}


	//public static const GUILD_SPA_DONATE:Object = {ctl:"guild", act:"contribute"};
	//SpaProxy.as: line 233: 	App.net.send(new HttpGetParams(PHPConsts.GUILD_SPA_DONATE).getHttpString(), _loc_3, this.onDonateResult);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_guild_err_noguild"}

	/**
     * 捐款
     * @param user
     * @param type
     * type = 3 200令, type= 2 20令， type = 1 铜币
     * @return
     */
	public static String guildSpaDonate(User user, int type) {
		return user.send(
			"&act=contribute&ctl=guild",
			"{\"kind\":%d}", type
		);
	}


	//public static const GET_OFFLINE_AWARD:Object = {ctl:"game", act:"getofflineaward"};
	//HomeManager.as: line 181: 	App.net.send(new HttpGetParams(PHPConsts.GET_OFFLINE_AWARD).getHttpString(), null, this.onGetAward, this.onfailHander).dropPoint = new Point(450, 300);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_noofflineaward"}

	/**
	 * 离线礼包
	 * @param user
	 * @return
	 */
	public static String getOfflineAward(User user) {
		return user.send(
			"&act=getofflineaward&ctl=game",
			null
		);
	}


	//public static const MALL_SALE_LIST:Object = {ctl:"operator", act:"getflashsale"};
	//GetSaleListServices.as: line 21: 	App.net.send(new HttpGetParams(PHPConsts.MALL_SALE_LIST).getHttpString(), null, this.getSuccess, this.getFailure).jumpOutOfQueue();
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getflashsalepok","data":{"flashsalecfgList":{"1":{"_cls":"flashsaleCfg","cfgid":"1","name":"\u4e3b\u89d2\u65f6\u88c5\u793c\u5305","desc":"\u6bcf\u65e5\u9650\u8d2d\uff1a1\u6b21","icon":"assets\/icons\/seeditems\/351-3.png","starttime":1393776000,"endtime":1393948740,"price":16888,"real_price":12888,"vipprice":12888,"canbuy":0,"num":1,"awardcfgList":[{"_cls":"showItem","type":"item","cfgid":859,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":760,"num":3,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":761,"num":3,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":762,"num":3,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":763,"num":3,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":595,"num":1,"sub":"0"}]},"2":{"_cls":"flashsaleCfg","cfgid":"2","name":"\u65f6\u88c5\u7cbe\u534e\u793c\u5305","desc":"\u6bcf\u65e5\u9650\u8d2d\uff1a10\u6b21","icon":"assets\/icons\/seeditems\/351-3.png","starttime":1405094400,"endtime":1405267140,"price":2400,"real_price":1998,"vipprice":1998,"canbuy":0,"num":10,"awardcfgList":[{"_cls":"showItem","type":"item","cfgid":862,"num":500,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":595,"num":1,"sub":"0"}]},"3":{"_cls":"flashsaleCfg","cfgid":"3","name":"\u7a00\u6709\u679c\u5b9e\u793c\u5305","desc":"\u6bcf\u65e5\u9650\u8d2d\uff1a10\u6b21","icon":"assets\/icons\/seeditems\/351-3.png","starttime":1404662400,"endtime":1404748740,"price":1214,"real_price":888,"vipprice":888,"canbuy":0,"num":10,"awardcfgList":[{"_cls":"showItem","type":"item","cfgid":677,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":678,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":679,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":680,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":681,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":682,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":683,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":684,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":771,"num":2,"sub":"0"}]},"4":{"_cls":"flashsaleCfg","cfgid":"4","name":"\u7279\u4ef7\u679c\u5b9e\u793c\u5305","desc":"\u6bcf\u65e5\u9650\u8d2d\uff1a10\u6b21","icon":"assets\/icons\/seeditems\/351-3.png","starttime":1405353600,"endtime":1405526340,"price":588,"real_price":272,"vipprice":272,"canbuy":0,"num":10,"awardcfgList":[{"_cls":"showItem","type":"item","cfgid":653,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":654,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":655,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":656,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":657,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":658,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":659,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":660,"num":2,"sub":"0"}]},"5":{"_cls":"flashsaleCfg","cfgid":"5","name":"\u6625\u8282\u9650\u8d2d\u793c\u5305\u4e00","desc":"\u6bcf\u65e5\u9650\u8d2d\uff1a1\u6b21","icon":"assets\/icons\/seeditems\/351-3.png","starttime":1391011200,"endtime":1391183940,"price":1588,"real_price":288,"vipprice":288,"canbuy":0,"num":1,"awardcfgList":[{"_cls":"showItem","type":"item","cfgid":208,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":395,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":400,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":405,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":410,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":247,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":264,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":269,"num":1,"sub":"0"}]},"6":{"_cls":"flashsaleCfg","cfgid":"6","name":"\u6625\u8282\u9650\u8d2d\u793c\u5305\u4e8c","desc":"\u6bcf\u65e5\u9650\u8d2d\uff1a1\u6b21","icon":"assets\/icons\/seeditems\/351-3.png","starttime":1391184000,"endtime":1391356740,"price":888,"real_price":188,"vipprice":188,"canbuy":0,"num":1,"awardcfgList":[{"_cls":"showItem","type":"item","cfgid":243,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":244,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":245,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":246,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":247,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":242,"num":1,"sub":"0"}]},"7":{"_cls":"flashsaleCfg","cfgid":"7","name":"\u5353\u8d8a\u7a00\u6709\u679c\u5b9e\u793c\u5305","desc":"\u6bcf\u65e5\u9650\u8d2d\uff1a10\u6b21","icon":"assets\/icons\/seeditems\/351-3.png","starttime":1405267200,"endtime":1405353540,"price":2400,"real_price":1888,"vipprice":1888,"canbuy":0,"num":10,"awardcfgList":[{"_cls":"showItem","type":"item","cfgid":701,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":702,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":703,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":704,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":705,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":706,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":707,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":708,"num":2,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":771,"num":2,"sub":"0"}]},"8":{"_cls":"flashsaleCfg","cfgid":"8","name":"\u73ab\u7470\u793c\u5305(99\u6735)","desc":"\u6bcf\u65e5\u9650\u8d2d\uff1a\u4e0d\u9650","icon":"assets\/icons\/seeditems\/351-3.png","starttime":1392307200,"endtime":1392566340,"price":990,"real_price":990,"vipprice":990,"canbuy":0,"num":999999,"awardcfgList":[{"_cls":"showItem","type":"item","cfgid":885,"num":99,"sub":"0"}]},"9":{"_cls":"flashsaleCfg","cfgid":"9","name":"\u73ab\u7470\u793c\u5305(999\u6735)","desc":"\u6bcf\u65e5\u9650\u8d2d\uff1a\u4e0d\u9650","icon":"assets\/icons\/seeditems\/351-3.png","starttime":1392307200,"endtime":1392566340,"price":9990,"real_price":9990,"vipprice":9990,"canbuy":0,"num":999999,"awardcfgList":[{"_cls":"showItem","type":"item","cfgid":885,"num":999,"sub":"0"}]},"10":{"_cls":"flashsaleCfg","cfgid":"10","name":"\u60c5\u4eba\u8282\u5143\u5bb5\u8282\u9650\u8d2d\u793c\u5305","desc":"\u6bcf\u65e5\u9650\u8d2d\uff1a10\u6b21","icon":"assets\/icons\/seeditems\/351-3.png","starttime":1392220800,"endtime":1392393540,"price":3200,"real_price":2688,"vipprice":2688,"canbuy":0,"num":10,"awardcfgList":[{"_cls":"showItem","type":"item","cfgid":781,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":784,"num":1,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":840,"num":1,"sub":"0"}]}},"_cls":"getFlashSaleInfo"}}

	/**
	 * 特价礼包配置
	 * @param user
	 * @return
	 */
	public static String mallSaleList(User user) {
		return user.send(
			"&act=getflashsale&ctl=operator",
			null
		);
	}


	//public static const SKIN_UNLOCK:Object = {ctl:"skin", act:"unlockskin"};
	//ChangeSkinProxy.as: line 83: 	App.net.send(new HttpGetParams(PHPConsts.SKIN_UNLOCK).getHttpString(), {skinid:this._unlockSkin.id, rwarriorid:this._unlockSkin.warrior.id}, this.unlockSuccess, this.unlockFailure);
	//UnlockSkinServices.as: line 26: 	App.net.send(new HttpGetParams(PHPConsts.SKIN_UNLOCK).getHttpString(), {skinid:_loc_1.config.skincfgid, rwarriorid:_loc_2.id}, this.unlockSuccess, this.unlockFailure);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_skin_err_rwarriornotexist"}

	/**
	 * 解锁时装
	 * @param user
	 * @param warrior
	 * @param skinId
	 * @return
	 */
	public static String skinUnlock(User user, int warrior, int skinId) {
		return user.send(
			"&act=unlockskin&ctl=skin",
			"{\"skinid\":%d, \"rwarriorid\":%d}", skinId, warrior
		);
	}


	//public static const SKIN_DRESS:Object = {ctl:"skin", act:"setskin"};
	//ChangeSkinProxy.as: line 60: 	App.net.send(new HttpGetParams(PHPConsts.SKIN_DRESS).getHttpString(), {skinid:_loc_2.id, rwarriorid:_loc_2.warrior.id}, this.dressSuccess, this.dressFailure);
	//ChangePetSkinService.as: line 27: 	App.net.send(new HttpGetParams(PHPConsts.SKIN_DRESS).getHttpString(), {skinid:_loc_1.config.skincfgid, rwarriorid:_loc_2.id}, this.dressSuccess, this.dressFailure);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_skin_err_rwarriornotexist"}

	/**
	 * 设置时装
	 * @param user
	 * @param warrior
	 * @param skinId
	 * @return
	 */
	public static String skinDress(User user, int warrior, int skinId) {
		return user.send(
			"&act=setskin&ctl=skin",
			"{\"skinid\":%d, \"rwarriorid\":%d}", skinId, warrior
		);
	}


	//public static const GET_CHARGE_CONFIG:Object = {ctl:"sina", act:"getactivitycfg"};
	//ChargeAwardItem.as: line 124: 	App.net.send(new HttpGetParams(PHPConsts.GET_CHARGE_CONFIG).getHttpString(), _loc_1, this.onGetConfig);
	//RecruitItem.as: line 99: 	App.net.send(new HttpGetParams(PHPConsts.GET_CHARGE_CONFIG).getHttpString(), _loc_1, this.onGetConfig);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getactivitycfgok","data":{"activitycfg":{"_cls":"activitycfg1","timelast":1209600,"payactivity":{"1":{"_cls":"actinfo","cost":"100","awardcfgList":[{"_cls":"showItem","type":"money","cfgid":0,"num":100000,"sub":"0"}]},"2":{"_cls":"actinfo","cost":"500","awardcfgList":[{"_cls":"showItem","type":"money","cfgid":0,"num":260000,"sub":"0"},{"_cls":"showItem","type":"stamina","cfgid":0,"num":5,"sub":"0"}]},"3":{"_cls":"actinfo","cost":"1000","awardcfgList":[{"_cls":"showItem","type":"item","cfgid":110,"num":1,"sub":"0"},{"_cls":"showItem","type":"renown","cfgid":0,"num":500,"sub":"0"}]},"4":{"_cls":"actinfo","cost":"2000","awardcfgList":[{"_cls":"showItem","type":"techpoint","cfgid":0,"num":30000,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":779,"num":1,"sub":"0"},{"_cls":"showItem","type":"stamina","cfgid":0,"num":10,"sub":"0"}]},"5":{"_cls":"actinfo","cost":"5000","awardcfgList":[{"_cls":"showItem","type":"item","cfgid":111,"num":1,"sub":"0"},{"_cls":"showItem","type":"money","cfgid":0,"num":1000000,"sub":"0"}]},"6":{"_cls":"actinfo","cost":"10000","awardcfgList":[{"_cls":"showItem","type":"item","cfgid":208,"num":1,"sub":"0"},{"_cls":"showItem","type":"techpoint","cfgid":0,"num":100000,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":426,"num":7,"sub":"0"}]},"7":{"_cls":"actinfo","cost":"20000","awardcfgList":[{"_cls":"showItem","type":"money","cfgid":0,"num":2000000,"sub":"0"},{"_cls":"showItem","type":"stamina","cfgid":0,"num":40,"sub":"0"},{"_cls":"showItem","type":"item","cfgid":781,"num":1,"sub":"0"}]},"8":{"_cls":"actinfo","cost":"50000","awardcfgList":[{"_cls":"showItem","type":"item","cfgid":617,"num":1,"sub":"0"},{"_cls":"showItem","type":"renown","cfgid":0,"num":8000,"sub":"0"}]}}}}}

	/**
	 * 消费活动配置
	 * @param user
	 * @return
	 */
	public static String getChargeConfig(User user) {
		return user.send(
			"&act=getactivitycfg&ctl=sina",
			null
		);
	}


	//public static const GET_CHARGE_DATA:Object = {ctl:"sina", act:"openactivity"};
	//ChargeAwardItem.as: line 137: 	App.net.send(new HttpGetParams(PHPConsts.GET_CHARGE_DATA).getHttpString(), _loc_1, this.onGetData);
	//RecruitItem.as: line 107: 	App.net.send(new HttpGetParams(PHPConsts.GET_CHARGE_DATA).getHttpString(), _loc_1, this.onGetData);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_nosinaactivity"}

	/**
	 * TODO
	 * @param user
	 * @param type
	 * 1  3
	 * @return
	 */
	public static String getChargeData(User user, int type) {
		return user.send(
			"&act=openactivity&ctl=sina",
			"{\"type\":%d}", type
		);
	}


	//public static const GET_CHARGE_AWARD:Object = {ctl:"sina", act:"getactivityaward"};
	//ChargeAwardItem.as: line 111: 	App.net.send(new HttpGetParams(PHPConsts.GET_CHARGE_AWARD).getHttpString(), _loc_3, this.onGetAward, this.onFail).dropPoint = new Point(450, 300);
	//RecruitItem.as: line 86: 	App.net.send(new HttpGetParams(PHPConsts.GET_CHARGE_AWARD).getHttpString(), _loc_3, this.onGetAward, this.onFail).dropPoint = new Point(450, 300);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_activitytypeerr"}

	/**
	 * TODO
	 * @param user
	 * @param type
	 * 1 3
	 * @param actId
	 * @return
	 */
	public static String getChargeAward(User user, int type, int actId) {
		return user.send(
			"&act=getactivityaward&ctl=sina",
			"{\"type\":%d,\"actid\":%d}", type, actId
		);
	}


	//public static const GET_LEVEL_RANK:Object = {ctl:"sina", act:"getlevelrank"};
	//<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"><html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8" /><title> - </title><style>body {	font-size:76%;	font-family:"Lucida Grande", Verdana, Lucida, Arial, Helvetica, sans-serif;	background-color:#FEFEFE;	color:#333333;	margin:0;}a{color:#f60;}a:hover{text-decoration:none;}.dialogtitle {	margin-bottom:10px;	font-weight:bold;}.dialogContent {	padding:10px;}</style><link rel="stylesheet" href="style/dialog.css" /></head><body><div style="margin:100px auto;width:500px;"><table border="0" cellspacing="0" cellpadding="0" id="windowTable">	<tr>		<td colspan="2" class="td9TL"></td>		<td class="td9TC"></td>		<td colspan="2" class="td9TR"></td>	</tr>	<tr>		<td class="td9ML2"></td>		<td class="td9ML"></td>		<td class="td9MC" id="windowContent"><div>	<div class="dialogtitle"><div></div></div>    <div class="dialogContent">    	<div style="width:450px;">       	方法【getlevelrank】未定义，请联系网站管理员。<br />		<div align="center" style="margin-top:10px;">    <a href="javascript:history.back();"></a>		</div>    	</div>    </div></div>               </td>		<td class="td9MR"></td>		<td class="td9MR2"></td>	</tr>	<tr>		<td colspan="2" class="td9BL"></td>		<td class="td9BC"></td>		<td colspan="2" class="td9BR"></td>	</tr></table></div></body></html>

	/**
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String getLevelRank(User user) {
		return user.send(
			"&act=getlevelrank&ctl=sina",
			null
		);
	}


	//public static const GET_FREEGIFT_LOGS:Object = {ctl:"sina", act:"getsendasklog"};
	//FeedProxy.as: line 46: 	App.net.send(new HttpGetParams(PHPConsts.GET_FREEGIFT_LOGS).getHttpString(), null, this.onGetLogs, null, "default", "default", "default", RequestType.DIALOG_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_togetsendasklogok","data":{"sendlist":[],"asklist":[],"hassentlist":[],"hasreceivenum":0,"_cls":"togetsendasklog"}}

	/**
	 * 送礼信息
	 * @param user
	 * @return
	 */
	public static String getFreegiftLogs(User user) {
		return user.send(
			"&act=getsendasklog&ctl=sina",
			null
		);
	}


	//public static const OPERATE_FREEGIFT:Object = {ctl:"sina", act:"receivesendgift"};
	//OperateFreeGiftProxy.as: line 17: 	App.net.send(new HttpGetParams(PHPConsts.OPERATE_FREEGIFT).getHttpString(), param1, this.onResponse, null, "default", "default", "default", RequestType.DIALOG_INIT).dropPoint = new Point(460, 300);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_giftdateerr"}

	/**
	 * 领取礼物
	 * TODO
	 * @param user
	 * @param type
	 * @param date
	 * @param uid
	 * @param back
	 * @return
	 */
	public static String operateFreegift(User user, int type, String date, String uid, int back) {
		return user.send(
			"&act=receivesendgift&ctl=sina",
			"{\"type\":%d,\"date\":\"%s\",\"fuid\":\"%s\",\"isback\":%d}", type, date, uid, back
		);
	}


	//public static const ADD_FREEGIFT_LOG:Object = {ctl:"sina", act:"addsendasklog"};
	//BaseSNSAdapter.as: line 168: 	App.net.send(new HttpGetParams(PHPConsts.ADD_FREEGIFT_LOG).getHttpString(), _loc_5, this.onUpdateBuyItemList, null, "default", "default", "default", RequestType.NORMAL);
	//ExternalInterfaceManager.as: line 122: 	App.net.send(new HttpGetParams(PHPConsts.ADD_FREEGIFT_LOG).getHttpString(), _loc_5, onUpdateBuyItemList, null, "default", "default", "default", RequestType.NORMAL);
	//	0= []

	/**
	 * TODO
	 * @param user
	 * @return
	 */
	public static String addFreegiftLog(User user) {
		return user.send(
			"&act=addsendasklog&ctl=sina",
			"{\"type\":\"1\",\"uid\":\"%s\",\"ids\":\"%s\",\"itemid\":%d}"
		);
	}


	//public static const PET_GET_DATA:Object = {ctl:"rpet", act:"openpet"};
	//GetPetService.as: line 20: 	App.net.send(new HttpGetParams(PHPConsts.PET_GET_DATA).getHttpString(), null, this.getResult, this.getFailure, "default", "default", "default", RequestType.DIALOG_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_rpet_suc_getinfo","change":{"_cls":"changeObj","role":null,"rwarrior":null,"rwarriorskill":null,"rwarriorskillbuff":null,"rbagitem":null,"rbuild":null,"rquest":null,"rmap":null,"rwarriorinpub":null,"rwarriorgroup":null,"roperator":null},"data":{"_cls":"getPetInfo"}}

	/**
	 * 宠物初始化
	 * @param user
	 * @return
	 */
	public static String petGetData(User user) {
		return user.send(
			"&act=openpet&ctl=rpet",
			null
		);
	}


	//public static const PET_RNAME:Object = {ctl:"rpet", act:"resetname"};
	//ModifyNameDiaLog.as: line 93: 	App.net.send(new HttpGetParams(PHPConsts.PET_RNAME).getHttpString(), param1, this.successHandler, this.failureHandler);
	//RenameServices.as: line 21: 	App.net.send(new HttpGetParams(PHPConsts.PET_RNAME).getHttpString(), {name:param1, type:1}, this.successHandler, this.failureHandler);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_pet_err_rename_num"}

	/**
	 * 宠物改名
	 * @param user
	 * @param name
	 * @return
	 */
	public static String petRname(User user, String name) {
		return user.send(
			"&act=resetname&ctl=rpet",
			"{\"name\":\"%s\", \"type\":1}",name
		);
	}

	/**
	 * 侠客改名
	 * TODO type = 1
	 * @param user
	 * @param warrior
	 * @param name
	 * @return
	 */
	public static String warriorRename(User user,int warrior, String name) {
		return user.send(
			"&act=resetname&ctl=rpet",
			"{\"name\":\"%s\", \"type\":2,\"rwarriorId\":%d}",name, warrior
		);
	}
	
	//public static const PET_GET_TRAIN_DATA:Object = {ctl:"rpet", act:"opentrain"};
	//GetPetDataServices.as: line 18: 	App.net.send(new HttpGetParams(PHPConsts.PET_GET_TRAIN_DATA).getHttpString(), null, this.getResult, this.getFailure, "default", "default", "default", RequestType.DIALOG_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_rpet_suc_getinfo","data":{"buff":{"2":0,"1":12,"3":1},"train_num":"10","train_refresh_num":0,"train_buy_num":0,"tired_sec":0,"cards":[8,2,4,1,3],"full_sec":0,"_cls":"train"}}

	/**
	 * 训练配置
	 * @param user
	 * @return
	 */
	public static String petGetTrainData(User user) {
		return user.send(
			"&act=opentrain&ctl=rpet",
			null
		);
	}


	//public static const PET_TRAIN:Object = {ctl:"rpet", act:"starttrain"};
	//TrainServices.as: line 71: 	App.net.send(new HttpGetParams(PHPConsts.PET_TRAIN).getHttpString(), {cardkey:this._trainData.trainCards.indexOf(this._trainItem)}, this.successHandler, this.failureHandler);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_pet_suc_usecard","data":{"train":{"cards":[7,2,4,1,3],"buff":{"2":0,"1":11,"3":0},"train_num":9,"tired_sec":1800},"pkinfo":{"extracon":312,"extrastr":314,"extraagi":312,"extraforce":305,"extrablock":0,"extraaccuracy":0,"extraattackprior":330,"extraanti":0},"selfinfo":{"petattack":2953,"petskillattack":2922,"petattackprior":5237,"petaccuracy":38,"petstartmana":3857},"newcardid":0},"change":{"_cls":"changeObj","role":{"805493":{"money":"7755476"}},"rwarrior":{"3700551":{"level":"23","quality":4,"exp":"42","nextexp":386,"score":12090,"attack":0,"defence":0,"skillattack":0,"skilldefence":0,"con":0,"str":0,"force":0,"agi":0,"accuracy":0,"block":0,"attackprior":0,"alchemy_limit_agi":2300,"alchemy_limit_con":2300,"alchemy_limit_force":2300,"alchemy_limit_str":2300}},"rwarriorskill":null,"rwarriorskillbuff":null,"rbagitem":null,"rbuild":null,"rquest":null,"rmap":null,"rwarriorinpub":null,"rwarriorgroup":null,"roperator":null}}

	/**
     * 训练
     * @param user
     * @param card
     * @return 
     */
	public static String petTrain(User user, int card) {
		return user.send(
			"&act=starttrain&ctl=rpet",
			"{\"cardkey\":%d}", card
		);
	}


	//public static const PET_BUY_TRAIN:Object = {ctl:"rpet", act:"buytrainnum"};
	//BuyTrainTimesServices.as: line 64: 	App.net.send(new HttpGetParams(PHPConsts.PET_BUY_TRAIN).getHttpString(), null, this.successHandler, this.failureHandler);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_pet_suc_trainbuynum","data":{"train_num":10,"train_buy_num":1,"_cls":"buyTrainNum"},"change":{"_cls":"changeObj","role":{"805493":{"gamepoint":"15"}},"rwarrior":null,"rwarriorskill":null,"rwarriorskillbuff":null,"rbagitem":null,"rbuild":null,"rquest":null,"rmap":null,"rwarriorinpub":null,"rwarriorgroup":null,"roperator":null}}

	/**
	 * 购买训练数量
	 * @param user
	 * @return
	 */
	public static String petBuyTrain(User user) {
		return user.send(
			"&act=buytrainnum&ctl=rpet",
			null
		);
	}


	//public static const PET_REFRESH_TRAIN:Object = {ctl:"rpet", act:"refreshcard"};
	//RefreshTrainServices.as: line 70: 	App.net.send(new HttpGetParams(PHPConsts.PET_REFRESH_TRAIN).getHttpString(), null, this.successHandler, this.failureHandler);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_pet_suc_trainbuynum","data":{"cards":[1,6,9,9,1],"train_refresh_num":1,"_cls":"refreshTrain"},"change":{"_cls":"changeObj","role":null,"rwarrior":null,"rwarriorskill":null,"rwarriorskillbuff":null,"rbagitem":null,"rbuild":null,"rquest":null,"rmap":null,"rwarriorinpub":null,"rwarriorgroup":null,"roperator":null}}

	/**
	 * 刷新训练
	 * @param user
	 * @return
	 */
	public static String petRefreshTrain(User user) {
		return user.send(
			"&act=refreshcard&ctl=rpet",
			null
		);
	}


	//public static const PET_CLEAR_TRIED:Object = {ctl:"rpet", act:"cleartraincd"};
	//ClearTriedServices.as: line 50: 	App.net.send(new HttpGetParams(PHPConsts.PET_CLEAR_TRIED).getHttpString(), null, this.successHandler, this.failureHandler);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_pet_suc_clearTrainCd","data":{"tired_sec":0,"_cls":"clearTrainCd"},"change":{"_cls":"changeObj","role":{"805493":{"gamepoint":"0"}},"rwarrior":null,"rwarriorskill":null,"rwarriorskillbuff":null,"rbagitem":null,"rbuild":null,"rquest":null,"rmap":null,"rwarriorinpub":null,"rwarriorgroup":null,"roperator":null}}

	/**
	 * 清除疲劳度
	 * @param user
	 * @return
	 */
	public static String petClearTried(User user) {
		return user.send(
			"&act=cleartraincd&ctl=rpet",
			null
		);
	}


	//public static const PET_CLEAR_FFED:Object = {ctl:"rpet", act:"clearfeedcd"};
	//ClearFedServices.as: line 28: 	App.net.send(new HttpGetParams(PHPConsts.PET_CLEAR_FFED).getHttpString(), null, this.successHandler, this.failureHandler);
	//{"rep":"object","_cls":"msg","msgident":"00050","msg":"_pet_err_nofullcd"}

	/**
	 * 清除饱腹度
	 * @param user
	 * @return
	 */
	public static String petClearFfed(User user) {
		return user.send(
			"&act=clearfeedcd&ctl=rpet",
			null
		);
	}


	//public static const PET_FEED:Object = {ctl:"rpet", act:"usefood"};
	//FeedServices.as: line 26: 	App.net.send(new HttpGetParams(PHPConsts.PET_FEED).getHttpString(), {rseedid:param3.id}, this.successHandler, this.failureHandler, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.doubleCheck, [param3]);
	//{"rep":"object","_cls":"msg","msgident":"0003","msg":"_pet_err_rseednotexist"}

	/**
	 * 宠物喂食
	 * @param user
	 * @param item
	 * @return
	 */
	public static String petFeed(User user, int item) {
		return user.send(
			"&act=usefood&ctl=rpet",
			"{\"rseedid\":%d}", item
		);
	}


	//public static const PET_GET_SKILL:Object = {ctl:"rpet", act:"openskill"};
	//GetSkillServices.as: line 15: 	App.net.send(new HttpGetParams(PHPConsts.PET_GET_SKILL).getHttpString(), null, this.getSuccess, this.getFailure).jumpOutOfQueue();
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_ser_suc_toopenskillok","data":{"nowskillids":["2","3","4","5","6","7","9","10","11","12","13","14","15","16","17","18","20","21","23","24","25","26","28","29","31","32","33","34","35","36","37","38","39","40","42","43","44","45","46","47","49","50","51","52","53","54","55","56","57","58","60","61","63","64","65","66","68","69","71","72","73","74","76","77","79","80","81","82","84","85","87","88","89","90","91","92","93","94","95","96","97","98","99","100","101","102","103","104","105","106","109","110","111","112","115","116","117","118","119","120","121","122","123","124","125","126","129","130","131","132","135","136","137","138","139","140","141","142","143","144","145","146","147","148","149","150","151","152","153","154","155","158","159","160","161","162","167","168","169","170","173","175","176","177","179","180","181","182","184","185","186","187","188","189","190","191","192"],"nowpage":"4","_cls":"toopenskill"}}

	/**
	 * 宠物技能数据
	 * @param user
	 * @return
	 */
	public static String petGetSkill(User user) {
		return user.send(
			"&act=openskill&ctl=rpet",
			null
		);
	}


	//public static const PET_ACTIVE_SKILL:Object = {ctl:"rpet", act:"activateskill"};
	//ActiveSkillServices.as: line 27: 	App.net.send(new HttpGetParams(PHPConsts.PET_ACTIVE_SKILL).getHttpString(), {skillid:_loc_1.cfg.psid}, this.activeSuccess, this.activeFailure);
	//{"rep":"object","_cls":"msg","msgident":"0004","msg":"_pet_skillid_err"}

	/**
	 * 宠物设置技能
	 * @param user
	 * @param skill
	 * @return
	 */
	public static String petActiveSkill(User user, int skill) {
		return user.send(
			"&act=activateskill&ctl=rpet",
			"{\"skillid\":%d}",skill
		);
	}


	//public static const PET_GET_FIRE:Object = {ctl:"rpet", act:"openfire"};
	//GetPetDataServices.as: line 19: 	App.net.send(new HttpGetParams(PHPConsts.PET_GET_FIRE).getHttpString(), null, this.getFireSuccess, this.getFailure, "default", "default", "default", RequestType.DIALOG_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_ser_suc_toopenfireok","data":{"fireendtime":"0","firequality":"1","firescore":"0","lastaddnimbustime":"1390671941","lastgetnimbustime":"1390671941","beaddnimbus":"219000","todayaddtimes":0,"_cls":"toopenfire"}}

	/**
	 * 火炉数据
	 * @param user
	 * @return
	 */
	public static String petGetFire(User user) {
		return user.send(
			"&act=openfire&ctl=rpet",
			null
		);
	}


	//public static const PET_ADD_FIRE:Object = {ctl:"rpet", act:"addfire"};
	//AddFireServices.as: line 19: 	App.net.send(new HttpGetParams(PHPConsts.PET_ADD_FIRE).getHttpString(), {fid:param1.id}, this.addSuccess, this.addFailure).dropPoint = param4;
	//{"rep":"object","_cls":"msg","msgident":"0004","msg":"_pet_err_fiderr"}

	/**
	 * 给好友添火
	 * @param user
	 * @param fid
	 * @return
	 */
	public static String petAddFire(User user, int fid) {
		return user.send(
			"&act=addfire&ctl=rpet",
			"{\"fid\":%d}", fid
		);
	}


	//public static const PET_BEG_FIRE:Object = {ctl:"rpet", act:"begfire"};
	//BegFireServices.as: line 67: 	App.net.send(new HttpGetParams(PHPConsts.PET_BEG_FIRE).getHttpString(), {rbagitemid:this._item ? (this._item.id) : (0), type:this._type, num:1}, this.begSuccess, this.begFailure, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.doubleCheck);
	//{"rep":"object","_cls":"msg","msgident":"0004","msg":"_pet_err_begfiretypeerr"}

	/**
	 * 添火
	 * @param user
	 * @param item
	 * @return
	 */
	public static String petBegFire(User user,int item) {
		return user.send(
			"&act=begfire&ctl=rpet",
			"{\"type\":1,\"rbagitemid\":%d,\"num\":1}", item
		);
	}


	/**
	 * VIP添火
	 * @param user
	 * @return
	 */
    public static String petBegFire(User user) {
        return user.send(
                "act=begfire&ctl=rpet",
                "{\"type\":2}"
        );
    }
	//public static const PET_VISIT_FRIEND:Object = {ctl:"rpet", act:"visitpet"};
	//VisitPetServices.as: line 17: 	App.net.send(new HttpGetParams(PHPConsts.PET_VISIT_FRIEND).getHttpString(), {fid:param1.id}, this.visitSuccess, this.visitFailure, "default", "default", "default", RequestType.DIALOG_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0004","msg":"_pet_err_fiderr"}

    /**
     * 访问好友宠物
     * @param user
     * @param fid
     * @return
     */
	public static String petVisitFriend(User user,int fid) {
		return user.send(
			"&act=visitpet&ctl=rpet",
			"{\"fid\":%d}",fid
		);
	}


	//public static const PET_PICK_FIRE:Object = {ctl:"rpet", act:"getnimbus"};
	//PickFireServices.as: line 16: 	App.net.send(new HttpGetParams(PHPConsts.PET_PICK_FIRE).getHttpString(), null, this.pickSuccess, this.pickFailure).dropPoint = param3;
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_rpet_suc_togetnimbusok","change":{"_cls":"changeObj","role":{"805493":{"nimbus":"7595196"}},"rwarrior":null,"rwarriorskill":null,"rwarriorskillbuff":null,"rbagitem":null,"rbuild":null,"rquest":null,"rmap":null,"rwarriorinpub":null,"rwarriorgroup":null,"roperator":null},"data":{"firequality":"1","firescore":"0","lastgetnimbustime":1405787500,"lastaddnimbustime":1405787500,"beaddnimbus":0,"_cls":"toaddrire"}}

	/**
	 * 获取灵气
	 * @param user
	 * @return
	 */
	public static String petPickFire(User user) {
		return user.send(
			"&act=getnimbus&ctl=rpet",
			null
		);
	}


	//public static const CHANGE_GAMEPOINT:Object = {ctl:"changegamepoint", act:"changepoint"};
	//TokenExchangePanel.as: line 53: 	App.net.send(new HttpGetParams(PHPConsts.CHANGE_GAMEPOINT).getHttpString(), null, this.onResExchange, null, "default", "default", "default", RequestType.DIALOG_INIT).dropPoint = new Point(450, 300);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_noitemtochange"}

	/**
	 * 旧版道具换令牌
	 * @param user
	 * @return
	 */
	public static String changeGamepoint(User user) {
		return user.send(
			"&act=changepoint&ctl=changegamepoint",
			null
		);
	}


	//public static const STOVE_GETEXP:Object = {ctl:"stove", act:"gainexp"};
	//SignManager.as: line 61: 	App.net.send(new HttpGetParams(PHPConsts.STOVE_GETEXP).getHttpString(), null, this.stoveGetComplete).dropPoint = new Point(694, 491);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_stove_suc_gainexpok","change":{"_cls":"changeObj","role":{"805493":{"level":"63","exp":"5803516","nextexp":32131900,"stovelastgaintime":"1405787501","stoveday":0,"stovetotalexp":0}},"rwarrior":{"1657511":{"level":"63","quality":5,"maxhp":96404,"hp":96404,"exp":"5803516","nextexp":32131900,"score":130748,"attack":28890,"defence":18165,"skillattack":23844,"skilldefence":12619,"con":4587,"str":5008,"force":4103,"agi":5325,"accuracy":0,"block":10,"fateItem":{"1":"279493016","2":"279509483","3":"279510430","4":"279510321","5":"0","6":"0"},"attackprior":8048,"alchemy_limit_agi":6300,"alchemy_limit_con":6300,"alchemy_limit_force":6300,"alchemy_limit_str":6300}},"rwarriorskill":null,"rwarriorskillbuff":null,"rbagitem":null,"rbuild":null,"rquest":null,"rmap":null,"rwarriorinpub":null,"rwarriorgroup":null,"roperator":null}}

	/**
	 * 百炼炉领取经验
	 * @param user
	 * @return
	 */
	public static String stoveGetexp(User user) {
		return user.send(
			"&act=gainexp&ctl=stove",
			null
		);
	}


	//public static const STOVE_ACC:Object = {ctl:"stove", act:"speedup"};
	//SignManager.as: line 73: 	App.net.send(new HttpGetParams(PHPConsts.STOVE_ACC).getHttpString(), {type:event.activityEventData}, this.stoveAccComplete);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_stove_err_speedtypeerr"}

	/**
	 * 百炼炉加速
	 * @param user
	 * @param type
	 * type 1 = 铜币   2 = 令牌
	 * @return
	 */
	public static String stoveAcc(User user,int type) {
		return user.send(
			"&act=speedup&ctl=stove",
			"{\"type\":%d}",type
		);
	}


	//public static const STOVE_CLEAR:Object = {ctl:"stove", act:"reset"};
	//<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"><html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=utf-8" /><title> - </title><style>body {	font-size:76%;	font-family:"Lucida Grande", Verdana, Lucida, Arial, Helvetica, sans-serif;	background-color:#FEFEFE;	color:#333333;	margin:0;}a{color:#f60;}a:hover{text-decoration:none;}.dialogtitle {	margin-bottom:10px;	font-weight:bold;}.dialogContent {	padding:10px;}</style><link rel="stylesheet" href="style/dialog.css" /></head><body><div style="margin:100px auto;width:500px;"><table border="0" cellspacing="0" cellpadding="0" id="windowTable">	<tr>		<td colspan="2" class="td9TL"></td>		<td class="td9TC"></td>		<td colspan="2" class="td9TR"></td>	</tr>	<tr>		<td class="td9ML2"></td>		<td class="td9ML"></td>		<td class="td9MC" id="windowContent"><div>	<div class="dialogtitle"><div></div></div>    <div class="dialogContent">    	<div style="width:450px;">       	方法【reset】未定义，请联系网站管理员。<br />		<div align="center" style="margin-top:10px;">    <a href="javascript:history.back();"></a>		</div>    	</div>    </div></div>               </td>		<td class="td9MR"></td>		<td class="td9MR2"></td>	</tr>	<tr>		<td colspan="2" class="td9BL"></td>		<td class="td9BC"></td>		<td colspan="2" class="td9BR"></td>	</tr></table></div></body></html>

	/**
	 * @deprecated
	 * @param user
	 * @return
	 */
	public static String stoveClear(User user) {
		return user.send(
			"&act=reset&ctl=stove",
			null
		);
	}


	//public static const STOVE_INIT:Object = {ctl:"stove", act:"init"};
	//TitleBar.as: line 704: 	App.net.send(new HttpGetParams(PHPConsts.STOVE_INIT).getHttpString(), null).jumpOutOfQueue();
	//UrinalPanel.as: line 142: 	App.net.send(new HttpGetParams(PHPConsts.STOVE_INIT).getHttpString(), null, this.updata);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_stove_suc_stoveinitok","change":{"_cls":"changeObj","role":{"805493":{"stovelastgaintime":"1405787501","stovebuffexpiretime":"1393000057","stoveday":0,"stovetotalexp":0,"stoveuptimes":1,"stovebufftype":"1","stovemaxexp":3417228,"stovehourexp":47461,"stoveinittime":"1405787502"}},"rwarrior":null,"rwarriorskill":null,"rwarriorskillbuff":null,"rbagitem":null,"rbuild":null,"rquest":null,"rmap":null,"rwarriorinpub":null,"rwarriorgroup":null,"roperator":null}}

	/**
	 * 百炼炉初始化
	 * @param user
	 * @return
	 */
	public static String stoveInit(User user) {
		return user.send(
			"&act=init&ctl=stove",
			null
		);
	}


	//public static const CHARATER_EXCHANGE:Object = {ctl:"challengepoint", act:"exchangecharacter"};
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_gam_err_paramerr"}

	/**
	 * TODO 
	 * @param user
	 * @return
	 */
	public static String charaterExchange(User user) {
		return user.send(
			"&act=exchangecharacter&ctl=challengepoint",
			null
		);
	}


	//public static const JJC_EXCHANGE:Object = {ctl:"challengepoint", act:"exchangehonour"};
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_gam_err_paramerr"}

	/**
	 * TODO
	 * @param user
	 * @return
	 */
	public static String jjcExchange(User user) {
		return user.send(
			"&act=exchangehonour&ctl=challengepoint",
			null
		);
	}


	//public static const GET_TREASURECFG:Object = {ctl:"treasure", act:"getcfg"};
	//MainUIManager.as: line 564: 	App.net.send(new HttpGetParams(PHPConsts.GET_TREASURECFG).getHttpString(), null, this.tcfgComplete);
	//MallProxy.as: line 296: 	App.net.send(new HttpGetParams(PHPConsts.GET_TREASURECFG).getHttpString(), null, this.Getcomplete);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getrtreasurecfgok","data":{"treasurecfgInfo":{"_cls":"treasureCfg","stat":0,"starttime":1405094400,"endtime":1405353540,"refreshtimes":30,"arrRefreshReqcfg":[{"_cls":"showItem","type":"gamepoint","cfgid":0,"num":30,"sub":0}]},"_cls":"getTreasurecfgInfo"}}

	/**
	 * 收藏阁配置
	 * @param user
	 * @return
	 */
	public static String getTreasurecfg(User user) {
		return user.send(
			"&act=getcfg&ctl=treasure",
			null
		);
	}


	//public static const GET_TREASUREINFO:Object = {ctl:"treasure", act:"init"};
	//MallProxy.as: line 416: 	App.net.send(new HttpGetParams(PHPConsts.GET_TREASUREINFO).getHttpString(), null, this.getInitComplete);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_treasureinitok","data":{"itemGroupList":{"m":[{"_cls":"rtresureitemVo","itemid":32,"reqcfgList":[{"_cls":"showItem","type":"money","cfgid":0,"num":9000,"sub":1}],"awardcfgList":[{"_cls":"showItem","type":"item","cfgid":177,"num":1,"sub":"0"}],"oprice":"15000","price":"9000","flag":0},{"_cls":"rtresureitemVo","itemid":53,"reqcfgList":[{"_cls":"showItem","type":"money","cfgid":0,"num":3600000,"sub":1}],"awardcfgList":[{"_cls":"showItem","type":"item","cfgid":555,"num":1,"sub":"0"}],"oprice":"4000000","price":"3600000","flag":0},{"_cls":"rtresureitemVo","itemid":45,"reqcfgList":[{"_cls":"showItem","type":"money","cfgid":0,"num":3600000,"sub":1}],"awardcfgList":[{"_cls":"showItem","type":"item","cfgid":557,"num":1,"sub":"0"}],"oprice":"4000000","price":"3600000","flag":0},{"_cls":"rtresureitemVo","itemid":30,"reqcfgList":[{"_cls":"showItem","type":"money","cfgid":0,"num":6000,"sub":1}],"awardcfgList":[{"_cls":"showItem","type":"item","cfgid":173,"num":1,"sub":"0"}],"oprice":"15000","price":"6000","flag":0}],"g":[{"_cls":"rtresureitemVo","itemid":118,"reqcfgList":[{"_cls":"showItem","type":"gamepoint","cfgid":0,"num":9,"sub":0}],"awardcfgList":[{"_cls":"showItem","type":"item","cfgid":179,"num":1,"sub":"0"}],"oprice":"16","price":"9","flag":0},{"_cls":"rtresureitemVo","itemid":123,"reqcfgList":[{"_cls":"showItem","type":"gamepoint","cfgid":0,"num":400,"sub":0}],"awardcfgList":[{"_cls":"showItem","type":"item","cfgid":794,"num":1,"sub":"0"}],"oprice":"500","price":"400","flag":0},{"_cls":"rtresureitemVo","itemid":104,"reqcfgList":[{"_cls":"showItem","type":"gamepoint","cfgid":0,"num":18,"sub":0}],"awardcfgList":[{"_cls":"showItem","type":"item","cfgid":602,"num":1,"sub":"0"}],"oprice":"30","price":"18","flag":0},{"_cls":"rtresureitemVo","itemid":97,"reqcfgList":[{"_cls":"showItem","type":"gamepoint","cfgid":0,"num":24,"sub":0}],"awardcfgList":[{"_cls":"showItem","type":"item","cfgid":236,"num":1,"sub":"0"}],"oprice":"30","price":"24","flag":0}]},"rtreasureInfo":{"_cls":"rtreasureVo","treasurerefreshtimes":0,"treasureexpiretime":"1395124380"},"_cls":"treasureInit"}}

	/**
	 * 收藏阁初始化
	 * @param user
	 * @return
	 */
	public static String getTreasureinfo(User user) {
		return user.send(
			"&act=init&ctl=treasure",
			null
		);
	}


	//public static const REFRESH_TREASUREINFO:Object = {ctl:"treasure", act:"refresh"};
	//MallProxy.as: line 384: 	App.net.send(new HttpGetParams(PHPConsts.REFRESH_TREASUREINFO).getHttpString(), null, this.refreshTreasure);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_treasureisclose"}

	/**
	 * 刷新收藏阁
	 * @param user
	 * @return
	 */
	public static String refreshTreasureinfo(User user) {
		return user.send(
			"&act=refresh&ctl=treasure",
			null
		);
	}


	//public static const BUY_TREASURE:Object = {ctl:"treasure", act:"buy"};
	//MallProxy.as: line 377: 	App.net.send(new HttpGetParams(PHPConsts.BUY_TREASURE).getHttpString(), event.mallEventData, this.buyComplete);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_treasureparamerr"}

	/**
	 * TODO
	 * @param user
	 * @return
	 */
	public static String buyTreasure(User user) {
		return user.send(
			"&act=buy&ctl=treasure",
			null
		);
	}


	//public static const BUY_FINANCE:Object = {ctl:"finance", act:"buyfinance"};
	//FinanceRender.as: line 182: 	App.net.send(new HttpGetParams(PHPConsts.BUY_FINANCE).getHttpString(), {financeid:this._vo.productcfgid}, this.buyComplete);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_finance_err_paramerr"}

	/**
	 * 购买理财
	 * 
	 * @param user
	 * @param financeid
	 * 200003 -3   200002 -2  200001-1
	 * @return
	 */
	public static String buyFinance(User user, int financeid) {
		return user.send(
			"&act=buyfinance&ctl=finance",
			"{\"financeid\":%d}", financeid
		);
	}


	//public static const GET_FINANCE_REWARD:Object = {ctl:"finance", act:"gainfinance"};
	//FinanceRender.as: line 218: 	App.net.send(new HttpGetParams(PHPConsts.GET_FINANCE_REWARD).getHttpString(), null, this.getComplete).dropPoint = new Point(540, 530);
	//{"rep":"object","_cls":"msg","msgident":"0004","msg":"_finance_err_financehasgain"}

	/**
	 * 领取理财
	 * @param user
	 * @return
	 */
	public static String getFinanceReward(User user) {
		return user.send(
			"&act=gainfinance&ctl=finance",
			null
		);
	}


	//public static const GET_LEVELFUND_REWARD:Object = {ctl:"finance", act:"gainfund"};
	//GrowFinanceRender.as: line 151: 	App.net.send(new HttpGetParams(PHPConsts.GET_LEVELFUND_REWARD).getHttpString(), null, this.getComplete).dropPoint = new Point(540, 530);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_finance_err_fundnotexist"}

	/**
	 * 领取 等级基金
	 * @param user
	 * @return
	 */
	public static String getLevelfundReward(User user) {
		return user.send(
			"&act=gainfund&ctl=finance",
			null
		);
	}


	//public static const BUY_LEVELFUND:Object = {ctl:"finance", act:"buyfund"};
	//GrowFinanceRender.as: line 187: 	App.net.send(new HttpGetParams(PHPConsts.BUY_LEVELFUND).getHttpString(), {fundid:this.vo.productcfgid}, this.buyComplete);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_finance_err_paramerr"}

	/**
	 * 购买等级基金
	 * @param user
	 * @param fundid
	 * //210003 -3    210002 - 2  210001 - 1
	 * @return
	 */
	public static String buyLevelfund(User user, int fundid) {
		return user.send(
			"&act=buyfund&ctl=finance",
			"{\"fundid\":%d}", fundid
		);
	}


	//public static const GUILDFIGHT_GETFIGHTLIST:Object = {ctl:"guildfight", act:"getfightlist"};
	//DuelProxy.as: line 47: 	App.net.send(new HttpGetParams(PHPConsts.GUILDFIGHT_GETFIGHTLIST).getHttpString(), null, this.getSuccess, this.getFailure, "default", "default", "default", RequestType.DIALOG_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_guild_suc_togetfightlistok","data":{"period":36,"fightlist":{"102495":{"order":"0","guildid":102495,"score":"0","name":"\u5144\u5f1f\u8fde"},"100176":{"order":"1","guildid":100176,"score":"0","name":"\u8840\u6cb3\u6bbf"},"100113":{"order":"2","guildid":100113,"score":"0","name":"\u9ed1\u5b50\u7684\u7c43\u7403 "},"118521":{"order":"3","guildid":118521,"score":"0","name":"\u6b66\u5f53\u6d3e"},"100944":{"order":"4","guildid":100944,"score":"0","name":"\u5c0f\u53f7\u5929\u4e0b"},"100083":{"order":"5","guildid":100083,"score":"0","name":"\u6d4b\u8bd5\u5e2e\u4f1a\uff0c\u52ff\u52a0"},"100675":{"order":"6","guildid":100675,"score":"0","name":"\u7ec8\u6781\u4e00\u73ed"},"100037":{"order":"7","guildid":100037,"score":"0","name":"\u738b\u8005\u2016\u65e0\u654c"},"100013":{"order":"8","guildid":100013,"score":"0","name":"\u661f\u676f\u9a91\u58eb\u56e2"},"100116":{"order":"9","guildid":100116,"score":"0","name":"\u7ea2\u9b54\u9986"},"104011":{"order":"10","guildid":104011,"score":"0","name":"\u5317\u6597\u4e03\u661f"},"110587":{"order":"11","guildid":110587,"score":"0","name":"\u7af9\u5fc3\u5c0f\u82d1"},"100024":{"order":"12","guildid":100024,"score":"0","name":"\u534e\u519b\u2605\u56de\u5fc6"},"100546":{"order":"13","guildid":100546,"score":"0","name":"\u542c\u96ea\u697c"},"100045":{"order":"14","guildid":100045,"score":"0","name":"\u90aa\u738b\u771f\u773c"},"100019":{"order":"15","guildid":100019,"score":"0","name":"\u738b\u8005\u2016\u91cd\u751f"}},"_cls":"togetfightlist"}}

	/**
	 * 帮战列表
	 * @param user
	 * @return
	 */
	public static String guildfightGetfightlist(User user) {
		return user.send(
			"&act=getfightlist&ctl=guildfight",
			null
		);
	}


	//public static const GUILDFIGHT_SENDAWARD:Object = {ctl:"guildfight", act:"sendaward"};
	//GuildWarProxy.as: line 121: 	App.net.send(new HttpGetParams(PHPConsts.GUILDFIGHT_SENDAWARD).getHttpString(), param1, this.onSendAwardData, this.onFailt, "default", "default", "default", RequestType.DIALOG_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_guild_err_sendawardinfoerr"}

	/**
	 * TODO
	 * @param user
	 * @return
	 */
	public static String guildfightSendaward(User user) {
		return user.send(
			"&act=sendaward&ctl=guildfight",
			null
		);
	}


	//public static const GUILDFIGHT_STARTBET:Object = {ctl:"guildfight", act:"startbet"};
	//DuelProxy.as: line 176: 	App.net.send(new HttpGetParams(PHPConsts.GUILDFIGHT_STARTBET).getHttpString(), _loc_3, this.onStartbetData, this.onStartbetDataFailt, "default", "default", "default", RequestType.DIALOG_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_guild_err_gfbettypeerr"}

	/**
	 * 押注
	 * @param user
	 * @param gid
	 * @param type
	 * type 1 = 铜币, 2 = 令牌
	 * @return
	 */
	public static String guildfightStartbet(User user, int gid, int type) {
		return user.send(
			"&act=startbet&ctl=guildfight",
			"{\"type\":%d,\"gid\":%d}", type, gid
		);
	}


	//public static const GUILDFIGHT_GETBETORDER:Object = {ctl:"guildfight", act:"getbetorder"};
	//DuelProxy.as: line 193: 	App.net.send(new HttpGetParams(PHPConsts.GUILDFIGHT_GETBETORDER).getHttpString(), [], this.onBetRankData, this.onBetRankDataFailt, "default", "default", "default", RequestType.DIALOG_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_guild_suc_togetbetorderok","data":[{"guildid":100013,"name":"\u661f\u676f\u9a91\u58eb\u56e2","gamepoint":28250,"money":5000000}]}

	/**
	 * 押注排行
	 * @param user
	 * @return
	 */
	public static String guildfightGetbetorder(User user) {
		return user.send(
			"&act=getbetorder&ctl=guildfight",
			"[]"
		);
	}


	//public static const GUILDFIGHT_GETMYBET:Object = {ctl:"guildfight", act:"getmybet"};
	//DuelProxy.as: line 233: 	App.net.send(new HttpGetParams(PHPConsts.GUILDFIGHT_GETMYBET).getHttpString(), [], this.onBetMyInfoData, this.onBetMyInfoDataFailt, "default", "default", "default", RequestType.DIALOG_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_guild_suc_togetmybetok","data":{"betlist":{"26":{"guildid":100013,"type":1,"level":"62","res":0,"gname":"\u661f\u676f\u9a91\u58eb\u56e2"},"13":{"guildid":100546,"type":2,"level":"61","res":1,"gname":"\u542c\u96ea\u697c"}},"bettotal":{"gamepoint":0,"money":0},"_cls":"mybetinfo"}}

	/**
	 * 押注历史
	 * @param user
	 * @return
	 */
	public static String guildfightGetmybet(User user) {
		return user.send(
			"&act=getmybet&ctl=guildfight",
			"[]"
		);
	}


	//public static const GUILDFIGHT_GETCURRENTSORT:Object = {ctl:"guildfight", act:"getcurrentsort"};
	//GuildWarProxy.as: line 152: 	App.net.send(new HttpGetParams(PHPConsts.GUILDFIGHT_GETCURRENTSORT).getHttpString(), null, this.onGetCurrentSortData, null, "default", "default", "default", RequestType.DIALOG_INIT);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_guild_err_noguild"}

	/**
	 * TODO
	 * @param user
	 * @return
	 */
	public static String guildfightGetcurrentsort(User user) {
		return user.send(
			"&act=getcurrentsort&ctl=guildfight",
			null
		);
	}


	//public static const GUILDFIGHT_GETBETREWARDS:Object = {ctl:"guildfight", act:"getBetRewards"};
	//BetMyInfoPanle.as: line 53: 	App.net.send(new HttpGetParams(PHPConsts.GUILDFIGHT_GETBETREWARDS).getHttpString(), null, this.dataHandler, this.failHandler).dropPoint = new Point(400, 300);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_guild_err_gfnotfinished"}

	/**
	 * 领取押注奖励
	 * @param user
	 * @return
	 */
	public static String guildfightGetbetrewards(User user) {
		return user.send(
			"&act=getBetRewards&ctl=guildfight",
			null
		);
	}


	//public static const OPERATOR_CLIENTGETSTATUS:Object = {ctl:"operator", act:"clientGetStatus"};
	//ClientAwardProxy.as: line 14: 	App.net.send(new HttpGetParams(PHPConsts.OPERATOR_CLIENTGETSTATUS).getHttpString(), _loc_2, this.dataHandler, this.failHandler);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getclientgetstatusok","data":{"status":3}}

	/**
	 * 微端初始化
	 * @param user
	 * @return
	 */
	public static String operatorClientgetstatus(User user) {
		return user.send(
			"&act=clientGetStatus&ctl=operator",
			null
		);
	}


	//public static const OPERATOR_CLIENTGETAWARD:Object = {ctl:"operator", act:"clientGetAward"};
	//ClientAwardPanel.as: line 79: 	App.net.send(new HttpGetParams(PHPConsts.OPERATOR_CLIENTGETAWARD).getHttpString(), null, this.dataHandler, this.failHandler).dropPoint = new Point(400, 300);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_gam_err_clientareadyget"}

	/**
	 * 微端领奖
	 * @param user
	 * @return
	 */
	public static String operatorClientgetaward(User user) {
		return user.send(
			"&act=clientGetAward&ctl=operator",
			null
		);
	}


	//public static const PLUSRANK_GETDAYRANK:Object = {ctl:"plusrank", act:"getDayRank"};
	//RankingProxy.as: line 13: 	App.net.send(new HttpGetParams(PHPConsts.PLUSRANK_GETDAYRANK).getHttpString(), {type:param1}, this.dataHandler, this.failHandler);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_getdayranklistok","data":{"type":"money","rankList":null,"rankRefreshTime":null,"_cls":"getDayrankList"}}

	/**
	 * 排名?TODO
	 * @param user
	 * @return
	 */
	public static String plusrankGetdayrank(User user) {
		return user.send(
			"&act=getDayRank&ctl=plusrank",
			null
		);
	}


	//public static const CHANGESKIN_INIT:Object = {ctl:"changeskin", act:"init"};
	//ChangeSkinProxy.as: line 121: 	App.net.send(new HttpGetParams(PHPConsts.CHANGESKIN_INIT).getHttpString(), _loc_2, this.changeSkinInitSuccess, this.dressFailure);
	//ChangeSkinProxy.as: line 136: 	App.net.send(new HttpGetParams(PHPConsts.CHANGESKIN_INIT).getHttpString(), _loc_2, this.changeSkinInitSuccess2, this.dressFailure);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_changeskininitok","data":{"rwarriorId":0,"info":{"con":0,"str":0,"agi":0,"force":0,"exp":0,"_cls":"changeskin"}}}

	/**
	 * 时装培养初始化
	 * @param user
	 * @param id
	 * @return
	 */
	public static String changeskinInit(User user,int id) {
		return user.send(
			"&act=init&ctl=changeskin",
			"{\"rwarriorId\":%d}", id
		);
	}


	//public static const CHANGESKIN_CULTIVATE:Object = {ctl:"changeskin", act:"cultivate"};
	//ChangeSkinProxy.as: line 161: 	App.net.send(new HttpGetParams(PHPConsts.CHANGESKIN_CULTIVATE).getHttpString(), _loc_5, this.changeSkinCultSuccess, this.dressFailure, "default", "default", "default", 0, "default", "default", "default", "default", "default", this.wcheck, [param1]);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_changeskin_err_cwarriornotexist"}

	/**
	 * 时装培养
	 * @param user
	 * @param id
     * @param type   0 bug    1   初级碎片    2 时装碎片    3 时装精华
     * @param mode   1  1次  2 一星
	 * @return
	 */
	public static String changeskinCultivate(User user, int id, int type, int mode) {
		return user.send(
			"&act=cultivate&ctl=changeskin",
			"{\"type\":%d,\"mode\":%d,\"rwarriorId\":%d}", type,mode,id
		);
	}


	//public static const CHANGESKIN_INHERIT:Object = {ctl:"changeskin", act:"inherit"};
	//SmritiConMediator.as: line 135: 	App.net.send(new HttpGetParams(PHPConsts.CHANGESKIN_INHERIT).getHttpString(), _loc_2, this.successHandler);
	//{"rep":"object","_cls":"msg","msgident":"0002","msg":"_changeskin_err_fromwarriornotexist"}

	/**
	 * 时装传承
	 * @param user
	 * @param from
	 * @param to
	 * @return
	 */
	public static String changeskinInherit(User user,int from, int to) {
		return user.send(
			"&act=inherit&ctl=changeskin",
			"{\"fromwid\":%d,\"passwid\":%d}", from, to
		);
	}


	//public static const ACHIEVE_INIT:Object = {ctl:"achieve", act:"init"};
	//TitleProxy.as: line 44: 	App.net.send(new HttpGetParams(PHPConsts.ACHIEVE_INIT).getHttpString(), null, this.dataHandler, this.failHandler);
	//{"rep":"object","_cls":"msg","msgident":"0000","msg":"_gam_suc_achieveininitok","data":{"achieves":{"5":{"expire":0,"reqcnum":3,"times":3,"state":2},"10":{"expire":0,"reqcnum":1,"times":1,"state":2}}}}

	/**
	 * 成就初始化
	 * @param user
	 * @return
	 */
	public static String achieveInit(User user) {
		return user.send(
			"&act=init&ctl=achieve",
			null
		);
	}


	//public static const ACHIEVE_TEST:Object = {ctl:"achieve", act:"test"};
	//InfoMD.as: line 92: 	App.net.send(new HttpGetParams(PHPConsts.ACHIEVE_TEST).getHttpString(), {achieveId:this._cfg.achievecfgid}, null, null);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_noneofachievecfg"}

	/**
	 * 成就测试
	 * @param user
	 * @param id
	 * @return
	 */
	public static String achieveTest(User user, int id) {
		return user.send(
			"&act=test&ctl=achieve",
			"{\"achieveId\":%d}",id
		);
	}


	//public static const ACHIEVE_CHANGETITLE:Object = {ctl:"achieve", act:"changeTitle"};
	//InfoMD.as: line 77: 	App.net.send(new HttpGetParams(PHPConsts.ACHIEVE_CHANGETITLE).getHttpString(), {achieveId:this._cfg.achievecfgid}, this.dataHandler);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_noneofachieve"}

	/**
	 * 装备成就
	 * @param user
	 * @return
	 */
	public static String achieveChangetitle(User user, int id) {
		return user.send(
			"&act=changeTitle&ctl=achieve",
			"{\"achieveId\":%d}",id
		);
	}


	//public static const ACHIEVE_GETAWARD:Object = {ctl:"achieve", act:"getAward"};
	//InfoMD.as: line 65: 	App.net.send(new HttpGetParams(PHPConsts.ACHIEVE_GETAWARD).getHttpString(), {achieveId:this._cfg.achievecfgid}, this.awardHandler).dropPoint = new Point(400, 350);
	//{"rep":"object","_cls":"msg","msgident":"0001","msg":"_gam_err_noneofachieve"}

	/**
	 * 领取成就奖励
	 * @param user
	 * @param id
	 * @return
	 */
	public static String achieveGetaward(User user,int id) {
		return user.send(
			"&act=getAward&ctl=achieve",
			"{\"achieveId\":%d}",id
		);
	}
}
