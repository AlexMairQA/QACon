package rest;

public interface MemberController {
	public String getAllMembers();

	public String getAccount(String email, String password);

	public String addMember(String member);

	public String deleteMember(String memId);

	public String updateMember(String member, Integer memId);

}
