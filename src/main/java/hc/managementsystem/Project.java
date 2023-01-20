package hc.managementsystem;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Project {
    private String name;
    private String projectDescription;
    private double projectHours;
    private final List<StaffMember> assignedStaffMembersList = new LinkedList<>();

    public Project(String name){
        this.name = name;
    }

    public Project(String name, String projectDescription) {
        this.name = name;
        this.projectDescription = projectDescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public List<StaffMember> getAssignedStaffMembersList() {
        return assignedStaffMembersList;
    }

    public void addStaffMemberToProject(StaffMember staffMember){
        if(assignedStaffMembersList.contains(staffMember)){
            throw new IllegalArgumentException("Staff member is already assigned to this project.");
        }
        else{
            assignedStaffMembersList.add(staffMember);
        }
    }

    public void removeStaffMemberFromProject(StaffMember staffMember){
        if(!assignedStaffMembersList.contains(staffMember)){
            throw new IllegalArgumentException("Staff member is not assigned to this project.");
        }
        else{
            assignedStaffMembersList.remove(staffMember);
        }
    }

    public double getProjectHours() {
        return this.projectHours;
    }

    public void addProjectHours(double addedProjectHours) {
        if(this.projectHours + addedProjectHours < 0.0){
            throw new IllegalArgumentException("Booked project hours cannot be negative.");
        }
        else{
            this.projectHours = this.projectHours + addedProjectHours;
        }
    }

    public String toString(){
        String projectString = "Project name: "+ this.name;
        return projectString;
    }

    public boolean isAssignedStaffMember(StaffMember staffMember){
        return this.assignedStaffMembersList.contains(staffMember);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return this.name.equals(project.getName()) && this.projectDescription.equals(project.getProjectDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.projectDescription);
    }
}
