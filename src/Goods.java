/**
 * Goods类
 * LiangWeiMing
 * 2020/3/4-20:00
 */
public class Goods {
    /*商品信息*/
    private String goodInformation;
    /*商品规格*/
    private String productSpecification;
    /*商品单价*/
    private double money;
    /*商品总价*/
    private double totalMoney;
    /*商品编码*/
    private String goodsCode;
    /*卖家ID*/
    private String sellerID;
    /*评价-用户ID*/
    private String evaluatUserID;
    /*评价-内容*/
    private String evaluation;

    public String getGoodInformation() {
        return goodInformation;
    }

    public void setGoodInformation(String goodInformation) {
        this.goodInformation = goodInformation;
    }

    public String getProductSpecification() {
        return productSpecification;
    }

    public void setProductSpecification(String productSpecification) {
        this.productSpecification = productSpecification;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getSellerID() {
        return sellerID;
    }

    public void setSellerID(String sellerID) {
        this.sellerID = sellerID;
    }

    public String getEvaluatUserID() {
        return evaluatUserID;
    }

    public void setEvaluatUserID(String evaluatUserID) {
        this.evaluatUserID = evaluatUserID;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }
}
