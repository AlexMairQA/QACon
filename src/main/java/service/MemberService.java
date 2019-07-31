package service;

public interface MemberService {

	public String getAllMembers();

	public String getAccount(String firstName, String lastName, String password);

	public String addMember(String member);

	public String deleteMember(Integer memId);

	public String updateMember(String member, Integer memId);

}
