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

    public Reservation(String actName, Long actCode, String provider, String location, String category,
            Date reserveAt) {
        this.actName = actName;
        this.actCode = actCode;
        this.provider = provider;
        this.location = location;
        this.category = category;
        this.reserveAt = reserveAt;
    }


    public String getActName() {
        return actName;
    }
    // public void setActName(String actName) {
    //     this.actName = actName;
    // }
    public long getActCode() {
        return actCode;
    }
    // public void setActCode(long actCode) {
    //     this.actCode = actCode;
    // }
    public String getLocation() {
        return location;
    }
    // public void setLocation(String location) {
    //     this.location = location;
    // }
    public String getCategory() {
        return category;
    }
    // public void setCategory(String category) {
    //     this.category = category;
    // }
    public boolean isCanceled() {
        return isCanceled;
    }
    // public void setCanceled(boolean isCanceled) {
    //     this.isCanceled = isCanceled;
    // }
    // public void setActCode(Long actCode) {
    //     this.actCode = actCode;
    // }

    public String getProvider() {
        return provider;
    }

    // public void setProvider(String provider) {
    //     this.provider = provider;
    // }

    public Long getReservationId() {
        return reservationId;
    }

    // public void setReservationId(Long reservationId) {
    //     this.reservationId = reservationId;
    // }

    public Date getReserveAt() {
        return reserveAt;
    }

    // public void setReserveAt(Date reserveAt) {
    //     this.reserveAt = reserveAt;
    // }

    public Date getModifyAt() {
        return modifyAt;
    }

    // public void setModifyAt(Date modifyAt) {
    //     this.modifyAt = modifyAt;
    // }

    @Override
    public String toString() {
        return "Reservation [actCode=" + actCode + ", actName=" + actName + ", category=" + category + ", isCanceled="
                + isCanceled + ", location=" + location + ", modifyAt=" + modifyAt + ", provider=" + provider
                + ", reservationId=" + reservationId + ", reserveAt=" + reserveAt + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((actCode == null) ? 0 : actCode.hashCode());
        result = prime * result + ((actName == null) ? 0 : actName.hashCode());
        result = prime * result + ((category == null) ? 0 : category.hashCode());
        result = prime * result + (isCanceled ? 1231 : 1237);
        result = prime * result + ((location == null) ? 0 : location.hashCode());
        result = prime * result + ((modifyAt == null) ? 0 : modifyAt.hashCode());
        result = prime * result + ((provider == null) ? 0 : provider.hashCode());
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
        if (actCode == null) {
            if (other.actCode != null)
                return false;
        } else if (!actCode.equals(other.actCode))
            return false;
        if (actName == null) {
            if (other.actName != null)
                return false;
        } else if (!actName.equals(other.actName))
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
        if (reserveAt == null) {
            if (other.reserveAt != null)
                return false;
        } else if (!reserveAt.equals(other.reserveAt))
            return false;
        return true;
    }
    
    
}
