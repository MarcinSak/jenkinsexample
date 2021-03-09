package pl.saq.jenkinsexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JenkinsexampleApplicationTest {

    @Test
    void adder() {
        JenkinsexampleApplication jenkinsexampleApplication = new JenkinsexampleApplication();
        assertEquals(10, jenkinsexampleApplication.adder(5,5));

    }
}