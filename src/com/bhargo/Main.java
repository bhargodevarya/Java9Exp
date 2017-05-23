package com.bhargo;

import com.profile.WorkTimeLine;

import java.util.logging.Logger;
/**
 * Created by Bhargo on 5/18/2017.
 */
public class Main {
    private static final Logger logger = Logger.getLogger("Main");

    public static void main(String[] args) {
        WorkTimeLine workTimeLine = new WorkTimeLine();
        System.out.println(workTimeLine.hasBeenSetup());

    }
}
