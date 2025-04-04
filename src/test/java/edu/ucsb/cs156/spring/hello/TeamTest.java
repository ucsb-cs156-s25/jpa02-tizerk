package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    void equals_same_object_instance() {
        assert(team.equals(team));
        Team team2 = team;
        assert(team.equals(team2));
    }

    @Test
    void equals_different_type() {
        String str = "string";
        assert(!team.equals(str));
    }

    @Test
    void equals_different_data() {
        Team team2 = new Team("Banana");
        assert(!team.equals(team2));
    }

    @Test
    void equals_hashcode() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertEquals(t1.hashCode(), t2.hashCode());

        int result = t1.hashCode();
        int expectedResult = 130294;
        assertEquals(expectedResult, result);
    }
}
