package com.mixx.withkids.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Resevation {
    String actName;     // 활동명
    Long actCode;       // 활동 등록코드
    String location;    // 활동지역 ?? 
    String category;    // 카테코리 ??
    Date reserveDate;   // 예약일자
    Date lastModified;  // 예약 마지막 수정일자
    boolean isCanceled; // 취소 여부


    @Id @GeneratedValue
    Long id;

    public boolean checkNoShow() {
        if((new Date()).after(getReserveDate())) {
            return true;
        } else {
            return false;
        }
    }

    public String getActName() {
        return actName;
    }
    public void setActName(String actName) {
        this.actName = actName;
    }
    public long getActCode() {
        return actCode;
    }
    public void setActCode(long actCode) {
        this.actCode = actCode;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public Date getReserveDate() {
        return reserveDate;
    }
    public void setReserveDate(Date reserveDate) {
        this.reserveDate = reserveDate;
    }
    public Date getLastModified() {
        return lastModified;
    }
    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }
    public boolean isCanceled() {
        return isCanceled;
    }
    public void setCanceled(boolean isCanceled) {
        this.isCanceled = isCanceled;
    }

}
