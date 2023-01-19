package hc.managementsystem;

import java.util.LinkedList;
import java.util.List;

public class ProjectManagementSystem {

    private final List<Project> projectList = new LinkedList<>();

    public void addProject(Project project){

        if(projectList.contains(project)) {

            throw new IllegalArgumentException("Entry of this project exists already in the system");

        }
        else {
            projectList.add(project);
        }
    }

    public void removeProject(Project project) {

        if(!projectList.contains(project)) {

            throw new IllegalArgumentException("Entry of this project does not exist in the system");

        }
        else {

            projectList.remove(project);

        }
    }
    public void printStaffMembersProjects(StaffMember staffMember){

        List<Project> StaffMembersProjects = toListStaffMembersProjects(staffMember);

        System.out.println(staffMember + "\n");

        for(Project project:StaffMembersProjects) {

            System.out.println(project + "\n");

        }

    }

    private List<Project> toListStaffMembersProjects(StaffMember staffMember){

        List<Project> StaffMembersProjects = new LinkedList<>();

        for(Project project:this.projectList){

            if(project.getAssignedStaffMembersList().contains(staffMember)){

                StaffMembersProjects.add(project);

            }
        }
        return StaffMembersProjects;
    }

    public void printProjects(){
        for(Project project:projectList){
            System.out.println(project.toString());
        }
    }
}
