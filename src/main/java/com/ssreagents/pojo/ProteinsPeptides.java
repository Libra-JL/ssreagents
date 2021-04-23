package com.ssreagents.pojo;

import java.sql.Timestamp;
import java.util.Objects;

public class ProteinsPeptides {
    private long id;
    private String uid;
    private String kind;
    private String brand;
    private String productName;
    private String goodsNum;
    private String batchNum;
    private String specifications;
    private String productType;
    private String proteinTargets;
    private String purity;
    private String price;
    private String goodsTime;
    private String periodValidity;
    private String form;
    private String species;
    private String storage;
    private String concentration;
    private String storageSolution;
    private String literatureUsed;
    private String relatedProducts;


    private String application;
    private String applicationObjectAtrain;
    private String bioOrganization;
    private String applicationWay;
    private String volume;
    private String workingConcentration;
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
        return "ProteinsPeptides{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", kind='" + kind + '\'' +
                ", brand='" + brand + '\'' +
                ", productName='" + productName + '\'' +
                ", goodsNum='" + goodsNum + '\'' +
                ", batchNum='" + batchNum + '\'' +
                ", specifications='" + specifications + '\'' +
                ", productType='" + productType + '\'' +
                ", proteinTargets='" + proteinTargets + '\'' +
                ", purity='" + purity + '\'' +
                ", price='" + price + '\'' +
                ", goodsTime='" + goodsTime + '\'' +
                ", periodValidity='" + periodValidity + '\'' +
                ", form='" + form + '\'' +
                ", species='" + species + '\'' +
                ", storage='" + storage + '\'' +
                ", concentration='" + concentration + '\'' +
                ", storageSolution='" + storageSolution + '\'' +
                ", literatureUsed='" + literatureUsed + '\'' +
                ", relatedProducts='" + relatedProducts + '\'' +
                ", application='" + application + '\'' +
                ", applicationObjectAtrain='" + applicationObjectAtrain + '\'' +
                ", bioOrganization='" + bioOrganization + '\'' +
                ", applicationWay='" + applicationWay + '\'' +
                ", volume='" + volume + '\'' +
                ", workingConcentration='" + workingConcentration + '\'' +
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
        ProteinsPeptides that = (ProteinsPeptides) o;
        return id == that.id &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(kind, that.kind) &&
                Objects.equals(brand, that.brand) &&
                Objects.equals(productName, that.productName) &&
                Objects.equals(goodsNum, that.goodsNum) &&
                Objects.equals(batchNum, that.batchNum) &&
                Objects.equals(specifications, that.specifications) &&
                Objects.equals(productType, that.productType) &&
                Objects.equals(proteinTargets, that.proteinTargets) &&
                Objects.equals(purity, that.purity) &&
                Objects.equals(price, that.price) &&
                Objects.equals(goodsTime, that.goodsTime) &&
                Objects.equals(periodValidity, that.periodValidity) &&
                Objects.equals(form, that.form) &&
                Objects.equals(species, that.species) &&
                Objects.equals(storage, that.storage) &&
                Objects.equals(concentration, that.concentration) &&
                Objects.equals(storageSolution, that.storageSolution) &&
                Objects.equals(literatureUsed, that.literatureUsed) &&
                Objects.equals(relatedProducts, that.relatedProducts) &&
                Objects.equals(application, that.application) &&
                Objects.equals(applicationObjectAtrain, that.applicationObjectAtrain) &&
                Objects.equals(bioOrganization, that.bioOrganization) &&
                Objects.equals(applicationWay, that.applicationWay) &&
                Objects.equals(volume, that.volume) &&
                Objects.equals(workingConcentration, that.workingConcentration) &&
                Objects.equals(isAchieveGoal, that.isAchieveGoal) &&
                Objects.equals(costPerformance, that.costPerformance) &&
                Objects.equals(overallEvaluation, that.overallEvaluation) &&
                Objects.equals(comments, that.comments) &&
                Objects.equals(drawingsShow, that.drawingsShow) &&
                Objects.equals(url, that.url) &&
                Objects.equals(img1, that.img1) &&
                Objects.equals(img2, that.img2) &&
                Objects.equals(img3, that.img3) &&
                Objects.equals(img4, that.img4) &&
                Objects.equals(img5, that.img5) &&
                Objects.equals(createdate, that.createdate) &&
                Objects.equals(recorderemail, that.recorderemail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, uid, kind, brand, productName, goodsNum, batchNum, specifications, productType, proteinTargets, purity, price, goodsTime, periodValidity, form, species, storage, concentration, storageSolution, literatureUsed, relatedProducts, application, applicationObjectAtrain, bioOrganization, applicationWay, volume, workingConcentration, isAchieveGoal, costPerformance, overallEvaluation, comments, drawingsShow, url, img1, img2, img3, img4, img5, createdate, recorderemail);
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

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProteinTargets() {
        return proteinTargets;
    }

    public void setProteinTargets(String proteinTargets) {
        this.proteinTargets = proteinTargets;
    }

    public String getPurity() {
        return purity;
    }

    public void setPurity(String purity) {
        this.purity = purity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
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

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getConcentration() {
        return concentration;
    }

    public void setConcentration(String concentration) {
        this.concentration = concentration;
    }

    public String getStorageSolution() {
        return storageSolution;
    }

    public void setStorageSolution(String storageSolution) {
        this.storageSolution = storageSolution;
    }

    public String getLiteratureUsed() {
        return literatureUsed;
    }

    public void setLiteratureUsed(String literatureUsed) {
        this.literatureUsed = literatureUsed;
    }

    public String getRelatedProducts() {
        return relatedProducts;
    }

    public void setRelatedProducts(String relatedProducts) {
        this.relatedProducts = relatedProducts;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getApplicationObjectAtrain() {
        return applicationObjectAtrain;
    }

    public void setApplicationObjectAtrain(String applicationObjectAtrain) {
        this.applicationObjectAtrain = applicationObjectAtrain;
    }

    public String getBioOrganization() {
        return bioOrganization;
    }

    public void setBioOrganization(String bioOrganization) {
        this.bioOrganization = bioOrganization;
    }

    public String getApplicationWay() {
        return applicationWay;
    }

    public void setApplicationWay(String applicationWay) {
        this.applicationWay = applicationWay;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getWorkingConcentration() {
        return workingConcentration;
    }

    public void setWorkingConcentration(String workingConcentration) {
        this.workingConcentration = workingConcentration;
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

    public ProteinsPeptides(long id, String uid, String kind, String brand, String productName, String goodsNum, String batchNum, String specifications, String productType, String proteinTargets, String purity, String price, String goodsTime, String periodValidity, String form, String species, String storage, String concentration, String storageSolution, String literatureUsed, String relatedProducts, String application, String applicationObjectAtrain, String bioOrganization, String applicationWay, String volume, String workingConcentration, String isAchieveGoal, String costPerformance, String overallEvaluation, String comments, String drawingsShow, String url, String img1, String img2, String img3, String img4, String img5, Timestamp createdate, String recorderemail) {
        this.id = id;
        this.uid = uid;
        this.kind = kind;
        this.brand = brand;
        this.productName = productName;
        this.goodsNum = goodsNum;
        this.batchNum = batchNum;
        this.specifications = specifications;
        this.productType = productType;
        this.proteinTargets = proteinTargets;
        this.purity = purity;
        this.price = price;
        this.goodsTime = goodsTime;
        this.periodValidity = periodValidity;
        this.form = form;
        this.species = species;
        this.storage = storage;
        this.concentration = concentration;
        this.storageSolution = storageSolution;
        this.literatureUsed = literatureUsed;
        this.relatedProducts = relatedProducts;
        this.application = application;
        this.applicationObjectAtrain = applicationObjectAtrain;
        this.bioOrganization = bioOrganization;
        this.applicationWay = applicationWay;
        this.volume = volume;
        this.workingConcentration = workingConcentration;
        this.isAchieveGoal = isAchieveGoal;
        this.costPerformance = costPerformance;
        this.overallEvaluation = overallEvaluation;
        this.comments = comments;
        this.drawingsShow = drawingsShow;
        this.url = url;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
        this.img5 = img5;
        this.createdate = createdate;
        this.recorderemail = recorderemail;
    }

    public ProteinsPeptides() {
    }
}
