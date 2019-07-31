package rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import service.MemberService;

@Path("/member")
public class MemberControllerImpl implements MemberController {

	@Inject
	MemberService memServ;

	@GET
	@Path("/getAll")
	public String getAllMembers() {
		// TODO Auto-generated method stub
		return this.memServ.getAllMembers();
	}

	@GET
	@Path("/getAccount/{firstName}/{lastName}/{password}")
	public String getAccount(@PathParam("firstName") String firstName, @PathParam("lastName") String lastName,
			@PathParam("password") String password) {

		return memServ.getAccount(firstName, lastName, password);
	}

	@POST
	@Path("/addMember")
	public String addMember(String member) {
		// TODO Auto-generated method stub
		return this.memServ.addMember(member);
	}

	@DELETE
	@Path("/deleteMember/{memIdStr}")
	public String deleteMember(@PathParam("memIdStr") String memIdStr) {

		Integer memId = Integer.parseInt(memIdStr);
		return this.memServ.deleteMember(memId);
	}

	@POST
	@Path("/updateMember")
	public String updateMember(String member, Integer memId) {
		// TODO Auto-generated method stub
		return this.memServ.updateMember(member, memId);
	}

}
