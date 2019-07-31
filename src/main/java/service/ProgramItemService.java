package service;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.qa.util.JSONUtil;

import persistence.repository.ProgramItemRepo;;

public class ProgramItemService {
	@Inject
	ProgramItemRepo programRep;

	@PersistenceContext
	EntityManager em;

	@Transactional(value = TxType.REQUIRED)
	public String getAllProgramItems() {
		// TODO Auto-generated method stub

		return programRep.getAllProgramItems();
	}

	@Transactional(value = TxType.REQUIRED)
	public String addProgramItem(String programItem) {
		// TODO Auto-generated method stub
		return programRep.addProgramItem(programItem);
	}

	@Transactional(value = TxType.REQUIRED)
	public String deleteProgramItem(Integer programId) {
		// TODO Auto-generated method stub
		return programRep.deleteProgramItem(programId);
	}

	@Inject
	private JSONUtil json;

	@Transactional(value = TxType.REQUIRED)
	public String updateProgramItem(String programItem, Integer programId) {
		// TODO Auto-generated method stub

		return programRep.updateProgramItem(programItem, programId);

	}
}
