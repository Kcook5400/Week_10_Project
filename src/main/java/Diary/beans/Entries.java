package Diary.beans;

import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
/**
 * @author kevin.cook - Kevin Cook
 *CIS175 - Fall 2021 
 * Nov 1, 2021
 */
@Data
@Entity
public class Entries {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String text;
	private Date entryDate;
}
