/**
 * Order类
 * LiangWeiMing
 * 2020/3/4-19:00
 */
public class Order {
    /*商品信息*/
    private String goodInformation;
    /*商品编码*/
    private String goodsCode;
    /*商品总价*/
    private double totalMoney;
    /*买家备注*/
    private String remark;
    /*订单编号*/
    private String orderCode;
    /*买家账户ID*/
    private String buyerAccount;
    /*卖家账户ID*/
    private String sellerAccount;
    /*订单创建时间*/
    private String creatTime;
    /*订单付款时间*/
    private String paymentTime;
    /*发货时间*/
    private String deliveryTime;
    /*签收时间*/
    private String signTime;
    /*收货地址*/
    private String receivingAddress;
    /*联系电话*/
    private String telephoneNum;
    /*签收人*/
    private String Consignee;

    public String getGoodInformation() {
        return goodInformation;
    }

    public void setGoodInformation(String goodInformation) {
        this.goodInformation = goodInformation;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getBuyerAccount() {
        return buyerAccount;
    }

    public void setBuyerAccount(String buyerAccount) {
        this.buyerAccount = buyerAccount;
    }

    public String getSellerAccount() {
        return sellerAccount;
    }

    public void setSellerAccount(String sellerAccount) {
        this.sellerAccount = sellerAccount;
    }

    public String getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime;
    }

    public String getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getSignTime() {
        return signTime;
    }

    public void setSignTime(String signTime) {
        this.signTime = signTime;
    }

    public String getReceivingAddress() {
        return receivingAddress;
    }

    public void setReceivingAddress(String receivingAddress) {
        this.receivingAddress = receivingAddress;
    }

    public String getTelephoneNum() {
        return telephoneNum;
    }

    public void setTelephoneNum(String telephoneNum) {
        this.telephoneNum = telephoneNum;
    }

    public String getConsignee() {
        return Consignee;
    }

    public void setConsignee(String consignee) {
        Consignee = consignee;
    }
}
