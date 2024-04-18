package com.bridgelabz;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Alian {
	@Id
	private int aid;
    private AlianName aname;

	
	private String color;

	@Override
	public String toString() {
		return "Alian [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public AlianName getAname() {
		return aname;
	}

	public void setAname(AlianName aname) {
		this.aname = aname;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
