package chapter20.reservation.model;

public class Reservation {
	private String reservationId;
	private String userId;
	private String reservationTime;
	private boolean isActive;
	
	public Reservation(String reservationId, String userId, String reservationTime) {
		this.reservationId = reservationId;
		this.userId = userId;
		this.reservationTime = reservationTime;
		this.isActive = true; // 기본값으로 예약은 활성 상태로 생성
	}
	
	//getter
	public String getReservationId() {
		return reservationId;
	}
	public String getUserId() {
		return userId;
	}
	public String getReservationTime() {
		return reservationTime;
	}
	public boolean isActive() {
		return isActive;
	}
	
	//setter
	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}	
	
	public void setReservationTime(String reservationTime) {
		this.reservationTime = reservationTime;
	}
	public void cancel() {
		this.isActive = false; // 예약을 취소하며 비활성화 상태로 변경
	}
	
}
