package com.mixx.withkids.domain.contoller;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mixx.withkids.domain.Reservation;
import com.mixx.withkids.domain.ReservationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@RestController
public class ReservationContoller {
    @Autowired
    ReservationRepository reservationRepo;

    
    // 예약 등록
    // DTO 정의 필요
    @RequestMapping(value="", method=RequestMethod.POST)
    public String requestMethodName(@RequestBody String body) {
        return "예약 등록됨";
    }


    // 전체목록 - 관리자
    @RequestMapping(value="list", method=RequestMethod.GET)
    public List<Reservation> requestReservationList() {
        return reservationRepo.findAll();
    }

    // 사용자별 예약 목록
    // DTO 정의 필요
    @RequestMapping(value="list/user/{reserverId}", method=RequestMethod.GET)
    public List<Reservation> requestReservationListByUser(@PathVariable(value = "reserverId") Long reserverId) {
        return reservationRepo.findByReserverId(reserverId);
    }

    // 제공자별 예약 목록
    // DTO 정의 필요
    @RequestMapping(value="list/provider/{providerId}", method=RequestMethod.GET)
    public List<Reservation> requestReservationListByProvider(@PathVariable(value = "providerId") Long providerId) {
        return reservationRepo.findByProviderId(providerId);
    }


    // 취소 목록
    // DTO 정의 필요
    @RequestMapping(value="list/canceled/{providerId}", method=RequestMethod.GET)
    public List<Reservation> requestCanceledReservationListByProvider(@PathVariable(value = "providerId") Long providerId) {
        return null;
    }

    // 전체 취소 목록
    // DTO 정의 필요
    @RequestMapping(value="list/canceled", method=RequestMethod.GET)
    public List<Reservation> requestCanceledReservationList() {
        return reservationRepo.findByisCanceledTrue();
    }

    // 예약 수정
    @RequestMapping(value="/modify/{reservationId}", method=RequestMethod.PATCH)
    public String requestReservationModify(@PathVariable(value = "reservationId") Long reservationId) {
        reservationRepo.findById(reservationId).ifPresent(reservation -> {
            reservation.setReserveAt(new Date());
            reservationRepo.save(reservation);
        });
        return "예약 수정됨";
    }
    
    // 예약 취소
    @RequestMapping(value="/cancel/{reservationId}", method=RequestMethod.PATCH)
    public String requestCancelResevation(@PathVariable(value = "reservationId") Long reservationId) {
        reservationRepo.findById(reservationId).ifPresent(reservation -> {
            reservation.setCanceled(true);
            reservationRepo.save(reservation);
        });
        return "예약 취소됨";
    }
}
