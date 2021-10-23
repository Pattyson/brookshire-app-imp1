import org.junit.jupiter.api.Test;

class ApplicationTest {
    //Field hostServices of type HostServices - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
    Application application = new Application();

    @Test
    void testStart() {
        application.start(null);
    }

    @Test
    void testMain() {
        Application.main(new String[]{"args"});
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme