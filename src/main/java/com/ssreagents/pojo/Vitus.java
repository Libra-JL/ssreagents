package com.ssreagents.pojo;

import java.util.Objects;

public class Vitus {
    private Integer id;
    private String username;
    private String brand;
    private String product_name;
    private String goods_num;
    private String batch_num;
    private String specifications;
    private String price;
    private String goods_time;
    private String period_validity;
    private String seroytpe;
    private String promoter;
    private String element;
    private String fluorescent;
    private String genetic_code;
    private String gene_name;
    private String gene_size;
    private String resistance_gene;
    private String storage;
    private String qpcr;
    private String silver_stain;
    private String literature_used;
    private String application;
    private String application_object_atrain;
    private String bio_organization;
    private String application_way;
    private String volume;
    private String infection_time;
    private String is_achieve_goal;
    private String cost_performance;
    private String overall_evaluation;
    private String comments;
    private String drawings_show;
    private String URL;
    private String img;


//    public Vitus() {
//    }

    public Vitus(Integer id, String username, String brand, String product_name, String goods_num, String batch_num, String specifications, String price, String goods_time, String period_validity, String seroytpe, String promoter, String element, String fluorescent, String genetic_code, String gene_name, String gene_size, String resistance_gene, String storage, String qpcr, String silver_stain, String literature_used, String application, String application_object_atrain, String bio_organization, String application_way, String volume, String infection_time, String is_achieve_goal, String cost_performance, String overall_evaluation, String comments, String drawings_show, String URL, String img) {

        this.id = id;
        this.username = username;
        this.brand = brand;
        this.product_name = product_name;
        this.goods_num = goods_num;
        this.batch_num = batch_num;
        this.specifications = specifications;
        this.price = price;
        this.goods_time = goods_time;
        this.period_validity = period_validity;
        this.seroytpe = seroytpe;
        this.promoter = promoter;
        this.element = element;
        this.fluorescent = fluorescent;
        this.genetic_code = genetic_code;
        this.gene_name = gene_name;
        this.gene_size = gene_size;
        this.resistance_gene = resistance_gene;
        this.storage = storage;
        this.qpcr = qpcr;
        this.silver_stain = silver_stain;
        this.literature_used = literature_used;
        this.application = application;
        this.application_object_atrain = application_object_atrain;
        this.bio_organization = bio_organization;
        this.application_way = application_way;
        this.volume = volume;
        this.infection_time = infection_time;
        this.is_achieve_goal = is_achieve_goal;
        this.cost_performance = cost_performance;
        this.overall_evaluation = overall_evaluation;
        this.comments = comments;
        this.drawings_show = drawings_show;
        this.URL = URL;
        this.img = img;
    }

    public Vitus(Integer id, String username, String brand, String product_name, String goods_num, String batch_num, String specifications, String price, String goods_time, String period_validity, String seroytpe, String promoter, String element, String fluorescent, String genetic_code, String gene_name, String gene_size, String resistance_gene, String qpcr, String silver_stain, String literature_used, String application, String application_object_atrain, String bio_organization, String application_way, String volume, String infection_time, String is_achieve_goal, String cost_performance, String overall_evaluation, String comments, String drawings_show, String url, String img) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getGoods_num() {
        return goods_num;
    }

    public void setGoods_num(String goods_num) {
        this.goods_num = goods_num;
    }

    public String getBatch_num() {
        return batch_num;
    }

    public void setBatch_num(String batch_num) {
        this.batch_num = batch_num;
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

    public String getGoods_time() {
        return goods_time;
    }

    public void setGoods_time(String goods_time) {
        this.goods_time = goods_time;
    }

    public String getPeriod_validity() {
        return period_validity;
    }

    public void setPeriod_validity(String period_validity) {
        this.period_validity = period_validity;
    }

    public String getSeroytpe() {
        return seroytpe;
    }

    public void setSeroytpe(String seroytpe) {
        this.seroytpe = seroytpe;
    }

    public String getPromoter() {
        return promoter;
    }

    public void setPromoter(String promoter) {
        this.promoter = promoter;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getFluorescent() {
        return fluorescent;
    }

    public void setFluorescent(String fluorescent) {
        this.fluorescent = fluorescent;
    }

    public String getGenetic_code() {
        return genetic_code;
    }

    public void setGenetic_code(String genetic_code) {
        this.genetic_code = genetic_code;
    }

    public String getGene_name() {
        return gene_name;
    }

    public void setGene_name(String gene_name) {
        this.gene_name = gene_name;
    }

    public String getGene_size() {
        return gene_size;
    }

    public void setGene_size(String gene_size) {
        this.gene_size = gene_size;
    }

    public String getResistance_gene() {
        return resistance_gene;
    }

    public void setResistance_gene(String resistance_gene) {
        this.resistance_gene = resistance_gene;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getQpcr() {
        return qpcr;
    }

    public void setQpcr(String qpcr) {
        this.qpcr = qpcr;
    }

    public String getSilver_stain() {
        return silver_stain;
    }

    public void setSilver_stain(String silver_stain) {
        this.silver_stain = silver_stain;
    }

    public String getLiterature_used() {
        return literature_used;
    }

    public void setLiterature_used(String literature_used) {
        this.literature_used = literature_used;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getApplication_object_atrain() {
        return application_object_atrain;
    }

    public void setApplication_object_atrain(String application_object_atrain) {
        this.application_object_atrain = application_object_atrain;
    }

    public String getBio_organization() {
        return bio_organization;
    }

    public void setBio_organization(String bio_organization) {
        this.bio_organization = bio_organization;
    }

    public String getApplication_way() {
        return application_way;
    }

    public void setApplication_way(String application_way) {
        this.application_way = application_way;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getInfection_time() {
        return infection_time;
    }

    public void setInfection_time(String infection_time) {
        this.infection_time = infection_time;
    }

    public String getIs_achieve_goal() {
        return is_achieve_goal;
    }

    public void setIs_achieve_goal(String is_achieve_goal) {
        this.is_achieve_goal = is_achieve_goal;
    }

    public String getCost_performance() {
        return cost_performance;
    }

    public void setCost_performance(String cost_performance) {
        this.cost_performance = cost_performance;
    }

    public String getOverall_evaluation() {
        return overall_evaluation;
    }

    public void setOverall_evaluation(String overall_evaluation) {
        this.overall_evaluation = overall_evaluation;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getDrawings_show() {
        return drawings_show;
    }

    public void setDrawings_show(String drawings_show) {
        this.drawings_show = drawings_show;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Vitus{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", brand='" + brand + '\'' +
                ", product_name='" + product_name + '\'' +
                ", goods_num='" + goods_num + '\'' +
                ", batch_num='" + batch_num + '\'' +
                ", specifications='" + specifications + '\'' +
                ", price='" + price + '\'' +
                ", goods_time='" + goods_time + '\'' +
                ", period_validity='" + period_validity + '\'' +
                ", seroytpe='" + seroytpe + '\'' +
                ", promoter='" + promoter + '\'' +
                ", element='" + element + '\'' +
                ", fluorescent='" + fluorescent + '\'' +
                ", genetic_code='" + genetic_code + '\'' +
                ", gene_name='" + gene_name + '\'' +
                ", gene_size='" + gene_size + '\'' +
                ", resistance_gene='" + resistance_gene + '\'' +
                ", storage='" + storage + '\'' +
                ", qpcr='" + qpcr + '\'' +
                ", silver_stain='" + silver_stain + '\'' +
                ", literature_used='" + literature_used + '\'' +
                ", application='" + application + '\'' +
                ", application_object_atrain='" + application_object_atrain + '\'' +
                ", bio_organization='" + bio_organization + '\'' +
                ", application_way='" + application_way + '\'' +
                ", volume='" + volume + '\'' +
                ", infection_time='" + infection_time + '\'' +
                ", is_achieve_goal='" + is_achieve_goal + '\'' +
                ", cost_performance='" + cost_performance + '\'' +
                ", overall_evaluation='" + overall_evaluation + '\'' +
                ", comments='" + comments + '\'' +
                ", drawings_show='" + drawings_show + '\'' +
                ", URL='" + URL + '\'' +
                ", img='" + img + '\'' +
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
        Vitus vitus = (Vitus) o;
        return Objects.equals(id, vitus.id) &&
                Objects.equals(username, vitus.username) &&
                Objects.equals(brand, vitus.brand) &&
                Objects.equals(product_name, vitus.product_name) &&
                Objects.equals(goods_num, vitus.goods_num) &&
                Objects.equals(batch_num, vitus.batch_num) &&
                Objects.equals(specifications, vitus.specifications) &&
                Objects.equals(price, vitus.price) &&
                Objects.equals(goods_time, vitus.goods_time) &&
                Objects.equals(period_validity, vitus.period_validity) &&
                Objects.equals(seroytpe, vitus.seroytpe) &&
                Objects.equals(promoter, vitus.promoter) &&
                Objects.equals(element, vitus.element) &&
                Objects.equals(fluorescent, vitus.fluorescent) &&
                Objects.equals(genetic_code, vitus.genetic_code) &&
                Objects.equals(gene_name, vitus.gene_name) &&
                Objects.equals(gene_size, vitus.gene_size) &&
                Objects.equals(resistance_gene, vitus.resistance_gene) &&
                Objects.equals(storage, vitus.storage) &&
                Objects.equals(qpcr, vitus.qpcr) &&
                Objects.equals(silver_stain, vitus.silver_stain) &&
                Objects.equals(literature_used, vitus.literature_used) &&
                Objects.equals(application, vitus.application) &&
                Objects.equals(application_object_atrain, vitus.application_object_atrain) &&
                Objects.equals(bio_organization, vitus.bio_organization) &&
                Objects.equals(application_way, vitus.application_way) &&
                Objects.equals(volume, vitus.volume) &&
                Objects.equals(infection_time, vitus.infection_time) &&
                Objects.equals(is_achieve_goal, vitus.is_achieve_goal) &&
                Objects.equals(cost_performance, vitus.cost_performance) &&
                Objects.equals(overall_evaluation, vitus.overall_evaluation) &&
                Objects.equals(comments, vitus.comments) &&
                Objects.equals(drawings_show, vitus.drawings_show) &&
                Objects.equals(URL, vitus.URL) &&
                Objects.equals(img, vitus.img);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, brand, product_name, goods_num, batch_num, specifications, price, goods_time, period_validity, seroytpe, promoter, element, fluorescent, genetic_code, gene_name, gene_size, resistance_gene, storage, qpcr, silver_stain, literature_used, application, application_object_atrain, bio_organization, application_way, volume, infection_time, is_achieve_goal, cost_performance, overall_evaluation, comments, drawings_show, URL, img);
    }
}
