package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

/**
 * Created by Oleg Shabunin on 3/29/2017.
 */

@RunWith(MockitoJUnitRunner.class)
public class ParamPublisherTest {

    @Mock
    private ParamPublisher publisher;

    @InjectMocks
    private CommandLineProcessor processor = new CommandLineProcessor();

    @Test
    public void testCommandLineProcessor() throws Exception {
        final String param = "Param1";
        final String[] params = {param};

        processor.run(params);
        verify(publisher).setParam(param);
        verify(publisher).printParam();
    }
}
