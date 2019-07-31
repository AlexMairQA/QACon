package persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProgramItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer panelId;
	private String panelName;
	private String description;

	public ProgramItem() {
	}

	public String getPanelName() {
		return panelName;
	}

	public void setPanelName(String panelName) {
		this.panelName = panelName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((panelId == null) ? 0 : panelId.hashCode());
		result = prime * result + ((panelName == null) ? 0 : panelName.hashCode());
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
		ProgramItem other = (ProgramItem) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (panelId == null) {
			if (other.panelId != null)
				return false;
		} else if (!panelId.equals(other.panelId))
			return false;
		if (panelName == null) {
			if (other.panelName != null)
				return false;
		} else if (!panelName.equals(other.panelName))
			return false;
		return true;
	}

}
