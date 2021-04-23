package com.ssreagents.pojo;

import java.sql.Timestamp;
import java.util.Objects;

public class Antibody {

    private long id;
    private String uid;
    private String brand;
    private String kind;
    private String productName;
    private String goodsNum;
    private String batchNum;
    private String specifications;
    private String concentration;
    private String price;
    private String parasitifer;
    private String cloned;
    private String proteinTargets;
    private String appliedRange;
    private String conjugate;
    private String goodsTime;
    private String periodValidity;
    private String cloneNumber;
    private String speciesReactivity;
    private String literatureUsed;
    private String relatedProducts;
    private String immunogen;
    private String form;
    private String storage;
    private String storageSolution;

    private String application;
    private String workingConcentration;
    private String applicationObjectAtrain;
    private String bioOrganization;
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
        return "Antibody{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", brand='" + brand + '\'' +
                ", kind='" + kind + '\'' +
                ", productName='" + productName + '\'' +
                ", goodsNum='" + goodsNum + '\'' +
                ", batchNum='" + batchNum + '\'' +
                ", specifications='" + specifications + '\'' +
                ", concentration='" + concentration + '\'' +
                ", price='" + price + '\'' +
                ", parasitifer='" + parasitifer + '\'' +
                ", cloned='" + cloned + '\'' +
                ", proteinTargets='" + proteinTargets + '\'' +
                ", appliedRange='" + appliedRange + '\'' +
                ", conjugate='" + conjugate + '\'' +
                ", goodsTime='" + goodsTime + '\'' +
                ", periodValidity='" + periodValidity + '\'' +
                ", cloneNumber='" + cloneNumber + '\'' +
                ", speciesReactivity='" + speciesReactivity + '\'' +
                ", literatureUsed='" + literatureUsed + '\'' +
                ", relatedProducts='" + relatedProducts + '\'' +
                ", immunogen='" + immunogen + '\'' +
                ", form='" + form + '\'' +
                ", storage='" + storage + '\'' +
                ", storageSolution='" + storageSolution + '\'' +
                ", application='" + application + '\'' +
                ", workingConcentration='" + workingConcentration + '\'' +
                ", applicationObjectAtrain='" + applicationObjectAtrain + '\'' +
                ", bioOrganization='" + bioOrganization + '\'' +
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
        Antibody antibody = (Antibody) o;
        return id == antibody.id &&
                Objects.equals(uid, antibody.uid) &&
                Objects.equals(brand, antibody.brand) &&
                Objects.equals(kind, antibody.kind) &&
                Objects.equals(productName, antibody.productName) &&
                Objects.equals(goodsNum, antibody.goodsNum) &&
                Objects.equals(batchNum, antibody.batchNum) &&
                Objects.equals(specifications, antibody.specifications) &&
                Objects.equals(concentration, antibody.concentration) &&
                Objects.equals(price, antibody.price) &&
                Objects.equals(parasitifer, antibody.parasitifer) &&
                Objects.equals(cloned, antibody.cloned) &&
                Objects.equals(proteinTargets, antibody.proteinTargets) &&
                Objects.equals(appliedRange, antibody.appliedRange) &&
                Objects.equals(conjugate, antibody.conjugate) &&
                Objects.equals(goodsTime, antibody.goodsTime) &&
                Objects.equals(periodValidity, antibody.periodValidity) &&
                Objects.equals(cloneNumber, antibody.cloneNumber) &&
                Objects.equals(speciesReactivity, antibody.speciesReactivity) &&
                Objects.equals(literatureUsed, antibody.literatureUsed) &&
                Objects.equals(relatedProducts, antibody.relatedProducts) &&
                Objects.equals(immunogen, antibody.immunogen) &&
                Objects.equals(form, antibody.form) &&
                Objects.equals(storage, antibody.storage) &&
                Objects.equals(storageSolution, antibody.storageSolution) &&
                Objects.equals(application, antibody.application) &&
                Objects.equals(workingConcentration, antibody.workingConcentration) &&
                Objects.equals(applicationObjectAtrain, antibody.applicationObjectAtrain) &&
                Objects.equals(bioOrganization, antibody.bioOrganization) &&
                Objects.equals(isAchieveGoal, antibody.isAchieveGoal) &&
                Objects.equals(costPerformance, antibody.costPerformance) &&
                Objects.equals(overallEvaluation, antibody.overallEvaluation) &&
                Objects.equals(comments, antibody.comments) &&
                Objects.equals(drawingsShow, antibody.drawingsShow) &&
                Objects.equals(url, antibody.url) &&
                Objects.equals(img1, antibody.img1) &&
                Objects.equals(img2, antibody.img2) &&
                Objects.equals(img3, antibody.img3) &&
                Objects.equals(img4, antibody.img4) &&
                Objects.equals(img5, antibody.img5) &&
                Objects.equals(createdate, antibody.createdate) &&
                Objects.equals(recorderemail, antibody.recorderemail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, uid, brand, kind, productName, goodsNum, batchNum, specifications, concentration, price, parasitifer, cloned, proteinTargets, appliedRange, conjugate, goodsTime, periodValidity, cloneNumber, speciesReactivity, literatureUsed, relatedProducts, immunogen, form, storage, storageSolution, application, workingConcentration, applicationObjectAtrain, bioOrganization, isAchieveGoal, costPerformance, overallEvaluation, comments, drawingsShow, url, img1, img2, img3, img4, img5, createdate, recorderemail);
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
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

    public String getConcentration() {
        return concentration;
    }

    public void setConcentration(String concentration) {
        this.concentration = concentration;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getParasitifer() {
        return parasitifer;
    }

    public void setParasitifer(String parasitifer) {
        this.parasitifer = parasitifer;
    }

    public String getCloned() {
        return cloned;
    }

    public void setCloned(String cloned) {
        this.cloned = cloned;
    }

    public String getProteinTargets() {
        return proteinTargets;
    }

    public void setProteinTargets(String proteinTargets) {
        this.proteinTargets = proteinTargets;
    }

    public String getAppliedRange() {
        return appliedRange;
    }

    public void setAppliedRange(String appliedRange) {
        this.appliedRange = appliedRange;
    }

    public String getConjugate() {
        return conjugate;
    }

    public void setConjugate(String conjugate) {
        this.conjugate = conjugate;
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

    public String getCloneNumber() {
        return cloneNumber;
    }

    public void setCloneNumber(String cloneNumber) {
        this.cloneNumber = cloneNumber;
    }

    public String getSpeciesReactivity() {
        return speciesReactivity;
    }

    public void setSpeciesReactivity(String speciesReactivity) {
        this.speciesReactivity = speciesReactivity;
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

    public String getImmunogen() {
        return immunogen;
    }

    public void setImmunogen(String immunogen) {
        this.immunogen = immunogen;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getStorageSolution() {
        return storageSolution;
    }

    public void setStorageSolution(String storageSolution) {
        this.storageSolution = storageSolution;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getWorkingConcentration() {
        return workingConcentration;
    }

    public void setWorkingConcentration(String workingConcentration) {
        this.workingConcentration = workingConcentration;
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

    public Antibody() {
    }

    public Antibody(long id, String uid, String brand, String kind, String productName, String goodsNum, String batchNum, String specifications, String concentration, String price, String parasitifer, String cloned, String proteinTargets, String appliedRange, String conjugate, String goodsTime, String periodValidity, String cloneNumber, String speciesReactivity, String literatureUsed, String relatedProducts, String immunogen, String form, String storage, String storageSolution, String application, String workingConcentration, String applicationObjectAtrain, String bioOrganization, String isAchieveGoal, String costPerformance, String overallEvaluation, String comments, String drawingsShow, String url, String img1, String img2, String img3, String img4, String img5, Timestamp createdate, String recorderemail) {

        this.id = id;
        this.uid = uid;
        this.brand = brand;
        this.kind = kind;
        this.productName = productName;
        this.goodsNum = goodsNum;
        this.batchNum = batchNum;
        this.specifications = specifications;
        this.concentration = concentration;
        this.price = price;
        this.parasitifer = parasitifer;
        this.cloned = cloned;
        this.proteinTargets = proteinTargets;
        this.appliedRange = appliedRange;
        this.conjugate = conjugate;
        this.goodsTime = goodsTime;
        this.periodValidity = periodValidity;
        this.cloneNumber = cloneNumber;
        this.speciesReactivity = speciesReactivity;
        this.literatureUsed = literatureUsed;
        this.relatedProducts = relatedProducts;
        this.immunogen = immunogen;
        this.form = form;
        this.storage = storage;
        this.storageSolution = storageSolution;
        this.application = application;
        this.workingConcentration = workingConcentration;
        this.applicationObjectAtrain = applicationObjectAtrain;
        this.bioOrganization = bioOrganization;
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
}
