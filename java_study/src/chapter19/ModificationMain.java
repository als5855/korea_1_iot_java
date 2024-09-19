package chapter19;

public class ModificationMain {
	public static void main(String[] args) {
		Modification<String> m1 = new Modification<String>() {
			
			@Override
			public String modify(String oldData, String newData) { 
				System.out.println("기존 데이터: " +  oldData); 
				System.out.println("새로운 데이터: " +  newData); 
				return newData + 1 ;		
			}
		};
		
		Modification<String> m2 = new Modification<String>() {
			
			@Override
			public String modify(String oldData, String newData) {
				// TODO Auto-generated method stub
				return newData + "2";
			}
		};
		
		Modification<String> m3 = (oldData, newData) -> newData + "3";
		
		String name = "장지민";
		String newName = m1.modify(name, "이미진");
		System.out.println(newName);
		
		String newName2 = m1.modify(name, "이지윤");
		System.out.println(newName2);
		
		String newName3 = m1.modify(name, "장지영");
		System.out.println(newName3);
	}
}
