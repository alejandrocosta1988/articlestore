package util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import jakarta.servlet.http.Cookie;

class CookieUtilTest {

	@Test
	void getCookieValueReturnsValueOfNamedCookie() {
		
		Cookie email = new Cookie("email", "test@mail.com");
		Cookie userName = new Cookie("userName", "Marcus Aurelius");
		
		Cookie[] cookies = {email, userName};
		
		assertEquals(CookieUtil.getCookieValue(cookies, "email"), "test@mail.com");
		
	}

}
