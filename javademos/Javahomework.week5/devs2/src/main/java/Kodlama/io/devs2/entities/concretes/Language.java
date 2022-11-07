package Kodlama.io.devs2.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "programming_languages")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Language
{
	@Column(name = "name")
	String name;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	String id;
	
	
	@OneToMany(mappedBy = "language")
	private List<Technology> technologies;

}
