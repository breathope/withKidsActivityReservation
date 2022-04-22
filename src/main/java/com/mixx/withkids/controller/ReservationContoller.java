package com.mixx.withkids.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import com.mixx.withkids.domain.ReservationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class ReservationContoller {
    @Autowired
    ReservationRepository reserverRepo;

    
    // 예약 등록
    @RequestMapping(value="", method=RequestMethod.POST)
    public String requestMethodName(@RequestParam String param) {
        return "예약 등록됨";
    }


    // 전체목록 - 관리자
    @RequestMapping(value="list", method=RequestMethod.GET)
    public List<String> requestReservationList() {
        List<String> tmpRes = new ArrayList<>();
        tmpRes.add("example");
 
        return tmpRes;
    }

    // 사용자별 예약 목록
    // DTO 정의 필요
    @RequestMapping(value="list/user/{reserverId}", method=RequestMethod.GET)
    public List<String> requestReservationListByUser(@PathVariable(value = "reserverId") Long reserverId) {
       List<String> tmpRes = new ArrayList<>();
       tmpRes.add("example");

       return tmpRes;
    }

    // 제공자별 예약 목록
    // DTO 정의 필요
    @RequestMapping(value="list/provider/{providerId}", method=RequestMethod.GET)
    public List<String> requestReservationListByProvider(@PathVariable(value = "providerId") Long providerId) {
        List<String> tmpRes = new ArrayList<>();
        tmpRes.add("example");
 
        return tmpRes;
    }


    // 취소 목록
    // DTO 정의 필요
    @RequestMapping(value="list/canceled/{providerId}", method=RequestMethod.GET)
    public List<String> requestCanceledReservationList(@PathVariable(value = "providerId") Long providerId) {
        // providerId 없는 경우 관리자 - 전체 취소목록 조회
        List<String> tmpRes = new ArrayList<>();
        tmpRes.add("example");
 
        return tmpRes;
    }

    // 예약 수정
    @RequestMapping(value="/modify/{reservationId}}", method=RequestMethod.PATCH)
    public String requestReservationModify(@PathVariable(value = "reservationId") Long reservationId) {
        return "예약 수정됨";
    }
    
    // 예약 취소
    @RequestMapping(value="/cancel/{reservationId}", method=RequestMethod.GET)
    public String requestCancelResevation(@PathVariable(value = "reservationId") Long reservationId) {
        return "예약 취소됨";
    }
}
