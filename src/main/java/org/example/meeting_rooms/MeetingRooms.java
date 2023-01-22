package org.example.meeting_rooms;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Given an array of meeting time intervals consisting of start and end
 * times [[s1, e1], [s2, e2], ... , [s6, e6]], determine if a person
 * could attend all meetings.
 *
 * [[0, 30], [5, 10], [15, 20]] -> false
 * [[5, 8], [9, 15]] -> true
 */

// https://leetcode.com/problems/meeting-rooms/
public class MeetingRooms {
    static class Interval {
        int start;
        int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return String.format("%d, %d", start, end);
        }
    }

    static boolean meetingRooms(Interval[] intervals) {
        /**
         * Sorts array of intervals by first digit.
         * For example, if incoming array would be: [[5, 10], [0, 30], [15, 20]], then
         * sorting will give us [[0, 30], [5, 10], [15, 20]], because 0 < 5 < 15
         */
        Arrays.sort(intervals, Comparator.comparingInt((Interval a) -> a.start));

        for (int i = 0; i < intervals.length - 1; i++) {
            /**
             * If first meeting end in later hour, than next start - then someone can't fit that meeting :P
             */
            if (intervals[i].end > intervals[i + 1].start) {
                return false;
            }
        }

        return true;
    }
}
