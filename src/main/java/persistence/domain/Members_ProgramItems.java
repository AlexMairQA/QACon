package persistence.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Members_ProgramItems {

	@EmbeddedId
	private MPIPK mpipk;

	public MPIPK getMpipk() {
		return mpipk;
	}

	public void setMpipk(MPIPK mpipk) {
		this.mpipk = mpipk;
	}

}
