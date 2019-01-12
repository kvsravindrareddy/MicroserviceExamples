package com.ravindra.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class Role {
	@Id
	@GeneratedValue
	private Long roleId;
	private String name;
	private String description;
	@ManyToMany(fetch = FetchType.LAZY)
	private Set<Privilege> privileges = new HashSet<>(0);
}