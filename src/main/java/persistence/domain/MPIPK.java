package persistence.domain;

import java.io.Serializable;

import javax.persistence.ManyToOne;

public class MPIPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4360339101461117286L;

	@ManyToOne
	private Members member;

	@ManyToOne
	private ProgramItem program;

	public Members getMember() {
		return member;
	}

	public void setMember(Members member) {
		this.member = member;
	}

	public ProgramItem getProgram() {
		return program;
	}

	public void setProgram(ProgramItem program) {
		this.program = program;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((member == null) ? 0 : member.hashCode());
		result = prime * result + ((program == null) ? 0 : program.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MPIPK other = (MPIPK) obj;
		if (member == null) {
			if (other.member != null)
				return false;
		} else if (!member.equals(other.member))
			return false;
		if (program == null) {
			if (other.program != null)
				return false;
		} else if (!program.equals(other.program))
			return false;
		return true;
	}

}
