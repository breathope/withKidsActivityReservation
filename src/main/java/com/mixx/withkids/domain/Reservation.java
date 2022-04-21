package com.mixx.withkids.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reservation {
    String actName;     // 활동명
    Long actCode;       // 활동 등록코드
    String provider;    // 활동 제공자(업체)
    String location;    // 활동지역 ?? 
    String category;    // 카테코리 ??
    Date reserveAt;   // 예약일자
    Date modifyAt;  // 예약 마지막 수정일자
    boolean isCanceled; // 취소 여부


    @Id @GeneratedValue
    Long reservationId;

    public boolean checkNoShow() {
        if((new Date()).after(getReserveAt())) {
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
    public boolean isCanceled() {
        return isCanceled;
    }
    public void setCanceled(boolean isCanceled) {
        this.isCanceled = isCanceled;
    }
    public void setActCode(Long actCode) {
        this.actCode = actCode;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }

    public Date getReserveAt() {
        return reserveAt;
    }

    public void setReserveAt(Date reserveAt) {
        this.reserveAt = reserveAt;
    }

    public Date getModifyAt() {
        return modifyAt;
    }

    public void setModifyAt(Date modifyAt) {
        this.modifyAt = modifyAt;
    }
    
}
