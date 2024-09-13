package chapter15;

// 
import java.time.LocalDate;

public class Loan {
 
	private Member member; 
	private Book book;
	private LocalDate loanDate;
	private LocalDate retrunDate;
	
	public Loan(Member member, Book book, LocalDate loanDate ) {
		this.member = member;
		this.book = book;
		this.loanDate = loanDate;
		this.retrunDate = null;
	}
	
	// getter 메서드
	public Member getMember() {
		return member;
	}
	public Book getBook() {
		return book;
	}
	public LocalDate getLocalDate() {
		return loanDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		this.retrunDate = returnDate;
	}
	
	public boolean isOverdue() {
		return retrunDate == null && loanDate.plusDays(14).isBefore(loanDate.now());
		// returnDate가 null인 경우: 아직 반납되지 않음
		// loanDate.plusDays(14).isBefore(loanDate.now()): 대여일로부터 14일이 지남
		// >> loanDate.plusDays(14): 대여 날짜 + 14일 
		// >> loanDate.now(): 현재 날짜
		// >> A.isBefore(B)
		//    : 현재 날짜가 대여 기한 보다 늦은 날짜라면 true (연체됨)
		//    : A가 B보다 이전 날짜(A가 9월 15일, B가 9월 17일)
	}
	
}
