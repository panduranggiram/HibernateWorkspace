package com.storeprocedure;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student 
{
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}


		private String name;
		
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		
		
		@OneToMany(cascade=CascadeType.ALL,mappedBy="stud")
		
		private Set<Phone>  setphone=new HashSet<Phone>();
		

		public Set<Phone> getSetphone() {
			return setphone;
		}

		public void setSetphone(Set<Phone> setphone) {
			this.setphone = setphone;
		}	
		
}
