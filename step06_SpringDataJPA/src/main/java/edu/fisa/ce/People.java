package edu.fisa.ce;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Getter
@Setter
@ToString
public class People {
	@Id
	@GeneratedValue
	private long no;
	/* jpa - 컬럼명을 명시적으로 편집
	 * spring data jpa
	 * 	- peopleName 자바 변수를 db 컬럼명으로
	 */
	@NonNull
	private String peopleName;
	@NonNull
	private int age;
}
