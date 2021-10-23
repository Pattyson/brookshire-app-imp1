import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

class ItemTest {
    //Field date of type LocalDate - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
    Item item = new Item("description", LocalDate.of(2021, Month.OCTOBER, 24), Boolean.TRUE);

    @Test
    void testToString() {
        String result = item.toString();
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }

    @Test
    void testSetDescription() {
        item.setDescription("description");
    }

    @Test
    void testGetCompletedBoolean() {
        String result = item.getCompletedBoolean(Boolean.TRUE);
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }

    @Test
    void testGetDescription() {
        String result = item.getDescription();
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme