package persistence.repository;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.qa.util.JSONUtil;

import persistence.domain.Members;

@Default
public class MemberRepositoryImpl implements MemberRepository {

	@Inject
	Members member;

	@PersistenceContext
	EntityManager em;

	@Inject
	private JSONUtil jsonA;

	@Transactional(value = TxType.REQUIRED)
	public String getAllMembers() {
		// TODO Auto-generated method stub
		TypedQuery<Members> query = em.createQuery("SELECT m FROM Members m", Members.class);

		return jsonA.getJSONForObject(query.getResultList());
	}

	@Transactional(value = TxType.REQUIRED)
	public String getAccount(String firstName, String lastName, String password) {
		TypedQuery<Members> query = em.createQuery("SELECT m FROM Members m WHERE m.firstName='" + firstName
				+ "' AND m.lastName='" + lastName + "' AND m.password='" + password + "'", Members.class);

		return jsonA.getJSONForObject(query.getResultList());
	}

	@Transactional(value = TxType.REQUIRED)
	public String addMember(String member) {
		// TODO Auto-generated method stub
		Members m = json.getObjectForJSON(member, Members.class);
		em.persist(m);

		return "Member added";
	}

	@Transactional(value = TxType.REQUIRED)
	public String deleteMember(Integer memId) {

		em.remove(em.find(Members.class, memId));

		return "Member deleted";

	}

	@Inject
	private JSONUtil json;

	@Transactional(value = TxType.REQUIRED)
	public String updateMember(String member, Integer memId) {
		// TODO Auto-generated method stub
		Members updated = json.getObjectForJSON(member, Members.class);

		Members exists = em.find(Members.class, memId);

		exists.setFirstName(updated.getFirstName());
		exists.setLastName(updated.getLastName());
		exists.setEmail(updated.getEmail());
		exists.setMoniker(updated.getMoniker());
		exists.setShowRealName(updated.getShowRealName());
		exists.setPassword(updated.getPassword());

		em.persist(exists);

		return "Member updated";

	}

}
