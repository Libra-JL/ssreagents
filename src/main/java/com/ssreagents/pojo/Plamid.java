package com.ssreagents.pojo;

import java.sql.Timestamp;
import java.util.Objects;

public class Plamid {
    private String id;
    private String uid;
    private String kind;
    private String brand;
    private String productName;
    private String goodsNum;
    private String batchNum;
    private String specifications;
    private String price;
    private String goodsTime;
    private String periodValidity;
    private String parasitifer;
    private String useapplication;
    private String fragmentType;
    private String promoter;
    private String replicor;
    private String plasmidProfile;
    private String plasmidMaintenanceSequencecomment;
    private String oriNuclearResistancecomment;
    private String selectionMarker;
    private String fluorescentMark;
    private String regeneratingStrain;
    private String conditionCulture;
    private String sequencingPrimer5;
    private String sequencingPrimer3;
    private String literatureUsed;
    private String relatedProducts;
    private String fragmentSpecies;

    private String application;
    private String applicationObjectAtrain;
    private String bioOrganization;
    private String applicationWay;
    private String volume;
    private String infectionTime;
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Plamid plamid = (Plamid) o;
        return Objects.equals(id, plamid.id) &&
                Objects.equals(uid, plamid.uid) &&
                Objects.equals(kind, plamid.kind) &&
                Objects.equals(brand, plamid.brand) &&
                Objects.equals(productName, plamid.productName) &&
                Objects.equals(goodsNum, plamid.goodsNum) &&
                Objects.equals(batchNum, plamid.batchNum) &&
                Objects.equals(specifications, plamid.specifications) &&
                Objects.equals(price, plamid.price) &&
                Objects.equals(goodsTime, plamid.goodsTime) &&
                Objects.equals(periodValidity, plamid.periodValidity) &&
                Objects.equals(parasitifer, plamid.parasitifer) &&
                Objects.equals(useapplication, plamid.useapplication) &&
                Objects.equals(fragmentType, plamid.fragmentType) &&
                Objects.equals(promoter, plamid.promoter) &&
                Objects.equals(replicor, plamid.replicor) &&
                Objects.equals(plasmidProfile, plamid.plasmidProfile) &&
                Objects.equals(plasmidMaintenanceSequencecomment, plamid.plasmidMaintenanceSequencecomment) &&
                Objects.equals(oriNuclearResistancecomment, plamid.oriNuclearResistancecomment) &&
                Objects.equals(selectionMarker, plamid.selectionMarker) &&
                Objects.equals(fluorescentMark, plamid.fluorescentMark) &&
                Objects.equals(regeneratingStrain, plamid.regeneratingStrain) &&
                Objects.equals(conditionCulture, plamid.conditionCulture) &&
                Objects.equals(sequencingPrimer5, plamid.sequencingPrimer5) &&
                Objects.equals(sequencingPrimer3, plamid.sequencingPrimer3) &&
                Objects.equals(literatureUsed, plamid.literatureUsed) &&
                Objects.equals(relatedProducts, plamid.relatedProducts) &&
                Objects.equals(fragmentSpecies, plamid.fragmentSpecies) &&
                Objects.equals(application, plamid.application) &&
                Objects.equals(applicationObjectAtrain, plamid.applicationObjectAtrain) &&
                Objects.equals(bioOrganization, plamid.bioOrganization) &&
                Objects.equals(applicationWay, plamid.applicationWay) &&
                Objects.equals(volume, plamid.volume) &&
                Objects.equals(infectionTime, plamid.infectionTime) &&
                Objects.equals(isAchieveGoal, plamid.isAchieveGoal) &&
                Objects.equals(costPerformance, plamid.costPerformance) &&
                Objects.equals(overallEvaluation, plamid.overallEvaluation) &&
                Objects.equals(comments, plamid.comments) &&
                Objects.equals(drawingsShow, plamid.drawingsShow) &&
                Objects.equals(url, plamid.url) &&
                Objects.equals(img1, plamid.img1) &&
                Objects.equals(img2, plamid.img2) &&
                Objects.equals(img3, plamid.img3) &&
                Objects.equals(img4, plamid.img4) &&
                Objects.equals(img5, plamid.img5) &&
                Objects.equals(createdate, plamid.createdate) &&
                Objects.equals(recorderemail, plamid.recorderemail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, uid, kind, brand, productName, goodsNum, batchNum, specifications, price, goodsTime, periodValidity, parasitifer, useapplication, fragmentType, promoter, replicor, plasmidProfile, plasmidMaintenanceSequencecomment, oriNuclearResistancecomment, selectionMarker, fluorescentMark, regeneratingStrain, conditionCulture, sequencingPrimer5, sequencingPrimer3, literatureUsed, relatedProducts, fragmentSpecies, application, applicationObjectAtrain, bioOrganization, applicationWay, volume, infectionTime, isAchieveGoal, costPerformance, overallEvaluation, comments, drawingsShow, url, img1, img2, img3, img4, img5, createdate, recorderemail);
    }

    @Override
    public String toString() {
        return "Plamid{" +
                "id='" + id + '\'' +
                ", uid='" + uid + '\'' +
                ", kind='" + kind + '\'' +
                ", brand='" + brand + '\'' +
                ", productName='" + productName + '\'' +
                ", goodsNum='" + goodsNum + '\'' +
                ", batchNum='" + batchNum + '\'' +
                ", specifications='" + specifications + '\'' +
                ", price='" + price + '\'' +
                ", goodsTime='" + goodsTime + '\'' +
                ", periodValidity='" + periodValidity + '\'' +
                ", parasitifer='" + parasitifer + '\'' +
                ", useapplication='" + useapplication + '\'' +
                ", fragmentType='" + fragmentType + '\'' +
                ", promoter='" + promoter + '\'' +
                ", replicor='" + replicor + '\'' +
                ", plasmidProfile='" + plasmidProfile + '\'' +
                ", plasmidMaintenanceSequencecomment='" + plasmidMaintenanceSequencecomment + '\'' +
                ", oriNuclearResistancecomment='" + oriNuclearResistancecomment + '\'' +
                ", selectionMarker='" + selectionMarker + '\'' +
                ", fluorescentMark='" + fluorescentMark + '\'' +
                ", regeneratingStrain='" + regeneratingStrain + '\'' +
                ", conditionCulture='" + conditionCulture + '\'' +
                ", sequencingPrimer5='" + sequencingPrimer5 + '\'' +
                ", sequencingPrimer3='" + sequencingPrimer3 + '\'' +
                ", literatureUsed='" + literatureUsed + '\'' +
                ", relatedProducts='" + relatedProducts + '\'' +
                ", fragmentSpecies='" + fragmentSpecies + '\'' +
                ", application='" + application + '\'' +
                ", applicationObjectAtrain='" + applicationObjectAtrain + '\'' +
                ", bioOrganization='" + bioOrganization + '\'' +
                ", applicationWay='" + applicationWay + '\'' +
                ", volume='" + volume + '\'' +
                ", infectionTime='" + infectionTime + '\'' +
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getParasitifer() {
        return parasitifer;
    }

    public void setParasitifer(String parasitifer) {
        this.parasitifer = parasitifer;
    }

    public String getUseapplication() {
        return useapplication;
    }

    public void setUseapplication(String useapplication) {
        this.useapplication = useapplication;
    }

    public String getFragmentType() {
        return fragmentType;
    }

    public void setFragmentType(String fragmentType) {
        this.fragmentType = fragmentType;
    }

    public String getPromoter() {
        return promoter;
    }

    public void setPromoter(String promoter) {
        this.promoter = promoter;
    }

    public String getReplicor() {
        return replicor;
    }

    public void setReplicor(String replicor) {
        this.replicor = replicor;
    }

    public String getPlasmidProfile() {
        return plasmidProfile;
    }

    public void setPlasmidProfile(String plasmidProfile) {
        this.plasmidProfile = plasmidProfile;
    }

    public String getPlasmidMaintenanceSequencecomment() {
        return plasmidMaintenanceSequencecomment;
    }

    public void setPlasmidMaintenanceSequencecomment(String plasmidMaintenanceSequencecomment) {
        this.plasmidMaintenanceSequencecomment = plasmidMaintenanceSequencecomment;
    }

    public String getOriNuclearResistancecomment() {
        return oriNuclearResistancecomment;
    }

    public void setOriNuclearResistancecomment(String oriNuclearResistancecomment) {
        this.oriNuclearResistancecomment = oriNuclearResistancecomment;
    }

    public String getSelectionMarker() {
        return selectionMarker;
    }

    public void setSelectionMarker(String selectionMarker) {
        this.selectionMarker = selectionMarker;
    }

    public String getFluorescentMark() {
        return fluorescentMark;
    }

    public void setFluorescentMark(String fluorescentMark) {
        this.fluorescentMark = fluorescentMark;
    }

    public String getRegeneratingStrain() {
        return regeneratingStrain;
    }

    public void setRegeneratingStrain(String regeneratingStrain) {
        this.regeneratingStrain = regeneratingStrain;
    }

    public String getConditionCulture() {
        return conditionCulture;
    }

    public void setConditionCulture(String conditionCulture) {
        this.conditionCulture = conditionCulture;
    }

    public String getSequencingPrimer5() {
        return sequencingPrimer5;
    }

    public void setSequencingPrimer5(String sequencingPrimer5) {
        this.sequencingPrimer5 = sequencingPrimer5;
    }

    public String getSequencingPrimer3() {
        return sequencingPrimer3;
    }

    public void setSequencingPrimer3(String sequencingPrimer3) {
        this.sequencingPrimer3 = sequencingPrimer3;
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

    public String getFragmentSpecies() {
        return fragmentSpecies;
    }

    public void setFragmentSpecies(String fragmentSpecies) {
        this.fragmentSpecies = fragmentSpecies;
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

    public String getInfectionTime() {
        return infectionTime;
    }

    public void setInfectionTime(String infectionTime) {
        this.infectionTime = infectionTime;
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

    public Plamid() {
    }

    public Plamid(String id, String uid, String kind, String brand, String productName, String goodsNum, String batchNum, String specifications, String price, String goodsTime, String periodValidity, String parasitifer, String useapplication, String fragmentType, String promoter, String replicor, String plasmidProfile, String plasmidMaintenanceSequencecomment, String oriNuclearResistancecomment, String selectionMarker, String fluorescentMark, String regeneratingStrain, String conditionCulture, String sequencingPrimer5, String sequencingPrimer3, String literatureUsed, String relatedProducts, String fragmentSpecies, String application, String applicationObjectAtrain, String bioOrganization, String applicationWay, String volume, String infectionTime, String isAchieveGoal, String costPerformance, String overallEvaluation, String comments, String drawingsShow, String url, String img1, String img2, String img3, String img4, String img5, Timestamp createdate, String recorderemail) {
        this.id = id;
        this.uid = uid;
        this.kind = kind;
        this.brand = brand;
        this.productName = productName;
        this.goodsNum = goodsNum;
        this.batchNum = batchNum;
        this.specifications = specifications;
        this.price = price;
        this.goodsTime = goodsTime;
        this.periodValidity = periodValidity;
        this.parasitifer = parasitifer;
        this.useapplication = useapplication;
        this.fragmentType = fragmentType;
        this.promoter = promoter;
        this.replicor = replicor;
        this.plasmidProfile = plasmidProfile;
        this.plasmidMaintenanceSequencecomment = plasmidMaintenanceSequencecomment;
        this.oriNuclearResistancecomment = oriNuclearResistancecomment;
        this.selectionMarker = selectionMarker;
        this.fluorescentMark = fluorescentMark;
        this.regeneratingStrain = regeneratingStrain;
        this.conditionCulture = conditionCulture;
        this.sequencingPrimer5 = sequencingPrimer5;
        this.sequencingPrimer3 = sequencingPrimer3;
        this.literatureUsed = literatureUsed;
        this.relatedProducts = relatedProducts;
        this.fragmentSpecies = fragmentSpecies;
        this.application = application;
        this.applicationObjectAtrain = applicationObjectAtrain;
        this.bioOrganization = bioOrganization;
        this.applicationWay = applicationWay;
        this.volume = volume;
        this.infectionTime = infectionTime;
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
