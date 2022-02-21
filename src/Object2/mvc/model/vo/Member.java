package Object2.mvc.model.vo;

public class Member {
	
	private String memeberId;
	private String memberPwd;
	private String memberName;
	private String citizenNo;
	private double height;
	
	//기본 생성자
	public Member() {
		// TODO Auto-generated constructor stub
	}
	//매개변수가 있는 생성자
	public Member(String memeberId, String memberPwd, String memberName, String citizenNo, double height) {
		super();
		this.memeberId = memeberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.citizenNo = citizenNo;
		this.height = height;
	}
	//getter,setter
	public String getMemeberId() {
		return memeberId;
	}

	public void setMemeberId(String memeberId) {
		this.memeberId = memeberId;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setEmeverPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getCitizenNo() {
		return citizenNo;
	}

	public void setCitizenNo(String citizenNo) {
		this.citizenNo = citizenNo;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public String information() {
		return "아이디 : " + memeberId + " 비밀번호 : " + memberPwd + " 이름 : " + memberName + 
				" 주민번호 : " + citizenNo + " 키 : " + height;
	}
}
