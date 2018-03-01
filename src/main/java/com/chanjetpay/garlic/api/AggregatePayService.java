package com.chanjetpay.garlic.api;

public interface AggregatePayService {

	//预下单
	void preOrder();

	//支付查询
	void queryPay();

	//退款
	void refund();

	//退款查询
	void queryRefund();

	//下载对账文件
	void downloadBilling();

	//微信扫码支付
	void wxQRPay();

	//微信刷卡支付
	void wxScanPay();

	//微信公众号支付
	void wxOfficialPay();

	//微信app支付
	void wxAppPay();

	//微信h5支付
	void wxH5Pay();

	//支付宝h5支付
	void aliH5Pay();

	//支付宝sdk支付
	void aliSDKPay();

	//支付宝扫码支付
	void aliQRPay();

	//支付宝刷卡支付
	void aliScanPay();
}
