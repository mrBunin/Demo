package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;

import static org.mockito.Mockito.verify;

/**
 * Created by Oleg Shabunin on 3/29/2017.
 */

@RunWith(MockitoJUnitRunner.class)
public class ParamPublisherTest {

    private static final String PARAM = "--date";

    private static final String VALUE = "03302017";

    private static final String CMD_PARAM = PARAM + "=" + VALUE;

    private ApplicationArguments args;

    @Mock
    private ParamPublisher publisher;

    @Before
    public void setUp() {
        args = new DefaultApplicationArguments(new String[]{CMD_PARAM});
    }

    @Test
    public void testCommandLineProcessor() throws Exception {
        CommandLineParser parser = new CommandLineParser(args);
        parser.setPublisher(publisher);
        parser.parse();

        verify(publisher).setParam(VALUE);
        verify(publisher).printParam();
    }
}
