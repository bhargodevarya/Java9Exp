package com.profile;

import com.employer.companies.Organization;

import java.util.List;

/**
 * Created by Bhargo on 5/18/2017.
 */
public class WorkTimeLine {

    private List<WorkExperience> workExperienceList;

    public WorkTimeLine(List<WorkExperience> workExperienceList) {
        this.workExperienceList = workExperienceList;
    }

    public List<WorkExperience> getWorkExperienceList() {
        return workExperienceList;
    }

    public void setWorkExperienceList(List<WorkExperience> workExperienceList) {
        this.workExperienceList = workExperienceList;
    }

    public float getTotalExp() {
        long diff = getWorkExperienceList().get(getWorkExperienceList().size()-1).getStartDate().
                getTime() - getWorkExperienceList().get(0).getEndDate().
                getTime();
        System.out.println(diff);
        return diff / (24*60*60*1000) % 365;
    }

    public String hasBeenSetup() {
        return "OK";
    }
}
