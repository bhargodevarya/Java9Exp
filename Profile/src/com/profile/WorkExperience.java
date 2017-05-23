package com.profile;

import com.employer.companies.Organization;

import java.util.Date;
import java.util.Set;

/**
 * Created by Bhargo on 5/18/2017.
 */
public class WorkExperience {

    private Boolean isCurrent;
    private Organization company;
    private Date startDate;
    private Date endDate;
    private Set<String> technologies;

    public WorkExperience(Boolean isCurrent, Organization company, Date startDate, Date endDate, Set<String> technologies) {

        this.isCurrent = isCurrent;
        this.company = company;
        this.startDate = startDate;
        this.endDate = endDate;
        this.technologies = technologies;
    }

    public Boolean getCurrent() {
        return isCurrent;
    }

    public void setCurrent(Boolean current) {
        isCurrent = current;
    }

    public Organization getCompany() {
        return company;
    }

    public void setCompany(Organization company) {
        this.company = company;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Set<String> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(Set<String> technologies) {
        this.technologies = technologies;
    }
}
