package com.bhargo;

import com.bhargo.reader.IReader;
import com.employer.companies.Organization;
import com.profile.WorkExperience;
import com.profile.WorkTimeLine;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Bhargo on 5/18/2017.
 */
public class Main {

    public static void main(String[] args) {
        ServiceLoader<IReader> serviceLoader = ServiceLoader.load(IReader.class);
        try {
            System.out.println(serviceLoader.iterator().next().read("genome-tags.csv", Main.class).get(9));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createWorkTimeLine() {
        List<WorkExperience> workExperiences = new ArrayList<>();
        WorkTimeLine workTimeLine = new WorkTimeLine(workExperiences);
        createOrgs().stream().forEach(org -> {
            switch (org.getName()) {
                case "Wipro":
                    workExperiences.add(new WorkExperience(Boolean.FALSE, org, createdate(2, 2011),
                            createdate(5, 2014), new HashSet<>()));
                    break;
                case "CTS":
                    workExperiences.add(new WorkExperience(Boolean.FALSE, org, createdate(6, 2014),
                            createdate(9, 2016), new HashSet<>()));
                    break;
                case "Sapient":
                    workExperiences.add(new WorkExperience(Boolean.TRUE, org, createdate(10, 2016),
                            createdate(5, 2017), new HashSet<>()));
                    break;
                default:
                    System.out.println("Invalid company");
            }
        });
        //workTimeLine.getWorkExperienceList().stream().forEach(System.out::println);
        //System.out.println(workTimeLine.getWorkExperienceList().get(0));
        System.out.println(workTimeLine.getTotalExp());
    }

    private static Set<Organization> createOrgs() {
        Set<Organization> organizations = new LinkedHashSet<>();
        organizations.add(new Organization("Wipro","Bengaluru"));
        organizations.add(new Organization("CTS","Bengaluru"));
        organizations.add(new Organization("Sapient","Bengaluru"));
        return organizations;
    }

    private static Date createdate(int month, int year) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM YYYY");
        Calendar calendar = new GregorianCalendar(year, month, 1);
        return calendar.getTime();
    }
}
