package rest;

public interface MemberController {
	public String getAllMembers();

	public String getAccount(String firstname, String lastName, String password);

	public String addMember(String member);

	public String deleteMember(String memId);

	public String updateMember(String member, Integer memId);

}
