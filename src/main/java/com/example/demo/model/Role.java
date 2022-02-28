package com.example.demo.model;

import javax.persistence.*;

import lombok.*;

@Setter
@Getter
@Entity
@Table(name="roles")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length=60)
	private String name;

}
