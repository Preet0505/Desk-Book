package com.onerivet.model.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="SeatConfiguration", schema = "dbo")
public class SeatConfiguration {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="SeatConfigurationId")
	private int id;
	
	@OneToOne
	@JoinColumn(name="EmployeeId")
	private Employee employee;

	@OneToOne
	@JoinColumn(name = "CityId")
	private City city;
	
	@OneToOne
	@JoinColumn(name = "ColumnId")
	private Columns columns;
	
	@OneToOne
	@JoinColumn(name = "FloorId")
	private Floor floor;
	
	@OneToOne
	@JoinColumn(name="SeatNumberId")
	private SeatNumber seatNumber;
}
