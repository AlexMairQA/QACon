package rest;

import javax.inject.Inject;
import javax.ws.rs.Path;

import service.ProgramItemService;

@Path("/program")
public class ProgramItemController {

	@Inject
	ProgramItemService prog;

	@Path("/getAll")
	public String getAllProgramItems() {

		return prog.getAllProgramItems();

	}

	@Path("/addProg")
	public String addProgramItem(String programItem) {

		return prog.addProgramItem(programItem);
	}

	@Path("deleteProg")
	public String deleteProgramItem(Integer programId) {

		return prog.deleteProgramItem(programId);
	}

	@Path("/updateProg")
	public String updateProgramItem(String programItem, Integer programId) {

		return prog.updateProgramItem(programItem, programId);

	}

}
