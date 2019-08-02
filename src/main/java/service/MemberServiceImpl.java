package service;

import javax.enterprise.inject.Default;
import javax.inject.Inject;

import persistence.repository.MemberRepository;

@Default
public class MemberServiceImpl implements MemberService {

	@Inject
	MemberRepository memRepo;

	public String getAllMembers() {
		// TODO Auto-generated method stub
		return this.memRepo.getAllMembers();
	}

	public String getAccount(String email, String password) {

		return memRepo.getAccount(email, password);
	}

	public String addMember(String member) {
		// TODO Auto-generated method stub
		return this.memRepo.addMember(member);
	}

	public String deleteMember(Integer memId) {
		// TODO Auto-generated method stub
		return this.memRepo.deleteMember(memId);
	}

	public String updateMember(String member, Integer memId) {
		// TODO Auto-generated method stub
		return this.memRepo.updateMember(member, memId);
	}

}
