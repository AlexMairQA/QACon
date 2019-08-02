package persistence.repository;

public interface MemberRepository {

	public String getAllMembers();

	public String getAccount(String email, String password);

	public String addMember(String member);

	public String deleteMember(Integer memId);

	public String updateMember(String member, Integer memId);

}
