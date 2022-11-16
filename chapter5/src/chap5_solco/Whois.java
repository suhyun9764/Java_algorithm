package chap5_solco;

public class Whois {
	
	String name;
	int age;
	boolean marry;
	int childNum;
	
	public void showInfor() {
		System.out.printf("이 사람의 나이 : %d\n이 사람의 이름 : %s\n이 사람의 결혼 여부:%b\n이사람의 자녀수 : %d", age, name, marry, childNum);
	}

}
