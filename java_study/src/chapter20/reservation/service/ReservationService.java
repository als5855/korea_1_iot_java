package chapter20.reservation.service;

import java.util.ArrayList;
import java.util.List;

import chapter20.reservation.model.Reservation;
import chapter20.reservation.repository.ReservationRepository;

/*
    ReservationService 클래스 (service)
    - 예약 관련 기능 구현 (예약 생성, 확인, 취소)
*/

public class ReservationService {
    private ReservationRepository reservationRepository;

    // 생성자
    public ReservationService() {
        this.reservationRepository = new ReservationRepository();
    }

    // 예약 생성 메서드
    public void createReservation(String reservationId, String userId, String reservationTime) {
        Reservation newReservation = new Reservation(reservationId, userId, reservationTime);
        reservationRepository.addReservation(newReservation);
        System.out.println("예약 완료: " + reservationTime);
    }

    // 사용자의 모든 활성화된 예약을 가져오는 메서드
    public List<Reservation> getReservations(String userId) {
        List<Reservation> userReservations = reservationRepository.findAll();
        return userReservations.stream()
                .filter(reservation -> reservation.getUserId().equals(userId) && reservation.isActive())
                .toList();
    }

    // 예약 취소 메서드
    public void cancelReservations(String reservationId) {
        Reservation reservation = reservationRepository.findById(reservationId);
        if (reservation != null && reservation.isActive()) {
            reservation.cancel();  // 예약 상태를 취소로 변경
            System.out.println("예약 취소 완료: " + reservationId);
        } else {
        	System.out.println("예약 취소 실패: 예약 ID가 잘못되었거나, 이미 취소된 예약입니다.");        	
        }
    }
}
