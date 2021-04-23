package com.ssreagents.pojo;

import java.sql.Timestamp;
import java.util.Objects;

public class Kit {
    private long id;
    private String uid;
    private String kind;
    private String brand;
    private String productName;
    private String goodsNum;
    private String batchNum;
    private String specifications;
    private String price;
    private String species;
    private String goodsTime;
    private String periodValidity;
    private String relatedProducts;
    private String sampleType;
    private String storage;
    private String sensitivity;
    private String rangedata;
    private String recoveryRate;
    private String accuracy;
    private String literatureUsed;


    private String application;
    private String testingTime;
    private String testingWay;
    private String testingType;
    private String isAchieveGoal;
    private String costPerformance;
    private String overallEvaluation;
    private String comments;
    private String drawingsShow;
    private String url;
    private String img1;
    private String img2;
    private String img3;
    private String img4;
    private String img5;
    private java.sql.Timestamp createdate;
    private String recorderemail;


    @Override
    public String toString() {
        return "Kit{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", kind='" + kind + '\'' +
                ", brand='" + brand + '\'' +
                ", productName='" + productName + '\'' +
                ", goodsNum='" + goodsNum + '\'' +
                ", batchNum='" + batchNum + '\'' +
                ", specifications='" + specifications + '\'' +
                ", price='" + price + '\'' +
                ", species='" + species + '\'' +
                ", goodsTime='" + goodsTime + '\'' +
                ", periodValidity='" + periodValidity + '\'' +
                ", relatedProducts='" + relatedProducts + '\'' +
                ", sampleType='" + sampleType + '\'' +
                ", storage='" + storage + '\'' +
                ", sensitivity='" + sensitivity + '\'' +
                ", rangedata='" + rangedata + '\'' +
                ", recoveryRate='" + recoveryRate + '\'' +
                ", accuracy='" + accuracy + '\'' +
                ", literatureUsed='" + literatureUsed + '\'' +
                ", application='" + application + '\'' +
                ", testingTime='" + testingTime + '\'' +
                ", testingWay='" + testingWay + '\'' +
                ", testingType='" + testingType + '\'' +
                ", isAchieveGoal='" + isAchieveGoal + '\'' +
                ", costPerformance='" + costPerformance + '\'' +
                ", overallEvaluation='" + overallEvaluation + '\'' +
                ", comments='" + comments + '\'' +
                ", drawingsShow='" + drawingsShow + '\'' +
                ", url='" + url + '\'' +
                ", img1='" + img1 + '\'' +
                ", img2='" + img2 + '\'' +
                ", img3='" + img3 + '\'' +
                ", img4='" + img4 + '\'' +
                ", img5='" + img5 + '\'' +
                ", createdate=" + createdate +
                ", recorderemail='" + recorderemail + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Kit kit = (Kit) o;
        return id == kit.id &&
                Objects.equals(uid, kit.uid) &&
                Objects.equals(kind, kit.kind) &&
                Objects.equals(brand, kit.brand) &&
                Objects.equals(productName, kit.productName) &&
                Objects.equals(goodsNum, kit.goodsNum) &&
                Objects.equals(batchNum, kit.batchNum) &&
                Objects.equals(specifications, kit.specifications) &&
                Objects.equals(price, kit.price) &&
                Objects.equals(species, kit.species) &&
                Objects.equals(goodsTime, kit.goodsTime) &&
                Objects.equals(periodValidity, kit.periodValidity) &&
                Objects.equals(relatedProducts, kit.relatedProducts) &&
                Objects.equals(sampleType, kit.sampleType) &&
                Objects.equals(storage, kit.storage) &&
                Objects.equals(sensitivity, kit.sensitivity) &&
                Objects.equals(rangedata, kit.rangedata) &&
                Objects.equals(recoveryRate, kit.recoveryRate) &&
                Objects.equals(accuracy, kit.accuracy) &&
                Objects.equals(literatureUsed, kit.literatureUsed) &&
                Objects.equals(application, kit.application) &&
                Objects.equals(testingTime, kit.testingTime) &&
                Objects.equals(testingWay, kit.testingWay) &&
                Objects.equals(testingType, kit.testingType) &&
                Objects.equals(isAchieveGoal, kit.isAchieveGoal) &&
                Objects.equals(costPerformance, kit.costPerformance) &&
                Objects.equals(overallEvaluation, kit.overallEvaluation) &&
                Objects.equals(comments, kit.comments) &&
                Objects.equals(drawingsShow, kit.drawingsShow) &&
                Objects.equals(url, kit.url) &&
                Objects.equals(img1, kit.img1) &&
                Objects.equals(img2, kit.img2) &&
                Objects.equals(img3, kit.img3) &&
                Objects.equals(img4, kit.img4) &&
                Objects.equals(img5, kit.img5) &&
                Objects.equals(createdate, kit.createdate) &&
                Objects.equals(recorderemail, kit.recorderemail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, uid, kind, brand, productName, goodsNum, batchNum, specifications, price, species, goodsTime, periodValidity, relatedProducts, sampleType, storage, sensitivity, rangedata, recoveryRate, accuracy, literatureUsed, application, testingTime, testingWay, testingType, isAchieveGoal, costPerformance, overallEvaluation, comments, drawingsShow, url, img1, img2, img3, img4, img5, createdate, recorderemail);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(String goodsNum) {
        this.goodsNum = goodsNum;
    }

    public String getBatchNum() {
        return batchNum;
    }

    public void setBatchNum(String batchNum) {
        this.batchNum = batchNum;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getGoodsTime() {
        return goodsTime;
    }

    public void setGoodsTime(String goodsTime) {
        this.goodsTime = goodsTime;
    }

    public String getPeriodValidity() {
        return periodValidity;
    }

    public void setPeriodValidity(String periodValidity) {
        this.periodValidity = periodValidity;
    }

    public String getRelatedProducts() {
        return relatedProducts;
    }

    public void setRelatedProducts(String relatedProducts) {
        this.relatedProducts = relatedProducts;
    }

    public String getSampleType() {
        return sampleType;
    }

    public void setSampleType(String sampleType) {
        this.sampleType = sampleType;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getSensitivity() {
        return sensitivity;
    }

    public void setSensitivity(String sensitivity) {
        this.sensitivity = sensitivity;
    }

    public String getRangedata() {
        return rangedata;
    }

    public void setRangedata(String rangedata) {
        this.rangedata = rangedata;
    }

    public String getRecoveryRate() {
        return recoveryRate;
    }

    public void setRecoveryRate(String recoveryRate) {
        this.recoveryRate = recoveryRate;
    }

    public String getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }

    public String getLiteratureUsed() {
        return literatureUsed;
    }

    public void setLiteratureUsed(String literatureUsed) {
        this.literatureUsed = literatureUsed;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getTestingTime() {
        return testingTime;
    }

    public void setTestingTime(String testingTime) {
        this.testingTime = testingTime;
    }

    public String getTestingWay() {
        return testingWay;
    }

    public void setTestingWay(String testingWay) {
        this.testingWay = testingWay;
    }

    public String getTestingType() {
        return testingType;
    }

    public void setTestingType(String testingType) {
        this.testingType = testingType;
    }

    public String getIsAchieveGoal() {
        return isAchieveGoal;
    }

    public void setIsAchieveGoal(String isAchieveGoal) {
        this.isAchieveGoal = isAchieveGoal;
    }

    public String getCostPerformance() {
        return costPerformance;
    }

    public void setCostPerformance(String costPerformance) {
        this.costPerformance = costPerformance;
    }

    public String getOverallEvaluation() {
        return overallEvaluation;
    }

    public void setOverallEvaluation(String overallEvaluation) {
        this.overallEvaluation = overallEvaluation;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getDrawingsShow() {
        return drawingsShow;
    }

    public void setDrawingsShow(String drawingsShow) {
        this.drawingsShow = drawingsShow;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3;
    }

    public String getImg4() {
        return img4;
    }

    public void setImg4(String img4) {
        this.img4 = img4;
    }

    public String getImg5() {
        return img5;
    }

    public void setImg5(String img5) {
        this.img5 = img5;
    }

    public Timestamp getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Timestamp createdate) {
        this.createdate = createdate;
    }

    public String getRecorderemail() {
        return recorderemail;
    }

    public void setRecorderemail(String recorderemail) {
        this.recorderemail = recorderemail;
    }

    public Kit() {

    }
}
