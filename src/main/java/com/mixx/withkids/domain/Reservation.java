package com.mixx.withkids.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reservation {
    @Id @GeneratedValue
    Long reservationId;     // 예약 아이디

    String activityName;     // 활동명 | 중복성 컬럼
    Long activityId;       // 활동 Entity ID
    String provider;    // 활동 제공자(업체) | 중복성 컬럼
    String location;    // 활동지역 ??  | 중복성 컬럼
    String category;    // 카테코리 ??  | 중복성 컬럼
    Date reserveAt;   // 예약일자
    Date modifyAt;  // 예약 마지막 수정일자
    boolean isCanceled; // 취소 여부


    public boolean checkNoShow() {
        if((new Date()).after(getReserveAt())) {
            return true;
        } else {
            return false;
        }
    }

    public Reservation(String activityName, Long activityId, String provider, String location, String category, Date reserveAt) {
        this.activityName = activityName;
        this.activityId = activityId;
        this.provider = provider;
        this.location = location;
        this.category = category;
        this.reserveAt = reserveAt;
    }

    public Long getReservationId() {
        return reservationId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
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

    public boolean isCanceled() {
        return isCanceled;
    }

    public void setCanceled(boolean isCanceled) {
        this.isCanceled = isCanceled;
    }

    @Override
    public String toString() {
        return "Reservation [activityId=" + activityId + ", activityName=" + activityName + ", category=" + category
                + ", isCanceled=" + isCanceled + ", location=" + location + ", modifyAt=" + modifyAt + ", provider="
                + provider + ", reservationId=" + reservationId + ", reserveAt=" + reserveAt + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((activityId == null) ? 0 : activityId.hashCode());
        result = prime * result + ((activityName == null) ? 0 : activityName.hashCode());
        result = prime * result + ((category == null) ? 0 : category.hashCode());
        result = prime * result + (isCanceled ? 1231 : 1237);
        result = prime * result + ((location == null) ? 0 : location.hashCode());
        result = prime * result + ((modifyAt == null) ? 0 : modifyAt.hashCode());
        result = prime * result + ((provider == null) ? 0 : provider.hashCode());
        result = prime * result + ((reservationId == null) ? 0 : reservationId.hashCode());
        result = prime * result + ((reserveAt == null) ? 0 : reserveAt.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Reservation other = (Reservation) obj;
        if (activityId == null) {
            if (other.activityId != null)
                return false;
        } else if (!activityId.equals(other.activityId))
            return false;
        if (activityName == null) {
            if (other.activityName != null)
                return false;
        } else if (!activityName.equals(other.activityName))
            return false;
        if (category == null) {
            if (other.category != null)
                return false;
        } else if (!category.equals(other.category))
            return false;
        if (isCanceled != other.isCanceled)
            return false;
        if (location == null) {
            if (other.location != null)
                return false;
        } else if (!location.equals(other.location))
            return false;
        if (modifyAt == null) {
            if (other.modifyAt != null)
                return false;
        } else if (!modifyAt.equals(other.modifyAt))
            return false;
        if (provider == null) {
            if (other.provider != null)
                return false;
        } else if (!provider.equals(other.provider))
            return false;
        if (reservationId == null) {
            if (other.reservationId != null)
                return false;
        } else if (!reservationId.equals(other.reservationId))
            return false;
        if (reserveAt == null) {
            if (other.reserveAt != null)
                return false;
        } else if (!reserveAt.equals(other.reserveAt))
            return false;
        return true;
    }

    
}
