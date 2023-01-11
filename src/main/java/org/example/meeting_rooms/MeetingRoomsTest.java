package org.example.meeting_rooms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MeetingRoomsTest {
    MeetingRooms.Interval[] intervals1 = new MeetingRooms.Interval[]{
            new MeetingRooms.Interval(0, 30),
            new MeetingRooms.Interval(5, 10),
            new MeetingRooms.Interval(15, 20)
    };

    MeetingRooms.Interval[] intervals2 = new MeetingRooms.Interval[]{
            new MeetingRooms.Interval(5, 8),
            new MeetingRooms.Interval(9, 15)
    };

    @Test
    void meetingRooms1() {
        assertFalse(MeetingRooms.meetingRooms(intervals1));
    }

    @Test
    void meetingRooms2() {
        assertTrue(MeetingRooms.meetingRooms(intervals2));
    }
}
