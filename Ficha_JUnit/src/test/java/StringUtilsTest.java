import Ex_02.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testIsPalindrome(){

        // Testes básicos obrigatórios
        assertTrue(StringUtils.isPalindrome("ana"));
        assertTrue(StringUtils.isPalindrome("Ana"));

        assertFalse(StringUtils.isPalindrome("teste"));
        assertFalse(StringUtils.isPalindrome(null));

        // Casos de teste mais específicos
        assertTrue(StringUtils.isPalindrome("ana radar ana"));
        assertTrue(StringUtils.isPalindrome("ana-radar-ana"));
        assertTrue(StringUtils.isPalindrome("1221"));

        assertFalse(StringUtils.isPalindrome("ana radar radar"));
        assertFalse(StringUtils.isPalindrome("ana-radar-radar"));


        assertFalse(StringUtils.isPalindrome("rad-ar"));
    }
}
