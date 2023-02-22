package com.bridgelabz;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

import com.bridgelabz.MoodAnalyzer;

public class MoodAnalyzerTest {

        static MoodAnalyzer moodAnalyzer;

        @Test
        public void testAnalyseMood(){
            moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
            String result = moodAnalyzer.analyseMood();
            Assertions.assertEquals(result,"SAD");

            moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
            result = moodAnalyzer.analyseMood();
            Assertions.assertEquals(result,"HAPPY");
        }
}
