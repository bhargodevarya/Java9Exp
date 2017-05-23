package com.profile;

import com.employer.companies.Organization;

import java.util.List;

/**
 * Created by Bhargo on 5/18/2017.
 */
public class WorkTimeLine {

    private List<WorkExperience> workExperienceList;

    public Organization getCommonTech() {
        return null;
    }

    public List<WorkExperience> getWorkExperienceList() {
        return workExperienceList;
    }

    public void setWorkExperienceList(List<WorkExperience> workExperienceList) {
        this.workExperienceList = workExperienceList;
    }

    public float getTotalExp() {
        return 0f;
    }

    public String hasBeenSetup() {
        return "OK";
    }
}
