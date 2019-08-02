package rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import service.ProgramItemService;

@Path("/program")
public class ProgramItemController {

	@Inject
	ProgramItemService prog;

	@GET
	@Path("/getAll")
	public String getAllProgramItems() {

		return prog.getAllProgramItems();

	}

	@POST
	@Path("/addProg")
	public String addProgramItem(String programItem) {

		return prog.addProgramItem(programItem);
	}

	@DELETE
	@Path("deleteProg")
	public String deleteProgramItem(Integer programId) {

		return prog.deleteProgramItem(programId);
	}

	@Path("/updateProg")
	public String updateProgramItem(String programItem, Integer programId) {

		return prog.updateProgramItem(programItem, programId);

	}

}
