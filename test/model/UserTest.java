package model;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {

	private User user;
	private String firstName;
	
	@BeforeEach
	void createUser() {
		user = new User();
	}

	@Test
	void isValidReturnsFalseWhenSomeAttributeIsNotProvided() {
		
		user.setEmail("teste@email.com");
		user.setLastName("Costa");
		
		assertFalse(user.isValid());
		
	}
	
	@Test
	void isValidReturnsTrueWhenAllAttributesAreProvided() {
		
		user.setFirstName("Teste");
		user.setLastName("Testado");
		user.setEmail("teste@email.com");
		
		assertTrue(user.isValid());
		
	}
	
	@Test
	void isValidReturnsFalseWhenSomettributeIsDefinedAsNull() {
		
		user = new User(firstName, "Teste", "teste@email.com");
		
		assertFalse(user.isValid());
		
	}

}
