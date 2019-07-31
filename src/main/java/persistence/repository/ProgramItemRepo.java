package persistence.repository;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.qa.util.JSONUtil;

import persistence.domain.ProgramItem;

@Default
public class ProgramItemRepo {

	@PersistenceContext(unitName = "primary")
	private EntityManager em;

	@Inject
	private JSONUtil json;

	@Transactional(value = TxType.REQUIRED)
	public String getAllProgramItems() {

		TypedQuery<ProgramItem> query = em.createQuery("SELECT p FROM ProgramItem p", ProgramItem.class);
		return json.getJSONForObject(query.getResultList());
	}

	@Transactional(value = TxType.REQUIRED)
	public String addProgramItem(String programItem) {
		ProgramItem p = json.getObjectForJSON(programItem, ProgramItem.class);
		em.persist(p);
		return "Program item added";
	}

	@Transactional(value = TxType.REQUIRED)
	public String deleteProgramItem(Integer programId) {
		// TODO Auto-generated method stub
		em.remove(em.find(ProgramItem.class, programId));

		return "item deleted";
	}

	@Transactional(value = TxType.REQUIRED)
	public String updateProgramItem(String programItem, Integer programId) {
		ProgramItem updated = json.getObjectForJSON(programItem, ProgramItem.class);

		ProgramItem exists = em.find(ProgramItem.class, programId);

		exists.setPanelName(updated.getPanelName());
		exists.setDescription(updated.getDescription());

		return exists.toString();

	}

}