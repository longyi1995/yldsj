package com.goodsoft.yuanlin.domain.entity.demand;

import java.beans.Transient;

/**
 * Bid domain. 招标信息表实体
 *
 * @author 严彬荣
 */
public class Bid implements java.io.Serializable {

    // 表ID
    private Integer bid;
    // 标题名称
    private String titleName;
    // 招标内容
    private String content;
    // 联系人
    private String contact;
    // 联系电话
    private String tel;
    //发布日期
    private String date;
    // 发布时间
    private String time;
    //企业编号
    private String compId;
    // 用户ID
    private String uid;
    // 状态参数（删除状态不给用户查询信息）
    private Integer isNo;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Transient
    public String getCompId() {
        return compId;
    }

    public void setCompId(String compId) {
        this.compId = compId;
    }

    @Transient
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Transient
    public Integer getIsNo() {
        return isNo;
    }

    public void setIsNo(Integer isNo) {
        this.isNo = isNo;
    }
}