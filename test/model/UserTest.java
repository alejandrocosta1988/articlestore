package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserTest {

	private String firstName;

	@Test
	void isValidReturnsFalseWhenSomeAttributeIsNotProvided() {
		
		User user = new User();
		user.setEmail("teste@email.com");
		user.setLastName("Costa");
		
		assertFalse(user.isValid());
		
	}
	
	@Test
	void isValidReturnsTrueWhenAllAttributesAreProvided() {
		
		User user = new User();
		user.setFirstName("Teste");
		user.setLastName("Testado");
		user.setEmail("teste@email.com");
		
		assertTrue(user.isValid());
		
	}
	
	@Test
	void isValidReturnsFalseWhenSomettributeIsDefinedAsNull() {
		
		User user = new User(firstName, "Teste", "teste@email.com");
		
		assertFalse(user.isValid());
		
	}

}
